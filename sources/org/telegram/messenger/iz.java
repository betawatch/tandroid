package org.telegram.messenger;

import android.app.ActivityManager;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import j$.util.Objects;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public abstract class iz {
    public static boolean A = false;
    public static boolean A0 = false;
    public static boolean A1 = false;
    public static int B = 0;
    public static boolean B0 = false;
    public static hz B1 = null;
    public static boolean C = false;
    public static boolean C0 = false;
    public static Boolean C1 = null;
    public static boolean D = false;
    public static boolean D0 = false;
    public static boolean D1 = false;
    public static int E = 0;
    public static boolean E0 = false;
    public static boolean F = false;
    public static boolean F0 = false;
    public static int G = 0;
    public static boolean G0 = false;
    public static int H = 0;
    public static boolean H0 = false;
    public static int I = 0;
    public static boolean I0 = false;
    public static int J = 0;
    public static boolean J0 = false;
    public static int K = 0;
    public static boolean K0 = false;
    public static long L = 0;
    public static boolean L0 = false;
    public static int M = 0;
    public static boolean M0 = false;
    public static long N = 0;
    public static boolean N0 = false;
    public static int O = 0;
    public static boolean O0 = false;
    public static boolean P = false;
    public static boolean P0 = false;
    public static boolean Q = false;
    public static boolean Q0 = false;
    public static boolean R = false;
    public static boolean R0 = false;
    public static int S = 0;
    public static int S0 = 0;
    public static boolean T = false;
    public static boolean T0 = false;
    public static boolean U = false;
    public static boolean U0 = false;
    public static boolean V = false;
    public static boolean V0 = false;
    public static boolean W = false;
    public static int W0 = 0;
    public static boolean X = false;
    public static boolean X0 = false;
    public static boolean Y = false;
    public static int Y0 = 0;
    public static Boolean Z = null;
    public static int Z0 = 0;
    public static int a = -1;
    public static boolean a0;
    public static boolean a1;
    public static boolean b;
    public static boolean b0;
    public static int b1;
    public static Boolean c;
    public static boolean c0;
    public static int c1;
    public static String d;
    public static boolean d0;
    public static int d1;
    public static final HashSet e;
    public static int e0;
    public static int e1;
    public static int f;
    public static int f0;
    public static int f1;
    public static String g;
    public static boolean g0;
    public static boolean g1;
    public static String h;
    public static String h0;
    public static boolean h1;
    public static long i;
    public static String i0;
    public static boolean i1;
    public static long j;
    public static HashMap j0;
    public static TLRPC.TL_help_appUpdate j1;
    public static boolean k;
    public static int k0;
    public static int k1;
    public static byte[] l;
    public static boolean l0;
    public static long l1;
    public static byte[] m;
    public static final Object m0;
    public static boolean m1;
    public static boolean n;
    public static final Object n0;
    public static int n1;
    public static boolean o;
    public static int o0;
    public static int o1;
    public static boolean p;
    public static int p0;
    public static boolean p1;
    public static String q;
    public static final boolean q0;
    public static boolean q1;
    public static int r;
    public static boolean r0;
    public static int r1;
    public static String s;
    public static boolean s0;
    public static int s1;
    public static long t;
    public static boolean t0;
    public static int t1;
    public static long u;
    public static boolean u0;
    public static int u1;
    public static int v;
    public static boolean v0;
    public static int v1;
    public static byte[] w;
    public static boolean w0;
    public static boolean w1;
    public static boolean x;
    public static boolean x0;
    public static boolean x1;
    public static int y;
    public static boolean y0;
    public static final int[] y1;
    public static boolean z;
    public static boolean z0;
    public static final ArrayList z1;

    static {
        HashSet hashSet = new HashSet();
        e = hashSet;
        hashSet.add("c2.exynos.hevc.encoder");
        hashSet.add("OMX.Exynos.HEVC.Encoder".toLowerCase());
        f = 2;
        g = "";
        h = "";
        s = "";
        w = new byte[0];
        y = 3600;
        D = true;
        G = 1;
        X = true;
        c0 = true;
        e0 = 2;
        f0 = -210000;
        g0 = true;
        i0 = "";
        m0 = new Object();
        n0 = new Object();
        o0 = 2;
        p0 = 0;
        q0 = Build.VERSION.SDK_INT >= 30;
        r0 = false;
        s0 = true;
        t0 = true;
        u0 = false;
        v0 = true;
        w0 = false;
        x0 = true;
        y0 = true;
        z0 = true;
        A0 = false;
        B0 = true;
        C0 = false;
        D0 = false;
        E0 = true;
        F0 = false;
        G0 = false;
        H0 = false;
        K0 = true;
        Q0 = true;
        R0 = false;
        W0 = 16;
        Y0 = 17;
        Z0 = 16;
        t1 = 3;
        u1 = 3;
        v1 = 3;
        y1 = new int[]{-1775228513, 802464304, 802464333, 802464302, 2067362118, 2067362060, 2067362084, 2067362241, 2067362117, 2067361998, -1853602818};
        t();
        z1 = new ArrayList();
        D1 = true;
    }

    public static void A(int i7) {
        G = i7;
        SharedPreferences.Editor edit = qp.e1().edit();
        edit.putInt("keep_media", G);
        edit.apply();
    }

    public static void B(int i7) {
        if (t1 != i7) {
            t1 = i7;
            t0.b.getSharedPreferences("mainconfig", 0).edit().putInt("mediaColumnsCount", t1).apply();
        }
    }

    public static void C(boolean z9) {
        w1 = z9;
        SharedPreferences.Editor edit = qp.e1().edit();
        edit.putBoolean("multipleReactionsPromoShowed", w1);
        edit.apply();
    }

    public static void D(boolean z9) {
        if (A0 == z9) {
            return;
        }
        A0 = z9;
        SharedPreferences.Editor edit = qp.e1().edit();
        edit.putBoolean("noSoundHintShowed", A0);
        edit.apply();
    }

    public static void E(int i7) {
        S0 = i7;
        if (i7 < 0 || i7 > 2) {
            S0 = 0;
        }
        SharedPreferences.Editor edit = qp.e1().edit();
        edit.putInt("repeatMode", S0);
        edit.apply();
    }

    public static void F(int i7) {
        if (u1 != i7) {
            u1 = i7;
            t0.b.getSharedPreferences("mainconfig", 0).edit().putInt("storiesColumnsCount", u1).apply();
        }
    }

    public static void G(boolean z9) {
        U = z9;
        SharedPreferences.Editor edit = qp.e1().edit();
        edit.putBoolean("storiesIntroShown", U);
        edit.apply();
    }

    public static void H(boolean z9) {
        T = z9;
        SharedPreferences.Editor edit = qp.e1().edit();
        edit.putBoolean("storyReactionsLongPressHint", T);
        edit.apply();
    }

    public static void I(int i7) {
        E = i7;
        SharedPreferences.Editor edit = qp.e1().edit();
        edit.putInt("suggestStickers", E);
        edit.apply();
    }

    public static void J() {
        v0 = !v0;
        SharedPreferences.Editor edit = qp.e1().edit();
        edit.putBoolean("adaptableBrowser", v0);
        edit.apply();
    }

    public static void K() {
        J0 = !J0;
        WebView.setWebContentsDebuggingEnabled(J0);
        SharedPreferences.Editor edit = qp.e1().edit();
        edit.putBoolean("debugWebView", J0);
        edit.apply();
    }

    public static void L() {
        d0 = !d0;
        t0.b.getSharedPreferences("mainconfig", 0).edit().putBoolean("payByInvoice", d0).apply();
    }

    public static void M() {
        c0 = !c0;
        t0.b.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoViewerBlur", c0).apply();
    }

    public static void N() {
        Y = !Y;
        t0.b.getSharedPreferences("mainconfig", 0).edit().putBoolean("bigCameraForRound", Y).apply();
    }

    public static void O() {
        b0 = !b0;
        t0.b.getSharedPreferences("mainconfig", 0).edit().putBoolean("useSurfaceInStories", b0).apply();
    }

    public static void P() {
        SharedPreferences.Editor edit = qp.e1().edit();
        boolean z9 = !X;
        X = z9;
        edit.putBoolean("updateStickersOrderOnSend", z9);
        edit.apply();
    }

    public static void Q(int i7) {
        SharedPreferences.Editor edit = t0.b.getSharedPreferences("mainconfig", 0).edit();
        boolean z9 = !s(i7);
        Z = Boolean.valueOf(z9);
        edit.putBoolean("useCamera2Force_2", z9).apply();
    }

    public static void R() {
        a0 = !a0;
        t0.b.getSharedPreferences("mainconfig", 0).edit().putBoolean("useNewBlur", a0).apply();
    }

    public static void S(int i7) {
        c1 = i7;
        t0.b.getSharedPreferences("mainconfig", 0).edit().putInt("messageSeenCount", c1).apply();
    }

    public static void T(int i7) {
        e0 = i7;
        t0.b.getSharedPreferences("mainconfig", 0).edit().putInt("stealthModeSendMessageConfirm", e0).apply();
    }

    public static boolean U(String str, String str2) {
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        for (int i7 = 0; i7 < Math.min(split.length, split2.length); i7++) {
            int parseInt = Integer.parseInt(split[i7]);
            int parseInt2 = Integer.parseInt(split2[i7]);
            if (parseInt < parseInt2) {
                return false;
            }
            if (parseInt > parseInt2) {
                return true;
            }
        }
        return true;
    }

    public static hz a(hz hzVar) {
        u();
        ArrayList arrayList = z1;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            hz hzVar2 = (hz) arrayList.get(i7);
            if (Objects.equals(hzVar.a, hzVar2.a)) {
                return hzVar2;
            }
        }
        arrayList.add(0, hzVar);
        z();
        return hzVar;
    }

    public static boolean b() {
        if (c == null) {
            int codecCount = MediaCodecList.getCodecCount();
            int i7 = 0;
            for (int i10 = 0; i10 < codecCount; i10++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
                if (!codecInfoAt.isEncoder()) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= codecInfoAt.getSupportedTypes().length) {
                            break;
                        }
                        if (codecInfoAt.getSupportedTypes()[i11].contains("video/hevc")) {
                            int maxSupportedInstances = codecInfoAt.getCapabilitiesForType("video/hevc").getMaxSupportedInstances();
                            if (maxSupportedInstances > i7) {
                                i7 = maxSupportedInstances;
                            }
                        } else {
                            i11++;
                        }
                    }
                }
            }
            c = Boolean.valueOf(i7 >= 8);
        }
        return c.booleanValue();
    }

    public static boolean c() {
        if (C1 == null) {
            C1 = Boolean.valueOf(qp.e1().getBoolean("view_animations", true));
        }
        return C1.booleanValue();
    }

    public static int d() {
        try {
            return t0.b.getPackageManager().getPackageInfo(t0.b.getPackageName(), 0).versionCode;
        } catch (Exception e10) {
            a8.g(e10, true);
            return 0;
        }
    }

    public static boolean e() {
        if (o() >= (Build.VERSION.SDK_INT >= 31 ? 1 : 2)) {
            return true;
        }
        boolean z9 = r2.a;
        return false;
    }

    public static boolean f() {
        return e() && rc.e(256);
    }

    public static boolean g(String str) {
        if (w.length != 0) {
            try {
                byte[] bytes = str.getBytes("UTF-8");
                int length = bytes.length + 32;
                byte[] bArr = new byte[length];
                System.arraycopy(w, 0, bArr, 0, 16);
                System.arraycopy(bytes, 0, bArr, 16, bytes.length);
                System.arraycopy(w, 0, bArr, bytes.length + 16, 16);
                return s.equals(Utilities.f(Utilities.o(length, bArr)));
            } catch (Exception e10) {
                a8.g(e10, true);
                return false;
            }
        }
        boolean equals = Utilities.a(str).equals(s);
        if (equals) {
            try {
                w = new byte[16];
                Utilities.b.nextBytes(w);
                byte[] bytes2 = str.getBytes("UTF-8");
                int length2 = bytes2.length + 32;
                byte[] bArr2 = new byte[length2];
                System.arraycopy(w, 0, bArr2, 0, 16);
                System.arraycopy(bytes2, 0, bArr2, 16, bytes2.length);
                System.arraycopy(w, 0, bArr2, bytes2.length + 16, 16);
                s = Utilities.f(Utilities.o(length2, bArr2));
                y();
                return equals;
            } catch (Exception e11) {
                a8.g(e11, true);
            }
        }
        return equals;
    }

    public static void h(File file) {
        if (file == null || h0 == null || b || !file.getPath().startsWith(h0)) {
            return;
        }
        g0.h3(new pd(8));
    }

    public static void i(hz hzVar) {
        if (B1 == hzVar) {
            B1 = null;
            SharedPreferences e12 = qp.e1();
            boolean z9 = e12.getBoolean("proxy_enabled", false);
            SharedPreferences.Editor edit = e12.edit();
            edit.putString("proxy_ip", "");
            edit.putString("proxy_pass", "");
            edit.putString("proxy_user", "");
            edit.putString("proxy_secret", "");
            edit.putInt("proxy_type", 0);
            edit.putInt("proxy_port", 1080);
            edit.putBoolean("proxy_enabled", false);
            edit.apply();
            if (z9) {
                ConnectionsManager.setProxySettings(false, null);
            }
        }
        z1.remove(hzVar);
        z();
    }

    public static boolean j() {
        return o() >= 2;
    }

    public static boolean k(boolean z9) {
        if (s0) {
            return !z9 || r0;
        }
        return false;
    }

    public static String l() {
        if (d == null) {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i7 = 0; i7 < codecCount; i7++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i7);
                if (codecInfoAt.isEncoder()) {
                    for (int i10 = 0; i10 < codecInfoAt.getSupportedTypes().length; i10++) {
                        if (codecInfoAt.getSupportedTypes()[i10].contains("video/hevc") && codecInfoAt.isHardwareAccelerated()) {
                            boolean z9 = r2.a;
                            if (e.contains(codecInfoAt.getName().toLowerCase())) {
                                String name = codecInfoAt.getName();
                                d = name;
                                return name;
                            }
                        }
                    }
                }
            }
            d = "";
        }
        if (TextUtils.isEmpty(d)) {
            return null;
        }
        return d;
    }

    public static int m(int i7) {
        int i10 = r1;
        if (i10 < 0) {
            return !qp.s1(i7).P0.isEmpty() ? 5 : 2;
        }
        if (i10 == 5 && qp.s1(i7).P0.isEmpty()) {
            return 2;
        }
        return r1;
    }

    public static HashMap n() {
        if (j0 == null) {
            j0 = new HashMap();
            try {
                JSONObject jSONObject = new JSONObject(i0);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    j0.put(next.toUpperCase(), jSONObject.getString(next).toUpperCase());
                }
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
        return j0;
    }

    public static int o() {
        int i7 = o1;
        if (i7 != -1) {
            return i7;
        }
        if (n1 == -1) {
            n1 = v();
        }
        return n1;
    }

    public static int p() {
        int i7;
        synchronized (n0) {
            i7 = f0;
            f0 = i7 - 1;
        }
        return i7;
    }

    public static SharedPreferences q() {
        return t0.b.getSharedPreferences("userconfing", 0);
    }

    public static void r() {
        int i7 = v + 1;
        v = i7;
        if (i7 >= 3) {
            if (i7 == 3) {
                t = 5000L;
            } else if (i7 == 4) {
                t = 10000L;
            } else if (i7 == 5) {
                t = 15000L;
            } else if (i7 == 6) {
                t = 20000L;
            } else if (i7 != 7) {
                t = 30000L;
            } else {
                t = 25000L;
            }
            u = SystemClock.elapsedRealtime();
        }
        y();
    }

    public static boolean s(int i7) {
        Boolean bool = Z;
        return bool == null ? !qp.s1(i7).M5 : bool.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0238 A[Catch: all -> 0x00eb, TryCatch #3 {all -> 0x00eb, Exception -> 0x015b, blocks: (B:4:0x0003, B:6:0x0007, B:9:0x000d, B:11:0x00e4, B:12:0x00ee, B:14:0x00f6, B:16:0x00fa, B:17:0x0107, B:19:0x0115, B:20:0x0120, B:22:0x012c, B:24:0x0134, B:26:0x0146, B:27:0x015d, B:62:0x0161, B:65:0x0173, B:67:0x0180, B:69:0x0186, B:70:0x0188, B:72:0x018c, B:74:0x0192, B:76:0x0198, B:77:0x019b, B:80:0x017a, B:29:0x01aa, B:31:0x0209, B:34:0x0214, B:36:0x0238, B:38:0x023c, B:43:0x0254, B:45:0x02ab, B:46:0x02ad, B:49:0x0464, B:52:0x0471, B:53:0x04d1, B:57:0x045a, B:85:0x01a7, B:86:0x011c, B:87:0x04d3), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02ab A[Catch: all -> 0x00eb, TryCatch #3 {all -> 0x00eb, Exception -> 0x015b, blocks: (B:4:0x0003, B:6:0x0007, B:9:0x000d, B:11:0x00e4, B:12:0x00ee, B:14:0x00f6, B:16:0x00fa, B:17:0x0107, B:19:0x0115, B:20:0x0120, B:22:0x012c, B:24:0x0134, B:26:0x0146, B:27:0x015d, B:62:0x0161, B:65:0x0173, B:67:0x0180, B:69:0x0186, B:70:0x0188, B:72:0x018c, B:74:0x0192, B:76:0x0198, B:77:0x019b, B:80:0x017a, B:29:0x01aa, B:31:0x0209, B:34:0x0214, B:36:0x0238, B:38:0x023c, B:43:0x0254, B:45:0x02ab, B:46:0x02ad, B:49:0x0464, B:52:0x0471, B:53:0x04d1, B:57:0x045a, B:85:0x01a7, B:86:0x011c, B:87:0x04d3), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x045a A[Catch: all -> 0x00eb, TryCatch #3 {all -> 0x00eb, Exception -> 0x015b, blocks: (B:4:0x0003, B:6:0x0007, B:9:0x000d, B:11:0x00e4, B:12:0x00ee, B:14:0x00f6, B:16:0x00fa, B:17:0x0107, B:19:0x0115, B:20:0x0120, B:22:0x012c, B:24:0x0134, B:26:0x0146, B:27:0x015d, B:62:0x0161, B:65:0x0173, B:67:0x0180, B:69:0x0186, B:70:0x0188, B:72:0x018c, B:74:0x0192, B:76:0x0198, B:77:0x019b, B:80:0x017a, B:29:0x01aa, B:31:0x0209, B:34:0x0214, B:36:0x0238, B:38:0x023c, B:43:0x0254, B:45:0x02ab, B:46:0x02ad, B:49:0x0464, B:52:0x0471, B:53:0x04d1, B:57:0x045a, B:85:0x01a7, B:86:0x011c, B:87:0x04d3), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0180 A[Catch: all -> 0x00eb, Exception -> 0x015b, Merged into TryCatch #3 {all -> 0x00eb, Exception -> 0x015b, blocks: (B:4:0x0003, B:6:0x0007, B:9:0x000d, B:11:0x00e4, B:12:0x00ee, B:14:0x00f6, B:16:0x00fa, B:17:0x0107, B:19:0x0115, B:20:0x0120, B:22:0x012c, B:24:0x0134, B:26:0x0146, B:27:0x015d, B:62:0x0161, B:65:0x0173, B:67:0x0180, B:69:0x0186, B:70:0x0188, B:72:0x018c, B:74:0x0192, B:76:0x0198, B:77:0x019b, B:80:0x017a, B:29:0x01aa, B:31:0x0209, B:34:0x0214, B:36:0x0238, B:38:0x023c, B:43:0x0254, B:45:0x02ab, B:46:0x02ad, B:49:0x0464, B:52:0x0471, B:53:0x04d1, B:57:0x045a, B:85:0x01a7, B:86:0x011c, B:87:0x04d3), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0186 A[Catch: all -> 0x00eb, Exception -> 0x015b, Merged into TryCatch #3 {all -> 0x00eb, Exception -> 0x015b, blocks: (B:4:0x0003, B:6:0x0007, B:9:0x000d, B:11:0x00e4, B:12:0x00ee, B:14:0x00f6, B:16:0x00fa, B:17:0x0107, B:19:0x0115, B:20:0x0120, B:22:0x012c, B:24:0x0134, B:26:0x0146, B:27:0x015d, B:62:0x0161, B:65:0x0173, B:67:0x0180, B:69:0x0186, B:70:0x0188, B:72:0x018c, B:74:0x0192, B:76:0x0198, B:77:0x019b, B:80:0x017a, B:29:0x01aa, B:31:0x0209, B:34:0x0214, B:36:0x0238, B:38:0x023c, B:43:0x0254, B:45:0x02ab, B:46:0x02ad, B:49:0x0464, B:52:0x0471, B:53:0x04d1, B:57:0x045a, B:85:0x01a7, B:86:0x011c, B:87:0x04d3), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void t() {
        SharedPreferences sharedPreferences;
        int i7;
        int i10;
        String str;
        String str2;
        PackageInfo packageInfo;
        synchronized (m0) {
            try {
            } catch (Exception e10) {
                a8.g(e10, true);
            } finally {
            }
            if (!l0 && t0.b != null) {
                as.j = t0.b.getSharedPreferences("background_activity", 0);
                SharedPreferences sharedPreferences2 = t0.b.getSharedPreferences("userconfing", 0);
                z = sharedPreferences2.getBoolean("saveIncomingPhotos", false);
                s = sharedPreferences2.getString("passcodeHash1", "");
                x = sharedPreferences2.getBoolean("appLocked", false);
                r = sharedPreferences2.getInt("passcodeType", 0);
                t = sharedPreferences2.getLong("passcodeRetryInMs", 0L);
                u = sharedPreferences2.getLong("lastUptimeMillis", 0L);
                v = sharedPreferences2.getInt("badPasscodeTries", 0);
                y = sharedPreferences2.getInt("autoLockIn", 3600);
                B = sharedPreferences2.getInt("lastPauseTime", 0);
                D = sharedPreferences2.getBoolean("useFingerprint", true);
                g0 = sharedPreferences2.getBoolean("walletUseFingerprintLock", true);
                A = sharedPreferences2.getBoolean("allowScreenCapture", false);
                f0 = sharedPreferences2.getInt("lastLocalId", -210000);
                g = sharedPreferences2.getString("pushString2", "");
                f = sharedPreferences2.getInt("pushType", 2);
                k = sharedPreferences2.getBoolean("pushStatSent", false);
                i0 = sharedPreferences2.getString("passportConfigJson", "");
                k0 = sharedPreferences2.getInt("passportConfigHash", 0);
                Boolean bool = null;
                h0 = sharedPreferences2.getString("storageCacheDir", null);
                a1 = sharedPreferences2.getBoolean("proxyRotationEnabled", false);
                b1 = sharedPreferences2.getInt("proxyRotationTimeout", 1);
                String string = sharedPreferences2.getString("pushAuthKey", null);
                if (!TextUtils.isEmpty(string)) {
                    l = Base64.decode(string, 0);
                }
                if (s.length() > 0 && B == 0) {
                    B = (int) ((SystemClock.elapsedRealtime() / 1000) - 600);
                }
                String string2 = sharedPreferences2.getString("passcodeSalt", "");
                if (string2.length() > 0) {
                    w = Base64.decode(string2, 0);
                } else {
                    w = new byte[0];
                }
                l1 = sharedPreferences2.getLong("appUpdateCheckTime", System.currentTimeMillis());
                String string3 = sharedPreferences2.getString("appUpdate", null);
                if (string3 != null) {
                    k1 = sharedPreferences2.getInt("appUpdateBuild", d());
                    byte[] decode = Base64.decode(string3, 0);
                    if (decode != null) {
                        SerializedData serializedData = new SerializedData(decode);
                        j1 = (TLRPC.TL_help_appUpdate) TLRPC.help_AppUpdate.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                        serializedData.cleanup();
                    }
                }
                if (j1 != null) {
                    try {
                        packageInfo = t0.b.getPackageManager().getPackageInfo(t0.b.getPackageName(), 0);
                        i10 = packageInfo.versionCode;
                    } catch (Exception e11) {
                        e = e11;
                        i10 = 0;
                    }
                    try {
                        str = packageInfo.versionName;
                    } catch (Exception e12) {
                        e = e12;
                        a8.g(e, true);
                        str = null;
                        if (i10 == 0) {
                        }
                        if (str == null) {
                        }
                        if (k1 == i10) {
                        }
                        j1 = null;
                        g0.h3(new pd(6));
                        sharedPreferences = t0.b.getSharedPreferences("mainconfig", 0);
                        b6.i(sharedPreferences);
                        o0 = sharedPreferences.getInt("mapPreviewType", 2);
                        p0 = sharedPreferences.getInt("searchEngineType", 0);
                        s0 = sharedPreferences.getBoolean("raise_to_listen", true);
                        r0 = sharedPreferences.getBoolean("raise_to_speak", false);
                        t0 = sharedPreferences.getBoolean("next_media_on_tap", true);
                        u0 = sharedPreferences.getBoolean("record_via_sco", false);
                        v0 = sharedPreferences.getBoolean("adaptableBrowser", false);
                        boolean z9 = r2.a;
                        w0 = sharedPreferences.getBoolean("onlyLocalInstantView", false);
                        x0 = sharedPreferences.getBoolean("direct_share", true);
                        boolean z10 = sharedPreferences.getBoolean("shuffleMusic", false);
                        N0 = z10;
                        O0 = z10 && sharedPreferences.getBoolean("playOrderReversed", false);
                        y0 = sharedPreferences.getBoolean("inappCamera", true);
                        P0 = sharedPreferences.contains("cameraCache");
                        z0 = true;
                        S0 = sharedPreferences.getInt("repeatMode", 0);
                        if (g0.Q1()) {
                        }
                        i7 = 16;
                        W0 = sharedPreferences.getInt("fons_size", i7);
                        X0 = !sharedPreferences.contains("fons_size");
                        Y0 = sharedPreferences.getInt("bubbleRadius", 17);
                        Z0 = sharedPreferences.getInt("iv_font_size", W0);
                        T0 = sharedPreferences.getBoolean("allowBigEmoji", true);
                        U0 = sharedPreferences.getBoolean("useSystemEmoji", false);
                        V0 = sharedPreferences.getBoolean("useSystemBoldFont", false);
                        n = sharedPreferences.getBoolean("forceForumTabs", false);
                        o = sharedPreferences.getBoolean("fastWallpaperDisabled", false);
                        p = sharedPreferences.getBoolean("frameMetricsEnabled", false);
                        if (V0) {
                        }
                        B0 = sharedPreferences.getBoolean("streamMedia", true);
                        E0 = sharedPreferences.getBoolean("saveStreamMedia", true);
                        F0 = sharedPreferences.getBoolean("pauseMusicOnRecord", true);
                        G0 = sharedPreferences.getBoolean("pauseMusicOnMedia", false);
                        H0 = sharedPreferences.getBoolean("compactMode", false);
                        W = sharedPreferences.getBoolean("forceDisableTabletMode", false);
                        C0 = sharedPreferences.getBoolean("streamAllVideo", true);
                        D0 = sharedPreferences.getBoolean("streamMkv", false);
                        E = sharedPreferences.getInt("suggestStickers", 0);
                        F = sharedPreferences.getBoolean("suggestAnimatedEmoji", true);
                        o1 = sharedPreferences.getInt("overrideDevicePerformanceClass", -1);
                        n1 = sharedPreferences.getInt("devicePerformanceClass", -1);
                        L0 = sharedPreferences.getBoolean("sortContactsByName", false);
                        M0 = sharedPreferences.getBoolean("sortFilesByName", false);
                        A0 = sharedPreferences.getBoolean("noSoundHintShowed", false);
                        q = sharedPreferences.getString("directShareHash2", null);
                        p1 = sharedPreferences.getBoolean("useThreeLinesLayout", false);
                        q1 = sharedPreferences.getBoolean("archiveHidden", false);
                        s1 = sharedPreferences.getInt("distanceSystemType", 0);
                        G = sharedPreferences.getInt("keep_media", 1);
                        J0 = sharedPreferences.getBoolean("debugWebView", false);
                        K0 = sharedPreferences.getBoolean("widgetStaticLayers", true);
                        H = sharedPreferences.getInt("lastKeepMediaCheckTime", 0);
                        I = sharedPreferences.getInt("lastLogsCheckTime", 0);
                        sharedPreferences.getBoolean("searchMessagesAsListUsed", false);
                        R = sharedPreferences.getBoolean("stickersReorderingHintUsed", false);
                        T = sharedPreferences.getBoolean("storyReactionsLongPressHint", false);
                        U = sharedPreferences.getBoolean("storiesIntroShown", false);
                        J = sharedPreferences.getInt("textSelectionHintShows", 0);
                        K = sharedPreferences.getInt("scheduledOrNoSoundHintShows", 0);
                        L = sharedPreferences.getLong("scheduledOrNoSoundHintSeenAt", 0L);
                        M = sharedPreferences.getInt("scheduledHintShows", 0);
                        N = sharedPreferences.getLong("scheduledHintSeenAt", 0L);
                        P = sharedPreferences.getBoolean("forwardingOptionsHintShown", false);
                        Q = sharedPreferences.getBoolean("replyingOptionsHintShown", false);
                        O = sharedPreferences.getInt("lockRecordAudioVideoHint", 0);
                        V = sharedPreferences.getBoolean("disableVoiceAudioEffects", false);
                        I0 = sharedPreferences.getBoolean("noiseSupression", false);
                        r1 = sharedPreferences.getInt("ChatSwipeAction", -1);
                        c1 = sharedPreferences.getInt("messageSeenCount", 3);
                        d1 = sharedPreferences.getInt("emojiInteractionsHintCount", 3);
                        e1 = sharedPreferences.getInt("dayNightThemeSwitchHintCount", 3);
                        e0 = sharedPreferences.getInt("stealthModeSendMessageConfirm", 2);
                        t1 = sharedPreferences.getInt("mediaColumnsCount", 3);
                        u1 = sharedPreferences.getInt("storiesColumnsCount", 3);
                        v1 = sharedPreferences.getInt("fastScrollHintCount", 3);
                        sharedPreferences.getBoolean("dontAskManageStorage", false);
                        m1 = sharedPreferences.getBoolean("hasEmailLogin", false);
                        x1 = sharedPreferences.getBoolean("floatingDebugActive", false);
                        X = sharedPreferences.getBoolean("updateStickersOrderOnSend", true);
                        S = sharedPreferences.getInt("dayNightWallpaperSwitchHint", 0);
                        Y = sharedPreferences.getBoolean("bigCameraForRound", false);
                        a0 = sharedPreferences.getBoolean("useNewBlur", true);
                        if (sharedPreferences.contains("useCamera2Force_2")) {
                        }
                        Z = bool;
                        b0 = sharedPreferences.getBoolean("useSurfaceInStories", Build.VERSION.SDK_INT >= 30);
                        d0 = sharedPreferences.getBoolean("payByInvoice", false);
                        c0 = sharedPreferences.getBoolean("photoViewerBlur", true);
                        w1 = sharedPreferences.getBoolean("multipleReactionsPromoShowed", false);
                        f1 = sharedPreferences.getInt("callEncryptionHintDisplayedCount", 0);
                        R0 = sharedPreferences.getBoolean("debugVideoQualities", false);
                        g1 = sharedPreferences.getBoolean("debugViewMetrics", false);
                        h1 = sharedPreferences.getBoolean("photoHighQualityDefault", false);
                        i1 = sharedPreferences.getBoolean("photoLiveDefault", false);
                        D1 = sharedPreferences.getBoolean("drawActionBarShadow", true);
                        Q0 = t0.b.getSharedPreferences("Notifications", 0).getBoolean("AllAccounts", true);
                        l0 = true;
                    }
                    if (i10 == 0) {
                        i10 = d();
                    }
                    if (str == null) {
                        str = r2.c;
                    }
                    if (k1 == i10 || (str2 = j1.version) == null || str.compareTo(str2) >= 0) {
                        j1 = null;
                        g0.h3(new pd(6));
                    } else {
                        boolean z11 = r2.a;
                    }
                }
                sharedPreferences = t0.b.getSharedPreferences("mainconfig", 0);
                b6.i(sharedPreferences);
                o0 = sharedPreferences.getInt("mapPreviewType", 2);
                p0 = sharedPreferences.getInt("searchEngineType", 0);
                s0 = sharedPreferences.getBoolean("raise_to_listen", true);
                r0 = sharedPreferences.getBoolean("raise_to_speak", false);
                t0 = sharedPreferences.getBoolean("next_media_on_tap", true);
                u0 = sharedPreferences.getBoolean("record_via_sco", false);
                v0 = sharedPreferences.getBoolean("adaptableBrowser", false);
                boolean z92 = r2.a;
                w0 = sharedPreferences.getBoolean("onlyLocalInstantView", false);
                x0 = sharedPreferences.getBoolean("direct_share", true);
                boolean z102 = sharedPreferences.getBoolean("shuffleMusic", false);
                N0 = z102;
                O0 = z102 && sharedPreferences.getBoolean("playOrderReversed", false);
                y0 = sharedPreferences.getBoolean("inappCamera", true);
                P0 = sharedPreferences.contains("cameraCache");
                z0 = true;
                S0 = sharedPreferences.getInt("repeatMode", 0);
                if (g0.Q1()) {
                    if (!(t0.b != null && t0.b.getPackageManager().hasSystemFeature("android.hardware.sensor.hinge_angle"))) {
                        i7 = 18;
                        W0 = sharedPreferences.getInt("fons_size", i7);
                        X0 = !sharedPreferences.contains("fons_size");
                        Y0 = sharedPreferences.getInt("bubbleRadius", 17);
                        Z0 = sharedPreferences.getInt("iv_font_size", W0);
                        T0 = sharedPreferences.getBoolean("allowBigEmoji", true);
                        U0 = sharedPreferences.getBoolean("useSystemEmoji", false);
                        V0 = sharedPreferences.getBoolean("useSystemBoldFont", false);
                        n = sharedPreferences.getBoolean("forceForumTabs", false);
                        o = sharedPreferences.getBoolean("fastWallpaperDisabled", false);
                        p = sharedPreferences.getBoolean("frameMetricsEnabled", false);
                        if (V0) {
                            g0.a = null;
                        }
                        B0 = sharedPreferences.getBoolean("streamMedia", true);
                        E0 = sharedPreferences.getBoolean("saveStreamMedia", true);
                        F0 = sharedPreferences.getBoolean("pauseMusicOnRecord", true);
                        G0 = sharedPreferences.getBoolean("pauseMusicOnMedia", false);
                        H0 = sharedPreferences.getBoolean("compactMode", false);
                        W = sharedPreferences.getBoolean("forceDisableTabletMode", false);
                        C0 = sharedPreferences.getBoolean("streamAllVideo", true);
                        D0 = sharedPreferences.getBoolean("streamMkv", false);
                        E = sharedPreferences.getInt("suggestStickers", 0);
                        F = sharedPreferences.getBoolean("suggestAnimatedEmoji", true);
                        o1 = sharedPreferences.getInt("overrideDevicePerformanceClass", -1);
                        n1 = sharedPreferences.getInt("devicePerformanceClass", -1);
                        L0 = sharedPreferences.getBoolean("sortContactsByName", false);
                        M0 = sharedPreferences.getBoolean("sortFilesByName", false);
                        A0 = sharedPreferences.getBoolean("noSoundHintShowed", false);
                        q = sharedPreferences.getString("directShareHash2", null);
                        p1 = sharedPreferences.getBoolean("useThreeLinesLayout", false);
                        q1 = sharedPreferences.getBoolean("archiveHidden", false);
                        s1 = sharedPreferences.getInt("distanceSystemType", 0);
                        G = sharedPreferences.getInt("keep_media", 1);
                        J0 = sharedPreferences.getBoolean("debugWebView", false);
                        K0 = sharedPreferences.getBoolean("widgetStaticLayers", true);
                        H = sharedPreferences.getInt("lastKeepMediaCheckTime", 0);
                        I = sharedPreferences.getInt("lastLogsCheckTime", 0);
                        sharedPreferences.getBoolean("searchMessagesAsListUsed", false);
                        R = sharedPreferences.getBoolean("stickersReorderingHintUsed", false);
                        T = sharedPreferences.getBoolean("storyReactionsLongPressHint", false);
                        U = sharedPreferences.getBoolean("storiesIntroShown", false);
                        J = sharedPreferences.getInt("textSelectionHintShows", 0);
                        K = sharedPreferences.getInt("scheduledOrNoSoundHintShows", 0);
                        L = sharedPreferences.getLong("scheduledOrNoSoundHintSeenAt", 0L);
                        M = sharedPreferences.getInt("scheduledHintShows", 0);
                        N = sharedPreferences.getLong("scheduledHintSeenAt", 0L);
                        P = sharedPreferences.getBoolean("forwardingOptionsHintShown", false);
                        Q = sharedPreferences.getBoolean("replyingOptionsHintShown", false);
                        O = sharedPreferences.getInt("lockRecordAudioVideoHint", 0);
                        V = sharedPreferences.getBoolean("disableVoiceAudioEffects", false);
                        I0 = sharedPreferences.getBoolean("noiseSupression", false);
                        r1 = sharedPreferences.getInt("ChatSwipeAction", -1);
                        c1 = sharedPreferences.getInt("messageSeenCount", 3);
                        d1 = sharedPreferences.getInt("emojiInteractionsHintCount", 3);
                        e1 = sharedPreferences.getInt("dayNightThemeSwitchHintCount", 3);
                        e0 = sharedPreferences.getInt("stealthModeSendMessageConfirm", 2);
                        t1 = sharedPreferences.getInt("mediaColumnsCount", 3);
                        u1 = sharedPreferences.getInt("storiesColumnsCount", 3);
                        v1 = sharedPreferences.getInt("fastScrollHintCount", 3);
                        sharedPreferences.getBoolean("dontAskManageStorage", false);
                        m1 = sharedPreferences.getBoolean("hasEmailLogin", false);
                        x1 = sharedPreferences.getBoolean("floatingDebugActive", false);
                        X = sharedPreferences.getBoolean("updateStickersOrderOnSend", true);
                        S = sharedPreferences.getInt("dayNightWallpaperSwitchHint", 0);
                        Y = sharedPreferences.getBoolean("bigCameraForRound", false);
                        a0 = sharedPreferences.getBoolean("useNewBlur", true);
                        if (sharedPreferences.contains("useCamera2Force_2")) {
                            bool = Boolean.valueOf(sharedPreferences.getBoolean("useCamera2Force_2", false));
                        }
                        Z = bool;
                        b0 = sharedPreferences.getBoolean("useSurfaceInStories", Build.VERSION.SDK_INT >= 30);
                        d0 = sharedPreferences.getBoolean("payByInvoice", false);
                        c0 = sharedPreferences.getBoolean("photoViewerBlur", true);
                        w1 = sharedPreferences.getBoolean("multipleReactionsPromoShowed", false);
                        f1 = sharedPreferences.getInt("callEncryptionHintDisplayedCount", 0);
                        R0 = sharedPreferences.getBoolean("debugVideoQualities", false);
                        g1 = sharedPreferences.getBoolean("debugViewMetrics", false);
                        h1 = sharedPreferences.getBoolean("photoHighQualityDefault", false);
                        i1 = sharedPreferences.getBoolean("photoLiveDefault", false);
                        D1 = sharedPreferences.getBoolean("drawActionBarShadow", true);
                        Q0 = t0.b.getSharedPreferences("Notifications", 0).getBoolean("AllAccounts", true);
                        l0 = true;
                    }
                }
                i7 = 16;
                W0 = sharedPreferences.getInt("fons_size", i7);
                X0 = !sharedPreferences.contains("fons_size");
                Y0 = sharedPreferences.getInt("bubbleRadius", 17);
                Z0 = sharedPreferences.getInt("iv_font_size", W0);
                T0 = sharedPreferences.getBoolean("allowBigEmoji", true);
                U0 = sharedPreferences.getBoolean("useSystemEmoji", false);
                V0 = sharedPreferences.getBoolean("useSystemBoldFont", false);
                n = sharedPreferences.getBoolean("forceForumTabs", false);
                o = sharedPreferences.getBoolean("fastWallpaperDisabled", false);
                p = sharedPreferences.getBoolean("frameMetricsEnabled", false);
                if (V0) {
                }
                B0 = sharedPreferences.getBoolean("streamMedia", true);
                E0 = sharedPreferences.getBoolean("saveStreamMedia", true);
                F0 = sharedPreferences.getBoolean("pauseMusicOnRecord", true);
                G0 = sharedPreferences.getBoolean("pauseMusicOnMedia", false);
                H0 = sharedPreferences.getBoolean("compactMode", false);
                W = sharedPreferences.getBoolean("forceDisableTabletMode", false);
                C0 = sharedPreferences.getBoolean("streamAllVideo", true);
                D0 = sharedPreferences.getBoolean("streamMkv", false);
                E = sharedPreferences.getInt("suggestStickers", 0);
                F = sharedPreferences.getBoolean("suggestAnimatedEmoji", true);
                o1 = sharedPreferences.getInt("overrideDevicePerformanceClass", -1);
                n1 = sharedPreferences.getInt("devicePerformanceClass", -1);
                L0 = sharedPreferences.getBoolean("sortContactsByName", false);
                M0 = sharedPreferences.getBoolean("sortFilesByName", false);
                A0 = sharedPreferences.getBoolean("noSoundHintShowed", false);
                q = sharedPreferences.getString("directShareHash2", null);
                p1 = sharedPreferences.getBoolean("useThreeLinesLayout", false);
                q1 = sharedPreferences.getBoolean("archiveHidden", false);
                s1 = sharedPreferences.getInt("distanceSystemType", 0);
                G = sharedPreferences.getInt("keep_media", 1);
                J0 = sharedPreferences.getBoolean("debugWebView", false);
                K0 = sharedPreferences.getBoolean("widgetStaticLayers", true);
                H = sharedPreferences.getInt("lastKeepMediaCheckTime", 0);
                I = sharedPreferences.getInt("lastLogsCheckTime", 0);
                sharedPreferences.getBoolean("searchMessagesAsListUsed", false);
                R = sharedPreferences.getBoolean("stickersReorderingHintUsed", false);
                T = sharedPreferences.getBoolean("storyReactionsLongPressHint", false);
                U = sharedPreferences.getBoolean("storiesIntroShown", false);
                J = sharedPreferences.getInt("textSelectionHintShows", 0);
                K = sharedPreferences.getInt("scheduledOrNoSoundHintShows", 0);
                L = sharedPreferences.getLong("scheduledOrNoSoundHintSeenAt", 0L);
                M = sharedPreferences.getInt("scheduledHintShows", 0);
                N = sharedPreferences.getLong("scheduledHintSeenAt", 0L);
                P = sharedPreferences.getBoolean("forwardingOptionsHintShown", false);
                Q = sharedPreferences.getBoolean("replyingOptionsHintShown", false);
                O = sharedPreferences.getInt("lockRecordAudioVideoHint", 0);
                V = sharedPreferences.getBoolean("disableVoiceAudioEffects", false);
                I0 = sharedPreferences.getBoolean("noiseSupression", false);
                r1 = sharedPreferences.getInt("ChatSwipeAction", -1);
                c1 = sharedPreferences.getInt("messageSeenCount", 3);
                d1 = sharedPreferences.getInt("emojiInteractionsHintCount", 3);
                e1 = sharedPreferences.getInt("dayNightThemeSwitchHintCount", 3);
                e0 = sharedPreferences.getInt("stealthModeSendMessageConfirm", 2);
                t1 = sharedPreferences.getInt("mediaColumnsCount", 3);
                u1 = sharedPreferences.getInt("storiesColumnsCount", 3);
                v1 = sharedPreferences.getInt("fastScrollHintCount", 3);
                sharedPreferences.getBoolean("dontAskManageStorage", false);
                m1 = sharedPreferences.getBoolean("hasEmailLogin", false);
                x1 = sharedPreferences.getBoolean("floatingDebugActive", false);
                X = sharedPreferences.getBoolean("updateStickersOrderOnSend", true);
                S = sharedPreferences.getInt("dayNightWallpaperSwitchHint", 0);
                Y = sharedPreferences.getBoolean("bigCameraForRound", false);
                a0 = sharedPreferences.getBoolean("useNewBlur", true);
                if (sharedPreferences.contains("useCamera2Force_2")) {
                }
                Z = bool;
                b0 = sharedPreferences.getBoolean("useSurfaceInStories", Build.VERSION.SDK_INT >= 30);
                d0 = sharedPreferences.getBoolean("payByInvoice", false);
                c0 = sharedPreferences.getBoolean("photoViewerBlur", true);
                w1 = sharedPreferences.getBoolean("multipleReactionsPromoShowed", false);
                f1 = sharedPreferences.getInt("callEncryptionHintDisplayedCount", 0);
                R0 = sharedPreferences.getBoolean("debugVideoQualities", false);
                g1 = sharedPreferences.getBoolean("debugViewMetrics", false);
                h1 = sharedPreferences.getBoolean("photoHighQualityDefault", false);
                i1 = sharedPreferences.getBoolean("photoLiveDefault", false);
                D1 = sharedPreferences.getBoolean("drawActionBarShadow", true);
                Q0 = t0.b.getSharedPreferences("Notifications", 0).getBoolean("AllAccounts", true);
                l0 = true;
            }
        }
    }

    public static void u() {
        if (A1) {
            return;
        }
        SharedPreferences sharedPreferences = t0.b.getSharedPreferences("mainconfig", 0);
        ui.a c10 = ui.a.c(sharedPreferences);
        A1 = true;
        z1.clear();
        B1 = null;
        String string = sharedPreferences.getString("proxy_list", null);
        if (!TextUtils.isEmpty(string)) {
            SerializedData serializedData = new SerializedData(Base64.decode(string, 0));
            int readInt32 = serializedData.readInt32(false);
            if (readInt32 == -1) {
                byte readByte = serializedData.readByte(false);
                if (readByte == 2 || readByte == 3) {
                    int readInt322 = serializedData.readInt32(false);
                    for (int i7 = 0; i7 < readInt322; i7++) {
                        hz a10 = hz.a(readByte, serializedData);
                        z1.add(0, a10);
                        if (B1 == null && c10.g() && c10.equals(a10.a)) {
                            B1 = a10;
                        }
                    }
                } else {
                    a8.d("Unknown proxy schema version: " + ((int) readByte));
                }
            } else {
                for (int i10 = 0; i10 < readInt32; i10++) {
                    hz a11 = hz.a(0, serializedData);
                    z1.add(0, a11);
                    if (B1 == null && c10.g() && c10.equals(a11.a)) {
                        B1 = a11;
                    }
                }
            }
            serializedData.cleanup();
        }
        if (B1 == null && c10.g()) {
            hz hzVar = new hz(c10);
            B1 = hzVar;
            z1.add(0, hzVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0017, code lost:
    
        r4 = android.os.Build.SOC_MODEL;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int v() {
        long j3;
        String str;
        int i7 = Build.VERSION.SDK_INT;
        int i10 = ConnectionsManager.CPU_COUNT;
        int memoryClass = ((ActivityManager) t0.b.getSystemService("activity")).getMemoryClass();
        int i11 = 0;
        if (i7 >= 31 && str != null) {
            int hashCode = str.toUpperCase().hashCode();
            int i12 = 0;
            while (true) {
                int[] iArr = y1;
                if (i12 >= iArr.length) {
                    break;
                }
                if (iArr[i12] == hashCode) {
                    return 0;
                }
                i12++;
            }
        }
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < i10; i15++) {
            try {
                Locale locale = Locale.ENGLISH;
                RandomAccessFile randomAccessFile = new RandomAccessFile("/sys/devices/system/cpu/cpu" + i15 + "/cpufreq/cpuinfo_max_freq", "r");
                String readLine = randomAccessFile.readLine();
                if (readLine != null) {
                    i14 += Utilities.z(readLine).intValue() / 1000;
                    i13++;
                }
                randomAccessFile.close();
            } catch (Throwable unused) {
            }
        }
        int ceil = i13 == 0 ? -1 : (int) Math.ceil(i14 / i13);
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) t0.b.getSystemService("activity")).getMemoryInfo(memoryInfo);
            j3 = memoryInfo.totalMem;
        } catch (Exception unused2) {
            j3 = -1;
        }
        if (i10 > 2 && memoryClass > 100 && ((i10 > 4 || ceil == -1 || ceil > 1250) && ((i10 > 4 || ceil > 1300 || memoryClass > 128 || i7 > 24) && (j3 == -1 || j3 >= 2147483648L)))) {
            i11 = (i10 < 8 || memoryClass <= 160 || (ceil != -1 && ceil <= 2055) || (ceil == -1 && i10 == 8 && i7 <= 23)) ? 1 : 2;
        }
        if (r2.a) {
            StringBuilder o4 = jg.g.o("device performance info selected_class = ", i11, " (cpu_count = ", i10, ", freq = ");
            jg.g.x(o4, ceil, ", memoryClass = ", memoryClass, ", android version ");
            o4.append(i7);
            o4.append(", manufacture ");
            o4.append(Build.MANUFACTURER);
            o4.append(", screenRefreshRate=");
            o4.append(g0.r);
            o4.append(", screenMaxRefreshRate=");
            o4.append(g0.s);
            o4.append(")");
            a8.b(o4.toString());
        }
        return i11;
    }

    public static void w(int i7) {
        SharedPreferences.Editor edit = qp.e1().edit();
        o1 = i7;
        edit.putInt("overrideDevicePerformanceClass", i7).remove("lite_mode").apply();
    }

    public static String x(int i7) {
        return i7 != 0 ? i7 != 1 ? i7 != 2 ? "UNKNOWN" : "HIGH" : "AVERAGE" : "LOW";
    }

    public static void y() {
        synchronized (m0) {
            try {
                try {
                    SharedPreferences.Editor edit = t0.b.getSharedPreferences("userconfing", 0).edit();
                    edit.putBoolean("saveIncomingPhotos", z);
                    edit.putString("passcodeHash1", s);
                    byte[] bArr = w;
                    edit.putString("passcodeSalt", bArr.length > 0 ? Base64.encodeToString(bArr, 0) : "");
                    edit.putBoolean("appLocked", x);
                    edit.putInt("passcodeType", r);
                    edit.putLong("passcodeRetryInMs", t);
                    edit.putLong("lastUptimeMillis", u);
                    edit.putInt("badPasscodeTries", v);
                    edit.putInt("autoLockIn", y);
                    edit.putInt("lastPauseTime", B);
                    edit.putBoolean("useFingerprint", D);
                    edit.putBoolean("walletUseFingerprintLock", g0);
                    edit.putBoolean("allowScreenCapture", A);
                    edit.putString("pushString2", g);
                    edit.putInt("pushType", f);
                    edit.putBoolean("pushStatSent", k);
                    byte[] bArr2 = l;
                    edit.putString("pushAuthKey", bArr2 != null ? Base64.encodeToString(bArr2, 0) : "");
                    edit.putInt("lastLocalId", f0);
                    edit.putString("passportConfigJson", i0);
                    edit.putInt("passportConfigHash", k0);
                    edit.putBoolean("sortContactsByName", L0);
                    edit.putBoolean("sortFilesByName", M0);
                    edit.putInt("textSelectionHintShows", J);
                    edit.putInt("scheduledOrNoSoundHintShows", K);
                    edit.putLong("scheduledOrNoSoundHintSeenAt", L);
                    edit.putInt("scheduledHintShows", M);
                    edit.putLong("scheduledHintSeenAt", N);
                    edit.putBoolean("forwardingOptionsHintShown", P);
                    edit.putBoolean("replyingOptionsHintShown", Q);
                    edit.putInt("lockRecordAudioVideoHint", O);
                    edit.putString("storageCacheDir", !TextUtils.isEmpty(h0) ? h0 : "");
                    edit.putBoolean("proxyRotationEnabled", a1);
                    edit.putInt("proxyRotationTimeout", b1);
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = j1;
                    if (tL_help_appUpdate != null) {
                        try {
                            SerializedData serializedData = new SerializedData(tL_help_appUpdate.getObjectSize());
                            j1.serializeToStream(serializedData);
                            edit.putString("appUpdate", Base64.encodeToString(serializedData.toByteArray(), 0));
                            edit.putInt("appUpdateBuild", k1);
                            serializedData.cleanup();
                        } catch (Exception unused) {
                        }
                    } else {
                        edit.remove("appUpdate");
                    }
                    edit.putLong("appUpdateCheckTime", l1);
                    edit.apply();
                    SharedPreferences.Editor edit2 = t0.b.getSharedPreferences("mainconfig", 0).edit();
                    edit2.putBoolean("hasEmailLogin", m1);
                    edit2.putBoolean("floatingDebugActive", x1);
                    edit2.putBoolean("record_via_sco", u0);
                    edit2.apply();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void z() {
        ArrayList arrayList = new ArrayList(z1);
        Collections.sort(arrayList, new vj(20));
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(-1);
        serializedData.writeByte(3);
        int size = arrayList.size();
        serializedData.writeInt32(size);
        int i7 = size - 1;
        while (true) {
            int i10 = 0;
            if (i7 < 0) {
                t0.b.getSharedPreferences("mainconfig", 0).edit().putString("proxy_list", Base64.encodeToString(serializedData.toByteArray(), 2)).apply();
                serializedData.cleanup();
                return;
            }
            hz hzVar = (hz) arrayList.get(i7);
            serializedData.writeString(hzVar.a.b);
            serializedData.writeInt32(hzVar.a.c);
            serializedData.writeString(hzVar.a.d);
            serializedData.writeString(hzVar.a.e);
            serializedData.writeString(hzVar.a.f);
            serializedData.writeInt64(hzVar.b);
            serializedData.writeInt64(hzVar.e);
            int c10 = p1.g.c(hzVar.a.a);
            if (c10 == 1) {
                i10 = 1;
            } else if (c10 == 2) {
                i10 = 2;
            }
            serializedData.writeInt32(i10);
            i7--;
        }
    }
}
