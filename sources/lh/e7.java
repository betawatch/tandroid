package lh;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e7 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ i7 b;

    public /* synthetic */ e7(i7 i7Var, int i10) {
        this.a = i10;
        this.b = i7Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                h7 h7Var = (h7) obj;
                i7 i7Var = this.b;
                i7Var.D = null;
                i7Var.A = h7Var;
                i7Var.y = h7Var != null;
                i7Var.a();
                i7Var.invalidate();
                s9 s9Var = i7Var.b;
                if (s9Var != null) {
                    s9Var.run();
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                h7 h7Var2 = this.b.A;
                if (h7Var2 != null || n2Var == null) {
                    h7Var2.c(n2Var);
                    break;
                }
        }
    }
}
