package hi;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class p1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g2 b;
    public final /* synthetic */ a c;

    public /* synthetic */ p1(g2 g2Var, a aVar, int i10) {
        this.a = i10;
        this.b = g2Var;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        a aVar = this.c;
        g2 g2Var = this.b;
        switch (i10) {
            case 0:
                z3 z3Var = g2Var.P;
                ArrayList arrayList = z3.s4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                z3Var.T4(this.c, pageblockpullquote, 0, 0, false, false);
                break;
            case 1:
                g2Var.P.U4(aVar, new TL_iv.pageBlockPreformatted());
                break;
            case 2:
                g2Var.P.U4(aVar, new TL_iv.pageBlockFooter());
                break;
            case 3:
                g2Var.P.U4(aVar, new TL_iv.pageBlockParagraph());
                break;
            case 4:
                z3 z3Var2 = g2Var.P;
                ArrayList arrayList2 = z3.s4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                z3Var2.T4(this.c, pageblockblockquote, 0, 0, false, false);
                break;
            case 5:
                g2Var.P.V4(aVar, 0);
                break;
            case 6:
                g2Var.P.V4(aVar, 1);
                break;
            case 7:
                g2Var.P.V4(aVar, 2);
                break;
            case 8:
                g2Var.P.V4(aVar, 3);
                break;
            default:
                View y12 = g2Var.P.y1(aVar);
                if (!(y12 instanceof r4)) {
                    g2Var.P.Y2.N(false);
                    break;
                } else {
                    ((r4) y12).h(aVar, g2Var.P.getMapDelegate());
                    break;
                }
        }
    }
}
