package ci;

import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ x10 c;
    public final /* synthetic */ h2 d;

    public /* synthetic */ z(String str, x10 x10Var, h2 h2Var) {
        this.b = str;
        this.c = x10Var;
        this.d = h2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        h2 h2Var = this.d;
        x10 x10Var = this.c;
        String str = this.b;
        switch (i7) {
            case 0:
                b0.p(h2Var, 0, new z(str, x10Var, h2Var));
                break;
            default:
                if (str == null) {
                    lc.b0(h2Var).N(gd.M0(2131745666, null), gd.M0(2131751094, null)).j();
                    break;
                } else {
                    x10Var.a(str);
                    break;
                }
        }
    }

    public /* synthetic */ z(h2 h2Var, String str, x10 x10Var) {
        this.d = h2Var;
        this.b = str;
        this.c = x10Var;
    }
}
