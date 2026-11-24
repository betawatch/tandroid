package org.telegram.messenger;

import android.R;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class ImportingService extends Service implements gk7 {
    public xk7 a;

    public ImportingService() {
        for (int i = 0; i < 4; i++) {
            kk7.f(i).a(this, kk7.u1);
            kk7.f(i).a(this, kk7.v1);
        }
    }

    public static boolean a() {
        for (int i = 0; i < 4; i++) {
            if (z3a.B(i).G.size() != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if ((i != kk7.u1 && i != kk7.v1) || a() || a()) {
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
        new pl7(a.b).b(5, null);
        for (int i = 0; i < 4; i++) {
            kk7.f(i).n(this, kk7.u1);
            kk7.f(i).n(this, kk7.v1);
        }
        if (w01.a) {
            fa4.b("destroy import service");
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        boolean z;
        if (!a()) {
            for (int i3 = 0; i3 < 4; i3++) {
                if (z3a.B(i3).E.m() == 0) {
                }
            }
            stopSelf();
            return 2;
        }
        if (w01.a) {
            fa4.b("start import service");
        }
        if (this.a == null) {
            im7.c();
            xk7 xk7Var = new xk7(a.b, null);
            this.a = xk7Var;
            xk7Var.F.icon = R.drawable.stat_sys_upload;
            xk7Var.F.when = System.currentTimeMillis();
            xk7 xk7Var2 = this.a;
            xk7Var2.y = im7.k0;
            xk7Var2.e(k96.M0(org.telegram.messenger.beta.R.string.AppName, null));
            int i4 = 0;
            while (true) {
                if (i4 >= 4) {
                    z = false;
                    break;
                }
                if (z3a.B(i4).E.m() != 0) {
                    z = true;
                    break;
                }
                i4++;
            }
            xk7 xk7Var3 = this.a;
            if (z) {
                xk7Var3.k(k96.M0(2131749075, null));
                this.a.d(k96.M0(2131749075, null));
            } else {
                xk7Var3.k(k96.M0(2131749074, null));
                this.a.d(k96.M0(2131749074, null));
            }
        }
        xk7 xk7Var4 = this.a;
        xk7Var4.n = (byte) 100;
        xk7Var4.o = 0;
        xk7Var4.p = true;
        try {
            startForeground(5, xk7Var4.b());
        } catch (Throwable th) {
            fa4.g(th, true);
        }
        new pl7(a.b).e(null, 5, this.a.b());
        return 2;
    }

    public final void onTimeout(int i, int i2) {
        fa4.b("ImportingService timeout, type = " + i2);
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        stopSelf();
    }
}
