package fi;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
