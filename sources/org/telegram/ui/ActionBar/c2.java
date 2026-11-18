package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class c2 extends x2 {
    public final /* synthetic */ f2 m1;
    public final /* synthetic */ s4[] n1;
    public final /* synthetic */ h2 o1;
    public final /* synthetic */ x2[] p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(Activity activity, i6 i6Var, f2 f2Var, s4[] s4VarArr, h2 h2Var, x2[] x2VarArr) {
        super(1, (Context) activity, i6Var, true);
        this.m1 = f2Var;
        this.n1 = s4VarArr;
        this.o1 = h2Var;
        this.p1 = x2VarArr;
        boolean z10 = f2Var != null && f2Var.e;
        this.x = z10;
        this.n = !z10;
        s4VarArr[0].setFragmentStack(new ArrayList());
        ((ActionBarLayout) s4VarArr[0]).c(-1, h2Var);
        ((ActionBarLayout) s4VarArr[0]).f0();
        ViewGroup view = s4VarArr[0].getView();
        int i7 = this.u0;
        view.setPadding(i7, 0, i7, 0);
        this.b = s4VarArr[0].getView();
        this.w0 = false;
        setOnDismissListener(new z1(1, h2Var, f2Var));
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final boolean J(MotionEvent motionEvent) {
        s4[] s4VarArr;
        s4 s4Var;
        f2 f2Var = this.m1;
        return f2Var != null && f2Var.a && (s4Var = (s4VarArr = this.n1)[0]) != null && s4Var.getFragmentStack().size() <= 1 && (s4VarArr[0].getFragmentStack().size() != 1 || ((h2) s4VarArr[0].getFragmentStack().get(0)).isSwipeBackEnabled(motionEvent));
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.d2
    public final void dismiss() {
        f2 f2Var;
        Runnable runnable;
        if (!this.J && (f2Var = this.m1) != null && (runnable = f2Var.d) != null) {
            runnable.run();
        }
        super.dismiss();
        ArrayList arrayList = LaunchActivity.H1.Q;
        s4[] s4VarArr = this.n1;
        arrayList.remove(s4VarArr[0]);
        s4VarArr[0] = null;
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog
    public final void onBackPressed() {
        s4[] s4VarArr = this.n1;
        s4 s4Var = s4VarArr[0];
        if (s4Var != null && s4Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) s4VarArr[0]).I();
            return;
        }
        s4 s4Var2 = s4VarArr[0];
        if (s4Var2 == null || s4Var2.getFragmentStack().isEmpty() || !((h2) s4VarArr[0].getFragmentStack().get(0)).closeOpenMenuOverlay(true)) {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        s4 s4Var = this.n1[0];
        x2[] x2VarArr = this.p1;
        s4Var.setWindow(x2VarArr[0].getWindow());
        f2 f2Var = this.m1;
        if (f2Var == null || !f2Var.e) {
            Q(n6.i5);
        } else {
            org.telegram.messenger.g0.m3(x2VarArr[0], true);
        }
        h2 h2Var = this.o1;
        org.telegram.messenger.g0.p3(this, h2Var.isLightStatusBar());
        h2Var.onBottomSheetCreated();
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void p0() {
        s4 s4Var = this.n1[0];
        if (s4Var != null) {
            for (h2 h2Var : s4Var.getFragmentStack()) {
                if (h2Var.getFragmentView() != null) {
                    h2Var.getFragmentView().requestLayout();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void v() {
        Runnable runnable;
        this.o1.onTransitionAnimationEnd(true, false);
        f2 f2Var = this.m1;
        if (f2Var == null || (runnable = f2Var.c) == null) {
            return;
        }
        runnable.run();
    }
}
