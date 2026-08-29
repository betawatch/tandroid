package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class j2 extends f3 {
    public final /* synthetic */ m2 b;
    public final /* synthetic */ b5[] c;
    public final /* synthetic */ o2 d;
    public final /* synthetic */ f3[] e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(Activity activity, c6 c6Var, m2 m2Var, b5[] b5VarArr, o2 o2Var, f3[] f3VarArr) {
        super(activity, c6Var, true, false);
        this.b = m2Var;
        this.c = b5VarArr;
        this.d = o2Var;
        this.e = f3VarArr;
        boolean z10 = m2Var != null && m2Var.e;
        this.occupyNavigationBar = z10;
        this.drawNavigationBar = !z10;
        b5VarArr[0].setFragmentStack(new ArrayList());
        ((ActionBarLayout) b5VarArr[0]).c(-1, o2Var);
        ((ActionBarLayout) b5VarArr[0]).c0();
        ViewGroup view = b5VarArr[0].getView();
        int i10 = this.backgroundPaddingLeft;
        view.setPadding(i10, 0, i10, 0);
        this.containerView = b5VarArr[0].getView();
        setApplyBottomPadding(false);
        setOnDismissListener(new eg.g(3, o2Var, m2Var));
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        b5[] b5VarArr;
        b5 b5Var;
        m2 m2Var = this.b;
        return m2Var != null && m2Var.a && (b5Var = (b5VarArr = this.c)[0]) != null && b5Var.getFragmentStack().size() <= 1 && (b5VarArr[0].getFragmentStack().size() != 1 || ((o2) b5VarArr[0].getFragmentStack().get(0)).isSwipeBackEnabled(motionEvent));
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        m2 m2Var;
        Runnable runnable;
        if (!isDismissed() && (m2Var = this.b) != null && (runnable = m2Var.d) != null) {
            runnable.run();
        }
        super.dismiss();
        ArrayList arrayList = LaunchActivity.C1.L;
        b5[] b5VarArr = this.c;
        arrayList.remove(b5VarArr[0]);
        b5VarArr[0] = null;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        b5[] b5VarArr = this.c;
        b5 b5Var = b5VarArr[0];
        if (b5Var == null || b5Var.getFragmentStack().size() <= 1) {
            super.onBackPressed();
        } else {
            ((ActionBarLayout) b5VarArr[0]).G();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b5 b5Var = this.c[0];
        f3[] f3VarArr = this.e;
        b5Var.setWindow(f3VarArr[0].getWindow());
        o2 o2Var = this.d;
        m2 m2Var = this.b;
        if (m2Var == null || !m2Var.e) {
            fixNavigationBar(g6.v0(g6.i5, o2Var.getResourceProvider()));
        } else {
            AndroidUtilities.setLightNavigationBar((Dialog) f3VarArr[0], true);
        }
        AndroidUtilities.setLightStatusBar(this, o2Var.isLightStatusBar());
        o2Var.onBottomSheetCreated();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onInsetsChanged() {
        b5 b5Var = this.c[0];
        if (b5Var != null) {
            for (o2 o2Var : b5Var.getFragmentStack()) {
                if (o2Var.getFragmentView() != null) {
                    o2Var.getFragmentView().requestLayout();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onOpenAnimationEnd() {
        Runnable runnable;
        this.d.onTransitionAnimationEnd(true, false);
        m2 m2Var = this.b;
        if (m2Var == null || (runnable = m2Var.c) == null) {
            return;
        }
        runnable.run();
    }
}
