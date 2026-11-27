// default package

import android.content.Context;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class mj3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nj3 b;

    public /* synthetic */ mj3(nj3 nj3Var, byte b) {
        this.a = b;
        this.b = nj3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        byte b = this.a;
        nj3 nj3Var = this.b;
        switch (b) {
            case 0:
                uj3 uj3Var = nj3Var.o0;
                Context context = nj3Var.getContext();
                i = ((e) uj3Var).currentAccount;
                uj3Var.showDialog(new l46(3, i, null, context, uj3Var));
                break;
            default:
                uj3 uj3Var2 = nj3Var.o0;
                ni3 ni3Var = uj3Var2.N0;
                if (ni3Var != null) {
                    ni3Var.dismiss();
                    uj3Var2.N0 = null;
                    break;
                }
                break;
        }
    }
}
