package org.telegram.messenger;

import android.R;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class ImportingService extends Service implements cs {
    public e0.q a;

    public ImportingService() {
        for (int i3 = 0; i3 < 4; i3++) {
            hs.f(i3).b(this, hs.v1);
            hs.f(i3).b(this, hs.w1);
        }
    }

    public static boolean a() {
        for (int i3 = 0; i3 < 4; i3++) {
            if (yy.C(i3).G.size() != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if ((i3 != hs.v1 && i3 != hs.w1) || a() || a()) {
            return;
        }
        stopSelf();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        new e0.j0(t0.b).b(5, null);
        for (int i3 = 0; i3 < 4; i3++) {
            hs.f(i3).n(this, hs.v1);
            hs.f(i3).n(this, hs.w1);
        }
        if (r2.a) {
            a8.b("destroy import service");
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i3, int i10) {
        if (!a()) {
            for (int i11 = 0; i11 < 4; i11++) {
                if (yy.C(i11).E.m() == 0) {
                }
            }
            stopSelf();
            return 2;
        }
        if (r2.a) {
            a8.b("start import service");
        }
        if (this.a == null) {
            us.i();
            e0.q qVar = new e0.q(t0.b, null);
            this.a = qVar;
            qVar.F.icon = R.drawable.stat_sys_upload;
            qVar.F.when = System.currentTimeMillis();
            e0.q qVar2 = this.a;
            qVar2.y = us.k0;
            qVar2.g(bd.M0(org.telegram.messenger.beta.R.string.AppName, null));
            int i12 = 0;
            while (true) {
                if (i12 >= 4) {
                    this.a.p(bd.M0(2131749274, null));
                    this.a.f(bd.M0(2131749274, null));
                    break;
                }
                if (yy.C(i12).E.m() != 0) {
                    this.a.p(bd.M0(2131749275, null));
                    this.a.f(bd.M0(2131749275, null));
                    break;
                }
                i12++;
            }
        }
        e0.q qVar3 = this.a;
        qVar3.n = 100;
        qVar3.o = 0;
        qVar3.p = true;
        try {
            startForeground(5, qVar3.b());
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        new e0.j0(t0.b).e(null, 5, this.a.b());
        return 2;
    }

    public final void onTimeout(int i3, int i10) {
        a8.b("ImportingService timeout, type = " + i10);
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        stopSelf();
    }
}
