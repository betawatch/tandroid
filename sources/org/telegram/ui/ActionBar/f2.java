package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f2 extends z2 {
    public final /* synthetic */ i2 i1;
    public final /* synthetic */ z4[] j1;
    public final /* synthetic */ k2 k1;
    public final /* synthetic */ z2[] l1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(Activity activity, p6 p6Var, i2 i2Var, z4[] z4VarArr, k2 k2Var, z2[] z2VarArr) {
        super(1, (Context) activity, p6Var, true);
        this.i1 = i2Var;
        this.j1 = z4VarArr;
        this.k1 = k2Var;
        this.l1 = z2VarArr;
        boolean z10 = i2Var != null && i2Var.e;
        this.x = z10;
        this.n = !z10;
        z4VarArr[0].setFragmentStack(new ArrayList());
        ((ActionBarLayout) z4VarArr[0]).c(-1, k2Var);
        ((ActionBarLayout) z4VarArr[0]).e0();
        ViewGroup view = z4VarArr[0].getView();
        int i10 = this.t0;
        view.setPadding(i10, 0, i10, 0);
        this.b = z4VarArr[0].getView();
        this.v0 = false;
        setOnDismissListener(new mg.g(2, k2Var, i2Var));
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean H() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean J(MotionEvent motionEvent) {
        z4[] z4VarArr;
        z4 z4Var;
        i2 i2Var = this.i1;
        return i2Var != null && i2Var.a && (z4Var = (z4VarArr = this.j1)[0]) != null && z4Var.getFragmentStack().size() <= 1 && (z4VarArr[0].getFragmentStack().size() != 1 || ((k2) z4VarArr[0].getFragmentStack().get(0)).isSwipeBackEnabled(motionEvent));
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        i2 i2Var;
        Runnable runnable;
        if (!this.I && (i2Var = this.i1) != null && (runnable = i2Var.d) != null) {
            runnable.run();
        }
        super.dismiss();
        ArrayList arrayList = LaunchActivity.I1.P;
        z4[] z4VarArr = this.j1;
        arrayList.remove(z4VarArr[0]);
        z4VarArr[0] = null;
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void onBackPressed() {
        z4[] z4VarArr = this.j1;
        z4 z4Var = z4VarArr[0];
        if (z4Var == null || z4Var.getFragmentStack().size() <= 1) {
            super.onBackPressed();
        } else {
            ((ActionBarLayout) z4VarArr[0]).H();
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        z4 z4Var = this.j1[0];
        z2[] z2VarArr = this.l1;
        z4Var.setWindow(z2VarArr[0].getWindow());
        i2 i2Var = this.i1;
        if (i2Var == null || !i2Var.e) {
            Q(t6.i5);
        } else {
            org.telegram.messenger.i0.m3(z2VarArr[0], true);
        }
        k2 k2Var = this.k1;
        org.telegram.messenger.i0.p3(this, k2Var.isLightStatusBar());
        k2Var.onBottomSheetCreated();
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void p0() {
        z4 z4Var = this.j1[0];
        if (z4Var != null) {
            for (k2 k2Var : z4Var.getFragmentStack()) {
                if (k2Var.getFragmentView() != null) {
                    k2Var.getFragmentView().requestLayout();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void w() {
        Runnable runnable;
        this.k1.onTransitionAnimationEnd(true, false);
        i2 i2Var = this.i1;
        if (i2Var == null || (runnable = i2Var.c) == null) {
            return;
        }
        runnable.run();
    }
}
