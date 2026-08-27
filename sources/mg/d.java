package mg;

import h3.a0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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

    @Override // mg.a
    public final int J1() {
        return a(this.b);
    }

    @Override // mg.a
    public final int K0() {
        return a(this.d);
    }

    public final int a(c cVar) {
        if (cVar == null) {
            return 0;
        }
        c6 c6Var = this.a;
        return cVar.i(c6Var, ((c6Var instanceof jh.b) || c6Var != null) ? c6Var.a() : g6.I.q());
    }

    public final void b(int i10, int i11) {
        this.b = new a0(i11, i10, 2);
    }

    public final void c(int i10, int i11) {
        this.d = new a0(i11, i10, 2);
    }

    public final void d(int i10, int i11) {
        this.c = new a0(i11, i10, 2);
    }

    @Override // mg.a
    public final int h0() {
        return a(this.c);
    }

    @Override // mg.a
    public final int p2() {
        return a(this.e);
    }
}
