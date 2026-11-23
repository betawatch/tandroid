package bi;

import android.app.Activity;
import android.content.Context;
import android.text.InputFilter;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import c8.na;
import di.jc;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class r extends jc {
    public final /* synthetic */ y n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(y yVar, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.n0 = yVar;
    }

    @Override // di.jc
    public final boolean d(float f10) {
        int i7 = 0;
        if (getProgress() <= 0.99d && f10 <= getMeasuredWidth() * 0.9f) {
            return false;
        }
        y yVar = this.n0;
        Context context = yVar.getContext();
        Activity W = org.telegram.messenger.g0.W(context);
        org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
        if (W != null) {
            W.getCurrentFocus();
        }
        View[] viewArr = new View[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, yVar.J0);
        String N0 = gd.N0(2131750326, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = gd.a0(null, null, 2131750325, Integer.valueOf(yVar.h2.d.gifts_per_round));
        u uVar = new u(context, yVar.J0, i5.c.g(context, R.drawable.star_small_inner));
        uVar.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.u6.U(uVar, org.telegram.ui.ActionBar.n6.j5, yVar.J0);
        org.telegram.ui.ActionBar.u6.l(uVar, 34, org.telegram.ui.ActionBar.n6.Oi, yVar.J0);
        uVar.setHintText(gd.N0(2131750324, null));
        uVar.setFocusable(true);
        uVar.setInputType(2);
        uVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(9)});
        org.telegram.ui.ActionBar.u6.F(uVar, org.telegram.ui.ActionBar.n6.k6, org.telegram.ui.ActionBar.n6.l6, org.telegram.ui.ActionBar.n6.p7, yVar.J0);
        uVar.setImeOptions(268435462);
        uVar.setBackgroundDrawable(null);
        uVar.l1 = org.telegram.messenger.g0.L(24.0f);
        uVar.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f));
        uVar.addTextChangedListener(new v(i7, yVar, viewArr));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(uVar, na.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(linearLayout);
        t1Var.a = org.telegram.messenger.g0.L(300.0f);
        alertDialog$Builder.k(gd.N0(2131750328, null), new ab.g(2, yVar, uVar));
        alertDialog$Builder.h(gd.N0(2131752577, null), new a3.l(19));
        org.telegram.ui.ActionBar.t1[] t1VarArr = {t1Var};
        if (Q != null) {
            org.telegram.messenger.g0.Y2(W, Q.getClassGuid());
        }
        t1VarArr[0].setOnDismissListener(new k(uVar, Q, W, 0));
        t1VarArr[0].setOnShowListener(new l(uVar, 0));
        t1VarArr[0].show();
        View d = t1VarArr[0].d(-1);
        viewArr[0] = d;
        d.setAlpha(0.6f);
        t1VarArr[0].k0 = false;
        uVar.setSelection(uVar.getText().length());
        return true;
    }

    @Override // di.jc, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f)) {
            return false;
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override // di.jc
    public final void e(int i7) {
        y.e1(this.n0, i7);
    }

    @Override // di.jc
    public final void setValue(int i7) {
        super.setValue(i7);
        y.e1(this.n0, i7);
    }
}
