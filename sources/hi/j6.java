package hi;

import org.telegram.messenger.y10;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class j6 implements y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n6 b;

    public /* synthetic */ j6(n6 n6Var, int i7) {
        this.a = i7;
        this.b = n6Var;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                m6 m6Var = (m6) obj;
                n6 n6Var = this.b;
                n6Var.I = null;
                n6Var.F = m6Var;
                n6Var.E = m6Var != null;
                n6Var.a();
                n6Var.invalidate();
                r8 r8Var = n6Var.b;
                if (r8Var != null) {
                    r8Var.run();
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj;
                m6 m6Var2 = this.b.F;
                if (m6Var2 != null || g2Var == null) {
                    m6Var2.c(g2Var);
                    break;
                }
        }
    }
}
