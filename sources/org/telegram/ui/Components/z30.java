package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class z30 extends org.telegram.ui.ActionBar.w2 implements org.telegram.messenger.gs {
    public final TextView[] m1;
    public final TextView n1;
    public final x70 o1;
    public final org.telegram.ui.bn p1;
    public final rh0 q1;
    public final y30 r1;
    public boolean s1;
    public final oh0 t1;
    public final TextView[] u1;
    public final String v1;

    public z30(Context context, String str, org.telegram.ui.bn bnVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(1, context, h6Var, false);
        this.m1 = new TextView[2];
        this.u1 = new TextView[2];
        oo ooVar = new oo(this, 23);
        this.w0 = false;
        this.v0 = false;
        this.p1 = bnVar;
        this.v1 = str;
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        TextView textView = new TextView(context);
        org.telegram.messenger.o10.p(textView, 1, 20.0f);
        int i7 = org.telegram.ui.ActionBar.m6.j5;
        org.telegram.ui.ActionBar.t6.U(textView, i7, h6Var);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        frameLayout.addView(textView, c8.ma.d(-2, -2.0f, 51, 17.0f, 20.0f, 17.0f, 0.0f));
        oh0 oh0Var = new oh0(R.raw.import_finish, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), false, null);
        this.t1 = oh0Var;
        oh0Var.J(true);
        rh0 rh0Var = new rh0(context);
        this.q1 = rh0Var;
        rh0Var.setAutoRepeat(true);
        rh0Var.f(R.raw.import_loop, 120, 120, null);
        rh0Var.d();
        frameLayout.addView(rh0Var, c8.ma.d(org.telegram.messenger.ls.q2, 160.0f, 49, 17.0f, 79.0f, 17.0f, 0.0f));
        rh0Var.getAnimatedDrawable().S(org.telegram.messenger.ls.I2, ooVar);
        TextView textView2 = new TextView(context);
        this.n1 = textView2;
        org.telegram.messenger.o10.p(textView2, 1, 24.0f);
        org.telegram.ui.ActionBar.t6.U(textView2, i7, h6Var);
        frameLayout.addView(textView2, c8.ma.d(-2, -2.0f, 49, 17.0f, 262.0f, 17.0f, 0.0f));
        x70 x70Var = new x70(getContext());
        this.o1 = x70Var;
        int i10 = org.telegram.ui.ActionBar.m6.Fi;
        x70Var.setProgressColor(org.telegram.ui.ActionBar.m6.w0(i10, this.J0));
        x70Var.setBackColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G5, this.J0));
        frameLayout.addView(x70Var, c8.ma.d(-1, 4.0f, 51, 50.0f, 307.0f, 50.0f, 0.0f));
        y30 y30Var = new y30(context);
        View view = new View(context);
        y30Var.a = view;
        int L = org.telegram.messenger.g0.L(4.0f);
        int w02 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
        int i11 = org.telegram.ui.ActionBar.m6.Hi;
        int w03 = org.telegram.ui.ActionBar.m6.w0(i11, h6Var);
        Drawable k02 = org.telegram.ui.ActionBar.m6.k0(L, L, L, L, w02, w03, w03);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i11);
        view.setBackground(k02);
        org.telegram.ui.ActionBar.t6.j(view, k02, M, M2, h6Var);
        y30Var.addView(view, c8.ma.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        y30Var.d = linearLayout;
        linearLayout.setOrientation(0);
        y30Var.addView(linearLayout, c8.ma.e(-2, -2, 17));
        rh0 rh0Var2 = new rh0(context);
        y30Var.c = rh0Var2;
        int L2 = org.telegram.messenger.g0.L(20.0f);
        int i12 = org.telegram.ui.ActionBar.m6.Ji;
        ShapeDrawable L3 = org.telegram.ui.ActionBar.m6.L(L2, org.telegram.ui.ActionBar.m6.w0(i12, h6Var));
        org.telegram.ui.ActionBar.p6 M3 = org.telegram.ui.ActionBar.t6.M(i12);
        rh0Var2.setBackground(L3);
        org.telegram.ui.ActionBar.t6.j(rh0Var2, L3, M3, null, h6Var);
        rh0Var2.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.t6.s(rh0Var2, i10, h6Var, PorterDuff.Mode.MULTIPLY);
        rh0Var2.f(R.raw.import_check, 26, 26, null);
        rh0Var2.setScaleX(0.8f);
        rh0Var2.setScaleY(0.8f);
        linearLayout.addView(rh0Var2, c8.ma.r(20, 20, 16));
        TextView textView3 = new TextView(context);
        y30Var.b = textView3;
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(17);
        org.telegram.messenger.f3.l(textView3, i12, h6Var, 1, 14.0f);
        linearLayout.addView(textView3, c8.ma.t(-2, -2, 16, 10, 0, 0, 0));
        this.r1 = y30Var;
        y30Var.setBackground(null);
        y30Var.setText(org.telegram.messenger.hd.N0(2131749069, null));
        y30Var.setVisibility(4);
        view.setOnClickListener(new o0(this, 27));
        view.setPivotY(org.telegram.messenger.g0.L(48.0f));
        view.setScaleY(0.04f);
        frameLayout.addView(y30Var, c8.ma.d(-1, 50.0f, 51, 34.0f, 247.0f, 34.0f, 0.0f));
        for (int i13 = 0; i13 < 2; i13++) {
            this.m1[i13] = new TextView(context);
            this.m1[i13].setTextSize(1, 16.0f);
            this.m1[i13].setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.t6.U(this.m1[i13], org.telegram.ui.ActionBar.m6.j5, h6Var);
            frameLayout.addView(this.m1[i13], c8.ma.d(-2, -2.0f, 49, 17.0f, 340.0f, 17.0f, 0.0f));
            this.u1[i13] = new TextView(context);
            this.u1[i13].setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.t6.U(this.u1[i13], org.telegram.ui.ActionBar.m6.r5, h6Var);
            this.u1[i13].setGravity(1);
            frameLayout.addView(this.u1[i13], c8.ma.d(-2, -2.0f, 49, 30.0f, 368.0f, 30.0f, 44.0f));
            if (i13 == 0) {
                this.u1[i13].setText(org.telegram.messenger.hd.N0(2131749054, null));
            } else {
                this.u1[i13].setAlpha(0.0f);
                this.u1[i13].setTranslationY(org.telegram.messenger.g0.L(10.0f));
                this.m1[i13].setAlpha(0.0f);
                this.m1[i13].setTranslationY(org.telegram.messenger.g0.L(10.0f));
            }
        }
        if (this.p1 != null) {
            textView.setText(org.telegram.messenger.hd.N0(2131749053, null));
            org.telegram.messenger.ry B = this.p1.getSendMessagesHelper().B(this.p1.a());
            this.n1.setText(String.format("%d%%", Integer.valueOf(B.l)));
            this.o1.a(false, B.l / 100.0f);
            this.m1[0].setText(org.telegram.messenger.hd.a0("ImportCount", null, 2131749070, org.telegram.messenger.g0.i0(B.i, false, false), org.telegram.messenger.g0.i0(B.h, false, false)));
            this.u1[1].setText(org.telegram.messenger.hd.N0(2131749068, null));
            this.m1[1].setText(org.telegram.messenger.hd.N0(2131749067, null));
            this.p1.getNotificationCenter().c(this, org.telegram.messenger.ls.v1);
            return;
        }
        textView.setText(org.telegram.messenger.hd.N0(2131749043, null));
        org.telegram.messenger.vy vyVar = (org.telegram.messenger.vy) org.telegram.messenger.az.C(this.a).G.get(str);
        this.n1.setText(String.format("%d%%", Integer.valueOf(vyVar.j)));
        this.o1.a(false, vyVar.j / 100.0f);
        this.m1[0].setText(org.telegram.messenger.hd.a0("ImportCount", null, 2131749070, org.telegram.messenger.g0.i0(vyVar.i, false, false), org.telegram.messenger.g0.i0(vyVar.h, false, false)));
        this.u1[1].setText(org.telegram.messenger.hd.N0(2131749048, null));
        this.m1[1].setText(org.telegram.messenger.hd.N0(2131749047, null));
        org.telegram.messenger.ls.f(this.a).c(this, org.telegram.messenger.ls.w1);
    }

    public final void J0() {
        this.s1 = true;
        this.q1.setAutoRepeat(false);
        y30 y30Var = this.r1;
        y30Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(nr.g);
        Property property = View.ALPHA;
        TextView textView = this.n1;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f);
        Property property2 = View.TRANSLATION_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, -org.telegram.messenger.g0.L(10.0f));
        TextView[] textViewArr = this.u1;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textViewArr[0], (Property<TextView, Float>) property, 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textViewArr[0], (Property<TextView, Float>) property2, -org.telegram.messenger.g0.L(10.0f));
        TextView[] textViewArr2 = this.m1;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textViewArr2[0], (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(textViewArr2[0], (Property<TextView, Float>) property2, -org.telegram.messenger.g0.L(10.0f)), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(textViewArr2[1], (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(textViewArr2[1], (Property<TextView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.o1, (Property<x70, Float>) property, 0.0f), ObjectAnimator.ofFloat(y30Var.d, (Property<LinearLayout, Float>) property2, org.telegram.messenger.g0.L(8.0f), 0.0f));
        y30Var.a.animate().scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        y30Var.c.animate().scaleY(1.0f).scaleX(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        y30Var.c.d();
        animatorSet.start();
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void L() {
        super.L();
        org.telegram.ui.bn bnVar = this.p1;
        if (bnVar != null) {
            bnVar.getNotificationCenter().n(this, org.telegram.messenger.ls.v1);
        } else {
            org.telegram.messenger.ls.f(this.a).n(this, org.telegram.messenger.ls.w1);
        }
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ls.v1;
        x70 x70Var = this.o1;
        TextView[] textViewArr = this.m1;
        TextView textView = this.n1;
        rh0 rh0Var = this.q1;
        if (i7 == i11) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            org.telegram.ui.bn bnVar = this.p1;
            org.telegram.messenger.ry B = bnVar.getSendMessagesHelper().B(bnVar.a());
            if (B == null) {
                J0();
                return;
            }
            if (!this.s1 && ((180 - rh0Var.getAnimatedDrawable().b0) * 16.6d) + 3000.0d >= B.p) {
                rh0Var.setAutoRepeat(false);
                this.s1 = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(B.l)));
            textViewArr[0].setText(org.telegram.messenger.hd.a0("ImportCount", null, 2131749070, org.telegram.messenger.g0.i0(B.i, false, false), org.telegram.messenger.g0.i0(B.h, false, false)));
            x70Var.a(true, B.l / 100.0f);
            return;
        }
        if (i7 == org.telegram.messenger.ls.w1) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            org.telegram.messenger.vy vyVar = (org.telegram.messenger.vy) org.telegram.messenger.az.C(this.a).G.get(this.v1);
            if (vyVar == null) {
                J0();
                return;
            }
            if (!this.s1 && ((180 - rh0Var.getAnimatedDrawable().b0) * 16.6d) + 3000.0d >= vyVar.n) {
                rh0Var.setAutoRepeat(false);
                this.s1 = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(vyVar.j)));
            textViewArr[0].setText(org.telegram.messenger.hd.a0("ImportCount", null, 2131749070, org.telegram.messenger.g0.i0(vyVar.i, false, false), org.telegram.messenger.g0.i0(vyVar.h, false, false)));
            x70Var.a(true, vyVar.j / 100.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        try {
            super.s0();
            x70 x70Var = this.o1;
            if (x70Var != null) {
                x70Var.setProgressColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, this.J0));
                x70Var.setBackColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G5, this.J0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
