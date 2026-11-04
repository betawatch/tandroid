package ai;

import android.app.Activity;
import android.content.Context;
import android.text.InputFilter;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import b8.mf;
import ci.qc;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w extends qc {
    public final /* synthetic */ e0 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(e0 e0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.n0 = e0Var;
    }

    @Override // ci.qc
    public final boolean d(float f10) {
        int i3 = 0;
        if (getProgress() <= 0.99d && f10 <= getMeasuredWidth() * 0.9f) {
            return false;
        }
        e0 e0Var = this.n0;
        Context context = e0Var.getContext();
        Activity W = org.telegram.messenger.g0.W(context);
        org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
        if (W != null) {
            W.getCurrentFocus();
        }
        View[] viewArr = new View[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e0Var.J0);
        String M0 = bd.M0(2131750351, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = bd.a0(null, null, 2131750350, Integer.valueOf(e0Var.e2.d.gifts_per_round));
        z zVar = new z(context, e0Var.J0, k2.p1.g(context, R.drawable.star_small_inner));
        zVar.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.r6.V(zVar, org.telegram.ui.ActionBar.k6.j5, e0Var.J0);
        org.telegram.ui.ActionBar.r6.m(zVar, 34, org.telegram.ui.ActionBar.k6.Li, e0Var.J0);
        zVar.setHintText(bd.M0(2131750349, null));
        zVar.setFocusable(true);
        zVar.setInputType(2);
        zVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(9)});
        org.telegram.ui.ActionBar.r6.G(zVar, org.telegram.ui.ActionBar.k6.k6, org.telegram.ui.ActionBar.k6.l6, org.telegram.ui.ActionBar.k6.p7, e0Var.J0);
        zVar.setImeOptions(268435462);
        zVar.setBackgroundDrawable(null);
        zVar.l1 = org.telegram.messenger.g0.L(24.0f);
        zVar.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f));
        zVar.addTextChangedListener(new a0(i3, e0Var, viewArr));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(zVar, mf.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(linearLayout);
        s1Var.a = org.telegram.messenger.g0.L(300.0f);
        alertDialog$Builder.k(bd.M0(2131750353, null), new n(i3, e0Var, zVar));
        alertDialog$Builder.h(bd.M0(2131752589, null), new a3.j(1));
        org.telegram.ui.ActionBar.s1[] s1VarArr = {s1Var};
        if (Q != null) {
            org.telegram.messenger.g0.Z2(W, Q.getClassGuid());
        }
        s1VarArr[0].setOnDismissListener(new o(zVar, Q, W, 0));
        s1VarArr[0].setOnShowListener(new p(zVar, 0));
        s1VarArr[0].show();
        View d = s1VarArr[0].d(-1);
        viewArr[0] = d;
        d.setAlpha(0.6f);
        s1VarArr[0].k0 = false;
        zVar.setSelection(zVar.getText().length());
        return true;
    }

    @Override // ci.qc, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f)) {
            return false;
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override // ci.qc
    public final void e(int i3) {
        e0.d1(this.n0, i3);
    }

    @Override // ci.qc
    public final void setValue(int i3) {
        super.setValue(i3);
        e0.d1(this.n0, i3);
    }
}
