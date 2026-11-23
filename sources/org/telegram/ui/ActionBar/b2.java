package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class b2 extends w2 {
    public final /* synthetic */ e2 m1;
    public final /* synthetic */ r4[] n1;
    public final /* synthetic */ g2 o1;
    public final /* synthetic */ w2[] p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(Activity activity, i6 i6Var, e2 e2Var, r4[] r4VarArr, g2 g2Var, w2[] w2VarArr) {
        super(1, (Context) activity, i6Var, true);
        this.m1 = e2Var;
        this.n1 = r4VarArr;
        this.o1 = g2Var;
        this.p1 = w2VarArr;
        boolean z10 = e2Var != null && e2Var.e;
        this.x = z10;
        this.n = !z10;
        r4VarArr[0].setFragmentStack(new ArrayList());
        ((ActionBarLayout) r4VarArr[0]).c(-1, g2Var);
        ((ActionBarLayout) r4VarArr[0]).f0();
        ViewGroup view = r4VarArr[0].getView();
        int i7 = this.u0;
        view.setPadding(i7, 0, i7, 0);
        this.b = r4VarArr[0].getView();
        this.w0 = false;
        setOnDismissListener(new y1(1, g2Var, e2Var));
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean F() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean I(MotionEvent motionEvent) {
        r4[] r4VarArr;
        r4 r4Var;
        e2 e2Var = this.m1;
        return e2Var != null && e2Var.a && (r4Var = (r4VarArr = this.n1)[0]) != null && r4Var.getFragmentStack().size() <= 1 && (r4VarArr[0].getFragmentStack().size() != 1 || ((g2) r4VarArr[0].getFragmentStack().get(0)).isSwipeBackEnabled(motionEvent));
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        e2 e2Var;
        Runnable runnable;
        if (!this.J && (e2Var = this.m1) != null && (runnable = e2Var.d) != null) {
            runnable.run();
        }
        super.dismiss();
        ArrayList arrayList = LaunchActivity.H1.Q;
        r4[] r4VarArr = this.n1;
        arrayList.remove(r4VarArr[0]);
        r4VarArr[0] = null;
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void onBackPressed() {
        r4[] r4VarArr = this.n1;
        r4 r4Var = r4VarArr[0];
        if (r4Var != null && r4Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) r4VarArr[0]).I();
            return;
        }
        r4 r4Var2 = r4VarArr[0];
        if (r4Var2 == null || r4Var2.getFragmentStack().isEmpty() || !((g2) r4VarArr[0].getFragmentStack().get(0)).closeOpenMenuOverlay(true)) {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        r4 r4Var = this.n1[0];
        w2[] w2VarArr = this.p1;
        r4Var.setWindow(w2VarArr[0].getWindow());
        e2 e2Var = this.m1;
        if (e2Var == null || !e2Var.e) {
            Q(n6.i5);
        } else {
            org.telegram.messenger.g0.m3(w2VarArr[0], true);
        }
        g2 g2Var = this.o1;
        org.telegram.messenger.g0.p3(this, g2Var.isLightStatusBar());
        g2Var.onBottomSheetCreated();
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void p0() {
        r4 r4Var = this.n1[0];
        if (r4Var != null) {
            for (g2 g2Var : r4Var.getFragmentStack()) {
                if (g2Var.getFragmentView() != null) {
                    g2Var.getFragmentView().requestLayout();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void v() {
        Runnable runnable;
        this.o1.onTransitionAnimationEnd(true, false);
        e2 e2Var = this.m1;
        if (e2Var == null || (runnable = e2Var.c) == null) {
            return;
        }
        runnable.run();
    }
}
