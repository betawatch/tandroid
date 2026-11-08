package org.telegram.messenger;

import android.R;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public class ImportingService extends Service implements ls {
    public e0.q a;

    public ImportingService() {
        for (int i7 = 0; i7 < 4; i7++) {
            qs.f(i7).b(this, qs.v1);
            qs.f(i7).b(this, qs.w1);
        }
    }

    public static boolean a() {
        for (int i7 = 0; i7 < 4; i7++) {
            if (gz.C(i7).F.size() != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if ((i7 != qs.v1 && i7 != qs.w1) || a() || a()) {
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
        new e0.i0(t0.b).b(5, null);
        for (int i7 = 0; i7 < 4; i7++) {
            qs.f(i7).n(this, qs.v1);
            qs.f(i7).n(this, qs.w1);
        }
        if (r2.a) {
            a8.b("destroy import service");
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i10) {
        if (!a()) {
            for (int i11 = 0; i11 < 4; i11++) {
                if (gz.C(i11).D.m() == 0) {
                }
            }
            stopSelf();
            return 2;
        }
        if (r2.a) {
            a8.b("start import service");
        }
        if (this.a == null) {
            dt.i();
            e0.q qVar = new e0.q(t0.b, null);
            this.a = qVar;
            qVar.F.icon = R.drawable.stat_sys_upload;
            qVar.F.when = System.currentTimeMillis();
            e0.q qVar2 = this.a;
            qVar2.y = dt.j0;
            qVar2.g(id.M0(org.telegram.messenger.beta.R.string.AppName, null));
            int i12 = 0;
            while (true) {
                if (i12 >= 4) {
                    this.a.p(id.M0(2131749267, null));
                    this.a.f(id.M0(2131749267, null));
                    break;
                }
                if (gz.C(i12).D.m() != 0) {
                    this.a.p(id.M0(2131749268, null));
                    this.a.f(id.M0(2131749268, null));
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
        new e0.i0(t0.b).e(null, 5, this.a.b());
        return 2;
    }

    public final void onTimeout(int i7, int i10) {
        a8.b("ImportingService timeout, type = " + i10);
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        stopSelf();
    }
}
