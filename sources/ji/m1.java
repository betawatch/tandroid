package ji;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class m1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d2 b;
    public final /* synthetic */ a c;

    public /* synthetic */ m1(d2 d2Var, a aVar, int i10) {
        this.a = i10;
        this.b = d2Var;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        a aVar = this.c;
        d2 d2Var = this.b;
        switch (i10) {
            case 0:
                x3 x3Var = d2Var.P;
                ArrayList arrayList = x3.q4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                x3Var.V4(this.c, pageblockpullquote, 0, 0, false, false);
                break;
            case 1:
                d2Var.P.W4(aVar, new TL_iv.pageBlockPreformatted());
                break;
            case 2:
                d2Var.P.W4(aVar, new TL_iv.pageBlockFooter());
                break;
            case 3:
                d2Var.P.W4(aVar, new TL_iv.pageBlockParagraph());
                break;
            case 4:
                x3 x3Var2 = d2Var.P;
                ArrayList arrayList2 = x3.q4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                x3Var2.V4(this.c, pageblockblockquote, 0, 0, false, false);
                break;
            case 5:
                d2Var.P.X4(aVar, 0);
                break;
            case 6:
                d2Var.P.X4(aVar, 1);
                break;
            case 7:
                d2Var.P.X4(aVar, 2);
                break;
            case 8:
                d2Var.P.X4(aVar, 3);
                break;
            default:
                View A1 = d2Var.P.A1(aVar);
                if (!(A1 instanceof r4)) {
                    d2Var.P.W2.N(false);
                    break;
                } else {
                    ((r4) A1).h(aVar, d2Var.P.getMapDelegate());
                    break;
                }
        }
    }
}
