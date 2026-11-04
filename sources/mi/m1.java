package mi;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c2 b;
    public final /* synthetic */ a c;

    public /* synthetic */ m1(c2 c2Var, a aVar, int i3) {
        this.a = i3;
        this.b = c2Var;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        a aVar = this.c;
        c2 c2Var = this.b;
        switch (i3) {
            case 0:
                t3 t3Var = c2Var.Q;
                ArrayList arrayList = t3.A4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                t3Var.X4(this.c, pageblockpullquote, 0, 0, false, false);
                break;
            case 1:
                c2Var.Q.Y4(aVar, new TL_iv.pageBlockPreformatted());
                break;
            case 2:
                c2Var.Q.Y4(aVar, new TL_iv.pageBlockFooter());
                break;
            case 3:
                c2Var.Q.Y4(aVar, new TL_iv.pageBlockParagraph());
                break;
            case 4:
                t3 t3Var2 = c2Var.Q;
                ArrayList arrayList2 = t3.A4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                t3Var2.X4(this.c, pageblockblockquote, 0, 0, false, false);
                break;
            case 5:
                c2Var.Q.Z4(aVar, 0);
                break;
            case 6:
                c2Var.Q.Z4(aVar, 1);
                break;
            case 7:
                c2Var.Q.Z4(aVar, 2);
                break;
            case 8:
                c2Var.Q.Z4(aVar, 3);
                break;
            default:
                View C1 = c2Var.Q.C1(aVar);
                if (!(C1 instanceof n4)) {
                    c2Var.Q.g3.O(false);
                    break;
                } else {
                    ((n4) C1).g(aVar, c2Var.Q.getMapDelegate());
                    break;
                }
        }
    }
}
