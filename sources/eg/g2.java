package eg;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.rl0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class g2 extends rl0 {
    public final /* synthetic */ g1 c;

    public g2(g1 g1Var) {
        this.c = g1Var;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        return false;
    }

    @Override // f2.o0
    public final int h() {
        return ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        g1 g1Var = this.c;
        ArrayList arrayList = g1Var.U2;
        if (arrayList.isEmpty()) {
            return;
        }
        i2 i2Var = (i2) l1Var.a;
        i2Var.r = (TLRPC.Document) arrayList.get(i10 % arrayList.size());
        i2Var.s = true;
        i2Var.a(true ^ g1Var.Z2, false, false);
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        i2 i2Var = new i2(this.c, viewGroup.getContext());
        i2Var.setLayoutParams(new f2.w0(-1, -2));
        return new el0(i2Var);
    }
}
