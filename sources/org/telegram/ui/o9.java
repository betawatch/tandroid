package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class o9 extends org.telegram.ui.ActionBar.w2 {
    public final n9 l1;
    public final /* synthetic */ org.telegram.ui.ActionBar.r4[] m1;
    public final /* synthetic */ r9 n1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9(Activity activity, org.telegram.ui.ActionBar.r4[] r4VarArr, int i7, r9 r9Var) {
        super(activity, false);
        this.m1 = r4VarArr;
        this.n1 = r9Var;
        r4VarArr[0].setFragmentStack(new ArrayList());
        n9 n9Var = new n9(this, i7);
        this.l1 = n9Var;
        n9Var.y = true;
        ((ActionBarLayout) r4VarArr[0]).c(-1, n9Var);
        ((ActionBarLayout) r4VarArr[0]).f0();
        ViewGroup view = r4VarArr[0].getView();
        int i10 = this.t0;
        view.setPadding(i10, 0, i10, 0);
        n9Var.M = r9Var;
        if (r9Var.R0() != null) {
            n9Var.c.setText(r9Var.R0());
        }
        this.b = r4VarArr[0].getView();
        this.v0 = false;
        setOnDismissListener(new q5(this, 1));
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        super.dismiss();
        this.m1[0] = null;
        this.n1.onDismiss();
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.r4[] r4VarArr = this.m1;
        org.telegram.ui.ActionBar.r4 r4Var = r4VarArr[0];
        if (r4Var == null || r4Var.getFragmentStack().size() <= 1) {
            super.onBackPressed();
        } else {
            ((ActionBarLayout) r4VarArr[0]).I();
        }
    }
}
