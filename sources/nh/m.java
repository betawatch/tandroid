package nh;

import android.view.ViewGroup;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.ix;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class m extends bg.c {
    public final boolean d;
    public final /* synthetic */ ix e;

    public m(ix ixVar, boolean z4) {
        this.e = ixVar;
        this.d = z4;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        return false;
    }

    @Override // f2.o0
    public final int h() {
        boolean z4 = this.d;
        ix ixVar = this.e;
        return (z4 ? ixVar.y : ixVar.x).size();
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        p pVar = (p) l1Var.a;
        pVar.b = i10;
        boolean z4 = this.d;
        ix ixVar = this.e;
        if (z4) {
            pVar.setDialogId(((n) ixVar.y.get(i10)).c);
        } else {
            pVar.setDialogId(((n) ixVar.x.get(i10)).c);
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        p pVar = new p(this.e, viewGroup.getContext());
        boolean z4 = this.d;
        pVar.K = z4;
        if (z4) {
            pVar.d(1.0f, 1.0f, 0.0f, false);
        }
        return new dl0(pVar);
    }
}
