package hh;

import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class e implements a {
    public final e6 a;
    public d b;
    public d c;
    public d d;
    public d e;
    public float f;
    public float h;
    public float n;
    public float r;

    public e(e6 e6Var) {
        this.a = e6Var;
        float N = g0.N(1.0f);
        float N2 = g0.N(0.33333334f);
        this.n = N;
        this.r = N2;
        float N3 = g0.N(1.0f);
        float N4 = g0.N(0.6666667f);
        this.f = N3;
        this.h = N4;
    }

    @Override // hh.a
    public /* synthetic */ int F() {
        return 0;
    }

    @Override // hh.a
    public int M() {
        return a(this.d);
    }

    @Override // hh.a
    public final /* synthetic */ float O() {
        return -1.0f;
    }

    @Override // hh.a
    public final /* synthetic */ float W() {
        return -1.0f;
    }

    public final int a(d dVar) {
        boolean z10 = false;
        if (dVar == null) {
            return 0;
        }
        e6 e6Var = this.a;
        if ((e6Var instanceof ei.b) || (e6Var == null ? k6.I.q() : e6Var.a())) {
            z10 = true;
        }
        return dVar.j(e6Var, z10);
    }

    @Override // hh.a
    public /* synthetic */ float a0() {
        return 0.0f;
    }

    public float b() {
        return this.r;
    }

    public float c() {
        return this.n;
    }

    @Override // hh.a
    public /* synthetic */ int c0() {
        return 0;
    }

    public final void d(int i3, int i10) {
        this.b = new c(i10, i3, 0);
    }

    public final void e(int i3, int i10) {
        this.d = new c(i10, i3, 0);
    }

    public final void f(int i3, int i10) {
        this.c = new c(i10, i3, 0);
    }

    @Override // hh.a
    public int u0() {
        return a(this.b);
    }

    @Override // hh.a
    public final int w0() {
        return a(this.e);
    }

    @Override // hh.a
    public int x() {
        return a(this.c);
    }
}
