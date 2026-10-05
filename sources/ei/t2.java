package ei;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class t2 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ l3 a;

    public t2(l3 l3Var) {
        this.a = l3Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        l3 l3Var = this.a;
        if (i10 == -1) {
            if (l3Var.x.D()) {
                return;
            }
            l3Var.q();
        } else if (i10 == R.id.menu_collapse_bot) {
            l3Var.x0 = true;
            l3Var.k(true);
        }
    }
}
