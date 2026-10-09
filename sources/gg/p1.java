package gg;

import android.view.ViewGroup;
import ci.bb;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.pm0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class p1 extends pm0 {
    public j1 c;
    public Integer d;
    public bb e;
    public boolean f;
    public int h;

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.b() == 0) {
            return false;
        }
        return this.c.D(d1Var);
    }

    @Override // s4.i0
    public final int h() {
        j1 j1Var = this.c;
        int K = j1Var.K();
        j1Var.M0 = K;
        return K + 1;
    }

    @Override // s4.i0
    public final int j(int i10) {
        if (i10 == 0) {
            return -983904;
        }
        return this.c.j(i10 - 1);
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        if (i10 > 0) {
            this.c.v(d1Var, i10 - 1);
        }
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        if (i10 != -983904) {
            return this.c.x(viewGroup, i10);
        }
        bb bbVar = new bb(this, viewGroup.getContext(), 4);
        this.e = bbVar;
        return new am0(bbVar);
    }
}
