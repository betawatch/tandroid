package kg;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.sk0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w1 extends sk0 {
    public final /* synthetic */ b1 c;

    public w1(b1 b1Var) {
        this.c = b1Var;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // s4.g0
    public final int b() {
        return ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        b1 b1Var = this.c;
        ArrayList arrayList = b1Var.e3;
        if (arrayList.isEmpty()) {
            return;
        }
        y1 y1Var = (y1) c1Var.a;
        y1Var.r = (TLRPC.Document) arrayList.get(i10 % arrayList.size());
        y1Var.s = true;
        y1Var.a(true ^ b1Var.j3, false, false);
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        y1 y1Var = new y1(this.c, viewGroup.getContext());
        y1Var.setLayoutParams(new s4.o0(-1, -2));
        return new ck0(y1Var);
    }
}
