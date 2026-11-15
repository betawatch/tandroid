package ki;

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class i2 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ x2 b;

    public /* synthetic */ i2(x2 x2Var, int i7) {
        this.a = i7;
        this.b = x2Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        int i10 = this.a;
        x2 x2Var = this.b;
        switch (i10) {
            case 0:
                if (i7 != -1) {
                    if (i7 == R.id.menu_collapse_bot) {
                        x2Var.z0 = true;
                        x2Var.o(true);
                        break;
                    }
                } else if (!x2Var.E.D()) {
                    x2Var.v();
                    break;
                }
                break;
            default:
                if (i7 == -1) {
                    x2Var.v();
                    break;
                }
                break;
        }
    }
}
