package ki;

import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.internal.cast.o;
import com.google.android.gms.internal.vision.e2;
import fg.s1;
import hi.y1;
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
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.n10;
import org.telegram.ui.Components.o10;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class k implements n10 {
    public static final Object t = new Object();
    public static k u;
    public static k v;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final ServerSocket g;
    public WebView m;
    public b5.h n;
    public boolean o;
    public boolean p;
    public boolean q;
    public int r;
    public d s;
    public final Object a = new Object();
    public final ExecutorService h = Executors.newCachedThreadPool();
    public final ExecutorService i = Executors.newSingleThreadExecutor();
    public final AtomicInteger j = new AtomicInteger(1);
    public final HashMap k = new HashMap();
    public final ArrayDeque l = new ArrayDeque();

    public k(String str, String str2, byte[] bArr) {
        this.b = str;
        this.c = str2;
        String concat = "https://".concat(str);
        this.d = concat;
        byte[] bArr2 = new byte[32];
        new SecureRandom().nextBytes(bArr2);
        String encodeToString = Base64.encodeToString(bArr2, 11);
        this.f = encodeToString;
        String concat2 = "tdesktop-web-proxy-bridge-v1\n".concat(str);
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
        this.e = concat + "/?bridge=" + Base64.encodeToString(mac.doFinal(concat2.getBytes(StandardCharsets.UTF_8)), 11) + "#android=" + encodeToString;
        this.g = new ServerSocket(0, 64, InetAddress.getByName("127.0.0.1"));
    }

    public static void a(k kVar) {
        synchronized (kVar.a) {
            try {
                if (!kVar.p && kVar.m == null) {
                    o10 o10Var = o10.getInstance();
                    if (o10Var != null && o10Var.isBackground()) {
                        kVar.q = true;
                        return;
                    }
                    kVar.q = false;
                    kVar.e();
                    try {
                        WebView webView = new WebView(ApplicationLoader.applicationContext);
                        kVar.m = webView;
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
                        hashSet.add(kVar.d);
                        a5.c.a(webView, "TelegramWebProxy", hashSet, new y1(kVar, 22));
                        webView.loadUrl(kVar.e);
                    } catch (Exception e) {
                        FileLog.e(e);
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
                Socket accept = kVar.g.accept();
                accept.setTcpNoDelay(true);
                synchronized (kVar.a) {
                    try {
                        if (!kVar.p && kVar.k.size() < 64) {
                            while (true) {
                                andUpdate = DesugarAtomicInteger.getAndUpdate(kVar.j, new h());
                                if (andUpdate != 0 && !kVar.k.containsKey(Integer.valueOf(andUpdate))) {
                                    break;
                                }
                            }
                            j jVar = new j(andUpdate, accept);
                            kVar.k.put(Integer.valueOf(andUpdate), jVar);
                            if (kVar.o) {
                                jVar.e = true;
                                kVar.j(1, andUpdate, null);
                            }
                            kVar.h.execute(new s1(28, kVar, jVar));
                        }
                        try {
                            accept.close();
                        } catch (Exception unused) {
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Exception e) {
                synchronized (kVar.a) {
                    try {
                        if (kVar.p) {
                            return;
                        }
                        FileLog.e(e);
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

    public static boolean h() {
        try {
            if (o.a("WEB_MESSAGE_LISTENER")) {
                if (o.a("WEB_MESSAGE_ARRAY_BUFFER")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            FileLog.e(th2);
            return false;
        }
    }

    public static String i(String str) {
        if (str == null) {
            return "";
        }
        String trim = str.trim();
        if (trim.endsWith(".")) {
            trim = e2.h(1, 0, trim);
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

    public static int k(String str, String str2) {
        String i10 = i(str);
        byte[] d = d(str2);
        if (TextUtils.isEmpty(i10) || d == null || !h()) {
            return 0;
        }
        synchronized (t) {
            try {
                k kVar = u;
                if (kVar != null && kVar.b.equals(i10) && u.c.equals(str2)) {
                    return u.g.getLocalPort();
                }
                k kVar2 = u;
                if (kVar2 != null) {
                    kVar2.m();
                    u = null;
                }
                try {
                    k kVar3 = new k(i10, str2, d);
                    u = kVar3;
                    o10 o10Var = o10.getInstance();
                    if (o10Var != null) {
                        o10Var.addListener(kVar3);
                    }
                    kVar3.h.execute(new g(kVar3, 1));
                    AndroidUtilities.runOnUIThread(new g(kVar3, 2));
                    return u.g.getLocalPort();
                } catch (Exception e) {
                    FileLog.e(e);
                    k kVar4 = u;
                    if (kVar4 != null) {
                        kVar4.m();
                        u = null;
                    }
                    return 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void l() {
        synchronized (t) {
            try {
                k kVar = u;
                if (kVar != null) {
                    kVar.m();
                    u = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(j jVar, boolean z10) {
        synchronized (this.a) {
            try {
                if (this.k.get(Integer.valueOf(jVar.a)) != jVar) {
                    return;
                }
                this.k.remove(Integer.valueOf(jVar.a));
                boolean z11 = z10 && this.o && jVar.e;
                this.a.notifyAll();
                try {
                    jVar.b.close();
                } catch (Exception unused) {
                }
                if (z11) {
                    j(3, jVar.a, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        WebView webView = this.m;
        this.m = null;
        this.n = null;
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

    public final void f() {
        synchronized (this.a) {
            if (!this.p && !this.q) {
                this.q = true;
                int i10 = 0;
                this.o = false;
                this.n = null;
                this.l.clear();
                this.r = 0;
                ArrayList arrayList = new ArrayList(this.k.values());
                this.k.clear();
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
            if (!"tproxy-android-init".equals(optString) || jSONObject.optInt("v") != 1 || !this.f.equals(jSONObject.optString("nonce"))) {
                if ("close".equals(optString) || "failed".equals(jSONObject.optString("state"))) {
                    f();
                    return;
                }
                return;
            }
            synchronized (this.a) {
                if (!this.p && this.n == null) {
                    this.n = hVar;
                    j(16, 0, new byte[]{1});
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void j(int i10, int i11, byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        byte[] array = ByteBuffer.allocate(bArr.length + 8).put((byte) i10).put((byte) (i11 >> 16)).put((byte) (i11 >> 8)).put((byte) i11).putInt(bArr.length).put(bArr).array();
        synchronized (this.a) {
            if (!this.p && this.l.size() < 8192 && this.r <= 67108864 - array.length) {
                this.l.add(array);
                this.r += array.length;
                AndroidUtilities.runOnUIThread(new g(this, 4));
                return;
            }
            f();
        }
    }

    public final void m() {
        synchronized (this.a) {
            try {
                if (this.p) {
                    return;
                }
                this.p = true;
                int i10 = 0;
                this.o = false;
                this.q = false;
                ArrayList arrayList = new ArrayList(this.k.values());
                this.k.clear();
                this.l.clear();
                this.r = 0;
                this.a.notifyAll();
                try {
                    this.g.close();
                } catch (Exception unused) {
                }
                o10 o10Var = o10.getInstance();
                if (o10Var != null) {
                    o10Var.removeListener(this);
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
                this.h.shutdownNow();
                this.i.shutdownNow();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.telegram.ui.Components.n10
    public final void onBecameForeground() {
        AndroidUtilities.runOnUIThread(new g(this, 2));
    }

    @Override // org.telegram.ui.Components.n10
    public final void onBecameBackground() {
    }
}
