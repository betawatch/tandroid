package di;

import android.view.ViewGroup;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.pv;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class m extends rg.b {
    public final boolean d;
    public final /* synthetic */ pv e;

    public m(pv pvVar, boolean z9) {
        this.e = pvVar;
        this.d = z9;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override // v4.g0
    public final int b() {
        boolean z9 = this.d;
        pv pvVar = this.e;
        return (z9 ? pvVar.D : pvVar.y).size();
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        p pVar = (p) d1Var.a;
        pVar.b = i7;
        boolean z9 = this.d;
        pv pvVar = this.e;
        if (z9) {
            pVar.setDialogId(((n) pvVar.D.get(i7)).c);
        } else {
            pVar.setDialogId(((n) pvVar.y.get(i7)).c);
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
