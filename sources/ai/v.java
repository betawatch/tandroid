package ai;

import android.view.ViewGroup;
import org.telegram.ui.Components.il0;
import org.telegram.ui.hx;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes4.dex */
public final class v extends og.b {
    public final boolean d;
    public final /* synthetic */ hx e;

    public v(hx hxVar, boolean z10) {
        this.e = hxVar;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.xl0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // s4.h0
    public final int h() {
        boolean z10 = this.d;
        hx hxVar = this.e;
        return (z10 ? hxVar.y : hxVar.x).size();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        a0 a0Var = (a0) c1Var.a;
        a0Var.b = i10;
        boolean z10 = this.d;
        hx hxVar = this.e;
        if (z10) {
            a0Var.setDialogId(((w) hxVar.y.get(i10)).c);
        } else {
            a0Var.setDialogId(((w) hxVar.x.get(i10)).c);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        a0 a0Var = new a0(this.e, viewGroup.getContext());
        boolean z10 = this.d;
        a0Var.N = z10;
        if (z10) {
            a0Var.d(1.0f, 1.0f, 0.0f, false);
        }
        return new il0(a0Var);
    }
}
