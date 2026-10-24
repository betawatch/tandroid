package gi;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
            if (d3Var.y.C()) {
                return;
            }
            d3Var.r();
        } else if (i10 == R.id.menu_collapse_bot) {
            d3Var.y0 = true;
            d3Var.k(true);
        }
    }
}
