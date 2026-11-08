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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class l30 extends org.telegram.ui.ActionBar.v2 implements org.telegram.messenger.ls {
    public final TextView[] i1;
    public final TextView j1;
    public final h70 k1;
    public final org.telegram.ui.an l1;
    public final ch0 m1;
    public final k30 n1;
    public boolean o1;
    public final zg0 p1;
    public final TextView[] q1;
    public final String r1;

    public l30(Context context, String str, org.telegram.ui.an anVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, false);
        this.i1 = new TextView[2];
        this.q1 = new TextView[2];
        gp gpVar = new gp(this, 21);
        this.v0 = false;
        this.u0 = false;
        this.l1 = anVar;
        this.r1 = str;
        FrameLayout frameLayout = new FrameLayout(context);
        this.N = frameLayout;
        TextView textView = new TextView(context);
        org.telegram.messenger.camera.q.m(textView, 1, 20.0f);
        int i7 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.V(textView, i7, f6Var);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        frameLayout.addView(textView, c8.ha.d(-2, -2.0f, 51, 17.0f, 20.0f, 17.0f, 0.0f));
        zg0 zg0Var = new zg0(R.raw.import_finish, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), false, null);
        this.p1 = zg0Var;
        zg0Var.J(true);
        ch0 ch0Var = new ch0(context);
        this.m1 = ch0Var;
        ch0Var.setAutoRepeat(true);
        ch0Var.f(R.raw.import_loop, 120, 120, null);
        ch0Var.d();
        frameLayout.addView(ch0Var, c8.ha.d(org.telegram.messenger.qs.q2, 160.0f, 49, 17.0f, 79.0f, 17.0f, 0.0f));
        ch0Var.getAnimatedDrawable().S(org.telegram.messenger.qs.I2, gpVar);
        TextView textView2 = new TextView(context);
        this.j1 = textView2;
        org.telegram.messenger.camera.q.m(textView2, 1, 24.0f);
        org.telegram.ui.ActionBar.r6.V(textView2, i7, f6Var);
        frameLayout.addView(textView2, c8.ha.d(-2, -2.0f, 49, 17.0f, 262.0f, 17.0f, 0.0f));
        h70 h70Var = new h70(getContext());
        this.k1 = h70Var;
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        h70Var.setProgressColor(org.telegram.ui.ActionBar.k6.w0(i10, this.I0));
        h70Var.setBackColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G5, this.I0));
        frameLayout.addView(h70Var, c8.ha.d(-1, 4.0f, 51, 50.0f, 307.0f, 50.0f, 0.0f));
        k30 k30Var = new k30(context);
        View view = new View(context);
        k30Var.a = view;
        int L = org.telegram.messenger.g0.L(4.0f);
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, f6Var);
        int i11 = org.telegram.ui.ActionBar.k6.Ei;
        int w03 = org.telegram.ui.ActionBar.k6.w0(i11, f6Var);
        Drawable k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, w02, w03, w03);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i11);
        view.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(view, k02, N, N2, f6Var);
        k30Var.addView(view, c8.ha.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        k30Var.d = linearLayout;
        linearLayout.setOrientation(0);
        k30Var.addView(linearLayout, c8.ha.e(-2, -2, 17));
        ch0 ch0Var2 = new ch0(context);
        k30Var.c = ch0Var2;
        int L2 = org.telegram.messenger.g0.L(20.0f);
        int i12 = org.telegram.ui.ActionBar.k6.Gi;
        ShapeDrawable L3 = org.telegram.ui.ActionBar.k6.L(L2, org.telegram.ui.ActionBar.k6.w0(i12, f6Var));
        org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i12);
        ch0Var2.setBackground(L3);
        org.telegram.ui.ActionBar.r6.k(ch0Var2, L3, N3, null, f6Var);
        ch0Var2.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.t(ch0Var2, i10, f6Var, PorterDuff.Mode.MULTIPLY);
        ch0Var2.f(R.raw.import_check, 26, 26, null);
        ch0Var2.setScaleX(0.8f);
        ch0Var2.setScaleY(0.8f);
        linearLayout.addView(ch0Var2, c8.ha.r(20, 20, 16));
        TextView textView3 = new TextView(context);
        k30Var.b = textView3;
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(17);
        org.telegram.messenger.k5.n(textView3, i12, f6Var, 1, 14.0f);
        linearLayout.addView(textView3, c8.ha.t(-2, -2, 16, 10, 0, 0, 0));
        this.n1 = k30Var;
        k30Var.setBackground(null);
        k30Var.setText(org.telegram.messenger.id.M0(2131749263, null));
        k30Var.setVisibility(4);
        view.setOnClickListener(new h0(this, 25));
        view.setPivotY(org.telegram.messenger.g0.L(48.0f));
        view.setScaleY(0.04f);
        frameLayout.addView(k30Var, c8.ha.d(-1, 50.0f, 51, 34.0f, 247.0f, 34.0f, 0.0f));
        for (int i13 = 0; i13 < 2; i13++) {
            this.i1[i13] = new TextView(context);
            this.i1[i13].setTextSize(1, 16.0f);
            this.i1[i13].setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.r6.V(this.i1[i13], org.telegram.ui.ActionBar.k6.j5, f6Var);
            frameLayout.addView(this.i1[i13], c8.ha.d(-2, -2.0f, 49, 17.0f, 340.0f, 17.0f, 0.0f));
            this.q1[i13] = new TextView(context);
            this.q1[i13].setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.r6.V(this.q1[i13], org.telegram.ui.ActionBar.k6.r5, f6Var);
            this.q1[i13].setGravity(1);
            frameLayout.addView(this.q1[i13], c8.ha.d(-2, -2.0f, 49, 30.0f, 368.0f, 30.0f, 44.0f));
            if (i13 == 0) {
                this.q1[i13].setText(org.telegram.messenger.id.M0(2131749248, null));
            } else {
                this.q1[i13].setAlpha(0.0f);
                this.q1[i13].setTranslationY(org.telegram.messenger.g0.L(10.0f));
                this.i1[i13].setAlpha(0.0f);
                this.i1[i13].setTranslationY(org.telegram.messenger.g0.L(10.0f));
            }
        }
        if (this.l1 != null) {
            textView.setText(org.telegram.messenger.id.M0(2131749247, null));
            org.telegram.messenger.xy B = this.l1.getSendMessagesHelper().B(this.l1.a());
            this.j1.setText(String.format("%d%%", Integer.valueOf(B.l)));
            this.k1.a(false, B.l / 100.0f);
            this.i1[0].setText(org.telegram.messenger.id.a0("ImportCount", null, 2131749264, org.telegram.messenger.g0.i0(B.i, false, false), org.telegram.messenger.g0.i0(B.h, false, false)));
            this.q1[1].setText(org.telegram.messenger.id.M0(2131749262, null));
            this.i1[1].setText(org.telegram.messenger.id.M0(2131749261, null));
            this.l1.getNotificationCenter().c(this, org.telegram.messenger.qs.v1);
            return;
        }
        textView.setText(org.telegram.messenger.id.M0(2131749237, null));
        org.telegram.messenger.bz bzVar = (org.telegram.messenger.bz) org.telegram.messenger.gz.C(this.a).F.get(str);
        this.j1.setText(String.format("%d%%", Integer.valueOf(bzVar.j)));
        this.k1.a(false, bzVar.j / 100.0f);
        this.i1[0].setText(org.telegram.messenger.id.a0("ImportCount", null, 2131749264, org.telegram.messenger.g0.i0(bzVar.i, false, false), org.telegram.messenger.g0.i0(bzVar.h, false, false)));
        this.q1[1].setText(org.telegram.messenger.id.M0(2131749242, null));
        this.i1[1].setText(org.telegram.messenger.id.M0(2131749241, null));
        org.telegram.messenger.qs.f(this.a).c(this, org.telegram.messenger.qs.w1);
    }

    public final void I0() {
        this.o1 = true;
        this.m1.setAutoRepeat(false);
        k30 k30Var = this.n1;
        k30Var.setVisibility(0);
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
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textViewArr2[0], (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(textViewArr2[0], (Property<TextView, Float>) property2, -org.telegram.messenger.g0.L(10.0f)), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(textViewArr2[1], (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(textViewArr2[1], (Property<TextView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.k1, (Property<h70, Float>) property, 0.0f), ObjectAnimator.ofFloat(k30Var.d, (Property<LinearLayout, Float>) property2, org.telegram.messenger.g0.L(8.0f), 0.0f));
        k30Var.a.animate().scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        k30Var.c.animate().scaleY(1.0f).scaleX(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        k30Var.c.d();
        animatorSet.start();
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void K() {
        super.K();
        org.telegram.ui.an anVar = this.l1;
        if (anVar != null) {
            anVar.getNotificationCenter().n(this, org.telegram.messenger.qs.v1);
        } else {
            org.telegram.messenger.qs.f(this.a).n(this, org.telegram.messenger.qs.w1);
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.qs.v1;
        h70 h70Var = this.k1;
        TextView[] textViewArr = this.i1;
        TextView textView = this.j1;
        ch0 ch0Var = this.m1;
        if (i7 == i11) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            org.telegram.ui.an anVar = this.l1;
            org.telegram.messenger.xy B = anVar.getSendMessagesHelper().B(anVar.a());
            if (B == null) {
                I0();
                return;
            }
            if (!this.o1 && ((180 - ch0Var.getAnimatedDrawable().a0) * 16.6d) + 3000.0d >= B.p) {
                ch0Var.setAutoRepeat(false);
                this.o1 = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(B.l)));
            textViewArr[0].setText(org.telegram.messenger.id.a0("ImportCount", null, 2131749264, org.telegram.messenger.g0.i0(B.i, false, false), org.telegram.messenger.g0.i0(B.h, false, false)));
            h70Var.a(true, B.l / 100.0f);
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
            if (!this.o1 && ((180 - ch0Var.getAnimatedDrawable().a0) * 16.6d) + 3000.0d >= bzVar.n) {
                ch0Var.setAutoRepeat(false);
                this.o1 = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(bzVar.j)));
            textViewArr[0].setText(org.telegram.messenger.id.a0("ImportCount", null, 2131749264, org.telegram.messenger.g0.i0(bzVar.i, false, false), org.telegram.messenger.g0.i0(bzVar.h, false, false)));
            h70Var.a(true, bzVar.j / 100.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void s0() {
        try {
            super.s0();
            h70 h70Var = this.k1;
            if (h70Var != null) {
                h70Var.setProgressColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.I0));
                h70Var.setBackColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G5, this.I0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
