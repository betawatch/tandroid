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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class m2 extends k3 {
    public final /* synthetic */ p2 b;
    public final /* synthetic */ j5[] c;
    public final /* synthetic */ r2 d;
    public final /* synthetic */ k3[] e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(Activity activity, u6 u6Var, p2 p2Var, j5[] j5VarArr, r2 r2Var, k3[] k3VarArr) {
        super(1, (Context) activity, u6Var, true);
        this.b = p2Var;
        this.c = j5VarArr;
        this.d = r2Var;
        this.e = k3VarArr;
        boolean z10 = p2Var != null && p2Var.e;
        this.occupyNavigationBar = z10;
        this.drawNavigationBar = !z10;
        j5VarArr[0].setFragmentStack(new ArrayList());
        ((ActionBarLayout) j5VarArr[0]).c(-1, r2Var);
        ((ActionBarLayout) j5VarArr[0]).e0();
        ViewGroup view = j5VarArr[0].getView();
        int i10 = this.backgroundPaddingLeft;
        view.setPadding(i10, 0, i10, 0);
        this.containerView = j5VarArr[0].getView();
        setApplyBottomPadding(false);
        setOnDismissListener(new bi.u3(6, r2Var, p2Var));
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        j5[] j5VarArr;
        j5 j5Var;
        p2 p2Var = this.b;
        return p2Var != null && p2Var.a && (j5Var = (j5VarArr = this.c)[0]) != null && j5Var.getFragmentStack().size() <= 1 && (j5VarArr[0].getFragmentStack().size() != 1 || ((r2) j5VarArr[0].getFragmentStack().get(0)).isSwipeBackEnabled(motionEvent));
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        p2 p2Var;
        Runnable runnable;
        if (!isDismissed() && (p2Var = this.b) != null && (runnable = p2Var.d) != null) {
            runnable.run();
        }
        super.dismiss();
        ArrayList arrayList = LaunchActivity.I1.P;
        j5[] j5VarArr = this.c;
        arrayList.remove(j5VarArr[0]);
        j5VarArr[0] = null;
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void onBackPressed() {
        j5[] j5VarArr = this.c;
        j5 j5Var = j5VarArr[0];
        if (j5Var == null || j5Var.getFragmentStack().size() <= 1) {
            super.onBackPressed();
        } else {
            ((ActionBarLayout) j5VarArr[0]).H();
        }
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j5 j5Var = this.c[0];
        k3[] k3VarArr = this.e;
        j5Var.setWindow(k3VarArr[0].getWindow());
        p2 p2Var = this.b;
        if (p2Var == null || !p2Var.e) {
            fixNavigationBarKey(y6.i5);
        } else {
            AndroidUtilities.setLightNavigationBar((Dialog) k3VarArr[0], true);
        }
        r2 r2Var = this.d;
        AndroidUtilities.setLightStatusBar(this, r2Var.isLightStatusBar());
        r2Var.onBottomSheetCreated();
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onInsetsChanged() {
        j5 j5Var = this.c[0];
        if (j5Var != null) {
            for (r2 r2Var : j5Var.getFragmentStack()) {
                if (r2Var.getFragmentView() != null) {
                    r2Var.getFragmentView().requestLayout();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onOpenAnimationEnd() {
        Runnable runnable;
        this.d.onTransitionAnimationEnd(true, false);
        p2 p2Var = this.b;
        if (p2Var == null || (runnable = p2Var.c) == null) {
            return;
        }
        runnable.run();
    }
}
