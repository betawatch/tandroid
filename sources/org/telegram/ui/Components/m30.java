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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class m30 extends org.telegram.ui.ActionBar.v2 implements org.telegram.messenger.ls {
    public final TextView[] i1;
    public final TextView j1;
    public final i70 k1;
    public final org.telegram.ui.cn l1;
    public final dh0 m1;
    public final l30 n1;
    public boolean o1;
    public final ah0 p1;
    public final TextView[] q1;
    public final String r1;

    public m30(Context context, String str, org.telegram.ui.cn cnVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(1, context, g6Var, false);
        this.i1 = new TextView[2];
        this.q1 = new TextView[2];
        gp gpVar = new gp(this, 21);
        this.v0 = false;
        this.u0 = false;
        this.l1 = cnVar;
        this.r1 = str;
        FrameLayout frameLayout = new FrameLayout(context);
        this.N = frameLayout;
        TextView textView = new TextView(context);
        org.telegram.messenger.camera.q.m(textView, 1, 20.0f);
        int i7 = org.telegram.ui.ActionBar.l6.j5;
        org.telegram.ui.ActionBar.s6.U(textView, i7, g6Var);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        frameLayout.addView(textView, c8.ha.d(-2, -2.0f, 51, 17.0f, 20.0f, 17.0f, 0.0f));
        ah0 ah0Var = new ah0(R.raw.import_finish, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), false, null);
        this.p1 = ah0Var;
        ah0Var.J(true);
        dh0 dh0Var = new dh0(context);
        this.m1 = dh0Var;
        dh0Var.setAutoRepeat(true);
        dh0Var.f(R.raw.import_loop, 120, 120, null);
        dh0Var.d();
        frameLayout.addView(dh0Var, c8.ha.d(org.telegram.messenger.qs.q2, 160.0f, 49, 17.0f, 79.0f, 17.0f, 0.0f));
        dh0Var.getAnimatedDrawable().S(org.telegram.messenger.qs.I2, gpVar);
        TextView textView2 = new TextView(context);
        this.j1 = textView2;
        org.telegram.messenger.camera.q.m(textView2, 1, 24.0f);
        org.telegram.ui.ActionBar.s6.U(textView2, i7, g6Var);
        frameLayout.addView(textView2, c8.ha.d(-2, -2.0f, 49, 17.0f, 262.0f, 17.0f, 0.0f));
        i70 i70Var = new i70(getContext());
        this.k1 = i70Var;
        int i10 = org.telegram.ui.ActionBar.l6.Ci;
        i70Var.setProgressColor(org.telegram.ui.ActionBar.l6.w0(i10, this.I0));
        i70Var.setBackColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.G5, this.I0));
        frameLayout.addView(i70Var, c8.ha.d(-1, 4.0f, 51, 50.0f, 307.0f, 50.0f, 0.0f));
        l30 l30Var = new l30(context);
        View view = new View(context);
        l30Var.a = view;
        int L = org.telegram.messenger.g0.L(4.0f);
        int w02 = org.telegram.ui.ActionBar.l6.w0(i10, g6Var);
        int i11 = org.telegram.ui.ActionBar.l6.Ei;
        int w03 = org.telegram.ui.ActionBar.l6.w0(i11, g6Var);
        Drawable k02 = org.telegram.ui.ActionBar.l6.k0(L, L, L, L, w02, w03, w03);
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i10);
        org.telegram.ui.ActionBar.o6 M2 = org.telegram.ui.ActionBar.s6.M(i11);
        view.setBackground(k02);
        org.telegram.ui.ActionBar.s6.j(view, k02, M, M2, g6Var);
        l30Var.addView(view, c8.ha.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        l30Var.d = linearLayout;
        linearLayout.setOrientation(0);
        l30Var.addView(linearLayout, c8.ha.e(-2, -2, 17));
        dh0 dh0Var2 = new dh0(context);
        l30Var.c = dh0Var2;
        int L2 = org.telegram.messenger.g0.L(20.0f);
        int i12 = org.telegram.ui.ActionBar.l6.Gi;
        ShapeDrawable L3 = org.telegram.ui.ActionBar.l6.L(L2, org.telegram.ui.ActionBar.l6.w0(i12, g6Var));
        org.telegram.ui.ActionBar.o6 M3 = org.telegram.ui.ActionBar.s6.M(i12);
        dh0Var2.setBackground(L3);
        org.telegram.ui.ActionBar.s6.j(dh0Var2, L3, M3, null, g6Var);
        dh0Var2.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.s6.s(dh0Var2, i10, g6Var, PorterDuff.Mode.MULTIPLY);
        dh0Var2.f(R.raw.import_check, 26, 26, null);
        dh0Var2.setScaleX(0.8f);
        dh0Var2.setScaleY(0.8f);
        linearLayout.addView(dh0Var2, c8.ha.r(20, 20, 16));
        TextView textView3 = new TextView(context);
        l30Var.b = textView3;
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(17);
        org.telegram.messenger.k5.n(textView3, i12, g6Var, 1, 14.0f);
        linearLayout.addView(textView3, c8.ha.t(-2, -2, 16, 10, 0, 0, 0));
        this.n1 = l30Var;
        l30Var.setBackground(null);
        l30Var.setText(org.telegram.messenger.id.M0(2131749262, null));
        l30Var.setVisibility(4);
        view.setOnClickListener(new h0(this, 25));
        view.setPivotY(org.telegram.messenger.g0.L(48.0f));
        view.setScaleY(0.04f);
        frameLayout.addView(l30Var, c8.ha.d(-1, 50.0f, 51, 34.0f, 247.0f, 34.0f, 0.0f));
        for (int i13 = 0; i13 < 2; i13++) {
            this.i1[i13] = new TextView(context);
            this.i1[i13].setTextSize(1, 16.0f);
            this.i1[i13].setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.s6.U(this.i1[i13], org.telegram.ui.ActionBar.l6.j5, g6Var);
            frameLayout.addView(this.i1[i13], c8.ha.d(-2, -2.0f, 49, 17.0f, 340.0f, 17.0f, 0.0f));
            this.q1[i13] = new TextView(context);
            this.q1[i13].setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.s6.U(this.q1[i13], org.telegram.ui.ActionBar.l6.r5, g6Var);
            this.q1[i13].setGravity(1);
            frameLayout.addView(this.q1[i13], c8.ha.d(-2, -2.0f, 49, 30.0f, 368.0f, 30.0f, 44.0f));
            if (i13 == 0) {
                this.q1[i13].setText(org.telegram.messenger.id.M0(2131749247, null));
            } else {
                this.q1[i13].setAlpha(0.0f);
                this.q1[i13].setTranslationY(org.telegram.messenger.g0.L(10.0f));
                this.i1[i13].setAlpha(0.0f);
                this.i1[i13].setTranslationY(org.telegram.messenger.g0.L(10.0f));
            }
        }
        if (this.l1 != null) {
            textView.setText(org.telegram.messenger.id.M0(2131749246, null));
            org.telegram.messenger.xy B = this.l1.getSendMessagesHelper().B(this.l1.a());
            this.j1.setText(String.format("%d%%", Integer.valueOf(B.l)));
            this.k1.a(false, B.l / 100.0f);
            this.i1[0].setText(org.telegram.messenger.id.a0("ImportCount", null, 2131749263, org.telegram.messenger.g0.i0(B.i, false, false), org.telegram.messenger.g0.i0(B.h, false, false)));
            this.q1[1].setText(org.telegram.messenger.id.M0(2131749261, null));
            this.i1[1].setText(org.telegram.messenger.id.M0(2131749260, null));
            this.l1.getNotificationCenter().c(this, org.telegram.messenger.qs.v1);
            return;
        }
        textView.setText(org.telegram.messenger.id.M0(2131749236, null));
        org.telegram.messenger.bz bzVar = (org.telegram.messenger.bz) org.telegram.messenger.gz.C(this.a).F.get(str);
        this.j1.setText(String.format("%d%%", Integer.valueOf(bzVar.j)));
        this.k1.a(false, bzVar.j / 100.0f);
        this.i1[0].setText(org.telegram.messenger.id.a0("ImportCount", null, 2131749263, org.telegram.messenger.g0.i0(bzVar.i, false, false), org.telegram.messenger.g0.i0(bzVar.h, false, false)));
        this.q1[1].setText(org.telegram.messenger.id.M0(2131749241, null));
        this.i1[1].setText(org.telegram.messenger.id.M0(2131749240, null));
        org.telegram.messenger.qs.f(this.a).c(this, org.telegram.messenger.qs.w1);
    }

    public final void I0() {
        this.o1 = true;
        this.m1.setAutoRepeat(false);
        l30 l30Var = this.n1;
        l30Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(xq.g);
        Property property = View.ALPHA;
        TextView textView = this.j1;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f);
        Property property2 = View.TRANSLATION_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, -org.telegram.messenger.g0.L(10.0f));
        TextView[] textViewArr = this.q1;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textViewArr[0], (Property<TextView, Float>) property, 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textViewArr[0], (Property<TextView, Float>) property2, -org.telegram.messenger.g0.L(10.0f));
        TextView[] textViewArr2 = this.i1;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textViewArr2[0], (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(textViewArr2[0], (Property<TextView, Float>) property2, -org.telegram.messenger.g0.L(10.0f)), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(textViewArr2[1], (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(textViewArr2[1], (Property<TextView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.k1, (Property<i70, Float>) property, 0.0f), ObjectAnimator.ofFloat(l30Var.d, (Property<LinearLayout, Float>) property2, org.telegram.messenger.g0.L(8.0f), 0.0f));
        l30Var.a.animate().scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        l30Var.c.animate().scaleY(1.0f).scaleX(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        l30Var.c.d();
        animatorSet.start();
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void K() {
        super.K();
        org.telegram.ui.cn cnVar = this.l1;
        if (cnVar != null) {
            cnVar.getNotificationCenter().n(this, org.telegram.messenger.qs.v1);
        } else {
            org.telegram.messenger.qs.f(this.a).n(this, org.telegram.messenger.qs.w1);
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.qs.v1;
        i70 i70Var = this.k1;
        TextView[] textViewArr = this.i1;
        TextView textView = this.j1;
        dh0 dh0Var = this.m1;
        if (i7 == i11) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            org.telegram.ui.cn cnVar = this.l1;
            org.telegram.messenger.xy B = cnVar.getSendMessagesHelper().B(cnVar.a());
            if (B == null) {
                I0();
                return;
            }
            if (!this.o1 && ((180 - dh0Var.getAnimatedDrawable().a0) * 16.6d) + 3000.0d >= B.p) {
                dh0Var.setAutoRepeat(false);
                this.o1 = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(B.l)));
            textViewArr[0].setText(org.telegram.messenger.id.a0("ImportCount", null, 2131749263, org.telegram.messenger.g0.i0(B.i, false, false), org.telegram.messenger.g0.i0(B.h, false, false)));
            i70Var.a(true, B.l / 100.0f);
            return;
        }
        if (i7 == org.telegram.messenger.qs.w1) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            org.telegram.messenger.bz bzVar = (org.telegram.messenger.bz) org.telegram.messenger.gz.C(this.a).F.get(this.r1);
            if (bzVar == null) {
                I0();
                return;
            }
            if (!this.o1 && ((180 - dh0Var.getAnimatedDrawable().a0) * 16.6d) + 3000.0d >= bzVar.n) {
                dh0Var.setAutoRepeat(false);
                this.o1 = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(bzVar.j)));
            textViewArr[0].setText(org.telegram.messenger.id.a0("ImportCount", null, 2131749263, org.telegram.messenger.g0.i0(bzVar.i, false, false), org.telegram.messenger.g0.i0(bzVar.h, false, false)));
            i70Var.a(true, bzVar.j / 100.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void s0() {
        try {
            super.s0();
            i70 i70Var = this.k1;
            if (i70Var != null) {
                i70Var.setProgressColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Ci, this.I0));
                i70Var.setBackColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.G5, this.I0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
