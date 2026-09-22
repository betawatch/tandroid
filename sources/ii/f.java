package ii;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;
    public final /* synthetic */ a c;

    public /* synthetic */ f(r rVar, a aVar, int i10) {
        this.a = i10;
        this.b = rVar;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        a aVar = this.c;
        r rVar = this.b;
        switch (i10) {
            case 0:
                w3 w3Var = rVar.r;
                View z12 = w3Var.z1(aVar);
                if (!(z12 instanceof o4)) {
                    w3Var.Y2.N(false);
                    break;
                } else {
                    ((o4) z12).h(aVar, w3Var.getMapDelegate());
                    break;
                }
            case 1:
                rVar.r.W4(aVar, 0);
                break;
            case 2:
                rVar.r.W4(aVar, 1);
                break;
            case 3:
                rVar.r.W4(aVar, 2);
                break;
            case 4:
                rVar.r.W4(aVar, 3);
                break;
            case 5:
                rVar.r.V4(aVar, new TL_iv.pageBlockParagraph());
                break;
            case 6:
                w3 w3Var2 = rVar.r;
                ArrayList arrayList = w3.s4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                w3Var2.U4(this.c, pageblockblockquote, 0, 0, false, false);
                break;
            case 7:
                w3 w3Var3 = rVar.r;
                ArrayList arrayList2 = w3.s4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                w3Var3.U4(this.c, pageblockpullquote, 0, 0, false, false);
                break;
            case 8:
                rVar.r.V4(aVar, new TL_iv.pageBlockPreformatted());
                break;
            default:
                rVar.r.V4(aVar, new TL_iv.pageBlockFooter());
                break;
        }
    }
}
