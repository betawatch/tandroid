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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class c51 extends org.telegram.ui.ActionBar.w2 {
    public boolean A1;
    public boolean B1;
    public int C1;
    public int D1;
    public int E1;
    public int F1;
    public int G1;
    public int H1;
    public int I1;
    public int J1;
    public int K1;
    public final ly L1;
    public final boolean M1;
    public TextView l1;
    public final FrameLayout m1;
    public final bi.q1 n1;
    public oj0 o1;
    public oj0 p1;
    public final Drawable q1;
    public final View r1;
    public AnimatorSet s1;
    public final bv0 t1;
    public final lz u1;
    public final b51 v1;
    public final RectF w1;
    public int x1;
    public float y1;
    public int z1;

    static {
        new org.telegram.ui.Cells.o8("colorProgress", 10);
    }

    public c51(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(1, context, h6Var, false);
        this.w1 = new RectF();
        this.A1 = true;
        this.B1 = true;
        this.C1 = org.telegram.ui.ActionBar.m6.wj;
        this.D1 = org.telegram.ui.ActionBar.m6.i6;
        int i10 = org.telegram.ui.ActionBar.m6.a;
        int i11 = org.telegram.ui.ActionBar.m6.d6;
        this.E1 = i11;
        this.F1 = i11;
        this.G1 = org.telegram.ui.ActionBar.m6.G6;
        int i12 = org.telegram.ui.ActionBar.m6.y6;
        this.H1 = i12;
        this.I1 = i12;
        int i13 = org.telegram.ui.ActionBar.m6.Q5;
        this.J1 = i13;
        this.K1 = i13;
        this.M1 = true;
        this.I0 = h6Var;
        P0();
        this.p0 = 75;
        this.a = i7;
        this.q1 = jg.g.h(context, R.drawable.sheet_shadow_round);
        a51 I0 = I0(context);
        this.b = I0;
        I0.setWillNotDraw(false);
        this.b.setClipChildren(false);
        ViewGroup viewGroup = this.b;
        int i14 = this.t0;
        viewGroup.setPadding(i14, 0, i14, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.m1 = frameLayout;
        b51 b51Var = new b51(this, context, h6Var);
        this.v1 = b51Var;
        b51Var.y = true;
        b51Var.updateColors();
        b51Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        frameLayout.addView(b51Var, c8.ha.d(-1, 48.0f, 51, 7.0f, 7.0f, 7.0f, 7.0f));
        lz lzVar = new lz(context, null);
        this.u1 = lzVar;
        lzVar.setViewType(6);
        lzVar.x = false;
        lzVar.setUseHeaderOffset(true);
        bv0 bv0Var = new bv0(context, lzVar, 1, null);
        this.t1 = bv0Var;
        bv0Var.addView(lzVar, 0, c8.ha.d(-1, -1.0f, 0, 0.0f, 2.0f, 0.0f, 0.0f));
        String M0 = org.telegram.messenger.id.M0(2131748167, null);
        xh.l lVar = bv0Var.d;
        lVar.setText(M0);
        String M02 = org.telegram.messenger.id.M0(2131745807, null);
        w70 w70Var = bv0Var.e;
        w70Var.setText(M02);
        bv0Var.setVisibility(8);
        bv0Var.setAnimateLayoutChange(true);
        bv0Var.e(true, false);
        int i15 = this.G1;
        int i16 = this.H1;
        int i17 = this.E1;
        lVar.setTag(Integer.valueOf(i15));
        org.telegram.ui.ActionBar.h6 h6Var2 = bv0Var.n;
        org.telegram.ui.ActionBar.t6.U(lVar, i15, h6Var2);
        w70Var.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.t6.U(w70Var, i16, h6Var2);
        bv0Var.G = i17;
        this.b.addView(bv0Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 62.0f, 0.0f, 0.0f));
        bi.q1 q1Var = new bi.q1(this, context, h6Var, 28);
        this.n1 = q1Var;
        q1Var.setOverScrollMode(2);
        q1Var.setTag(13);
        q1Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        q1Var.setClipToPadding(false);
        q1Var.setHideIfEmpty(false);
        org.telegram.ui.ActionBar.t6.l(q1Var, 20, this.D1, h6Var);
        getContext();
        ly lyVar = new ly(org.telegram.messenger.g0.L(8.0f), 0, q1Var);
        this.L1 = lyVar;
        lyVar.P = false;
        q1Var.setLayoutManager(lyVar);
        q1Var.setHorizontalScrollBarEnabled(false);
        q1Var.setVerticalScrollBarEnabled(false);
        this.b.addView(q1Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        q1Var.setOnScrollListener(new ti(this, 19));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(58.0f);
        View view = new View(context);
        this.r1 = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.b.addView(view, layoutParams);
        this.b.addView(frameLayout, c8.ha.e(-1, 58, 51));
        M0(0.0f);
        q1Var.setEmptyView(bv0Var);
        q1Var.W1 = true;
        q1Var.X1 = 0;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean G() {
        return false;
    }

    public a51 I0(Context context) {
        return new a51(this, context);
    }

    public abstract void J0(MotionEvent motionEvent, ah.i iVar);

    public final void K0(boolean z9) {
        View view = this.r1;
        if ((!z9 || view.getTag() == null) && (z9 || view.getTag() != null)) {
            return;
        }
        view.setTag(z9 ? null : 1);
        if (z9) {
            view.setVisibility(0);
        }
        AnimatorSet animatorSet = this.s1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.s1 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, z9 ? 1.0f : 0.0f));
        this.s1.setDuration(150L);
        this.s1.addListener(new s9(25, this, z9));
        this.s1.start();
    }

    public abstract void L0(String str);

    public final void M0(float f10) {
        this.y1 = f10;
        this.z1 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.m6.w0(this.E1, this.I0), org.telegram.ui.ActionBar.m6.w0(this.F1, this.I0));
        this.q1.setColorFilter(new PorterDuffColorFilter(this.z1, PorterDuff.Mode.MULTIPLY));
        O(this.z1);
        int i7 = this.z1;
        this.G0 = i7;
        bi.q1 q1Var = this.n1;
        q1Var.setGlowColor(i7);
        int S0 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, this.I1, false), org.telegram.ui.ActionBar.m6.x0(null, this.H1, false));
        int S02 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, this.K1, false), org.telegram.ui.ActionBar.m6.x0(null, this.J1, false));
        int childCount = q1Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = q1Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.z3) {
                ((org.telegram.ui.Cells.z3) childAt).a(S0, S0);
            } else if (childAt instanceof org.telegram.ui.Cells.f4) {
                ((org.telegram.ui.Cells.f4) childAt).f(this.r1.getTag() != null ? this.J1 : this.K1, S02);
            }
        }
        this.b.invalidate();
        q1Var.invalidate();
        this.c.invalidate();
    }

    public void N0(int i7) {
        this.n1.setTopGlowOffset(i7);
        float f10 = i7;
        this.m1.setTranslationY(f10);
        this.t1.setTranslationY(f10);
        this.b.invalidate();
    }

    public final void O0(int i7) {
        if (isShowing()) {
            this.n1.getViewTreeObserver().addOnPreDrawListener(new ar0(this, i7, 1));
        }
    }

    public void Q0() {
        bi.q1 q1Var = this.n1;
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
        if (this.x1 != top) {
            this.x1 = top;
            N0(top);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public void dismiss() {
        org.telegram.messenger.g0.v1(this.v1.J);
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        if (this.l1 == null) {
            TextView textView = new TextView(getContext());
            this.l1 = textView;
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.j5, this.I0);
            this.l1.setTextSize(1, 20.0f);
            this.l1.setTypeface(org.telegram.messenger.g0.o());
            this.l1.setLines(1);
            this.l1.setMaxLines(1);
            this.l1.setSingleLine(true);
            this.l1.setGravity((org.telegram.messenger.id.a0 ? 5 : 3) | 16);
            this.l1.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView2 = this.l1;
            FrameLayout.LayoutParams d = c8.ha.d(-1, 36.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f);
            FrameLayout frameLayout = this.m1;
            frameLayout.addView(textView2, d);
            ((FrameLayout.LayoutParams) this.v1.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(30.0f);
            frameLayout.getLayoutParams().height = org.telegram.messenger.g0.L(94.0f);
        }
        this.l1.setText(charSequence);
    }

    public void P0() {
    }
}
