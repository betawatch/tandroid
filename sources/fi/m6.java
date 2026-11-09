package fi;

import org.telegram.messenger.c20;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class m6 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q6 b;

    public /* synthetic */ m6(q6 q6Var, int i7) {
        this.a = i7;
        this.b = q6Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                p6 p6Var = (p6) obj;
                q6 q6Var = this.b;
                q6Var.H = null;
                q6Var.E = p6Var;
                q6Var.D = p6Var != null;
                q6Var.a();
                q6Var.invalidate();
                u8 u8Var = q6Var.b;
                if (u8Var != null) {
                    u8Var.run();
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj;
                p6 p6Var2 = this.b.E;
                if (p6Var2 != null || f2Var == null) {
                    p6Var2.c(f2Var);
                    break;
                }
        }
    }
}
