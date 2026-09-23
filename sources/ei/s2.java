package ei;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
