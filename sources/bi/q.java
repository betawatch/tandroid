package bi;

import android.view.ViewGroup;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.px;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class q extends pg.b {
    public final boolean d;
    public final /* synthetic */ px e;

    public q(px pxVar, boolean z10) {
        this.e = pxVar;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override // s4.g0
    public final int h() {
        boolean z10 = this.d;
        px pxVar = this.e;
        return (z10 ? pxVar.y : pxVar.x).size();
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        u uVar = (u) b1Var.a;
        uVar.b = i10;
        boolean z10 = this.d;
        px pxVar = this.e;
        if (z10) {
            uVar.setDialogId(((r) pxVar.y.get(i10)).c);
        } else {
            uVar.setDialogId(((r) pxVar.x.get(i10)).c);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        u uVar = new u(this.e, viewGroup.getContext());
        boolean z10 = this.d;
        uVar.N = z10;
        if (z10) {
            uVar.d(1.0f, 1.0f, 0.0f, false);
        }
        return new wl0(uVar);
    }
}
