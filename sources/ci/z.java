package ci;

import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ x10 c;
    public final /* synthetic */ g2 d;

    public /* synthetic */ z(String str, x10 x10Var, g2 g2Var) {
        this.b = str;
        this.c = x10Var;
        this.d = g2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        g2 g2Var = this.d;
        x10 x10Var = this.c;
        String str = this.b;
        switch (i7) {
            case 0:
                b0.p(g2Var, 0, new z(str, x10Var, g2Var));
                break;
            default:
                if (str == null) {
                    lc.b0(g2Var).N(gd.N0(2131745665, null), gd.N0(2131751093, null)).j();
                    break;
                } else {
                    x10Var.a(str);
                    break;
                }
        }
    }

    public /* synthetic */ z(g2 g2Var, String str, x10 x10Var) {
        this.d = g2Var;
        this.b = str;
        this.c = x10Var;
    }
}
