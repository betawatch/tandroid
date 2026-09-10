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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class k2 extends h3 {
    public final /* synthetic */ n2 b;
    public final /* synthetic */ f5[] c;
    public final /* synthetic */ p2 d;
    public final /* synthetic */ h3[] e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(Activity activity, f6 f6Var, n2 n2Var, f5[] f5VarArr, p2 p2Var, h3[] h3VarArr) {
        super(1, (Context) activity, f6Var, true);
        this.b = n2Var;
        this.c = f5VarArr;
        this.d = p2Var;
        this.e = h3VarArr;
        boolean z10 = n2Var != null && n2Var.e;
        this.occupyNavigationBar = z10;
        this.drawNavigationBar = !z10;
        f5VarArr[0].setFragmentStack(new ArrayList());
        ((ActionBarLayout) f5VarArr[0]).c(-1, p2Var);
        ((ActionBarLayout) f5VarArr[0]).c0();
        ViewGroup view = f5VarArr[0].getView();
        int i10 = this.backgroundPaddingLeft;
        view.setPadding(i10, 0, i10, 0);
        this.containerView = f5VarArr[0].getView();
        setApplyBottomPadding(false);
        setOnDismissListener(new di.h0(4, p2Var, n2Var));
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        f5[] f5VarArr;
        f5 f5Var;
        n2 n2Var = this.b;
        return n2Var != null && n2Var.a && (f5Var = (f5VarArr = this.c)[0]) != null && f5Var.getFragmentStack().size() <= 1 && (f5VarArr[0].getFragmentStack().size() != 1 || ((p2) f5VarArr[0].getFragmentStack().get(0)).isSwipeBackEnabled(motionEvent));
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        n2 n2Var;
        Runnable runnable;
        if (!isDismissed() && (n2Var = this.b) != null && (runnable = n2Var.d) != null) {
            runnable.run();
        }
        super.dismiss();
        ArrayList arrayList = LaunchActivity.G1.P;
        f5[] f5VarArr = this.c;
        arrayList.remove(f5VarArr[0]);
        f5VarArr[0] = null;
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void onBackPressed() {
        f5[] f5VarArr = this.c;
        f5 f5Var = f5VarArr[0];
        if (f5Var == null || f5Var.getFragmentStack().size() <= 1) {
            super.onBackPressed();
        } else {
            ((ActionBarLayout) f5VarArr[0]).G();
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f5 f5Var = this.c[0];
        h3[] h3VarArr = this.e;
        f5Var.setWindow(h3VarArr[0].getWindow());
        p2 p2Var = this.d;
        n2 n2Var = this.b;
        if (n2Var == null || !n2Var.e) {
            fixNavigationBar(j6.v0(j6.i5, p2Var.getResourceProvider()));
        } else {
            AndroidUtilities.setLightNavigationBar((Dialog) h3VarArr[0], true);
        }
        AndroidUtilities.setLightStatusBar(this, p2Var.isLightStatusBar());
        p2Var.onBottomSheetCreated();
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onInsetsChanged() {
        f5 f5Var = this.c[0];
        if (f5Var != null) {
            for (p2 p2Var : f5Var.getFragmentStack()) {
                if (p2Var.getFragmentView() != null) {
                    p2Var.getFragmentView().requestLayout();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onOpenAnimationEnd() {
        Runnable runnable;
        this.d.onTransitionAnimationEnd(true, false);
        n2 n2Var = this.b;
        if (n2Var == null || (runnable = n2Var.c) == null) {
            return;
        }
        runnable.run();
    }
}
