package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class h2 extends e3 {
    public final /* synthetic */ k2 b;
    public final /* synthetic */ b5[] c;
    public final /* synthetic */ m2 d;
    public final /* synthetic */ e3[] e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(Activity activity, d6 d6Var, k2 k2Var, b5[] b5VarArr, m2 m2Var, e3[] e3VarArr) {
        super(1, (Context) activity, d6Var, true);
        this.b = k2Var;
        this.c = b5VarArr;
        this.d = m2Var;
        this.e = e3VarArr;
        boolean z10 = k2Var != null && k2Var.e;
        this.occupyNavigationBar = z10;
        this.drawNavigationBar = !z10;
        b5VarArr[0].setFragmentStack(new ArrayList());
        ((ActionBarLayout) b5VarArr[0]).c(-1, m2Var);
        ((ActionBarLayout) b5VarArr[0]).c0();
        ViewGroup view = b5VarArr[0].getView();
        int i10 = this.backgroundPaddingLeft;
        view.setPadding(i10, 0, i10, 0);
        this.containerView = b5VarArr[0].getView();
        setApplyBottomPadding(false);
        setOnDismissListener(new ei.e0(4, m2Var, k2Var));
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        b5[] b5VarArr;
        b5 b5Var;
        k2 k2Var = this.b;
        return k2Var != null && k2Var.a && (b5Var = (b5VarArr = this.c)[0]) != null && b5Var.getFragmentStack().size() <= 1 && (b5VarArr[0].getFragmentStack().size() != 1 || ((m2) b5VarArr[0].getFragmentStack().get(0)).isSwipeBackEnabled(motionEvent));
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        k2 k2Var;
        Runnable runnable;
        if (!isDismissed() && (k2Var = this.b) != null && (runnable = k2Var.d) != null) {
            runnable.run();
        }
        super.dismiss();
        ArrayList arrayList = LaunchActivity.G1.P;
        b5[] b5VarArr = this.c;
        arrayList.remove(b5VarArr[0]);
        b5VarArr[0] = null;
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void onBackPressed() {
        b5[] b5VarArr = this.c;
        b5 b5Var = b5VarArr[0];
        if (b5Var == null || b5Var.getFragmentStack().size() <= 1) {
            super.onBackPressed();
        } else {
            ((ActionBarLayout) b5VarArr[0]).G();
        }
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b5 b5Var = this.c[0];
        e3[] e3VarArr = this.e;
        b5Var.setWindow(e3VarArr[0].getWindow());
        m2 m2Var = this.d;
        k2 k2Var = this.b;
        if (k2Var == null || !k2Var.e) {
            fixNavigationBar(h6.v0(h6.i5, m2Var.getResourceProvider()));
        } else {
            AndroidUtilities.setLightNavigationBar((Dialog) e3VarArr[0], true);
        }
        AndroidUtilities.setLightStatusBar(this, m2Var.isLightStatusBar());
        m2Var.onBottomSheetCreated();
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void onInsetsChanged() {
        b5 b5Var = this.c[0];
        if (b5Var != null) {
            for (m2 m2Var : b5Var.getFragmentStack()) {
                if (m2Var.getFragmentView() != null) {
                    m2Var.getFragmentView().requestLayout();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void onOpenAnimationEnd() {
        Runnable runnable;
        this.d.onTransitionAnimationEnd(true, false);
        k2 k2Var = this.b;
        if (k2Var == null || (runnable = k2Var.c) == null) {
            return;
        }
        runnable.run();
    }
}
