package bi;

import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n4 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h7 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;

    public /* synthetic */ n4(h7 h7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.a = i10;
        this.b = h7Var;
        this.c = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 0:
                h7.V(this.b, this.c, e2Var);
                break;
            default:
                qf.d.t(this.b.getContext(), "https://fragment.com/gift/" + this.c.slug);
                break;
        }
    }
}
