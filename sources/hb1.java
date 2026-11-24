// default package

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hb1 extends my0 {
    public final gb1 l1;
    public final /* synthetic */ tk5[] m1;
    public final /* synthetic */ kb1 n1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb1(Activity activity, tk5[] tk5VarArr, int i, kb1 kb1Var) {
        super(activity, false);
        this.m1 = tk5VarArr;
        this.n1 = kb1Var;
        tk5VarArr[0].setFragmentStack(new ArrayList());
        gb1 gb1Var = new gb1(this, i);
        this.l1 = gb1Var;
        gb1Var.y = true;
        ((ActionBarLayout) tk5VarArr[0]).b(-1, gb1Var);
        ((ActionBarLayout) tk5VarArr[0]).e0();
        ViewGroup view = tk5VarArr[0].getView();
        int i2 = this.u0;
        view.setPadding(i2, 0, i2, 0);
        gb1Var.N = kb1Var;
        if (kb1Var.B0() != null) {
            gb1Var.c.setText(kb1Var.B0());
        }
        this.b = tk5VarArr[0].getView();
        this.w0 = false;
        setOnDismissListener(new n1(this, (byte) 10));
    }

    @Override // my0
    public final boolean C() {
        return false;
    }

    @Override // my0, android.app.Dialog, android.content.DialogInterface, ah0
    public final void dismiss() {
        super.dismiss();
        this.m1[0] = null;
        this.n1.onDismiss();
    }

    @Override // my0, android.app.Dialog
    public final void onBackPressed() {
        tk5[] tk5VarArr = this.m1;
        tk5 tk5Var = tk5VarArr[0];
        if (tk5Var == null || tk5Var.getFragmentStack().size() <= 1) {
            super.onBackPressed();
        } else {
            ((ActionBarLayout) tk5VarArr[0]).G();
        }
    }
}
