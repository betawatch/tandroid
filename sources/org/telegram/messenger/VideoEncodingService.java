package org.telegram.messenger;

import android.R;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class VideoEncodingService extends Service implements gk7 {
    public static VideoEncodingService e;
    public xk7 a;
    public om6 b;
    public int c;
    public String d;

    public final void a(om6 om6Var) {
        om6 om6Var2 = this.b;
        if (om6Var2 == om6Var) {
            return;
        }
        int i = kk7.T1;
        int i2 = kk7.U1;
        int i3 = kk7.V1;
        if (om6Var2 != null) {
            kk7.f(this.c).n(this, i3);
            kk7.f(this.c).n(this, i2);
            kk7.f(this.c).n(this, i);
        }
        if (om6Var != null) {
            k27 k27Var = om6Var.a;
            boolean z = k27Var != null && k27.t3(k27Var.k);
            boolean z2 = om6Var.d;
            xk7 xk7Var = this.a;
            if (z2) {
                xk7Var.k(k96.M0(2131751756, null));
                this.a.d(k96.M0(2131751756, null));
            } else if (z) {
                xk7Var.k(k96.M0(2131745387, null));
                this.a.d(k96.M0(2131745387, null));
            } else {
                xk7Var.k(k96.M0(2131745384, null));
                this.a.d(k96.M0(2131745384, null));
            }
            xk7 xk7Var2 = this.a;
            xk7Var2.n = (byte) 100;
            xk7Var2.o = 0;
            xk7Var2.p = true;
        }
        this.b = om6Var;
        int i4 = om6Var.c;
        this.c = i4;
        this.d = om6Var.a.k.attachPath;
        kk7.f(i4).a(this, i3);
        kk7.f(this.c).a(this, i2);
        kk7.f(this.c).a(this, i);
        if (e != null) {
            b();
        }
    }

    public final void b() {
        try {
            if (MediaController.w().b0 == null) {
                return;
            }
            new pl7(a.b).e(null, 4, this.a.b());
        } catch (Throwable th) {
            fa4.g(th, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        String str;
        String str2;
        Object[] objArr2 = 0;
        if (i != kk7.V1) {
            if (i == kk7.T1 || i == kk7.U1) {
                String str3 = (String) objArr[0];
                if (i2 == this.c && (str = this.d) != null && str.equals(str3)) {
                    gl.d3(new pac(this, objArr2 == true ? 1 : 0));
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
            xk7 xk7Var = this.a;
            boolean z = i3 == 0;
            xk7Var.n = (byte) 100;
            xk7Var.o = i3;
            xk7Var.p = z;
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
        new pl7(a.b).b(4, null);
        kk7.f(this.c).n(this, kk7.V1);
        kk7.f(this.c).n(this, kk7.U1);
        kk7.f(this.c).n(this, kk7.T1);
        this.b = null;
        if (w01.a) {
            fa4.b("VideoEncodingService: destroy video service");
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        om6 om6Var;
        if (e != null || (om6Var = MediaController.w().b0) == null) {
            return 2;
        }
        e = this;
        if (this.a == null) {
            im7.c();
            xk7 xk7Var = new xk7(a.b, im7.k0);
            this.a = xk7Var;
            xk7Var.F.icon = R.drawable.stat_sys_upload;
            xk7Var.F.when = System.currentTimeMillis();
            xk7 xk7Var2 = this.a;
            xk7Var2.y = im7.k0;
            xk7Var2.e(k96.M0(org.telegram.messenger.beta.R.string.AppName, null));
        }
        a(om6Var);
        byte b = 1;
        try {
            startForeground(4, this.a.b());
        } catch (Throwable th) {
            fa4.g(th, true);
        }
        gl.d3(new pac(this, b));
        return 2;
    }

    public final void onTimeout(int i, int i2) {
        fa4.b("VideoEncodingService timeout, type = " + i2);
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        stopSelf();
    }
}
