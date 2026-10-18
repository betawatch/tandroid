package gi;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class m2 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ d3 a;

    public m2(d3 d3Var) {
        this.a = d3Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        d3 d3Var = this.a;
        if (i10 == -1) {
            if (d3Var.x.C()) {
                return;
            }
            d3Var.r();
        } else if (i10 == R.id.menu_collapse_bot) {
            d3Var.x0 = true;
            d3Var.k(true);
        }
    }
}
