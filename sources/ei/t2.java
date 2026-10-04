package ei;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
