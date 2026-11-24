// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class f55 extends qb0 {
    public final /* synthetic */ h75 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f55(h75 h75Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.V = h75Var;
    }

    @Override // qb0, op8
    public final void c() {
        h75 h75Var = this.V;
        j5 j5Var = h75Var.n1;
        g55 g55Var = h75Var.l1;
        long dialogId = g55Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User V1 = na7.q1(j5Var.a).V1(Long.valueOf(dialogId));
            g55Var.H(null, gl5.m(j5Var.a, 0, V1), gl5.m(j5Var.a, 1, V1), false);
        }
    }
}
