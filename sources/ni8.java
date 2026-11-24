// default package

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ni8 extends n39 {
    public final /* synthetic */ dh8 c;

    public ni8(dh8 dh8Var) {
        this.c = dh8Var;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return false;
    }

    @Override // w39
    public final int b() {
        return ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        ArrayList arrayList = this.c.f3;
        if (arrayList.isEmpty()) {
            return;
        }
        pi8 pi8Var = (pi8) s49Var.a;
        pi8Var.r = (TLRPC.Document) arrayList.get(i % arrayList.size());
        pi8Var.s = true;
        pi8Var.a(!r2.k3, false, false);
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        pi8 pi8Var = new pi8(this.c, viewGroup.getContext());
        pi8Var.setLayoutParams(new e49(-1, -2));
        return new y29(pi8Var);
    }
}
