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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class j2 extends g3 {
    public final /* synthetic */ m2 b;
    public final /* synthetic */ e5[] c;
    public final /* synthetic */ o2 d;
    public final /* synthetic */ g3[] e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(Activity activity, f6 f6Var, m2 m2Var, e5[] e5VarArr, o2 o2Var, g3[] g3VarArr) {
        super(1, (Context) activity, f6Var, true);
        this.b = m2Var;
        this.c = e5VarArr;
        this.d = o2Var;
        this.e = g3VarArr;
        boolean z10 = m2Var != null && m2Var.e;
        this.occupyNavigationBar = z10;
        this.drawNavigationBar = !z10;
        e5VarArr[0].setFragmentStack(new ArrayList());
        ((ActionBarLayout) e5VarArr[0]).c(-1, o2Var);
        ((ActionBarLayout) e5VarArr[0]).c0();
        ViewGroup view = e5VarArr[0].getView();
        int i10 = this.backgroundPaddingLeft;
        view.setPadding(i10, 0, i10, 0);
        this.containerView = e5VarArr[0].getView();
        setApplyBottomPadding(false);
        setOnDismissListener(new ei.e0(4, o2Var, m2Var));
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        e5[] e5VarArr;
        e5 e5Var;
        m2 m2Var = this.b;
        return m2Var != null && m2Var.a && (e5Var = (e5VarArr = this.c)[0]) != null && e5Var.getFragmentStack().size() <= 1 && (e5VarArr[0].getFragmentStack().size() != 1 || ((o2) e5VarArr[0].getFragmentStack().get(0)).isSwipeBackEnabled(motionEvent));
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        m2 m2Var;
        Runnable runnable;
        if (!isDismissed() && (m2Var = this.b) != null && (runnable = m2Var.d) != null) {
            runnable.run();
        }
        super.dismiss();
        ArrayList arrayList = LaunchActivity.G1.P;
        e5[] e5VarArr = this.c;
        arrayList.remove(e5VarArr[0]);
        e5VarArr[0] = null;
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void onBackPressed() {
        e5[] e5VarArr = this.c;
        e5 e5Var = e5VarArr[0];
        if (e5Var == null || e5Var.getFragmentStack().size() <= 1) {
            super.onBackPressed();
        } else {
            ((ActionBarLayout) e5VarArr[0]).G();
        }
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e5 e5Var = this.c[0];
        g3[] g3VarArr = this.e;
        e5Var.setWindow(g3VarArr[0].getWindow());
        o2 o2Var = this.d;
        m2 m2Var = this.b;
        if (m2Var == null || !m2Var.e) {
            fixNavigationBar(j6.v0(j6.i5, o2Var.getResourceProvider()));
        } else {
            AndroidUtilities.setLightNavigationBar((Dialog) g3VarArr[0], true);
        }
        AndroidUtilities.setLightStatusBar(this, o2Var.isLightStatusBar());
        o2Var.onBottomSheetCreated();
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void onInsetsChanged() {
        e5 e5Var = this.c[0];
        if (e5Var != null) {
            for (o2 o2Var : e5Var.getFragmentStack()) {
                if (o2Var.getFragmentView() != null) {
                    o2Var.getFragmentView().requestLayout();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g3
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
