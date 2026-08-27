package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class p9 extends org.telegram.ui.ActionBar.e3 {
    public final o9 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.b5[] c;
    public final /* synthetic */ s9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(Activity activity, org.telegram.ui.ActionBar.b5[] b5VarArr, int i10, s9 s9Var) {
        super(activity, false);
        this.c = b5VarArr;
        this.d = s9Var;
        b5VarArr[0].setFragmentStack(new ArrayList());
        o9 o9Var = new o9(this, i10);
        this.b = o9Var;
        o9Var.w = true;
        ((ActionBarLayout) b5VarArr[0]).c(-1, o9Var);
        ((ActionBarLayout) b5VarArr[0]).c0();
        ViewGroup view = b5VarArr[0].getView();
        int i11 = this.backgroundPaddingLeft;
        view.setPadding(i11, 0, i11, 0);
        o9Var.H = s9Var;
        if (s9Var.z0() != null) {
            o9Var.b.setText(s9Var.z0());
        }
        this.containerView = b5VarArr[0].getView();
        setApplyBottomPadding(false);
        setApplyBottomPadding(false);
        setOnDismissListener(new s5(this, 1));
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        this.c[0] = null;
        this.d.onDismiss();
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
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
