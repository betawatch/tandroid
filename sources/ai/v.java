package ai;

import android.view.ViewGroup;
import org.telegram.ui.Components.am0;
import org.telegram.ui.kx;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class v extends og.b {
    public final boolean d;
    public final /* synthetic */ kx e;

    public v(kx kxVar, boolean z10) {
        this.e = kxVar;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    @Override // s4.i0
    public final int h() {
        boolean z10 = this.d;
        kx kxVar = this.e;
        return (z10 ? kxVar.y : kxVar.x).size();
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        a0 a0Var = (a0) d1Var.a;
        a0Var.b = i10;
        boolean z10 = this.d;
        kx kxVar = this.e;
        if (z10) {
            a0Var.setDialogId(((w) kxVar.y.get(i10)).c);
        } else {
            a0Var.setDialogId(((w) kxVar.x.get(i10)).c);
        }
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        a0 a0Var = new a0(this.e, viewGroup.getContext());
        boolean z10 = this.d;
        a0Var.N = z10;
        if (z10) {
            a0Var.d(1.0f, 1.0f, 0.0f, false);
        }
        return new am0(a0Var);
    }
}
