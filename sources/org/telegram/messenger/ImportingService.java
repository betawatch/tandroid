package org.telegram.messenger;

import android.R;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public class ImportingService extends Service implements gs {
    public e0.q a;

    public ImportingService() {
        for (int i7 = 0; i7 < 4; i7++) {
            ls.f(i7).b(this, ls.v1);
            ls.f(i7).b(this, ls.w1);
        }
    }

    public static boolean a() {
        for (int i7 = 0; i7 < 4; i7++) {
            if (az.C(i7).G.size() != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if ((i7 != ls.v1 && i7 != ls.w1) || a() || a()) {
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
            ls.f(i7).n(this, ls.v1);
            ls.f(i7).n(this, ls.w1);
        }
        if (s2.a) {
            a8.b("destroy import service");
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i10) {
        if (!a()) {
            for (int i11 = 0; i11 < 4; i11++) {
                if (az.C(i11).E.m() == 0) {
                }
            }
            stopSelf();
            return 2;
        }
        if (s2.a) {
            a8.b("start import service");
        }
        if (this.a == null) {
            ys.i();
            e0.q qVar = new e0.q(t0.b, null);
            this.a = qVar;
            qVar.F.icon = R.drawable.stat_sys_upload;
            qVar.F.when = System.currentTimeMillis();
            e0.q qVar2 = this.a;
            qVar2.y = ys.k0;
            qVar2.g(hd.N0(org.telegram.messenger.beta.R.string.AppName, null));
            int i12 = 0;
            while (true) {
                if (i12 >= 4) {
                    this.a.p(hd.N0(2131749073, null));
                    this.a.f(hd.N0(2131749073, null));
                    break;
                }
                if (az.C(i12).E.m() != 0) {
                    this.a.p(hd.N0(2131749074, null));
                    this.a.f(hd.N0(2131749074, null));
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
