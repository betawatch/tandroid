package org.telegram.messenger;

import android.R;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public class VideoEncodingService extends Service implements is {
    public static VideoEncodingService e;
    public e0.q a;
    public kf b;
    public int c;
    public String d;

    public final void a(kf kfVar) {
        kf kfVar2 = this.b;
        if (kfVar2 == kfVar) {
            return;
        }
        int i7 = ns.U1;
        int i10 = ns.V1;
        int i11 = ns.W1;
        if (kfVar2 != null) {
            ns.f(this.c).n(this, i11);
            ns.f(this.c).n(this, i10);
            ns.f(this.c).n(this, i7);
        }
        if (kfVar != null) {
            gj gjVar = kfVar.a;
            boolean z10 = gjVar != null && gj.t3(gjVar.k);
            if (kfVar.d) {
                this.a.p(hd.M0(2131751768, null));
                this.a.f(hd.M0(2131751768, null));
            } else if (z10) {
                this.a.p(hd.M0(2131745579, null));
                this.a.f(hd.M0(2131745579, null));
            } else {
                this.a.p(hd.M0(2131745576, null));
                this.a.f(hd.M0(2131745576, null));
            }
            e0.q qVar = this.a;
            qVar.n = 100;
            qVar.o = 0;
            qVar.p = true;
        }
        this.b = kfVar;
        int i12 = kfVar.c;
        this.c = i12;
        this.d = kfVar.a.k.attachPath;
        ns.f(i12).b(this, i11);
        ns.f(this.c).b(this, i10);
        ns.f(this.c).b(this, i7);
        if (e != null) {
            b();
        }
    }

    public final void b() {
        try {
            if (MediaController.B().b0 == null) {
                return;
            }
            new e0.i0(t0.b).e(null, 4, this.a.b());
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        String str;
        String str2;
        if (i7 != ns.W1) {
            if (i7 == ns.U1 || i7 == ns.V1) {
                String str3 = (String) objArr[0];
                if (i10 == this.c && (str = this.d) != null && str.equals(str3)) {
                    g0.h3(new h20(this, 0));
                    return;
                }
                return;
            }
            return;
        }
        String str4 = (String) objArr[0];
        if (i10 == this.c && (str2 = this.d) != null && str2.equals(str4)) {
            float min = Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue());
            int i11 = (int) (min * 100.0f);
            e0.q qVar = this.a;
            boolean z10 = i11 == 0;
            qVar.n = 100;
            qVar.o = i11;
            qVar.p = z10;
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
        new e0.i0(t0.b).b(4, null);
        ns.f(this.c).n(this, ns.W1);
        ns.f(this.c).n(this, ns.V1);
        ns.f(this.c).n(this, ns.U1);
        this.b = null;
        if (r2.a) {
            a8.b("VideoEncodingService: destroy video service");
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i10) {
        kf kfVar;
        if (e != null || (kfVar = MediaController.B().b0) == null) {
            return 2;
        }
        e = this;
        if (this.a == null) {
            at.i();
            e0.q qVar = new e0.q(t0.b, at.k0);
            this.a = qVar;
            qVar.F.icon = R.drawable.stat_sys_upload;
            qVar.F.when = System.currentTimeMillis();
            e0.q qVar2 = this.a;
            qVar2.y = at.k0;
            qVar2.g(hd.M0(org.telegram.messenger.beta.R.string.AppName, null));
        }
        a(kfVar);
        int i11 = 1;
        try {
            startForeground(4, this.a.b());
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        g0.h3(new h20(this, i11));
        return 2;
    }

    public final void onTimeout(int i7, int i10) {
        a8.b("VideoEncodingService timeout, type = " + i10);
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        stopSelf();
    }
}
