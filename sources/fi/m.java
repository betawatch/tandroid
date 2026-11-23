package fi;

import android.view.ViewGroup;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.sv;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class m extends rg.b {
    public final boolean d;
    public final /* synthetic */ sv e;

    public m(sv svVar, boolean z10) {
        this.e = svVar;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    @Override // v4.i0
    public final int b() {
        boolean z10 = this.d;
        sv svVar = this.e;
        return (z10 ? svVar.E : svVar.y).size();
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        p pVar = (p) f1Var.a;
        pVar.b = i7;
        boolean z10 = this.d;
        sv svVar = this.e;
        if (z10) {
            pVar.setDialogId(((n) svVar.E.get(i7)).c);
        } else {
            pVar.setDialogId(((n) svVar.y.get(i7)).c);
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        p pVar = new p(this.e, viewGroup.getContext());
        boolean z10 = this.d;
        pVar.O = z10;
        if (z10) {
            pVar.d(1.0f, 1.0f, 0.0f, false);
        }
        return new mj0(pVar);
    }
}
