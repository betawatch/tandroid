package fi;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
