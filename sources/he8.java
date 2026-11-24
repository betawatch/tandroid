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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class he8 implements iec {
    public mo5 a;
    public go4 b;
    public long c;
    public int d;
    public Executor e;
    public final /* synthetic */ le8 f;

    public he8(le8 le8Var, Context context) {
        this.f = le8Var;
        hac.O(context);
        ko5 ko5Var = mo5.b;
        this.a = y79.e;
        this.e = le8.q;
    }

    @Override // iec
    public final boolean a() {
        return false;
    }

    @Override // iec
    public final Surface b() {
        jte.p(false);
        throw null;
    }

    @Override // iec
    public final void c(Surface surface, yka ykaVar) {
        le8 le8Var = this.f;
        Pair pair = le8Var.l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((yka) le8Var.l.second).equals(ykaVar)) {
            return;
        }
        le8Var.l = Pair.create(surface, ykaVar);
        int i = ykaVar.a;
    }

    @Override // iec
    public final void d(float f) {
        le8 le8Var = this.f;
        le8Var.i.c(f);
        le8Var.e.d(f);
    }

    @Override // iec
    public final void e() {
        le8 le8Var = this.f;
        if (le8Var.d) {
            le8Var.e.e();
        }
    }

    @Override // iec
    public final void f() {
        le8 le8Var = this.f;
        if (le8Var.d) {
            le8Var.e.f();
        }
    }

    @Override // iec
    public final void g(go4 go4Var, long j, int i, List list) {
        jte.p(false);
        this.a = mo5.q(list);
        this.b = go4Var;
        fo4 a = go4Var.a();
        tm2 tm2Var = go4Var.L;
        if (tm2Var == null || !tm2Var.d()) {
            tm2Var = tm2.h;
        }
        a.K = tm2Var;
        new go4(a);
        throw null;
    }

    @Override // iec
    public final void h(long j) {
        this.c = j;
    }

    @Override // iec
    public final void i(k44 k44Var) {
        this.e = fp3.a;
    }

    @Override // iec
    public final void j() {
        le8 le8Var = this.f;
        if (le8Var.o >= -9223372036854775807L) {
            le8Var.e.j();
        }
    }

    @Override // iec
    public final void k(int i) {
        this.f.e.k(i);
    }

    @Override // iec
    public final void l() {
        int i = yka.c.a;
        this.f.l = null;
    }

    @Override // iec
    public final boolean m(long j, vm6 vm6Var) {
        int i;
        jte.p(false);
        long j2 = j + this.c;
        le8 le8Var = this.f;
        ycc yccVar = le8Var.i;
        long j3 = yccVar.a == -9223372036854775807L ? -9223372036854775807L : (long) (((j2 - r3) * yccVar.c) + yccVar.b);
        if (j3 != -9223372036854775807L) {
            long j4 = le8Var.h;
            if (j4 != -9223372036854775807L && j3 < j4 && (i = this.d) < 2) {
                this.d = i + 1;
                ym6 ym6Var = vm6Var.c;
                hm6 hm6Var = vm6Var.a;
                int i2 = vm6Var.b;
                Trace.beginSection("dropVideoBuffer");
                hm6Var.c(i2);
                Trace.endSection();
                ym6Var.Y0(0, 1);
                return true;
            }
        }
        int i3 = le8Var.p;
        if (i3 == -1 || i3 != 0) {
            return false;
        }
        throw null;
    }

    @Override // iec
    public final boolean n(go4 go4Var) {
        le8 le8Var = this.f;
        boolean z = true;
        jte.p(le8Var.n == 0);
        tm2 tm2Var = go4Var.L;
        if (tm2Var == null || !tm2Var.d()) {
            tm2Var = tm2.h;
        }
        int i = tm2Var.c;
        if (i == 7) {
            try {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 34) {
                    if (i2 >= 33 && xke.b("EGL_EXT_gl_colorspace_bt2020_pq")) {
                        bfb bfbVar = le8Var.f;
                        Looper myLooper = Looper.myLooper();
                        myLooper.getClass();
                        le8Var.k = bfbVar.a(myLooper, null);
                        le8Var.b.a();
                        throw null;
                    }
                }
            } catch (dy4 e) {
                throw new hec(e, go4Var);
            }
        }
        if (i == 6) {
            if (Build.VERSION.SDK_INT < 33 || !xke.b("EGL_EXT_gl_colorspace_bt2020_pq")) {
                z = false;
            }
        } else if (i == 7) {
            z = xke.b("EGL_EXT_gl_colorspace_bt2020_hlg");
        }
        if (!z && Build.VERSION.SDK_INT >= 29) {
            Locale locale = Locale.US;
            ncd.f("PlaybackVidGraphWrapper", "Color transfer " + i + " is not supported. Falling back to OpenGl tone mapping.");
            tm2 tm2Var2 = tm2.h;
        } else if (i == 2 || i == 10) {
            tm2 tm2Var3 = tm2.h;
        }
        bfb bfbVar2 = le8Var.f;
        Looper myLooper2 = Looper.myLooper();
        myLooper2.getClass();
        le8Var.k = bfbVar2.a(myLooper2, null);
        le8Var.b.a();
        throw null;
    }

    @Override // iec
    public final void o(boolean z) {
        ir irVar;
        le8 le8Var = this.f;
        je3 je3Var = le8Var.e;
        if (le8Var.n == 1) {
            le8Var.m++;
            je3Var.o(z);
            while (true) {
                int p = le8Var.j.p();
                irVar = le8Var.j;
                if (p <= 1) {
                    break;
                } else {
                    irVar.i();
                }
            }
            if (irVar.p() == 1) {
                ((ke8) le8Var.j.i()).getClass();
                throw null;
            }
            le8Var.o = -9223372036854775807L;
            dfb dfbVar = le8Var.k;
            dfbVar.getClass();
            dfbVar.e(new q78(le8Var, (byte) 18));
        }
    }

    @Override // iec
    public final void p(List list) {
        if (this.a.equals(list)) {
            return;
        }
        this.a = mo5.q(list);
        go4 go4Var = this.b;
        if (go4Var == null) {
            return;
        }
        fo4 a = go4Var.a();
        tm2 tm2Var = go4Var.L;
        if (tm2Var == null || !tm2Var.d()) {
            tm2Var = tm2.h;
        }
        a.K = tm2Var;
        new go4(a);
        throw null;
    }

    @Override // iec
    public final void q(long j, long j2) {
        this.f.e.q(j + this.c, j2);
    }

    @Override // iec
    public final void r(boolean z) {
        le8 le8Var = this.f;
        if (le8Var.d) {
            le8Var.e.r(z);
        }
    }

    @Override // iec
    public final void release() {
        le8 le8Var = this.f;
        if (le8Var.n == 2) {
            return;
        }
        dfb dfbVar = le8Var.k;
        if (dfbVar != null) {
            dfbVar.f();
        }
        le8Var.l = null;
        le8Var.n = (byte) 2;
    }

    @Override // iec
    public final boolean s(boolean z) {
        return this.f.e.a.b(false);
    }

    @Override // iec
    public final void t(vcc vccVar) {
        this.f.e.k = vccVar;
    }

    @Override // iec
    public final boolean v() {
        return false;
    }

    @Override // iec
    public final void w() {
        le8 le8Var = this.f;
        if (le8Var.j.p() == 0) {
            le8Var.e.w();
            return;
        }
        ir irVar = new ir();
        if (le8Var.j.p() <= 0) {
            le8Var.j = irVar;
        } else {
            ((ke8) le8Var.j.i()).getClass();
            throw null;
        }
    }

    @Override // iec
    public final void u() {
    }
}
