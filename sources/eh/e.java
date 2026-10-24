package eh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class e implements a {
    public final g6 a;
    public d b;
    public d c;
    public d d;
    public d e;
    public float f;
    public float h;
    public float n;
    public float r;

    public e(g6 g6Var) {
        this.a = g6Var;
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
    public final int H() {
        return a(this.b);
    }

    public final int a(d dVar) {
        boolean z10 = false;
        if (dVar == null) {
            return 0;
        }
        g6 g6Var = this.a;
        if ((g6Var instanceof ci.b) || (g6Var == null ? k6.I.q() : g6Var.a())) {
            z10 = true;
        }
        return dVar.i(g6Var, z10);
    }

    @Override // eh.a
    public final int a0() {
        return a(this.e);
    }

    public final void b(int i10, int i11) {
        this.b = new c(i11, i10, 0);
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
    public final int u() {
        return a(this.d);
    }
}
