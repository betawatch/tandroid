package hg;

import ai.jc;
import android.view.ViewGroup;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class p1 extends lm0 {
    public j1 c;
    public Integer d;
    public jc e;
    public boolean f;
    public int h;

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.b() == 0) {
            return false;
        }
        return this.c.D(b1Var);
    }

    @Override // s4.g0
    public final int h() {
        j1 j1Var = this.c;
        int K = j1Var.K();
        j1Var.M0 = K;
        return K + 1;
    }

    @Override // s4.g0
    public final int j(int i10) {
        if (i10 == 0) {
            return -983904;
        }
        return this.c.j(i10 - 1);
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        if (i10 > 0) {
            this.c.v(b1Var, i10 - 1);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        if (i10 != -983904) {
            return this.c.x(viewGroup, i10);
        }
        jc jcVar = new jc(this, viewGroup.getContext(), 4);
        this.e = jcVar;
        return new wl0(jcVar);
    }
}
