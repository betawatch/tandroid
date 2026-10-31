package org.telegram.messenger;

import android.R;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class ImportingService extends Service implements us {
    public e0.r a;

    public ImportingService() {
        for (int i10 = 0; i10 < 4; i10++) {
            zs.f(i10).b(this, zs.v1);
            zs.f(i10).b(this, zs.w1);
        }
    }

    public static boolean a() {
        for (int i10 = 0; i10 < 4; i10++) {
            if (qz.C(i10).F.size() != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if ((i10 != zs.v1 && i10 != zs.w1) || a() || a()) {
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
        new e0.k0(w0.b).b(5, null);
        for (int i10 = 0; i10 < 4; i10++) {
            zs.f(i10).n(this, zs.v1);
            zs.f(i10).n(this, zs.w1);
        }
        if (v2.a) {
            f8.b("destroy import service");
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        if (!a()) {
            for (int i12 = 0; i12 < 4; i12++) {
                if (qz.C(i12).D.m() == 0) {
                }
            }
            stopSelf();
            return 2;
        }
        if (v2.a) {
            f8.b("start import service");
        }
        if (this.a == null) {
            ot.i();
            e0.r rVar = new e0.r(w0.b, null);
            this.a = rVar;
            rVar.F.icon = R.drawable.stat_sys_upload;
            rVar.F.when = System.currentTimeMillis();
            e0.r rVar2 = this.a;
            rVar2.y = ot.j0;
            rVar2.g(cd.L0(org.telegram.messenger.beta.R.string.AppName, null));
            int i13 = 0;
            while (true) {
                if (i13 >= 4) {
                    this.a.p(cd.L0(2131749275, null));
                    this.a.f(cd.L0(2131749275, null));
                    break;
                }
                if (qz.C(i13).D.m() != 0) {
                    this.a.p(cd.L0(2131749276, null));
                    this.a.f(cd.L0(2131749276, null));
                    break;
                }
                i13++;
            }
        }
        e0.r rVar3 = this.a;
        rVar3.n = 100;
        rVar3.o = 0;
        rVar3.p = true;
        try {
            startForeground(5, rVar3.b());
        } catch (Throwable th2) {
            f8.g(th2, true);
        }
        new e0.k0(w0.b).e(null, 5, this.a.b());
        return 2;
    }

    public final void onTimeout(int i10, int i11) {
        f8.b("ImportingService timeout, type = " + i11);
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        stopSelf();
    }
}
