// default package

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b58 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o68 b;

    public /* synthetic */ b58(o68 o68Var, byte b) {
        this.a = b;
        this.b = o68Var;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        o68 o68Var = this.b;
        switch (b) {
            case 0:
                o68Var.getClass();
                o68Var.u3 = ((Long) obj).longValue();
                h58 h58Var = o68Var.L1;
                if (h58Var != null) {
                    h58Var.P(true);
                    o68Var.L1.K2();
                }
                o68Var.h0(true);
                break;
            default:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    o68Var.s3 = tL_premium_boostsStatus;
                    uc7.s1(o68Var.m2).G0().b(o68Var.l1, tL_premium_boostsStatus, new v35(o68Var, tL_premium_boostsStatus, (byte) 18));
                    break;
                } else {
                    lcb lcbVar = o68Var.t0;
                    if (lcbVar != null) {
                        lcbVar.k1 = false;
                        lcbVar.U();
                        break;
                    }
                }
                break;
        }
    }
}
