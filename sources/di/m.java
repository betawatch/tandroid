package di;

import android.view.ViewGroup;
import org.telegram.ui.Components.yi0;
import org.telegram.ui.rv;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class m extends rg.b {
    public final boolean d;
    public final /* synthetic */ rv e;

    public m(rv rvVar, boolean z9) {
        this.e = rvVar;
        this.d = z9;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override // v4.g0
    public final int b() {
        boolean z9 = this.d;
        rv rvVar = this.e;
        return (z9 ? rvVar.D : rvVar.y).size();
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        p pVar = (p) d1Var.a;
        pVar.b = i7;
        boolean z9 = this.d;
        rv rvVar = this.e;
        if (z9) {
            pVar.setDialogId(((n) rvVar.D.get(i7)).c);
        } else {
            pVar.setDialogId(((n) rvVar.y.get(i7)).c);
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
        return new yi0(pVar);
    }
}
