package ci;

import android.view.ViewGroup;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.vw;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class n extends pg.b {
    public final boolean d;
    public final /* synthetic */ vw e;

    public n(vw vwVar, boolean z10) {
        this.e = vwVar;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override // s4.g0
    public final int h() {
        boolean z10 = this.d;
        vw vwVar = this.e;
        return (z10 ? vwVar.y : vwVar.x).size();
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        q qVar = (q) b1Var.a;
        qVar.b = i10;
        boolean z10 = this.d;
        vw vwVar = this.e;
        if (z10) {
            qVar.setDialogId(((o) vwVar.y.get(i10)).c);
        } else {
            qVar.setDialogId(((o) vwVar.x.get(i10)).c);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        q qVar = new q(this.e, viewGroup.getContext());
        boolean z10 = this.d;
        qVar.N = z10;
        if (z10) {
            qVar.d(1.0f, 1.0f, 0.0f, false);
        }
        return new wl0(qVar);
    }
}
