package hi;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class v2 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ m3 a;

    public v2(m3 m3Var) {
        this.a = m3Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        m3 m3Var = this.a;
        if (i10 == -1) {
            if (m3Var.y.C()) {
                return;
            }
            m3Var.r();
        } else if (i10 == R.id.menu_collapse_bot) {
            m3Var.y0 = true;
            m3Var.k(true);
        }
    }
}
