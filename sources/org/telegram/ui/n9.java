package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class n9 extends org.telegram.ui.ActionBar.f3 {
    public final m9 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.b5[] c;
    public final /* synthetic */ q9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9(Activity activity, org.telegram.ui.ActionBar.b5[] b5VarArr, int i10, q9 q9Var) {
        super(activity, false);
        this.c = b5VarArr;
        this.d = q9Var;
        b5VarArr[0].setFragmentStack(new ArrayList());
        m9 m9Var = new m9(this, i10);
        this.b = m9Var;
        m9Var.w = true;
        ((ActionBarLayout) b5VarArr[0]).c(-1, m9Var);
        ((ActionBarLayout) b5VarArr[0]).c0();
        ViewGroup view = b5VarArr[0].getView();
        int i11 = this.backgroundPaddingLeft;
        view.setPadding(i11, 0, i11, 0);
        m9Var.H = q9Var;
        if (q9Var.E0() != null) {
            m9Var.b.setText(q9Var.E0());
        }
        this.containerView = b5VarArr[0].getView();
        setApplyBottomPadding(false);
        setApplyBottomPadding(false);
        setOnDismissListener(new s5(this, 1));
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
