package hi;

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class k2 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ a3 b;

    public /* synthetic */ k2(a3 a3Var, int i7) {
        this.a = i7;
        this.b = a3Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        int i10 = this.a;
        a3 a3Var = this.b;
        switch (i10) {
            case 0:
                if (i7 != -1) {
                    if (i7 == R.id.menu_collapse_bot) {
                        a3Var.y0 = true;
                        a3Var.o(true);
                        break;
                    }
                } else if (!a3Var.D.D()) {
                    a3Var.v();
                    break;
                }
                break;
            default:
                if (i7 == -1) {
                    a3Var.v();
                    break;
                }
                break;
        }
    }
}
