package ai;

import android.view.ViewGroup;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.nx;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class v extends og.b {
    public final boolean d;
    public final /* synthetic */ nx e;

    public v(nx nxVar, boolean z10) {
        this.e = nxVar;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // s4.h0
    public final int h() {
        boolean z10 = this.d;
        nx nxVar = this.e;
        return (z10 ? nxVar.y : nxVar.x).size();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        a0 a0Var = (a0) c1Var.a;
        a0Var.b = i10;
        boolean z10 = this.d;
        nx nxVar = this.e;
        if (z10) {
            a0Var.setDialogId(((w) nxVar.y.get(i10)).c);
        } else {
            a0Var.setDialogId(((w) nxVar.x.get(i10)).c);
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
