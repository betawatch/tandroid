package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class p9 extends org.telegram.ui.ActionBar.x2 {
    public final o9 m1;
    public final /* synthetic */ org.telegram.ui.ActionBar.s4[] n1;
    public final /* synthetic */ s9 o1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(Activity activity, org.telegram.ui.ActionBar.s4[] s4VarArr, int i7, s9 s9Var) {
        super(activity, false);
        this.n1 = s4VarArr;
        this.o1 = s9Var;
        s4VarArr[0].setFragmentStack(new ArrayList());
        o9 o9Var = new o9(this, i7);
        this.m1 = o9Var;
        o9Var.y = true;
        ((ActionBarLayout) s4VarArr[0]).c(-1, o9Var);
        ((ActionBarLayout) s4VarArr[0]).f0();
        ViewGroup view = s4VarArr[0].getView();
        int i10 = this.u0;
        view.setPadding(i10, 0, i10, 0);
        o9Var.N = s9Var;
        if (s9Var.J0() != null) {
            o9Var.c.setText(s9Var.J0());
        }
        this.b = s4VarArr[0].getView();
        this.w0 = false;
        setOnDismissListener(new q5(this, 1));
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.d2
    public final void dismiss() {
        super.dismiss();
        this.n1[0] = null;
        this.o1.onDismiss();
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.s4[] s4VarArr = this.n1;
        org.telegram.ui.ActionBar.s4 s4Var = s4VarArr[0];
        if (s4Var == null || s4Var.getFragmentStack().size() <= 1) {
            super.onBackPressed();
        } else {
            ((ActionBarLayout) s4VarArr[0]).I();
        }
    }
}
