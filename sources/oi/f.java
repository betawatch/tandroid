package oi;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;
    public final /* synthetic */ a c;

    public /* synthetic */ f(o oVar, a aVar, int i7) {
        this.a = i7;
        this.b = oVar;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        a aVar = this.c;
        o oVar = this.b;
        switch (i7) {
            case 0:
                t3 t3Var = oVar.r;
                View C1 = t3Var.C1(aVar);
                if (!(C1 instanceof m4)) {
                    t3Var.g3.O(false);
                    break;
                } else {
                    ((m4) C1).g(aVar, t3Var.getMapDelegate());
                    break;
                }
            case 1:
                oVar.r.Z4(aVar, 0);
                break;
            case 2:
                oVar.r.Z4(aVar, 1);
                break;
            case 3:
                oVar.r.Z4(aVar, 2);
                break;
            case 4:
                oVar.r.Z4(aVar, 3);
                break;
            case 5:
                oVar.r.Y4(aVar, new TL_iv.pageBlockParagraph());
                break;
            case 6:
                t3 t3Var2 = oVar.r;
                ArrayList arrayList = t3.A4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                t3Var2.X4(this.c, pageblockblockquote, 0, 0, false, false);
                break;
            case 7:
                t3 t3Var3 = oVar.r;
                ArrayList arrayList2 = t3.A4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                t3Var3.X4(this.c, pageblockpullquote, 0, 0, false, false);
                break;
            case 8:
                oVar.r.Y4(aVar, new TL_iv.pageBlockPreformatted());
                break;
            default:
                oVar.r.Y4(aVar, new TL_iv.pageBlockFooter());
                break;
        }
    }
}
