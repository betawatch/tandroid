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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public abstract class o61 extends org.telegram.ui.ActionBar.f3 {
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
    public final pz R;
    public final boolean S;
    public TextView b;
    public final FrameLayout c;
    public final bi.o0 d;
    public kl0 e;
    public kl0 f;
    public final Drawable h;
    public final View n;
    public AnimatorSet r;
    public final xw0 s;
    public final t00 v;
    public final n61 w;
    public final RectF x;
    public int y;

    static {
        new org.telegram.ui.Cells.t8("colorProgress", 10);
    }

    public o61(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, false);
        this.x = new RectF();
        this.G = true;
        this.H = true;
        this.I = org.telegram.ui.ActionBar.j6.Ii;
        this.J = org.telegram.ui.ActionBar.j6.i6;
        int i11 = org.telegram.ui.ActionBar.j6.a;
        int i12 = org.telegram.ui.ActionBar.j6.d6;
        this.K = i12;
        this.L = i12;
        this.M = org.telegram.ui.ActionBar.j6.G6;
        int i13 = org.telegram.ui.ActionBar.j6.y6;
        this.N = i13;
        this.O = i13;
        int i14 = org.telegram.ui.ActionBar.j6.Q5;
        this.P = i14;
        this.Q = i14;
        this.S = true;
        this.resourcesProvider = f6Var;
        K();
        setDimBehindAlpha(75);
        this.currentAccount = i10;
        this.h = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        m61 C = C(context);
        this.containerView = C;
        C.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        ViewGroup viewGroup = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i15, 0, i15, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        n61 n61Var = new n61(this, context, f6Var);
        this.w = n61Var;
        n61Var.x = true;
        n61Var.d();
        n61Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        frameLayout.addView(n61Var, w7.x5.d(-1, 48.0f, 51, 7.0f, 7.0f, 7.0f, 7.0f));
        t00 t00Var = new t00(context, null);
        this.v = t00Var;
        t00Var.setViewType(6);
        t00Var.w = false;
        t00Var.setUseHeaderOffset(true);
        xw0 xw0Var = new xw0(context, t00Var, 1, null);
        this.s = xw0Var;
        xw0Var.addView(t00Var, 0, w7.x5.d(-1, -1.0f, 0, 0.0f, 2.0f, 0.0f, 0.0f));
        String string = LocaleController.getString(R.string.NoResult);
        wh.p pVar = xw0Var.d;
        pVar.setText(string);
        String string2 = LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2);
        d90 d90Var = xw0Var.e;
        d90Var.setText(string2);
        xw0Var.setVisibility(8);
        xw0Var.setAnimateLayoutChange(true);
        xw0Var.e(true, false);
        int i16 = this.M;
        int i17 = this.N;
        int i18 = this.K;
        pVar.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.f6 f6Var2 = xw0Var.n;
        pVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i16, f6Var2));
        d90Var.setTag(Integer.valueOf(i17));
        d90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i17, f6Var2));
        xw0Var.G = i18;
        this.containerView.addView(xw0Var, w7.x5.d(-1, -1.0f, 51, 0.0f, 62.0f, 0.0f, 0.0f));
        bi.o0 o0Var = new bi.o0(this, context, f6Var, 24);
        this.d = o0Var;
        o0Var.setOverScrollMode(2);
        o0Var.setTag(13);
        o0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        o0Var.setClipToPadding(false);
        o0Var.setHideIfEmpty(false);
        o0Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(this.J, f6Var));
        getContext();
        pz pzVar = new pz(AndroidUtilities.dp(8.0f), 0, o0Var);
        this.R = pzVar;
        pzVar.P = false;
        o0Var.setLayoutManager(pzVar);
        o0Var.setHorizontalScrollBarEnabled(false);
        o0Var.setVerticalScrollBarEnabled(false);
        this.containerView.addView(o0Var, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        o0Var.setOnScrollListener(new lb0(this, 8));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(58.0f);
        View view = new View(context);
        this.n = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        this.containerView.addView(frameLayout, w7.x5.e(-1, 58, 51));
        H(0.0f);
        o0Var.setEmptyView(xw0Var);
        o0Var.Y1 = true;
        o0Var.Z1 = 0;
    }

    public m61 C(Context context) {
        return new m61(this, context);
    }

    public abstract void D(MotionEvent motionEvent, di.h2 h2Var);

    public final void F(boolean z10) {
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
        this.r.addListener(new org.telegram.ui.to(25, this, z10));
        this.r.start();
    }

    public abstract void G(String str);

    public final void H(float f7) {
        this.E = f7;
        this.F = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.v0(this.K, this.resourcesProvider), org.telegram.ui.ActionBar.j6.v0(this.L, this.resourcesProvider), f7, 1.0f);
        this.h.setColorFilter(new PorterDuffColorFilter(this.F, PorterDuff.Mode.MULTIPLY));
        fixNavigationBar(this.F);
        int i10 = this.F;
        this.navBarColor = i10;
        bi.o0 o0Var = this.d;
        o0Var.setGlowColor(i10);
        int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, this.O, false), org.telegram.ui.ActionBar.j6.w0(null, this.N, false), f7, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, this.Q, false), org.telegram.ui.ActionBar.j6.w0(null, this.P, false), f7, 1.0f);
        int childCount = o0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = o0Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.w3) {
                ((org.telegram.ui.Cells.w3) childAt).a(offsetColor, offsetColor);
            } else if (childAt instanceof org.telegram.ui.Cells.d4) {
                ((org.telegram.ui.Cells.d4) childAt).f(this.n.getTag() != null ? this.P : this.Q, offsetColor2);
            }
        }
        this.containerView.invalidate();
        o0Var.invalidate();
        this.container.invalidate();
    }

    public void I(int i10) {
        this.d.setTopGlowOffset(i10);
        float f7 = i10;
        this.c.setTranslationY(f7);
        this.s.setTranslationY(f7);
        this.containerView.invalidate();
    }

    public final void J(int i10) {
        if (isShowing()) {
            this.d.getViewTreeObserver().addOnPreDrawListener(new ts0(this, i10, 1));
        }
    }

    public void L() {
        bi.o0 o0Var = this.d;
        if (o0Var.getChildCount() <= 0) {
            return;
        }
        s4.c1 K = o0Var.K(0);
        int top = K != null ? K.a.getTop() - AndroidUtilities.dp(8.0f) : 0;
        int i10 = (top <= 0 || K == null || K.b() != 0) ? 0 : top;
        if (top < 0 || K == null || K.b() != 0) {
            F(true);
            top = i10;
        } else {
            F(false);
        }
        if (this.y != top) {
            this.y = top;
            I(top);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public void dismiss() {
        AndroidUtilities.hideKeyboard(this.w.J);
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        if (this.b == null) {
            TextView textView = new TextView(getContext());
            this.b = textView;
            textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, this.resourcesProvider));
            this.b.setTextSize(1, 20.0f);
            this.b.setTypeface(AndroidUtilities.bold());
            this.b.setLines(1);
            this.b.setMaxLines(1);
            this.b.setSingleLine(true);
            this.b.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            this.b.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView2 = this.b;
            FrameLayout.LayoutParams d = w7.x5.d(-1, 36.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f);
            FrameLayout frameLayout = this.c;
            frameLayout.addView(textView2, d);
            ((FrameLayout.LayoutParams) this.w.getLayoutParams()).topMargin = AndroidUtilities.dp(30.0f);
            frameLayout.getLayoutParams().height = AndroidUtilities.dp(94.0f);
        }
        this.b.setText(charSequence);
    }

    public void K() {
    }
}
