package fg;

import android.view.ViewGroup;
import bi.nc;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.ul0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class r1 extends ul0 {
    public l1 c;
    public Integer d;
    public nc e;
    public boolean f;
    public int h;

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.b() == 0) {
            return false;
        }
        return this.c.D(c1Var);
    }

    @Override // s4.h0
    public final int h() {
        l1 l1Var = this.c;
        int K = l1Var.K();
        l1Var.L0 = K;
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
        nc ncVar = new nc(this, viewGroup.getContext(), 4);
        this.e = ncVar;
        return new fl0(ncVar);
    }
}
