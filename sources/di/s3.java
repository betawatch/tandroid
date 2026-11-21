package di;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s3 implements org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;

    public /* synthetic */ s3(f6 f6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i7) {
        this.a = i7;
        this.b = f6Var;
        this.c = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                vf.b h = t1Var.h(-1, true, true);
                h.d();
                TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
                f6 f6Var = this.b;
                updatestargiftprice.stargift = f6Var.G1();
                updatestargiftprice.resell_amount = TL_stars.StarsAmount.ofStars(0L);
                ConnectionsManager.getInstance(f6Var.a).sendRequest(updatestargiftprice, new bi.q1(f6Var, h, this.c, 3));
                break;
            default:
                vf.c.v(this.b.getContext(), "https://fragment.com/gift/" + this.c.slug, false);
                break;
        }
    }
}
