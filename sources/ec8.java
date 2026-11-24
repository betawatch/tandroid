// default package

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ec8 implements hcc {
    public mm5 a;
    public fm4 b;
    public long c;
    public int d;
    public Executor e;
    public final /* synthetic */ ic8 f;

    public ec8(ic8 ic8Var, Context context) {
        this.f = ic8Var;
        g8c.O(context);
        km5 km5Var = mm5.b;
        this.a = w59.e;
        this.e = ic8.q;
    }

    @Override // hcc
    public final boolean a() {
        return false;
    }

    @Override // hcc
    public final Surface b() {
        gre.p(false);
        throw null;
    }

    @Override // hcc
    public final void c(float f) {
        ic8 ic8Var = this.f;
        ic8Var.i.c(f);
        ic8Var.e.c(f);
    }

    @Override // hcc
    public final void d(Surface surface, wia wiaVar) {
        ic8 ic8Var = this.f;
        Pair pair = ic8Var.l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((wia) ic8Var.l.second).equals(wiaVar)) {
            return;
        }
        ic8Var.l = Pair.create(surface, wiaVar);
        int i = wiaVar.a;
    }

    @Override // hcc
    public final void e() {
        ic8 ic8Var = this.f;
        if (ic8Var.d) {
            ic8Var.e.e();
        }
    }

    @Override // hcc
    public final void f() {
        ic8 ic8Var = this.f;
        if (ic8Var.d) {
            ic8Var.e.f();
        }
    }

    @Override // hcc
    public final void g(fm4 fm4Var, long j, int i, List list) {
        gre.p(false);
        this.a = mm5.q(list);
        this.b = fm4Var;
        em4 a = fm4Var.a();
        hl2 hl2Var = fm4Var.L;
        if (hl2Var == null || !hl2Var.d()) {
            hl2Var = hl2.h;
        }
        a.K = hl2Var;
        new fm4(a);
        throw null;
    }

    @Override // hcc
    public final void h(long j) {
        this.c = j;
    }

    @Override // hcc
    public final void i() {
        ic8 ic8Var = this.f;
        if (ic8Var.o >= -9223372036854775807L) {
            ic8Var.e.i();
        }
    }

    @Override // hcc
    public final void j(int i) {
        this.f.e.j(i);
    }

    @Override // hcc
    public final void k() {
        int i = wia.c.a;
        this.f.l = null;
    }

    @Override // hcc
    public final boolean l(long j, sk6 sk6Var) {
        int i;
        gre.p(false);
        long j2 = j + this.c;
        ic8 ic8Var = this.f;
        vac vacVar = ic8Var.i;
        long j3 = vacVar.a == -9223372036854775807L ? -9223372036854775807L : (long) (((j2 - r3) * vacVar.c) + vacVar.b);
        if (j3 != -9223372036854775807L) {
            long j4 = ic8Var.h;
            if (j4 != -9223372036854775807L && j3 < j4 && (i = this.d) < 2) {
                this.d = i + 1;
                vk6 vk6Var = sk6Var.c;
                ek6 ek6Var = sk6Var.a;
                int i2 = sk6Var.b;
                Trace.beginSection("dropVideoBuffer");
                ek6Var.c(i2);
                Trace.endSection();
                vk6Var.Y0(0, 1);
                return true;
            }
        }
        int i3 = ic8Var.p;
        if (i3 == -1 || i3 != 0) {
            return false;
        }
        throw null;
    }

    @Override // hcc
    public final boolean m(fm4 fm4Var) {
        ic8 ic8Var = this.f;
        boolean z = true;
        gre.p(ic8Var.n == 0);
        hl2 hl2Var = fm4Var.L;
        if (hl2Var == null || !hl2Var.d()) {
            hl2Var = hl2.h;
        }
        int i = hl2Var.c;
        if (i == 7) {
            try {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 34) {
                    if (i2 >= 33 && wie.b("EGL_EXT_gl_colorspace_bt2020_pq")) {
                        adb adbVar = ic8Var.f;
                        Looper myLooper = Looper.myLooper();
                        myLooper.getClass();
                        ic8Var.k = adbVar.a(myLooper, null);
                        ic8Var.b.a();
                        throw null;
                    }
                }
            } catch (bw4 e) {
                throw new gcc(e, fm4Var);
            }
        }
        if (i == 6) {
            if (Build.VERSION.SDK_INT < 33 || !wie.b("EGL_EXT_gl_colorspace_bt2020_pq")) {
                z = false;
            }
        } else if (i == 7) {
            z = wie.b("EGL_EXT_gl_colorspace_bt2020_hlg");
        }
        if (!z && Build.VERSION.SDK_INT >= 29) {
            Locale locale = Locale.US;
            lad.f("PlaybackVidGraphWrapper", "Color transfer " + i + " is not supported. Falling back to OpenGl tone mapping.");
            hl2 hl2Var2 = hl2.h;
        } else if (i == 2 || i == 10) {
            hl2 hl2Var3 = hl2.h;
        }
        adb adbVar2 = ic8Var.f;
        Looper myLooper2 = Looper.myLooper();
        myLooper2.getClass();
        ic8Var.k = adbVar2.a(myLooper2, null);
        ic8Var.b.a();
        throw null;
    }

    @Override // hcc
    public final void n(boolean z) {
        iq iqVar;
        ic8 ic8Var = this.f;
        xc3 xc3Var = ic8Var.e;
        if (ic8Var.n == 1) {
            ic8Var.m++;
            xc3Var.n(z);
            while (true) {
                int p = ic8Var.j.p();
                iqVar = ic8Var.j;
                if (p <= 1) {
                    break;
                } else {
                    iqVar.i();
                }
            }
            if (iqVar.p() == 1) {
                ((hc8) ic8Var.j.i()).getClass();
                throw null;
            }
            ic8Var.o = -9223372036854775807L;
            cdb cdbVar = ic8Var.k;
            cdbVar.getClass();
            cdbVar.e(new w88(ic8Var, (byte) 11));
        }
    }

    @Override // hcc
    public final void o(List list) {
        if (this.a.equals(list)) {
            return;
        }
        this.a = mm5.q(list);
        fm4 fm4Var = this.b;
        if (fm4Var == null) {
            return;
        }
        em4 a = fm4Var.a();
        hl2 hl2Var = fm4Var.L;
        if (hl2Var == null || !hl2Var.d()) {
            hl2Var = hl2.h;
        }
        a.K = hl2Var;
        new fm4(a);
        throw null;
    }

    @Override // hcc
    public final void p(long j, long j2) {
        this.f.e.p(j + this.c, j2);
    }

    @Override // hcc
    public final void q(boolean z) {
        ic8 ic8Var = this.f;
        if (ic8Var.d) {
            ic8Var.e.q(z);
        }
    }

    @Override // hcc
    public final boolean r(boolean z) {
        return this.f.e.a.b(false);
    }

    @Override // hcc
    public final void release() {
        ic8 ic8Var = this.f;
        if (ic8Var.n == 2) {
            return;
        }
        cdb cdbVar = ic8Var.k;
        if (cdbVar != null) {
            cdbVar.f();
        }
        ic8Var.l = null;
        ic8Var.n = (byte) 2;
    }

    @Override // hcc
    public final void s(sac sacVar) {
        this.f.e.k = sacVar;
    }

    @Override // hcc
    public final boolean u() {
        return false;
    }

    @Override // hcc
    public final void v() {
        ic8 ic8Var = this.f;
        if (ic8Var.j.p() == 0) {
            ic8Var.e.v();
            return;
        }
        iq iqVar = new iq();
        if (ic8Var.j.p() <= 0) {
            ic8Var.j = iqVar;
        } else {
            ((hc8) ic8Var.j.i()).getClass();
            throw null;
        }
    }

    @Override // hcc
    public final void w(pj4 pj4Var) {
        this.e = vn3.a;
    }

    @Override // hcc
    public final void t() {
    }
}
