package gh;

import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public class e implements a {
    public final f6 a;
    public d b;
    public d c;
    public d d;
    public d e;
    public float f;
    public float h;
    public float n;
    public float r;

    public e(f6 f6Var) {
        this.a = f6Var;
        float N = g0.N(1.0f);
        float N2 = g0.N(0.33333334f);
        this.n = N;
        this.r = N2;
        float N3 = g0.N(1.0f);
        float N4 = g0.N(0.6666667f);
        this.f = N3;
        this.h = N4;
    }

    @Override // gh.a
    public int A() {
        return a(this.c);
    }

    @Override // gh.a
    public /* synthetic */ int C0() {
        return 0;
    }

    @Override // gh.a
    public /* synthetic */ int M() {
        return 0;
    }

    @Override // gh.a
    public int O() {
        return a(this.d);
    }

    @Override // gh.a
    public int R0() {
        return a(this.b);
    }

    public final int a(d dVar) {
        boolean z9 = false;
        if (dVar == null) {
            return 0;
        }
        f6 f6Var = this.a;
        if ((f6Var instanceof di.b) || (f6Var == null ? k6.I.q() : f6Var.a())) {
            z9 = true;
        }
        return dVar.k(f6Var, z9);
    }

    public float b() {
        return this.r;
    }

    public float c() {
        return this.n;
    }

    public final void d(int i7, int i10) {
        this.b = new c(i10, i7, 0);
    }

    public final void e(int i7, int i10) {
        this.d = new c(i10, i7, 0);
    }

    @Override // gh.a
    public final int e1() {
        return a(this.e);
    }

    public final void f(int i7, int i10) {
        this.c = new c(i10, i7, 0);
    }

    @Override // gh.a
    public final /* synthetic */ float j0() {
        return -1.0f;
    }

    @Override // gh.a
    public final /* synthetic */ float o0() {
        return -1.0f;
    }

    @Override // gh.a
    public /* synthetic */ float v0() {
        return 0.0f;
    }
}
