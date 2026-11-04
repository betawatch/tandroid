package ei;

import android.view.ViewGroup;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.mv;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n extends sg.b {
    public final boolean d;
    public final /* synthetic */ mv e;

    public n(mv mvVar, boolean z10) {
        this.e = mvVar;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return false;
    }

    @Override // u4.h0
    public final int b() {
        boolean z10 = this.d;
        mv mvVar = this.e;
        return (z10 ? mvVar.E : mvVar.y).size();
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        q qVar = (q) d1Var.a;
        qVar.b = i3;
        boolean z10 = this.d;
        mv mvVar = this.e;
        if (z10) {
            qVar.setDialogId(((o) mvVar.E.get(i3)).c);
        } else {
            qVar.setDialogId(((o) mvVar.y.get(i3)).c);
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        q qVar = new q(this.e, viewGroup.getContext());
        boolean z10 = this.d;
        qVar.O = z10;
        if (z10) {
            qVar.d(1.0f, 1.0f, 0.0f, false);
        }
        return new bj0(qVar);
    }
}
