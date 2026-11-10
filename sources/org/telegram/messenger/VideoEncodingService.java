package org.telegram.messenger;

import android.R;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public class VideoEncodingService extends Service implements ls {
    public static VideoEncodingService e;
    public e0.q a;
    public lf b;
    public int c;
    public String d;

    public final void a(lf lfVar) {
        lf lfVar2 = this.b;
        if (lfVar2 == lfVar) {
            return;
        }
        int i7 = qs.U1;
        int i10 = qs.V1;
        int i11 = qs.W1;
        if (lfVar2 != null) {
            qs.f(this.c).n(this, i11);
            qs.f(this.c).n(this, i10);
            qs.f(this.c).n(this, i7);
        }
        if (lfVar != null) {
            ij ijVar = lfVar.a;
            boolean z9 = ijVar != null && ij.t3(ijVar.k);
            if (lfVar.d) {
                this.a.p(id.M0(2131751768, null));
                this.a.f(id.M0(2131751768, null));
            } else if (z9) {
                this.a.p(id.M0(2131745579, null));
                this.a.f(id.M0(2131745579, null));
            } else {
                this.a.p(id.M0(2131745576, null));
                this.a.f(id.M0(2131745576, null));
            }
            e0.q qVar = this.a;
            qVar.n = 100;
            qVar.o = 0;
            qVar.p = true;
        }
        this.b = lfVar;
        int i12 = lfVar.c;
        this.c = i12;
        this.d = lfVar.a.k.attachPath;
        qs.f(i12).b(this, i11);
        qs.f(this.c).b(this, i10);
        qs.f(this.c).b(this, i7);
        if (e != null) {
            b();
        }
    }

    public final void b() {
        try {
            if (MediaController.B().a0 == null) {
                return;
            }
            new e0.i0(t0.b).e(null, 4, this.a.b());
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        String str;
        String str2;
        if (i7 != qs.W1) {
            if (i7 == qs.U1 || i7 == qs.V1) {
                String str3 = (String) objArr[0];
                if (i10 == this.c && (str = this.d) != null && str.equals(str3)) {
                    g0.h3(new k20(this, 0));
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
            boolean z9 = i11 == 0;
            qVar.n = 100;
            qVar.o = i11;
            qVar.p = z9;
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
        qs.f(this.c).n(this, qs.W1);
        qs.f(this.c).n(this, qs.V1);
        qs.f(this.c).n(this, qs.U1);
        this.b = null;
        if (r2.a) {
            a8.b("VideoEncodingService: destroy video service");
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i10) {
        lf lfVar;
        if (e != null || (lfVar = MediaController.B().a0) == null) {
            return 2;
        }
        e = this;
        if (this.a == null) {
            dt.i();
            e0.q qVar = new e0.q(t0.b, dt.j0);
            this.a = qVar;
            qVar.F.icon = R.drawable.stat_sys_upload;
            qVar.F.when = System.currentTimeMillis();
            e0.q qVar2 = this.a;
            qVar2.y = dt.j0;
            qVar2.g(id.M0(org.telegram.messenger.beta.R.string.AppName, null));
        }
        a(lfVar);
        int i11 = 1;
        try {
            startForeground(4, this.a.b());
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        g0.h3(new k20(this, i11));
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
