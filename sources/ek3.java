// default package

import android.content.Context;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ek3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gk3 b;

    public /* synthetic */ ek3(gk3 gk3Var, byte b) {
        this.a = b;
        this.b = gk3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        byte b = this.a;
        gk3 gk3Var = this.b;
        switch (b) {
            case 0:
                nk3 nk3Var = gk3Var.u0;
                Context context = gk3Var.getContext();
                i = ((d) nk3Var).currentAccount;
                nk3Var.showDialog(new i46(3, i, null, context, nk3Var));
                break;
            default:
                nk3 nk3Var2 = gk3Var.u0;
                fj3 fj3Var = nk3Var2.N0;
                if (fj3Var != null) {
                    fj3Var.dismiss();
                    nk3Var2.N0 = null;
                    break;
                }
                break;
        }
    }
}
