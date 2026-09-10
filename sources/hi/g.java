package hi;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s b;
    public final /* synthetic */ a c;

    public /* synthetic */ g(s sVar, a aVar, int i10) {
        this.a = i10;
        this.b = sVar;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        a aVar = this.c;
        s sVar = this.b;
        switch (i10) {
            case 0:
                z3 z3Var = sVar.r;
                View y12 = z3Var.y1(aVar);
                if (!(y12 instanceof r4)) {
                    z3Var.Y2.N(false);
                    break;
                } else {
                    ((r4) y12).h(aVar, z3Var.getMapDelegate());
                    break;
                }
            case 1:
                sVar.r.V4(aVar, 0);
                break;
            case 2:
                sVar.r.V4(aVar, 1);
                break;
            case 3:
                sVar.r.V4(aVar, 2);
                break;
            case 4:
                sVar.r.V4(aVar, 3);
                break;
            case 5:
                sVar.r.U4(aVar, new TL_iv.pageBlockParagraph());
                break;
            case 6:
                z3 z3Var2 = sVar.r;
                ArrayList arrayList = z3.s4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                z3Var2.T4(this.c, pageblockblockquote, 0, 0, false, false);
                break;
            case 7:
                z3 z3Var3 = sVar.r;
                ArrayList arrayList2 = z3.s4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                z3Var3.T4(this.c, pageblockpullquote, 0, 0, false, false);
                break;
            case 8:
                sVar.r.U4(aVar, new TL_iv.pageBlockPreformatted());
                break;
            default:
                sVar.r.U4(aVar, new TL_iv.pageBlockFooter());
                break;
        }
    }
}
