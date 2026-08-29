package og;

import j3.z;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class d implements a {
    public final c6 a;
    public c b;
    public c c;
    public c d;
    public c e;
    public float f;
    public float h;
    public float n;
    public float r;

    public d(c6 c6Var) {
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

    public final int a(c cVar) {
        if (cVar == null) {
            return 0;
        }
        c6 c6Var = this.a;
        return cVar.f(c6Var, ((c6Var instanceof lh.b) || c6Var != null) ? c6Var.a() : g6.I.q());
    }

    public final void b(int i10, int i11) {
        this.b = new z(i11, i10, 2);
    }

    public final void c(int i10, int i11) {
        this.d = new z(i11, i10, 2);
    }

    public final void d(int i10, int i11) {
        this.c = new z(i11, i10, 2);
    }

    @Override // og.a
    public final int h() {
        return a(this.c);
    }

    @Override // og.a
    public final int m() {
        return a(this.d);
    }

    @Override // og.a
    public final int v() {
        return a(this.b);
    }

    @Override // og.a
    public final int z() {
        return a(this.e);
    }
}
