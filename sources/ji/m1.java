package ji;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class m1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c2 b;
    public final /* synthetic */ a c;

    public /* synthetic */ m1(c2 c2Var, a aVar, int i10) {
        this.a = i10;
        this.b = c2Var;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        a aVar = this.c;
        c2 c2Var = this.b;
        switch (i10) {
            case 0:
                v3 v3Var = c2Var.P;
                ArrayList arrayList = v3.s4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                v3Var.T4(this.c, pageblockpullquote, 0, 0, false, false);
                break;
            case 1:
                c2Var.P.U4(aVar, new TL_iv.pageBlockPreformatted());
                break;
            case 2:
                c2Var.P.U4(aVar, new TL_iv.pageBlockFooter());
                break;
            case 3:
                c2Var.P.U4(aVar, new TL_iv.pageBlockParagraph());
                break;
            case 4:
                v3 v3Var2 = c2Var.P;
                ArrayList arrayList2 = v3.s4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                v3Var2.T4(this.c, pageblockblockquote, 0, 0, false, false);
                break;
            case 5:
                c2Var.P.V4(aVar, 0);
                break;
            case 6:
                c2Var.P.V4(aVar, 1);
                break;
            case 7:
                c2Var.P.V4(aVar, 2);
                break;
            case 8:
                c2Var.P.V4(aVar, 3);
                break;
            default:
                View y12 = c2Var.P.y1(aVar);
                if (!(y12 instanceof p4)) {
                    c2Var.P.Y2.N(false);
                    break;
                } else {
                    ((p4) y12).h(aVar, c2Var.P.getMapDelegate());
                    break;
                }
        }
    }
}
