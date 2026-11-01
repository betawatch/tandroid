package ag;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.BatteryManager;
import android.os.Environment;
import android.os.Looper;
import android.os.SystemClock;
import java.io.File;
import java.util.Map;
import org.telegram.messenger.AppStartReceiver;
import org.telegram.messenger.KeepAliveJob;
import org.telegram.messenger.LocationSharingService;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a5;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.e9;
import org.telegram.messenger.f8;
import org.telegram.messenger.fu;
import org.telegram.messenger.i5;
import org.telegram.messenger.ic;
import org.telegram.messenger.od;
import org.telegram.messenger.support.JobIntentService;
import org.telegram.messenger.sz;
import org.telegram.messenger.tc;
import org.telegram.messenger.uz;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f3 implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ f3(int i10) {
        this.a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0315  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        org.telegram.ui.ActionBar.k2 Q;
        int i10 = 2;
        int i11 = 4;
        int i12 = 0;
        switch (this.a) {
            case 0:
                i3[] i3VarArr = i3.g;
                return;
            case 1:
                uz.D1 = !uz.D1;
                org.telegram.messenger.w0.b.getSharedPreferences("mainconfig", 0).edit().putBoolean("drawActionBarShadow", uz.D1);
                org.telegram.messenger.i0.c0(LaunchActivity.I1.z0.getRootView(), new z0(i10));
                return;
            case 2:
                String str = "Dark Blue";
                SharedPreferences sharedPreferences = org.telegram.messenger.w0.b.getSharedPreferences("themeconfig", 0);
                String str2 = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (t6.Q0(string) == null || t6.Q0(string).q()) {
                    string = "Blue";
                }
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (t6.Q0(string2) == null || !t6.Q0(string2).q()) {
                    string2 = "Dark Blue";
                }
                s6 s6Var = t6.I;
                if (!string.equals(string2)) {
                    str = string2;
                } else if (s6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                    str = string2;
                    org.telegram.messenger.i0.h3(new fg.d(t6.I.q() ? t6.Q0(str) : t6.Q0(str2), i12), 200L);
                    return;
                }
                str2 = string;
                org.telegram.messenger.i0.h3(new fg.d(t6.I.q() ? t6.Q0(str) : t6.Q0(str2), i12), 200L);
                return;
            case 3:
                ig.h0.b();
                return;
            case 4:
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 5:
                Looper myLooper2 = Looper.myLooper();
                if (myLooper2 != null) {
                    myLooper2.quit();
                    return;
                }
                return;
            case 6:
                at.f(e20.s0).m(at.s3, new Object[0]);
                return;
            case 7:
                float[] fArr = kg.k2.U;
                return;
            case 8:
                mg.i2.l1(0, null);
                return;
            case 9:
                int i13 = AppStartReceiver.a;
                uz.t();
                if (uz.s.length() > 0) {
                    uz.x = true;
                    uz.y();
                }
                org.telegram.messenger.w0.x();
                return;
            case 10:
                boolean z10 = f8.j;
                StringBuilder sb2 = new StringBuilder();
                for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                    Thread key = entry.getKey();
                    StackTraceElement[] value = entry.getValue();
                    sb2.append("Thread: ");
                    sb2.append(key.getName());
                    sb2.append("\n");
                    for (StackTraceElement stackTraceElement : value) {
                        sb2.append("\tat ");
                        sb2.append(stackTraceElement);
                        sb2.append("\n");
                    }
                    sb2.append("\n\n");
                }
                f8.d("ANR thread dump\n" + sb2.toString());
                f8.j();
                f8.c(false);
                return;
            case 11:
                org.telegram.messenger.w0.x();
                return;
            case 12:
                if (((fu) org.telegram.messenger.w0.l()).hasServices()) {
                    ((fu) org.telegram.messenger.w0.l()).onRequestPushToken();
                    return;
                }
                if (org.telegram.messenger.v2.a) {
                    ((fu) org.telegram.messenger.w0.l()).getClass();
                    f8.b("No valid Google Play Services APK found.");
                }
                uz.h = "__NO_GOOGLE_PLAY_SERVICES__";
                ((fu) org.telegram.messenger.w0.l()).getClass();
                PushListenerController.sendRegistrationToServer(2, null);
                return;
            case 13:
                return;
            case 14:
                break;
            case 15:
                at.e().k(at.i4, new Object[0]);
                return;
            case 16:
                KeepAliveJob.a();
                return;
            case 17:
                if (KeepAliveJob.b || KeepAliveJob.a != null) {
                    return;
                }
                try {
                    if (org.telegram.messenger.v2.a) {
                        f8.b("starting keep-alive job");
                    }
                    synchronized (KeepAliveJob.c) {
                        KeepAliveJob.b = true;
                    }
                    JobIntentService.enqueueWork(org.telegram.messenger.w0.b, KeepAliveJob.class, 1000, new Intent());
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 18:
                tc.d(false);
                return;
            case 19:
                int i14 = -1;
                try {
                    BatteryManager batteryManager = (BatteryManager) org.telegram.messenger.w0.b.getSystemService("batterymanager");
                    if (batteryManager != null) {
                        i14 = batteryManager.getIntProperty(4);
                    }
                } catch (Throwable th2) {
                    f8.g(th2, true);
                }
                tc.l = SystemClock.elapsedRealtime();
                tc.m = false;
                if (i14 < 0 || i14 > 100) {
                    return;
                }
                tc.l = SystemClock.elapsedRealtime();
                if (tc.k == i14) {
                    return;
                }
                tc.k = i14;
                org.telegram.messenger.i0.g3(new f3(18));
                return;
            case 20:
                at.e().k(at.x4, new Object[0]);
                return;
            case 21:
                at.e().k(at.E4, new Object[0]);
                return;
            case 22:
                int i15 = LocationSharingService.d;
                while (i12 < 4) {
                    od.f(i12).t();
                    i12++;
                }
                return;
            case 23:
                MediaController.X1 = null;
                MediaController.O(0);
                return;
            case 24:
                try {
                    g0.f.n(org.telegram.messenger.w0.b);
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            case 25:
                t6.F(false);
                return;
            case 26:
                at.e().k(at.d4, new Object[0]);
                return;
            case 27:
                uz.y();
                return;
            case 28:
                try {
                    File file = new File(Environment.getExternalStorageDirectory(), "Telegram");
                    File file2 = new File(file, "Telegram Images");
                    file2.mkdir();
                    File file3 = new File(file, "Telegram Video");
                    file3.mkdir();
                    if (org.telegram.messenger.v2.b) {
                        if (file2.isDirectory()) {
                            org.telegram.messenger.i0.G(new File(file2, ".nomedia"));
                        }
                        if (file3.isDirectory()) {
                            org.telegram.messenger.i0.G(new File(file3, ".nomedia"));
                            return;
                        }
                        return;
                    }
                    if (file2.isDirectory()) {
                        new File(file2, ".nomedia").delete();
                    }
                    if (file3.isDirectory()) {
                        new File(file3, ".nomedia").delete();
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    f8.g(th3, true);
                    return;
                }
            default:
                if (uz.b || (Q = LaunchActivity.Q()) == null || Q.getParentActivity() == null) {
                    return;
                }
                uz.h0 = null;
                uz.y();
                ic.D().i(new sz(i12));
                uz.b = true;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(Q.getParentActivity());
                alertDialog$Builder.a.R = dd.L0(2131745855, null);
                alertDialog$Builder.a.S = dd.L0(2131745854, null);
                alertDialog$Builder.k(dd.L0(2131751356, null), new e9(25));
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.setCanceledOnTouchOutside(false);
                x1Var.show();
                return;
        }
        while (i12 < 4) {
            if (e20.i(i12).p()) {
                ConnectionsManager.getInstance(i12).resumeNetworkMaybe();
                Utilities.e.c(new a5(i5.r(i12), i11));
            }
            i12++;
        }
    }

    private final void a() {
    }
}
