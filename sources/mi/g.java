package mi;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;
    public final /* synthetic */ a c;

    public /* synthetic */ g(p pVar, a aVar, int i3) {
        this.a = i3;
        this.b = pVar;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        a aVar = this.c;
        p pVar = this.b;
        switch (i3) {
            case 0:
                t3 t3Var = pVar.r;
                View C1 = t3Var.C1(aVar);
                if (!(C1 instanceof n4)) {
                    t3Var.g3.O(false);
                    break;
                } else {
                    ((n4) C1).g(aVar, t3Var.getMapDelegate());
                    break;
                }
            case 1:
                pVar.r.Z4(aVar, 0);
                break;
            case 2:
                pVar.r.Z4(aVar, 1);
                break;
            case 3:
                pVar.r.Z4(aVar, 2);
                break;
            case 4:
                pVar.r.Z4(aVar, 3);
                break;
            case 5:
                pVar.r.Y4(aVar, new TL_iv.pageBlockParagraph());
                break;
            case 6:
                t3 t3Var2 = pVar.r;
                ArrayList arrayList = t3.A4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                t3Var2.X4(this.c, pageblockblockquote, 0, 0, false, false);
                break;
            case 7:
                t3 t3Var3 = pVar.r;
                ArrayList arrayList2 = t3.A4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                t3Var3.X4(this.c, pageblockpullquote, 0, 0, false, false);
                break;
            case 8:
                pVar.r.Y4(aVar, new TL_iv.pageBlockPreformatted());
                break;
            default:
                pVar.r.Y4(aVar, new TL_iv.pageBlockFooter());
                break;
        }
    }
}
