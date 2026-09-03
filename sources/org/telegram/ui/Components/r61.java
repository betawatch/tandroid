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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public abstract class r61 extends org.telegram.ui.ActionBar.h3 {
    public float B;
    public int C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public final rz O;
    public final boolean P;
    public TextView b;
    public final FrameLayout c;
    public final mh.d1 d;
    public rl0 e;
    public rl0 f;
    public final Drawable h;
    public final View n;
    public AnimatorSet r;
    public final zw0 s;
    public final u00 v;
    public final q61 w;
    public final RectF x;
    public int y;

    static {
        new ih.g("colorProgress", 12);
    }

    public r61(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, false, false);
        this.x = new RectF();
        this.D = true;
        this.E = true;
        this.F = org.telegram.ui.ActionBar.k6.Ii;
        this.G = org.telegram.ui.ActionBar.k6.i6;
        int i11 = org.telegram.ui.ActionBar.k6.a;
        int i12 = org.telegram.ui.ActionBar.k6.d6;
        this.H = i12;
        this.I = i12;
        this.J = org.telegram.ui.ActionBar.k6.G6;
        int i13 = org.telegram.ui.ActionBar.k6.y6;
        this.K = i13;
        this.L = i13;
        int i14 = org.telegram.ui.ActionBar.k6.Q5;
        this.M = i14;
        this.N = i14;
        this.P = true;
        this.resourcesProvider = g6Var;
        J();
        setDimBehindAlpha(75);
        this.currentAccount = i10;
        this.h = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        p61 C = C(context);
        this.containerView = C;
        C.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        ViewGroup viewGroup = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i15, 0, i15, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        q61 q61Var = new q61(this, context, g6Var);
        this.w = q61Var;
        q61Var.x = true;
        q61Var.e();
        q61Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        frameLayout.addView(q61Var, k7.c6.d(-1, 48.0f, 51, 7.0f, 7.0f, 7.0f, 7.0f));
        u00 u00Var = new u00(context, null);
        this.v = u00Var;
        u00Var.setViewType(6);
        u00Var.w = false;
        u00Var.setUseHeaderOffset(true);
        zw0 zw0Var = new zw0(context, u00Var, 1, null);
        this.s = zw0Var;
        zw0Var.addView(u00Var, 0, k7.c6.d(-1, -1.0f, 0, 0.0f, 2.0f, 0.0f, 0.0f));
        String string = LocaleController.getString(R.string.NoResult);
        jh.s sVar = zw0Var.d;
        sVar.setText(string);
        String string2 = LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2);
        g90 g90Var = zw0Var.e;
        g90Var.setText(string2);
        zw0Var.setVisibility(8);
        zw0Var.setAnimateLayoutChange(true);
        zw0Var.e(true, false);
        int i16 = this.J;
        int i17 = this.K;
        int i18 = this.H;
        sVar.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.g6 g6Var2 = zw0Var.n;
        sVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(i16, g6Var2));
        g90Var.setTag(Integer.valueOf(i17));
        g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i17, g6Var2));
        zw0Var.D = i18;
        this.containerView.addView(zw0Var, k7.c6.d(-1, -1.0f, 51, 0.0f, 62.0f, 0.0f, 0.0f));
        mh.d1 d1Var = new mh.d1(this, context, g6Var, 22);
        this.d = d1Var;
        d1Var.setOverScrollMode(2);
        d1Var.setTag(13);
        d1Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        d1Var.setClipToPadding(false);
        d1Var.setHideIfEmpty(false);
        d1Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.k6.v0(this.G, g6Var));
        getContext();
        rz rzVar = new rz(AndroidUtilities.dp(8.0f), 0, d1Var);
        this.O = rzVar;
        rzVar.P = false;
        d1Var.setLayoutManager(rzVar);
        d1Var.setHorizontalScrollBarEnabled(false);
        d1Var.setVerticalScrollBarEnabled(false);
        this.containerView.addView(d1Var, k7.c6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        d1Var.setOnScrollListener(new nb0(this, 8));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(58.0f);
        View view = new View(context);
        this.n = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        this.containerView.addView(frameLayout, k7.c6.e(-1, 58, 51));
        G(0.0f);
        d1Var.setEmptyView(zw0Var);
        d1Var.V1 = true;
        d1Var.W1 = 0;
    }

    public p61 C(Context context) {
        return new p61(this, context);
    }

    public abstract void D(MotionEvent motionEvent, lg.f fVar);

    public final void E(boolean z4) {
        View view = this.n;
        if ((!z4 || view.getTag() == null) && (z4 || view.getTag() != null)) {
            return;
        }
        view.setTag(z4 ? null : 1);
        if (z4) {
            view.setVisibility(0);
        }
        AnimatorSet animatorSet = this.r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.r = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, z4 ? 1.0f : 0.0f));
        this.r.setDuration(150L);
        this.r.addListener(new x20(14, this, z4));
        this.r.start();
    }

    public abstract void F(String str);

    public final void G(float f10) {
        this.B = f10;
        this.C = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.v0(this.H, this.resourcesProvider), org.telegram.ui.ActionBar.k6.v0(this.I, this.resourcesProvider), f10, 1.0f);
        this.h.setColorFilter(new PorterDuffColorFilter(this.C, PorterDuff.Mode.MULTIPLY));
        fixNavigationBar(this.C);
        int i10 = this.C;
        this.navBarColor = i10;
        mh.d1 d1Var = this.d;
        d1Var.setGlowColor(i10);
        int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.w0(null, this.L, false), org.telegram.ui.ActionBar.k6.w0(null, this.K, false), f10, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.w0(null, this.N, false), org.telegram.ui.ActionBar.k6.w0(null, this.M, false), f10, 1.0f);
        int childCount = d1Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = d1Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.w3) {
                ((org.telegram.ui.Cells.w3) childAt).a(offsetColor, offsetColor);
            } else if (childAt instanceof org.telegram.ui.Cells.e4) {
                ((org.telegram.ui.Cells.e4) childAt).f(this.n.getTag() != null ? this.M : this.N, offsetColor2);
            }
        }
        this.containerView.invalidate();
        d1Var.invalidate();
        this.container.invalidate();
    }

    public void H(int i10) {
        this.d.setTopGlowOffset(i10);
        float f10 = i10;
        this.c.setTranslationY(f10);
        this.s.setTranslationY(f10);
        this.containerView.invalidate();
    }

    public final void I(int i10) {
        if (isShowing()) {
            this.d.getViewTreeObserver().addOnPreDrawListener(new ts0(this, i10, 1));
        }
    }

    public void K() {
        mh.d1 d1Var = this.d;
        if (d1Var.getChildCount() <= 0) {
            return;
        }
        f2.m1 K = d1Var.K(0);
        int top = K != null ? K.a.getTop() - AndroidUtilities.dp(8.0f) : 0;
        int i10 = (top <= 0 || K == null || K.b() != 0) ? 0 : top;
        if (top < 0 || K == null || K.b() != 0) {
            E(true);
            top = i10;
        } else {
            E(false);
        }
        if (this.y != top) {
            this.y = top;
            H(top);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public void dismiss() {
        AndroidUtilities.hideKeyboard(this.w.G);
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        if (this.b == null) {
            TextView textView = new TextView(getContext());
            this.b = textView;
            textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.j5, this.resourcesProvider));
            this.b.setTextSize(1, 20.0f);
            this.b.setTypeface(AndroidUtilities.bold());
            this.b.setLines(1);
            this.b.setMaxLines(1);
            this.b.setSingleLine(true);
            this.b.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            this.b.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView2 = this.b;
            FrameLayout.LayoutParams d = k7.c6.d(-1, 36.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f);
            FrameLayout frameLayout = this.c;
            frameLayout.addView(textView2, d);
            ((FrameLayout.LayoutParams) this.w.getLayoutParams()).topMargin = AndroidUtilities.dp(30.0f);
            frameLayout.getLayoutParams().height = AndroidUtilities.dp(94.0f);
        }
        this.b.setText(charSequence);
    }

    public void J() {
    }
}
