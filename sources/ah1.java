// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ah1 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wh1 b;

    public /* synthetic */ ah1(wh1 wh1Var, byte b) {
        this.a = b;
        this.b = wh1Var;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        wh1 wh1Var = this.b;
        switch (b) {
            case 0:
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                wh1Var.F = wallPaper;
                wh1Var.G = wallPaper;
                wh1Var.H = wallPaper;
                wh1Var.e1(false);
                wh1Var.h1(false);
                hl.d3(new bh1(wh1Var, (byte) 0), 350L);
                break;
            case 1:
                wh1Var.X0((wg1) obj);
                break;
            default:
                wh1Var.d1((TL_stories.TL_premium_boostsStatus) obj);
                break;
        }
    }
}
