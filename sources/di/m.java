package di;

import android.view.ViewGroup;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.sv;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class m extends rg.b {
    public final boolean d;
    public final /* synthetic */ sv e;

    public m(sv svVar, boolean z9) {
        this.e = svVar;
        this.d = z9;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override // v4.g0
    public final int b() {
        boolean z9 = this.d;
        sv svVar = this.e;
        return (z9 ? svVar.D : svVar.y).size();
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        p pVar = (p) d1Var.a;
        pVar.b = i7;
        boolean z9 = this.d;
        sv svVar = this.e;
        if (z9) {
            pVar.setDialogId(((n) svVar.D.get(i7)).c);
        } else {
            pVar.setDialogId(((n) svVar.y.get(i7)).c);
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        p pVar = new p(this.e, viewGroup.getContext());
        boolean z9 = this.d;
        pVar.N = z9;
        if (z9) {
            pVar.d(1.0f, 1.0f, 0.0f, false);
        }
        return new xi0(pVar);
    }
}
