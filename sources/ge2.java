// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
