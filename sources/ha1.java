// default package

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ha1 extends nx0 {
    public final ga1 l1;
    public final /* synthetic */ wk5[] m1;
    public final /* synthetic */ ka1 n1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha1(Activity activity, wk5[] wk5VarArr, int i, ka1 ka1Var) {
        super(activity, false);
        this.m1 = wk5VarArr;
        this.n1 = ka1Var;
        wk5VarArr[0].setFragmentStack(new ArrayList());
        ga1 ga1Var = new ga1(this, i);
        this.l1 = ga1Var;
        ga1Var.y = true;
        ((ActionBarLayout) wk5VarArr[0]).b(-1, ga1Var);
        ((ActionBarLayout) wk5VarArr[0]).e0();
        ViewGroup view = wk5VarArr[0].getView();
        int i2 = this.u0;
        view.setPadding(i2, 0, i2, 0);
        ga1Var.N = ka1Var;
        if (ka1Var.I() != null) {
            ga1Var.c.setText(ka1Var.I());
        }
        this.b = wk5VarArr[0].getView();
        this.w0 = false;
        setOnDismissListener(new o1(this, (byte) 10));
    }

    @Override // nx0
    public final boolean D() {
        return false;
    }

    @Override // nx0, android.app.Dialog, android.content.DialogInterface, ag0
    public final void dismiss() {
        super.dismiss();
        this.m1[0] = null;
        this.n1.onDismiss();
    }

    @Override // nx0, android.app.Dialog
    public final void onBackPressed() {
        wk5[] wk5VarArr = this.m1;
        wk5 wk5Var = wk5VarArr[0];
        if (wk5Var == null || wk5Var.getFragmentStack().size() <= 1) {
            super.onBackPressed();
        } else {
            ((ActionBarLayout) wk5VarArr[0]).G();
        }
    }
}
