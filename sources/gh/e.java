package gh;

import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class e implements a {
    public final i6 a;
    public d b;
    public d c;
    public d d;
    public d e;
    public float f;
    public float h;
    public float n;
    public float r;

    public e(i6 i6Var) {
        this.a = i6Var;
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
    public /* synthetic */ int D0() {
        return 0;
    }

    @Override // gh.a
    public /* synthetic */ int D1() {
        return 0;
    }

    @Override // gh.a
    public int Q0() {
        return a(this.d);
    }

    @Override // gh.a
    public final /* synthetic */ float T0() {
        return -1.0f;
    }

    @Override // gh.a
    public final /* synthetic */ float V0() {
        return -1.0f;
    }

    @Override // gh.a
    public int X1() {
        return a(this.b);
    }

    public final int a(d dVar) {
        boolean z10 = false;
        if (dVar == null) {
            return 0;
        }
        i6 i6Var = this.a;
        if ((i6Var instanceof fi.b) || (i6Var == null ? n6.I.q() : i6Var.b())) {
            z10 = true;
        }
        return dVar.f(i6Var, z10);
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
    public int i0() {
        return a(this.c);
    }

    @Override // gh.a
    public final int x2() {
        return a(this.e);
    }
}
