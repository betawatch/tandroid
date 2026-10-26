package fh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class e implements a {
    public final u6 a;
    public d b;
    public d c;
    public d d;
    public d e;
    public float f;
    public float h;
    public float n;
    public float r;

    public e(u6 u6Var) {
        this.a = u6Var;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        this.n = dpf2;
        this.r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        this.f = dpf23;
        this.h = dpf24;
    }

    @Override // fh.a
    public final int A() {
        return a(this.d);
    }

    public final int a(d dVar) {
        boolean z10 = false;
        if (dVar == null) {
            return 0;
        }
        u6 u6Var = this.a;
        if ((u6Var instanceof di.b) || (u6Var == null ? y6.I.q() : u6Var.a())) {
            z10 = true;
        }
        return dVar.i(u6Var, z10);
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

    @Override // fh.a
    public final int f0() {
        return a(this.b);
    }

    @Override // fh.a
    public final int t() {
        return a(this.c);
    }

    @Override // fh.a
    public final int v0() {
        return a(this.e);
    }
}
