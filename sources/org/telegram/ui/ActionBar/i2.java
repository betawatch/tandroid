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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class i2 extends f3 {
    public final /* synthetic */ l2 b;
    public final /* synthetic */ c5[] c;
    public final /* synthetic */ n2 d;
    public final /* synthetic */ f3[] e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(Activity activity, d6 d6Var, l2 l2Var, c5[] c5VarArr, n2 n2Var, f3[] f3VarArr) {
        super(1, (Context) activity, d6Var, true);
        this.b = l2Var;
        this.c = c5VarArr;
        this.d = n2Var;
        this.e = f3VarArr;
        boolean z10 = l2Var != null && l2Var.e;
        this.occupyNavigationBar = z10;
        this.drawNavigationBar = !z10;
        c5VarArr[0].setFragmentStack(new ArrayList());
        ((ActionBarLayout) c5VarArr[0]).c(-1, n2Var);
        ((ActionBarLayout) c5VarArr[0]).c0();
        ViewGroup view = c5VarArr[0].getView();
        int i10 = this.backgroundPaddingLeft;
        view.setPadding(i10, 0, i10, 0);
        this.containerView = c5VarArr[0].getView();
        setApplyBottomPadding(false);
        setOnDismissListener(new ei.e0(4, n2Var, l2Var));
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        c5[] c5VarArr;
        c5 c5Var;
        l2 l2Var = this.b;
        return l2Var != null && l2Var.a && (c5Var = (c5VarArr = this.c)[0]) != null && c5Var.getFragmentStack().size() <= 1 && (c5VarArr[0].getFragmentStack().size() != 1 || ((n2) c5VarArr[0].getFragmentStack().get(0)).isSwipeBackEnabled(motionEvent));
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
        c5[] c5VarArr = this.c;
        arrayList.remove(c5VarArr[0]);
        c5VarArr[0] = null;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        c5[] c5VarArr = this.c;
        c5 c5Var = c5VarArr[0];
        if (c5Var == null || c5Var.getFragmentStack().size() <= 1) {
            super.onBackPressed();
        } else {
            ((ActionBarLayout) c5VarArr[0]).G();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c5 c5Var = this.c[0];
        f3[] f3VarArr = this.e;
        c5Var.setWindow(f3VarArr[0].getWindow());
        n2 n2Var = this.d;
        l2 l2Var = this.b;
        if (l2Var == null || !l2Var.e) {
            fixNavigationBar(h6.v0(h6.i5, n2Var.getResourceProvider()));
        } else {
            AndroidUtilities.setLightNavigationBar((Dialog) f3VarArr[0], true);
        }
        AndroidUtilities.setLightStatusBar(this, n2Var.isLightStatusBar());
        n2Var.onBottomSheetCreated();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onInsetsChanged() {
        c5 c5Var = this.c[0];
        if (c5Var != null) {
            for (n2 n2Var : c5Var.getFragmentStack()) {
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
