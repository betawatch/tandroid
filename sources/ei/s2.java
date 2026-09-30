package ei;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final class s2 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ k3 a;

    public s2(k3 k3Var) {
        this.a = k3Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        k3 k3Var = this.a;
        if (i10 == -1) {
            if (k3Var.x.D()) {
                return;
            }
            k3Var.q();
        } else if (i10 == R.id.menu_collapse_bot) {
            k3Var.x0 = true;
            k3Var.k(true);
        }
    }
}
