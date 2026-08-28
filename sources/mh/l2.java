package mh;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class l2 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ c3 a;

    public l2(c3 c3Var) {
        this.a = c3Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i9) {
        c3 c3Var = this.a;
        if (i9 == -1) {
            if (c3Var.x.z()) {
                return;
            }
            c3Var.q();
        } else if (i9 == R.id.menu_collapse_bot) {
            c3Var.t0 = true;
            c3Var.k(true);
        }
    }
}
