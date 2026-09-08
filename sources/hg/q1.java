package hg;

import android.view.ViewGroup;
import di.eb;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class q1 extends kl0 {
    public k1 c;
    public Integer d;
    public eb e;
    public boolean f;
    public int h;

    @Override // org.telegram.ui.Components.kl0
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
        k1Var.L0 = K;
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
        eb ebVar = new eb(this, viewGroup.getContext(), 4);
        this.e = ebVar;
        return new vk0(ebVar);
    }
}
