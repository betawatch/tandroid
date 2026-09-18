package ai;

import android.view.ViewGroup;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.lx;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final class v extends og.b {
    public final boolean d;
    public final /* synthetic */ lx e;

    public v(lx lxVar, boolean z10) {
        this.e = lxVar;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // s4.h0
    public final int h() {
        boolean z10 = this.d;
        lx lxVar = this.e;
        return (z10 ? lxVar.y : lxVar.x).size();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        a0 a0Var = (a0) c1Var.a;
        a0Var.b = i10;
        boolean z10 = this.d;
        lx lxVar = this.e;
        if (z10) {
            a0Var.setDialogId(((w) lxVar.y.get(i10)).c);
        } else {
            a0Var.setDialogId(((w) lxVar.x.get(i10)).c);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        a0 a0Var = new a0(this.e, viewGroup.getContext());
        boolean z10 = this.d;
        a0Var.N = z10;
        if (z10) {
            a0Var.d(1.0f, 1.0f, 0.0f, false);
        }
        return new gl0(a0Var);
    }
}
