package bi;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;
    public final /* synthetic */ a c;

    public /* synthetic */ h(t tVar, a aVar, int i10) {
        this.a = i10;
        this.b = tVar;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        a aVar = this.c;
        t tVar = this.b;
        switch (i10) {
            case 0:
                d4 d4Var = tVar.r;
                View C1 = d4Var.C1(aVar);
                if (!(C1 instanceof y4)) {
                    d4Var.f3.O(false);
                    break;
                } else {
                    ((y4) C1).g(aVar, d4Var.getMapDelegate());
                    break;
                }
            case 1:
                tVar.r.Z4(aVar, 0);
                break;
            case 2:
                tVar.r.Z4(aVar, 1);
                break;
            case 3:
                tVar.r.Z4(aVar, 2);
                break;
            case 4:
                tVar.r.Z4(aVar, 3);
                break;
            case 5:
                tVar.r.Y4(aVar, new TL_iv.pageBlockParagraph());
                break;
            case 6:
                d4 d4Var2 = tVar.r;
                ArrayList arrayList = d4.z4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                d4Var2.X4(this.c, pageblockblockquote, 0, 0, false, false);
                break;
            case 7:
                d4 d4Var3 = tVar.r;
                ArrayList arrayList2 = d4.z4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                d4Var3.X4(this.c, pageblockpullquote, 0, 0, false, false);
                break;
            case 8:
                tVar.r.Y4(aVar, new TL_iv.pageBlockPreformatted());
                break;
            default:
                tVar.r.Y4(aVar, new TL_iv.pageBlockFooter());
                break;
        }
    }
}
