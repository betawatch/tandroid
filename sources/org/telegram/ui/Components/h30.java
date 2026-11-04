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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h30 extends org.telegram.ui.ActionBar.t2 implements org.telegram.messenger.cs {
    public final TextView[] j1;
    public final TextView k1;
    public final d70 l1;
    public final org.telegram.ui.wm m1;
    public final fh0 n1;
    public final g30 o1;
    public boolean p1;
    public final ch0 q1;
    public final TextView[] r1;
    public final String s1;

    public h30(Context context, String str, org.telegram.ui.wm wmVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, false);
        this.j1 = new TextView[2];
        this.r1 = new TextView[2];
        gp gpVar = new gp(this, 21);
        this.w0 = false;
        this.v0 = false;
        this.m1 = wmVar;
        this.s1 = str;
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        TextView textView = new TextView(context);
        org.telegram.messenger.camera.q.m(textView, 1, 20.0f);
        int i3 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.V(textView, i3, e6Var);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        frameLayout.addView(textView, b8.mf.d(-2, -2.0f, 51, 17.0f, 20.0f, 17.0f, 0.0f));
        ch0 ch0Var = new ch0(R.raw.import_finish, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), false, null);
        this.q1 = ch0Var;
        ch0Var.J(true);
        fh0 fh0Var = new fh0(context);
        this.n1 = fh0Var;
        fh0Var.setAutoRepeat(true);
        fh0Var.f(R.raw.import_loop, 120, 120, null);
        fh0Var.d();
        frameLayout.addView(fh0Var, b8.mf.d(org.telegram.messenger.hs.q2, 160.0f, 49, 17.0f, 79.0f, 17.0f, 0.0f));
        fh0Var.getAnimatedDrawable().S(org.telegram.messenger.hs.I2, gpVar);
        TextView textView2 = new TextView(context);
        this.k1 = textView2;
        org.telegram.messenger.camera.q.m(textView2, 1, 24.0f);
        org.telegram.ui.ActionBar.r6.V(textView2, i3, e6Var);
        frameLayout.addView(textView2, b8.mf.d(-2, -2.0f, 49, 17.0f, 262.0f, 17.0f, 0.0f));
        d70 d70Var = new d70(getContext());
        this.l1 = d70Var;
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        d70Var.setProgressColor(org.telegram.ui.ActionBar.k6.w0(i10, this.J0));
        d70Var.setBackColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G5, this.J0));
        frameLayout.addView(d70Var, b8.mf.d(-1, 4.0f, 51, 50.0f, 307.0f, 50.0f, 0.0f));
        g30 g30Var = new g30(context);
        View view = new View(context);
        g30Var.a = view;
        int L = org.telegram.messenger.g0.L(4.0f);
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, e6Var);
        int i11 = org.telegram.ui.ActionBar.k6.Ei;
        int w03 = org.telegram.ui.ActionBar.k6.w0(i11, e6Var);
        Drawable k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, w02, w03, w03);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i11);
        view.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(view, k02, N, N2, e6Var);
        g30Var.addView(view, b8.mf.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        g30Var.d = linearLayout;
        linearLayout.setOrientation(0);
        g30Var.addView(linearLayout, b8.mf.e(-2, -2, 17));
        fh0 fh0Var2 = new fh0(context);
        g30Var.c = fh0Var2;
        int L2 = org.telegram.messenger.g0.L(20.0f);
        int i12 = org.telegram.ui.ActionBar.k6.Gi;
        ShapeDrawable L3 = org.telegram.ui.ActionBar.k6.L(L2, org.telegram.ui.ActionBar.k6.w0(i12, e6Var));
        org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i12);
        fh0Var2.setBackground(L3);
        org.telegram.ui.ActionBar.r6.k(fh0Var2, L3, N3, null, e6Var);
        fh0Var2.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.t(fh0Var2, i10, e6Var, PorterDuff.Mode.MULTIPLY);
        fh0Var2.f(R.raw.import_check, 26, 26, null);
        fh0Var2.setScaleX(0.8f);
        fh0Var2.setScaleY(0.8f);
        linearLayout.addView(fh0Var2, b8.mf.r(20, 20, 16));
        TextView textView3 = new TextView(context);
        g30Var.b = textView3;
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(17);
        org.telegram.messenger.k5.n(textView3, i12, e6Var, 1, 14.0f);
        linearLayout.addView(textView3, b8.mf.t(-2, -2, 16, 10, 0, 0, 0));
        this.o1 = g30Var;
        g30Var.setBackground(null);
        g30Var.setText(org.telegram.messenger.bd.M0(2131749270, null));
        g30Var.setVisibility(4);
        view.setOnClickListener(new f0(this, 25));
        view.setPivotY(org.telegram.messenger.g0.L(48.0f));
        view.setScaleY(0.04f);
        frameLayout.addView(g30Var, b8.mf.d(-1, 50.0f, 51, 34.0f, 247.0f, 34.0f, 0.0f));
        for (int i13 = 0; i13 < 2; i13++) {
            this.j1[i13] = new TextView(context);
            this.j1[i13].setTextSize(1, 16.0f);
            this.j1[i13].setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.r6.V(this.j1[i13], org.telegram.ui.ActionBar.k6.j5, e6Var);
            frameLayout.addView(this.j1[i13], b8.mf.d(-2, -2.0f, 49, 17.0f, 340.0f, 17.0f, 0.0f));
            this.r1[i13] = new TextView(context);
            this.r1[i13].setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.r6.V(this.r1[i13], org.telegram.ui.ActionBar.k6.r5, e6Var);
            this.r1[i13].setGravity(1);
            frameLayout.addView(this.r1[i13], b8.mf.d(-2, -2.0f, 49, 30.0f, 368.0f, 30.0f, 44.0f));
            if (i13 == 0) {
                this.r1[i13].setText(org.telegram.messenger.bd.M0(2131749255, null));
            } else {
                this.r1[i13].setAlpha(0.0f);
                this.r1[i13].setTranslationY(org.telegram.messenger.g0.L(10.0f));
                this.j1[i13].setAlpha(0.0f);
                this.j1[i13].setTranslationY(org.telegram.messenger.g0.L(10.0f));
            }
        }
        if (this.m1 != null) {
            textView.setText(org.telegram.messenger.bd.M0(2131749254, null));
            org.telegram.messenger.py B = this.m1.getSendMessagesHelper().B(this.m1.a());
            this.k1.setText(String.format("%d%%", Integer.valueOf(B.l)));
            this.l1.a(false, B.l / 100.0f);
            this.j1[0].setText(org.telegram.messenger.bd.a0("ImportCount", null, 2131749271, org.telegram.messenger.g0.i0(B.i, false, false), org.telegram.messenger.g0.i0(B.h, false, false)));
            this.r1[1].setText(org.telegram.messenger.bd.M0(2131749269, null));
            this.j1[1].setText(org.telegram.messenger.bd.M0(2131749268, null));
            this.m1.getNotificationCenter().c(this, org.telegram.messenger.hs.v1);
            return;
        }
        textView.setText(org.telegram.messenger.bd.M0(2131749244, null));
        org.telegram.messenger.ty tyVar = (org.telegram.messenger.ty) org.telegram.messenger.yy.C(this.a).G.get(str);
        this.k1.setText(String.format("%d%%", Integer.valueOf(tyVar.j)));
        this.l1.a(false, tyVar.j / 100.0f);
        this.j1[0].setText(org.telegram.messenger.bd.a0("ImportCount", null, 2131749271, org.telegram.messenger.g0.i0(tyVar.i, false, false), org.telegram.messenger.g0.i0(tyVar.h, false, false)));
        this.r1[1].setText(org.telegram.messenger.bd.M0(2131749249, null));
        this.j1[1].setText(org.telegram.messenger.bd.M0(2131749248, null));
        org.telegram.messenger.hs.f(this.a).c(this, org.telegram.messenger.hs.w1);
    }

    public final void I0() {
        this.p1 = true;
        this.n1.setAutoRepeat(false);
        g30 g30Var = this.o1;
        g30Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(xq.g);
        Property property = View.ALPHA;
        TextView textView = this.k1;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f);
        Property property2 = View.TRANSLATION_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, -org.telegram.messenger.g0.L(10.0f));
        TextView[] textViewArr = this.r1;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textViewArr[0], (Property<TextView, Float>) property, 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textViewArr[0], (Property<TextView, Float>) property2, -org.telegram.messenger.g0.L(10.0f));
        TextView[] textViewArr2 = this.j1;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textViewArr2[0], (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(textViewArr2[0], (Property<TextView, Float>) property2, -org.telegram.messenger.g0.L(10.0f)), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(textViewArr2[1], (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(textViewArr2[1], (Property<TextView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.l1, (Property<d70, Float>) property, 0.0f), ObjectAnimator.ofFloat(g30Var.d, (Property<LinearLayout, Float>) property2, org.telegram.messenger.g0.L(8.0f), 0.0f));
        g30Var.a.animate().scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        g30Var.c.animate().scaleY(1.0f).scaleX(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        g30Var.c.d();
        animatorSet.start();
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void K() {
        super.K();
        org.telegram.ui.wm wmVar = this.m1;
        if (wmVar != null) {
            wmVar.getNotificationCenter().n(this, org.telegram.messenger.hs.v1);
        } else {
            org.telegram.messenger.hs.f(this.a).n(this, org.telegram.messenger.hs.w1);
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.hs.v1;
        d70 d70Var = this.l1;
        TextView[] textViewArr = this.j1;
        TextView textView = this.k1;
        fh0 fh0Var = this.n1;
        if (i3 == i11) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            org.telegram.ui.wm wmVar = this.m1;
            org.telegram.messenger.py B = wmVar.getSendMessagesHelper().B(wmVar.a());
            if (B == null) {
                I0();
                return;
            }
            if (!this.p1 && ((180 - fh0Var.getAnimatedDrawable().b0) * 16.6d) + 3000.0d >= B.p) {
                fh0Var.setAutoRepeat(false);
                this.p1 = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(B.l)));
            textViewArr[0].setText(org.telegram.messenger.bd.a0("ImportCount", null, 2131749271, org.telegram.messenger.g0.i0(B.i, false, false), org.telegram.messenger.g0.i0(B.h, false, false)));
            d70Var.a(true, B.l / 100.0f);
            return;
        }
        if (i3 == org.telegram.messenger.hs.w1) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            org.telegram.messenger.ty tyVar = (org.telegram.messenger.ty) org.telegram.messenger.yy.C(this.a).G.get(this.s1);
            if (tyVar == null) {
                I0();
                return;
            }
            if (!this.p1 && ((180 - fh0Var.getAnimatedDrawable().b0) * 16.6d) + 3000.0d >= tyVar.n) {
                fh0Var.setAutoRepeat(false);
                this.p1 = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(tyVar.j)));
            textViewArr[0].setText(org.telegram.messenger.bd.a0("ImportCount", null, 2131749271, org.telegram.messenger.g0.i0(tyVar.i, false, false), org.telegram.messenger.g0.i0(tyVar.h, false, false)));
            d70Var.a(true, tyVar.j / 100.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        try {
            super.s0();
            d70 d70Var = this.l1;
            if (d70Var != null) {
                d70Var.setProgressColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.J0));
                d70Var.setBackColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G5, this.J0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
