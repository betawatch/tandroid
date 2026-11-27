// default package

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class am8 extends c79 {
    public final /* synthetic */ rk8 c;

    public am8(rk8 rk8Var) {
        this.c = rk8Var;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return false;
    }

    @Override // j79
    public final int b() {
        return ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        ArrayList arrayList = this.c.f3;
        if (arrayList.isEmpty()) {
            return;
        }
        cm8 cm8Var = (cm8) f89Var.a;
        cm8Var.r = (TLRPC.Document) arrayList.get(i % arrayList.size());
        cm8Var.s = true;
        cm8Var.a(!r2.k3, false, false);
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        cm8 cm8Var = new cm8(this.c, viewGroup.getContext());
        cm8Var.setLayoutParams(new r79(-1, -2));
        return new n69(cm8Var);
    }
}
