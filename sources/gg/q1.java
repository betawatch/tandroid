package gg;

import android.view.ViewGroup;
import ci.ab;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.yl0;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class q1 extends yl0 {
    public k1 c;
    public Integer d;
    public ab e;
    public boolean f;
    public int h;

    @Override // org.telegram.ui.Components.yl0
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.b() == 0) {
            return false;
        }
        return this.c.D(c1Var);
    }

    @Override // s4.h0
    public final int h() {
        k1 k1Var = this.c;
        int K = k1Var.K();
        k1Var.M0 = K;
        return K + 1;
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (i10 == 0) {
            return -983904;
        }
        return this.c.j(i10 - 1);
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        if (i10 > 0) {
            this.c.v(c1Var, i10 - 1);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        if (i10 != -983904) {
            return this.c.x(viewGroup, i10);
        }
        ab abVar = new ab(this, viewGroup.getContext(), 4);
        this.e = abVar;
        return new il0(abVar);
    }
}
