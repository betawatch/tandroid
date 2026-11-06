package ai;

import a8.wa;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.BatteryManager;
import android.os.Looper;
import android.os.SystemClock;
import bi.dd;
import bi.ea;
import di.w5;
import di.y6;
import hi.a3;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import kg.t1;
import org.telegram.messenger.AppStartReceiver;
import org.telegram.messenger.KeepAliveJob;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g5;
import org.telegram.messenger.hd;
import org.telegram.messenger.iz;
import org.telegram.messenger.p10;
import org.telegram.messenger.p2;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.r2;
import org.telegram.messenger.rc;
import org.telegram.messenger.support.JobIntentService;
import org.telegram.messenger.tt;
import org.telegram.messenger.x4;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.nb1;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m0 implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ m0(int i7) {
        this.a = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f2 c02;
        int i7 = 4;
        int i10 = 0;
        switch (this.a) {
            case 0:
                hc.X().N(hd.M0(2131745862, null), hd.M0(2131751106, null)).j();
                return;
            case 1:
                wa waVar = bg.i.B;
                if (waVar != null) {
                    ArrayList arrayList = null;
                    for (int i11 = 0; i11 < bg.i.y; i11++) {
                        if (((Bitmap[]) waVar.d)[i11] != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(((Bitmap[]) waVar.d)[i11]);
                        }
                        ((Bitmap[]) waVar.d)[i11] = null;
                        ((bg.d0[]) waVar.c)[i11] = null;
                    }
                    if (!arrayList.isEmpty()) {
                        Utilities.e.c(new bg.e(i10, arrayList));
                    }
                    bg.i.B = null;
                    return;
                }
                return;
            case 2:
                f2 T = LaunchActivity.T();
                if ((T instanceof nb1) && (c02 = ((nb1) T).c0()) != null) {
                    T = c02;
                }
                cc Q = (T != null ? hc.a0(T) : hc.X()).Q(R.raw.ic_delete, 36, hd.M0(2131750215, null));
                Q.t = true;
                Q.j();
                return;
            case 3:
                p2.D.a();
                return;
            case 4:
                f2 T2 = LaunchActivity.T();
                if (T2 == null) {
                    return;
                }
                T2.presentFragment(new dd());
                return;
            case 5:
                ea[][] eaVarArr = ea.S;
                return;
            case 6:
                qs.e().k(99, 512);
                return;
            case 7:
                return;
            case 8:
                int i12 = w5.n1;
                return;
            case 9:
                Comparator comparator = y6.X;
                return;
            case 10:
                int i13 = fi.e0.x0;
                return;
            case 11:
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 12:
                return;
            case 13:
                qp.e1().edit().putInt("storydualhint", qp.e1().getInt("storydualhint", 0) + 1).apply();
                return;
            case 14:
                HashSet hashSet = a3.a1;
                return;
            case 15:
                return;
            case 16:
                int i14 = ji.h.H;
                return;
            case 17:
                t1[] t1VarArr = t1.g;
                return;
            case 18:
                int i15 = AppStartReceiver.a;
                iz.t();
                if (iz.s.length() > 0) {
                    iz.x = true;
                    iz.y();
                }
                org.telegram.messenger.t0.x();
                return;
            case 19:
                boolean z9 = a8.j;
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
                a8.d("ANR thread dump\n" + sb2.toString());
                a8.j();
                a8.c(false);
                return;
            case 20:
                org.telegram.messenger.t0.x();
                return;
            case 21:
                if (((tt) org.telegram.messenger.t0.l()).hasServices()) {
                    ((tt) org.telegram.messenger.t0.l()).onRequestPushToken();
                    return;
                }
                if (r2.a) {
                    ((tt) org.telegram.messenger.t0.l()).getClass();
                    a8.b("No valid Google Play Services APK found.");
                }
                iz.h = "__NO_GOOGLE_PLAY_SERVICES__";
                ((tt) org.telegram.messenger.t0.l()).getClass();
                PushListenerController.sendRegistrationToServer(2, null);
                return;
            case 22:
                return;
            case 23:
                break;
            case 24:
                qs.e().k(qs.i4, new Object[0]);
                return;
            case 25:
                KeepAliveJob.a();
                return;
            case 26:
                if (KeepAliveJob.b || KeepAliveJob.a != null) {
                    return;
                }
                try {
                    if (r2.a) {
                        a8.b("starting keep-alive job");
                    }
                    synchronized (KeepAliveJob.c) {
                        KeepAliveJob.b = true;
                    }
                    JobIntentService.enqueueWork(org.telegram.messenger.t0.b, KeepAliveJob.class, 1000, new Intent());
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 27:
                rc.d(false);
                return;
            case 28:
                int i16 = -1;
                try {
                    BatteryManager batteryManager = (BatteryManager) org.telegram.messenger.t0.b.getSystemService("batterymanager");
                    if (batteryManager != null) {
                        i16 = batteryManager.getIntProperty(4);
                    }
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
                rc.l = SystemClock.elapsedRealtime();
                rc.m = false;
                if (i16 < 0 || i16 > 100) {
                    return;
                }
                rc.l = SystemClock.elapsedRealtime();
                if (rc.k == i16) {
                    return;
                }
                rc.k = i16;
                org.telegram.messenger.g0.h3(new m0(27));
                return;
            default:
                qs.e().k(qs.x4, new Object[0]);
                return;
        }
        while (i10 < 4) {
            if (p10.i(i10).p()) {
                ConnectionsManager.getInstance(i10).resumeNetworkMaybe();
                Utilities.e.c(new x4(g5.r(i10), i7));
            }
            i10++;
        }
    }

    public /* synthetic */ m0(Object obj, int i7) {
        this.a = i7;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }
}
