package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class e61 extends org.telegram.ui.ActionBar.z2 {
    public int A1;
    public int B1;
    public int C1;
    public int D1;
    public int E1;
    public int F1;
    public int G1;
    public int H1;
    public final az I1;
    public final boolean J1;
    public TextView i1;
    public final FrameLayout j1;
    public final ag.b1 k1;
    public sk0 l1;
    public sk0 m1;
    public final Drawable n1;
    public final View o1;
    public AnimatorSet p1;
    public final dw0 q1;
    public final zz r1;
    public final d61 s1;
    public final RectF t1;
    public int u1;
    public float v1;
    public int w1;
    public boolean x1;
    public boolean y1;
    public int z1;

    static {
        new mh.g("colorProgress", 12);
    }

    public e61(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(1, context, p6Var, false);
        this.t1 = new RectF();
        this.x1 = true;
        this.y1 = true;
        this.z1 = org.telegram.ui.ActionBar.t6.wj;
        this.A1 = org.telegram.ui.ActionBar.t6.i6;
        int i11 = org.telegram.ui.ActionBar.t6.a;
        int i12 = org.telegram.ui.ActionBar.t6.d6;
        this.B1 = i12;
        this.C1 = i12;
        this.D1 = org.telegram.ui.ActionBar.t6.G6;
        int i13 = org.telegram.ui.ActionBar.t6.y6;
        this.E1 = i13;
        this.F1 = i13;
        int i14 = org.telegram.ui.ActionBar.t6.Q5;
        this.G1 = i14;
        this.H1 = i14;
        this.J1 = true;
        this.I0 = p6Var;
        P0();
        this.p0 = 75;
        this.a = i10;
        this.n1 = i0.a.f(context, R.drawable.sheet_shadow_round);
        c61 I0 = I0(context);
        this.b = I0;
        I0.setWillNotDraw(false);
        this.b.setClipChildren(false);
        ViewGroup viewGroup = this.b;
        int i15 = this.t0;
        viewGroup.setPadding(i15, 0, i15, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.j1 = frameLayout;
        d61 d61Var = new d61(this, context, p6Var);
        this.s1 = d61Var;
        d61Var.y = true;
        d61Var.updateColors();
        d61Var.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
        frameLayout.addView(d61Var, w7.b6.d(-1, 48.0f, 51, 7.0f, 7.0f, 7.0f, 7.0f));
        zz zzVar = new zz(context, null);
        this.r1 = zzVar;
        zzVar.setViewType(6);
        zzVar.x = false;
        zzVar.setUseHeaderOffset(true);
        dw0 dw0Var = new dw0(context, zzVar, 1, null);
        this.q1 = dw0Var;
        dw0Var.addView(zzVar, 0, w7.b6.d(-1, -1.0f, 0, 0.0f, 2.0f, 0.0f, 0.0f));
        String L0 = org.telegram.messenger.cd.L0(2131748183, null);
        nh.p pVar = dw0Var.d;
        pVar.setText(L0);
        String L02 = org.telegram.messenger.cd.L0(2131745824, null);
        p80 p80Var = dw0Var.e;
        p80Var.setText(L02);
        dw0Var.setVisibility(8);
        dw0Var.setAnimateLayoutChange(true);
        dw0Var.e(true, false);
        int i16 = this.D1;
        int i17 = this.E1;
        int i18 = this.B1;
        pVar.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.p6 p6Var2 = dw0Var.n;
        org.telegram.ui.ActionBar.a7.V(pVar, i16, p6Var2);
        p80Var.setTag(Integer.valueOf(i17));
        org.telegram.ui.ActionBar.a7.V(p80Var, i17, p6Var2);
        dw0Var.G = i18;
        this.b.addView(dw0Var, w7.b6.d(-1, -1.0f, 51, 0.0f, 62.0f, 0.0f, 0.0f));
        ag.b1 b1Var = new ag.b1(this, context, p6Var, 23);
        this.k1 = b1Var;
        b1Var.setOverScrollMode(2);
        b1Var.setTag(13);
        b1Var.setPadding(0, 0, 0, org.telegram.messenger.i0.L(48.0f));
        b1Var.setClipToPadding(false);
        b1Var.setHideIfEmpty(false);
        org.telegram.ui.ActionBar.a7.m(b1Var, 20, this.A1, p6Var);
        getContext();
        az azVar = new az(org.telegram.messenger.i0.L(8.0f), 0, b1Var);
        this.I1 = azVar;
        azVar.P = false;
        b1Var.setLayoutManager(azVar);
        b1Var.setHorizontalScrollBarEnabled(false);
        b1Var.setVerticalScrollBarEnabled(false);
        this.b.addView(b1Var, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        b1Var.setOnScrollListener(new bu0(this, 4));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.i0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.i0.L(58.0f);
        View view = new View(context);
        this.o1 = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.b.addView(view, layoutParams);
        this.b.addView(frameLayout, w7.b6.e(-1, 58, 51));
        M0(0.0f);
        b1Var.setEmptyView(dw0Var);
        b1Var.W1 = true;
        b1Var.X1 = 0;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean H() {
        return false;
    }

    public c61 I0(Context context) {
        return new c61(this, context);
    }

    public abstract void J0(MotionEvent motionEvent, org.telegram.ui.ActionBar.n0 n0Var);

    public final void K0(boolean z10) {
        View view = this.o1;
        if ((!z10 || view.getTag() == null) && (z10 || view.getTag() != null)) {
            return;
        }
        view.setTag(z10 ? null : 1);
        if (z10) {
            view.setVisibility(0);
        }
        AnimatorSet animatorSet = this.p1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.p1 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.p1.setDuration(150L);
        this.p1.addListener(new ha0(11, this, z10));
        this.p1.start();
    }

    public abstract void L0(String str);

    public final void M0(float f7) {
        this.v1 = f7;
        this.w1 = org.telegram.messenger.i0.S0(f7, 1.0f, org.telegram.ui.ActionBar.t6.w0(this.B1, this.I0), org.telegram.ui.ActionBar.t6.w0(this.C1, this.I0));
        this.n1.setColorFilter(new PorterDuffColorFilter(this.w1, PorterDuff.Mode.MULTIPLY));
        P(this.w1);
        int i10 = this.w1;
        this.G0 = i10;
        ag.b1 b1Var = this.k1;
        b1Var.setGlowColor(i10);
        int S0 = org.telegram.messenger.i0.S0(f7, 1.0f, org.telegram.ui.ActionBar.t6.x0(null, this.F1, false), org.telegram.ui.ActionBar.t6.x0(null, this.E1, false));
        int S02 = org.telegram.messenger.i0.S0(f7, 1.0f, org.telegram.ui.ActionBar.t6.x0(null, this.H1, false), org.telegram.ui.ActionBar.t6.x0(null, this.G1, false));
        int childCount = b1Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = b1Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.b4) {
                ((org.telegram.ui.Cells.b4) childAt).a(S0, S0);
            } else if (childAt instanceof org.telegram.ui.Cells.h4) {
                ((org.telegram.ui.Cells.h4) childAt).f(this.o1.getTag() != null ? this.G1 : this.H1, S02);
            }
        }
        this.b.invalidate();
        b1Var.invalidate();
        this.c.invalidate();
    }

    public void N0(int i10) {
        this.k1.setTopGlowOffset(i10);
        float f7 = i10;
        this.j1.setTranslationY(f7);
        this.q1.setTranslationY(f7);
        this.b.invalidate();
    }

    public final void O0(int i10) {
        if (isShowing()) {
            this.k1.getViewTreeObserver().addOnPreDrawListener(new as0(this, i10, 1));
        }
    }

    public void Q0() {
        ag.b1 b1Var = this.k1;
        if (b1Var.getChildCount() <= 0) {
            return;
        }
        s4.c1 K = b1Var.K(0);
        int top = K != null ? K.a.getTop() - org.telegram.messenger.i0.L(8.0f) : 0;
        int i10 = (top <= 0 || K == null || K.b() != 0) ? 0 : top;
        if (top < 0 || K == null || K.b() != 0) {
            K0(true);
            top = i10;
        } else {
            K0(false);
        }
        if (this.u1 != top) {
            this.u1 = top;
            N0(top);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public void dismiss() {
        org.telegram.messenger.i0.v1(this.s1.J);
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        if (this.i1 == null) {
            TextView textView = new TextView(getContext());
            this.i1 = textView;
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.j5, this.I0);
            this.i1.setTextSize(1, 20.0f);
            this.i1.setTypeface(org.telegram.messenger.i0.o());
            this.i1.setLines(1);
            this.i1.setMaxLines(1);
            this.i1.setSingleLine(true);
            this.i1.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 16);
            this.i1.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView2 = this.i1;
            FrameLayout.LayoutParams d = w7.b6.d(-1, 36.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f);
            FrameLayout frameLayout = this.j1;
            frameLayout.addView(textView2, d);
            ((FrameLayout.LayoutParams) this.s1.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(30.0f);
            frameLayout.getLayoutParams().height = org.telegram.messenger.i0.L(94.0f);
        }
        this.i1.setText(charSequence);
    }

    public void P0() {
    }
}
