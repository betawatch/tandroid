package fg;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.rl0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class f2 extends rl0 {
    public final /* synthetic */ f1 c;

    public f2(f1 f1Var) {
        this.c = f1Var;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        return false;
    }

    @Override // f2.p0
    public final int h() {
        return ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        f1 f1Var = this.c;
        ArrayList arrayList = f1Var.U2;
        if (arrayList.isEmpty()) {
            return;
        }
        h2 h2Var = (h2) m1Var.a;
        h2Var.r = (TLRPC.Document) arrayList.get(i10 % arrayList.size());
        h2Var.s = true;
        h2Var.a(true ^ f1Var.Z2, false, false);
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        h2 h2Var = new h2(this.c, viewGroup.getContext());
        h2Var.setLayoutParams(new f2.x0(-1, -2));
        return new el0(h2Var);
    }
}
