// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
