package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class i2 extends e3 {
    public final /* synthetic */ l2 b;
    public final /* synthetic */ b5[] c;
    public final /* synthetic */ n2 d;
    public final /* synthetic */ e3[] e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(Activity activity, c6 c6Var, l2 l2Var, b5[] b5VarArr, n2 n2Var, e3[] e3VarArr) {
        super(activity, c6Var, true, false);
        this.b = l2Var;
        this.c = b5VarArr;
        this.d = n2Var;
        this.e = e3VarArr;
        boolean z10 = l2Var != null && l2Var.e;
        this.occupyNavigationBar = z10;
        this.drawNavigationBar = !z10;
        b5VarArr[0].setFragmentStack(new ArrayList());
        ((ActionBarLayout) b5VarArr[0]).c(-1, n2Var);
        ((ActionBarLayout) b5VarArr[0]).c0();
        ViewGroup view = b5VarArr[0].getView();
        int i10 = this.backgroundPaddingLeft;
        view.setPadding(i10, 0, i10, 0);
        this.containerView = b5VarArr[0].getView();
        setApplyBottomPadding(false);
        setOnDismissListener(new cg.g(5, n2Var, l2Var));
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        b5[] b5VarArr;
        b5 b5Var;
        l2 l2Var = this.b;
        return l2Var != null && l2Var.a && (b5Var = (b5VarArr = this.c)[0]) != null && b5Var.getFragmentStack().size() <= 1 && (b5VarArr[0].getFragmentStack().size() != 1 || ((n2) b5VarArr[0].getFragmentStack().get(0)).isSwipeBackEnabled(motionEvent));
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        l2 l2Var;
        Runnable runnable;
        if (!isDismissed() && (l2Var = this.b) != null && (runnable = l2Var.d) != null) {
            runnable.run();
        }
        super.dismiss();
        ArrayList arrayList = LaunchActivity.C1.L;
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
        n2 n2Var = this.d;
        l2 l2Var = this.b;
        if (l2Var == null || !l2Var.e) {
            fixNavigationBar(g6.v0(g6.i5, n2Var.getResourceProvider()));
        } else {
            AndroidUtilities.setLightNavigationBar((Dialog) e3VarArr[0], true);
        }
        AndroidUtilities.setLightStatusBar(this, n2Var.isLightStatusBar());
        n2Var.onBottomSheetCreated();
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void onInsetsChanged() {
        b5 b5Var = this.c[0];
        if (b5Var != null) {
            for (n2 n2Var : b5Var.getFragmentStack()) {
                if (n2Var.getFragmentView() != null) {
                    n2Var.getFragmentView().requestLayout();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void onOpenAnimationEnd() {
        Runnable runnable;
        this.d.onTransitionAnimationEnd(true, false);
        l2 l2Var = this.b;
        if (l2Var == null || (runnable = l2Var.c) == null) {
            return;
        }
        runnable.run();
    }
}
