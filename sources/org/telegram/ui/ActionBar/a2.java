package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class a2 extends w2 {
    public final /* synthetic */ d2 l1;
    public final /* synthetic */ r4[] m1;
    public final /* synthetic */ f2 n1;
    public final /* synthetic */ w2[] o1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(Activity activity, h6 h6Var, d2 d2Var, r4[] r4VarArr, f2 f2Var, w2[] w2VarArr) {
        super(1, (Context) activity, h6Var, true);
        this.l1 = d2Var;
        this.m1 = r4VarArr;
        this.n1 = f2Var;
        this.o1 = w2VarArr;
        boolean z9 = d2Var != null && d2Var.e;
        this.x = z9;
        this.n = !z9;
        r4VarArr[0].setFragmentStack(new ArrayList());
        ((ActionBarLayout) r4VarArr[0]).c(-1, f2Var);
        ((ActionBarLayout) r4VarArr[0]).f0();
        ViewGroup view = r4VarArr[0].getView();
        int i7 = this.t0;
        view.setPadding(i7, 0, i7, 0);
        this.b = r4VarArr[0].getView();
        this.v0 = false;
        setOnDismissListener(new bi.u3(6, f2Var, d2Var));
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean I(MotionEvent motionEvent) {
        r4[] r4VarArr;
        r4 r4Var;
        d2 d2Var = this.l1;
        return d2Var != null && d2Var.a && (r4Var = (r4VarArr = this.m1)[0]) != null && r4Var.getFragmentStack().size() <= 1 && (r4VarArr[0].getFragmentStack().size() != 1 || ((f2) r4VarArr[0].getFragmentStack().get(0)).isSwipeBackEnabled(motionEvent));
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        d2 d2Var;
        Runnable runnable;
        if (!this.I && (d2Var = this.l1) != null && (runnable = d2Var.d) != null) {
            runnable.run();
        }
        super.dismiss();
        ArrayList arrayList = LaunchActivity.G1.P;
        r4[] r4VarArr = this.m1;
        arrayList.remove(r4VarArr[0]);
        r4VarArr[0] = null;
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void onBackPressed() {
        r4[] r4VarArr = this.m1;
        r4 r4Var = r4VarArr[0];
        if (r4Var == null || r4Var.getFragmentStack().size() <= 1) {
            super.onBackPressed();
        } else {
            ((ActionBarLayout) r4VarArr[0]).I();
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        r4 r4Var = this.m1[0];
        w2[] w2VarArr = this.o1;
        r4Var.setWindow(w2VarArr[0].getWindow());
        d2 d2Var = this.l1;
        if (d2Var == null || !d2Var.e) {
            P(m6.i5);
        } else {
            org.telegram.messenger.g0.n3(w2VarArr[0], true);
        }
        f2 f2Var = this.n1;
        org.telegram.messenger.g0.q3(this, f2Var.isLightStatusBar());
        f2Var.onBottomSheetCreated();
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void p0() {
        r4 r4Var = this.m1[0];
        if (r4Var != null) {
            for (f2 f2Var : r4Var.getFragmentStack()) {
                if (f2Var.getFragmentView() != null) {
                    f2Var.getFragmentView().requestLayout();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void v() {
        Runnable runnable;
        this.n1.onTransitionAnimationEnd(true, false);
        d2 d2Var = this.l1;
        if (d2Var == null || (runnable = d2Var.c) == null) {
            return;
        }
        runnable.run();
    }
}
