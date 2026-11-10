package jg;

import android.view.ViewGroup;
import bi.ec;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class o1 extends oj0 {
    public i1 c;
    public Integer d;
    public ec e;
    public boolean f;
    public int h;

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.b() == 0) {
            return false;
        }
        return this.c.D(d1Var);
    }

    @Override // v4.g0
    public final int b() {
        i1 i1Var = this.c;
        int K = i1Var.K();
        i1Var.M0 = K;
        return K + 1;
    }

    @Override // v4.g0
    public final int d(int i7) {
        if (i7 == 0) {
            return -983904;
        }
        return this.c.d(i7 - 1);
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        if (i7 > 0) {
            this.c.t(d1Var, i7 - 1);
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        if (i7 != -983904) {
            return this.c.x(viewGroup, i7);
        }
        ec ecVar = new ec(6, viewGroup.getContext(), this);
        this.e = ecVar;
        return new xi0(ecVar);
    }
}
