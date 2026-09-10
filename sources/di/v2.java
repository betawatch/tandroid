package di;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class v2 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ n3 a;

    public v2(n3 n3Var) {
        this.a = n3Var;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        n3 n3Var = this.a;
        if (i10 == -1) {
            if (n3Var.x.D()) {
                return;
            }
            n3Var.q();
        } else if (i10 == R.id.menu_collapse_bot) {
            n3Var.x0 = true;
            n3Var.k(true);
        }
    }
}
