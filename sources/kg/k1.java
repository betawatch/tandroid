package kg;

import ai.x2;
import android.view.ViewGroup;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.sj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k1 extends sj0 {
    public e1 c;
    public Integer d;
    public x2 e;
    public boolean f;
    public int h;

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        if (d1Var.b() == 0) {
            return false;
        }
        return this.c.D(d1Var);
    }

    @Override // u4.h0
    public final int b() {
        e1 e1Var = this.c;
        int K = e1Var.K();
        e1Var.N0 = K;
        return K + 1;
    }

    @Override // u4.h0
    public final int d(int i3) {
        if (i3 == 0) {
            return -983904;
        }
        return this.c.d(i3 - 1);
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        if (i3 > 0) {
            this.c.t(d1Var, i3 - 1);
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        if (i3 != -983904) {
            return this.c.x(viewGroup, i3);
        }
        x2 x2Var = new x2(7, viewGroup.getContext(), this);
        this.e = x2Var;
        return new bj0(x2Var);
    }
}
