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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public abstract class c51 extends org.telegram.ui.ActionBar.v2 {
    public int A1;
    public int B1;
    public int C1;
    public int D1;
    public int E1;
    public int F1;
    public int G1;
    public int H1;
    public final my I1;
    public final boolean J1;
    public TextView i1;
    public final FrameLayout j1;
    public final bi.q1 k1;
    public pj0 l1;
    public pj0 m1;
    public final Drawable n1;
    public final View o1;
    public AnimatorSet p1;
    public final cv0 q1;
    public final mz r1;
    public final b51 s1;
    public final RectF t1;
    public int u1;
    public float v1;
    public int w1;
    public boolean x1;
    public boolean y1;
    public int z1;

    static {
        new org.telegram.ui.Cells.o8("colorProgress", 10);
    }

    public c51(int i7, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(1, context, g6Var, false);
        this.t1 = new RectF();
        this.x1 = true;
        this.y1 = true;
        this.z1 = org.telegram.ui.ActionBar.l6.wj;
        this.A1 = org.telegram.ui.ActionBar.l6.i6;
        int i10 = org.telegram.ui.ActionBar.l6.a;
        int i11 = org.telegram.ui.ActionBar.l6.d6;
        this.B1 = i11;
        this.C1 = i11;
        this.D1 = org.telegram.ui.ActionBar.l6.G6;
        int i12 = org.telegram.ui.ActionBar.l6.y6;
        this.E1 = i12;
        this.F1 = i12;
        int i13 = org.telegram.ui.ActionBar.l6.Q5;
        this.G1 = i13;
        this.H1 = i13;
        this.J1 = true;
        this.I0 = g6Var;
        P0();
        this.p0 = 75;
        this.a = i7;
        this.n1 = jg.g.h(context, R.drawable.sheet_shadow_round);
        a51 I0 = I0(context);
        this.b = I0;
        I0.setWillNotDraw(false);
        this.b.setClipChildren(false);
        ViewGroup viewGroup = this.b;
        int i14 = this.t0;
        viewGroup.setPadding(i14, 0, i14, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.j1 = frameLayout;
        b51 b51Var = new b51(this, context, g6Var);
        this.s1 = b51Var;
        b51Var.y = true;
        b51Var.updateColors();
        b51Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        frameLayout.addView(b51Var, c8.ha.d(-1, 48.0f, 51, 7.0f, 7.0f, 7.0f, 7.0f));
        mz mzVar = new mz(context, null);
        this.r1 = mzVar;
        mzVar.setViewType(6);
        mzVar.x = false;
        mzVar.setUseHeaderOffset(true);
        cv0 cv0Var = new cv0(context, mzVar, 1, null);
        this.q1 = cv0Var;
        cv0Var.addView(mzVar, 0, c8.ha.d(-1, -1.0f, 0, 0.0f, 2.0f, 0.0f, 0.0f));
        String M0 = org.telegram.messenger.id.M0(2131748167, null);
        xh.l lVar = cv0Var.d;
        lVar.setText(M0);
        String M02 = org.telegram.messenger.id.M0(2131745807, null);
        x70 x70Var = cv0Var.e;
        x70Var.setText(M02);
        cv0Var.setVisibility(8);
        cv0Var.setAnimateLayoutChange(true);
        cv0Var.e(true, false);
        int i15 = this.D1;
        int i16 = this.E1;
        int i17 = this.B1;
        lVar.setTag(Integer.valueOf(i15));
        org.telegram.ui.ActionBar.g6 g6Var2 = cv0Var.n;
        org.telegram.ui.ActionBar.s6.U(lVar, i15, g6Var2);
        x70Var.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.s6.U(x70Var, i16, g6Var2);
        cv0Var.G = i17;
        this.b.addView(cv0Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 62.0f, 0.0f, 0.0f));
        bi.q1 q1Var = new bi.q1(this, context, g6Var, 28);
        this.k1 = q1Var;
        q1Var.setOverScrollMode(2);
        q1Var.setTag(13);
        q1Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        q1Var.setClipToPadding(false);
        q1Var.setHideIfEmpty(false);
        org.telegram.ui.ActionBar.s6.l(q1Var, 20, this.A1, g6Var);
        getContext();
        my myVar = new my(org.telegram.messenger.g0.L(8.0f), 0, q1Var);
        this.I1 = myVar;
        myVar.P = false;
        q1Var.setLayoutManager(myVar);
        q1Var.setHorizontalScrollBarEnabled(false);
        q1Var.setVerticalScrollBarEnabled(false);
        this.b.addView(q1Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        q1Var.setOnScrollListener(new ui(this, 19));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(58.0f);
        View view = new View(context);
        this.o1 = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.b.addView(view, layoutParams);
        this.b.addView(frameLayout, c8.ha.e(-1, 58, 51));
        M0(0.0f);
        q1Var.setEmptyView(cv0Var);
        q1Var.W1 = true;
        q1Var.X1 = 0;
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean G() {
        return false;
    }

    public a51 I0(Context context) {
        return new a51(this, context);
    }

    public abstract void J0(MotionEvent motionEvent, ah.i iVar);

    public final void K0(boolean z9) {
        View view = this.o1;
        if ((!z9 || view.getTag() == null) && (z9 || view.getTag() != null)) {
            return;
        }
        view.setTag(z9 ? null : 1);
        if (z9) {
            view.setVisibility(0);
        }
        AnimatorSet animatorSet = this.p1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.p1 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, z9 ? 1.0f : 0.0f));
        this.p1.setDuration(150L);
        this.p1.addListener(new t9(25, this, z9));
        this.p1.start();
    }

    public abstract void L0(String str);

    public final void M0(float f10) {
        this.v1 = f10;
        this.w1 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.l6.w0(this.B1, this.I0), org.telegram.ui.ActionBar.l6.w0(this.C1, this.I0));
        this.n1.setColorFilter(new PorterDuffColorFilter(this.w1, PorterDuff.Mode.MULTIPLY));
        O(this.w1);
        int i7 = this.w1;
        this.G0 = i7;
        bi.q1 q1Var = this.k1;
        q1Var.setGlowColor(i7);
        int S0 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.l6.x0(null, this.F1, false), org.telegram.ui.ActionBar.l6.x0(null, this.E1, false));
        int S02 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.l6.x0(null, this.H1, false), org.telegram.ui.ActionBar.l6.x0(null, this.G1, false));
        int childCount = q1Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = q1Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.z3) {
                ((org.telegram.ui.Cells.z3) childAt).a(S0, S0);
            } else if (childAt instanceof org.telegram.ui.Cells.f4) {
                ((org.telegram.ui.Cells.f4) childAt).f(this.o1.getTag() != null ? this.G1 : this.H1, S02);
            }
        }
        this.b.invalidate();
        q1Var.invalidate();
        this.c.invalidate();
    }

    public void N0(int i7) {
        this.k1.setTopGlowOffset(i7);
        float f10 = i7;
        this.j1.setTranslationY(f10);
        this.q1.setTranslationY(f10);
        this.b.invalidate();
    }

    public final void O0(int i7) {
        if (isShowing()) {
            this.k1.getViewTreeObserver().addOnPreDrawListener(new br0(this, i7, 1));
        }
    }

    public void Q0() {
        bi.q1 q1Var = this.k1;
        if (q1Var.getChildCount() <= 0) {
            return;
        }
        v4.d1 K = q1Var.K(0);
        int top = K != null ? K.a.getTop() - org.telegram.messenger.g0.L(8.0f) : 0;
        int i7 = (top <= 0 || K == null || K.b() != 0) ? 0 : top;
        if (top < 0 || K == null || K.b() != 0) {
            K0(true);
            top = i7;
        } else {
            K0(false);
        }
        if (this.u1 != top) {
            this.u1 = top;
            N0(top);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public void dismiss() {
        org.telegram.messenger.g0.v1(this.s1.J);
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        if (this.i1 == null) {
            TextView textView = new TextView(getContext());
            this.i1 = textView;
            org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.j5, this.I0);
            this.i1.setTextSize(1, 20.0f);
            this.i1.setTypeface(org.telegram.messenger.g0.o());
            this.i1.setLines(1);
            this.i1.setMaxLines(1);
            this.i1.setSingleLine(true);
            this.i1.setGravity((org.telegram.messenger.id.a0 ? 5 : 3) | 16);
            this.i1.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView2 = this.i1;
            FrameLayout.LayoutParams d = c8.ha.d(-1, 36.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f);
            FrameLayout frameLayout = this.j1;
            frameLayout.addView(textView2, d);
            ((FrameLayout.LayoutParams) this.s1.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(30.0f);
            frameLayout.getLayoutParams().height = org.telegram.messenger.g0.L(94.0f);
        }
        this.i1.setText(charSequence);
    }

    public void P0() {
    }
}
