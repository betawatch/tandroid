package bi;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class t1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k2 b;
    public final /* synthetic */ a c;

    public /* synthetic */ t1(k2 k2Var, a aVar, int i10) {
        this.a = i10;
        this.b = k2Var;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        a aVar = this.c;
        k2 k2Var = this.b;
        switch (i10) {
            case 0:
                d4 d4Var = k2Var.P;
                ArrayList arrayList = d4.z4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                d4Var.X4(this.c, pageblockpullquote, 0, 0, false, false);
                break;
            case 1:
                k2Var.P.Y4(aVar, new TL_iv.pageBlockPreformatted());
                break;
            case 2:
                k2Var.P.Y4(aVar, new TL_iv.pageBlockFooter());
                break;
            case 3:
                k2Var.P.Y4(aVar, new TL_iv.pageBlockParagraph());
                break;
            case 4:
                d4 d4Var2 = k2Var.P;
                ArrayList arrayList2 = d4.z4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                d4Var2.X4(this.c, pageblockblockquote, 0, 0, false, false);
                break;
            case 5:
                k2Var.P.Z4(aVar, 0);
                break;
            case 6:
                k2Var.P.Z4(aVar, 1);
                break;
            case 7:
                k2Var.P.Z4(aVar, 2);
                break;
            case 8:
                k2Var.P.Z4(aVar, 3);
                break;
            default:
                View C1 = k2Var.P.C1(aVar);
                if (!(C1 instanceof y4)) {
                    k2Var.P.f3.O(false);
                    break;
                } else {
                    ((y4) C1).g(aVar, k2Var.P.getMapDelegate());
                    break;
                }
        }
    }
}
