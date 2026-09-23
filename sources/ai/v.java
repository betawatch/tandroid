package ai;

import android.view.ViewGroup;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.ix;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class v extends og.b {
    public final boolean d;
    public final /* synthetic */ ix e;

    public v(ix ixVar, boolean z10) {
        this.e = ixVar;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // s4.h0
    public final int h() {
        boolean z10 = this.d;
        ix ixVar = this.e;
        return (z10 ? ixVar.y : ixVar.x).size();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        a0 a0Var = (a0) c1Var.a;
        a0Var.b = i10;
        boolean z10 = this.d;
        ix ixVar = this.e;
        if (z10) {
            a0Var.setDialogId(((w) ixVar.y.get(i10)).c);
        } else {
            a0Var.setDialogId(((w) ixVar.x.get(i10)).c);
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
        return new wk0(a0Var);
    }
}
