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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public abstract class r51 extends org.telegram.ui.ActionBar.w2 {
    public int A1;
    public boolean B1;
    public boolean C1;
    public int D1;
    public int E1;
    public int F1;
    public int G1;
    public int H1;
    public int I1;
    public int J1;
    public int K1;
    public int L1;
    public final yy M1;
    public final boolean N1;
    public TextView m1;
    public final FrameLayout n1;
    public final di.b1 o1;
    public dk0 p1;
    public dk0 q1;
    public final Drawable r1;
    public final View s1;
    public AnimatorSet t1;
    public final nv0 u1;
    public final yz v1;
    public final q51 w1;
    public final RectF x1;
    public int y1;
    public float z1;

    static {
        new org.telegram.ui.Cells.p8("colorProgress", 10);
    }

    public r51(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(1, context, h6Var, false);
        this.x1 = new RectF();
        this.B1 = true;
        this.C1 = true;
        this.D1 = org.telegram.ui.ActionBar.m6.zj;
        this.E1 = org.telegram.ui.ActionBar.m6.i6;
        int i10 = org.telegram.ui.ActionBar.m6.a;
        int i11 = org.telegram.ui.ActionBar.m6.d6;
        this.F1 = i11;
        this.G1 = i11;
        this.H1 = org.telegram.ui.ActionBar.m6.G6;
        int i12 = org.telegram.ui.ActionBar.m6.y6;
        this.I1 = i12;
        this.J1 = i12;
        int i13 = org.telegram.ui.ActionBar.m6.Q5;
        this.K1 = i13;
        this.L1 = i13;
        this.N1 = true;
        this.J0 = h6Var;
        Q0();
        this.q0 = 75;
        this.a = i7;
        this.r1 = i5.c.g(context, R.drawable.sheet_shadow_round);
        p51 J0 = J0(context);
        this.b = J0;
        J0.setWillNotDraw(false);
        this.b.setClipChildren(false);
        ViewGroup viewGroup = this.b;
        int i14 = this.u0;
        viewGroup.setPadding(i14, 0, i14, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.n1 = frameLayout;
        q51 q51Var = new q51(this, context, h6Var);
        this.w1 = q51Var;
        q51Var.y = true;
        q51Var.updateColors();
        q51Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        frameLayout.addView(q51Var, c8.ma.d(-1, 48.0f, 51, 7.0f, 7.0f, 7.0f, 7.0f));
        yz yzVar = new yz(context, null);
        this.v1 = yzVar;
        yzVar.setViewType(6);
        yzVar.x = false;
        yzVar.setUseHeaderOffset(true);
        nv0 nv0Var = new nv0(context, yzVar, 1, null);
        this.u1 = nv0Var;
        nv0Var.addView(yzVar, 0, c8.ma.d(-1, -1.0f, 0, 0.0f, 2.0f, 0.0f, 0.0f));
        String N0 = org.telegram.messenger.hd.N0(2131747974, null);
        xh.l lVar = nv0Var.d;
        lVar.setText(N0);
        String N02 = org.telegram.messenger.hd.N0(2131745611, null);
        m80 m80Var = nv0Var.e;
        m80Var.setText(N02);
        nv0Var.setVisibility(8);
        nv0Var.setAnimateLayoutChange(true);
        nv0Var.e(true, false);
        int i15 = this.H1;
        int i16 = this.I1;
        int i17 = this.F1;
        lVar.setTag(Integer.valueOf(i15));
        org.telegram.ui.ActionBar.h6 h6Var2 = nv0Var.n;
        org.telegram.ui.ActionBar.t6.U(lVar, i15, h6Var2);
        m80Var.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.t6.U(m80Var, i16, h6Var2);
        nv0Var.H = i17;
        this.b.addView(nv0Var, c8.ma.d(-1, -1.0f, 51, 0.0f, 62.0f, 0.0f, 0.0f));
        di.b1 b1Var = new di.b1(this, context, h6Var, 28);
        this.o1 = b1Var;
        b1Var.setOverScrollMode(2);
        b1Var.setTag(13);
        b1Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        b1Var.setClipToPadding(false);
        b1Var.setHideIfEmpty(false);
        org.telegram.ui.ActionBar.t6.l(b1Var, 20, this.E1, h6Var);
        getContext();
        yy yyVar = new yy(org.telegram.messenger.g0.L(8.0f), 0, b1Var);
        this.M1 = yyVar;
        yyVar.P = false;
        b1Var.setLayoutManager(yyVar);
        b1Var.setHorizontalScrollBarEnabled(false);
        b1Var.setVerticalScrollBarEnabled(false);
        this.b.addView(b1Var, c8.ma.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        b1Var.setOnScrollListener(new oa(this, 22));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(58.0f);
        View view = new View(context);
        this.s1 = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.b.addView(view, layoutParams);
        this.b.addView(frameLayout, c8.ma.e(-1, 58, 51));
        N0(0.0f);
        b1Var.setEmptyView(nv0Var);
        b1Var.X1 = true;
        b1Var.Y1 = 0;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean G() {
        return false;
    }

    public p51 J0(Context context) {
        return new p51(this, context);
    }

    public abstract void K0(MotionEvent motionEvent, ah.i iVar);

    public final void L0(boolean z10) {
        View view = this.s1;
        if ((!z10 || view.getTag() == null) && (z10 || view.getTag() != null)) {
            return;
        }
        view.setTag(z10 ? null : 1);
        if (z10) {
            view.setVisibility(0);
        }
        AnimatorSet animatorSet = this.t1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.t1 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.t1.setDuration(150L);
        this.t1.addListener(new org.telegram.ui.on(26, this, z10));
        this.t1.start();
    }

    public abstract void M0(String str);

    public final void N0(float f10) {
        this.z1 = f10;
        this.A1 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.m6.w0(this.F1, this.J0), org.telegram.ui.ActionBar.m6.w0(this.G1, this.J0));
        this.r1.setColorFilter(new PorterDuffColorFilter(this.A1, PorterDuff.Mode.MULTIPLY));
        P(this.A1);
        int i7 = this.A1;
        this.H0 = i7;
        di.b1 b1Var = this.o1;
        b1Var.setGlowColor(i7);
        int S0 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, this.J1, false), org.telegram.ui.ActionBar.m6.x0(null, this.I1, false));
        int S02 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, this.L1, false), org.telegram.ui.ActionBar.m6.x0(null, this.K1, false));
        int childCount = b1Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = b1Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.a4) {
                ((org.telegram.ui.Cells.a4) childAt).a(S0, S0);
            } else if (childAt instanceof org.telegram.ui.Cells.g4) {
                ((org.telegram.ui.Cells.g4) childAt).f(this.s1.getTag() != null ? this.K1 : this.L1, S02);
            }
        }
        this.b.invalidate();
        b1Var.invalidate();
        this.c.invalidate();
    }

    public void O0(int i7) {
        this.o1.setTopGlowOffset(i7);
        float f10 = i7;
        this.n1.setTranslationY(f10);
        this.u1.setTranslationY(f10);
        this.b.invalidate();
    }

    public final void P0(int i7) {
        if (isShowing()) {
            this.o1.getViewTreeObserver().addOnPreDrawListener(new lr0(this, i7, 1));
        }
    }

    public void R0() {
        di.b1 b1Var = this.o1;
        if (b1Var.getChildCount() <= 0) {
            return;
        }
        v4.f1 K = b1Var.K(0);
        int top = K != null ? K.a.getTop() - org.telegram.messenger.g0.L(8.0f) : 0;
        int i7 = (top <= 0 || K == null || K.b() != 0) ? 0 : top;
        if (top < 0 || K == null || K.b() != 0) {
            L0(true);
            top = i7;
        } else {
            L0(false);
        }
        if (this.y1 != top) {
            this.y1 = top;
            O0(top);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public void dismiss() {
        org.telegram.messenger.g0.v1(this.w1.K);
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        if (this.m1 == null) {
            TextView textView = new TextView(getContext());
            this.m1 = textView;
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.j5, this.J0);
            this.m1.setTextSize(1, 20.0f);
            this.m1.setTypeface(org.telegram.messenger.g0.o());
            this.m1.setLines(1);
            this.m1.setMaxLines(1);
            this.m1.setSingleLine(true);
            this.m1.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
            this.m1.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView2 = this.m1;
            FrameLayout.LayoutParams d = c8.ma.d(-1, 36.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f);
            FrameLayout frameLayout = this.n1;
            frameLayout.addView(textView2, d);
            ((FrameLayout.LayoutParams) this.w1.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(30.0f);
            frameLayout.getLayoutParams().height = org.telegram.messenger.g0.L(94.0f);
        }
        this.m1.setText(charSequence);
    }

    public void Q0() {
    }
}
