package fi;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
