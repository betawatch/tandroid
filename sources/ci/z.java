package ci;

import org.telegram.messenger.gd;
import org.telegram.messenger.w10;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Components.kc;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ w10 c;
    public final /* synthetic */ g2 d;

    public /* synthetic */ z(String str, w10 w10Var, g2 g2Var) {
        this.b = str;
        this.c = w10Var;
        this.d = g2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        g2 g2Var = this.d;
        w10 w10Var = this.c;
        String str = this.b;
        switch (i7) {
            case 0:
                b0.p(g2Var, 0, new z(str, w10Var, g2Var));
                break;
            default:
                if (str == null) {
                    kc.b0(g2Var).N(gd.N0(2131745665, null), gd.N0(2131751093, null)).j();
                    break;
                } else {
                    w10Var.a(str);
                    break;
                }
        }
    }

    public /* synthetic */ z(g2 g2Var, String str, w10 w10Var) {
        this.d = g2Var;
        this.b = str;
        this.c = w10Var;
    }
}
