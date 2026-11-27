package org.telegram.messenger;

import android.R;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class VideoEncodingService extends Service implements fn7 {
    public static VideoEncodingService e;
    public wn7 a;
    public so6 b;
    public int c;
    public String d;

    public final void a(so6 so6Var) {
        so6 so6Var2 = this.b;
        if (so6Var2 == so6Var) {
            return;
        }
        int i = jn7.U1;
        int i2 = jn7.V1;
        int i3 = jn7.W1;
        if (so6Var2 != null) {
            jn7.f(this.c).n(this, i3);
            jn7.f(this.c).n(this, i2);
            jn7.f(this.c).n(this, i);
        }
        if (so6Var != null) {
            r47 r47Var = so6Var.a;
            boolean z = r47Var != null && r47.t3(r47Var.k);
            boolean z2 = so6Var.d;
            wn7 wn7Var = this.a;
            if (z2) {
                wn7Var.k(ob6.M0(2131751733, null));
                this.a.d(ob6.M0(2131751733, null));
            } else if (z) {
                wn7Var.k(ob6.M0(2131745307, null));
                this.a.d(ob6.M0(2131745307, null));
            } else {
                wn7Var.k(ob6.M0(2131745304, null));
                this.a.d(ob6.M0(2131745304, null));
            }
            wn7 wn7Var2 = this.a;
            wn7Var2.n = (byte) 100;
            wn7Var2.o = 0;
            wn7Var2.p = true;
        }
        this.b = so6Var;
        int i4 = so6Var.c;
        this.c = i4;
        this.d = so6Var.a.k.attachPath;
        jn7.f(i4).a(this, i3);
        jn7.f(this.c).a(this, i2);
        jn7.f(this.c).a(this, i);
        if (e != null) {
            b();
        }
    }

    public final void b() {
        try {
            if (MediaController.z().b0 == null) {
                return;
            }
            new oo7(a.b).e(null, 4, this.a.b());
        } catch (Throwable th) {
            cc4.g(th, true);
        }
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        String str;
        String str2;
        char c = 1;
        if (i != jn7.W1) {
            if (i == jn7.U1 || i == jn7.V1) {
                String str3 = (String) objArr[0];
                if (i2 == this.c && (str = this.d) != null && str.equals(str3)) {
                    hl.c3(new pec(this, c == true ? 1 : 0));
                    return;
                }
                return;
            }
            return;
        }
        String str4 = (String) objArr[0];
        if (i2 == this.c && (str2 = this.d) != null && str2.equals(str4)) {
            float min = Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue());
            int i3 = (int) (min * 100.0f);
            wn7 wn7Var = this.a;
            boolean z = i3 == 0;
            wn7Var.n = (byte) 100;
            wn7Var.o = i3;
            wn7Var.p = z;
            b();
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        e = null;
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        new oo7(a.b).b(4, null);
        jn7.f(this.c).n(this, jn7.W1);
        jn7.f(this.c).n(this, jn7.V1);
        jn7.f(this.c).n(this, jn7.U1);
        this.b = null;
        if (f11.a) {
            cc4.b("VideoEncodingService: destroy video service");
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        so6 so6Var;
        if (e != null || (so6Var = MediaController.z().b0) == null) {
            return 2;
        }
        e = this;
        if (this.a == null) {
            ip7.c();
            wn7 wn7Var = new wn7(a.b, ip7.k0);
            this.a = wn7Var;
            wn7Var.F.icon = R.drawable.stat_sys_upload;
            wn7Var.F.when = System.currentTimeMillis();
            wn7 wn7Var2 = this.a;
            wn7Var2.y = ip7.k0;
            wn7Var2.e(ob6.M0(org.telegram.messenger.beta.R.string.AppName, null));
        }
        a(so6Var);
        try {
            startForeground(4, this.a.b());
        } catch (Throwable th) {
            cc4.g(th, true);
        }
        hl.c3(new pec(this, (byte) 0));
        return 2;
    }

    public final void onTimeout(int i, int i2) {
        cc4.b("VideoEncodingService timeout, type = " + i2);
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        stopSelf();
    }
}
