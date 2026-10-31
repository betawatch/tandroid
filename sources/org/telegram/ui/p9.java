package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p9 extends org.telegram.ui.ActionBar.z2 {
    public final o9 i1;
    public final /* synthetic */ org.telegram.ui.ActionBar.z4[] j1;
    public final /* synthetic */ t9 k1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(Activity activity, org.telegram.ui.ActionBar.z4[] z4VarArr, int i10, t9 t9Var) {
        super(activity, false);
        this.j1 = z4VarArr;
        this.k1 = t9Var;
        z4VarArr[0].setFragmentStack(new ArrayList());
        o9 o9Var = new o9(this, i10);
        this.i1 = o9Var;
        o9Var.y = true;
        ((ActionBarLayout) z4VarArr[0]).c(-1, o9Var);
        ((ActionBarLayout) z4VarArr[0]).e0();
        ViewGroup view = z4VarArr[0].getView();
        int i11 = this.t0;
        view.setPadding(i11, 0, i11, 0);
        o9Var.M = t9Var;
        if (t9Var.P0() != null) {
            o9Var.c.setText(t9Var.P0());
        }
        this.b = z4VarArr[0].getView();
        this.v0 = false;
        setOnDismissListener(new q5(this, 1));
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean H() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        super.dismiss();
        this.j1[0] = null;
        this.k1.onDismiss();
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.z4[] z4VarArr = this.j1;
        org.telegram.ui.ActionBar.z4 z4Var = z4VarArr[0];
        if (z4Var == null || z4Var.getFragmentStack().size() <= 1) {
            super.onBackPressed();
        } else {
            ((ActionBarLayout) z4VarArr[0]).H();
        }
    }
}
