// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class be2 implements ee, ac7, xe7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ke2 b;

    public /* synthetic */ be2(ke2 ke2Var, byte b) {
        this.a = b;
        this.b = ke2Var;
    }

    @Override // ac7
    public final boolean b(TLRPC.TL_error tL_error) {
        byte b = this.a;
        ke2 ke2Var = this.b;
        switch (b) {
            case 2:
                ke2Var.q0(false);
                return true;
            case 3:
                ke2Var.q0(false);
                return true;
            default:
                return ke2Var.n0(tL_error);
        }
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        byte b2 = 0;
        ke2 ke2Var = this.b;
        switch (b) {
            case 0:
                ke2Var.o0(true);
                break;
            case 1:
                ke2 ke2Var2 = this.b;
                ke2Var2.q0(true);
                de2 de2Var = new de2(ke2Var2, b2);
                if (!ke2Var2.L && !ke2Var2.M) {
                    ke2Var2.getMessagesController().k(ke2Var2.x.id, ke2Var2.w, ke2Var2.Z0, ke2Var2, true, de2Var, new be2(ke2Var2, (byte) 3));
                    break;
                } else {
                    ke2Var2.getMessagesController().X4(ke2Var2.x.id, ke2Var2.w, ke2Var2.L ? ke2Var2.N : ke2.e0(false), ke2Var2.T, false, ke2Var2, ke2Var2.a1, ke2Var2.L, ke2Var2.Z0, de2Var, new be2(ke2Var2, (byte) 2));
                    break;
                }
            case 2:
            case 3:
            default:
                ke2Var.getClass();
                ke2Var.presentFragment(new p5c(6, null));
                break;
            case 4:
                ke2Var.finishFragment();
                break;
            case 5:
                ke2Var.getClass();
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                x92 x92Var = new x92(ke2Var, twoStepVerificationActivity, (byte) 4);
                twoStepVerificationActivity.a0 = (byte) 0;
                twoStepVerificationActivity.c0 = x92Var;
                ke2Var.presentFragment(twoStepVerificationActivity);
                break;
        }
    }

    @Override // xe7
    public final void run(long j) {
        this.b.m0(j);
    }
}
