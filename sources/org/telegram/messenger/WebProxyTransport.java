package org.telegram.messenger;

import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import j$.util.Objects;
import j$.util.concurrent.atomic.DesugarAtomicInteger;
import java.io.InputStream;
import java.net.IDN;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.g10;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class WebProxyTransport implements f10 {
    private static final String BRIDGE_OBJECT = "TelegramWebProxy";
    private static final int DATA_CHUNK = 65536;
    private static final int FRAME_BYE = 31;
    private static final int FRAME_CLOSE = 3;
    private static final int FRAME_DATA = 2;
    private static final int FRAME_HEADER = 8;
    private static final int FRAME_HELLO = 16;
    private static final int FRAME_MAX_PAYLOAD = 1048576;
    private static final int FRAME_OPEN = 1;
    private static final int FRAME_PING = 5;
    private static final int FRAME_PONG = 6;
    private static final int FRAME_WELCOME = 17;
    private static final int FRAME_WINDOW = 4;
    private static final long INITIAL_WINDOW = 4194304;
    private static final int MAX_OUTBOUND_BYTES = 67108864;
    private static final int MAX_OUTBOUND_ITEMS = 8192;
    private static final int MAX_STREAMS = 64;
    private static WebProxyTransport instance;
    private static final Object staticLock = new Object();
    private final String androidNonce;
    private final String bridgeUrl;
    private boolean carrierConnected;
    private final String host;
    private final String origin;
    private int outboundBytes;
    private n2.a replyProxy;
    private boolean restartScheduled;
    private final String secret;
    private final ServerSocket serverSocket;
    private boolean stopped;
    private WebView webView;
    private final Object lock = new Object();
    private final ExecutorService ioExecutor = Executors.newCachedThreadPool();
    private final ExecutorService carrierExecutor = Executors.newSingleThreadExecutor();
    private final AtomicInteger nextStreamId = new AtomicInteger(1);
    private final Map<Integer, Stream> streams = new HashMap();
    private final ArrayDeque<byte[]> outbound = new ArrayDeque<>();

    /* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
    public static final class Stream {
        private final int id;
        private boolean opened;
        private long receiveWindow;
        private long sendWindow;
        private final Socket socket;

        public static /* synthetic */ long access$414(Stream stream, long j10) {
            long j11 = stream.sendWindow + j10;
            stream.sendWindow = j11;
            return j11;
        }

        public static /* synthetic */ long access$422(Stream stream, long j10) {
            long j11 = stream.sendWindow - j10;
            stream.sendWindow = j11;
            return j11;
        }

        public static /* synthetic */ long access$714(Stream stream, long j10) {
            long j11 = stream.receiveWindow + j10;
            stream.receiveWindow = j11;
            return j11;
        }

        public static /* synthetic */ long access$722(Stream stream, long j10) {
            long j11 = stream.receiveWindow - j10;
            stream.receiveWindow = j11;
            return j11;
        }

        private Stream(int i10, Socket socket) {
            this.sendWindow = WebProxyTransport.INITIAL_WINDOW;
            this.receiveWindow = WebProxyTransport.INITIAL_WINDOW;
            this.id = i10;
            this.socket = socket;
        }
    }

    private WebProxyTransport(String str, String str2, byte[] bArr) {
        this.host = str;
        this.secret = str2;
        String e = vh.v2.e("https://", str);
        this.origin = e;
        String randomToken = randomToken(32);
        this.androidNonce = randomToken;
        String e6 = vh.v2.e("tdesktop-web-proxy-bridge-v1\n", str);
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
        this.bridgeUrl = e + "/?bridge=" + Base64.encodeToString(mac.doFinal(e6.getBytes(StandardCharsets.UTF_8)), 11) + "#android=" + randomToken;
        this.serverSocket = new ServerSocket(0, 64, InetAddress.getByName("127.0.0.1"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void acceptLoop() {
        while (true) {
            try {
                Socket accept = this.serverSocket.accept();
                accept.setTcpNoDelay(true);
                synchronized (this.lock) {
                    try {
                        if (!this.stopped && this.streams.size() < 64) {
                            int allocateStreamId = allocateStreamId();
                            Stream stream = new Stream(allocateStreamId, accept);
                            this.streams.put(Integer.valueOf(allocateStreamId), stream);
                            if (this.carrierConnected) {
                                stream.opened = true;
                                sendFrame(1, allocateStreamId, null);
                            }
                            this.ioExecutor.execute(new e3(11, this, stream));
                        }
                        closeSocket(accept);
                    } finally {
                    }
                }
            } catch (Exception e) {
                synchronized (this.lock) {
                    try {
                        if (this.stopped) {
                            return;
                        }
                        FileLog.e(e);
                        failCarrier();
                        return;
                    } finally {
                    }
                }
            }
        }
    }

    private int allocateStreamId() {
        while (true) {
            int andUpdate = DesugarAtomicInteger.getAndUpdate(this.nextStreamId, new zl());
            if (andUpdate != 0 && !this.streams.containsKey(Integer.valueOf(andUpdate))) {
                return andUpdate;
            }
        }
    }

    private static void closeSocket(Socket socket) {
        try {
            socket.close();
        } catch (Exception unused) {
        }
    }

    private void closeStream(Stream stream, boolean z4) {
        synchronized (this.lock) {
            try {
                if (this.streams.get(Integer.valueOf(stream.id)) != stream) {
                    return;
                }
                this.streams.remove(Integer.valueOf(stream.id));
                boolean z10 = z4 && this.carrierConnected && stream.opened;
                this.lock.notifyAll();
                closeSocket(stream.socket);
                if (z10) {
                    sendFrame(3, stream.id, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createWebView() {
        o2.m mVar;
        synchronized (this.lock) {
            try {
                if (!this.stopped && this.webView == null) {
                    g10 g10Var = g10.getInstance();
                    if (g10Var != null && g10Var.isBackground()) {
                        this.restartScheduled = true;
                        return;
                    }
                    this.restartScheduled = false;
                    destroyWebView();
                    try {
                        WebView webView = new WebView(ApplicationLoader.applicationContext);
                        this.webView = webView;
                        webView.setBackgroundColor(0);
                        WebSettings settings = webView.getSettings();
                        settings.setJavaScriptEnabled(true);
                        settings.setDomStorageEnabled(false);
                        settings.setDatabaseEnabled(false);
                        settings.setAllowFileAccess(false);
                        settings.setAllowContentAccess(false);
                        settings.setCacheMode(2);
                        settings.setJavaScriptCanOpenWindowsAutomatically(false);
                        settings.setSupportMultipleWindows(false);
                        settings.setGeolocationEnabled(false);
                        settings.setMediaPlaybackRequiresUserGesture(true);
                        int i10 = Build.VERSION.SDK_INT;
                        settings.setMixedContentMode(1);
                        if (i10 >= 26) {
                            settings.setSafeBrowsingEnabled(true);
                        }
                        webView.setWebViewClient(new WebViewClient() { // from class: org.telegram.messenger.WebProxyTransport.1
                            @Override // android.webkit.WebViewClient
                            public void onReceivedError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                                if (webResourceRequest.isForMainFrame()) {
                                    WebProxyTransport.this.failWebView(webView2);
                                }
                            }

                            @Override // android.webkit.WebViewClient
                            public void onReceivedHttpError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                                if (webResourceRequest.isForMainFrame()) {
                                    WebProxyTransport.this.failWebView(webView2);
                                }
                            }

                            @Override // android.webkit.WebViewClient
                            public void onReceivedSslError(WebView webView2, SslErrorHandler sslErrorHandler, SslError sslError) {
                                sslErrorHandler.cancel();
                                WebProxyTransport.this.failWebView(webView2);
                            }

                            @Override // android.webkit.WebViewClient
                            public boolean onRenderProcessGone(WebView webView2, RenderProcessGoneDetail renderProcessGoneDetail) {
                                WebProxyTransport.this.failWebView(webView2);
                                return true;
                            }

                            @Override // android.webkit.WebViewClient
                            public boolean shouldOverrideUrlLoading(WebView webView2, WebResourceRequest webResourceRequest) {
                                return webResourceRequest.isForMainFrame() && !WebProxyTransport.this.isBridgeNavigation(webResourceRequest.getUrl());
                            }
                        });
                        HashSet hashSet = new HashSet();
                        hashSet.add(this.origin);
                        d dVar = new d(this, 15);
                        boolean z4 = n2.c.a;
                        if (!o2.k.c.b()) {
                            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                        }
                        if (o2.k.d.b() && n2.c.a) {
                            WeakHashMap weakHashMap = n2.c.b;
                            mVar = (o2.m) weakHashMap.get(webView);
                            if (mVar == null) {
                                mVar = new o2.m(o2.l.a.createWebView(webView));
                                weakHashMap.put(webView, mVar);
                            }
                        } else {
                            mVar = new o2.m(o2.l.a.createWebView(webView));
                        }
                        mVar.a.addWebMessageListener(BRIDGE_OBJECT, (String[]) hashSet.toArray(new String[0]), new ee.a(new a3.c(dVar, 27)));
                        webView.loadUrl(this.bridgeUrl);
                    } catch (Exception e) {
                        FileLog.e(e);
                        failCarrier();
                    }
                }
            } finally {
            }
        }
    }

    private static byte[] decodeSecret(String str) {
        byte[] bArr;
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if ((trim.length() == 32 || trim.length() == 34) && trim.matches("[0-9a-fA-F]+")) {
            int length = trim.length() / 2;
            bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) Integer.parseInt(trim.substring(i11, i11 + 2), 16);
            }
        } else {
            try {
                bArr = Base64.decode(trim, 10);
            } catch (Exception unused) {
                return null;
            }
        }
        if (bArr.length == 16 || (bArr.length == 17 && (bArr[0] & 255) == 221)) {
            return bArr;
        }
        return null;
    }

    private void destroyWebView() {
        WebView webView = this.webView;
        this.webView = null;
        this.replyProxy = null;
        if (webView != null) {
            try {
                webView.stopLoading();
                webView.loadUrl("about:blank");
                webView.removeAllViews();
                webView.destroy();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void drainOutbound() {
        while (true) {
            synchronized (this.lock) {
                n2.a aVar = this.replyProxy;
                if (this.stopped || aVar == null || this.outbound.isEmpty()) {
                    break;
                }
                byte[] removeFirst = this.outbound.removeFirst();
                this.outboundBytes -= removeFirst.length;
                try {
                    o2.f fVar = (o2.f) aVar;
                    if (!o2.k.a.b()) {
                        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                    }
                    fVar.a.postMessageWithPayload(new ee.a(new o2.h(removeFirst)));
                } catch (Exception e) {
                    FileLog.e(e);
                    failCarrier();
                    return;
                }
            }
        }
    }

    private void failCarrier() {
        synchronized (this.lock) {
            if (!this.stopped && !this.restartScheduled) {
                this.restartScheduled = true;
                int i10 = 0;
                this.carrierConnected = false;
                this.replyProxy = null;
                this.outbound.clear();
                this.outboundBytes = 0;
                ArrayList arrayList = new ArrayList(this.streams.values());
                this.streams.clear();
                this.lock.notifyAll();
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    closeSocket(((Stream) obj).socket);
                }
                AndroidUtilities.runOnUIThread(new am(this, 3));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void failWebView(WebView webView) {
        if (webView == this.webView) {
            failCarrier();
        }
    }

    private void handleControl(String str, n2.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("t");
            if (!"tproxy-android-init".equals(optString) || jSONObject.optInt("v") != 1 || !this.androidNonce.equals(jSONObject.optString("nonce"))) {
                if ("close".equals(optString) || "failed".equals(jSONObject.optString("state"))) {
                    failCarrier();
                    return;
                }
                return;
            }
            synchronized (this.lock) {
                if (!this.stopped && this.replyProxy == null) {
                    this.replyProxy = aVar;
                    sendFrame(16, 0, new byte[]{1});
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isBridgeNavigation(Uri uri) {
        return uri != null && "https".equals(uri.getScheme()) && this.host.equals(uri.getHost()) && uri.getPort() == -1 && "/".equals(uri.getPath()) && uri.getQueryParameterNames().size() == 1 && uri.getQueryParameterNames().contains("bridge");
    }

    public static boolean isSupported() {
        try {
            if (k7.x.a("WEB_MESSAGE_LISTENER")) {
                if (k7.x.a("WEB_MESSAGE_ARRAY_BUFFER")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            FileLog.e(th2);
            return false;
        }
    }

    public static boolean isValidSecret(String str) {
        return decodeSecret(str) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$allocateStreamId$2(int i10) {
        if (i10 >= 16777215) {
            return 1;
        }
        return i10 + 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$failCarrier$4() {
        destroyWebView();
        synchronized (this.lock) {
            try {
                if (this.stopped) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new am(this, 0), 1000L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$stopInternal$0() {
        n2.a aVar = this.replyProxy;
        if (aVar != null) {
            try {
                o2.f fVar = (o2.f) aVar;
                if (!o2.k.c.b()) {
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
                fVar.a.postMessage("{\"t\":\"close\"}");
            } catch (Exception unused) {
            }
        }
        destroyWebView();
    }

    public static String normalizeHost(String str) {
        if (str == null) {
            return "";
        }
        String trim = str.trim();
        if (trim.endsWith(".")) {
            trim = e2.c.j(trim, 1, 0);
        }
        try {
            String lowerCase = IDN.toASCII(trim, 2).toLowerCase(Locale.US);
            if (lowerCase.length() <= 253 && lowerCase.indexOf(46) > 0 && !lowerCase.contains(":") && !lowerCase.matches("[0-9.]+")) {
                for (String str2 : lowerCase.split("\\.", -1)) {
                    if (str2.isEmpty() || str2.length() > 63 || str2.startsWith("-") || str2.endsWith("-")) {
                        return "";
                    }
                }
                return lowerCase;
            }
        } catch (Exception unused) {
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onWebMessage(WebView webView, n2.b bVar, Uri uri, boolean z4, n2.a aVar) {
        n2.a aVar2;
        if (webView == this.webView && z4 && this.origin.equals(uri.toString())) {
            int i10 = bVar.c;
            if (i10 == 0) {
                bVar.a(0);
                handleControl(bVar.a, aVar);
                return;
            }
            if (i10 == 1) {
                synchronized (this.lock) {
                    if (!this.stopped && (aVar2 = this.replyProxy) != null && aVar2 == aVar) {
                        bVar.a(1);
                        byte[] bArr = bVar.b;
                        Objects.requireNonNull(bArr);
                        this.carrierExecutor.execute(new yg(17, this, bArr));
                    }
                }
            }
        }
    }

    private boolean processFrame(int i10, int i11, byte[] bArr) {
        boolean z4 = true;
        int i12 = 0;
        if (i11 == 0) {
            if (i10 != 17 || bArr.length != 0) {
                if (i10 == 5 && bArr.length <= 64) {
                    sendFrame(6, 0, bArr);
                    return true;
                }
                if (i10 == 31) {
                    int length = bArr.length;
                }
                return false;
            }
            synchronized (this.lock) {
                try {
                    if (!this.stopped && !this.carrierConnected) {
                        this.carrierConnected = true;
                        ArrayList arrayList = new ArrayList(this.streams.values());
                        int size = arrayList.size();
                        while (i12 < size) {
                            Object obj = arrayList.get(i12);
                            i12++;
                            Stream stream = (Stream) obj;
                            stream.opened = true;
                            sendFrame(1, stream.id, null);
                        }
                        this.lock.notifyAll();
                        return true;
                    }
                    return false;
                } finally {
                }
            }
        }
        synchronized (this.lock) {
            try {
                Stream stream2 = this.streams.get(Integer.valueOf(i11));
                if (stream2 == null) {
                    if (i10 != 2 && i10 != 4 && i10 != 3) {
                        z4 = false;
                    }
                    return z4;
                }
                if (i10 == 2) {
                    if (bArr.length == 0) {
                        return false;
                    }
                    synchronized (this.lock) {
                        try {
                            if (stream2.receiveWindow < bArr.length) {
                                return false;
                            }
                            Stream.access$722(stream2, bArr.length);
                            try {
                                stream2.socket.getOutputStream().write(bArr);
                                synchronized (this.lock) {
                                    try {
                                        if (this.streams.get(Integer.valueOf(stream2.id)) == stream2) {
                                            Stream.access$714(stream2, bArr.length);
                                            sendFrame(4, stream2.id, uint32(bArr.length));
                                        }
                                    } finally {
                                    }
                                }
                            } catch (Exception unused) {
                                closeStream(stream2, true);
                            }
                            return true;
                        } finally {
                        }
                    }
                }
                if (i10 != 4 || bArr.length != 4) {
                    if (i10 != 3 || bArr.length != 0) {
                        return false;
                    }
                    closeStream(stream2, false);
                    return true;
                }
                long j10 = ByteBuffer.wrap(bArr).getInt() & 4294967295L;
                if (j10 == 0) {
                    return false;
                }
                synchronized (this.lock) {
                    try {
                        if (stream2.sendWindow > 4294967295L - j10) {
                            return false;
                        }
                        Stream.access$414(stream2, j10);
                        this.lock.notifyAll();
                        return true;
                    } finally {
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: processFrames, reason: merged with bridge method [inline-methods] */
    public void lambda$onWebMessage$3(byte[] bArr) {
        int i10 = 0;
        while (i10 < bArr.length) {
            if (bArr.length - i10 < 8) {
                failCarrier();
                return;
            }
            int i11 = bArr[i10] & 255;
            int i12 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8) | (bArr[i10 + 3] & 255);
            long j10 = ((bArr[i10 + 4] & 255) << 24) | ((bArr[i10 + 5] & 255) << 16) | ((bArr[i10 + 6] & 255) << 8) | (255 & bArr[i10 + 7]);
            int i13 = i10 + 8;
            long j11 = i13 + j10;
            if (j10 > 1048576 || j11 > bArr.length) {
                failCarrier();
                return;
            }
            int i14 = (int) j10;
            byte[] bArr2 = new byte[i14];
            System.arraycopy(bArr, i13, bArr2, 0, i14);
            if (!processFrame(i11, i12, bArr2)) {
                failCarrier();
                return;
            }
            i10 = (int) j11;
        }
    }

    private static String randomToken(int i10) {
        byte[] bArr = new byte[i10];
        new SecureRandom().nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a9, code lost:
    
        return;
     */
    /* renamed from: readLoop, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void lambda$acceptLoop$1(Stream stream) {
        byte[] bArr = new byte[65536];
        try {
            InputStream inputStream = stream.socket.getInputStream();
            while (true) {
                synchronized (this.lock) {
                    while (!this.stopped && this.streams.get(Integer.valueOf(stream.id)) == stream && (!this.carrierConnected || !stream.opened || stream.sendWindow == 0)) {
                        try {
                            this.lock.wait();
                        } finally {
                        }
                    }
                    if (this.stopped || this.streams.get(Integer.valueOf(stream.id)) != stream) {
                        break;
                    }
                    int read = inputStream.read(bArr, 0, (int) Math.min(65536L, stream.sendWindow));
                    if (read < 0) {
                        closeStream(stream, true);
                        return;
                    }
                    if (read != 0) {
                        byte[] bArr2 = new byte[read];
                        System.arraycopy(bArr, 0, bArr2, 0, read);
                        synchronized (this.lock) {
                            try {
                                if (this.stopped || this.streams.get(Integer.valueOf(stream.id)) != stream || !this.carrierConnected) {
                                    break;
                                }
                                Stream.access$422(stream, read);
                                sendFrame(2, stream.id, bArr2);
                            } finally {
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
            closeStream(stream, true);
        }
    }

    private void sendFrame(int i10, int i11, byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        byte[] array = ByteBuffer.allocate(bArr.length + 8).put((byte) i10).put((byte) (i11 >> 16)).put((byte) (i11 >> 8)).put((byte) i11).putInt(bArr.length).put(bArr).array();
        synchronized (this.lock) {
            if (!this.stopped && this.outbound.size() < 8192 && this.outboundBytes <= 67108864 - array.length) {
                this.outbound.add(array);
                this.outboundBytes += array.length;
                AndroidUtilities.runOnUIThread(new am(this, 1));
                return;
            }
            failCarrier();
        }
    }

    public static int start(String str, String str2) {
        String normalizeHost = normalizeHost(str);
        byte[] decodeSecret = decodeSecret(str2);
        if (TextUtils.isEmpty(normalizeHost) || decodeSecret == null || !isSupported()) {
            return 0;
        }
        synchronized (staticLock) {
            try {
                WebProxyTransport webProxyTransport = instance;
                if (webProxyTransport != null && webProxyTransport.host.equals(normalizeHost) && instance.secret.equals(str2)) {
                    return instance.serverSocket.getLocalPort();
                }
                WebProxyTransport webProxyTransport2 = instance;
                if (webProxyTransport2 != null) {
                    webProxyTransport2.stopInternal();
                    instance = null;
                }
                try {
                    WebProxyTransport webProxyTransport3 = new WebProxyTransport(normalizeHost, str2, decodeSecret);
                    instance = webProxyTransport3;
                    webProxyTransport3.startInternal();
                    return instance.serverSocket.getLocalPort();
                } catch (Exception e) {
                    FileLog.e(e);
                    WebProxyTransport webProxyTransport4 = instance;
                    if (webProxyTransport4 != null) {
                        webProxyTransport4.stopInternal();
                        instance = null;
                    }
                    return 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void startInternal() {
        g10 g10Var = g10.getInstance();
        if (g10Var != null) {
            g10Var.addListener(this);
        }
        this.ioExecutor.execute(new am(this, 4));
        AndroidUtilities.runOnUIThread(new am(this, 0));
    }

    public static void stop() {
        synchronized (staticLock) {
            try {
                WebProxyTransport webProxyTransport = instance;
                if (webProxyTransport != null) {
                    webProxyTransport.stopInternal();
                    instance = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void stopInternal() {
        synchronized (this.lock) {
            try {
                if (this.stopped) {
                    return;
                }
                this.stopped = true;
                int i10 = 0;
                this.carrierConnected = false;
                this.restartScheduled = false;
                ArrayList arrayList = new ArrayList(this.streams.values());
                this.streams.clear();
                this.outbound.clear();
                this.outboundBytes = 0;
                this.lock.notifyAll();
                try {
                    this.serverSocket.close();
                } catch (Exception unused) {
                }
                g10 g10Var = g10.getInstance();
                if (g10Var != null) {
                    g10Var.removeListener(this);
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    closeSocket(((Stream) obj).socket);
                }
                AndroidUtilities.runOnUIThread(new am(this, 2));
                this.ioExecutor.shutdownNow();
                this.carrierExecutor.shutdownNow();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static byte[] uint32(int i10) {
        return ByteBuffer.allocate(4).putInt(i10).array();
    }

    @Override // org.telegram.ui.Components.f10
    public void onBecameForeground() {
        AndroidUtilities.runOnUIThread(new am(this, 0));
    }

    @Override // org.telegram.ui.Components.f10
    public void onBecameBackground() {
    }
}
