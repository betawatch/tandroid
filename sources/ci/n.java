package ci;

import android.view.ViewGroup;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.tw;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class n extends pg.b {
    public final boolean d;
    public final /* synthetic */ tw e;

    public n(tw twVar, boolean z10) {
        this.e = twVar;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override // s4.g0
    public final int h() {
        boolean z10 = this.d;
        tw twVar = this.e;
        return (z10 ? twVar.y : twVar.x).size();
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        q qVar = (q) b1Var.a;
        qVar.b = i10;
        boolean z10 = this.d;
        tw twVar = this.e;
        if (z10) {
            qVar.setDialogId(((o) twVar.y.get(i10)).c);
        } else {
            qVar.setDialogId(((o) twVar.x.get(i10)).c);
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
        return new sl0(qVar);
    }
}
