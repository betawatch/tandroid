package oi;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.internal.cast.o;
import com.google.android.gms.internal.vision.e2;
import gg.t;
import i2.h0;
import j$.util.concurrent.atomic.DesugarAtomicInteger;
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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import ki.i0;
import m4.w;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.v10;
import org.telegram.ui.Components.w10;
import org.telegram.ui.web.b2;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class k implements v10 {
    public static k A;
    public static final Object y = new Object();
    public static k z;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final ServerSocket i;
    public WebView o;
    public b5.h p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public int w;
    public d x;
    public final Object a = new Object();
    public final ExecutorService j = Executors.newCachedThreadPool();
    public final ExecutorService k = Executors.newSingleThreadExecutor();
    public final AtomicInteger l = new AtomicInteger(1);
    public final HashMap m = new HashMap();
    public final ArrayDeque n = new ArrayDeque();

    public k(la.h hVar, String str, byte[] bArr) {
        this.b = (String) hVar.d;
        String str2 = (String) hVar.b;
        this.c = str2;
        String str3 = (String) hVar.c;
        String q6 = str3.isEmpty() ? "/" : a1.g.q("/", str3, "/");
        this.d = q6;
        this.e = str;
        String concat = "https://".concat(str2);
        this.f = concat;
        byte[] bArr2 = new byte[32];
        new SecureRandom().nextBytes(bArr2);
        String encodeToString = Base64.encodeToString(bArr2, 11);
        this.h = encodeToString;
        String concat2 = str3.isEmpty() ? "tdesktop-web-proxy-bridge-v1\n".concat(str2) : e2.j("tdesktop-web-proxy-bridge-v2\n", str2, "\n", str3);
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
        this.g = concat + q6 + "?bridge=" + Base64.encodeToString(mac.doFinal(concat2.getBytes(StandardCharsets.UTF_8)), 11) + "#android=" + encodeToString;
        this.i = new ServerSocket(0, 64, InetAddress.getByName("127.0.0.1"));
    }

    public static void a(k kVar) {
        synchronized (kVar.a) {
            try {
                if (!kVar.u && kVar.o == null) {
                    w10 w10Var = w10.getInstance();
                    if (w10Var != null && w10Var.isBackground()) {
                        kVar.v = true;
                        return;
                    }
                    kVar.v = false;
                    kVar.e();
                    try {
                        WebView webView = new WebView(ApplicationLoader.applicationContext);
                        kVar.o = webView;
                        kVar.q = o.a("WEB_MESSAGE_ARRAY_BUFFER");
                        kVar.r = false;
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
                        settings.setMixedContentMode(1);
                        if (Build.VERSION.SDK_INT >= 26) {
                            settings.setSafeBrowsingEnabled(true);
                        }
                        webView.setWebViewClient(new i(kVar, 0));
                        HashSet hashSet = new HashSet();
                        hashSet.add(kVar.f);
                        a5.b.a(webView, "TelegramWebProxy", hashSet, new w(kVar, 8));
                        webView.loadUrl(kVar.g);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        kVar.f();
                    }
                }
            } finally {
            }
        }
    }

    public static void b(k kVar) {
        int andUpdate;
        while (true) {
            try {
                Socket accept = kVar.i.accept();
                accept.setTcpNoDelay(true);
                synchronized (kVar.a) {
                    try {
                        if (!kVar.u && kVar.m.size() < 64) {
                            while (true) {
                                andUpdate = DesugarAtomicInteger.getAndUpdate(kVar.l, new h());
                                if (andUpdate != 0 && !kVar.m.containsKey(Integer.valueOf(andUpdate))) {
                                    break;
                                }
                            }
                            j jVar = new j(andUpdate, accept);
                            kVar.m.put(Integer.valueOf(andUpdate), jVar);
                            if (kVar.t) {
                                jVar.e = true;
                                kVar.l(1, andUpdate, null);
                            }
                            kVar.j.execute(new i0(11, kVar, jVar));
                        }
                        try {
                            accept.close();
                        } catch (Exception unused) {
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Exception e7) {
                synchronized (kVar.a) {
                    try {
                        if (kVar.u) {
                            return;
                        }
                        FileLog.e(e7);
                        kVar.f();
                        return;
                    } finally {
                    }
                }
            }
        }
    }

    public static byte[] d(String str) {
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

    public static la.h i(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        String j3 = j(indexOf >= 0 ? str.substring(0, indexOf) : str);
        String substring = indexOf >= 0 ? str.substring(indexOf + 1) : "";
        if (TextUtils.isEmpty(j3) || substring.length() > 128) {
            return null;
        }
        if (!substring.isEmpty()) {
            for (String str2 : substring.split("/", -1)) {
                if (str2.isEmpty() || !Character.isLetterOrDigit(str2.charAt(0))) {
                    return null;
                }
                for (int i10 = 0; i10 < str2.length(); i10++) {
                    char charAt = str2.charAt(i10);
                    if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && !((charAt >= '0' && charAt <= '9') || charAt == '_' || charAt == '-'))) {
                        return null;
                    }
                }
            }
        }
        return new la.h(j3, substring);
    }

    public static String j(String str) {
        if (str == null) {
            return "";
        }
        String trim = str.trim();
        if (trim.endsWith(".")) {
            trim = e2.i(1, 0, trim);
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

    public static int m(String str, String str2) {
        boolean z10;
        la.h i10 = i(str);
        byte[] d = d(str2);
        if (i10 != null && d != null) {
            try {
                z10 = o.a("WEB_MESSAGE_LISTENER");
            } catch (Throwable th2) {
                FileLog.e(th2);
                z10 = false;
            }
            if (z10) {
                synchronized (y) {
                    try {
                        k kVar = z;
                        if (kVar != null && !kVar.i.isClosed() && z.b.equals((String) i10.d) && z.e.equals(str2)) {
                            return z.i.getLocalPort();
                        }
                        k kVar2 = z;
                        if (kVar2 != null) {
                            kVar2.o();
                            z = null;
                        }
                        try {
                            k kVar3 = new k(i10, str2, d);
                            z = kVar3;
                            w10 w10Var = w10.getInstance();
                            if (w10Var != null) {
                                w10Var.addListener(kVar3);
                            }
                            kVar3.j.execute(new g(kVar3, 1));
                            AndroidUtilities.runOnUIThread(new g(kVar3, 2));
                            return z.i.getLocalPort();
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            k kVar4 = z;
                            if (kVar4 != null) {
                                kVar4.o();
                                z = null;
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }
        return 0;
    }

    public static void n() {
        synchronized (y) {
            try {
                k kVar = z;
                if (kVar != null) {
                    kVar.o();
                    z = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(j jVar, boolean z10) {
        synchronized (this.a) {
            try {
                if (this.m.get(Integer.valueOf(jVar.a)) != jVar) {
                    return;
                }
                this.m.remove(Integer.valueOf(jVar.a));
                boolean z11 = z10 && this.t && jVar.e;
                this.a.notifyAll();
                try {
                    jVar.b.close();
                } catch (Exception unused) {
                }
                if (z11) {
                    l(3, jVar.a, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        WebView webView = this.o;
        this.o = null;
        this.p = null;
        this.r = false;
        if (webView != null) {
            try {
                webView.stopLoading();
                webView.loadUrl("about:blank");
                webView.removeAllViews();
                webView.destroy();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    public final void f() {
        synchronized (this.a) {
            if (!this.u && !this.v) {
                this.v = true;
                int i10 = 0;
                this.t = false;
                this.p = null;
                this.n.clear();
                this.w = 0;
                ArrayList arrayList = new ArrayList(this.m.values());
                this.m.clear();
                this.a.notifyAll();
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    try {
                        ((j) obj).b.close();
                    } catch (Exception unused) {
                    }
                }
                AndroidUtilities.runOnUIThread(new g(this, 3));
            }
        }
    }

    public final void g(String str, b5.h hVar) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("t");
            if (!"tproxy-android-init".equals(optString) || jSONObject.optInt("v") != 1 || !this.h.equals(jSONObject.optString("nonce"))) {
                if ("close".equals(optString) || "failed".equals(jSONObject.optString("state"))) {
                    f();
                    return;
                }
                return;
            }
            synchronized (this.a) {
                if (!this.u && this.p == null) {
                    this.p = hVar;
                    if (this.q) {
                        this.r = true;
                        l(16, 0, new byte[]{1});
                        return;
                    }
                    WebView webView = this.o;
                    t tVar = new t(this, webView, hVar, 28);
                    AndroidUtilities.runOnUIThread(tVar, 5000L);
                    try {
                        webView.evaluateJavascript("(function(){\n'use strict';\ntry {\n var bridge=window.TelegramWebProxy;\n if(!bridge||typeof bridge.postMessage!=='function'||typeof bridge.onmessage!=='function')return false;\n var nativePost=bridge.postMessage;\n var receive=bridge.onmessage;\n var prefix='tproxy-base64:';\n var maxBytes=1048584;\n var maxChars=1398112;\n function post(value){\n  if(value instanceof ArrayBuffer){\n   if(value.byteLength>maxBytes)throw new Error('WEB proxy frame too large');\n   var bytes=new Uint8Array(value),parts=[];\n   for(var i=0;i<bytes.length;i+=8192){\n    parts.push(String.fromCharCode.apply(null,bytes.subarray(i,Math.min(i+8192,bytes.length))));\n   }\n   nativePost.call(bridge,prefix+btoa(parts.join('')));\n  }else nativePost.call(bridge,value);\n }\n function onmessage(event){\n  var data=event.data;\n  if(typeof data==='string'&&data.indexOf(prefix)===0){\n   try {\n    var encoded=data.substring(prefix.length);\n    if(encoded.length>maxChars)throw new Error('WEB proxy frame too large');\n    var binary=atob(encoded);\n    if(binary.length>maxBytes)throw new Error('WEB proxy frame too large');\n    var bytes=new Uint8Array(binary.length);\n    for(var i=0;i<binary.length;i++)bytes[i]=binary.charCodeAt(i);\n    receive.call(bridge,{data:bytes.buffer});\n   }catch(error){nativePost.call(bridge,'{\"t\":\"close\"}');}\n  }else receive.call(bridge,event);\n }\n bridge.postMessage=post;\n bridge.onmessage=onmessage;\n return bridge.postMessage===post&&bridge.onmessage===onmessage;\n}catch(error){return false;}\n})()\n", new b2(this, tVar, webView, hVar));
                    } catch (Exception e7) {
                        AndroidUtilities.cancelRunOnUIThread(tVar);
                        FileLog.e(e7);
                        FileLog.e("WEB proxy: Base64 bridge installation threw an exception; transport stopped");
                        o();
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public final boolean h(WebView webView) {
        String url = webView.getUrl();
        if (url == null) {
            return false;
        }
        Uri parse = Uri.parse(url);
        return "https".equalsIgnoreCase(parse.getScheme()) && this.c.equalsIgnoreCase(parse.getHost()) && parse.getUserInfo() == null && parse.getPort() == -1 && this.d.equals(parse.getPath());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0185 A[LOOP:0: B:2:0x0002->B:32:0x0185, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0181 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(byte[] bArr) {
        int i10 = 0;
        while (i10 < bArr.length) {
            if (bArr.length - i10 < 8) {
                f();
                return;
            }
            int i11 = bArr[i10] & 255;
            int i12 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8) | (bArr[i10 + 3] & 255);
            long j3 = ((bArr[i10 + 4] & 255) << 24) | ((bArr[i10 + 5] & 255) << 16) | ((bArr[i10 + 6] & 255) << 8) | (255 & bArr[i10 + 7]);
            int i13 = i10 + 8;
            long j10 = i13 + j3;
            if (j3 > 1048576 || j10 > bArr.length) {
                f();
                return;
            }
            int i14 = (int) j3;
            byte[] bArr2 = new byte[i14];
            System.arraycopy(bArr, i13, bArr2, 0, i14);
            boolean z10 = true;
            if (i12 != 0) {
                synchronized (this.a) {
                    try {
                        j jVar = (j) this.m.get(Integer.valueOf(i12));
                        if (jVar == null) {
                            if (i11 != 2 && i11 != 4 && i11 != 3) {
                                z10 = false;
                            }
                        } else if (i11 == 2) {
                            if (i14 != 0) {
                                synchronized (this.a) {
                                    try {
                                        long j11 = jVar.d;
                                        long j12 = i14;
                                        if (j11 >= j12) {
                                            jVar.d = j11 - j12;
                                            try {
                                                jVar.b.getOutputStream().write(bArr2);
                                                synchronized (this.a) {
                                                    try {
                                                        if (this.m.get(Integer.valueOf(jVar.a)) == jVar) {
                                                            jVar.d += j12;
                                                            l(4, jVar.a, ByteBuffer.allocate(4).putInt(i14).array());
                                                        }
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                }
                                            } catch (Exception unused) {
                                                c(jVar, true);
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } else if (i11 == 4 && i14 == 4) {
                            long j13 = ByteBuffer.wrap(bArr2).getInt() & 4294967295L;
                            if (j13 != 0) {
                                synchronized (this.a) {
                                    try {
                                        long j14 = jVar.c;
                                        if (j14 <= 4294967295L - j13) {
                                            jVar.c = j14 + j13;
                                            this.a.notifyAll();
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } else if (i11 == 3 && i14 == 0) {
                            c(jVar, false);
                        }
                    } finally {
                    }
                }
                if (z10) {
                }
            } else if (i11 == 17 && i14 == 0) {
                synchronized (this.a) {
                    try {
                        if (!this.u && !this.t) {
                            this.t = true;
                            ArrayList arrayList = new ArrayList(this.m.values());
                            int size = arrayList.size();
                            int i15 = 0;
                            while (i15 < size) {
                                Object obj = arrayList.get(i15);
                                i15++;
                                j jVar2 = (j) obj;
                                jVar2.e = true;
                                l(1, jVar2.a, null);
                            }
                            d dVar = this.x;
                            this.a.notifyAll();
                            if (dVar != null) {
                                AndroidUtilities.runOnUIThread(new h0(dVar, 17));
                            }
                        }
                    } finally {
                    }
                }
                if (z10) {
                }
            } else if (i11 == 5 && i14 <= 64) {
                l(6, 0, bArr2);
                if (z10) {
                    f();
                    return;
                }
                i10 = (int) j10;
            }
            z10 = false;
            if (z10) {
            }
        }
    }

    public final void l(int i10, int i11, byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        byte[] array = ByteBuffer.allocate(bArr.length + 8).put((byte) i10).put((byte) (i11 >> 16)).put((byte) (i11 >> 8)).put((byte) i11).putInt(bArr.length).put(bArr).array();
        synchronized (this.a) {
            if (!this.u && this.n.size() < 8192 && this.w <= 67108864 - array.length) {
                this.n.add(array);
                this.w += array.length;
                AndroidUtilities.runOnUIThread(new g(this, 4));
                return;
            }
            f();
        }
    }

    public final void o() {
        synchronized (this.a) {
            try {
                if (this.u) {
                    return;
                }
                this.u = true;
                int i10 = 0;
                this.t = false;
                this.v = false;
                ArrayList arrayList = new ArrayList(this.m.values());
                this.m.clear();
                this.n.clear();
                this.w = 0;
                this.a.notifyAll();
                try {
                    this.i.close();
                } catch (Exception unused) {
                }
                w10 w10Var = w10.getInstance();
                if (w10Var != null) {
                    w10Var.removeListener(this);
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    try {
                        ((j) obj).b.close();
                    } catch (Exception unused2) {
                    }
                }
                AndroidUtilities.runOnUIThread(new g(this, 0));
                this.j.shutdownNow();
                this.k.shutdownNow();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.telegram.ui.Components.v10
    public final void onBecameForeground() {
        AndroidUtilities.runOnUIThread(new g(this, 2));
    }

    @Override // org.telegram.ui.Components.v10
    public final void onBecameBackground() {
    }
}
