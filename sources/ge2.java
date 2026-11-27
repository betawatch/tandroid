// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
