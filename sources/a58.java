// default package

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class a58 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o68 b;

    public /* synthetic */ a58(o68 o68Var, byte b) {
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
                g58 g58Var = o68Var.L1;
                if (g58Var != null) {
                    g58Var.P(true);
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
