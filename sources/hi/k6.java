package hi;

import org.telegram.messenger.x10;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class k6 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o6 b;

    public /* synthetic */ k6(o6 o6Var, int i7) {
        this.a = i7;
        this.b = o6Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                n6 n6Var = (n6) obj;
                o6 o6Var = this.b;
                o6Var.I = null;
                o6Var.F = n6Var;
                o6Var.E = n6Var != null;
                o6Var.a();
                o6Var.invalidate();
                s8 s8Var = o6Var.b;
                if (s8Var != null) {
                    s8Var.run();
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) obj;
                n6 n6Var2 = this.b.F;
                if (n6Var2 != null || h2Var == null) {
                    n6Var2.c(h2Var);
                    break;
                }
        }
    }
}
