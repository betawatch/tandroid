package oi;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b2 b;
    public final /* synthetic */ a c;

    public /* synthetic */ l1(b2 b2Var, a aVar, int i7) {
        this.a = i7;
        this.b = b2Var;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        a aVar = this.c;
        b2 b2Var = this.b;
        switch (i7) {
            case 0:
                t3 t3Var = b2Var.Q;
                ArrayList arrayList = t3.A4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                t3Var.X4(this.c, pageblockpullquote, 0, 0, false, false);
                break;
            case 1:
                b2Var.Q.Y4(aVar, new TL_iv.pageBlockPreformatted());
                break;
            case 2:
                b2Var.Q.Y4(aVar, new TL_iv.pageBlockFooter());
                break;
            case 3:
                b2Var.Q.Y4(aVar, new TL_iv.pageBlockParagraph());
                break;
            case 4:
                t3 t3Var2 = b2Var.Q;
                ArrayList arrayList2 = t3.A4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                t3Var2.X4(this.c, pageblockblockquote, 0, 0, false, false);
                break;
            case 5:
                b2Var.Q.Z4(aVar, 0);
                break;
            case 6:
                b2Var.Q.Z4(aVar, 1);
                break;
            case 7:
                b2Var.Q.Z4(aVar, 2);
                break;
            case 8:
                b2Var.Q.Z4(aVar, 3);
                break;
            default:
                View C1 = b2Var.Q.C1(aVar);
                if (!(C1 instanceof m4)) {
                    b2Var.Q.g3.O(false);
                    break;
                } else {
                    ((m4) C1).g(aVar, b2Var.Q.getMapDelegate());
                    break;
                }
        }
    }
}
