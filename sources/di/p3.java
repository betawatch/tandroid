package di;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class p3 implements org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c6 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;

    public /* synthetic */ p3(c6 c6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i7) {
        this.a = i7;
        this.b = c6Var;
        this.c = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                vf.b h = t1Var.h(-1, true, true);
                h.d();
                TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
                c6 c6Var = this.b;
                updatestargiftprice.stargift = c6Var.B1();
                updatestargiftprice.resell_amount = TL_stars.StarsAmount.ofStars(0L);
                ConnectionsManager.getInstance(c6Var.a).sendRequest(updatestargiftprice, new bi.j6(c6Var, h, this.c, 2));
                break;
            default:
                vf.c.v(this.b.getContext(), "https://fragment.com/gift/" + this.c.slug, false);
                break;
        }
    }
}
