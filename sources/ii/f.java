package ii;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
                x3 x3Var = rVar.r;
                View A1 = x3Var.A1(aVar);
                if (!(A1 instanceof q4)) {
                    x3Var.f3.N(false);
                    break;
                } else {
                    ((q4) A1).h(aVar, x3Var.getMapDelegate());
                    break;
                }
            case 1:
                rVar.r.X4(aVar, 0);
                break;
            case 2:
                rVar.r.X4(aVar, 1);
                break;
            case 3:
                rVar.r.X4(aVar, 2);
                break;
            case 4:
                rVar.r.X4(aVar, 3);
                break;
            case 5:
                rVar.r.W4(aVar, new TL_iv.pageBlockParagraph());
                break;
            case 6:
                x3 x3Var2 = rVar.r;
                ArrayList arrayList = x3.z4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                x3Var2.V4(this.c, pageblockblockquote, 0, 0, false, false);
                break;
            case 7:
                x3 x3Var3 = rVar.r;
                ArrayList arrayList2 = x3.z4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                x3Var3.V4(this.c, pageblockpullquote, 0, 0, false, false);
                break;
            case 8:
                rVar.r.W4(aVar, new TL_iv.pageBlockPreformatted());
                break;
            default:
                rVar.r.W4(aVar, new TL_iv.pageBlockFooter());
                break;
        }
    }
}
