package org.telegram.messenger;

import android.R;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public class VideoEncodingService extends Service implements fs {
    public static VideoEncodingService e;
    public e0.q a;
    public jf b;
    public int c;
    public String d;

    public final void a(jf jfVar) {
        jf jfVar2 = this.b;
        if (jfVar2 == jfVar) {
            return;
        }
        int i7 = ks.U1;
        int i10 = ks.V1;
        int i11 = ks.W1;
        if (jfVar2 != null) {
            ks.f(this.c).n(this, i11);
            ks.f(this.c).n(this, i10);
            ks.f(this.c).n(this, i7);
        }
        if (jfVar != null) {
            fj fjVar = jfVar.a;
            boolean z10 = fjVar != null && fj.t3(fjVar.k);
            if (jfVar.d) {
                this.a.p(gd.N0(2131751756, null));
                this.a.f(gd.N0(2131751756, null));
            } else if (z10) {
                this.a.p(gd.N0(2131745383, null));
                this.a.f(gd.N0(2131745383, null));
            } else {
                this.a.p(gd.N0(2131745380, null));
                this.a.f(gd.N0(2131745380, null));
            }
            e0.q qVar = this.a;
            qVar.n = 100;
            qVar.o = 0;
            qVar.p = true;
        }
        this.b = jfVar;
        int i12 = jfVar.c;
        this.c = i12;
        this.d = jfVar.a.k.attachPath;
        ks.f(i12).b(this, i11);
        ks.f(this.c).b(this, i10);
        ks.f(this.c).b(this, i7);
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

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        String str;
        String str2;
        if (i7 != ks.W1) {
            if (i7 == ks.U1 || i7 == ks.V1) {
                String str3 = (String) objArr[0];
                if (i10 == this.c && (str = this.d) != null && str.equals(str3)) {
                    g0.g3(new f20(this, 0));
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
        ks.f(this.c).n(this, ks.W1);
        ks.f(this.c).n(this, ks.V1);
        ks.f(this.c).n(this, ks.U1);
        this.b = null;
        if (s2.a) {
            a8.b("VideoEncodingService: destroy video service");
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i10) {
        jf jfVar;
        if (e != null || (jfVar = MediaController.B().b0) == null) {
            return 2;
        }
        e = this;
        if (this.a == null) {
            xs.i();
            e0.q qVar = new e0.q(t0.b, xs.k0);
            this.a = qVar;
            qVar.F.icon = R.drawable.stat_sys_upload;
            qVar.F.when = System.currentTimeMillis();
            e0.q qVar2 = this.a;
            qVar2.y = xs.k0;
            qVar2.g(gd.N0(org.telegram.messenger.beta.R.string.AppName, null));
        }
        a(jfVar);
        int i11 = 1;
        try {
            startForeground(4, this.a.b());
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        g0.g3(new f20(this, i11));
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
