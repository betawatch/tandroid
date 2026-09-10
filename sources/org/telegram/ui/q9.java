package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class q9 extends org.telegram.ui.ActionBar.h3 {
    public final p9 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f5[] c;
    public final /* synthetic */ t9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9(Activity activity, org.telegram.ui.ActionBar.f5[] f5VarArr, int i10, t9 t9Var) {
        super(activity, false);
        this.c = f5VarArr;
        this.d = t9Var;
        f5VarArr[0].setFragmentStack(new ArrayList());
        p9 p9Var = new p9(this, i10);
        this.b = p9Var;
        p9Var.w = true;
        ((ActionBarLayout) f5VarArr[0]).c(-1, p9Var);
        ((ActionBarLayout) f5VarArr[0]).c0();
        ViewGroup view = f5VarArr[0].getView();
        int i11 = this.backgroundPaddingLeft;
        view.setPadding(i11, 0, i11, 0);
        p9Var.L = t9Var;
        if (t9Var.J0() != null) {
            p9Var.b.setText(t9Var.J0());
        }
        this.containerView = f5VarArr[0].getView();
        setApplyBottomPadding(false);
        setApplyBottomPadding(false);
        setOnDismissListener(new s5(this, 1));
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        this.c[0] = null;
        this.d.onDismiss();
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.f5[] f5VarArr = this.c;
        org.telegram.ui.ActionBar.f5 f5Var = f5VarArr[0];
        if (f5Var == null || f5Var.getFragmentStack().size() <= 1) {
            super.onBackPressed();
        } else {
            ((ActionBarLayout) f5VarArr[0]).G();
        }
    }
}
