package ig;

import android.view.ViewGroup;
import bi.cc;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class p1 extends mm0 {
    public j1 c;
    public Integer d;
    public cc e;
    public boolean f;
    public int h;

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.b() == 0) {
            return false;
        }
        return this.c.D(e1Var);
    }

    @Override // s4.h0
    public final int h() {
        j1 j1Var = this.c;
        int K = j1Var.K();
        j1Var.M0 = K;
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
    public final void v(s4.e1 e1Var, int i10) {
        if (i10 > 0) {
            this.c.v(e1Var, i10 - 1);
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        if (i10 != -983904) {
            return this.c.x(viewGroup, i10);
        }
        cc ccVar = new cc(this, viewGroup.getContext(), 4);
        this.e = ccVar;
        return new wl0(ccVar);
    }
}
