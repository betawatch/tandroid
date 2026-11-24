// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class g82 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p82 b;
    public final /* synthetic */ ll0 c;

    public /* synthetic */ g82(p82 p82Var, ll0 ll0Var, byte b) {
        this.a = b;
        this.b = p82Var;
        this.c = ll0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ll0 ll0Var = this.c;
        p82 p82Var = this.b;
        switch (b) {
            case 0:
                ch9 ch9Var = p82Var.r;
                View C1 = ch9Var.C1(ll0Var);
                if (!(C1 instanceof th9)) {
                    ch9Var.g3.O(false);
                    break;
                } else {
                    ((th9) C1).g(ll0Var, ch9Var.getMapDelegate());
                    break;
                }
            case 1:
                p82Var.r.Z4(ll0Var, 0);
                break;
            case 2:
                p82Var.r.Z4(ll0Var, 1);
                break;
            case 3:
                p82Var.r.Z4(ll0Var, 2);
                break;
            case 4:
                p82Var.r.Z4(ll0Var, 3);
                break;
            case 5:
                p82Var.r.Y4(ll0Var, new TL_iv.pageBlockParagraph());
                break;
            case 6:
                ch9 ch9Var2 = p82Var.r;
                ArrayList arrayList = ch9.A4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                ch9Var2.X4(this.c, pageblockblockquote, 0, 0, false, false);
                break;
            case 7:
                ch9 ch9Var3 = p82Var.r;
                ArrayList arrayList2 = ch9.A4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                ch9Var3.X4(this.c, pageblockpullquote, 0, 0, false, false);
                break;
            case 8:
                p82Var.r.Y4(ll0Var, new TL_iv.pageBlockPreformatted());
                break;
            default:
                p82Var.r.Y4(ll0Var, new TL_iv.pageBlockFooter());
                break;
        }
    }
}
