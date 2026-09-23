package ii;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class n1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e2 b;
    public final /* synthetic */ a c;

    public /* synthetic */ n1(e2 e2Var, a aVar, int i10) {
        this.a = i10;
        this.b = e2Var;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        a aVar = this.c;
        e2 e2Var = this.b;
        switch (i10) {
            case 0:
                x3 x3Var = e2Var.P;
                ArrayList arrayList = x3.s4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                x3Var.U4(this.c, pageblockpullquote, 0, 0, false, false);
                break;
            case 1:
                e2Var.P.V4(aVar, new TL_iv.pageBlockPreformatted());
                break;
            case 2:
                e2Var.P.V4(aVar, new TL_iv.pageBlockFooter());
                break;
            case 3:
                e2Var.P.V4(aVar, new TL_iv.pageBlockParagraph());
                break;
            case 4:
                x3 x3Var2 = e2Var.P;
                ArrayList arrayList2 = x3.s4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                x3Var2.U4(this.c, pageblockblockquote, 0, 0, false, false);
                break;
            case 5:
                e2Var.P.W4(aVar, 0);
                break;
            case 6:
                e2Var.P.W4(aVar, 1);
                break;
            case 7:
                e2Var.P.W4(aVar, 2);
                break;
            case 8:
                e2Var.P.W4(aVar, 3);
                break;
            default:
                View z12 = e2Var.P.z1(aVar);
                if (!(z12 instanceof p4)) {
                    e2Var.P.Y2.N(false);
                    break;
                } else {
                    ((p4) z12).h(aVar, e2Var.P.getMapDelegate());
                    break;
                }
        }
    }
}
