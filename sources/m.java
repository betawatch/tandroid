// default package

import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class m implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a1 b;
    public final /* synthetic */ z0 c;

    public /* synthetic */ m(a1 a1Var, z0 z0Var, byte b) {
        this.a = b;
        this.b = a1Var;
        this.c = z0Var;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        z0 z0Var = this.c;
        a1 a1Var = this.b;
        switch (b) {
            case 0:
                if (a1Var.p2 != null) {
                    z0Var.c(0, true);
                    a1Var.p1(null);
                    break;
                }
                break;
            default:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                if (a1Var.p2 != aiComposeTone) {
                    z0Var.d(aiComposeTone, true);
                    a1Var.p1(aiComposeTone);
                    break;
                }
                break;
        }
    }
}
