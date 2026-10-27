package li;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b2 b;
    public final /* synthetic */ a c;

    public /* synthetic */ l1(b2 b2Var, a aVar, int i10) {
        this.a = i10;
        this.b = b2Var;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        a aVar = this.c;
        b2 b2Var = this.b;
        switch (i10) {
            case 0:
                v3 v3Var = b2Var.P;
                ArrayList arrayList = v3.A4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                v3Var.a5(this.c, pageblockpullquote, 0, 0, false, false);
                break;
            case 1:
                b2Var.P.b5(aVar, new TL_iv.pageBlockPreformatted());
                break;
            case 2:
                b2Var.P.b5(aVar, new TL_iv.pageBlockFooter());
                break;
            case 3:
                b2Var.P.b5(aVar, new TL_iv.pageBlockParagraph());
                break;
            case 4:
                v3 v3Var2 = b2Var.P;
                ArrayList arrayList2 = v3.A4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                v3Var2.a5(this.c, pageblockblockquote, 0, 0, false, false);
                break;
            case 5:
                b2Var.P.c5(aVar, 0);
                break;
            case 6:
                b2Var.P.c5(aVar, 1);
                break;
            case 7:
                b2Var.P.c5(aVar, 2);
                break;
            case 8:
                b2Var.P.c5(aVar, 3);
                break;
            default:
                View F1 = b2Var.P.F1(aVar);
                if (!(F1 instanceof o4)) {
                    b2Var.P.g3.O(false);
                    break;
                } else {
                    ((o4) F1).g(aVar, b2Var.P.getMapDelegate());
                    break;
                }
        }
    }
}
