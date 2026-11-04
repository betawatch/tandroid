package ci;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y3 implements org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l6 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;

    public /* synthetic */ y3(l6 l6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i3) {
        this.a = i3;
        this.b = l6Var;
        this.c = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 0:
                sf.b h = s1Var.h(-1, true, true);
                h.d();
                TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
                l6 l6Var = this.b;
                updatestargiftprice.stargift = l6Var.B1();
                updatestargiftprice.resell_amount = TL_stars.StarsAmount.ofStars(0L);
                ConnectionsManager.getInstance(l6Var.a).sendRequest(updatestargiftprice, new ai.r6(l6Var, h, this.c, 2));
                break;
            default:
                sf.c.v(this.b.getContext(), "https://fragment.com/gift/" + this.c.slug, false);
                break;
        }
    }
}
