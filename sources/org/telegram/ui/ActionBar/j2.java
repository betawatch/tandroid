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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class j2 extends h3 {
    public final /* synthetic */ m2 b;
    public final /* synthetic */ h5[] c;
    public final /* synthetic */ o2 d;
    public final /* synthetic */ h3[] e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(Activity activity, g6 g6Var, m2 m2Var, h5[] h5VarArr, o2 o2Var, h3[] h3VarArr) {
        super(1, (Context) activity, g6Var, true);
        this.b = m2Var;
        this.c = h5VarArr;
        this.d = o2Var;
        this.e = h3VarArr;
        boolean z10 = m2Var != null && m2Var.e;
        this.occupyNavigationBar = z10;
        this.drawNavigationBar = !z10;
        h5VarArr[0].setFragmentStack(new ArrayList());
        ((ActionBarLayout) h5VarArr[0]).c(-1, o2Var);
        ((ActionBarLayout) h5VarArr[0]).d0();
        ViewGroup view = h5VarArr[0].getView();
        int i10 = this.backgroundPaddingLeft;
        view.setPadding(i10, 0, i10, 0);
        this.containerView = h5VarArr[0].getView();
        setApplyBottomPadding(false);
        setOnDismissListener(new ai.z3(6, o2Var, m2Var));
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        h5[] h5VarArr;
        h5 h5Var;
        m2 m2Var = this.b;
        return m2Var != null && m2Var.a && (h5Var = (h5VarArr = this.c)[0]) != null && h5Var.getFragmentStack().size() <= 1 && (h5VarArr[0].getFragmentStack().size() != 1 || ((o2) h5VarArr[0].getFragmentStack().get(0)).isSwipeBackEnabled(motionEvent));
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        m2 m2Var;
        Runnable runnable;
        if (!isDismissed() && (m2Var = this.b) != null && (runnable = m2Var.d) != null) {
            runnable.run();
        }
        super.dismiss();
        ArrayList arrayList = LaunchActivity.J1.P;
        h5[] h5VarArr = this.c;
        arrayList.remove(h5VarArr[0]);
        h5VarArr[0] = null;
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void onBackPressed() {
        h5[] h5VarArr = this.c;
        h5 h5Var = h5VarArr[0];
        if (h5Var == null || h5Var.getFragmentStack().size() <= 1) {
            super.onBackPressed();
        } else {
            ((ActionBarLayout) h5VarArr[0]).H();
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        h5 h5Var = this.c[0];
        h3[] h3VarArr = this.e;
        h5Var.setWindow(h3VarArr[0].getWindow());
        m2 m2Var = this.b;
        if (m2Var == null || !m2Var.e) {
            fixNavigationBarKey(k6.i5);
        } else {
            AndroidUtilities.setLightNavigationBar((Dialog) h3VarArr[0], true);
        }
        o2 o2Var = this.d;
        AndroidUtilities.setLightStatusBar(this, o2Var.isLightStatusBar());
        o2Var.onBottomSheetCreated();
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onInsetsChanged() {
        h5 h5Var = this.c[0];
        if (h5Var != null) {
            for (o2 o2Var : h5Var.getFragmentStack()) {
                if (o2Var.getFragmentView() != null) {
                    o2Var.getFragmentView().requestLayout();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
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
