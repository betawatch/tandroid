package di;

import android.view.ViewGroup;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.qw;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class n extends qg.b {
    public final boolean d;
    public final /* synthetic */ qw e;

    public n(qw qwVar, boolean z10) {
        this.e = qwVar;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        return false;
    }

    @Override // s4.h0
    public final int h() {
        boolean z10 = this.d;
        qw qwVar = this.e;
        return (z10 ? qwVar.y : qwVar.x).size();
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        q qVar = (q) e1Var.a;
        qVar.b = i10;
        boolean z10 = this.d;
        qw qwVar = this.e;
        if (z10) {
            qVar.setDialogId(((o) qwVar.y.get(i10)).c);
        } else {
            qVar.setDialogId(((o) qwVar.x.get(i10)).c);
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
        return new vl0(qVar);
    }
}
