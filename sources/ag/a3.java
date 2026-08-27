package ag;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.yk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class a3 extends yk0 {
    public final /* synthetic */ w1 c;

    public a3(w1 w1Var) {
        this.c = w1Var;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return false;
    }

    @Override // f2.q0
    public final int h() {
        return ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        w1 w1Var = this.c;
        ArrayList arrayList = w1Var.T2;
        if (arrayList.isEmpty()) {
            return;
        }
        c3 c3Var = (c3) o1Var.a;
        c3Var.r = (TLRPC.Document) arrayList.get(i10 % arrayList.size());
        c3Var.s = true;
        c3Var.a(true ^ w1Var.Y2, false, false);
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        c3 c3Var = new c3(this.c, viewGroup.getContext());
        c3Var.setLayoutParams(new f2.y0(-1, -2));
        return new lk0(c3Var);
    }
}
