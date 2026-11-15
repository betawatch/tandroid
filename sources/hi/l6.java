package hi;

import org.telegram.messenger.z10;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class l6 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p6 b;

    public /* synthetic */ l6(p6 p6Var, int i7) {
        this.a = i7;
        this.b = p6Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                o6 o6Var = (o6) obj;
                p6 p6Var = this.b;
                p6Var.I = null;
                p6Var.F = o6Var;
                p6Var.E = o6Var != null;
                p6Var.a();
                p6Var.invalidate();
                s8 s8Var = p6Var.b;
                if (s8Var != null) {
                    s8Var.run();
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj;
                o6 o6Var2 = this.b.F;
                if (o6Var2 != null || e2Var == null) {
                    o6Var2.c(e2Var);
                    break;
                }
        }
    }
}
