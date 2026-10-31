package org.telegram.messenger;

import android.R;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class VideoEncodingService extends Service implements us {
    public static VideoEncodingService e;
    public e0.r a;
    public jf b;
    public int c;
    public String d;

    public final void a(jf jfVar) {
        jf jfVar2 = this.b;
        if (jfVar2 == jfVar) {
            return;
        }
        int i10 = zs.U1;
        int i11 = zs.V1;
        int i12 = zs.W1;
        if (jfVar2 != null) {
            zs.f(this.c).n(this, i12);
            zs.f(this.c).n(this, i11);
            zs.f(this.c).n(this, i10);
        }
        if (jfVar != null) {
            jj jjVar = jfVar.a;
            boolean z10 = jjVar != null && jj.t3(jjVar.k);
            if (jfVar.d) {
                this.a.p(cd.L0(2131751768, null));
                this.a.f(cd.L0(2131751768, null));
            } else if (z10) {
                this.a.p(cd.L0(2131745596, null));
                this.a.f(cd.L0(2131745596, null));
            } else {
                this.a.p(cd.L0(2131745593, null));
                this.a.f(cd.L0(2131745593, null));
            }
            e0.r rVar = this.a;
            rVar.n = 100;
            rVar.o = 0;
            rVar.p = true;
        }
        this.b = jfVar;
        int i13 = jfVar.c;
        this.c = i13;
        this.d = jfVar.a.k.attachPath;
        zs.f(i13).b(this, i12);
        zs.f(this.c).b(this, i11);
        zs.f(this.c).b(this, i10);
        if (e != null) {
            b();
        }
    }

    public final void b() {
        try {
            if (MediaController.B().a0 == null) {
                return;
            }
            new e0.k0(w0.b).e(null, 4, this.a.b());
        } catch (Throwable th2) {
            f8.g(th2, true);
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        String str2;
        if (i10 != zs.W1) {
            if (i10 == zs.U1 || i10 == zs.V1) {
                String str3 = (String) objArr[0];
                if (i11 == this.c && (str = this.d) != null && str.equals(str3)) {
                    i0.g3(new y20(this, 0));
                    return;
                }
                return;
            }
            return;
        }
        String str4 = (String) objArr[0];
        if (i11 == this.c && (str2 = this.d) != null && str2.equals(str4)) {
            float min = Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue());
            int i12 = (int) (min * 100.0f);
            e0.r rVar = this.a;
            boolean z10 = i12 == 0;
            rVar.n = 100;
            rVar.o = i12;
            rVar.p = z10;
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
        new e0.k0(w0.b).b(4, null);
        zs.f(this.c).n(this, zs.W1);
        zs.f(this.c).n(this, zs.V1);
        zs.f(this.c).n(this, zs.U1);
        this.b = null;
        if (v2.a) {
            f8.b("VideoEncodingService: destroy video service");
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        jf jfVar;
        if (e != null || (jfVar = MediaController.B().a0) == null) {
            return 2;
        }
        e = this;
        if (this.a == null) {
            ot.i();
            e0.r rVar = new e0.r(w0.b, ot.j0);
            this.a = rVar;
            rVar.F.icon = R.drawable.stat_sys_upload;
            rVar.F.when = System.currentTimeMillis();
            e0.r rVar2 = this.a;
            rVar2.y = ot.j0;
            rVar2.g(cd.L0(org.telegram.messenger.beta.R.string.AppName, null));
        }
        a(jfVar);
        int i12 = 1;
        try {
            startForeground(4, this.a.b());
        } catch (Throwable th2) {
            f8.g(th2, true);
        }
        i0.g3(new y20(this, i12));
        return 2;
    }

    public final void onTimeout(int i10, int i11) {
        f8.b("VideoEncodingService timeout, type = " + i11);
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        stopSelf();
    }
}
