package hi;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
