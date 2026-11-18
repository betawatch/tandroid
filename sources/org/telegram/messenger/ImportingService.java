package org.telegram.messenger;

import android.R;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public class ImportingService extends Service implements fs {
    public e0.q a;

    public ImportingService() {
        for (int i7 = 0; i7 < 4; i7++) {
            ks.f(i7).b(this, ks.v1);
            ks.f(i7).b(this, ks.w1);
        }
    }

    public static boolean a() {
        for (int i7 = 0; i7 < 4; i7++) {
            if (zy.C(i7).G.size() != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if ((i7 != ks.v1 && i7 != ks.w1) || a() || a()) {
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
            ks.f(i7).n(this, ks.v1);
            ks.f(i7).n(this, ks.w1);
        }
        if (s2.a) {
            a8.b("destroy import service");
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i10) {
        if (!a()) {
            for (int i11 = 0; i11 < 4; i11++) {
                if (zy.C(i11).E.m() == 0) {
                }
            }
            stopSelf();
            return 2;
        }
        if (s2.a) {
            a8.b("start import service");
        }
        if (this.a == null) {
            xs.i();
            e0.q qVar = new e0.q(t0.b, null);
            this.a = qVar;
            qVar.F.icon = R.drawable.stat_sys_upload;
            qVar.F.when = System.currentTimeMillis();
            e0.q qVar2 = this.a;
            qVar2.y = xs.k0;
            qVar2.g(gd.M0(org.telegram.messenger.beta.R.string.AppName, null));
            int i12 = 0;
            while (true) {
                if (i12 >= 4) {
                    this.a.p(gd.M0(2131749074, null));
                    this.a.f(gd.M0(2131749074, null));
                    break;
                }
                if (zy.C(i12).E.m() != 0) {
                    this.a.p(gd.M0(2131749075, null));
                    this.a.f(gd.M0(2131749075, null));
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
