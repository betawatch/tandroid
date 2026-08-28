package gh;

import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class d3 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k5 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;

    public /* synthetic */ d3(k5 k5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i9) {
        this.a = i9;
        this.b = k5Var;
        this.c = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 0:
                k5.N0(this.b, this.c, c2Var);
                break;
            default:
                ve.e.u(this.b.getContext(), "https://fragment.com/gift/" + this.c.slug);
                break;
        }
    }
}
