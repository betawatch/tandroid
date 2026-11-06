package li;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;
    public final /* synthetic */ a c;

    public /* synthetic */ f(p pVar, a aVar, int i7) {
        this.a = i7;
        this.b = pVar;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        a aVar = this.c;
        p pVar = this.b;
        switch (i7) {
            case 0:
                t3 t3Var = pVar.r;
                View C1 = t3Var.C1(aVar);
                if (!(C1 instanceof m4)) {
                    t3Var.f3.O(false);
                    break;
                } else {
                    ((m4) C1).g(aVar, t3Var.getMapDelegate());
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
                ArrayList arrayList = t3.z4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                t3Var2.X4(this.c, pageblockblockquote, 0, 0, false, false);
                break;
            case 7:
                t3 t3Var3 = pVar.r;
                ArrayList arrayList2 = t3.z4;
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
