package gh;

import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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

    @Override // gh.a
    public /* synthetic */ float A1() {
        return 0.0f;
    }

    @Override // gh.a
    public final int A2() {
        return a(this.e);
    }

    @Override // gh.a
    public /* synthetic */ int D1() {
        return 0;
    }

    @Override // gh.a
    public /* synthetic */ int M0() {
        return 0;
    }

    @Override // gh.a
    public int U0() {
        return a(this.d);
    }

    @Override // gh.a
    public int W1() {
        return a(this.b);
    }

    @Override // gh.a
    public final /* synthetic */ float Y0() {
        return -1.0f;
    }

    @Override // gh.a
    public final /* synthetic */ float Z0() {
        return -1.0f;
    }

    public final int a(d dVar) {
        boolean z10 = false;
        if (dVar == null) {
            return 0;
        }
        e6 e6Var = this.a;
        if ((e6Var instanceof fi.b) || (e6Var == null ? j6.I.q() : e6Var.a())) {
            z10 = true;
        }
        return dVar.j(e6Var, z10);
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

    public final void f(int i7, int i10) {
        this.c = new c(i10, i7, 0);
    }

    @Override // gh.a
    public int t0() {
        return a(this.c);
    }
}
