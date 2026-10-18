package ki;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;
    public final /* synthetic */ a c;

    public /* synthetic */ f(q qVar, a aVar, int i10) {
        this.a = i10;
        this.b = qVar;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        a aVar = this.c;
        q qVar = this.b;
        switch (i10) {
            case 0:
                w3 w3Var = qVar.r;
                View A1 = w3Var.A1(aVar);
                if (!(A1 instanceof o4)) {
                    w3Var.W2.N(false);
                    break;
                } else {
                    ((o4) A1).h(aVar, w3Var.getMapDelegate());
                    break;
                }
            case 1:
                qVar.r.X4(aVar, 0);
                break;
            case 2:
                qVar.r.X4(aVar, 1);
                break;
            case 3:
                qVar.r.X4(aVar, 2);
                break;
            case 4:
                qVar.r.X4(aVar, 3);
                break;
            case 5:
                qVar.r.W4(aVar, new TL_iv.pageBlockParagraph());
                break;
            case 6:
                w3 w3Var2 = qVar.r;
                ArrayList arrayList = w3.q4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                w3Var2.V4(this.c, pageblockblockquote, 0, 0, false, false);
                break;
            case 7:
                w3 w3Var3 = qVar.r;
                ArrayList arrayList2 = w3.q4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                w3Var3.V4(this.c, pageblockpullquote, 0, 0, false, false);
                break;
            case 8:
                qVar.r.W4(aVar, new TL_iv.pageBlockPreformatted());
                break;
            default:
                qVar.r.W4(aVar, new TL_iv.pageBlockFooter());
                break;
        }
    }
}
