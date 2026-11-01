package org.telegram.messenger;

import android.R;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public class VideoEncodingService extends Service implements vs {
    public static VideoEncodingService e;
    public e0.r a;
    public kf b;
    public int c;
    public String d;

    public final void a(kf kfVar) {
        kf kfVar2 = this.b;
        if (kfVar2 == kfVar) {
            return;
        }
        int i10 = at.U1;
        int i11 = at.V1;
        int i12 = at.W1;
        if (kfVar2 != null) {
            at.f(this.c).n(this, i12);
            at.f(this.c).n(this, i11);
            at.f(this.c).n(this, i10);
        }
        if (kfVar != null) {
            kj kjVar = kfVar.a;
            boolean z10 = kjVar != null && kj.t3(kjVar.k);
            if (kfVar.d) {
                this.a.p(dd.L0(2131751768, null));
                this.a.f(dd.L0(2131751768, null));
            } else if (z10) {
                this.a.p(dd.L0(2131745596, null));
                this.a.f(dd.L0(2131745596, null));
            } else {
                this.a.p(dd.L0(2131745593, null));
                this.a.f(dd.L0(2131745593, null));
            }
            e0.r rVar = this.a;
            rVar.n = 100;
            rVar.o = 0;
            rVar.p = true;
        }
        this.b = kfVar;
        int i13 = kfVar.c;
        this.c = i13;
        this.d = kfVar.a.k.attachPath;
        at.f(i13).b(this, i12);
        at.f(this.c).b(this, i11);
        at.f(this.c).b(this, i10);
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

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        String str2;
        if (i10 != at.W1) {
            if (i10 == at.U1 || i10 == at.V1) {
                String str3 = (String) objArr[0];
                if (i11 == this.c && (str = this.d) != null && str.equals(str3)) {
                    i0.g3(new z20(this, 0));
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
        at.f(this.c).n(this, at.W1);
        at.f(this.c).n(this, at.V1);
        at.f(this.c).n(this, at.U1);
        this.b = null;
        if (v2.a) {
            f8.b("VideoEncodingService: destroy video service");
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        kf kfVar;
        if (e != null || (kfVar = MediaController.B().a0) == null) {
            return 2;
        }
        e = this;
        if (this.a == null) {
            pt.i();
            e0.r rVar = new e0.r(w0.b, pt.j0);
            this.a = rVar;
            rVar.F.icon = R.drawable.stat_sys_upload;
            rVar.F.when = System.currentTimeMillis();
            e0.r rVar2 = this.a;
            rVar2.y = pt.j0;
            rVar2.g(dd.L0(org.telegram.messenger.beta.R.string.AppName, null));
        }
        a(kfVar);
        int i12 = 1;
        try {
            startForeground(4, this.a.b());
        } catch (Throwable th2) {
            f8.g(th2, true);
        }
        i0.g3(new z20(this, i12));
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
