package org.telegram.messenger;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.z80;
import org.telegram.utils.twidget.WidgetEngineService;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class t0 extends Application {
    public static volatile boolean D = true;
    public static volatile boolean E = true;
    public static boolean F = false;
    public static volatile long G = 0;
    public static tt H = null;
    public static nb.a I = null;
    public static h6.m J = null;
    public static t0 a = null;
    public static volatile Context b = null;
    public static volatile NetworkInfo c = null;
    public static volatile Handler d = null;
    public static ConnectivityManager e = null;
    public static volatile boolean f = false;
    public static volatile s0 h = null;
    public static long n = 0;
    public static int r = -1;
    public static long s = 0;
    public static volatile boolean w = false;
    public static volatile boolean x = true;
    public static volatile boolean y = true;

    public static void a(Throwable th2) {
        ((ApplicationLoaderImpl) a).getClass();
        try {
            w9.b bVar = (w9.b) o9.g.c().b(w9.b.class);
            if (bVar == null) {
                throw new NullPointerException("FirebaseCrashlytics component is not present.");
            }
            if (th2 == null) {
                Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
                return;
            }
            aa.u uVar = bVar.a;
            Map map = Collections.EMPTY_MAP;
            uVar.n.a.a(new a1.e(uVar, th2));
        } catch (Throwable th3) {
            a8.g(th3, false);
        }
    }

    public static void c(boolean z9) {
        if (z9 || c == null) {
            try {
                if (e == null) {
                    e = (ConnectivityManager) b.getSystemService("connectivity");
                }
                c = e.getActiveNetworkInfo();
                if (Build.VERSION.SDK_INT < 24 || h != null) {
                    return;
                }
                h = new s0();
                e.registerDefaultNetworkCallback(h);
            } catch (Throwable unused) {
            }
        }
    }

    public static void d() {
        a.getClass();
    }

    public static int e() {
        int i7;
        try {
            c(false);
            if (c != null) {
                if (c.getType() != 1 && c.getType() != 9) {
                    if (c.isRoaming()) {
                        return 2;
                    }
                }
                if (Build.VERSION.SDK_INT >= 24 && (((i7 = r) == 0 || i7 == 1) && System.currentTimeMillis() - n < 5000)) {
                    return r;
                }
                if (e.isActiveNetworkMetered()) {
                    r = 0;
                } else {
                    r = 1;
                }
                n = System.currentTimeMillis();
                return r;
            }
            return 0;
        } catch (Exception e10) {
            a8.g(e10, true);
            return 0;
        }
    }

    public static int f() {
        if (o()) {
            return 1;
        }
        return t() ? 2 : 0;
    }

    public static File h() {
        for (int i7 = 0; i7 < 10; i7++) {
            File filesDir = b.getFilesDir();
            if (filesDir != null) {
                return filesDir;
            }
        }
        try {
            File file = new File(b.getApplicationInfo().dataDir, "files");
            file.mkdirs();
            return file;
        } catch (Exception e10) {
            a8.g(e10, true);
            return new File("/data/data/org.telegram.messenger/files");
        }
    }

    public static File i() {
        try {
            File file = new File(h(), "rasterized/wallpaper");
            file.mkdirs();
            return file;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static ILocationServiceProvider j() {
        if (J == null) {
            a.getClass();
            h6.m mVar = new h6.m(19);
            J = mVar;
            mVar.init(b);
        }
        return J;
    }

    public static IMapsProvider k() {
        if (I == null) {
            a.getClass();
            I = new nb.a(17);
        }
        return I;
    }

    public static PushListenerController.IPushListenerServiceProvider l() {
        if (H == null) {
            a.getClass();
            H = tt.b;
        }
        return H;
    }

    public static void m() {
        a.getClass();
    }

    public static void n() {
        a.getClass();
    }

    public static boolean o() {
        try {
            c(false);
            if (c != null) {
                if (c.getType() != 1) {
                    if (c.getType() == 9) {
                    }
                }
                NetworkInfo.State state = c.getState();
                if (state != NetworkInfo.State.CONNECTED && state != NetworkInfo.State.CONNECTING) {
                    if (state == NetworkInfo.State.SUSPENDED) {
                    }
                }
                return true;
            }
            return false;
        } catch (Exception e10) {
            a8.g(e10, true);
            return false;
        }
    }

    public static boolean p() {
        try {
            c(false);
            if (c != null && c.getType() == 0) {
                int subtype = c.getSubtype();
                if (subtype == 1 || subtype == 2 || subtype == 4 || subtype == 7 || subtype == 11) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static void r() {
        a.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
    
        if (r1.isConnectedOrConnecting() != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean s() {
        NetworkInfo networkInfo;
        boolean z9 = true;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) b.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if ((activeNetworkInfo == null || (!activeNetworkInfo.isConnectedOrConnecting() && !activeNetworkInfo.isAvailable())) && ((networkInfo = connectivityManager.getNetworkInfo(0)) == null || !networkInfo.isConnectedOrConnecting())) {
                NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(1);
                if (networkInfo2 != null) {
                }
                z9 = false;
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        boolean z10 = r2.a;
        return z9;
    }

    public static boolean t() {
        try {
            c(false);
            if (c != null) {
                if (c.isRoaming()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            a8.g(e10, true);
            return false;
        }
    }

    public static void u() {
        a.getClass();
    }

    public static void w() {
        if (f || b == null) {
            return;
        }
        f = true;
        as.f(b);
        try {
            id.E0();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        try {
            e = (ConnectivityManager) b.getSystemService("connectivity");
            b.registerReceiver(new q0(0), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        try {
            IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            b.registerReceiver(new q0(3), intentFilter);
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        try {
            sc.h(b.registerReceiver(new q0(1), new IntentFilter("android.intent.action.BATTERY_CHANGED")));
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        try {
            w = ((PowerManager) b.getSystemService("power")).isScreenOn();
            if (r2.a) {
                a8.b("screen state = " + w);
            }
        } catch (Exception e13) {
            e13.printStackTrace();
        }
        iz.t();
        b6.g = b.getSharedPreferences("webview_bots", 0);
        for (int i7 = 0; i7 < 4; i7++) {
            p10.i(i7).s();
            qp.s1(i7);
            if (i7 == 0) {
                iz.h = "__FIREBASE_GENERATING_SINCE_" + ConnectionsManager.getInstance(i7).getCurrentTime() + "__";
            } else {
                ConnectionsManager.getInstance(i7);
            }
            TLRPC.User f10 = p10.i(i7).f();
            if (f10 != null) {
                qp.s1(i7).X3(f10, true, false);
                yr messagesStorage = gz.C(i7).getMessagesStorage();
                messagesStorage.a.c(new rq(messagesStorage, 23));
            }
        }
        ((t0) b).getClass();
        g0.i3(new ai.m0(23), 1000L);
        if (r2.a) {
            a8.b("app initied");
        }
        MediaController.B();
        for (int i10 = 0; i10 < 4; i10++) {
            g5 r10 = g5.r(i10);
            r10.a = null;
            Utilities.e.c(new k4(r10, 0));
            z5.q(i10);
        }
        r1.i().q();
        g0.i3(new ai.m0(19), 3000L);
    }

    public static void x() {
        SharedPreferences f12 = qp.f1();
        if (!(f12.contains("pushService") ? f12.getBoolean("pushService", true) : qp.s1(p10.s0).e7.getBoolean("keepAliveService", false))) {
            b.stopService(new Intent(b, (Class<?>) NotificationsService.class));
        } else {
            try {
                b.startService(new Intent(b, (Class<?>) NotificationsService.class));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public abstract boolean b(Context context);

    public abstract File g();

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            id.E0().W0(configuration);
            g0.v(b, configuration);
            VideoCapturerDevice.checkScreenCapturerSize();
            g0.d3();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.app.Application
    public final void onCreate() {
        String str;
        a = this;
        try {
            b = getApplicationContext();
        } catch (Throwable unused) {
        }
        super.onCreate();
        if (WidgetEngineService.c()) {
            return;
        }
        Typeface typeface = g0.a;
        if (r2.a) {
            a8.b("Hello World!");
            StringBuilder sb2 = new StringBuilder("app start time = ");
            long elapsedRealtime = SystemClock.elapsedRealtime();
            s = elapsedRealtime;
            jg.g.u(elapsedRealtime, sb2);
            try {
                PackageInfo packageInfo = b.getPackageManager().getPackageInfo(b.getPackageName(), 0);
                int i7 = packageInfo.versionCode % 10;
                if (i7 == 1 || i7 == 2) {
                    str = "store bundled " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                } else {
                    u();
                    str = "universal " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                }
                Locale locale = Locale.US;
                String str2 = packageInfo.versionName;
                int i10 = packageInfo.versionCode;
                a8.b("buildVersion = ".concat("v" + str2 + " (" + (i10 / 10) + "[" + (i10 % 10) + "]) " + str));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            StringBuilder sb3 = new StringBuilder("device = manufacturer=");
            sb3.append(Build.MANUFACTURER);
            sb3.append(", device=");
            sb3.append(Build.DEVICE);
            sb3.append(", model=");
            sb3.append(Build.MODEL);
            sb3.append(", product=");
            org.telegram.ui.Cells.f1.u(Build.PRODUCT, sb3);
        }
        if (b == null) {
            b = getApplicationContext();
        }
        as.f(b);
        try {
            ConnectionsManager.native_setJava(false);
            new r0(this);
            new b(new ai.m0(20));
            if (r2.a) {
                a8.b("load libs time = " + (SystemClock.elapsedRealtime() - s));
            }
            d = new Handler(b.getMainLooper());
            g0.h3(new ai.m0(21));
            z80[] values = z80.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    c8.ua.b(z80.h);
                    break;
                } else if (c8.ua.a(values[i11])) {
                    break;
                } else {
                    i11++;
                }
            }
            qt qtVar = qt.c;
            for (int i12 = 0; i12 < 4; i12++) {
                qs.f(i12).b(qtVar, qs.T1);
            }
            qs.e().b(qtVar, qs.B4);
            qs.e().b(qtVar, qs.A4);
        } catch (UnsatisfiedLinkError unused2) {
            throw new RuntimeException("can't load native libraries " + Build.CPU_ABI + " lookup folder " + as.d());
        }
    }

    public abstract boolean q();

    public abstract boolean v(Activity activity, TLRPC.Document document);
}
