package gi;

import org.telegram.messenger.u10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n6 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r6 b;

    public /* synthetic */ n6(r6 r6Var, int i3) {
        this.a = i3;
        this.b = r6Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                q6 q6Var = (q6) obj;
                r6 r6Var = this.b;
                r6Var.I = null;
                r6Var.F = q6Var;
                r6Var.E = q6Var != null;
                r6Var.a();
                r6Var.invalidate();
                v8 v8Var = r6Var.b;
                if (v8Var != null) {
                    v8Var.run();
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                q6 q6Var2 = this.b.F;
                if (q6Var2 != null || d2Var == null) {
                    q6Var2.c(d2Var);
                    break;
                }
        }
    }
}
