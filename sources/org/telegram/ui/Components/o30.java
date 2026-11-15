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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class o30 extends org.telegram.ui.ActionBar.u2 implements org.telegram.messenger.is {
    public final TextView[] m1;
    public final TextView n1;
    public final k70 o1;
    public final org.telegram.ui.an p1;
    public final fh0 q1;
    public final n30 r1;
    public boolean s1;
    public final ch0 t1;
    public final TextView[] u1;
    public final String v1;

    public o30(Context context, String str, org.telegram.ui.an anVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, false);
        this.m1 = new TextView[2];
        this.u1 = new TextView[2];
        fo foVar = new fo(this, 23);
        this.w0 = false;
        this.v0 = false;
        this.p1 = anVar;
        this.v1 = str;
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        TextView textView = new TextView(context);
        org.telegram.messenger.i20.o(textView, 1, 20.0f);
        int i7 = org.telegram.ui.ActionBar.j6.j5;
        org.telegram.ui.ActionBar.q6.U(textView, i7, e6Var);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        frameLayout.addView(textView, c8.ja.d(-2, -2.0f, 51, 17.0f, 20.0f, 17.0f, 0.0f));
        ch0 ch0Var = new ch0(R.raw.import_finish, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), false, null);
        this.t1 = ch0Var;
        ch0Var.J(true);
        fh0 fh0Var = new fh0(context);
        this.q1 = fh0Var;
        fh0Var.setAutoRepeat(true);
        fh0Var.f(R.raw.import_loop, 120, 120, null);
        fh0Var.d();
        frameLayout.addView(fh0Var, c8.ja.d(org.telegram.messenger.ns.q2, 160.0f, 49, 17.0f, 79.0f, 17.0f, 0.0f));
        fh0Var.getAnimatedDrawable().S(org.telegram.messenger.ns.I2, foVar);
        TextView textView2 = new TextView(context);
        this.n1 = textView2;
        org.telegram.messenger.i20.o(textView2, 1, 24.0f);
        org.telegram.ui.ActionBar.q6.U(textView2, i7, e6Var);
        frameLayout.addView(textView2, c8.ja.d(-2, -2.0f, 49, 17.0f, 262.0f, 17.0f, 0.0f));
        k70 k70Var = new k70(getContext());
        this.o1 = k70Var;
        int i10 = org.telegram.ui.ActionBar.j6.Fi;
        k70Var.setProgressColor(org.telegram.ui.ActionBar.j6.w0(i10, this.J0));
        k70Var.setBackColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G5, this.J0));
        frameLayout.addView(k70Var, c8.ja.d(-1, 4.0f, 51, 50.0f, 307.0f, 50.0f, 0.0f));
        n30 n30Var = new n30(context);
        View view = new View(context);
        n30Var.a = view;
        int L = org.telegram.messenger.g0.L(4.0f);
        int w02 = org.telegram.ui.ActionBar.j6.w0(i10, e6Var);
        int i11 = org.telegram.ui.ActionBar.j6.Hi;
        int w03 = org.telegram.ui.ActionBar.j6.w0(i11, e6Var);
        Drawable k02 = org.telegram.ui.ActionBar.j6.k0(L, L, L, L, w02, w03, w03);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i10);
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i11);
        view.setBackground(k02);
        org.telegram.ui.ActionBar.q6.j(view, k02, M, M2, e6Var);
        n30Var.addView(view, c8.ja.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        n30Var.d = linearLayout;
        linearLayout.setOrientation(0);
        n30Var.addView(linearLayout, c8.ja.e(-2, -2, 17));
        fh0 fh0Var2 = new fh0(context);
        n30Var.c = fh0Var2;
        int L2 = org.telegram.messenger.g0.L(20.0f);
        int i12 = org.telegram.ui.ActionBar.j6.Ji;
        ShapeDrawable L3 = org.telegram.ui.ActionBar.j6.L(L2, org.telegram.ui.ActionBar.j6.w0(i12, e6Var));
        org.telegram.ui.ActionBar.m6 M3 = org.telegram.ui.ActionBar.q6.M(i12);
        fh0Var2.setBackground(L3);
        org.telegram.ui.ActionBar.q6.j(fh0Var2, L3, M3, null, e6Var);
        fh0Var2.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.q6.s(fh0Var2, i10, e6Var, PorterDuff.Mode.MULTIPLY);
        fh0Var2.f(R.raw.import_check, 26, 26, null);
        fh0Var2.setScaleX(0.8f);
        fh0Var2.setScaleY(0.8f);
        linearLayout.addView(fh0Var2, c8.ja.r(20, 20, 16));
        TextView textView3 = new TextView(context);
        n30Var.b = textView3;
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(17);
        org.telegram.messenger.k5.m(textView3, i12, e6Var, 1, 14.0f);
        linearLayout.addView(textView3, c8.ja.t(-2, -2, 16, 10, 0, 0, 0));
        this.r1 = n30Var;
        n30Var.setBackground(null);
        n30Var.setText(org.telegram.messenger.hd.M0(2131749262, null));
        n30Var.setVisibility(4);
        view.setOnClickListener(new e0(this, 26));
        view.setPivotY(org.telegram.messenger.g0.L(48.0f));
        view.setScaleY(0.04f);
        frameLayout.addView(n30Var, c8.ja.d(-1, 50.0f, 51, 34.0f, 247.0f, 34.0f, 0.0f));
        for (int i13 = 0; i13 < 2; i13++) {
            this.m1[i13] = new TextView(context);
            this.m1[i13].setTextSize(1, 16.0f);
            this.m1[i13].setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.q6.U(this.m1[i13], org.telegram.ui.ActionBar.j6.j5, e6Var);
            frameLayout.addView(this.m1[i13], c8.ja.d(-2, -2.0f, 49, 17.0f, 340.0f, 17.0f, 0.0f));
            this.u1[i13] = new TextView(context);
            this.u1[i13].setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.q6.U(this.u1[i13], org.telegram.ui.ActionBar.j6.r5, e6Var);
            this.u1[i13].setGravity(1);
            frameLayout.addView(this.u1[i13], c8.ja.d(-2, -2.0f, 49, 30.0f, 368.0f, 30.0f, 44.0f));
            if (i13 == 0) {
                this.u1[i13].setText(org.telegram.messenger.hd.M0(2131749247, null));
            } else {
                this.u1[i13].setAlpha(0.0f);
                this.u1[i13].setTranslationY(org.telegram.messenger.g0.L(10.0f));
                this.m1[i13].setAlpha(0.0f);
                this.m1[i13].setTranslationY(org.telegram.messenger.g0.L(10.0f));
            }
        }
        if (this.p1 != null) {
            textView.setText(org.telegram.messenger.hd.M0(2131749246, null));
            org.telegram.messenger.vy B = this.p1.getSendMessagesHelper().B(this.p1.a());
            this.n1.setText(String.format("%d%%", Integer.valueOf(B.l)));
            this.o1.a(false, B.l / 100.0f);
            this.m1[0].setText(org.telegram.messenger.hd.a0("ImportCount", null, 2131749263, org.telegram.messenger.g0.i0(B.i, false, false), org.telegram.messenger.g0.i0(B.h, false, false)));
            this.u1[1].setText(org.telegram.messenger.hd.M0(2131749261, null));
            this.m1[1].setText(org.telegram.messenger.hd.M0(2131749260, null));
            this.p1.getNotificationCenter().c(this, org.telegram.messenger.ns.v1);
            return;
        }
        textView.setText(org.telegram.messenger.hd.M0(2131749236, null));
        org.telegram.messenger.zy zyVar = (org.telegram.messenger.zy) org.telegram.messenger.ez.C(this.a).G.get(str);
        this.n1.setText(String.format("%d%%", Integer.valueOf(zyVar.j)));
        this.o1.a(false, zyVar.j / 100.0f);
        this.m1[0].setText(org.telegram.messenger.hd.a0("ImportCount", null, 2131749263, org.telegram.messenger.g0.i0(zyVar.i, false, false), org.telegram.messenger.g0.i0(zyVar.h, false, false)));
        this.u1[1].setText(org.telegram.messenger.hd.M0(2131749241, null));
        this.m1[1].setText(org.telegram.messenger.hd.M0(2131749240, null));
        org.telegram.messenger.ns.f(this.a).c(this, org.telegram.messenger.ns.w1);
    }

    public final void I0() {
        this.s1 = true;
        this.q1.setAutoRepeat(false);
        n30 n30Var = this.r1;
        n30Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(er.g);
        Property property = View.ALPHA;
        TextView textView = this.n1;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f);
        Property property2 = View.TRANSLATION_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, -org.telegram.messenger.g0.L(10.0f));
        TextView[] textViewArr = this.u1;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textViewArr[0], (Property<TextView, Float>) property, 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textViewArr[0], (Property<TextView, Float>) property2, -org.telegram.messenger.g0.L(10.0f));
        TextView[] textViewArr2 = this.m1;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textViewArr2[0], (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(textViewArr2[0], (Property<TextView, Float>) property2, -org.telegram.messenger.g0.L(10.0f)), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(textViewArr2[1], (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(textViewArr2[1], (Property<TextView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.o1, (Property<k70, Float>) property, 0.0f), ObjectAnimator.ofFloat(n30Var.d, (Property<LinearLayout, Float>) property2, org.telegram.messenger.g0.L(8.0f), 0.0f));
        n30Var.a.animate().scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        n30Var.c.animate().scaleY(1.0f).scaleX(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        n30Var.c.d();
        animatorSet.start();
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void L() {
        super.L();
        org.telegram.ui.an anVar = this.p1;
        if (anVar != null) {
            anVar.getNotificationCenter().n(this, org.telegram.messenger.ns.v1);
        } else {
            org.telegram.messenger.ns.f(this.a).n(this, org.telegram.messenger.ns.w1);
        }
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ns.v1;
        k70 k70Var = this.o1;
        TextView[] textViewArr = this.m1;
        TextView textView = this.n1;
        fh0 fh0Var = this.q1;
        if (i7 == i11) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            org.telegram.ui.an anVar = this.p1;
            org.telegram.messenger.vy B = anVar.getSendMessagesHelper().B(anVar.a());
            if (B == null) {
                I0();
                return;
            }
            if (!this.s1 && ((180 - fh0Var.getAnimatedDrawable().b0) * 16.6d) + 3000.0d >= B.p) {
                fh0Var.setAutoRepeat(false);
                this.s1 = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(B.l)));
            textViewArr[0].setText(org.telegram.messenger.hd.a0("ImportCount", null, 2131749263, org.telegram.messenger.g0.i0(B.i, false, false), org.telegram.messenger.g0.i0(B.h, false, false)));
            k70Var.a(true, B.l / 100.0f);
            return;
        }
        if (i7 == org.telegram.messenger.ns.w1) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            org.telegram.messenger.zy zyVar = (org.telegram.messenger.zy) org.telegram.messenger.ez.C(this.a).G.get(this.v1);
            if (zyVar == null) {
                I0();
                return;
            }
            if (!this.s1 && ((180 - fh0Var.getAnimatedDrawable().b0) * 16.6d) + 3000.0d >= zyVar.n) {
                fh0Var.setAutoRepeat(false);
                this.s1 = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(zyVar.j)));
            textViewArr[0].setText(org.telegram.messenger.hd.a0("ImportCount", null, 2131749263, org.telegram.messenger.g0.i0(zyVar.i, false, false), org.telegram.messenger.g0.i0(zyVar.h, false, false)));
            k70Var.a(true, zyVar.j / 100.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void s0() {
        try {
            super.s0();
            k70 k70Var = this.o1;
            if (k70Var != null) {
                k70Var.setProgressColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, this.J0));
                k70Var.setBackColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G5, this.J0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
