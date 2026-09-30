package dh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class e implements a {
    public final d6 a;
    public d b;
    public d c;
    public d d;
    public d e;
    public float f;
    public float h;
    public float n;
    public float r;

    public e(d6 d6Var) {
        this.a = d6Var;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        this.n = dpf2;
        this.r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        this.f = dpf23;
        this.h = dpf24;
    }

    @Override // dh.a
    public final int H() {
        return b(this.e);
    }

    @Override // dh.a
    public final int a() {
        return b(this.c);
    }

    public final int b(d dVar) {
        boolean z10 = false;
        if (dVar == null) {
            return 0;
        }
        d6 d6Var = this.a;
        if ((d6Var instanceof ai.d) || (d6Var == null ? h6.I.q() : d6Var.a())) {
            z10 = true;
        }
        return dVar.g(d6Var, z10);
    }

    @Override // dh.a
    public final int c() {
        return b(this.d);
    }

    public final void d(int i10, int i11) {
        this.b = new c(i11, i10, 0);
    }

    public final void e(int i10, int i11) {
        this.d = new c(i11, i10, 0);
    }

    public final void f(int i10, int i11) {
        this.c = new c(i11, i10, 0);
    }

    @Override // dh.a
    public final int m() {
        return b(this.b);
    }
}
