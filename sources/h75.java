// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class h75 extends sb0 {
    public final /* synthetic */ j95 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h75(j95 j95Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.V = j95Var;
    }

    @Override // sb0, at8
    public final void c() {
        j95 j95Var = this.V;
        k5 k5Var = j95Var.n1;
        i75 i75Var = j95Var.l1;
        long dialogId = i75Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User X1 = uc7.s1(k5Var.a).X1(Long.valueOf(dialogId));
            i75Var.H(null, jn5.m(k5Var.a, 0, X1), jn5.m(k5Var.a, 1, X1), false);
        }
    }
}
