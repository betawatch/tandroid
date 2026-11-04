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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class v41 extends org.telegram.ui.ActionBar.t2 {
    public int A1;
    public int B1;
    public int C1;
    public int D1;
    public int E1;
    public int F1;
    public int G1;
    public int H1;
    public int I1;
    public final jy J1;
    public final boolean K1;
    public TextView j1;
    public final FrameLayout k1;
    public final ci.j1 l1;
    public sj0 m1;
    public sj0 n1;
    public final Drawable o1;
    public final View p1;
    public AnimatorSet q1;
    public final zu0 r1;
    public final iz s1;
    public final u41 t1;
    public final RectF u1;
    public int v1;
    public float w1;
    public int x1;
    public boolean y1;
    public boolean z1;

    static {
        new org.telegram.ui.Cells.n8("colorProgress", 10);
    }

    public v41(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, false);
        this.u1 = new RectF();
        this.y1 = true;
        this.z1 = true;
        this.A1 = org.telegram.ui.ActionBar.k6.wj;
        this.B1 = org.telegram.ui.ActionBar.k6.i6;
        int i10 = org.telegram.ui.ActionBar.k6.a;
        int i11 = org.telegram.ui.ActionBar.k6.d6;
        this.C1 = i11;
        this.D1 = i11;
        this.E1 = org.telegram.ui.ActionBar.k6.G6;
        int i12 = org.telegram.ui.ActionBar.k6.y6;
        this.F1 = i12;
        this.G1 = i12;
        int i13 = org.telegram.ui.ActionBar.k6.Q5;
        this.H1 = i13;
        this.I1 = i13;
        this.K1 = true;
        this.J0 = e6Var;
        P0();
        this.q0 = 75;
        this.a = i3;
        this.o1 = k2.p1.g(context, R.drawable.sheet_shadow_round);
        t41 I0 = I0(context);
        this.b = I0;
        I0.setWillNotDraw(false);
        this.b.setClipChildren(false);
        ViewGroup viewGroup = this.b;
        int i14 = this.u0;
        viewGroup.setPadding(i14, 0, i14, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.k1 = frameLayout;
        u41 u41Var = new u41(this, context, e6Var);
        this.t1 = u41Var;
        u41Var.y = true;
        u41Var.updateColors();
        u41Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        frameLayout.addView(u41Var, b8.mf.d(-1, 48.0f, 51, 7.0f, 7.0f, 7.0f, 7.0f));
        iz izVar = new iz(context, null);
        this.s1 = izVar;
        izVar.setViewType(6);
        izVar.x = false;
        izVar.setUseHeaderOffset(true);
        zu0 zu0Var = new zu0(context, izVar, 1, null);
        this.r1 = zu0Var;
        zu0Var.addView(izVar, 0, b8.mf.d(-1, -1.0f, 0, 0.0f, 2.0f, 0.0f, 0.0f));
        String M0 = org.telegram.messenger.bd.M0(2131748175, null);
        yh.l lVar = zu0Var.d;
        lVar.setText(M0);
        String M02 = org.telegram.messenger.bd.M0(2131745817, null);
        s70 s70Var = zu0Var.e;
        s70Var.setText(M02);
        zu0Var.setVisibility(8);
        zu0Var.setAnimateLayoutChange(true);
        zu0Var.e(true, false);
        int i15 = this.E1;
        int i16 = this.F1;
        int i17 = this.C1;
        lVar.setTag(Integer.valueOf(i15));
        org.telegram.ui.ActionBar.e6 e6Var2 = zu0Var.n;
        org.telegram.ui.ActionBar.r6.V(lVar, i15, e6Var2);
        s70Var.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.r6.V(s70Var, i16, e6Var2);
        zu0Var.H = i17;
        this.b.addView(zu0Var, b8.mf.d(-1, -1.0f, 51, 0.0f, 62.0f, 0.0f, 0.0f));
        ci.j1 j1Var = new ci.j1(this, context, e6Var, 28);
        this.l1 = j1Var;
        j1Var.setOverScrollMode(2);
        j1Var.setTag(13);
        j1Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        j1Var.setClipToPadding(false);
        j1Var.setHideIfEmpty(false);
        org.telegram.ui.ActionBar.r6.m(j1Var, 20, this.B1, e6Var);
        getContext();
        jy jyVar = new jy(org.telegram.messenger.g0.L(8.0f), 0, j1Var);
        this.J1 = jyVar;
        jyVar.P = false;
        j1Var.setLayoutManager(jyVar);
        j1Var.setHorizontalScrollBarEnabled(false);
        j1Var.setVerticalScrollBarEnabled(false);
        this.b.addView(j1Var, b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        j1Var.setOnScrollListener(new ji(this, 21));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(58.0f);
        View view = new View(context);
        this.p1 = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.b.addView(view, layoutParams);
        this.b.addView(frameLayout, b8.mf.e(-1, 58, 51));
        M0(0.0f);
        j1Var.setEmptyView(zu0Var);
        j1Var.X1 = true;
        j1Var.Y1 = 0;
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean G() {
        return false;
    }

    public t41 I0(Context context) {
        return new t41(this, context);
    }

    public abstract void J0(MotionEvent motionEvent, bh.g gVar);

    public final void K0(boolean z10) {
        View view = this.p1;
        if ((!z10 || view.getTag() == null) && (z10 || view.getTag() != null)) {
            return;
        }
        view.setTag(z10 ? null : 1);
        if (z10) {
            view.setVisibility(0);
        }
        AnimatorSet animatorSet = this.q1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.q1 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.q1.setDuration(150L);
        this.q1.addListener(new s9(25, this, z10));
        this.q1.start();
    }

    public abstract void L0(String str);

    public final void M0(float f10) {
        this.w1 = f10;
        this.x1 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.k6.w0(this.C1, this.J0), org.telegram.ui.ActionBar.k6.w0(this.D1, this.J0));
        this.o1.setColorFilter(new PorterDuffColorFilter(this.x1, PorterDuff.Mode.MULTIPLY));
        O(this.x1);
        int i3 = this.x1;
        this.H0 = i3;
        ci.j1 j1Var = this.l1;
        j1Var.setGlowColor(i3);
        int S0 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, this.G1, false), org.telegram.ui.ActionBar.k6.x0(null, this.F1, false));
        int S02 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, this.I1, false), org.telegram.ui.ActionBar.k6.x0(null, this.H1, false));
        int childCount = j1Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = j1Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.z3) {
                ((org.telegram.ui.Cells.z3) childAt).a(S0, S0);
            } else if (childAt instanceof org.telegram.ui.Cells.f4) {
                ((org.telegram.ui.Cells.f4) childAt).f(this.p1.getTag() != null ? this.H1 : this.I1, S02);
            }
        }
        this.b.invalidate();
        j1Var.invalidate();
        this.c.invalidate();
    }

    public void N0(int i3) {
        this.l1.setTopGlowOffset(i3);
        float f10 = i3;
        this.k1.setTranslationY(f10);
        this.r1.setTranslationY(f10);
        this.b.invalidate();
    }

    public final void O0(int i3) {
        if (isShowing()) {
            this.l1.getViewTreeObserver().addOnPreDrawListener(new zq0(this, i3, 1));
        }
    }

    public void Q0() {
        ci.j1 j1Var = this.l1;
        if (j1Var.getChildCount() <= 0) {
            return;
        }
        u4.d1 K = j1Var.K(0);
        int top = K != null ? K.a.getTop() - org.telegram.messenger.g0.L(8.0f) : 0;
        int i3 = (top <= 0 || K == null || K.b() != 0) ? 0 : top;
        if (top < 0 || K == null || K.b() != 0) {
            K0(true);
            top = i3;
        } else {
            K0(false);
        }
        if (this.v1 != top) {
            this.v1 = top;
            N0(top);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public void dismiss() {
        org.telegram.messenger.g0.v1(this.t1.K);
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        if (this.j1 == null) {
            TextView textView = new TextView(getContext());
            this.j1 = textView;
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, this.J0);
            this.j1.setTextSize(1, 20.0f);
            this.j1.setTypeface(org.telegram.messenger.g0.o());
            this.j1.setLines(1);
            this.j1.setMaxLines(1);
            this.j1.setSingleLine(true);
            this.j1.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
            this.j1.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView2 = this.j1;
            FrameLayout.LayoutParams d = b8.mf.d(-1, 36.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f);
            FrameLayout frameLayout = this.k1;
            frameLayout.addView(textView2, d);
            ((FrameLayout.LayoutParams) this.t1.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(30.0f);
            frameLayout.getLayoutParams().height = org.telegram.messenger.g0.L(94.0f);
        }
        this.j1.setText(charSequence);
    }

    public void P0() {
    }
}
