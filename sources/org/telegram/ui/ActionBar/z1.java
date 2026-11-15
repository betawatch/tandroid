package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class z1 extends u2 {
    public final /* synthetic */ c2 m1;
    public final /* synthetic */ o4[] n1;
    public final /* synthetic */ e2 o1;
    public final /* synthetic */ u2[] p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(Activity activity, e6 e6Var, c2 c2Var, o4[] o4VarArr, e2 e2Var, u2[] u2VarArr) {
        super(1, (Context) activity, e6Var, true);
        this.m1 = c2Var;
        this.n1 = o4VarArr;
        this.o1 = e2Var;
        this.p1 = u2VarArr;
        boolean z10 = c2Var != null && c2Var.e;
        this.x = z10;
        this.n = !z10;
        o4VarArr[0].setFragmentStack(new ArrayList());
        ((ActionBarLayout) o4VarArr[0]).c(-1, e2Var);
        ((ActionBarLayout) o4VarArr[0]).f0();
        ViewGroup view = o4VarArr[0].getView();
        int i7 = this.u0;
        view.setPadding(i7, 0, i7, 0);
        this.b = o4VarArr[0].getView();
        this.w0 = false;
        setOnDismissListener(new di.a3(6, e2Var, c2Var));
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean H() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean J(MotionEvent motionEvent) {
        o4[] o4VarArr;
        o4 o4Var;
        c2 c2Var = this.m1;
        return c2Var != null && c2Var.a && (o4Var = (o4VarArr = this.n1)[0]) != null && o4Var.getFragmentStack().size() <= 1 && (o4VarArr[0].getFragmentStack().size() != 1 || ((e2) o4VarArr[0].getFragmentStack().get(0)).isSwipeBackEnabled(motionEvent));
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.a2
    public final void dismiss() {
        c2 c2Var;
        Runnable runnable;
        if (!this.J && (c2Var = this.m1) != null && (runnable = c2Var.d) != null) {
            runnable.run();
        }
        super.dismiss();
        ArrayList arrayList = LaunchActivity.H1.Q;
        o4[] o4VarArr = this.n1;
        arrayList.remove(o4VarArr[0]);
        o4VarArr[0] = null;
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void onBackPressed() {
        o4[] o4VarArr = this.n1;
        o4 o4Var = o4VarArr[0];
        if (o4Var == null || o4Var.getFragmentStack().size() <= 1) {
            super.onBackPressed();
        } else {
            ((ActionBarLayout) o4VarArr[0]).I();
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        o4 o4Var = this.n1[0];
        u2[] u2VarArr = this.p1;
        o4Var.setWindow(u2VarArr[0].getWindow());
        c2 c2Var = this.m1;
        if (c2Var == null || !c2Var.e) {
            Q(j6.i5);
        } else {
            org.telegram.messenger.g0.n3(u2VarArr[0], true);
        }
        e2 e2Var = this.o1;
        org.telegram.messenger.g0.q3(this, e2Var.isLightStatusBar());
        e2Var.onBottomSheetCreated();
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void p0() {
        o4 o4Var = this.n1[0];
        if (o4Var != null) {
            for (e2 e2Var : o4Var.getFragmentStack()) {
                if (e2Var.getFragmentView() != null) {
                    e2Var.getFragmentView().requestLayout();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void v() {
        Runnable runnable;
        this.o1.onTransitionAnimationEnd(true, false);
        c2 c2Var = this.m1;
        if (c2Var == null || (runnable = c2Var.c) == null) {
            return;
        }
        runnable.run();
    }
}
