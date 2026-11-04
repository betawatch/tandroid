package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y1 extends t2 {
    public final /* synthetic */ b2 j1;
    public final /* synthetic */ q4[] k1;
    public final /* synthetic */ d2 l1;
    public final /* synthetic */ t2[] m1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(Activity activity, e6 e6Var, b2 b2Var, q4[] q4VarArr, d2 d2Var, t2[] t2VarArr) {
        super(1, (Context) activity, e6Var, true);
        this.j1 = b2Var;
        this.k1 = q4VarArr;
        this.l1 = d2Var;
        this.m1 = t2VarArr;
        boolean z10 = b2Var != null && b2Var.e;
        this.x = z10;
        this.n = !z10;
        q4VarArr[0].setFragmentStack(new ArrayList());
        ((ActionBarLayout) q4VarArr[0]).c(-1, d2Var);
        ((ActionBarLayout) q4VarArr[0]).f0();
        ViewGroup view = q4VarArr[0].getView();
        int i3 = this.u0;
        view.setPadding(i3, 0, i3, 0);
        this.b = q4VarArr[0].getView();
        this.w0 = false;
        setOnDismissListener(new ci.h3(6, d2Var, b2Var));
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean I(MotionEvent motionEvent) {
        q4[] q4VarArr;
        q4 q4Var;
        b2 b2Var = this.j1;
        return b2Var != null && b2Var.a && (q4Var = (q4VarArr = this.k1)[0]) != null && q4Var.getFragmentStack().size() <= 1 && (q4VarArr[0].getFragmentStack().size() != 1 || ((d2) q4VarArr[0].getFragmentStack().get(0)).isSwipeBackEnabled(motionEvent));
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public final void dismiss() {
        b2 b2Var;
        Runnable runnable;
        if (!this.J && (b2Var = this.j1) != null && (runnable = b2Var.d) != null) {
            runnable.run();
        }
        super.dismiss();
        ArrayList arrayList = LaunchActivity.K1.Q;
        q4[] q4VarArr = this.k1;
        arrayList.remove(q4VarArr[0]);
        q4VarArr[0] = null;
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void onBackPressed() {
        q4[] q4VarArr = this.k1;
        q4 q4Var = q4VarArr[0];
        if (q4Var == null || q4Var.getFragmentStack().size() <= 1) {
            super.onBackPressed();
        } else {
            ((ActionBarLayout) q4VarArr[0]).I();
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        q4 q4Var = this.k1[0];
        t2[] t2VarArr = this.m1;
        q4Var.setWindow(t2VarArr[0].getWindow());
        b2 b2Var = this.j1;
        if (b2Var == null || !b2Var.e) {
            P(k6.i5);
        } else {
            org.telegram.messenger.g0.n3(t2VarArr[0], true);
        }
        d2 d2Var = this.l1;
        org.telegram.messenger.g0.q3(this, d2Var.isLightStatusBar());
        d2Var.onBottomSheetCreated();
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void p0() {
        q4 q4Var = this.k1[0];
        if (q4Var != null) {
            for (d2 d2Var : q4Var.getFragmentStack()) {
                if (d2Var.getFragmentView() != null) {
                    d2Var.getFragmentView().requestLayout();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void v() {
        Runnable runnable;
        this.l1.onTransitionAnimationEnd(true, false);
        b2 b2Var = this.j1;
        if (b2Var == null || (runnable = b2Var.c) == null) {
            return;
        }
        runnable.run();
    }
}
