// default package

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class id2 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xd2 b;

    public /* synthetic */ id2(xd2 xd2Var, byte b) {
        this.a = b;
        this.b = xd2Var;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        xd2 xd2Var = this.b;
        switch (b) {
            case 0:
                xd2Var.Y1 = (TL_stories.TL_premium_boostsStatus) obj;
                xd2Var.X1 = true;
                xd2Var.U0(true);
                xd2Var.W1 = false;
                break;
            default:
                ng1 ng1Var = (ng1) obj;
                if (xd2Var.getContext() != null) {
                    mu1 mu1Var = xd2Var.u1;
                    h26 h26Var = new h26(22, xd2Var.a, xd2Var.J0, xd2Var.getContext(), mu1Var);
                    h26Var.r1(ng1Var);
                    h26Var.q1(xd2Var.Y1, true);
                    h26Var.s1(xd2Var.u1.a());
                    h26Var.L2 = new gd2(xd2Var, (byte) 2);
                    h26Var.show();
                    break;
                }
                break;
        }
    }
}
