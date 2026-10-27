package di;

import android.view.ViewGroup;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.sw;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class n extends qg.b {
    public final boolean d;
    public final /* synthetic */ sw e;

    public n(sw swVar, boolean z10) {
        this.e = swVar;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return false;
    }

    @Override // s4.h0
    public final int h() {
        boolean z10 = this.d;
        sw swVar = this.e;
        return (z10 ? swVar.y : swVar.x).size();
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        q qVar = (q) e1Var.a;
        qVar.b = i10;
        boolean z10 = this.d;
        sw swVar = this.e;
        if (z10) {
            qVar.setDialogId(((o) swVar.y.get(i10)).c);
        } else {
            qVar.setDialogId(((o) swVar.x.get(i10)).c);
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        q qVar = new q(this.e, viewGroup.getContext());
        boolean z10 = this.d;
        qVar.N = z10;
        if (z10) {
            qVar.d(1.0f, 1.0f, 0.0f, false);
        }
        return new wl0(qVar);
    }
}
