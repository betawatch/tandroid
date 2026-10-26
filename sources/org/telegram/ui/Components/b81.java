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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public abstract class b81 extends org.telegram.ui.ActionBar.k3 {
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
    public final yz R;
    public final boolean S;
    public TextView b;
    public final FrameLayout c;
    public final bi.r1 d;
    public lm0 e;
    public lm0 f;
    public final Drawable h;
    public final View n;
    public AnimatorSet r;
    public final ey0 s;
    public final c10 v;
    public final a81 w;
    public final RectF x;
    public int y;

    static {
        new org.telegram.ui.Cells.x8("colorProgress", 10);
    }

    public b81(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(1, context, u6Var, false);
        this.x = new RectF();
        this.G = true;
        this.H = true;
        this.I = org.telegram.ui.ActionBar.y6.Ii;
        this.J = org.telegram.ui.ActionBar.y6.i6;
        int i11 = org.telegram.ui.ActionBar.y6.a;
        int i12 = org.telegram.ui.ActionBar.y6.d6;
        this.K = i12;
        this.L = i12;
        this.M = org.telegram.ui.ActionBar.y6.G6;
        int i13 = org.telegram.ui.ActionBar.y6.y6;
        this.N = i13;
        this.O = i13;
        int i14 = org.telegram.ui.ActionBar.y6.Q5;
        this.P = i14;
        this.Q = i14;
        this.S = true;
        this.resourcesProvider = u6Var;
        K();
        setDimBehindAlpha(75);
        this.currentAccount = i10;
        this.h = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        z71 C = C(context);
        this.containerView = C;
        C.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        ViewGroup viewGroup = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i15, 0, i15, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        a81 a81Var = new a81(this, context, u6Var);
        this.w = a81Var;
        a81Var.x = true;
        a81Var.updateColors();
        a81Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        frameLayout.addView(a81Var, gb1.h(-1, 48.0f, 51, 7.0f, 7.0f, 7.0f, 7.0f));
        c10 c10Var = new c10(context, null);
        this.v = c10Var;
        c10Var.setViewType(6);
        c10Var.w = false;
        c10Var.setUseHeaderOffset(true);
        ey0 ey0Var = new ey0(context, c10Var, 1, null);
        this.s = ey0Var;
        ey0Var.addView(c10Var, 0, gb1.h(-1, -1.0f, 0, 0.0f, 2.0f, 0.0f, 0.0f));
        String string = LocaleController.getString(R.string.NoResult);
        xh.n nVar = ey0Var.d;
        nVar.setText(string);
        String string2 = LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2);
        z90 z90Var = ey0Var.e;
        z90Var.setText(string2);
        ey0Var.setVisibility(8);
        ey0Var.setAnimateLayoutChange(true);
        ey0Var.e(true, false);
        int i16 = this.M;
        int i17 = this.N;
        int i18 = this.K;
        nVar.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.u6 u6Var2 = ey0Var.n;
        org.telegram.ui.ActionBar.f7.V(nVar, i16, u6Var2);
        z90Var.setTag(Integer.valueOf(i17));
        org.telegram.ui.ActionBar.f7.V(z90Var, i17, u6Var2);
        ey0Var.G = i18;
        this.containerView.addView(ey0Var, gb1.h(-1, -1.0f, 51, 0.0f, 62.0f, 0.0f, 0.0f));
        bi.r1 r1Var = new bi.r1(this, context, u6Var, 25);
        this.d = r1Var;
        r1Var.setOverScrollMode(2);
        r1Var.setTag(13);
        r1Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        r1Var.setClipToPadding(false);
        r1Var.setHideIfEmpty(false);
        org.telegram.ui.ActionBar.f7.m(r1Var, 20, this.J, u6Var);
        getContext();
        yz yzVar = new yz(AndroidUtilities.dp(8.0f), 0, r1Var);
        this.R = yzVar;
        yzVar.P = false;
        r1Var.setLayoutManager(yzVar);
        r1Var.setHorizontalScrollBarEnabled(false);
        r1Var.setVerticalScrollBarEnabled(false);
        this.containerView.addView(r1Var, gb1.h(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        r1Var.setOnScrollListener(new ml(this, 17));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(58.0f);
        View view = new View(context);
        this.n = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        this.containerView.addView(frameLayout, gb1.i(-1, 58, 51));
        H(0.0f);
        r1Var.setEmptyView(ey0Var);
        r1Var.W1 = true;
        r1Var.X1 = 0;
    }

    public z71 C(Context context) {
        return new z71(this, context);
    }

    public abstract void D(MotionEvent motionEvent, fi.c2 c2Var);

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
        this.r.addListener(new org.telegram.ui.jo(25, this, z10));
        this.r.start();
    }

    public abstract void G(String str);

    public final void H(float f7) {
        this.E = f7;
        this.F = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.y6.w0(this.K, this.resourcesProvider), org.telegram.ui.ActionBar.y6.w0(this.L, this.resourcesProvider), f7, 1.0f);
        this.h.setColorFilter(new PorterDuffColorFilter(this.F, PorterDuff.Mode.MULTIPLY));
        fixNavigationBar(this.F);
        int i10 = this.F;
        this.navBarColor = i10;
        bi.r1 r1Var = this.d;
        r1Var.setGlowColor(i10);
        int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.y6.x0(null, this.O, false), org.telegram.ui.ActionBar.y6.x0(null, this.N, false), f7, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.y6.x0(null, this.Q, false), org.telegram.ui.ActionBar.y6.x0(null, this.P, false), f7, 1.0f);
        int childCount = r1Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = r1Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.b4) {
                ((org.telegram.ui.Cells.b4) childAt).a(offsetColor, offsetColor);
            } else if (childAt instanceof org.telegram.ui.Cells.i4) {
                ((org.telegram.ui.Cells.i4) childAt).f(this.n.getTag() != null ? this.P : this.Q, offsetColor2);
            }
        }
        this.containerView.invalidate();
        r1Var.invalidate();
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
            this.d.getViewTreeObserver().addOnPreDrawListener(new au0(this, i10, 1));
        }
    }

    public void L() {
        bi.r1 r1Var = this.d;
        if (r1Var.getChildCount() <= 0) {
            return;
        }
        s4.e1 K = r1Var.K(0);
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

    @Override // org.telegram.ui.ActionBar.k3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public void dismiss() {
        AndroidUtilities.hideKeyboard(this.w.J);
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        if (this.b == null) {
            TextView textView = new TextView(getContext());
            this.b = textView;
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.j5, this.resourcesProvider);
            this.b.setTextSize(1, 20.0f);
            this.b.setTypeface(AndroidUtilities.bold());
            this.b.setLines(1);
            this.b.setMaxLines(1);
            this.b.setSingleLine(true);
            this.b.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            this.b.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView2 = this.b;
            FrameLayout.LayoutParams h = gb1.h(-1, 36.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f);
            FrameLayout frameLayout = this.c;
            frameLayout.addView(textView2, h);
            ((FrameLayout.LayoutParams) this.w.getLayoutParams()).topMargin = AndroidUtilities.dp(30.0f);
            frameLayout.getLayoutParams().height = AndroidUtilities.dp(94.0f);
        }
        this.b.setText(charSequence);
    }

    public void K() {
    }
}
