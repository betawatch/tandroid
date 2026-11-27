// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ge2 implements oqb {
    public final /* synthetic */ byte a;
    public final /* synthetic */ he2 b;

    public /* synthetic */ ge2(he2 he2Var, byte b) {
        this.a = b;
        this.b = he2Var;
    }

    @Override // oqb
    public final void a(TLRPC.WallPaper wallPaper) {
        byte b = this.a;
        he2 he2Var = this.b;
        switch (b) {
            case 0:
                oe2 oe2Var = he2Var.a;
                oe2Var.R1.H();
                oe2Var.dismiss();
                break;
            default:
                oe2 oe2Var2 = he2Var.a;
                oe2Var2.R1.H();
                oe2Var2.dismiss();
                break;
        }
    }
}
