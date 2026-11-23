package ci;

import org.telegram.messenger.hd;
import org.telegram.messenger.y10;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ y10 c;
    public final /* synthetic */ g2 d;

    public /* synthetic */ z(String str, y10 y10Var, g2 g2Var) {
        this.b = str;
        this.c = y10Var;
        this.d = g2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        g2 g2Var = this.d;
        y10 y10Var = this.c;
        String str = this.b;
        switch (i7) {
            case 0:
                b0.p(g2Var, 0, new z(str, y10Var, g2Var));
                break;
            default:
                if (str == null) {
                    lc.b0(g2Var).N(hd.N0(2131745665, null), hd.N0(2131751093, null)).j();
                    break;
                } else {
                    y10Var.a(str);
                    break;
                }
        }
    }

    public /* synthetic */ z(g2 g2Var, String str, y10 y10Var) {
        this.d = g2Var;
        this.b = str;
        this.c = y10Var;
    }
}
