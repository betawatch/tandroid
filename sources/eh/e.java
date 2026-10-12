package eh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class e implements a {
    public final c6 a;
    public d b;
    public d c;
    public d d;
    public d e;
    public float f;
    public float h;
    public float n;
    public float r;

    public e(c6 c6Var) {
        this.a = c6Var;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        this.n = dpf2;
        this.r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        this.f = dpf23;
        this.h = dpf24;
    }

    @Override // eh.a
    public final int G() {
        return a(this.b);
    }

    public final int a(d dVar) {
        boolean z10 = false;
        if (dVar == null) {
            return 0;
        }
        c6 c6Var = this.a;
        if ((c6Var instanceof bi.b) || (c6Var == null ? g6.I.q() : c6Var.a())) {
            z10 = true;
        }
        return dVar.f(c6Var, z10);
    }

    public final void b(int i10, int i11) {
        this.b = new c(i11, i10, 0);
    }

    @Override // eh.a
    public final int b0() {
        return a(this.e);
    }

    public final void c(int i10, int i11) {
        this.d = new c(i11, i10, 0);
    }

    public final void d(int i10, int i11) {
        this.c = new c(i11, i10, 0);
    }

    @Override // eh.a
    public final int h() {
        return a(this.c);
    }

    @Override // eh.a
    public final int q() {
        return a(this.d);
    }
}
