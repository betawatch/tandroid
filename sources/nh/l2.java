package nh;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class l2 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ b3 a;

    public l2(b3 b3Var) {
        this.a = b3Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        b3 b3Var = this.a;
        if (i10 == -1) {
            if (b3Var.x.z()) {
                return;
            }
            b3Var.q();
        } else if (i10 == R.id.menu_collapse_bot) {
            b3Var.t0 = true;
            b3Var.k(true);
        }
    }
}
