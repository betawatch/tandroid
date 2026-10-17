package gi;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
