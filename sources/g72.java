// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g72 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v72 b;
    public final /* synthetic */ mk0 c;

    public /* synthetic */ g72(v72 v72Var, mk0 mk0Var, byte b) {
        this.a = b;
        this.b = v72Var;
        this.c = mk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        mk0 mk0Var = this.c;
        v72 v72Var = this.b;
        switch (b) {
            case 0:
                pi9 pi9Var = v72Var.r;
                View D1 = pi9Var.D1(mk0Var);
                if (!(D1 instanceof gj9)) {
                    pi9Var.g3.O(false);
                    break;
                } else {
                    ((gj9) D1).g(mk0Var, pi9Var.getMapDelegate());
                    break;
                }
            case 1:
                v72Var.r.a5(mk0Var, 0);
                break;
            case 2:
                v72Var.r.a5(mk0Var, 1);
                break;
            case 3:
                v72Var.r.a5(mk0Var, 2);
                break;
            case 4:
                v72Var.r.a5(mk0Var, 3);
                break;
            case 5:
                v72Var.r.Z4(mk0Var, new TL_iv.pageBlockParagraph());
                break;
            case 6:
                pi9 pi9Var2 = v72Var.r;
                ArrayList arrayList = pi9.A4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                pi9Var2.Y4(this.c, pageblockblockquote, 0, 0, false, false);
                break;
            case 7:
                pi9 pi9Var3 = v72Var.r;
                ArrayList arrayList2 = pi9.A4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                pi9Var3.Y4(this.c, pageblockpullquote, 0, 0, false, false);
                break;
            case 8:
                v72Var.r.Z4(mk0Var, new TL_iv.pageBlockPreformatted());
                break;
            default:
                v72Var.r.Z4(mk0Var, new TL_iv.pageBlockFooter());
                break;
        }
    }
}
