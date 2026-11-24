// default package

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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class gba {
    public static int A;
    public static boolean A0;
    public static boolean A1;
    public static boolean B;
    public static boolean B0;
    public static boolean C;
    public static boolean C0;
    public static int D;
    public static boolean D0;
    public static boolean E;
    public static boolean E0;
    public static int F;
    public static boolean F0;
    public static int G;
    public static boolean G0;
    public static int H;
    public static boolean H0;
    public static int I;
    public static boolean I0;
    public static int J;
    public static boolean J0;
    public static long K;
    public static boolean K0;
    public static int L;
    public static boolean L0;
    public static long M;
    public static boolean M0;
    public static int N;
    public static boolean N0;
    public static boolean O;
    public static boolean O0;
    public static boolean P;
    public static int P0;
    public static boolean Q;
    public static boolean Q0;
    public static int R;
    public static boolean R0;
    public static boolean S;
    public static boolean S0;
    public static boolean T;
    public static int T0;
    public static boolean U;
    public static boolean U0;
    public static boolean V;
    public static int V0;
    public static boolean W;
    public static int W0;
    public static boolean X;
    public static boolean X0;
    public static boolean Y;
    public static int Y0;
    public static boolean Z;
    public static int Z0;
    public static boolean a;
    public static boolean a0;
    public static int a1;
    public static Boolean b;
    public static int b0;
    public static int b1;
    public static String c;
    public static int c0;
    public static int c1;
    public static final HashSet d;
    public static boolean d0;
    public static boolean d1;
    public static int e;
    public static String e0;
    public static boolean e1;
    public static String f;
    public static String f0;
    public static boolean f1;
    public static String g;
    public static HashMap g0;
    public static TLRPC.TL_help_appUpdate g1;
    public static long h;
    public static int h0;
    public static int h1;
    public static long i;
    public static boolean i0;
    public static long i1;
    public static boolean j;
    public static final Object j0;
    public static boolean j1;
    public static byte[] k;
    public static final Object k0;
    public static int k1;
    public static byte[] l;
    public static int l0;
    public static int l1;
    public static boolean m;
    public static int m0;
    public static boolean m1;
    public static boolean n;
    public static final boolean n0;
    public static boolean n1;
    public static boolean o;
    public static boolean o0;
    public static int o1;
    public static String p;
    public static boolean p0;
    public static int p1;
    public static int q;
    public static boolean q0;
    public static int q1;
    public static String r;
    public static boolean r0;
    public static int r1;
    public static long s;
    public static boolean s0;
    public static int s1;
    public static long t;
    public static boolean t0;
    public static boolean t1;
    public static int u;
    public static boolean u0;
    public static boolean u1;
    public static byte[] v;
    public static boolean v0;
    public static final int[] v1;
    public static boolean w;
    public static boolean w0;
    public static final ArrayList w1;
    public static int x;
    public static boolean x0;
    public static boolean x1;
    public static boolean y;
    public static boolean y0;
    public static fba y1;
    public static boolean z;
    public static boolean z0;
    public static Boolean z1;

    static {
        HashSet hashSet = new HashSet();
        d = hashSet;
        hashSet.add("c2.exynos.hevc.encoder");
        hashSet.add("OMX.Exynos.HEVC.Encoder".toLowerCase());
        e = 2;
        f = "";
        g = "";
        r = "";
        v = new byte[0];
        x = 3600;
        C = true;
        F = 1;
        W = true;
        Z = true;
        b0 = 2;
        c0 = -210000;
        d0 = true;
        f0 = "";
        j0 = new Object();
        k0 = new Object();
        l0 = 2;
        m0 = 0;
        n0 = Build.VERSION.SDK_INT >= 30;
        o0 = false;
        p0 = true;
        q0 = true;
        r0 = false;
        s0 = true;
        t0 = false;
        u0 = true;
        v0 = true;
        w0 = false;
        x0 = true;
        y0 = false;
        z0 = false;
        A0 = true;
        B0 = false;
        C0 = false;
        D0 = false;
        G0 = true;
        N0 = true;
        O0 = false;
        T0 = 16;
        V0 = 17;
        W0 = 16;
        q1 = 3;
        r1 = 3;
        s1 = 3;
        v1 = new int[]{-1775228513, 802464304, 802464333, 802464302, 2067362118, 2067362060, 2067362084, 2067362241, 2067362117, 2067361998, -1853602818};
        s();
        w1 = new ArrayList();
        A1 = true;
    }

    public static void A(int i2) {
        if (q1 != i2) {
            q1 = i2;
            a.b.getSharedPreferences("mainconfig", 0).edit().putInt("mediaColumnsCount", q1).apply();
        }
    }

    public static void B(boolean z2) {
        t1 = z2;
        SharedPreferences.Editor edit = na7.c1().edit();
        edit.putBoolean("multipleReactionsPromoShowed", t1);
        edit.apply();
    }

    public static void C(boolean z2) {
        if (w0 == z2) {
            return;
        }
        w0 = z2;
        SharedPreferences.Editor edit = na7.c1().edit();
        edit.putBoolean("noSoundHintShowed", w0);
        edit.apply();
    }

    public static void D(int i2) {
        P0 = i2;
        if (i2 < 0 || i2 > 2) {
            P0 = 0;
        }
        SharedPreferences.Editor edit = na7.c1().edit();
        edit.putInt("repeatMode", P0);
        edit.apply();
    }

    public static void E(int i2) {
        if (r1 != i2) {
            r1 = i2;
            a.b.getSharedPreferences("mainconfig", 0).edit().putInt("storiesColumnsCount", r1).apply();
        }
    }

    public static void F(boolean z2) {
        T = z2;
        SharedPreferences.Editor edit = na7.c1().edit();
        edit.putBoolean("storiesIntroShown", T);
        edit.apply();
    }

    public static void G(boolean z2) {
        S = z2;
        SharedPreferences.Editor edit = na7.c1().edit();
        edit.putBoolean("storyReactionsLongPressHint", S);
        edit.apply();
    }

    public static void H(int i2) {
        D = i2;
        SharedPreferences.Editor edit = na7.c1().edit();
        edit.putInt("suggestStickers", D);
        edit.apply();
    }

    public static void I() {
        s0 = !s0;
        SharedPreferences.Editor edit = na7.c1().edit();
        edit.putBoolean("adaptableBrowser", s0);
        edit.apply();
    }

    public static void J() {
        boolean z2 = !F0;
        F0 = z2;
        WebView.setWebContentsDebuggingEnabled(z2);
        SharedPreferences.Editor edit = na7.c1().edit();
        edit.putBoolean("debugWebView", F0);
        edit.apply();
    }

    public static void K() {
        a0 = !a0;
        a.b.getSharedPreferences("mainconfig", 0).edit().putBoolean("payByInvoice", a0).apply();
    }

    public static void L() {
        Z = !Z;
        a.b.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoViewerBlur", Z).apply();
    }

    public static void M() {
        Y = !Y;
        a.b.getSharedPreferences("mainconfig", 0).edit().putBoolean("useSurfaceInStories", Y).apply();
    }

    public static void N() {
        SharedPreferences.Editor edit = na7.c1().edit();
        boolean z2 = !W;
        W = z2;
        edit.putBoolean("updateStickersOrderOnSend", z2);
        edit.apply();
    }

    public static void O() {
        X = !X;
        a.b.getSharedPreferences("mainconfig", 0).edit().putBoolean("useNewBlur", X).apply();
    }

    public static void P(int i2) {
        Z0 = i2;
        a.b.getSharedPreferences("mainconfig", 0).edit().putInt("messageSeenCount", Z0).apply();
    }

    public static void Q(int i2) {
        b0 = i2;
        a.b.getSharedPreferences("mainconfig", 0).edit().putInt("stealthModeSendMessageConfirm", b0).apply();
    }

    public static boolean R(String str, String str2) {
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        for (int i2 = 0; i2 < Math.min(split.length, split2.length); i2++) {
            int parseInt = Integer.parseInt(split[i2]);
            int parseInt2 = Integer.parseInt(split2[i2]);
            if (parseInt < parseInt2) {
                return false;
            }
            if (parseInt > parseInt2) {
                return true;
            }
        }
        return true;
    }

    public static fba a(fba fbaVar) {
        t();
        ArrayList arrayList = w1;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            fba fbaVar2 = (fba) arrayList.get(i2);
            if (Objects.equals(fbaVar.a, fbaVar2.a)) {
                return fbaVar2;
            }
        }
        arrayList.add(0, fbaVar);
        y();
        return fbaVar;
    }

    public static boolean b() {
        Boolean bool = b;
        if (bool == null) {
            int codecCount = MediaCodecList.getCodecCount();
            int i2 = 0;
            for (int i3 = 0; i3 < codecCount; i3++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i3);
                if (!codecInfoAt.isEncoder()) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= codecInfoAt.getSupportedTypes().length) {
                            break;
                        }
                        if (codecInfoAt.getSupportedTypes()[i4].contains("video/hevc")) {
                            int maxSupportedInstances = codecInfoAt.getCapabilitiesForType("video/hevc").getMaxSupportedInstances();
                            if (maxSupportedInstances > i2) {
                                i2 = maxSupportedInstances;
                            }
                        } else {
                            i4++;
                        }
                    }
                }
            }
            bool = Boolean.valueOf(i2 >= 8);
            b = bool;
        }
        return bool.booleanValue();
    }

    public static boolean c() {
        Boolean bool = z1;
        if (bool == null) {
            bool = Boolean.valueOf(na7.c1().getBoolean("view_animations", true));
            z1 = bool;
        }
        return bool.booleanValue();
    }

    public static int d() {
        try {
            return a.b.getPackageManager().getPackageInfo(a.b.getPackageName(), 0).versionCode;
        } catch (Exception e2) {
            fa4.g(e2, true);
            return 0;
        }
    }

    public static boolean e() {
        if (o() >= (Build.VERSION.SDK_INT >= 31 ? 1 : 2)) {
            return true;
        }
        boolean z2 = w01.a;
        return false;
    }

    public static boolean f() {
        return e() && e66.e(256);
    }

    public static boolean g(String str) {
        if (v.length != 0) {
            try {
                byte[] bytes = str.getBytes("UTF-8");
                int length = bytes.length + 32;
                byte[] bArr = new byte[length];
                System.arraycopy(v, 0, bArr, 0, 16);
                System.arraycopy(bytes, 0, bArr, 16, bytes.length);
                System.arraycopy(v, 0, bArr, bytes.length + 16, 16);
                return r.equals(Utilities.f(Utilities.o(length, bArr)));
            } catch (Exception e2) {
                fa4.g(e2, true);
                return false;
            }
        }
        boolean equals = Utilities.a(str).equals(r);
        if (equals) {
            try {
                v = new byte[16];
                Utilities.b.nextBytes(v);
                byte[] bytes2 = str.getBytes("UTF-8");
                int length2 = bytes2.length + 32;
                byte[] bArr2 = new byte[length2];
                System.arraycopy(v, 0, bArr2, 0, 16);
                System.arraycopy(bytes2, 0, bArr2, 16, bytes2.length);
                System.arraycopy(v, 0, bArr2, bytes2.length + 16, 16);
                r = Utilities.f(Utilities.o(length2, bArr2));
                x();
                return equals;
            } catch (Exception e3) {
                fa4.g(e3, true);
            }
        }
        return equals;
    }

    public static void h(File file) {
        if (file == null || e0 == null || a || !file.getPath().startsWith(e0)) {
            return;
        }
        gl.d3(new am6((byte) 24));
    }

    public static void i(fba fbaVar) {
        if (y1 == fbaVar) {
            y1 = null;
            SharedPreferences c12 = na7.c1();
            boolean z2 = c12.getBoolean("proxy_enabled", false);
            SharedPreferences.Editor edit = c12.edit();
            edit.putString("proxy_ip", "");
            edit.putString("proxy_pass", "");
            edit.putString("proxy_user", "");
            edit.putString("proxy_secret", "");
            edit.putInt("proxy_type", 0);
            edit.putInt("proxy_port", 1080);
            edit.putBoolean("proxy_enabled", false);
            edit.apply();
            if (z2) {
                ConnectionsManager.setProxySettings(false, null);
            }
        }
        w1.remove(fbaVar);
        y();
    }

    public static boolean j() {
        return o() >= 2;
    }

    public static boolean k(boolean z2) {
        if (p0) {
            return !z2 || o0;
        }
        return false;
    }

    public static String l() {
        String str = c;
        if (str == null) {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i2 = 0; i2 < codecCount; i2++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
                if (codecInfoAt.isEncoder()) {
                    for (int i3 = 0; i3 < codecInfoAt.getSupportedTypes().length; i3++) {
                        if (codecInfoAt.getSupportedTypes()[i3].contains("video/hevc") && codecInfoAt.isHardwareAccelerated()) {
                            boolean z2 = w01.a;
                            if (d.contains(codecInfoAt.getName().toLowerCase())) {
                                String name = codecInfoAt.getName();
                                c = name;
                                return name;
                            }
                        }
                    }
                }
            }
            str = "";
            c = "";
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return c;
    }

    public static int m(int i2) {
        int i3 = o1;
        if (i3 < 0) {
            return !na7.q1(i2).G0.isEmpty() ? 5 : 2;
        }
        if (i3 == 5 && na7.q1(i2).G0.isEmpty()) {
            return 2;
        }
        return o1;
    }

    public static HashMap n() {
        if (g0 == null) {
            g0 = new HashMap();
            try {
                JSONObject jSONObject = new JSONObject(f0);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    g0.put(next.toUpperCase(), jSONObject.getString(next).toUpperCase());
                }
            } catch (Throwable th) {
                fa4.g(th, true);
            }
        }
        return g0;
    }

    public static int o() {
        int i2 = l1;
        if (i2 != -1) {
            return i2;
        }
        int i3 = k1;
        if (i3 != -1) {
            return i3;
        }
        int u2 = u();
        k1 = u2;
        return u2;
    }

    public static int p() {
        int i2;
        synchronized (k0) {
            i2 = c0;
            c0 = i2 - 1;
        }
        return i2;
    }

    public static SharedPreferences q() {
        return a.b.getSharedPreferences("userconfing", 0);
    }

    public static void r() {
        int i2 = u + 1;
        u = i2;
        if (i2 >= 3) {
            if (i2 == 3) {
                s = 5000L;
            } else if (i2 == 4) {
                s = 10000L;
            } else if (i2 == 5) {
                s = 15000L;
            } else if (i2 == 6) {
                s = 20000L;
            } else if (i2 != 7) {
                s = 30000L;
            } else {
                s = 25000L;
            }
            t = SystemClock.elapsedRealtime();
        }
        x();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x022f A[Catch: all -> 0x04b9, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000b, B:10:0x00e2, B:11:0x00e8, B:13:0x00f0, B:15:0x00f4, B:16:0x0101, B:18:0x010f, B:19:0x011a, B:21:0x0126, B:23:0x012e, B:25:0x0140, B:26:0x0154, B:57:0x0158, B:60:0x016a, B:62:0x0177, B:64:0x017d, B:65:0x017f, B:67:0x0183, B:69:0x0189, B:71:0x018f, B:72:0x0192, B:75:0x0171, B:28:0x01a3, B:30:0x0202, B:33:0x020d, B:35:0x022f, B:37:0x0233, B:42:0x024b, B:44:0x02a2, B:45:0x02a4, B:48:0x0453, B:49:0x04b3, B:79:0x01a0, B:80:0x0116, B:81:0x04b5), top: B:3:0x0003, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02a2 A[Catch: all -> 0x04b9, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000b, B:10:0x00e2, B:11:0x00e8, B:13:0x00f0, B:15:0x00f4, B:16:0x0101, B:18:0x010f, B:19:0x011a, B:21:0x0126, B:23:0x012e, B:25:0x0140, B:26:0x0154, B:57:0x0158, B:60:0x016a, B:62:0x0177, B:64:0x017d, B:65:0x017f, B:67:0x0183, B:69:0x0189, B:71:0x018f, B:72:0x0192, B:75:0x0171, B:28:0x01a3, B:30:0x0202, B:33:0x020d, B:35:0x022f, B:37:0x0233, B:42:0x024b, B:44:0x02a2, B:45:0x02a4, B:48:0x0453, B:49:0x04b3, B:79:0x01a0, B:80:0x0116, B:81:0x04b5), top: B:3:0x0003, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0177 A[Catch: Exception -> 0x019f, all -> 0x04b9, TryCatch #1 {Exception -> 0x019f, blocks: (B:21:0x0126, B:23:0x012e, B:25:0x0140, B:26:0x0154, B:62:0x0177, B:64:0x017d, B:65:0x017f, B:67:0x0183, B:69:0x0189, B:71:0x018f, B:72:0x0192, B:75:0x0171), top: B:20:0x0126, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017d A[Catch: Exception -> 0x019f, all -> 0x04b9, TryCatch #1 {Exception -> 0x019f, blocks: (B:21:0x0126, B:23:0x012e, B:25:0x0140, B:26:0x0154, B:62:0x0177, B:64:0x017d, B:65:0x017f, B:67:0x0183, B:69:0x0189, B:71:0x018f, B:72:0x0192, B:75:0x0171), top: B:20:0x0126, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void s() {
        int i2;
        int i3;
        String str;
        String str2;
        PackageInfo packageInfo;
        synchronized (j0) {
            if (i0 || a.b == null) {
                return;
            }
            aue.a = a.b.getSharedPreferences("background_activity", 0);
            SharedPreferences sharedPreferences = a.b.getSharedPreferences("userconfing", 0);
            y = sharedPreferences.getBoolean("saveIncomingPhotos", false);
            r = sharedPreferences.getString("passcodeHash1", "");
            w = sharedPreferences.getBoolean("appLocked", false);
            q = sharedPreferences.getInt("passcodeType", 0);
            s = sharedPreferences.getLong("passcodeRetryInMs", 0L);
            t = sharedPreferences.getLong("lastUptimeMillis", 0L);
            u = sharedPreferences.getInt("badPasscodeTries", 0);
            x = sharedPreferences.getInt("autoLockIn", 3600);
            A = sharedPreferences.getInt("lastPauseTime", 0);
            C = sharedPreferences.getBoolean("useFingerprint", true);
            d0 = sharedPreferences.getBoolean("walletUseFingerprintLock", true);
            z = sharedPreferences.getBoolean("allowScreenCapture", false);
            c0 = sharedPreferences.getInt("lastLocalId", -210000);
            f = sharedPreferences.getString("pushString2", "");
            e = sharedPreferences.getInt("pushType", 2);
            j = sharedPreferences.getBoolean("pushStatSent", false);
            f0 = sharedPreferences.getString("passportConfigJson", "");
            h0 = sharedPreferences.getInt("passportConfigHash", 0);
            e0 = sharedPreferences.getString("storageCacheDir", null);
            X0 = sharedPreferences.getBoolean("proxyRotationEnabled", false);
            Y0 = sharedPreferences.getInt("proxyRotationTimeout", 1);
            String string = sharedPreferences.getString("pushAuthKey", null);
            if (!TextUtils.isEmpty(string)) {
                k = Base64.decode(string, 0);
            }
            if (r.length() > 0 && A == 0) {
                A = (int) ((SystemClock.elapsedRealtime() / 1000) - 600);
            }
            String string2 = sharedPreferences.getString("passcodeSalt", "");
            if (string2.length() > 0) {
                v = Base64.decode(string2, 0);
            } else {
                v = new byte[0];
            }
            i1 = sharedPreferences.getLong("appUpdateCheckTime", System.currentTimeMillis());
            try {
                String string3 = sharedPreferences.getString("appUpdate", null);
                if (string3 != null) {
                    h1 = sharedPreferences.getInt("appUpdateBuild", d());
                    byte[] decode = Base64.decode(string3, 0);
                    if (decode != null) {
                        SerializedData serializedData = new SerializedData(decode);
                        g1 = (TLRPC.TL_help_appUpdate) TLRPC.help_AppUpdate.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                        serializedData.cleanup();
                    }
                }
                if (g1 != null) {
                    try {
                        packageInfo = a.b.getPackageManager().getPackageInfo(a.b.getPackageName(), 0);
                        i3 = packageInfo.versionCode;
                    } catch (Exception e2) {
                        e = e2;
                        i3 = 0;
                    }
                    try {
                        str = packageInfo.versionName;
                    } catch (Exception e3) {
                        e = e3;
                        fa4.g(e, true);
                        str = null;
                        if (i3 == 0) {
                        }
                        if (str == null) {
                        }
                        if (h1 == i3) {
                        }
                        g1 = null;
                        gl.d3(new am6((byte) 22));
                        SharedPreferences sharedPreferences2 = a.b.getSharedPreferences("mainconfig", 0);
                        mte.b(sharedPreferences2);
                        l0 = sharedPreferences2.getInt("mapPreviewType", 2);
                        m0 = sharedPreferences2.getInt("searchEngineType", 0);
                        p0 = sharedPreferences2.getBoolean("raise_to_listen", true);
                        o0 = sharedPreferences2.getBoolean("raise_to_speak", false);
                        q0 = sharedPreferences2.getBoolean("next_media_on_tap", true);
                        r0 = sharedPreferences2.getBoolean("record_via_sco", false);
                        s0 = sharedPreferences2.getBoolean("adaptableBrowser", false);
                        boolean z2 = w01.a;
                        t0 = sharedPreferences2.getBoolean("onlyLocalInstantView", false);
                        u0 = sharedPreferences2.getBoolean("direct_share", true);
                        boolean z3 = sharedPreferences2.getBoolean("shuffleMusic", false);
                        K0 = z3;
                        L0 = z3 && sharedPreferences2.getBoolean("playOrderReversed", false);
                        v0 = sharedPreferences2.getBoolean("inappCamera", true);
                        M0 = sharedPreferences2.contains("cameraCache");
                        P0 = sharedPreferences2.getInt("repeatMode", 0);
                        if (gl.O1()) {
                        }
                        i2 = 16;
                        T0 = sharedPreferences2.getInt("fons_size", i2);
                        U0 = !sharedPreferences2.contains("fons_size");
                        V0 = sharedPreferences2.getInt("bubbleRadius", 17);
                        W0 = sharedPreferences2.getInt("iv_font_size", T0);
                        Q0 = sharedPreferences2.getBoolean("allowBigEmoji", true);
                        R0 = sharedPreferences2.getBoolean("useSystemEmoji", false);
                        S0 = sharedPreferences2.getBoolean("useSystemBoldFont", false);
                        m = sharedPreferences2.getBoolean("forceForumTabs", false);
                        n = sharedPreferences2.getBoolean("fastWallpaperDisabled", false);
                        o = sharedPreferences2.getBoolean("frameMetricsEnabled", false);
                        if (S0) {
                        }
                        x0 = sharedPreferences2.getBoolean("streamMedia", true);
                        A0 = sharedPreferences2.getBoolean("saveStreamMedia", true);
                        B0 = sharedPreferences2.getBoolean("pauseMusicOnRecord", true);
                        C0 = sharedPreferences2.getBoolean("pauseMusicOnMedia", false);
                        D0 = sharedPreferences2.getBoolean("compactMode", false);
                        V = sharedPreferences2.getBoolean("forceDisableTabletMode", false);
                        y0 = sharedPreferences2.getBoolean("streamAllVideo", true);
                        z0 = sharedPreferences2.getBoolean("streamMkv", false);
                        D = sharedPreferences2.getInt("suggestStickers", 0);
                        E = sharedPreferences2.getBoolean("suggestAnimatedEmoji", true);
                        l1 = sharedPreferences2.getInt("overrideDevicePerformanceClass", -1);
                        k1 = sharedPreferences2.getInt("devicePerformanceClass", -1);
                        I0 = sharedPreferences2.getBoolean("sortContactsByName", false);
                        J0 = sharedPreferences2.getBoolean("sortFilesByName", false);
                        w0 = sharedPreferences2.getBoolean("noSoundHintShowed", false);
                        p = sharedPreferences2.getString("directShareHash2", null);
                        m1 = sharedPreferences2.getBoolean("useThreeLinesLayout", false);
                        n1 = sharedPreferences2.getBoolean("archiveHidden", false);
                        p1 = sharedPreferences2.getInt("distanceSystemType", 0);
                        F = sharedPreferences2.getInt("keep_media", 1);
                        F0 = sharedPreferences2.getBoolean("debugWebView", false);
                        G0 = sharedPreferences2.getBoolean("widgetStaticLayers", true);
                        H0 = sharedPreferences2.getBoolean("widgetNovaEngine", false);
                        G = sharedPreferences2.getInt("lastKeepMediaCheckTime", 0);
                        H = sharedPreferences2.getInt("lastLogsCheckTime", 0);
                        sharedPreferences2.getBoolean("searchMessagesAsListUsed", false);
                        Q = sharedPreferences2.getBoolean("stickersReorderingHintUsed", false);
                        S = sharedPreferences2.getBoolean("storyReactionsLongPressHint", false);
                        T = sharedPreferences2.getBoolean("storiesIntroShown", false);
                        I = sharedPreferences2.getInt("textSelectionHintShows", 0);
                        J = sharedPreferences2.getInt("scheduledOrNoSoundHintShows", 0);
                        K = sharedPreferences2.getLong("scheduledOrNoSoundHintSeenAt", 0L);
                        L = sharedPreferences2.getInt("scheduledHintShows", 0);
                        M = sharedPreferences2.getLong("scheduledHintSeenAt", 0L);
                        O = sharedPreferences2.getBoolean("forwardingOptionsHintShown", false);
                        P = sharedPreferences2.getBoolean("replyingOptionsHintShown", false);
                        N = sharedPreferences2.getInt("lockRecordAudioVideoHint", 0);
                        U = sharedPreferences2.getBoolean("disableVoiceAudioEffects", false);
                        E0 = sharedPreferences2.getBoolean("noiseSupression", false);
                        o1 = sharedPreferences2.getInt("ChatSwipeAction", -1);
                        Z0 = sharedPreferences2.getInt("messageSeenCount", 3);
                        a1 = sharedPreferences2.getInt("emojiInteractionsHintCount", 3);
                        b1 = sharedPreferences2.getInt("dayNightThemeSwitchHintCount", 3);
                        b0 = sharedPreferences2.getInt("stealthModeSendMessageConfirm", 2);
                        q1 = sharedPreferences2.getInt("mediaColumnsCount", 3);
                        r1 = sharedPreferences2.getInt("storiesColumnsCount", 3);
                        s1 = sharedPreferences2.getInt("fastScrollHintCount", 3);
                        sharedPreferences2.getBoolean("dontAskManageStorage", false);
                        j1 = sharedPreferences2.getBoolean("hasEmailLogin", false);
                        u1 = sharedPreferences2.getBoolean("floatingDebugActive", false);
                        W = sharedPreferences2.getBoolean("updateStickersOrderOnSend", true);
                        R = sharedPreferences2.getInt("dayNightWallpaperSwitchHint", 0);
                        X = sharedPreferences2.getBoolean("useNewBlur", true);
                        Y = sharedPreferences2.getBoolean("useSurfaceInStories", Build.VERSION.SDK_INT >= 30);
                        a0 = sharedPreferences2.getBoolean("payByInvoice", false);
                        Z = sharedPreferences2.getBoolean("photoViewerBlur", true);
                        t1 = sharedPreferences2.getBoolean("multipleReactionsPromoShowed", false);
                        c1 = sharedPreferences2.getInt("callEncryptionHintDisplayedCount", 0);
                        O0 = sharedPreferences2.getBoolean("debugVideoQualities", false);
                        d1 = sharedPreferences2.getBoolean("debugViewMetrics", false);
                        e1 = sharedPreferences2.getBoolean("photoHighQualityDefault", false);
                        f1 = sharedPreferences2.getBoolean("photoLiveDefault", false);
                        A1 = sharedPreferences2.getBoolean("drawActionBarShadow", true);
                        N0 = a.b.getSharedPreferences("Notifications", 0).getBoolean("AllAccounts", true);
                        i0 = true;
                    }
                    if (i3 == 0) {
                        i3 = d();
                    }
                    if (str == null) {
                        str = w01.c;
                    }
                    if (h1 == i3 || (str2 = g1.version) == null || str.compareTo(str2) >= 0) {
                        g1 = null;
                        gl.d3(new am6((byte) 22));
                    } else {
                        boolean z4 = w01.a;
                    }
                }
            } catch (Exception e4) {
                fa4.g(e4, true);
            }
            SharedPreferences sharedPreferences22 = a.b.getSharedPreferences("mainconfig", 0);
            mte.b(sharedPreferences22);
            l0 = sharedPreferences22.getInt("mapPreviewType", 2);
            m0 = sharedPreferences22.getInt("searchEngineType", 0);
            p0 = sharedPreferences22.getBoolean("raise_to_listen", true);
            o0 = sharedPreferences22.getBoolean("raise_to_speak", false);
            q0 = sharedPreferences22.getBoolean("next_media_on_tap", true);
            r0 = sharedPreferences22.getBoolean("record_via_sco", false);
            s0 = sharedPreferences22.getBoolean("adaptableBrowser", false);
            boolean z22 = w01.a;
            t0 = sharedPreferences22.getBoolean("onlyLocalInstantView", false);
            u0 = sharedPreferences22.getBoolean("direct_share", true);
            boolean z32 = sharedPreferences22.getBoolean("shuffleMusic", false);
            K0 = z32;
            L0 = z32 && sharedPreferences22.getBoolean("playOrderReversed", false);
            v0 = sharedPreferences22.getBoolean("inappCamera", true);
            M0 = sharedPreferences22.contains("cameraCache");
            P0 = sharedPreferences22.getInt("repeatMode", 0);
            if (gl.O1()) {
                if (!(a.b != null && a.b.getPackageManager().hasSystemFeature("android.hardware.sensor.hinge_angle"))) {
                    i2 = 18;
                    T0 = sharedPreferences22.getInt("fons_size", i2);
                    U0 = !sharedPreferences22.contains("fons_size");
                    V0 = sharedPreferences22.getInt("bubbleRadius", 17);
                    W0 = sharedPreferences22.getInt("iv_font_size", T0);
                    Q0 = sharedPreferences22.getBoolean("allowBigEmoji", true);
                    R0 = sharedPreferences22.getBoolean("useSystemEmoji", false);
                    S0 = sharedPreferences22.getBoolean("useSystemBoldFont", false);
                    m = sharedPreferences22.getBoolean("forceForumTabs", false);
                    n = sharedPreferences22.getBoolean("fastWallpaperDisabled", false);
                    o = sharedPreferences22.getBoolean("frameMetricsEnabled", false);
                    if (S0) {
                        gl.a = null;
                    }
                    x0 = sharedPreferences22.getBoolean("streamMedia", true);
                    A0 = sharedPreferences22.getBoolean("saveStreamMedia", true);
                    B0 = sharedPreferences22.getBoolean("pauseMusicOnRecord", true);
                    C0 = sharedPreferences22.getBoolean("pauseMusicOnMedia", false);
                    D0 = sharedPreferences22.getBoolean("compactMode", false);
                    V = sharedPreferences22.getBoolean("forceDisableTabletMode", false);
                    y0 = sharedPreferences22.getBoolean("streamAllVideo", true);
                    z0 = sharedPreferences22.getBoolean("streamMkv", false);
                    D = sharedPreferences22.getInt("suggestStickers", 0);
                    E = sharedPreferences22.getBoolean("suggestAnimatedEmoji", true);
                    l1 = sharedPreferences22.getInt("overrideDevicePerformanceClass", -1);
                    k1 = sharedPreferences22.getInt("devicePerformanceClass", -1);
                    I0 = sharedPreferences22.getBoolean("sortContactsByName", false);
                    J0 = sharedPreferences22.getBoolean("sortFilesByName", false);
                    w0 = sharedPreferences22.getBoolean("noSoundHintShowed", false);
                    p = sharedPreferences22.getString("directShareHash2", null);
                    m1 = sharedPreferences22.getBoolean("useThreeLinesLayout", false);
                    n1 = sharedPreferences22.getBoolean("archiveHidden", false);
                    p1 = sharedPreferences22.getInt("distanceSystemType", 0);
                    F = sharedPreferences22.getInt("keep_media", 1);
                    F0 = sharedPreferences22.getBoolean("debugWebView", false);
                    G0 = sharedPreferences22.getBoolean("widgetStaticLayers", true);
                    H0 = sharedPreferences22.getBoolean("widgetNovaEngine", false);
                    G = sharedPreferences22.getInt("lastKeepMediaCheckTime", 0);
                    H = sharedPreferences22.getInt("lastLogsCheckTime", 0);
                    sharedPreferences22.getBoolean("searchMessagesAsListUsed", false);
                    Q = sharedPreferences22.getBoolean("stickersReorderingHintUsed", false);
                    S = sharedPreferences22.getBoolean("storyReactionsLongPressHint", false);
                    T = sharedPreferences22.getBoolean("storiesIntroShown", false);
                    I = sharedPreferences22.getInt("textSelectionHintShows", 0);
                    J = sharedPreferences22.getInt("scheduledOrNoSoundHintShows", 0);
                    K = sharedPreferences22.getLong("scheduledOrNoSoundHintSeenAt", 0L);
                    L = sharedPreferences22.getInt("scheduledHintShows", 0);
                    M = sharedPreferences22.getLong("scheduledHintSeenAt", 0L);
                    O = sharedPreferences22.getBoolean("forwardingOptionsHintShown", false);
                    P = sharedPreferences22.getBoolean("replyingOptionsHintShown", false);
                    N = sharedPreferences22.getInt("lockRecordAudioVideoHint", 0);
                    U = sharedPreferences22.getBoolean("disableVoiceAudioEffects", false);
                    E0 = sharedPreferences22.getBoolean("noiseSupression", false);
                    o1 = sharedPreferences22.getInt("ChatSwipeAction", -1);
                    Z0 = sharedPreferences22.getInt("messageSeenCount", 3);
                    a1 = sharedPreferences22.getInt("emojiInteractionsHintCount", 3);
                    b1 = sharedPreferences22.getInt("dayNightThemeSwitchHintCount", 3);
                    b0 = sharedPreferences22.getInt("stealthModeSendMessageConfirm", 2);
                    q1 = sharedPreferences22.getInt("mediaColumnsCount", 3);
                    r1 = sharedPreferences22.getInt("storiesColumnsCount", 3);
                    s1 = sharedPreferences22.getInt("fastScrollHintCount", 3);
                    sharedPreferences22.getBoolean("dontAskManageStorage", false);
                    j1 = sharedPreferences22.getBoolean("hasEmailLogin", false);
                    u1 = sharedPreferences22.getBoolean("floatingDebugActive", false);
                    W = sharedPreferences22.getBoolean("updateStickersOrderOnSend", true);
                    R = sharedPreferences22.getInt("dayNightWallpaperSwitchHint", 0);
                    X = sharedPreferences22.getBoolean("useNewBlur", true);
                    Y = sharedPreferences22.getBoolean("useSurfaceInStories", Build.VERSION.SDK_INT >= 30);
                    a0 = sharedPreferences22.getBoolean("payByInvoice", false);
                    Z = sharedPreferences22.getBoolean("photoViewerBlur", true);
                    t1 = sharedPreferences22.getBoolean("multipleReactionsPromoShowed", false);
                    c1 = sharedPreferences22.getInt("callEncryptionHintDisplayedCount", 0);
                    O0 = sharedPreferences22.getBoolean("debugVideoQualities", false);
                    d1 = sharedPreferences22.getBoolean("debugViewMetrics", false);
                    e1 = sharedPreferences22.getBoolean("photoHighQualityDefault", false);
                    f1 = sharedPreferences22.getBoolean("photoLiveDefault", false);
                    A1 = sharedPreferences22.getBoolean("drawActionBarShadow", true);
                    N0 = a.b.getSharedPreferences("Notifications", 0).getBoolean("AllAccounts", true);
                    i0 = true;
                }
            }
            i2 = 16;
            T0 = sharedPreferences22.getInt("fons_size", i2);
            U0 = !sharedPreferences22.contains("fons_size");
            V0 = sharedPreferences22.getInt("bubbleRadius", 17);
            W0 = sharedPreferences22.getInt("iv_font_size", T0);
            Q0 = sharedPreferences22.getBoolean("allowBigEmoji", true);
            R0 = sharedPreferences22.getBoolean("useSystemEmoji", false);
            S0 = sharedPreferences22.getBoolean("useSystemBoldFont", false);
            m = sharedPreferences22.getBoolean("forceForumTabs", false);
            n = sharedPreferences22.getBoolean("fastWallpaperDisabled", false);
            o = sharedPreferences22.getBoolean("frameMetricsEnabled", false);
            if (S0) {
            }
            x0 = sharedPreferences22.getBoolean("streamMedia", true);
            A0 = sharedPreferences22.getBoolean("saveStreamMedia", true);
            B0 = sharedPreferences22.getBoolean("pauseMusicOnRecord", true);
            C0 = sharedPreferences22.getBoolean("pauseMusicOnMedia", false);
            D0 = sharedPreferences22.getBoolean("compactMode", false);
            V = sharedPreferences22.getBoolean("forceDisableTabletMode", false);
            y0 = sharedPreferences22.getBoolean("streamAllVideo", true);
            z0 = sharedPreferences22.getBoolean("streamMkv", false);
            D = sharedPreferences22.getInt("suggestStickers", 0);
            E = sharedPreferences22.getBoolean("suggestAnimatedEmoji", true);
            l1 = sharedPreferences22.getInt("overrideDevicePerformanceClass", -1);
            k1 = sharedPreferences22.getInt("devicePerformanceClass", -1);
            I0 = sharedPreferences22.getBoolean("sortContactsByName", false);
            J0 = sharedPreferences22.getBoolean("sortFilesByName", false);
            w0 = sharedPreferences22.getBoolean("noSoundHintShowed", false);
            p = sharedPreferences22.getString("directShareHash2", null);
            m1 = sharedPreferences22.getBoolean("useThreeLinesLayout", false);
            n1 = sharedPreferences22.getBoolean("archiveHidden", false);
            p1 = sharedPreferences22.getInt("distanceSystemType", 0);
            F = sharedPreferences22.getInt("keep_media", 1);
            F0 = sharedPreferences22.getBoolean("debugWebView", false);
            G0 = sharedPreferences22.getBoolean("widgetStaticLayers", true);
            H0 = sharedPreferences22.getBoolean("widgetNovaEngine", false);
            G = sharedPreferences22.getInt("lastKeepMediaCheckTime", 0);
            H = sharedPreferences22.getInt("lastLogsCheckTime", 0);
            sharedPreferences22.getBoolean("searchMessagesAsListUsed", false);
            Q = sharedPreferences22.getBoolean("stickersReorderingHintUsed", false);
            S = sharedPreferences22.getBoolean("storyReactionsLongPressHint", false);
            T = sharedPreferences22.getBoolean("storiesIntroShown", false);
            I = sharedPreferences22.getInt("textSelectionHintShows", 0);
            J = sharedPreferences22.getInt("scheduledOrNoSoundHintShows", 0);
            K = sharedPreferences22.getLong("scheduledOrNoSoundHintSeenAt", 0L);
            L = sharedPreferences22.getInt("scheduledHintShows", 0);
            M = sharedPreferences22.getLong("scheduledHintSeenAt", 0L);
            O = sharedPreferences22.getBoolean("forwardingOptionsHintShown", false);
            P = sharedPreferences22.getBoolean("replyingOptionsHintShown", false);
            N = sharedPreferences22.getInt("lockRecordAudioVideoHint", 0);
            U = sharedPreferences22.getBoolean("disableVoiceAudioEffects", false);
            E0 = sharedPreferences22.getBoolean("noiseSupression", false);
            o1 = sharedPreferences22.getInt("ChatSwipeAction", -1);
            Z0 = sharedPreferences22.getInt("messageSeenCount", 3);
            a1 = sharedPreferences22.getInt("emojiInteractionsHintCount", 3);
            b1 = sharedPreferences22.getInt("dayNightThemeSwitchHintCount", 3);
            b0 = sharedPreferences22.getInt("stealthModeSendMessageConfirm", 2);
            q1 = sharedPreferences22.getInt("mediaColumnsCount", 3);
            r1 = sharedPreferences22.getInt("storiesColumnsCount", 3);
            s1 = sharedPreferences22.getInt("fastScrollHintCount", 3);
            sharedPreferences22.getBoolean("dontAskManageStorage", false);
            j1 = sharedPreferences22.getBoolean("hasEmailLogin", false);
            u1 = sharedPreferences22.getBoolean("floatingDebugActive", false);
            W = sharedPreferences22.getBoolean("updateStickersOrderOnSend", true);
            R = sharedPreferences22.getInt("dayNightWallpaperSwitchHint", 0);
            X = sharedPreferences22.getBoolean("useNewBlur", true);
            Y = sharedPreferences22.getBoolean("useSurfaceInStories", Build.VERSION.SDK_INT >= 30);
            a0 = sharedPreferences22.getBoolean("payByInvoice", false);
            Z = sharedPreferences22.getBoolean("photoViewerBlur", true);
            t1 = sharedPreferences22.getBoolean("multipleReactionsPromoShowed", false);
            c1 = sharedPreferences22.getInt("callEncryptionHintDisplayedCount", 0);
            O0 = sharedPreferences22.getBoolean("debugVideoQualities", false);
            d1 = sharedPreferences22.getBoolean("debugViewMetrics", false);
            e1 = sharedPreferences22.getBoolean("photoHighQualityDefault", false);
            f1 = sharedPreferences22.getBoolean("photoLiveDefault", false);
            A1 = sharedPreferences22.getBoolean("drawActionBarShadow", true);
            N0 = a.b.getSharedPreferences("Notifications", 0).getBoolean("AllAccounts", true);
            i0 = true;
        }
    }

    public static void t() {
        if (x1) {
            return;
        }
        SharedPreferences sharedPreferences = a.b.getSharedPreferences("mainconfig", 0);
        au8 c2 = au8.c(sharedPreferences);
        x1 = true;
        w1.clear();
        y1 = null;
        String string = sharedPreferences.getString("proxy_list", null);
        if (!TextUtils.isEmpty(string)) {
            SerializedData serializedData = new SerializedData(Base64.decode(string, 0));
            int readInt32 = serializedData.readInt32(false);
            if (readInt32 == -1) {
                byte readByte = serializedData.readByte(false);
                if (readByte == 2 || readByte == 3) {
                    int readInt322 = serializedData.readInt32(false);
                    for (int i2 = 0; i2 < readInt322; i2++) {
                        fba a2 = fba.a(readByte, serializedData);
                        w1.add(0, a2);
                        if (y1 == null && c2.g() && c2.equals(a2.a)) {
                            y1 = a2;
                        }
                    }
                } else {
                    fa4.d("Unknown proxy schema version: " + ((int) readByte));
                }
            } else {
                for (int i3 = 0; i3 < readInt32; i3++) {
                    fba a3 = fba.a(0, serializedData);
                    w1.add(0, a3);
                    if (y1 == null && c2.g() && c2.equals(a3.a)) {
                        y1 = a3;
                    }
                }
            }
            serializedData.cleanup();
        }
        if (y1 == null && c2.g()) {
            fba fbaVar = new fba(c2);
            y1 = fbaVar;
            w1.add(0, fbaVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0017, code lost:
    
        r4 = android.os.Build.SOC_MODEL;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int u() {
        long j2;
        String str;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = ConnectionsManager.CPU_COUNT;
        int memoryClass = ((ActivityManager) a.b.getSystemService("activity")).getMemoryClass();
        int i4 = 0;
        if (i2 >= 31 && str != null) {
            int hashCode = str.toUpperCase().hashCode();
            int i5 = 0;
            while (true) {
                int[] iArr = v1;
                if (i5 >= iArr.length) {
                    break;
                }
                if (iArr[i5] == hashCode) {
                    return 0;
                }
                i5++;
            }
        }
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i3; i8++) {
            try {
                Locale locale = Locale.ENGLISH;
                RandomAccessFile randomAccessFile = new RandomAccessFile("/sys/devices/system/cpu/cpu" + i8 + "/cpufreq/cpuinfo_max_freq", "r");
                String readLine = randomAccessFile.readLine();
                if (readLine != null) {
                    i7 += Utilities.z(readLine).intValue() / 1000;
                    i6++;
                }
                randomAccessFile.close();
            } catch (Throwable unused) {
            }
        }
        int ceil = i6 == 0 ? -1 : (int) Math.ceil(i7 / i6);
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) a.b.getSystemService("activity")).getMemoryInfo(memoryInfo);
            j2 = memoryInfo.totalMem;
        } catch (Exception unused2) {
            j2 = -1;
        }
        if (i3 > 2 && memoryClass > 100 && ((i3 > 4 || ceil == -1 || ceil > 1250) && ((i3 > 4 || ceil > 1300 || memoryClass > 128 || i2 > 24) && (j2 == -1 || j2 >= 2147483648L)))) {
            if (i3 >= 8 && memoryClass > 160) {
                if (ceil == -1) {
                    i4 = 2;
                }
            }
            i4 = 1;
        }
        if (w01.a) {
            StringBuilder p2 = ir2.p("device performance info selected_class = ", i4, " (cpu_count = ", i3, ", freq = ");
            ir2.w(p2, ceil, ", memoryClass = ", memoryClass, ", android version ");
            p2.append(i2);
            p2.append(", manufacture ");
            p2.append(Build.MANUFACTURER);
            p2.append(", screenRefreshRate=");
            p2.append(gl.r);
            p2.append(", screenMaxRefreshRate=");
            p2.append(gl.s);
            p2.append(")");
            fa4.b(p2.toString());
        }
        return i4;
    }

    public static void v(int i2) {
        SharedPreferences.Editor edit = na7.c1().edit();
        l1 = i2;
        edit.putInt("overrideDevicePerformanceClass", i2).remove("lite_mode").apply();
    }

    public static String w(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? "UNKNOWN" : "HIGH" : "AVERAGE" : "LOW";
    }

    public static void x() {
        synchronized (j0) {
            try {
                SharedPreferences.Editor edit = a.b.getSharedPreferences("userconfing", 0).edit();
                edit.putBoolean("saveIncomingPhotos", y);
                edit.putString("passcodeHash1", r);
                byte[] bArr = v;
                edit.putString("passcodeSalt", bArr.length > 0 ? Base64.encodeToString(bArr, 0) : "");
                edit.putBoolean("appLocked", w);
                edit.putInt("passcodeType", q);
                edit.putLong("passcodeRetryInMs", s);
                edit.putLong("lastUptimeMillis", t);
                edit.putInt("badPasscodeTries", u);
                edit.putInt("autoLockIn", x);
                edit.putInt("lastPauseTime", A);
                edit.putBoolean("useFingerprint", C);
                edit.putBoolean("walletUseFingerprintLock", d0);
                edit.putBoolean("allowScreenCapture", z);
                edit.putString("pushString2", f);
                edit.putInt("pushType", e);
                edit.putBoolean("pushStatSent", j);
                byte[] bArr2 = k;
                edit.putString("pushAuthKey", bArr2 != null ? Base64.encodeToString(bArr2, 0) : "");
                edit.putInt("lastLocalId", c0);
                edit.putString("passportConfigJson", f0);
                edit.putInt("passportConfigHash", h0);
                edit.putBoolean("sortContactsByName", I0);
                edit.putBoolean("sortFilesByName", J0);
                edit.putInt("textSelectionHintShows", I);
                edit.putInt("scheduledOrNoSoundHintShows", J);
                edit.putLong("scheduledOrNoSoundHintSeenAt", K);
                edit.putInt("scheduledHintShows", L);
                edit.putLong("scheduledHintSeenAt", M);
                edit.putBoolean("forwardingOptionsHintShown", O);
                edit.putBoolean("replyingOptionsHintShown", P);
                edit.putInt("lockRecordAudioVideoHint", N);
                edit.putString("storageCacheDir", !TextUtils.isEmpty(e0) ? e0 : "");
                edit.putBoolean("proxyRotationEnabled", X0);
                edit.putInt("proxyRotationTimeout", Y0);
                TLRPC.TL_help_appUpdate tL_help_appUpdate = g1;
                if (tL_help_appUpdate != null) {
                    try {
                        SerializedData serializedData = new SerializedData(tL_help_appUpdate.getObjectSize());
                        g1.serializeToStream(serializedData);
                        edit.putString("appUpdate", Base64.encodeToString(serializedData.toByteArray(), 0));
                        edit.putInt("appUpdateBuild", h1);
                        serializedData.cleanup();
                    } catch (Exception unused) {
                    }
                } else {
                    edit.remove("appUpdate");
                }
                edit.putLong("appUpdateCheckTime", i1);
                edit.apply();
                SharedPreferences.Editor edit2 = a.b.getSharedPreferences("mainconfig", 0).edit();
                edit2.putBoolean("hasEmailLogin", j1);
                edit2.putBoolean("floatingDebugActive", u1);
                edit2.putBoolean("record_via_sco", r0);
                edit2.apply();
            } catch (Exception e2) {
                fa4.g(e2, true);
            }
        }
    }

    public static void y() {
        ArrayList arrayList = new ArrayList(w1);
        Collections.sort(arrayList, new fx7((byte) 24));
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(-1);
        serializedData.writeByte(3);
        int size = arrayList.size();
        serializedData.writeInt32(size);
        int i2 = size - 1;
        while (true) {
            int i3 = 0;
            if (i2 < 0) {
                a.b.getSharedPreferences("mainconfig", 0).edit().putString("proxy_list", Base64.encodeToString(serializedData.toByteArray(), 2)).apply();
                serializedData.cleanup();
                return;
            }
            fba fbaVar = (fba) arrayList.get(i2);
            serializedData.writeString(fbaVar.a.b);
            serializedData.writeInt32(fbaVar.a.c);
            serializedData.writeString(fbaVar.a.d);
            serializedData.writeString(fbaVar.a.e);
            serializedData.writeString(fbaVar.a.f);
            serializedData.writeInt64(fbaVar.b);
            serializedData.writeInt64(fbaVar.e);
            int F2 = ug8.F(fbaVar.a.a);
            if (F2 == 1) {
                i3 = 1;
            } else if (F2 == 2) {
                i3 = 2;
            }
            serializedData.writeInt32(i3);
            i2--;
        }
    }

    public static void z(int i2) {
        F = i2;
        SharedPreferences.Editor edit = na7.c1().edit();
        edit.putInt("keep_media", F);
        edit.apply();
    }
}
