package ii;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                View z12 = x3Var.z1(aVar);
                if (!(z12 instanceof p4)) {
                    x3Var.Y2.N(false);
                    break;
                } else {
                    ((p4) z12).h(aVar, x3Var.getMapDelegate());
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
                x3 x3Var2 = rVar.r;
                ArrayList arrayList = x3.s4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                x3Var2.U4(this.c, pageblockblockquote, 0, 0, false, false);
                break;
            case 7:
                x3 x3Var3 = rVar.r;
                ArrayList arrayList2 = x3.s4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                x3Var3.U4(this.c, pageblockpullquote, 0, 0, false, false);
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
