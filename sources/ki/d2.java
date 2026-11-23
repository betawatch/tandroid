package ki;

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class d2 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ s2 b;

    public /* synthetic */ d2(s2 s2Var, int i7) {
        this.a = i7;
        this.b = s2Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        int i10 = this.a;
        s2 s2Var = this.b;
        switch (i10) {
            case 0:
                if (i7 != -1) {
                    if (i7 == R.id.menu_collapse_bot) {
                        s2Var.z0 = true;
                        s2Var.o(true);
                        break;
                    }
                } else if (!s2Var.E.D()) {
                    s2Var.v();
                    break;
                }
                break;
            default:
                if (i7 == -1) {
                    s2Var.v();
                    break;
                }
                break;
        }
    }
}
