package bi;

import android.view.ViewGroup;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.lx;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class q extends pg.b {
    public final boolean d;
    public final /* synthetic */ lx e;

    public q(lx lxVar, boolean z10) {
        this.e = lxVar;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // s4.h0
    public final int h() {
        boolean z10 = this.d;
        lx lxVar = this.e;
        return (z10 ? lxVar.y : lxVar.x).size();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        u uVar = (u) c1Var.a;
        uVar.b = i10;
        boolean z10 = this.d;
        lx lxVar = this.e;
        if (z10) {
            uVar.setDialogId(((r) lxVar.y.get(i10)).c);
        } else {
            uVar.setDialogId(((r) lxVar.x.get(i10)).c);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        u uVar = new u(this.e, viewGroup.getContext());
        boolean z10 = this.d;
        uVar.N = z10;
        if (z10) {
            uVar.d(1.0f, 1.0f, 0.0f, false);
        }
        return new vk0(uVar);
    }
}
