// default package

import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class m implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b1 b;
    public final /* synthetic */ a1 c;

    public /* synthetic */ m(b1 b1Var, a1 a1Var, byte b) {
        this.a = b;
        this.b = b1Var;
        this.c = a1Var;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        a1 a1Var = this.c;
        b1 b1Var = this.b;
        switch (b) {
            case 0:
                if (b1Var.p2 != null) {
                    a1Var.c(0, true);
                    b1Var.r1(null);
                    break;
                }
                break;
            default:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                if (b1Var.p2 != aiComposeTone) {
                    a1Var.d(aiComposeTone, true);
                    b1Var.r1(aiComposeTone);
                    break;
                }
                break;
        }
    }
}
