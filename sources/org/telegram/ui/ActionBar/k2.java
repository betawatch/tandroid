package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class k2 extends g3 {
    public final /* synthetic */ n2 b;
    public final /* synthetic */ e5[] c;
    public final /* synthetic */ p2 d;
    public final /* synthetic */ g3[] e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(Activity activity, f6 f6Var, n2 n2Var, e5[] e5VarArr, p2 p2Var, g3[] g3VarArr) {
        super(activity, f6Var, true, false);
        this.b = n2Var;
        this.c = e5VarArr;
        this.d = p2Var;
        this.e = g3VarArr;
        boolean z4 = n2Var != null && n2Var.e;
        this.occupyNavigationBar = z4;
        this.drawNavigationBar = !z4;
        e5VarArr[0].setFragmentStack(new ArrayList());
        ((ActionBarLayout) e5VarArr[0]).c(-1, p2Var);
        ((ActionBarLayout) e5VarArr[0]).c0();
        ViewGroup view = e5VarArr[0].getView();
        int i10 = this.backgroundPaddingLeft;
        view.setPadding(i10, 0, i10, 0);
        this.containerView = e5VarArr[0].getView();
        setApplyBottomPadding(false);
        setOnDismissListener(new gg.g(3, p2Var, n2Var));
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        e5[] e5VarArr;
        e5 e5Var;
        n2 n2Var = this.b;
        return n2Var != null && n2Var.a && (e5Var = (e5VarArr = this.c)[0]) != null && e5Var.getFragmentStack().size() <= 1 && (e5VarArr[0].getFragmentStack().size() != 1 || ((p2) e5VarArr[0].getFragmentStack().get(0)).isSwipeBackEnabled(motionEvent));
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        n2 n2Var;
        Runnable runnable;
        if (!isDismissed() && (n2Var = this.b) != null && (runnable = n2Var.d) != null) {
            runnable.run();
        }
        super.dismiss();
        ArrayList arrayList = LaunchActivity.D1.M;
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
        p2 p2Var = this.d;
        n2 n2Var = this.b;
        if (n2Var == null || !n2Var.e) {
            fixNavigationBar(j6.v0(j6.i5, p2Var.getResourceProvider()));
        } else {
            AndroidUtilities.setLightNavigationBar((Dialog) g3VarArr[0], true);
        }
        AndroidUtilities.setLightStatusBar(this, p2Var.isLightStatusBar());
        p2Var.onBottomSheetCreated();
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void onInsetsChanged() {
        e5 e5Var = this.c[0];
        if (e5Var != null) {
            for (p2 p2Var : e5Var.getFragmentStack()) {
                if (p2Var.getFragmentView() != null) {
                    p2Var.getFragmentView().requestLayout();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g3
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
