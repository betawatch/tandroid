// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gd2 implements fd, gc7, ff7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pd2 b;

    public /* synthetic */ gd2(pd2 pd2Var, byte b) {
        this.a = b;
        this.b = pd2Var;
    }

    @Override // gc7
    public final boolean b(TLRPC.TL_error tL_error) {
        byte b = this.a;
        pd2 pd2Var = this.b;
        switch (b) {
            case 2:
                pd2Var.p0(false);
                return true;
            case 3:
                pd2Var.p0(false);
                return true;
            default:
                return pd2Var.m0(tL_error);
        }
    }

    @Override // ff7
    public final void run(long j) {
        this.b.l0(j);
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        byte b2 = 0;
        pd2 pd2Var = this.b;
        switch (b) {
            case 0:
                pd2Var.n0(true);
                break;
            case 1:
                pd2 pd2Var2 = this.b;
                pd2Var2.p0(true);
                id2 id2Var = new id2(pd2Var2, b2);
                if (!pd2Var2.L && !pd2Var2.M) {
                    pd2Var2.getMessagesController().k(pd2Var2.x.id, pd2Var2.w, pd2Var2.Z0, pd2Var2, true, id2Var, new gd2(pd2Var2, (byte) 3));
                    break;
                } else {
                    pd2Var2.getMessagesController().d5(pd2Var2.x.id, pd2Var2.w, pd2Var2.L ? pd2Var2.N : pd2.d0(false), pd2Var2.T, false, pd2Var2, pd2Var2.a1, pd2Var2.L, pd2Var2.Z0, id2Var, new gd2(pd2Var2, (byte) 2));
                    break;
                }
            case 2:
            case 3:
            default:
                pd2Var.getClass();
                pd2Var.presentFragment(new o7c(6, null));
                break;
            case 4:
                pd2Var.finishFragment();
                break;
            case 5:
                pd2Var.getClass();
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                q72 q72Var = new q72(pd2Var, twoStepVerificationActivity, (byte) 5);
                twoStepVerificationActivity.a0 = (byte) 0;
                twoStepVerificationActivity.c0 = q72Var;
                pd2Var.presentFragment(twoStepVerificationActivity);
                break;
        }
    }
}
