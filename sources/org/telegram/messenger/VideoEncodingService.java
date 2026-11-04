package org.telegram.messenger;

import android.R;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class VideoEncodingService extends Service implements cs {
    public static VideoEncodingService e;
    public e0.q a;
    public cf b;
    public int c;
    public String d;

    public final void a(cf cfVar) {
        cf cfVar2 = this.b;
        if (cfVar2 == cfVar) {
            return;
        }
        int i3 = hs.U1;
        int i10 = hs.V1;
        int i11 = hs.W1;
        if (cfVar2 != null) {
            hs.f(this.c).n(this, i11);
            hs.f(this.c).n(this, i10);
            hs.f(this.c).n(this, i3);
        }
        if (cfVar != null) {
            zi ziVar = cfVar.a;
            boolean z10 = ziVar != null && zi.u3(ziVar.k);
            if (cfVar.d) {
                this.a.p(bd.M0(2131751768, null));
                this.a.f(bd.M0(2131751768, null));
            } else if (z10) {
                this.a.p(bd.M0(2131745589, null));
                this.a.f(bd.M0(2131745589, null));
            } else {
                this.a.p(bd.M0(2131745586, null));
                this.a.f(bd.M0(2131745586, null));
            }
            e0.q qVar = this.a;
            qVar.n = 100;
            qVar.o = 0;
            qVar.p = true;
        }
        this.b = cfVar;
        int i12 = cfVar.c;
        this.c = i12;
        this.d = cfVar.a.k.attachPath;
        hs.f(i12).b(this, i11);
        hs.f(this.c).b(this, i10);
        hs.f(this.c).b(this, i3);
        if (e != null) {
            b();
        }
    }

    public final void b() {
        try {
            if (MediaController.B().b0 == null) {
                return;
            }
            new e0.j0(t0.b).e(null, 4, this.a.b());
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        String str;
        String str2;
        if (i3 != hs.W1) {
            if (i3 == hs.U1 || i3 == hs.V1) {
                String str3 = (String) objArr[0];
                if (i10 == this.c && (str = this.d) != null && str.equals(str3)) {
                    g0.h3(new c20(this, 0));
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
        new e0.j0(t0.b).b(4, null);
        hs.f(this.c).n(this, hs.W1);
        hs.f(this.c).n(this, hs.V1);
        hs.f(this.c).n(this, hs.U1);
        this.b = null;
        if (r2.a) {
            a8.b("VideoEncodingService: destroy video service");
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i3, int i10) {
        cf cfVar;
        if (e != null || (cfVar = MediaController.B().b0) == null) {
            return 2;
        }
        e = this;
        if (this.a == null) {
            us.i();
            e0.q qVar = new e0.q(t0.b, us.k0);
            this.a = qVar;
            qVar.F.icon = R.drawable.stat_sys_upload;
            qVar.F.when = System.currentTimeMillis();
            e0.q qVar2 = this.a;
            qVar2.y = us.k0;
            qVar2.g(bd.M0(org.telegram.messenger.beta.R.string.AppName, null));
        }
        a(cfVar);
        int i11 = 1;
        try {
            startForeground(4, this.a.b());
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        g0.h3(new c20(this, i11));
        return 2;
    }

    public final void onTimeout(int i3, int i10) {
        a8.b("VideoEncodingService timeout, type = " + i10);
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        stopSelf();
    }
}
