package ii;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
                View B1 = x3Var.B1(aVar);
                if (!(B1 instanceof q4)) {
                    x3Var.f3.N(false);
                    break;
                } else {
                    ((q4) B1).h(aVar, x3Var.getMapDelegate());
                    break;
                }
            case 1:
                rVar.r.Y4(aVar, 0);
                break;
            case 2:
                rVar.r.Y4(aVar, 1);
                break;
            case 3:
                rVar.r.Y4(aVar, 2);
                break;
            case 4:
                rVar.r.Y4(aVar, 3);
                break;
            case 5:
                rVar.r.X4(aVar, new TL_iv.pageBlockParagraph());
                break;
            case 6:
                x3 x3Var2 = rVar.r;
                ArrayList arrayList = x3.z4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                x3Var2.W4(this.c, pageblockblockquote, 0, 0, false, false);
                break;
            case 7:
                x3 x3Var3 = rVar.r;
                ArrayList arrayList2 = x3.z4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                x3Var3.W4(this.c, pageblockpullquote, 0, 0, false, false);
                break;
            case 8:
                rVar.r.X4(aVar, new TL_iv.pageBlockPreformatted());
                break;
            default:
                rVar.r.X4(aVar, new TL_iv.pageBlockFooter());
                break;
        }
    }
}
