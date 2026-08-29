package cg;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class h2 extends il0 {
    public final /* synthetic */ h1 c;

    public h2(h1 h1Var) {
        this.c = h1Var;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return false;
    }

    @Override // f2.p0
    public final int h() {
        return ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        h1 h1Var = this.c;
        ArrayList arrayList = h1Var.T2;
        if (arrayList.isEmpty()) {
            return;
        }
        j2 j2Var = (j2) n1Var.a;
        j2Var.r = (TLRPC.Document) arrayList.get(i10 % arrayList.size());
        j2Var.s = true;
        j2Var.a(true ^ h1Var.Y2, false, false);
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        j2 j2Var = new j2(this.c, viewGroup.getContext());
        j2Var.setLayoutParams(new f2.x0(-1, -2));
        return new vk0(j2Var);
    }
}
