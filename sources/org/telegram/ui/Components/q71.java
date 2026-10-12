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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public abstract class q71 extends org.telegram.ui.ActionBar.e3 {
    public float E;
    public int F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public final b00 R;
    public final boolean S;
    public TextView b;
    public final FrameLayout c;
    public final bi.o0 d;
    public lm0 e;
    public lm0 f;
    public final Drawable h;
    public final View n;
    public AnimatorSet r;
    public final wx0 s;
    public final f10 v;
    public final p71 w;
    public final RectF x;
    public int y;

    static {
        new org.telegram.ui.Cells.t8("colorProgress", 10);
    }

    public q71(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(1, context, c6Var, false);
        this.x = new RectF();
        this.G = true;
        this.H = true;
        this.I = org.telegram.ui.ActionBar.g6.Ii;
        this.J = org.telegram.ui.ActionBar.g6.i6;
        int i11 = org.telegram.ui.ActionBar.g6.a;
        int i12 = org.telegram.ui.ActionBar.g6.d6;
        this.K = i12;
        this.L = i12;
        this.M = org.telegram.ui.ActionBar.g6.G6;
        int i13 = org.telegram.ui.ActionBar.g6.y6;
        this.N = i13;
        this.O = i13;
        int i14 = org.telegram.ui.ActionBar.g6.Q5;
        this.P = i14;
        this.Q = i14;
        this.S = true;
        this.resourcesProvider = c6Var;
        L();
        setDimBehindAlpha(75);
        this.currentAccount = i10;
        this.h = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        o71 E = E(context);
        this.containerView = E;
        E.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        ViewGroup viewGroup = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i15, 0, i15, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        p71 p71Var = new p71(this, context, c6Var);
        this.w = p71Var;
        p71Var.x = true;
        p71Var.d();
        p71Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        frameLayout.addView(p71Var, w7.a6.a(48.0f, 7.0f, 7.0f, 7.0f, 7.0f, -1, 51));
        f10 f10Var = new f10(context, null);
        this.v = f10Var;
        f10Var.setViewType(6);
        f10Var.w = false;
        f10Var.setUseHeaderOffset(true);
        wx0 wx0Var = new wx0(context, f10Var, 1, null);
        this.s = wx0Var;
        wx0Var.addView(f10Var, 0, w7.a6.a(-1.0f, 0.0f, 2.0f, 0.0f, 0.0f, -1, 0));
        String string = LocaleController.getString(R.string.NoResult);
        wh.n nVar = wx0Var.d;
        nVar.setText(string);
        String string2 = LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2);
        da0 da0Var = wx0Var.e;
        da0Var.setText(string2);
        wx0Var.setVisibility(8);
        wx0Var.setAnimateLayoutChange(true);
        wx0Var.e(true, false);
        int i16 = this.M;
        int i17 = this.N;
        int i18 = this.K;
        nVar.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.c6 c6Var2 = wx0Var.n;
        nVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(i16, c6Var2));
        da0Var.setTag(Integer.valueOf(i17));
        da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i17, c6Var2));
        wx0Var.G = i18;
        this.containerView.addView(wx0Var, w7.a6.a(-1.0f, 0.0f, 62.0f, 0.0f, 0.0f, -1, 51));
        bi.o0 o0Var = new bi.o0(this, context, c6Var, 24);
        this.d = o0Var;
        o0Var.setOverScrollMode(2);
        o0Var.setTag(13);
        o0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        o0Var.setClipToPadding(false);
        o0Var.setHideIfEmpty(false);
        o0Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.w0(this.J, c6Var));
        getContext();
        b00 b00Var = new b00(AndroidUtilities.dp(8.0f), 0, o0Var);
        this.R = b00Var;
        b00Var.P = false;
        o0Var.setLayoutManager(b00Var);
        o0Var.setHorizontalScrollBarEnabled(false);
        o0Var.setVerticalScrollBarEnabled(false);
        this.containerView.addView(o0Var, w7.a6.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        o0Var.setOnScrollListener(new kc0(this, 8));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(58.0f);
        View view = new View(context);
        this.n = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        this.containerView.addView(frameLayout, w7.a6.e(-1, 58, 51));
        I(0.0f);
        o0Var.setEmptyView(wx0Var);
        o0Var.W1 = true;
        o0Var.X1 = 0;
    }

    public o71 E(Context context) {
        return new o71(this, context);
    }

    public abstract void F(MotionEvent motionEvent, di.g2 g2Var);

    public final void G(boolean z10) {
        View view = this.n;
        if ((!z10 || view.getTag() == null) && (z10 || view.getTag() != null)) {
            return;
        }
        view.setTag(z10 ? null : 1);
        if (z10) {
            view.setVisibility(0);
        }
        AnimatorSet animatorSet = this.r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.r = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.r.setDuration(150L);
        this.r.addListener(new org.telegram.ui.vo(25, this, z10));
        this.r.start();
    }

    public abstract void H(String str);

    public final void I(float f7) {
        this.E = f7;
        this.F = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(this.K, this.resourcesProvider), org.telegram.ui.ActionBar.g6.w0(this.L, this.resourcesProvider), f7, 1.0f);
        this.h.setColorFilter(new PorterDuffColorFilter(this.F, PorterDuff.Mode.MULTIPLY));
        fixNavigationBar(this.F);
        int i10 = this.F;
        this.navBarColor = i10;
        bi.o0 o0Var = this.d;
        o0Var.setGlowColor(i10);
        int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.x0(null, this.O, false), org.telegram.ui.ActionBar.g6.x0(null, this.N, false), f7, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.x0(null, this.Q, false), org.telegram.ui.ActionBar.g6.x0(null, this.P, false), f7, 1.0f);
        int childCount = o0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = o0Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.x3) {
                ((org.telegram.ui.Cells.x3) childAt).a(offsetColor, offsetColor);
            } else if (childAt instanceof org.telegram.ui.Cells.e4) {
                ((org.telegram.ui.Cells.e4) childAt).f(this.n.getTag() != null ? this.P : this.Q, offsetColor2);
            }
        }
        this.containerView.invalidate();
        o0Var.invalidate();
        this.container.invalidate();
    }

    public void J(int i10) {
        this.d.setTopGlowOffset(i10);
        float f7 = i10;
        this.c.setTranslationY(f7);
        this.s.setTranslationY(f7);
        this.containerView.invalidate();
    }

    public final void K(int i10) {
        if (isShowing()) {
            this.d.getViewTreeObserver().addOnPreDrawListener(new tt0(this, i10, 1));
        }
    }

    public void M() {
        bi.o0 o0Var = this.d;
        if (o0Var.getChildCount() <= 0) {
            return;
        }
        s4.b1 K = o0Var.K(0);
        int top = K != null ? K.a.getTop() - AndroidUtilities.dp(8.0f) : 0;
        int i10 = (top <= 0 || K == null || K.b() != 0) ? 0 : top;
        if (top < 0 || K == null || K.b() != 0) {
            G(true);
            top = i10;
        } else {
            G(false);
        }
        if (this.y != top) {
            this.y = top;
            J(top);
        }
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public void dismiss() {
        AndroidUtilities.hideKeyboard(this.w.J);
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        if (this.b == null) {
            TextView textView = new TextView(getContext());
            this.b = textView;
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.j5, this.resourcesProvider));
            this.b.setTextSize(1, 20.0f);
            this.b.setTypeface(AndroidUtilities.bold());
            this.b.setLines(1);
            this.b.setMaxLines(1);
            this.b.setSingleLine(true);
            this.b.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            this.b.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView2 = this.b;
            FrameLayout.LayoutParams a2 = w7.a6.a(36.0f, 16.0f, 0.0f, 0.0f, 0.0f, -1, 51);
            FrameLayout frameLayout = this.c;
            frameLayout.addView(textView2, a2);
            ((FrameLayout.LayoutParams) this.w.getLayoutParams()).topMargin = AndroidUtilities.dp(30.0f);
            frameLayout.getLayoutParams().height = AndroidUtilities.dp(94.0f);
        }
        this.b.setText(charSequence);
    }

    public void L() {
    }
}
