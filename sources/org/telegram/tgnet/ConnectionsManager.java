package org.telegram.tgnet;

import ag.f3;
import ag.q0;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import com.google.android.recaptcha.Recaptcha;
import i2.a0;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;
import org.json.JSONArray;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.KeepAliveJob;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a5;
import org.telegram.messenger.b8;
import org.telegram.messenger.bl;
import org.telegram.messenger.c3;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.d3;
import org.telegram.messenger.d9;
import org.telegram.messenger.e3;
import org.telegram.messenger.e4;
import org.telegram.messenger.f1;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.i5;
import org.telegram.messenger.j20;
import org.telegram.messenger.js;
import org.telegram.messenger.m7;
import org.telegram.messenger.mp;
import org.telegram.messenger.np;
import org.telegram.messenger.o6;
import org.telegram.messenger.q00;
import org.telegram.messenger.qj;
import org.telegram.messenger.sj;
import org.telegram.messenger.td;
import org.telegram.messenger.tj;
import org.telegram.messenger.tz;
import org.telegram.messenger.uz;
import org.telegram.messenger.v2;
import org.telegram.messenger.voip.p0;
import org.telegram.messenger.vp;
import org.telegram.messenger.w0;
import org.telegram.messenger.wd;
import org.telegram.messenger.zj;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.u61;
import org.telegram.ui.hf0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class ConnectionsManager extends f1 {
    private static final int CORE_POOL_SIZE;
    public static final int CPU_COUNT;
    public static final int ConnectionStateConnected = 3;
    public static final int ConnectionStateConnecting = 1;
    public static final int ConnectionStateConnectingToProxy = 4;
    public static final int ConnectionStateUpdating = 5;
    public static final int ConnectionStateWaitingForNetwork = 2;
    public static final int ConnectionTypeDownload = 2;
    public static final int ConnectionTypeDownload2 = 65538;
    public static final int ConnectionTypeGeneric = 1;
    public static final int ConnectionTypePush = 8;
    public static final int ConnectionTypeUpload = 4;
    public static final int DEFAULT_DATACENTER_ID = Integer.MAX_VALUE;
    public static final Executor DNS_THREAD_POOL_EXECUTOR;
    public static final int DownloadConnectionsCount = 8;
    public static final int FileTypeAudio = 50331648;
    public static final int FileTypeFile = 67108864;
    public static final int FileTypePhoto = 16777216;
    public static final int FileTypeVideo = 33554432;
    private static final ConnectionsManager[] Instance;
    private static final int KEEP_ALIVE_SECONDS = 30;
    private static final int MAXIMUM_POOL_SIZE;
    public static final int RequestFlagCanCompress = 4;
    public static final int RequestFlagDoNotWaitFloodWait = 1024;
    public static final int RequestFlagDownloadByteBudget = 262144;
    public static final int RequestFlagEnableUnauthorized = 1;
    public static final int RequestFlagFailOnServerErrors = 2;
    public static final int RequestFlagFailOnServerErrorsExceptFloodWait = 65536;
    public static final int RequestFlagForceDownload = 32;
    public static final int RequestFlagInvokeAfter = 64;
    public static final int RequestFlagListenAfterCancel = 2048;
    public static final int RequestFlagNeedQuickAck = 128;
    public static final int RequestFlagSmallDownload = 131072;
    public static final int RequestFlagTryDifferentDc = 16;
    public static final int RequestFlagWithoutLogin = 8;
    public static final byte USE_IPV4_IPV6_RANDOM = 2;
    public static final byte USE_IPV4_ONLY = 0;
    public static final byte USE_IPV6_ONLY = 1;
    public static final int UploadConnectionsCountPremium = 8;
    private static AsyncTask currentTask;
    private static HashMap<String, ResolvedDomain> dnsCache;
    private static int lastClassGuid;
    private static long lastDnsRequestTime;
    public static long lastPremiumFloodWaitShown;
    private static HashMap<String, ResolveHostByNameTask> resolvingHostnameTasks = new HashMap<>();
    private static final BlockingQueue<Runnable> sPoolWorkQueue;
    private static final ThreadFactory sThreadFactory;
    private boolean appPaused;
    private int appResumeCount;
    private int connectionState;
    private boolean forceTryIpV6;
    private boolean isUpdating;
    private long lastPauseTime;
    private AtomicInteger lastRequestToken;
    private final ConcurrentHashMap<Integer, RequestCallbacks> requestCallbacks;

    /* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
    public static class GoogleDnsLoadTask extends AsyncTask<Void, Void, NativeByteBuffer> {
        private int currentAccount;
        private int responseDate;

        public GoogleDnsLoadTask(int i10) {
            this.currentAccount = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$doInBackground$0(String str, String str2) {
            int length = str.length();
            int length2 = str2.length();
            if (length > length2) {
                return -1;
            }
            return length < length2 ? 1 : 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$onPostExecute$1(NativeByteBuffer nativeByteBuffer) {
            f8.b("3. currentTask = null, result = " + nativeByteBuffer);
            AsyncTask unused = ConnectionsManager.currentTask = null;
            if (nativeByteBuffer != null) {
                int i10 = this.currentAccount;
                ConnectionsManager.native_applyDnsConfig(i10, nativeByteBuffer.address, d20.i(org.telegram.messenger.c.a(i10).a).d(), this.responseDate);
                return;
            }
            if (v2.a) {
                f8.b("failed to get google result");
                f8.b("start mozilla task");
            }
            MozillaDnsLoadTask mozillaDnsLoadTask = new MozillaDnsLoadTask(this.currentAccount);
            mozillaDnsLoadTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
            f8.b("4. currentTask = mozilla");
            AsyncTask unused2 = ConnectionsManager.currentTask = mozillaDnsLoadTask;
        }

        /* JADX WARN: Finally extract failed */
        @Override // android.os.AsyncTask
        public NativeByteBuffer doInBackground(Void... voidArr) {
            ByteArrayOutputStream byteArrayOutputStream;
            InputStream inputStream;
            int read;
            boolean z10 = false;
            try {
                String str = ConnectionsManager.native_isTestBackend(this.currentAccount) != 0 ? "tapv3.stel.com" : vp.r1(org.telegram.messenger.c.a(this.currentAccount).a).O3;
                int nextInt = Utilities.b.nextInt(zs.B1) + 13;
                StringBuilder sb2 = new StringBuilder(nextInt);
                for (int i10 = 0; i10 < nextInt; i10++) {
                    sb2.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(Utilities.b.nextInt(62)));
                }
                URLConnection openConnection = new URL("https://dns.google.com/resolve?name=" + str + "&type=ANY&random_padding=" + ((Object) sb2)).openConnection();
                openConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 10_0 like Mac OS X) AppleWebKit/602.1.38 (KHTML, like Gecko) Version/10.0 Mobile/14A5297c Safari/602.1");
                openConnection.setConnectTimeout(5000);
                openConnection.setReadTimeout(5000);
                openConnection.connect();
                InputStream inputStream2 = openConnection.getInputStream();
                try {
                    this.responseDate = (int) (openConnection.getDate() / 1000);
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[32768];
                        while (!isCancelled() && (read = inputStream2.read(bArr)) > 0) {
                            byteArrayOutputStream2.write(bArr, 0, read);
                        }
                        JSONArray jSONArray = new JSONObject(new String(byteArrayOutputStream2.toByteArray())).getJSONArray("Answer");
                        int length = jSONArray.length();
                        ArrayList arrayList = new ArrayList(length);
                        for (int i11 = 0; i11 < length; i11++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i11);
                            if (jSONObject.getInt(TeXSymbolParser.TYPE_ATTR) == 16) {
                                arrayList.add(jSONObject.getString("data"));
                            }
                        }
                        Collections.sort(arrayList, new j(0));
                        StringBuilder sb3 = new StringBuilder();
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            sb3.append(((String) arrayList.get(i12)).replace("\"", ""));
                        }
                        byte[] decode = Base64.decode(sb3.toString(), 0);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(decode.length);
                        nativeByteBuffer.writeBytes(decode);
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (Throwable th2) {
                                f8.g(th2, true);
                            }
                        }
                        try {
                            byteArrayOutputStream2.close();
                        } catch (Exception unused) {
                        }
                        return nativeByteBuffer;
                    } catch (Throwable th3) {
                        byteArrayOutputStream = byteArrayOutputStream2;
                        th = th3;
                        inputStream = inputStream2;
                        try {
                            if (!(th instanceof SocketTimeoutException) && !(th instanceof SSLException)) {
                                z10 = true;
                            }
                            f8.g(th, z10);
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable th4) {
                                    f8.g(th4, true);
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Exception unused2) {
                                }
                            }
                            return null;
                        } catch (Throwable th5) {
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable th6) {
                                    f8.g(th6, true);
                                }
                            }
                            if (byteArrayOutputStream == null) {
                                throw th5;
                            }
                            try {
                                byteArrayOutputStream.close();
                                throw th5;
                            } catch (Exception unused3) {
                                throw th5;
                            }
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                    inputStream = inputStream2;
                    byteArrayOutputStream = null;
                }
            } catch (Throwable th8) {
                th = th8;
                byteArrayOutputStream = null;
                inputStream = null;
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(NativeByteBuffer nativeByteBuffer) {
            Utilities.d.c(new k(this, nativeByteBuffer, 0));
        }
    }

    /* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
    public interface INativeTlTest {
        boolean test(long j10);
    }

    /* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
    public static class MozillaDnsLoadTask extends AsyncTask<Void, Void, NativeByteBuffer> {
        private int currentAccount;
        private int responseDate;

        public MozillaDnsLoadTask(int i10) {
            this.currentAccount = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$doInBackground$0(String str, String str2) {
            int length = str.length();
            int length2 = str2.length();
            if (length > length2) {
                return -1;
            }
            return length < length2 ? 1 : 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$onPostExecute$1(NativeByteBuffer nativeByteBuffer) {
            f8.b("5. currentTask = null");
            AsyncTask unused = ConnectionsManager.currentTask = null;
            if (nativeByteBuffer != null) {
                int i10 = this.currentAccount;
                ConnectionsManager.native_applyDnsConfig(i10, nativeByteBuffer.address, d20.i(org.telegram.messenger.c.a(i10).a).d(), this.responseDate);
            } else if (v2.a) {
                f8.b("failed to get mozilla txt result");
            }
        }

        @Override // android.os.AsyncTask
        public NativeByteBuffer doInBackground(Void... voidArr) {
            ByteArrayOutputStream byteArrayOutputStream;
            InputStream inputStream;
            ByteArrayOutputStream byteArrayOutputStream2;
            int read;
            try {
                String str = ConnectionsManager.native_isTestBackend(this.currentAccount) != 0 ? "tapv3.stel.com" : vp.r1(org.telegram.messenger.c.a(this.currentAccount).a).O3;
                int nextInt = Utilities.b.nextInt(zs.B1) + 13;
                StringBuilder sb2 = new StringBuilder(nextInt);
                for (int i10 = 0; i10 < nextInt; i10++) {
                    sb2.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(Utilities.b.nextInt(62)));
                }
                URLConnection openConnection = new URL("https://mozilla.cloudflare-dns.com/dns-query?name=" + str + "&type=TXT&random_padding=" + ((Object) sb2)).openConnection();
                openConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 10_0 like Mac OS X) AppleWebKit/602.1.38 (KHTML, like Gecko) Version/10.0 Mobile/14A5297c Safari/602.1");
                openConnection.addRequestProperty("accept", "application/dns-json");
                openConnection.setConnectTimeout(5000);
                openConnection.setReadTimeout(5000);
                openConnection.connect();
                InputStream inputStream2 = openConnection.getInputStream();
                try {
                    this.responseDate = (int) (openConnection.getDate() / 1000);
                    byteArrayOutputStream2 = new ByteArrayOutputStream();
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = inputStream2;
                    byteArrayOutputStream = null;
                }
                try {
                    byte[] bArr = new byte[32768];
                    while (!isCancelled() && (read = inputStream2.read(bArr)) > 0) {
                        byteArrayOutputStream2.write(bArr, 0, read);
                    }
                    JSONArray jSONArray = new JSONObject(new String(byteArrayOutputStream2.toByteArray())).getJSONArray("Answer");
                    int length = jSONArray.length();
                    ArrayList arrayList = new ArrayList(length);
                    for (int i11 = 0; i11 < length; i11++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i11);
                        if (jSONObject.getInt(TeXSymbolParser.TYPE_ATTR) == 16) {
                            arrayList.add(jSONObject.getString("data"));
                        }
                    }
                    Collections.sort(arrayList, new j(1));
                    StringBuilder sb3 = new StringBuilder();
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        sb3.append(((String) arrayList.get(i12)).replace("\"", ""));
                    }
                    byte[] decode = Base64.decode(sb3.toString(), 0);
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(decode.length);
                    nativeByteBuffer.writeBytes(decode);
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (Throwable th3) {
                            f8.g(th3, true);
                        }
                    }
                    try {
                        byteArrayOutputStream2.close();
                    } catch (Exception unused) {
                    }
                    return nativeByteBuffer;
                } catch (Throwable th4) {
                    byteArrayOutputStream = byteArrayOutputStream2;
                    th = th4;
                    inputStream = inputStream2;
                    try {
                        f8.g(th, false);
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th5) {
                                f8.g(th5, true);
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Exception unused2) {
                            }
                        }
                        return null;
                    } finally {
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                byteArrayOutputStream = null;
                inputStream = null;
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(NativeByteBuffer nativeByteBuffer) {
            Utilities.d.c(new k(this, nativeByteBuffer, 1));
        }
    }

    /* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
    public static class RequestCallbacks {
        public Runnable onCancelled;
        public RequestDelegateInternal onComplete;
        public QuickAckDelegate onQuickAck;
        public WriteToSocketDelegate onWriteToSocket;

        public RequestCallbacks(RequestDelegateInternal requestDelegateInternal, QuickAckDelegate quickAckDelegate, WriteToSocketDelegate writeToSocketDelegate) {
            this.onComplete = requestDelegateInternal;
            this.onQuickAck = quickAckDelegate;
            this.onWriteToSocket = writeToSocketDelegate;
        }
    }

    /* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
    public static class ResolveHostByNameTask extends AsyncTask<Void, Void, ResolvedDomain> {
        private ArrayList<Long> addresses = new ArrayList<>();
        private String currentHostName;

        public ResolveHostByNameTask(String str) {
            this.currentHostName = str;
        }

        public void addAddress(long j10) {
            if (this.addresses.contains(Long.valueOf(j10))) {
                return;
            }
            this.addresses.add(Long.valueOf(j10));
        }

        @Override // android.os.AsyncTask
        public ResolvedDomain doInBackground(Void... voidArr) {
            InputStream inputStream;
            ByteArrayOutputStream byteArrayOutputStream;
            JSONArray jSONArray;
            int length;
            try {
                URLConnection openConnection = new URL("https://www.google.com/resolve?name=" + this.currentHostName + "&type=A").openConnection();
                openConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 10_0 like Mac OS X) AppleWebKit/602.1.38 (KHTML, like Gecko) Version/10.0 Mobile/14A5297c Safari/602.1");
                openConnection.addRequestProperty("Host", "dns.google.com");
                openConnection.setConnectTimeout(1000);
                openConnection.setReadTimeout(2000);
                openConnection.connect();
                inputStream = openConnection.getInputStream();
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[32768];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        JSONObject jSONObject = new JSONObject(new String(byteArrayOutputStream.toByteArray()));
                        if (!jSONObject.has("Answer") || (length = (jSONArray = jSONObject.getJSONArray("Answer")).length()) <= 0) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                f8.g(th2, false);
                            }
                            try {
                                byteArrayOutputStream.close();
                            } catch (Exception unused) {
                            }
                            return null;
                        }
                        ArrayList arrayList = new ArrayList(length);
                        for (int i10 = 0; i10 < length; i10++) {
                            arrayList.add(jSONArray.getJSONObject(i10).getString("data"));
                        }
                        ResolvedDomain resolvedDomain = new ResolvedDomain(arrayList, SystemClock.elapsedRealtime());
                        try {
                            inputStream.close();
                        } catch (Throwable th3) {
                            f8.g(th3, false);
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception unused2) {
                        }
                        return resolvedDomain;
                    } catch (Throwable th4) {
                        th = th4;
                        try {
                            f8.g(th, false);
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable th5) {
                                    f8.g(th5, false);
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Exception unused3) {
                                }
                            }
                            try {
                                InetAddress byName = InetAddress.getByName(this.currentHostName);
                                ArrayList arrayList2 = new ArrayList(1);
                                arrayList2.add(byName.getHostAddress());
                                return new ResolvedDomain(arrayList2, SystemClock.elapsedRealtime());
                            } catch (Exception e) {
                                f8.g(e, false);
                            }
                        } finally {
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    byteArrayOutputStream = null;
                }
            } catch (Throwable th7) {
                th = th7;
                inputStream = null;
                byteArrayOutputStream = null;
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(ResolvedDomain resolvedDomain) {
            int i10 = 0;
            if (resolvedDomain != null) {
                ConnectionsManager.dnsCache.put(this.currentHostName, resolvedDomain);
                int size = this.addresses.size();
                while (i10 < size) {
                    ConnectionsManager.native_onHostNameResolved(this.currentHostName, this.addresses.get(i10).longValue(), resolvedDomain.getAddress());
                    i10++;
                }
            } else {
                int size2 = this.addresses.size();
                while (i10 < size2) {
                    ConnectionsManager.native_onHostNameResolved(this.currentHostName, this.addresses.get(i10).longValue(), "");
                    i10++;
                }
            }
            ConnectionsManager.resolvingHostnameTasks.remove(this.currentHostName);
        }
    }

    /* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
    public static class ResolvedDomain {
        public ArrayList<String> addresses;
        long ttl;

        public ResolvedDomain(ArrayList<String> arrayList, long j10) {
            this.addresses = arrayList;
            this.ttl = j10;
        }

        public String getAddress() {
            ArrayList<String> arrayList = this.addresses;
            return arrayList.get(Utilities.b.nextInt(arrayList.size()));
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = availableProcessors;
        int max = Math.max(2, Math.min(availableProcessors - 1, 4));
        CORE_POOL_SIZE = max;
        int i10 = (availableProcessors * 2) + 1;
        MAXIMUM_POOL_SIZE = i10;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(128);
        sPoolWorkQueue = linkedBlockingQueue;
        ThreadFactory threadFactory = new ThreadFactory() { // from class: org.telegram.tgnet.ConnectionsManager.1
            private final AtomicInteger mCount = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, "DnsAsyncTask #" + this.mCount.getAndIncrement());
            }
        };
        sThreadFactory = threadFactory;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(max, i10, 30L, TimeUnit.SECONDS, linkedBlockingQueue, threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        DNS_THREAD_POOL_EXECUTOR = threadPoolExecutor;
        dnsCache = new HashMap<>();
        lastClassGuid = 1;
        Instance = new ConnectionsManager[4];
        lastPremiumFloodWaitShown = 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsManager(int i10) {
        super(i10);
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        SharedPreferences sharedPreferences;
        int i11;
        String str7;
        int i12;
        File P0;
        String str8 = "";
        this.lastPauseTime = System.currentTimeMillis();
        this.appPaused = true;
        this.lastRequestToken = new AtomicInteger(1);
        this.requestCallbacks = new ConcurrentHashMap<>();
        this.connectionState = native_getConnectionState(this.currentAccount);
        File h = w0.h();
        if (i10 != 0) {
            File file = new File(h, i0.a.i(i10, "account"));
            file.mkdirs();
            h = file;
        }
        String file2 = h.toString();
        boolean isPushConnectionEnabled = isPushConnectionEnabled();
        try {
            str4 = cd.P0().toLowerCase();
            str5 = cd.I0().toLowerCase();
            str3 = Build.MANUFACTURER + Build.MODEL;
            PackageInfo packageInfo = w0.b.getPackageManager().getPackageInfo(w0.b.getPackageName(), 0);
            String str9 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
            boolean z10 = v2.a;
            str2 = str9 + " beta";
            str = "SDK " + Build.VERSION.SDK_INT;
        } catch (Exception unused) {
            str = "SDK " + Build.VERSION.SDK_INT;
            str2 = "App version unknown";
            str3 = "Android unknown";
            str4 = "en";
            str5 = "";
        }
        String str10 = str4.trim().length() != 0 ? str4 : "en";
        String str11 = str3.trim().length() != 0 ? str3 : "Android unknown";
        String str12 = str2.trim().length() == 0 ? "App version unknown" : str2;
        str = str.trim().length() == 0 ? "SDK Unknown" : str;
        getUserConfig().s();
        String regId = getRegId();
        Typeface typeface = i0.a;
        try {
            byte[] encoded = ((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(w0.b.getPackageManager().getPackageInfo(w0.b.getPackageName(), 64).signatures[0].toByteArray()))).getEncoded();
            Pattern pattern = Utilities.a;
            str6 = Utilities.f(Utilities.o(encoded.length, encoded));
        } catch (Throwable unused2) {
            str6 = "";
        }
        int dSTSavings = (TimeZone.getDefault().getDSTSavings() + TimeZone.getDefault().getRawOffset()) / 1000;
        if (this.currentAccount == 0) {
            sharedPreferences = w0.b.getSharedPreferences("mainconfig", 0);
        } else {
            sharedPreferences = w0.b.getSharedPreferences("mainconfig" + this.currentAccount, 0);
        }
        this.forceTryIpV6 = sharedPreferences.getBoolean("forceTryIpV6", false);
        boolean z11 = getUserConfig().f() != null ? getUserConfig().f().premium : false;
        int d = tz.d();
        String str13 = str10;
        int i13 = v2.d;
        boolean z12 = f8.j;
        if (v2.a) {
            try {
                P0 = i0.P0();
            } catch (Throwable th2) {
                th = th2;
                i11 = d;
            }
            if (P0 != null) {
                f8 j10 = f8.j();
                StringBuilder sb2 = new StringBuilder();
                i11 = d;
                try {
                    str7 = str11;
                    i12 = i13;
                    try {
                        sb2.append(f8.j().c.format(System.currentTimeMillis()));
                        sb2.append("_net.txt");
                        j10.f = new File(P0, sb2.toString());
                        str8 = f8.j().f.getAbsolutePath();
                    } catch (Throwable th3) {
                        th = th3;
                        th.printStackTrace();
                        init(i11, TLRPC.LAYER, i12, str7, str, str12, str5, str13, file2, str8, regId, str6, dSTSavings, getUserConfig().e(), z11, isPushConnectionEnabled);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    str7 = str11;
                    i12 = i13;
                    th.printStackTrace();
                    init(i11, TLRPC.LAYER, i12, str7, str, str12, str5, str13, file2, str8, regId, str6, dSTSavings, getUserConfig().e(), z11, isPushConnectionEnabled);
                }
                init(i11, TLRPC.LAYER, i12, str7, str, str12, str5, str13, file2, str8, regId, str6, dSTSavings, getUserConfig().e(), z11, isPushConnectionEnabled);
            }
        }
        i11 = d;
        str7 = str11;
        i12 = i13;
        init(i11, TLRPC.LAYER, i12, str7, str, str12, str5, str13, file2, str8, regId, str6, dSTSavings, getUserConfig().e(), z11, isPushConnectionEnabled);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkWebProxyInternal(ji.b bVar, int i10, RequestTimeDelegate requestTimeDelegate) {
        native_checkProxy(this.currentAccount, "127.0.0.1", i10, "", "", bVar.f, requestTimeDelegate);
    }

    public static int generateClassGuid() {
        int i10 = lastClassGuid;
        lastClassGuid = i10 + 1;
        return i10;
    }

    public static void getHostByName(String str, long j10) {
        i0.g3(new bi.e(str, j10, 7));
    }

    public static int getInitFlags() {
        if (!o6.h(w0.b).f()) {
            return 0;
        }
        if (!v2.a) {
            return 1024;
        }
        f8.b("detected emu");
        return 1024;
    }

    public static ConnectionsManager getInstance(int i10) {
        ConnectionsManager connectionsManager;
        ConnectionsManager[] connectionsManagerArr = Instance;
        ConnectionsManager connectionsManager2 = connectionsManagerArr[i10];
        if (connectionsManager2 != null) {
            return connectionsManager2;
        }
        synchronized (ConnectionsManager.class) {
            try {
                connectionsManager = connectionsManagerArr[i10];
                if (connectionsManager == null) {
                    connectionsManager = new ConnectionsManager(i10);
                    connectionsManagerArr[i10] = connectionsManager;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return connectionsManager;
    }

    private String getRegId() {
        String str = tz.g;
        if (!TextUtils.isEmpty(str) && tz.f == 13) {
            str = sc.e.h("huawei://", str);
        }
        if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(tz.h)) {
            str = tz.h;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        StringBuilder u10 = a1.g.u("__", tz.f == 2 ? "FIREBASE" : "HUAWEI", "_GENERATING_SINCE_");
        u10.append(getCurrentTime());
        u10.append("__");
        String sb2 = u10.toString();
        tz.h = sb2;
        return sb2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$cancelRequest$10(Runnable runnable, int i10, boolean z10) {
        if (runnable != null) {
            listenCancel(i10, new lg.b(1, runnable));
        }
        native_cancelRequest(this.currentAccount, i10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$cancelRequest$9(Runnable runnable) {
        Utilities.d.c(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$cancelRequestsForGuid$11(int i10) {
        native_cancelRequestsForGuid(this.currentAccount, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$discardConnection$0(int i10, int i11) {
        native_discardConnection(this.currentAccount, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$failNotRunningRequest$1(int i10) {
        native_failNotRunningRequest(this.currentAccount, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$getHostByName$20(String str, long j10) {
        ResolvedDomain resolvedDomain = dnsCache.get(str);
        if (resolvedDomain != null && SystemClock.elapsedRealtime() - resolvedDomain.ttl < 300000) {
            native_onHostNameResolved(str, j10, resolvedDomain.getAddress());
            return;
        }
        ResolveHostByNameTask resolveHostByNameTask = resolvingHostnameTasks.get(str);
        if (resolveHostByNameTask == null) {
            resolveHostByNameTask = new ResolveHostByNameTask(str);
            try {
                resolveHostByNameTask.executeOnExecutor(DNS_THREAD_POOL_EXECUTOR, null, null, null);
                resolvingHostnameTasks.put(str, resolveHostByNameTask);
            } catch (Throwable th2) {
                f8.g(th2, true);
                native_onHostNameResolved(str, j10, "");
                return;
            }
        }
        resolveHostByNameTask.addAddress(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$onConnectionStateChanged$15(int i10, int i11) {
        getInstance(i10).connectionState = i11;
        zs.f(org.telegram.messenger.c.a(i10).a).k(zs.T1, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onIntegrityCheckClassic$25(int i10, long j10, int i11, String str, IntegrityTokenResponse integrityTokenResponse) {
        String str2 = integrityTokenResponse.token();
        if (str2 == null) {
            StringBuilder l4 = i0.a.l(i10, "account", ": integrity check gave null token in ");
            l4.append(System.currentTimeMillis() - j10);
            l4.append("ms");
            f8.d(l4.toString());
            native_receivedIntegrityCheckClassic(i10, i11, str, "PLAYINTEGRITY_FAILED_EXCEPTION_NULL");
            return;
        }
        f8.b("account" + i10 + ": integrity check successfully gave token: " + str2 + " in " + (System.currentTimeMillis() - j10) + "ms");
        try {
            native_receivedIntegrityCheckClassic(i10, i11, str, str2);
        } catch (Exception e) {
            f8.e("receivedIntegrityCheckClassic failed", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onIntegrityCheckClassic$26(int i10, long j10, int i11, String str, Exception exc) {
        StringBuilder l4 = i0.a.l(i10, "account", ": integrity check failed to give a token in ");
        l4.append(System.currentTimeMillis() - j10);
        l4.append("ms");
        f8.e(l4.toString(), exc);
        native_receivedIntegrityCheckClassic(i10, i11, str, "PLAYINTEGRITY_FAILED_EXCEPTION_" + hf0.n1(exc));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onIntegrityCheckClassic$27(int i10, String str, String str2, int i11) {
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("account");
        sb2.append(i10);
        sb2.append(": server requests integrity classic check with project = ");
        sb2.append(str);
        sb2.append(" nonce = ");
        a1.g.z(str2, sb2);
        try {
            IntegrityManagerFactory.create(w0.b).requestIntegrityToken(IntegrityTokenRequest.builder().setNonce(str2).setCloudProjectNumber(Long.parseLong(str)).build()).addOnSuccessListener(new g(i10, currentTimeMillis, str2, i11)).addOnFailureListener(new g(i10, currentTimeMillis, str2, i11));
        } catch (Exception unused) {
            f8.b("account" + i10 + ": integrity check failes to parse project id");
            native_receivedIntegrityCheckClassic(i10, i11, str2, "PLAYINTEGRITY_FAILED_EXCEPTION_NOPROJECT");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$onLogout$16(int i10) {
        int i11 = org.telegram.messenger.c.a(i10).a;
        if (d20.i(i11).e() != 0) {
            d20.i(i11).b();
            vp.r1(i11).x3(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$onPremiumFloodWait$23(boolean z10, int i10, int i11) {
        boolean z11;
        m7 m7Var = null;
        d9 d9Var = null;
        if (z10) {
            Iterator it = b8.G(i10).h.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                d9 d9Var2 = (d9) it.next();
                if (d9Var2 != null && d9Var2.q.contains(Integer.valueOf(i11))) {
                    d9Var = d9Var2;
                    break;
                }
            }
            if (d9Var != null) {
                z11 = !d9Var.T;
                d9Var.T = true;
            }
            z11 = false;
        } else {
            Iterator it2 = b8.G(i10).w.values().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                m7 m7Var2 = (m7) it2.next();
                if (m7Var2 != null && m7Var2.F0.contains(Integer.valueOf(i11))) {
                    m7Var = m7Var2;
                    break;
                }
            }
            if (m7Var != null) {
                z11 = !m7Var.l;
                m7Var.l = true;
            }
            z11 = false;
        }
        if (z11) {
            zs.f(i10).k(zs.t3, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onPremiumFloodWait$24(int i10, boolean z10, int i11) {
        if (d20.s0 != i10) {
            return;
        }
        i0.g3(new b(z10, i10, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onProxyError$19() {
        zs.e().k(zs.M0, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onRequestNewServerIpAndPort$17(int i10, boolean z10, int i11) {
        f8.b("13. currentTask == " + currentTask);
        if (currentTask != null || ((i10 == 0 && Math.abs(lastDnsRequestTime - System.currentTimeMillis()) < 10000) || !z10)) {
            if (v2.a) {
                f8.b("don't start task, current task = " + currentTask + " next task = " + i10 + " time diff = " + Math.abs(lastDnsRequestTime - System.currentTimeMillis()) + " network = " + w0.s());
                return;
            }
            return;
        }
        lastDnsRequestTime = System.currentTimeMillis();
        if (i10 == 2) {
            if (v2.a) {
                f8.b("start mozilla txt task");
            }
            MozillaDnsLoadTask mozillaDnsLoadTask = new MozillaDnsLoadTask(i11);
            mozillaDnsLoadTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
            f8.b("9. currentTask = mozilla");
            currentTask = mozillaDnsLoadTask;
            return;
        }
        if (v2.a) {
            f8.b("start google txt task");
        }
        GoogleDnsLoadTask googleDnsLoadTask = new GoogleDnsLoadTask(i11);
        googleDnsLoadTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
        f8.b("11. currentTask = dnstxt");
        currentTask = googleDnsLoadTask;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onRequestNewServerIpAndPort$18(int i10, int i11) {
        Utilities.d.c(new b(i10, i11, 2, w0.s()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$onSessionCreated$14(int i10) {
        vp.r1(org.telegram.messenger.c.a(i10).a).W0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$onUnparsedMessageReceived$12(int i10, TLRPC.Updates updates) {
        vp.r1(org.telegram.messenger.c.a(i10).a).L3(updates, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$onUpdate$13(int i10) {
        int i11;
        long j10;
        long j11;
        int i12;
        long j12;
        int i13;
        vp r12 = vp.r1(org.telegram.messenger.c.a(i10).a);
        long currentTimeMillis = System.currentTimeMillis();
        int i14 = 0;
        r12.I(false);
        ArrayList arrayList = r12.R1;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList arrayList2 = r12.P1;
        int size = arrayList2.size();
        int i15 = 0;
        while (true) {
            i11 = 1;
            if (i15 >= size) {
                break;
            }
            np npVar = (np) arrayList2.get(i15);
            if (npVar.f <= elapsedRealtime) {
                r12.R(npVar);
                arrayList2.remove(i15);
                r12.Q1.l(npVar.a);
                i15--;
                size--;
            }
            i15++;
        }
        int size2 = arrayList.size();
        int i16 = 0;
        while (i16 < size2) {
            np npVar2 = (np) arrayList.get(i16);
            if (npVar2.f <= elapsedRealtime) {
                r12.R(npVar2);
                arrayList.remove(i16);
                r12.S1.remove(npVar2.a + "_" + npVar2.b);
                i16 += -1;
                size2 += -1;
            }
            i16++;
        }
        long j13 = 1000;
        long j14 = 0;
        if (r12.getUserConfig().p()) {
            if (r12.h7 || r12.getConnectionsManager().getPauseTime() != 0 || !w0.w || w0.E) {
                if (r12.L2 != 2 && !r12.M2 && Math.abs(System.currentTimeMillis() - r12.getConnectionsManager().getPauseTime()) >= 2000) {
                    r12.L2 = 2;
                    if (r12.K2 != 0) {
                        r12.getConnectionsManager().cancelRequest(r12.K2, true);
                    }
                    TL_account.updateStatus updatestatus = new TL_account.updateStatus();
                    updatestatus.offline = true;
                    r12.K2 = r12.getConnectionsManager().sendRequest(updatestatus, new tj(r12, 10));
                }
            } else if (w0.G != 0 && Math.abs(w0.G - System.currentTimeMillis()) > 1000 && r12.L2 != 1 && (r12.J2 == 0 || Math.abs(System.currentTimeMillis() - r12.J2) >= 55000 || r12.M2)) {
                r12.L2 = 1;
                if (r12.K2 != 0) {
                    r12.getConnectionsManager().cancelRequest(r12.K2, true);
                }
                TL_account.updateStatus updatestatus2 = new TL_account.updateStatus();
                updatestatus2.offline = false;
                r12.K2 = r12.getConnectionsManager().sendRequest(updatestatus2, new tj(r12, 9));
            }
            if (r12.W0.m() != 0) {
                for (int i17 = 0; i17 < r12.W0.m(); i17++) {
                    long j15 = r12.W0.j(i17);
                    if (Math.abs(currentTimeMillis - r12.X0.valueAt(i17)) >= 1500) {
                        if (v2.a) {
                            f8.b("QUEUE CHANNEL " + j15 + " UPDATES WAIT TIMEOUT - CHECK QUEUE");
                        }
                        r12.C3(0, j15);
                    }
                }
            }
            for (int i18 = 0; i18 < 3; i18++) {
                if (r12.Y1(i18) != 0 && Math.abs(currentTimeMillis - r12.Y1(i18)) >= 1500) {
                    if (v2.a) {
                        f8.b(i18 + " QUEUE UPDATES WAIT TIMEOUT - CHECK QUEUE");
                    }
                    r12.M3(i18, 0);
                }
            }
        }
        int currentTime = r12.getConnectionsManager().getCurrentTime();
        if (Math.abs(System.currentTimeMillis() - r12.M0) >= 5000) {
            r12.M0 = System.currentTimeMillis();
            if (r12.J0.m() != 0) {
                int i19 = 0;
                while (i19 < r12.J0.m()) {
                    long j16 = r12.J0.j(i19);
                    TLRPC.TL_messages_getMessagesViews tL_messages_getMessagesViews = new TLRPC.TL_messages_getMessagesViews();
                    tL_messages_getMessagesViews.peer = r12.i1(j16);
                    tL_messages_getMessagesViews.id = (ArrayList) r12.J0.n(i19);
                    tL_messages_getMessagesViews.increment = i19 == 0;
                    r12.getConnectionsManager().sendRequest(tL_messages_getMessagesViews, new qj(r12, j16, tL_messages_getMessagesViews, 3));
                    i19++;
                    j13 = j13;
                }
                j10 = j13;
                r12.J0.b();
            } else {
                j10 = 1000;
            }
            if (r12.L0 > 0) {
                i0.g3(new bl(r12, currentTime, 3));
            }
        } else {
            j10 = 1000;
        }
        if (!r12.Z.isEmpty()) {
            ArrayList arrayList3 = null;
            for (Map.Entry entry : r12.Z.entrySet()) {
                if (((Integer) entry.getValue()).intValue() < currentTime - 30) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add((Long) entry.getKey());
                }
            }
            if (arrayList3 != null) {
                int size3 = arrayList3.size();
                int i20 = 0;
                while (i20 < size3) {
                    Object obj = arrayList3.get(i20);
                    i20++;
                    r12.Z.remove((Long) obj);
                }
                i0.g3(new zj(r12, 16));
            }
        }
        if (r12.z0.size() != 0) {
            int i21 = 0;
            while (i21 < r12.z0.size()) {
                long keyAt = r12.z0.keyAt(i21);
                if (r12.z0.valueAt(i21) < System.currentTimeMillis() / j10) {
                    r12.z0.delete(keyAt);
                    i21--;
                    if (r12.A0.h(keyAt) >= 0) {
                        r12.H0(keyAt);
                    }
                }
                i21++;
            }
        }
        if (r12.B0.size() != 0) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime() / j10;
            int i22 = 0;
            while (i22 < r12.B0.size()) {
                long keyAt2 = r12.B0.keyAt(i22);
                if (r12.B0.valueAt(i22) < elapsedRealtime2) {
                    if (r12.A0.h(keyAt2) >= 0) {
                        r12.B0.put(keyAt2, (int) (300 + elapsedRealtime2));
                    } else {
                        r12.B0.delete(keyAt2);
                        i22--;
                    }
                    TLRPC.TL_messages_getOnlines tL_messages_getOnlines = new TLRPC.TL_messages_getOnlines();
                    tL_messages_getOnlines.peer = r12.i1(-keyAt2);
                    r12.getConnectionsManager().sendRequest(tL_messages_getOnlines, new sj(r12, keyAt2, 12));
                }
                i22++;
            }
        }
        if (r12.V.isEmpty() && r12.b0 == r12.V.size()) {
            j11 = currentTimeMillis;
            i12 = 1;
            j12 = 0;
        } else {
            ArrayList arrayList4 = new ArrayList(r12.V.keySet());
            int i23 = 0;
            int i24 = 0;
            while (i23 < arrayList4.size()) {
                Long l4 = (Long) arrayList4.get(i23);
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) r12.V.get(l4);
                if (concurrentHashMap != null) {
                    ArrayList arrayList5 = new ArrayList(concurrentHashMap.keySet());
                    int i25 = i14;
                    while (i25 < arrayList5.size()) {
                        Integer num = (Integer) arrayList5.get(i25);
                        ArrayList arrayList6 = (ArrayList) concurrentHashMap.get(num);
                        long j17 = j14;
                        if (arrayList6 != null) {
                            int i26 = i14;
                            while (i26 < arrayList6.size()) {
                                mp mpVar = (mp) arrayList6.get(i26);
                                int i27 = i11;
                                int i28 = i25;
                                long j18 = currentTimeMillis;
                                if (mpVar.a + (mpVar.c instanceof TLRPC.TL_sendMessageGamePlayAction ? 30000 : 5900) < j18) {
                                    arrayList6.remove(mpVar);
                                    i26--;
                                    i24 = i27;
                                }
                                i26++;
                                i11 = i27;
                                i25 = i28;
                                currentTimeMillis = j18;
                            }
                        }
                        long j19 = currentTimeMillis;
                        int i29 = i11;
                        int i30 = i25;
                        if (arrayList6 == null || arrayList6.isEmpty()) {
                            concurrentHashMap.remove(num);
                            arrayList5.remove(i30);
                            i13 = i30 - 1;
                        } else {
                            i13 = i30;
                        }
                        i25 = i13 + 1;
                        j14 = j17;
                        i11 = i29;
                        currentTimeMillis = j19;
                        i14 = 0;
                    }
                }
                long j20 = currentTimeMillis;
                int i31 = i11;
                long j21 = j14;
                if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
                    r12.V.remove(l4);
                    arrayList4.remove(i23);
                    i23--;
                }
                i23++;
                j14 = j21;
                i11 = i31;
                currentTimeMillis = j20;
                i14 = 0;
            }
            j11 = currentTimeMillis;
            i12 = i11;
            j12 = j14;
            r12.k5();
            if (i24 != 0) {
                i0.g3(new zj(r12, 17));
            }
        }
        if (t6.o == i12 && Math.abs(j11 - vp.B8) >= 60) {
            i0.g3(r12.H2);
            vp.B8 = j11;
        }
        if (r12.getUserConfig().j0 != null && Math.abs(j11 - vp.C8) >= 60) {
            i0.g3(r12.I2);
            vp.C8 = j11;
        }
        if (r12.k2 != j12 && Math.abs(SystemClock.elapsedRealtime() - r12.k2) >= 10800000) {
            PushListenerController.sendRegistrationToServer(tz.f, tz.g);
        }
        r12.getLocationController().t();
        r12.N(false);
        if (r12.F2 > r12.getConnectionsManager().getCurrentTime() || r12.E2 || !r12.getUserConfig().p()) {
            return;
        }
        r12.E2 = true;
        r12.getConnectionsManager().sendRequest(new TLRPC.TL_help_getTermsOfServiceUpdate(), new tj(r12, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$onUpdateConfig$21(int i10, TLRPC.TL_config tL_config) {
        i0.g3(new e4(6, vp.r1(org.telegram.messenger.c.a(i10).a), tL_config));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$sendRequestInternal$7(RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j10) {
        if (requestDelegate != null) {
            requestDelegate.run(tLObject, tL_error);
        } else if (requestDelegateTimestamp != null) {
            requestDelegateTimestamp.run(tLObject, tL_error, j10);
        } else if (tLObject instanceof TLRPC.Updates) {
            CountDownLatch countDownLatch = KeepAliveJob.a;
            Utilities.e.c(new f3(16));
            vp.r1(org.telegram.messenger.c.a(this.currentAccount).a).L3((TLRPC.Updates) tLObject, false);
        }
        if (tLObject != null) {
            tLObject.freeResources();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a7 A[Catch: Exception -> 0x0031, TryCatch #2 {Exception -> 0x0031, blocks: (B:4:0x0012, B:27:0x007f, B:10:0x00a3, B:12:0x00a7, B:13:0x00ab, B:15:0x00af, B:17:0x00b9, B:18:0x00c8, B:20:0x00de, B:35:0x002b, B:39:0x0037, B:43:0x0048, B:6:0x0025), top: B:2:0x0010, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00af A[Catch: Exception -> 0x0031, TryCatch #2 {Exception -> 0x0031, blocks: (B:4:0x0012, B:27:0x007f, B:10:0x00a3, B:12:0x00a7, B:13:0x00ab, B:15:0x00af, B:17:0x00b9, B:18:0x00c8, B:20:0x00de, B:35:0x002b, B:39:0x0037, B:43:0x0048, B:6:0x0025), top: B:2:0x0010, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void lambda$sendRequestInternal$8(TLObject tLObject, int i10, long j10, RequestDelegate requestDelegate, RequestDelegateTimestamp requestDelegateTimestamp, QuickAckDelegate quickAckDelegate, WriteToSocketDelegate writeToSocketDelegate, int i11, int i12, boolean z10, int i13, long j11, int i14, String str, int i15, long j12, long j13, int i16) {
        int i17;
        TLObject tLObject2;
        ConnectionsManager connectionsManager;
        String str2;
        TLRPC.TL_error tL_error = null;
        try {
            if (j11 != 0) {
                NativeByteBuffer wrap = NativeByteBuffer.wrap(j11);
                wrap.setDataSourceType(TLDataSourceType.NETWORK);
                wrap.reused = true;
                i17 = wrap.limit();
                try {
                    tLObject2 = tLObject.deserializeResponse(wrap, wrap.readInt32(true), true);
                } catch (Exception e) {
                    boolean z11 = v2.a;
                    f8.i(e, true);
                    return;
                }
            } else if (str != null) {
                TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                tL_error2.code = i14;
                tL_error2.text = str;
                if (v2.a && i14 != -2000) {
                    f8.d(tLObject + " got error " + tL_error2.code + " " + tL_error2.text);
                }
                i17 = 0;
                tLObject2 = null;
                tL_error = tL_error2;
            } else {
                i17 = 0;
                tLObject2 = null;
            }
            if ((i10 & 2) != 0) {
                try {
                    if (u61.k0.isEmpty()) {
                        connectionsManager = this;
                        y2.f.c(w0.b).e(i17, Math.max(0L, (System.currentTimeMillis() - j10) - native_getCurrentPingTime(connectionsManager.currentAccount)));
                        boolean z12 = v2.a;
                        if (tLObject2 != null) {
                            tLObject2.networkType = i15;
                        }
                        if (v2.a) {
                            StringBuilder sb2 = new StringBuilder("java received ");
                            sb2.append(tLObject2);
                            if (tL_error != null) {
                                str2 = " error = " + tL_error;
                            } else {
                                str2 = "";
                            }
                            sb2.append(str2);
                            sb2.append(" messageId = 0x");
                            sb2.append(Long.toHexString(j13));
                            f8.b(sb2.toString());
                        }
                        Utilities.d.c(new q00(connectionsManager, requestDelegate, tLObject2, tL_error, requestDelegateTimestamp, j12));
                    }
                } catch (Exception e7) {
                    e = e7;
                    f8.g(e, true);
                }
            }
            connectionsManager = this;
            boolean z122 = v2.a;
            if (tLObject2 != null) {
            }
            if (v2.a) {
            }
            Utilities.d.c(new q00(connectionsManager, requestDelegate, tLObject2, tL_error, requestDelegateTimestamp, j12));
        } catch (Exception e10) {
            e = e10;
            f8.g(e, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendRequestTyped$3(Executor executor, j20 j20Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (executor != null) {
            executor.execute(new li.s(j20Var, tLObject, tL_error, 16));
        } else {
            j20Var.a(tLObject, tL_error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendRequestTypedAndProcessUpdates$5(Executor executor, j20 j20Var, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null) {
            getMessagesController().L3(updates, false);
        }
        if (executor != null) {
            executor.execute(new li.s(j20Var, updates, tL_error, 17));
        } else {
            j20Var.a(updates, tL_error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$setIsUpdating$22(boolean z10) {
        if (this.isUpdating == z10) {
            return;
        }
        this.isUpdating = z10;
        if (this.connectionState == 3) {
            zs.f(org.telegram.messenger.c.a(this.currentAccount).a).k(zs.T1, new Object[0]);
        }
    }

    private void listen(int i10, RequestDelegateInternal requestDelegateInternal, QuickAckDelegate quickAckDelegate, WriteToSocketDelegate writeToSocketDelegate) {
        this.requestCallbacks.put(Integer.valueOf(i10), new RequestCallbacks(requestDelegateInternal, quickAckDelegate, writeToSocketDelegate));
    }

    private void listenCancel(int i10, Runnable runnable) {
        RequestCallbacks requestCallbacks = this.requestCallbacks.get(Integer.valueOf(i10));
        if (requestCallbacks != null) {
            requestCallbacks.onCancelled = runnable;
        }
    }

    public static native byte[] nativeTestGenerateClientHello(String str);

    public static native void native_applyDatacenterAddress(int i10, int i11, String str, int i12);

    public static native void native_applyDnsConfig(int i10, long j10, String str, int i11);

    public static native void native_bindRequestToGuid(int i10, int i11, int i12);

    public static native void native_cancelRequest(int i10, int i11, boolean z10);

    public static native void native_cancelRequestsForGuid(int i10, int i11);

    public static native long native_checkProxy(int i10, String str, int i11, String str2, String str3, String str4, RequestTimeDelegate requestTimeDelegate);

    public static native void native_cleanUp(int i10, boolean z10);

    public static native void native_discardConnection(int i10, int i11, int i12);

    public static native void native_failNotRunningRequest(int i10, int i11);

    public static native int native_getConnectionState(int i10);

    public static native long native_getCurrentAuthKeyId(int i10);

    public static native int native_getCurrentDatacenterId(int i10);

    public static native int native_getCurrentPingTime(int i10);

    public static native int native_getCurrentTime(int i10);

    public static native long native_getCurrentTimeMillis(int i10);

    public static native int native_getTimeDifference(int i10);

    public static native void native_init(int i10, int i11, int i12, int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i14, long j10, boolean z10, boolean z11, boolean z12, int i15, int i16);

    public static native boolean native_isGoodPrime(byte[] bArr, int i10);

    public static native int native_isTestBackend(int i10);

    public static native void native_moveDatacenter(int i10, int i11);

    public static native void native_onHostNameResolved(String str, long j10, String str2);

    public static native void native_pauseNetwork(int i10);

    public static native void native_receivedCaptchaResult(int i10, int[] iArr, String str);

    public static native void native_receivedIntegrityCheckClassic(int i10, int i11, String str, String str2);

    public static native void native_resumeNetwork(int i10, boolean z10);

    public static native void native_sendRequest(int i10, long j10, int i11, int i12, int i13, boolean z10, int i14, int i15);

    public static native void native_setIpStrategy(int i10, byte b10);

    public static native void native_setJava(boolean z10);

    public static native void native_setLangCode(int i10, String str);

    public static native void native_setNetworkAvailable(int i10, boolean z10, int i11, boolean z11);

    public static native void native_setProxySettings(int i10, String str, int i11, String str2, String str3, String str4);

    public static native void native_setPushConnectionEnabled(int i10, boolean z10);

    public static native void native_setRegId(int i10, String str);

    public static native void native_setSystemLangCode(int i10, String str);

    public static native void native_setUserId(int i10, long j10);

    public static native void native_switchBackend(int i10, boolean z10);

    public static native boolean native_test_AuthAuthorization(long j10);

    public static native void native_updateDcSettings(int i10);

    public static void onBytesReceived(int i10, int i11, int i12) {
        try {
            uz.e(i12).h(i11, 6, i10);
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public static void onBytesSent(int i10, int i11, int i12) {
        try {
            uz.e(org.telegram.messenger.c.a(i12).a).j(i11, 6, i10);
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public static void onCaptchaCheck(int i10, int i11, String str, String str2) {
        if (js.e == null) {
            js.e = new HashMap();
        }
        int i12 = 0;
        e3 e3Var = (e3) js.e.get(Integer.valueOf(Objects.hash(Integer.valueOf(i10), str, str2)));
        if (e3Var != null) {
            e3Var.d.add(Integer.valueOf(i11));
            return;
        }
        e3 e3Var2 = new e3();
        HashSet hashSet = new HashSet();
        e3Var2.d = hashSet;
        e3Var2.a = i10;
        e3Var2.b = str;
        e3Var2.c = str2;
        hashSet.add(Integer.valueOf(i11));
        Activity u02 = i0.u0();
        if (u02 != null) {
            Recaptcha.getTasksClient(u02.getApplication(), str2).addOnSuccessListener(new c3(str, str2, e3Var2, i12)).addOnFailureListener(new d3(e3Var2, i12));
        } else {
            f8.d("CaptchaController: no activity found");
            e3Var2.a("RECAPTCHA_FAILED_NO_ACTIVITY");
        }
    }

    public static void onConnectionStateChanged(int i10, int i11) {
        i0.g3(new td(i11, i10, 3));
    }

    public static void onIntegrityCheckClassic(int i10, int i11, String str, String str2) {
        i0.g3(new a0(i10, i11, str, str2));
    }

    public static void onInternalPushReceived(int i10) {
        CountDownLatch countDownLatch = KeepAliveJob.a;
        Utilities.e.c(new f3(17));
    }

    public static void onLogout(int i10) {
        i0.g3(new wd(i10, 8));
    }

    public static void onPremiumFloodWait(int i10, int i11, boolean z10) {
        i0.g3(new b(i10, i11, 0, z10));
    }

    public static void onProxyError() {
        i0.g3(new d());
    }

    public static void onRequestClear(int i10, int i11, boolean z10) {
        ConnectionsManager connectionsManager = getInstance(i10);
        if (connectionsManager == null) {
            return;
        }
        RequestCallbacks requestCallbacks = connectionsManager.requestCallbacks.get(Integer.valueOf(i11));
        if (!z10) {
            if (requestCallbacks != null) {
                connectionsManager.requestCallbacks.remove(Integer.valueOf(i11));
            }
        } else if (requestCallbacks != null) {
            Runnable runnable = requestCallbacks.onCancelled;
            if (runnable != null) {
                runnable.run();
            }
            connectionsManager.requestCallbacks.remove(Integer.valueOf(i11));
        }
    }

    public static void onRequestComplete(int i10, int i11, long j10, int i12, String str, int i13, long j11, long j12, int i14) {
        RequestDelegateInternal requestDelegateInternal;
        ConnectionsManager connectionsManager = getInstance(i10);
        if (connectionsManager == null) {
            return;
        }
        RequestCallbacks requestCallbacks = connectionsManager.requestCallbacks.get(Integer.valueOf(i11));
        connectionsManager.requestCallbacks.remove(Integer.valueOf(i11));
        if (requestCallbacks == null || (requestDelegateInternal = requestCallbacks.onComplete) == null) {
            return;
        }
        requestDelegateInternal.run(j10, i12, str, i13, j11, j12, i14);
    }

    public static void onRequestNewServerIpAndPort(int i10, int i11) {
        Utilities.e.c(new td(i10, i11, 2));
    }

    public static void onRequestQuickAck(int i10, int i11) {
        RequestCallbacks requestCallbacks;
        QuickAckDelegate quickAckDelegate;
        ConnectionsManager connectionsManager = getInstance(i10);
        if (connectionsManager == null || (requestCallbacks = connectionsManager.requestCallbacks.get(Integer.valueOf(i11))) == null || (quickAckDelegate = requestCallbacks.onQuickAck) == null) {
            return;
        }
        quickAckDelegate.run();
    }

    public static void onRequestWriteToSocket(int i10, int i11) {
        RequestCallbacks requestCallbacks;
        WriteToSocketDelegate writeToSocketDelegate;
        ConnectionsManager connectionsManager = getInstance(i10);
        if (connectionsManager == null || (requestCallbacks = connectionsManager.requestCallbacks.get(Integer.valueOf(i11))) == null || (writeToSocketDelegate = requestCallbacks.onWriteToSocket) == null) {
            return;
        }
        writeToSocketDelegate.run();
    }

    public static void onSessionCreated(int i10) {
        Utilities.d.c(new wd(i10, 7));
    }

    public static void onUnparsedMessageReceived(long j10, int i10, long j11) {
        try {
            NativeByteBuffer wrap = NativeByteBuffer.wrap(j10);
            wrap.setDataSourceType(TLDataSourceType.NETWORK);
            wrap.reused = true;
            int readInt32 = wrap.readInt32(true);
            TLRPC.Updates TLdeserialize = TLRPC.Updates.TLdeserialize(wrap, readInt32, true);
            boolean z10 = f8.j;
            boolean z11 = v2.a;
            int i11 = 0;
            if (TLdeserialize == null) {
                if (v2.a) {
                    f8.b(String.format("java received unknown constructor 0x%x", Integer.valueOf(readInt32)));
                    return;
                }
                return;
            }
            if (v2.a) {
                f8.b("java received " + TLdeserialize);
            }
            CountDownLatch countDownLatch = KeepAliveJob.a;
            Utilities.e.c(new f3(16));
            Utilities.d.c(new h(i10, TLdeserialize, i11));
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public static void onUpdate(int i10) {
        Utilities.d.c(new wd(i10, 6));
    }

    public static void onUpdateConfig(long j10, int i10) {
        try {
            NativeByteBuffer wrap = NativeByteBuffer.wrap(j10);
            wrap.reused = true;
            TLRPC.TL_config TLdeserialize = TLRPC.TL_config.TLdeserialize(wrap, wrap.readInt32(true), true);
            if (TLdeserialize != null) {
                Utilities.d.c(new ag.d3(i10, TLdeserialize, 11));
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sendRequestInternal, reason: merged with bridge method [inline-methods] */
    public void lambda$sendRequest$6(final TLObject tLObject, final RequestDelegate requestDelegate, final RequestDelegateTimestamp requestDelegateTimestamp, final QuickAckDelegate quickAckDelegate, final WriteToSocketDelegate writeToSocketDelegate, final int i10, final int i11, final int i12, final boolean z10, final int i13) {
        int i14;
        if (v2.a) {
            f8.b("send request " + tLObject + " with token = " + i13);
        }
        try {
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLObject.getObjectSize());
            tLObject.serializeToStream(nativeByteBuffer);
            tLObject.freeResources();
            final long currentTimeMillis = (i12 & 2) != 0 ? System.currentTimeMillis() : 0L;
            listen(i13, new RequestDelegateInternal() { // from class: org.telegram.tgnet.c
                @Override // org.telegram.tgnet.RequestDelegateInternal
                public final void run(long j10, int i15, String str, int i16, long j11, long j12, int i17) {
                    ConnectionsManager.this.lambda$sendRequestInternal$8(tLObject, i12, currentTimeMillis, requestDelegate, requestDelegateTimestamp, quickAckDelegate, writeToSocketDelegate, i10, i11, z10, i13, j10, i15, str, i16, j11, j12, i17);
                }
            }, quickAckDelegate, writeToSocketDelegate);
            if ((i10 & 262144) != 0 && (i12 & 65535) == 2) {
                if (tLObject instanceof TLRPC.TL_upload_getFile) {
                    i14 = ((TLRPC.TL_upload_getFile) tLObject).limit;
                } else if (tLObject instanceof TLRPC.TL_upload_getWebFile) {
                    i14 = ((TLRPC.TL_upload_getWebFile) tLObject).limit;
                } else if (tLObject instanceof TLRPC.TL_upload_getCdnFile) {
                    i14 = ((TLRPC.TL_upload_getCdnFile) tLObject).limit;
                }
                native_sendRequest(this.currentAccount, nativeByteBuffer.address, i10, i11, i12, z10, i13, i14);
            }
            i14 = 0;
            native_sendRequest(this.currentAccount, nativeByteBuffer.address, i10, i11, i12, z10, i13, i14);
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public static void setLangCode(String str) {
        String lowerCase = str.replace('_', '-').toLowerCase();
        for (int i10 = 0; i10 < 4; i10++) {
            native_setLangCode(i10, lowerCase);
        }
    }

    public static void setProxySettings(boolean z10, ji.b bVar) {
        String str;
        String str2;
        String str3;
        int i10;
        String str4;
        int i11;
        String str5 = "";
        if (z10 && bVar != null && bVar.f()) {
            String str6 = bVar.b;
            int i12 = bVar.c;
            String str7 = bVar.d;
            String str8 = bVar.e;
            String str9 = bVar.f;
            if (bVar.a == 3) {
                i10 = ji.k.o(str6, str9);
                if (i10 == 0) {
                    i10 = 9;
                }
                str2 = "";
                str3 = str9;
                str5 = "127.0.0.1";
                str = str2;
            } else {
                synchronized (ji.k.y) {
                    try {
                        ji.k kVar = ji.k.z;
                        if (kVar != null) {
                            kVar.q();
                            ji.k.z = null;
                        }
                    } finally {
                    }
                }
                str5 = str6;
                i10 = i12;
                str = str7;
                str2 = str8;
                str3 = str9;
            }
        } else {
            ji.k.p();
            str = "";
            str2 = str;
            str3 = str2;
            i10 = 0;
        }
        int i13 = 0;
        while (i13 < 4) {
            if (z10 && bVar != null && bVar.f()) {
                str4 = str5;
                i11 = i13;
                native_setProxySettings(i11, str4, i10, str, str2, str3);
            } else {
                str4 = str5;
                i11 = i13;
                native_setProxySettings(i11, "", 1080, "", "", "");
            }
            int i14 = org.telegram.messenger.c.a(i11).a;
            if (d20.i(i14).p()) {
                Utilities.d.c(new zj(vp.r1(i14), 25));
            }
            i13 = i11 + 1;
            str5 = str4;
        }
    }

    public static void setRegId(String str, int i10, String str2) {
        if (!TextUtils.isEmpty(str) && i10 == 13) {
            str = sc.e.h("huawei://", str);
        }
        if (!TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            str2 = str;
        }
        if (TextUtils.isEmpty(str2)) {
            StringBuilder u10 = a1.g.u("__", i10 == 2 ? "FIREBASE" : "HUAWEI", "_GENERATING_SINCE_");
            u10.append(getInstance(0).getCurrentTime());
            u10.append("__");
            str2 = u10.toString();
            tz.h = str2;
        }
        for (int i11 = 0; i11 < 4; i11++) {
            native_setRegId(i11, str2);
        }
    }

    public static void setSystemLangCode(String str) {
        String lowerCase = str.replace('_', '-').toLowerCase();
        for (int i10 = 0; i10 < 4; i10++) {
            native_setSystemLangCode(i10, lowerCase);
        }
    }

    public static boolean testNativeTlScheme(NativeByteBuffer nativeByteBuffer, INativeTlTest iNativeTlTest) {
        return iNativeTlTest.test(nativeByteBuffer.address);
    }

    public void applyDatacenterAddress(int i10, String str, int i11) {
        native_applyDatacenterAddress(this.currentAccount, i10, str, i11);
    }

    public void bindRequestToGuid(int i10, int i11) {
        if (i11 == 0) {
            return;
        }
        native_bindRequestToGuid(this.currentAccount, i10, i11);
    }

    public void cancelRequest(int i10, boolean z10) {
        cancelRequest(i10, z10, null);
    }

    public void cancelRequestsForGuid(int i10) {
        Utilities.d.c(new a(this, i10, 1));
    }

    public void checkConnection() {
        byte ipStrategy = getIpStrategy();
        if (v2.a) {
            f8.b("selected ip strategy " + ((int) ipStrategy));
        }
        native_setIpStrategy(this.currentAccount, ipStrategy);
        native_setNetworkAvailable(this.currentAccount, w0.s(), w0.f(), w0.p());
    }

    public long checkProxy(ji.b bVar, RequestTimeDelegate requestTimeDelegate) {
        if (bVar != null && bVar.f()) {
            if (bVar.a != 3) {
                return native_checkProxy(this.currentAccount, bVar.b, bVar.c, bVar.d, bVar.e, bVar.f, requestTimeDelegate);
            }
            ji.f fVar = ji.f.f;
            if (fVar == null) {
                synchronized (ji.f.class) {
                    try {
                        fVar = ji.f.f;
                        if (fVar == null) {
                            fVar = new ji.f(0);
                            ji.f.f = fVar;
                        }
                    } finally {
                    }
                }
            }
            ji.f fVar2 = fVar;
            mg.l lVar = new mg.l(this, 5);
            if (bVar.a == 3 && bVar.f() && requestTimeDelegate != null) {
                i0.g3(new q0(fVar2, lVar, bVar, requestTimeDelegate, 7));
                return 0L;
            }
            if (requestTimeDelegate != null) {
                requestTimeDelegate.run(-1L);
                return 0L;
            }
        }
        return 0L;
    }

    public void cleanup(boolean z10) {
        native_cleanUp(this.currentAccount, z10);
    }

    public void discardConnection(int i10, int i11) {
        Utilities.d.c(new i2.u(this, i10, i11, 7));
    }

    public void failNotRunningRequest(int i10) {
        Utilities.d.c(new a(this, i10, 0));
    }

    public int getConnectionState() {
        int i10 = this.connectionState;
        if (i10 == 3 && this.isUpdating) {
            return 5;
        }
        return i10;
    }

    public long getCurrentAuthKeyId() {
        return native_getCurrentAuthKeyId(this.currentAccount);
    }

    public int getCurrentDatacenterId() {
        return native_getCurrentDatacenterId(this.currentAccount);
    }

    public int getCurrentTime() {
        return native_getCurrentTime(this.currentAccount);
    }

    public long getCurrentTimeMillis() {
        return native_getCurrentTimeMillis(this.currentAccount);
    }

    public byte getIpStrategy() {
        if (v2.a) {
            try {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                while (networkInterfaces.hasMoreElements()) {
                    NetworkInterface nextElement = networkInterfaces.nextElement();
                    if (nextElement.isUp() && !nextElement.isLoopback() && !nextElement.getInterfaceAddresses().isEmpty()) {
                        if (v2.a) {
                            f8.b("valid interface: " + nextElement);
                        }
                        List<InterfaceAddress> interfaceAddresses = nextElement.getInterfaceAddresses();
                        for (int i10 = 0; i10 < interfaceAddresses.size(); i10++) {
                            InetAddress address = interfaceAddresses.get(i10).getAddress();
                            if (v2.a) {
                                f8.b("address: " + address.getHostAddress());
                            }
                            if (!address.isLinkLocalAddress() && !address.isLoopbackAddress() && !address.isMulticastAddress() && v2.a) {
                                f8.b("address is good");
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                f8.g(th2, true);
            }
        }
        try {
            Enumeration<NetworkInterface> networkInterfaces2 = NetworkInterface.getNetworkInterfaces();
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            while (networkInterfaces2.hasMoreElements()) {
                NetworkInterface nextElement2 = networkInterfaces2.nextElement();
                if (nextElement2.isUp() && !nextElement2.isLoopback()) {
                    List<InterfaceAddress> interfaceAddresses2 = nextElement2.getInterfaceAddresses();
                    for (int i11 = 0; i11 < interfaceAddresses2.size(); i11++) {
                        InetAddress address2 = interfaceAddresses2.get(i11).getAddress();
                        if (!address2.isLinkLocalAddress() && !address2.isLoopbackAddress() && !address2.isMulticastAddress()) {
                            if (address2 instanceof Inet6Address) {
                                z10 = true;
                            } else if (address2 instanceof Inet4Address) {
                                if (address2.getHostAddress().startsWith("192.0.0.")) {
                                    z11 = true;
                                } else {
                                    z12 = true;
                                }
                            }
                        }
                    }
                }
            }
            if (z10) {
                if (!this.forceTryIpV6) {
                    if (z11) {
                        return (byte) 2;
                    }
                    if (!z12) {
                    }
                }
                return (byte) 1;
            }
        } catch (Throwable th3) {
            f8.g(th3, true);
        }
        return (byte) 0;
    }

    public long getPauseTime() {
        return this.lastPauseTime;
    }

    public int getTimeDifference() {
        return native_getTimeDifference(this.currentAccount);
    }

    public void init(int i10, int i11, int i12, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i13, long j10, boolean z10, boolean z11) {
        String str10;
        String str11;
        Context context;
        SharedPreferences sharedPreferences = w0.b.getSharedPreferences("mainconfig", 0);
        ji.b c10 = ji.b.c(sharedPreferences);
        if (sharedPreferences.getBoolean("proxy_enabled", false) && c10.f()) {
            if (c10.a == 3) {
                int o10 = ji.k.o(c10.b, c10.f);
                int i14 = this.currentAccount;
                if (o10 == 0) {
                    o10 = 9;
                }
                native_setProxySettings(i14, "127.0.0.1", o10, "", "", c10.f);
            } else {
                native_setProxySettings(this.currentAccount, c10.b, c10.c, c10.d, c10.e, c10.f);
            }
        }
        try {
            context = w0.b;
        } catch (Throwable unused) {
        }
        if (Build.VERSION.SDK_INT >= 30) {
            InstallSourceInfo installSourceInfo = context.getPackageManager().getInstallSourceInfo(context.getPackageName());
            if (installSourceInfo != null) {
                str10 = installSourceInfo.getInitiatingPackageName();
                if (str10 == null) {
                    try {
                        str10 = installSourceInfo.getInstallingPackageName();
                    } catch (Throwable unused2) {
                    }
                }
            }
            str10 = "";
        } else {
            str10 = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        }
        String str12 = str10 == null ? "" : str10;
        try {
            str11 = w0.b.getPackageName();
        } catch (Throwable unused3) {
            str11 = "";
        }
        native_init(this.currentAccount, i10, i11, i12, str, str2, str3, str4, str5, str6, str7, str8, str9, str12, str11 == null ? "" : str11, i13, j10, z10, z11, w0.s(), w0.f(), tz.v());
        checkConnection();
    }

    public boolean isPushConnectionEnabled() {
        SharedPreferences e12 = vp.e1();
        return e12.contains("pushConnection") ? e12.getBoolean("pushConnection", true) : vp.r1(d20.s0).f7.getBoolean("backgroundConnection", false);
    }

    public boolean isTestBackend() {
        return native_isTestBackend(this.currentAccount) != 0;
    }

    public void resumeNetworkMaybe() {
        native_resumeNetwork(this.currentAccount, true);
    }

    public int sendRequest(TLObject tLObject, RequestDelegate requestDelegate) {
        return sendRequest(tLObject, requestDelegate, (QuickAckDelegate) null, 0);
    }

    public int sendRequestSync(TLObject tLObject, RequestDelegate requestDelegate, QuickAckDelegate quickAckDelegate, WriteToSocketDelegate writeToSocketDelegate, int i10, int i11, int i12, boolean z10) {
        int andIncrement = this.lastRequestToken.getAndIncrement();
        lambda$sendRequest$6(tLObject, requestDelegate, null, quickAckDelegate, writeToSocketDelegate, i10, i11, i12, z10, andIncrement);
        return andIncrement;
    }

    public <T extends TLObject> int sendRequestTyped(TLMethod<T> tLMethod, j20 j20Var) {
        return sendRequestTyped(tLMethod, null, j20Var);
    }

    public int sendRequestTypedAndProcessUpdates(TLMethod<TLRPC.Updates> tLMethod, Executor executor, j20 j20Var) {
        return sendRequestTypedAndProcessUpdates(tLMethod, executor, j20Var, DEFAULT_DATACENTER_ID, 0);
    }

    public void setAppPaused(boolean z10, boolean z11) {
        if (!z11) {
            this.appPaused = z10;
            if (v2.a) {
                f8.b("app paused = " + z10);
            }
            if (z10) {
                this.appResumeCount--;
            } else {
                this.appResumeCount++;
            }
            if (v2.a) {
                i0.a.p(this.appResumeCount, new StringBuilder("app resume count "));
            }
            if (this.appResumeCount < 0) {
                this.appResumeCount = 0;
            }
        }
        if (this.appResumeCount == 0) {
            if (this.lastPauseTime == 0) {
                this.lastPauseTime = System.currentTimeMillis();
            }
            native_pauseNetwork(this.currentAccount);
        } else {
            if (this.appPaused) {
                return;
            }
            if (v2.a) {
                f8.b("reset app pause time");
            }
            if (this.lastPauseTime != 0 && System.currentTimeMillis() - this.lastPauseTime > 5000) {
                i5 contactsController = getContactsController();
                contactsController.getClass();
                Utilities.e.c(new a5(contactsController, 4));
            }
            this.lastPauseTime = 0L;
            native_resumeNetwork(this.currentAccount, false);
        }
    }

    public void setDefaultDatacenterId(int i10) {
        native_moveDatacenter(this.currentAccount, i10);
    }

    public void setForceTryIpV6(boolean z10) {
        if (this.forceTryIpV6 != z10) {
            this.forceTryIpV6 = z10;
            checkConnection();
        }
    }

    public void setIsUpdating(boolean z10) {
        i0.g3(new k2.v(7, this, z10));
    }

    public void setPushConnectionEnabled(boolean z10) {
        native_setPushConnectionEnabled(this.currentAccount, z10);
    }

    public void setUserId(long j10) {
        native_setUserId(this.currentAccount, j10);
    }

    public void switchBackend(boolean z10) {
        vp.d1().edit().remove("language_showed2").commit();
        native_switchBackend(this.currentAccount, z10);
    }

    public void updateDcSettings() {
        native_updateDcSettings(this.currentAccount);
    }

    public void cancelRequest(int i10, boolean z10, Runnable runnable) {
        Utilities.d.c(new p0(i10, 1, this, runnable, z10));
    }

    public int sendRequest(TLObject tLObject, RequestDelegate requestDelegate, int i10) {
        return sendRequest(tLObject, requestDelegate, null, null, null, i10, DEFAULT_DATACENTER_ID, 1, true);
    }

    public <T extends TLObject> int sendRequestTyped(TLMethod<T> tLMethod, Executor executor, j20 j20Var) {
        return sendRequestTyped(tLMethod, executor, j20Var, DEFAULT_DATACENTER_ID, 0);
    }

    public int sendRequestTypedAndProcessUpdates(TLMethod<TLRPC.Updates> tLMethod, Executor executor, j20 j20Var, int i10, int i11) {
        return sendRequestTyped(tLMethod, null, new e(this, executor, j20Var, 0), i10, i11);
    }

    public int sendRequest(TLObject tLObject, RequestDelegate requestDelegate, int i10, int i11) {
        return sendRequest(tLObject, requestDelegate, null, null, null, i10, DEFAULT_DATACENTER_ID, i11, true);
    }

    public <T extends TLObject> int sendRequestTyped(TLMethod<T> tLMethod, Executor executor, j20 j20Var, int i10) {
        return sendRequestTyped(tLMethod, executor, j20Var, DEFAULT_DATACENTER_ID, i10);
    }

    public int sendRequest(TLObject tLObject, RequestDelegateTimestamp requestDelegateTimestamp, int i10, int i11, int i12) {
        return sendRequest(tLObject, null, requestDelegateTimestamp, null, null, i10, i12, i11, true);
    }

    public <T extends TLObject> int sendRequestTyped(TLMethod<T> tLMethod, final Executor executor, final j20 j20Var, int i10, int i11) {
        return sendRequest(tLMethod, new RequestDelegate() { // from class: org.telegram.tgnet.i
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ConnectionsManager.lambda$sendRequestTyped$3(executor, j20Var, tLObject, tL_error);
            }
        }, null, null, null, i11, i10, 1, true);
    }

    public int sendRequest(TLObject tLObject, RequestDelegate requestDelegate, QuickAckDelegate quickAckDelegate, int i10) {
        return sendRequest(tLObject, requestDelegate, null, quickAckDelegate, null, i10, DEFAULT_DATACENTER_ID, 1, true);
    }

    public int sendRequest(TLObject tLObject, RequestDelegate requestDelegate, QuickAckDelegate quickAckDelegate, WriteToSocketDelegate writeToSocketDelegate, int i10, int i11, int i12, boolean z10) {
        return sendRequest(tLObject, requestDelegate, null, quickAckDelegate, writeToSocketDelegate, i10, i11, i12, z10);
    }

    public int sendRequest(final TLObject tLObject, final RequestDelegate requestDelegate, final RequestDelegateTimestamp requestDelegateTimestamp, final QuickAckDelegate quickAckDelegate, final WriteToSocketDelegate writeToSocketDelegate, final int i10, final int i11, final int i12, final boolean z10) {
        final int andIncrement = this.lastRequestToken.getAndIncrement();
        Utilities.d.c(new Runnable() { // from class: org.telegram.tgnet.f
            @Override // java.lang.Runnable
            public final void run() {
                ConnectionsManager.this.lambda$sendRequest$6(tLObject, requestDelegate, requestDelegateTimestamp, quickAckDelegate, writeToSocketDelegate, i10, i11, i12, z10, andIncrement);
            }
        });
        return andIncrement;
    }
}
