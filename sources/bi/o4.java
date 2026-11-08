package bi;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o4 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;

    public /* synthetic */ o4(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i7) {
        this.a = i7;
        this.b = k7Var;
        this.c = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                vf.b h = u1Var.h(-1, true, true);
                h.d();
                TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
                k7 k7Var = this.b;
                updatestargiftprice.stargift = k7Var.B1();
                updatestargiftprice.resell_amount = TL_stars.StarsAmount.ofStars(0L);
                ConnectionsManager.getInstance(k7Var.a).sendRequest(updatestargiftprice, new f2(k7Var, h, this.c, 1));
                break;
            default:
                vf.c.v(this.b.getContext(), "https://fragment.com/gift/" + this.c.slug, false);
                break;
        }
    }
}
