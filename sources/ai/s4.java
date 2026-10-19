package ai;

import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class s4 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l7 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;

    public /* synthetic */ s4(l7 l7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.a = i10;
        this.b = l7Var;
        this.c = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                l7.W(this.b, this.c, b2Var);
                break;
            default:
                pf.d.t(this.b.getContext(), "https://fragment.com/gift/" + this.c.slug);
                break;
        }
    }
}
