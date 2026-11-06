package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class a2 extends v2 {
    public final /* synthetic */ d2 i1;
    public final /* synthetic */ q4[] j1;
    public final /* synthetic */ f2 k1;
    public final /* synthetic */ v2[] l1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(Activity activity, f6 f6Var, d2 d2Var, q4[] q4VarArr, f2 f2Var, v2[] v2VarArr) {
        super(1, (Context) activity, f6Var, true);
        this.i1 = d2Var;
        this.j1 = q4VarArr;
        this.k1 = f2Var;
        this.l1 = v2VarArr;
        boolean z9 = d2Var != null && d2Var.e;
        this.x = z9;
        this.n = !z9;
        q4VarArr[0].setFragmentStack(new ArrayList());
        ((ActionBarLayout) q4VarArr[0]).c(-1, f2Var);
        ((ActionBarLayout) q4VarArr[0]).f0();
        ViewGroup view = q4VarArr[0].getView();
        int i7 = this.t0;
        view.setPadding(i7, 0, i7, 0);
        this.b = q4VarArr[0].getView();
        this.v0 = false;
        setOnDismissListener(new bi.u3(6, f2Var, d2Var));
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean I(MotionEvent motionEvent) {
        q4[] q4VarArr;
        q4 q4Var;
        d2 d2Var = this.i1;
        return d2Var != null && d2Var.a && (q4Var = (q4VarArr = this.j1)[0]) != null && q4Var.getFragmentStack().size() <= 1 && (q4VarArr[0].getFragmentStack().size() != 1 || ((f2) q4VarArr[0].getFragmentStack().get(0)).isSwipeBackEnabled(motionEvent));
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        d2 d2Var;
        Runnable runnable;
        if (!this.I && (d2Var = this.i1) != null && (runnable = d2Var.d) != null) {
            runnable.run();
        }
        super.dismiss();
        ArrayList arrayList = LaunchActivity.G1.P;
        q4[] q4VarArr = this.j1;
        arrayList.remove(q4VarArr[0]);
        q4VarArr[0] = null;
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void onBackPressed() {
        q4[] q4VarArr = this.j1;
        q4 q4Var = q4VarArr[0];
        if (q4Var == null || q4Var.getFragmentStack().size() <= 1) {
            super.onBackPressed();
        } else {
            ((ActionBarLayout) q4VarArr[0]).I();
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        q4 q4Var = this.j1[0];
        v2[] v2VarArr = this.l1;
        q4Var.setWindow(v2VarArr[0].getWindow());
        d2 d2Var = this.i1;
        if (d2Var == null || !d2Var.e) {
            P(k6.i5);
        } else {
            org.telegram.messenger.g0.n3(v2VarArr[0], true);
        }
        f2 f2Var = this.k1;
        org.telegram.messenger.g0.q3(this, f2Var.isLightStatusBar());
        f2Var.onBottomSheetCreated();
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void p0() {
        q4 q4Var = this.j1[0];
        if (q4Var != null) {
            for (f2 f2Var : q4Var.getFragmentStack()) {
                if (f2Var.getFragmentView() != null) {
                    f2Var.getFragmentView().requestLayout();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void v() {
        Runnable runnable;
        this.k1.onTransitionAnimationEnd(true, false);
        d2 d2Var = this.i1;
        if (d2Var == null || (runnable = d2Var.c) == null) {
            return;
        }
        runnable.run();
    }
}
