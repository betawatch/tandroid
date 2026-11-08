package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class o9 extends org.telegram.ui.ActionBar.v2 {
    public final n9 i1;
    public final /* synthetic */ org.telegram.ui.ActionBar.q4[] j1;
    public final /* synthetic */ r9 k1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9(Activity activity, org.telegram.ui.ActionBar.q4[] q4VarArr, int i7, r9 r9Var) {
        super(activity, false);
        this.j1 = q4VarArr;
        this.k1 = r9Var;
        q4VarArr[0].setFragmentStack(new ArrayList());
        n9 n9Var = new n9(this, i7);
        this.i1 = n9Var;
        n9Var.y = true;
        ((ActionBarLayout) q4VarArr[0]).c(-1, n9Var);
        ((ActionBarLayout) q4VarArr[0]).f0();
        ViewGroup view = q4VarArr[0].getView();
        int i10 = this.t0;
        view.setPadding(i10, 0, i10, 0);
        n9Var.M = r9Var;
        if (r9Var.R0() != null) {
            n9Var.c.setText(r9Var.R0());
        }
        this.b = q4VarArr[0].getView();
        this.v0 = false;
        setOnDismissListener(new q5(this, 1));
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        super.dismiss();
        this.j1[0] = null;
        this.k1.onDismiss();
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.q4[] q4VarArr = this.j1;
        org.telegram.ui.ActionBar.q4 q4Var = q4VarArr[0];
        if (q4Var == null || q4Var.getFragmentStack().size() <= 1) {
            super.onBackPressed();
        } else {
            ((ActionBarLayout) q4VarArr[0]).I();
        }
    }
}
