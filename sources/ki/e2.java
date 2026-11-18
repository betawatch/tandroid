package ki;

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class e2 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ t2 b;

    public /* synthetic */ e2(t2 t2Var, int i7) {
        this.a = i7;
        this.b = t2Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        int i10 = this.a;
        t2 t2Var = this.b;
        switch (i10) {
            case 0:
                if (i7 != -1) {
                    if (i7 == R.id.menu_collapse_bot) {
                        t2Var.z0 = true;
                        t2Var.o(true);
                        break;
                    }
                } else if (!t2Var.E.D()) {
                    t2Var.v();
                    break;
                }
                break;
            default:
                if (i7 == -1) {
                    t2Var.v();
                    break;
                }
                break;
        }
    }
}
