// default package

import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
