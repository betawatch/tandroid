package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class o9 extends org.telegram.ui.ActionBar.u2 {
    public final n9 m1;
    public final /* synthetic */ org.telegram.ui.ActionBar.o4[] n1;
    public final /* synthetic */ s9 o1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9(Activity activity, org.telegram.ui.ActionBar.o4[] o4VarArr, int i7, s9 s9Var) {
        super(activity, false);
        this.n1 = o4VarArr;
        this.o1 = s9Var;
        o4VarArr[0].setFragmentStack(new ArrayList());
        n9 n9Var = new n9(this, i7);
        this.m1 = n9Var;
        n9Var.y = true;
        ((ActionBarLayout) o4VarArr[0]).c(-1, n9Var);
        ((ActionBarLayout) o4VarArr[0]).f0();
        ViewGroup view = o4VarArr[0].getView();
        int i10 = this.u0;
        view.setPadding(i10, 0, i10, 0);
        n9Var.N = s9Var;
        if (s9Var.J0() != null) {
            n9Var.c.setText(s9Var.J0());
        }
        this.b = o4VarArr[0].getView();
        this.w0 = false;
        setOnDismissListener(new q5(this, 1));
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean H() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.a2
    public final void dismiss() {
        super.dismiss();
        this.n1[0] = null;
        this.o1.onDismiss();
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.o4[] o4VarArr = this.n1;
        org.telegram.ui.ActionBar.o4 o4Var = o4VarArr[0];
        if (o4Var == null || o4Var.getFragmentStack().size() <= 1) {
            super.onBackPressed();
        } else {
            ((ActionBarLayout) o4VarArr[0]).I();
        }
    }
}
