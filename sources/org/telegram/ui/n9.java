package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n9 extends org.telegram.ui.ActionBar.t2 {
    public final m9 j1;
    public final /* synthetic */ org.telegram.ui.ActionBar.q4[] k1;
    public final /* synthetic */ r9 l1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9(Activity activity, org.telegram.ui.ActionBar.q4[] q4VarArr, int i3, r9 r9Var) {
        super(activity, false);
        this.k1 = q4VarArr;
        this.l1 = r9Var;
        q4VarArr[0].setFragmentStack(new ArrayList());
        m9 m9Var = new m9(this, i3);
        this.j1 = m9Var;
        m9Var.y = true;
        ((ActionBarLayout) q4VarArr[0]).c(-1, m9Var);
        ((ActionBarLayout) q4VarArr[0]).f0();
        ViewGroup view = q4VarArr[0].getView();
        int i10 = this.u0;
        view.setPadding(i10, 0, i10, 0);
        m9Var.N = r9Var;
        if (r9Var.M0() != null) {
            m9Var.c.setText(r9Var.M0());
        }
        this.b = q4VarArr[0].getView();
        this.w0 = false;
        setOnDismissListener(new s5(this, 1));
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public final void dismiss() {
        super.dismiss();
        this.k1[0] = null;
        this.l1.onDismiss();
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.q4[] q4VarArr = this.k1;
        org.telegram.ui.ActionBar.q4 q4Var = q4VarArr[0];
        if (q4Var == null || q4Var.getFragmentStack().size() <= 1) {
            super.onBackPressed();
        } else {
            ((ActionBarLayout) q4VarArr[0]).I();
        }
    }
}
