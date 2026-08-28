package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o9 extends org.telegram.ui.ActionBar.f3 {
    public final n9 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.b5[] c;
    public final /* synthetic */ r9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9(Activity activity, org.telegram.ui.ActionBar.b5[] b5VarArr, int i9, r9 r9Var) {
        super(activity, false);
        this.c = b5VarArr;
        this.d = r9Var;
        b5VarArr[0].setFragmentStack(new ArrayList());
        n9 n9Var = new n9(this, i9);
        this.b = n9Var;
        n9Var.w = true;
        ((ActionBarLayout) b5VarArr[0]).c(-1, n9Var);
        ((ActionBarLayout) b5VarArr[0]).c0();
        ViewGroup view = b5VarArr[0].getView();
        int i10 = this.backgroundPaddingLeft;
        view.setPadding(i10, 0, i10, 0);
        n9Var.H = r9Var;
        if (r9Var.C0() != null) {
            n9Var.b.setText(r9Var.C0());
        }
        this.containerView = b5VarArr[0].getView();
        setApplyBottomPadding(false);
        setApplyBottomPadding(false);
        setOnDismissListener(new r5(this, 1));
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        this.c[0] = null;
        this.d.onDismiss();
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.b5[] b5VarArr = this.c;
        org.telegram.ui.ActionBar.b5 b5Var = b5VarArr[0];
        if (b5Var == null || b5Var.getFragmentStack().size() <= 1) {
            super.onBackPressed();
        } else {
            ((ActionBarLayout) b5VarArr[0]).G();
        }
    }
}
