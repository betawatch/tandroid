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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class i2 extends f3 {
    public final /* synthetic */ l2 b;
    public final /* synthetic */ d5[] c;
    public final /* synthetic */ n2 d;
    public final /* synthetic */ f3[] e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(Activity activity, f6 f6Var, l2 l2Var, d5[] d5VarArr, n2 n2Var, f3[] f3VarArr) {
        super(1, (Context) activity, f6Var, true);
        this.b = l2Var;
        this.c = d5VarArr;
        this.d = n2Var;
        this.e = f3VarArr;
        boolean z10 = l2Var != null && l2Var.e;
        this.occupyNavigationBar = z10;
        this.drawNavigationBar = !z10;
        d5VarArr[0].setFragmentStack(new ArrayList());
        ((ActionBarLayout) d5VarArr[0]).c(-1, n2Var);
        ((ActionBarLayout) d5VarArr[0]).c0();
        ViewGroup view = d5VarArr[0].getView();
        int i10 = this.backgroundPaddingLeft;
        view.setPadding(i10, 0, i10, 0);
        this.containerView = d5VarArr[0].getView();
        setApplyBottomPadding(false);
        setOnDismissListener(new fi.e0(4, n2Var, l2Var));
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        d5[] d5VarArr;
        d5 d5Var;
        l2 l2Var = this.b;
        return l2Var != null && l2Var.a && (d5Var = (d5VarArr = this.c)[0]) != null && d5Var.getFragmentStack().size() <= 1 && (d5VarArr[0].getFragmentStack().size() != 1 || ((n2) d5VarArr[0].getFragmentStack().get(0)).isSwipeBackEnabled(motionEvent));
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        l2 l2Var;
        Runnable runnable;
        if (!isDismissed() && (l2Var = this.b) != null && (runnable = l2Var.d) != null) {
            runnable.run();
        }
        super.dismiss();
        ArrayList arrayList = LaunchActivity.G1.P;
        d5[] d5VarArr = this.c;
        arrayList.remove(d5VarArr[0]);
        d5VarArr[0] = null;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        d5[] d5VarArr = this.c;
        d5 d5Var = d5VarArr[0];
        if (d5Var == null || d5Var.getFragmentStack().size() <= 1) {
            super.onBackPressed();
        } else {
            ((ActionBarLayout) d5VarArr[0]).G();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d5 d5Var = this.c[0];
        f3[] f3VarArr = this.e;
        d5Var.setWindow(f3VarArr[0].getWindow());
        n2 n2Var = this.d;
        l2 l2Var = this.b;
        if (l2Var == null || !l2Var.e) {
            fixNavigationBar(j6.v0(j6.i5, n2Var.getResourceProvider()));
        } else {
            AndroidUtilities.setLightNavigationBar((Dialog) f3VarArr[0], true);
        }
        AndroidUtilities.setLightStatusBar(this, n2Var.isLightStatusBar());
        n2Var.onBottomSheetCreated();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onInsetsChanged() {
        d5 d5Var = this.c[0];
        if (d5Var != null) {
            for (n2 n2Var : d5Var.getFragmentStack()) {
                if (n2Var.getFragmentView() != null) {
                    n2Var.getFragmentView().requestLayout();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
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
