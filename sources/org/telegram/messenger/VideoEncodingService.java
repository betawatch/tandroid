package org.telegram.messenger;

import android.R;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class VideoEncodingService extends Service implements jm7 {
    public static VideoEncodingService e;
    public an7 a;
    public oo6 b;
    public int c;
    public String d;

    public final void a(oo6 oo6Var) {
        oo6 oo6Var2 = this.b;
        if (oo6Var2 == oo6Var) {
            return;
        }
        int i = nm7.U1;
        int i2 = nm7.V1;
        int i3 = nm7.W1;
        if (oo6Var2 != null) {
            nm7.f(this.c).n(this, i3);
            nm7.f(this.c).n(this, i2);
            nm7.f(this.c).n(this, i);
        }
        if (oo6Var != null) {
            k47 k47Var = oo6Var.a;
            boolean z = k47Var != null && k47.t3(k47Var.k);
            boolean z2 = oo6Var.d;
            an7 an7Var = this.a;
            if (z2) {
                an7Var.k(jb6.M0(2131751705, null));
                this.a.d(jb6.M0(2131751705, null));
            } else if (z) {
                an7Var.k(jb6.M0(2131745313, null));
                this.a.d(jb6.M0(2131745313, null));
            } else {
                an7Var.k(jb6.M0(2131745310, null));
                this.a.d(jb6.M0(2131745310, null));
            }
            an7 an7Var2 = this.a;
            an7Var2.n = (byte) 100;
            an7Var2.o = 0;
            an7Var2.p = true;
        }
        this.b = oo6Var;
        int i4 = oo6Var.c;
        this.c = i4;
        this.d = oo6Var.a.k.attachPath;
        nm7.f(i4).a(this, i3);
        nm7.f(this.c).a(this, i2);
        nm7.f(this.c).a(this, i);
        if (e != null) {
            b();
        }
    }

    public final void b() {
        try {
            if (MediaController.w().b0 == null) {
                return;
            }
            new sn7(a.b).e(null, 4, this.a.b());
        } catch (Throwable th) {
            fc4.g(th, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        String str;
        String str2;
        Object[] objArr2 = 0;
        if (i != nm7.W1) {
            if (i == nm7.U1 || i == nm7.V1) {
                String str3 = (String) objArr[0];
                if (i2 == this.c && (str = this.d) != null && str.equals(str3)) {
                    gm.c3(new scc(this, objArr2 == true ? 1 : 0));
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
            an7 an7Var = this.a;
            boolean z = i3 == 0;
            an7Var.n = (byte) 100;
            an7Var.o = i3;
            an7Var.p = z;
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
        new sn7(a.b).b(4, null);
        nm7.f(this.c).n(this, nm7.W1);
        nm7.f(this.c).n(this, nm7.V1);
        nm7.f(this.c).n(this, nm7.U1);
        this.b = null;
        if (e21.a) {
            fc4.b("VideoEncodingService: destroy video service");
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        oo6 oo6Var;
        if (e != null || (oo6Var = MediaController.w().b0) == null) {
            return 2;
        }
        e = this;
        if (this.a == null) {
            lo7.c();
            an7 an7Var = new an7(a.b, lo7.k0);
            this.a = an7Var;
            an7Var.F.icon = R.drawable.stat_sys_upload;
            an7Var.F.when = System.currentTimeMillis();
            an7 an7Var2 = this.a;
            an7Var2.y = lo7.k0;
            an7Var2.e(jb6.M0(org.telegram.messenger.beta.R.string.AppName, null));
        }
        a(oo6Var);
        byte b = 1;
        try {
            startForeground(4, this.a.b());
        } catch (Throwable th) {
            fc4.g(th, true);
        }
        gm.c3(new scc(this, b));
        return 2;
    }

    public final void onTimeout(int i, int i2) {
        fc4.b("VideoEncodingService timeout, type = " + i2);
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        stopSelf();
    }
}
