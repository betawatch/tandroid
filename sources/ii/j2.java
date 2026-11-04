package ii;

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j2 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ a3 b;

    public /* synthetic */ j2(a3 a3Var, int i3) {
        this.a = i3;
        this.b = a3Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i3) {
        int i10 = this.a;
        a3 a3Var = this.b;
        switch (i10) {
            case 0:
                if (i3 != -1) {
                    if (i3 == R.id.menu_collapse_bot) {
                        a3Var.z0 = true;
                        a3Var.o(true);
                        break;
                    }
                } else if (!a3Var.E.C()) {
                    a3Var.v();
                    break;
                }
                break;
            default:
                if (i3 == -1) {
                    a3Var.v();
                    break;
                }
                break;
        }
    }
}
