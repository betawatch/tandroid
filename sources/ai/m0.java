package ai;

import a8.wa;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.BatteryManager;
import android.os.Looper;
import android.os.SystemClock;
import bi.dd;
import bi.ea;
import di.x5;
import di.z6;
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
import org.telegram.messenger.id;
import org.telegram.messenger.iz;
import org.telegram.messenger.k4;
import org.telegram.messenger.p10;
import org.telegram.messenger.p2;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.r2;
import org.telegram.messenger.rc;
import org.telegram.messenger.sc;
import org.telegram.messenger.support.JobIntentService;
import org.telegram.messenger.tt;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qb1;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class m0 implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ m0(int i7) {
        this.a = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f2 c02;
        int i7 = 0;
        switch (this.a) {
            case 0:
                hc.X().N(id.M0(2131745861, null), id.M0(2131751105, null)).j();
                return;
            case 1:
                wa waVar = bg.i.B;
                if (waVar != null) {
                    ArrayList arrayList = null;
                    for (int i10 = 0; i10 < bg.i.y; i10++) {
                        if (((Bitmap[]) waVar.d)[i10] != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(((Bitmap[]) waVar.d)[i10]);
                        }
                        ((Bitmap[]) waVar.d)[i10] = null;
                        ((bg.d0[]) waVar.c)[i10] = null;
                    }
                    if (!arrayList.isEmpty()) {
                        Utilities.e.c(new bg.e(i7, arrayList));
                    }
                    bg.i.B = null;
                    return;
                }
                return;
            case 2:
                f2 T = LaunchActivity.T();
                if ((T instanceof qb1) && (c02 = ((qb1) T).c0()) != null) {
                    T = c02;
                }
                cc Q = (T != null ? hc.a0(T) : hc.X()).Q(R.raw.ic_delete, 36, id.M0(2131750216, null));
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
                int i11 = x5.n1;
                return;
            case 9:
                Comparator comparator = z6.X;
                return;
            case 10:
                int i12 = fi.e0.x0;
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
                int i13 = ji.h.H;
                return;
            case 17:
                t1[] t1VarArr = t1.g;
                return;
            case 18:
                int i14 = AppStartReceiver.a;
                iz.t();
                if (iz.s.length() > 0) {
                    iz.x = true;
                    iz.y();
                }
                org.telegram.messenger.t0.x();
                return;
            case 19:
                Utilities.e.c(new m0(22));
                return;
            case 20:
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
            case 21:
                org.telegram.messenger.t0.x();
                return;
            case 22:
                org.telegram.utils.twidget.i1.c(org.telegram.messenger.t0.b);
                return;
            case 23:
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
            case 24:
                return;
            case 25:
                break;
            case 26:
                qs.e().k(qs.i4, new Object[0]);
                return;
            case 27:
                KeepAliveJob.a();
                return;
            case 28:
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
            default:
                int i15 = -1;
                try {
                    BatteryManager batteryManager = (BatteryManager) org.telegram.messenger.t0.b.getSystemService("batterymanager");
                    if (batteryManager != null) {
                        i15 = batteryManager.getIntProperty(4);
                    }
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
                sc.l = SystemClock.elapsedRealtime();
                sc.m = false;
                if (i15 < 0 || i15 > 100) {
                    return;
                }
                sc.l = SystemClock.elapsedRealtime();
                if (sc.k == i15) {
                    return;
                }
                sc.k = i15;
                org.telegram.messenger.g0.h3(new rc(i7));
                return;
        }
        while (i7 < 4) {
            if (p10.i(i7).p()) {
                ConnectionsManager.getInstance(i7).resumeNetworkMaybe();
                Utilities.e.c(new k4(g5.r(i7), 3));
            }
            i7++;
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
