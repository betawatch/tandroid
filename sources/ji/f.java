package ji;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
                v3 v3Var = rVar.r;
                View y12 = v3Var.y1(aVar);
                if (!(y12 instanceof p4)) {
                    v3Var.Y2.N(false);
                    break;
                } else {
                    ((p4) y12).h(aVar, v3Var.getMapDelegate());
                    break;
                }
            case 1:
                rVar.r.V4(aVar, 0);
                break;
            case 2:
                rVar.r.V4(aVar, 1);
                break;
            case 3:
                rVar.r.V4(aVar, 2);
                break;
            case 4:
                rVar.r.V4(aVar, 3);
                break;
            case 5:
                rVar.r.U4(aVar, new TL_iv.pageBlockParagraph());
                break;
            case 6:
                v3 v3Var2 = rVar.r;
                ArrayList arrayList = v3.s4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                v3Var2.T4(this.c, pageblockblockquote, 0, 0, false, false);
                break;
            case 7:
                v3 v3Var3 = rVar.r;
                ArrayList arrayList2 = v3.s4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                v3Var3.T4(this.c, pageblockpullquote, 0, 0, false, false);
                break;
            case 8:
                rVar.r.U4(aVar, new TL_iv.pageBlockPreformatted());
                break;
            default:
                rVar.r.U4(aVar, new TL_iv.pageBlockFooter());
                break;
        }
    }
}
