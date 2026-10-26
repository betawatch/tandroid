package ig;

import android.view.ViewGroup;
import bi.cc;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class p1 extends lm0 {
    public j1 c;
    public Integer d;
    public cc e;
    public boolean f;
    public int h;

    @Override // org.telegram.ui.Components.lm0
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
        return new vl0(ccVar);
    }
}
