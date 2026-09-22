package ii;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class n1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d2 b;
    public final /* synthetic */ a c;

    public /* synthetic */ n1(d2 d2Var, a aVar, int i10) {
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
                w3 w3Var = d2Var.P;
                ArrayList arrayList = w3.s4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                w3Var.V4(this.c, pageblockpullquote, 0, 0, false, false);
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
                w3 w3Var2 = d2Var.P;
                ArrayList arrayList2 = w3.s4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                w3Var2.V4(this.c, pageblockblockquote, 0, 0, false, false);
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
                if (!(A1 instanceof o4)) {
                    d2Var.P.Y2.N(false);
                    break;
                } else {
                    ((o4) A1).h(aVar, d2Var.P.getMapDelegate());
                    break;
                }
        }
    }
}
