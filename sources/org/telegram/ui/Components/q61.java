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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public abstract class q61 extends org.telegram.ui.ActionBar.g3 {
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
    public final pz O;
    public final boolean P;
    public TextView b;
    public final FrameLayout c;
    public final lh.e1 d;
    public rl0 e;
    public rl0 f;
    public final Drawable h;
    public final View n;
    public AnimatorSet r;
    public final zw0 s;
    public final t00 v;
    public final p61 w;
    public final RectF x;
    public int y;

    static {
        new hh.g("colorProgress", 12);
    }

    public q61(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, false, false);
        this.x = new RectF();
        this.D = true;
        this.E = true;
        this.F = org.telegram.ui.ActionBar.j6.Ii;
        this.G = org.telegram.ui.ActionBar.j6.i6;
        int i11 = org.telegram.ui.ActionBar.j6.a;
        int i12 = org.telegram.ui.ActionBar.j6.d6;
        this.H = i12;
        this.I = i12;
        this.J = org.telegram.ui.ActionBar.j6.G6;
        int i13 = org.telegram.ui.ActionBar.j6.y6;
        this.K = i13;
        this.L = i13;
        int i14 = org.telegram.ui.ActionBar.j6.Q5;
        this.M = i14;
        this.N = i14;
        this.P = true;
        this.resourcesProvider = f6Var;
        J();
        setDimBehindAlpha(75);
        this.currentAccount = i10;
        this.h = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        o61 C = C(context);
        this.containerView = C;
        C.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        ViewGroup viewGroup = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i15, 0, i15, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        p61 p61Var = new p61(this, context, f6Var);
        this.w = p61Var;
        p61Var.x = true;
        p61Var.e();
        p61Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        frameLayout.addView(p61Var, k7.b6.d(-1, 48.0f, 51, 7.0f, 7.0f, 7.0f, 7.0f));
        t00 t00Var = new t00(context, null);
        this.v = t00Var;
        t00Var.setViewType(6);
        t00Var.w = false;
        t00Var.setUseHeaderOffset(true);
        zw0 zw0Var = new zw0(context, t00Var, 1, null);
        this.s = zw0Var;
        zw0Var.addView(t00Var, 0, k7.b6.d(-1, -1.0f, 0, 0.0f, 2.0f, 0.0f, 0.0f));
        String string = LocaleController.getString(R.string.NoResult);
        ih.s sVar = zw0Var.d;
        sVar.setText(string);
        String string2 = LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2);
        e90 e90Var = zw0Var.e;
        e90Var.setText(string2);
        zw0Var.setVisibility(8);
        zw0Var.setAnimateLayoutChange(true);
        zw0Var.e(true, false);
        int i16 = this.J;
        int i17 = this.K;
        int i18 = this.H;
        sVar.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.f6 f6Var2 = zw0Var.n;
        sVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i16, f6Var2));
        e90Var.setTag(Integer.valueOf(i17));
        e90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i17, f6Var2));
        zw0Var.D = i18;
        this.containerView.addView(zw0Var, k7.b6.d(-1, -1.0f, 51, 0.0f, 62.0f, 0.0f, 0.0f));
        lh.e1 e1Var = new lh.e1(this, context, f6Var, 22);
        this.d = e1Var;
        e1Var.setOverScrollMode(2);
        e1Var.setTag(13);
        e1Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        e1Var.setClipToPadding(false);
        e1Var.setHideIfEmpty(false);
        e1Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(this.G, f6Var));
        getContext();
        pz pzVar = new pz(AndroidUtilities.dp(8.0f), 0, e1Var);
        this.O = pzVar;
        pzVar.P = false;
        e1Var.setLayoutManager(pzVar);
        e1Var.setHorizontalScrollBarEnabled(false);
        e1Var.setVerticalScrollBarEnabled(false);
        this.containerView.addView(e1Var, k7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        e1Var.setOnScrollListener(new lb0(this, 8));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(58.0f);
        View view = new View(context);
        this.n = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        this.containerView.addView(frameLayout, k7.b6.e(-1, 58, 51));
        G(0.0f);
        e1Var.setEmptyView(zw0Var);
        e1Var.V1 = true;
        e1Var.W1 = 0;
    }

    public o61 C(Context context) {
        return new o61(this, context);
    }

    public abstract void D(MotionEvent motionEvent, kg.f fVar);

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
        this.r.addListener(new l00(16, this, z4));
        this.r.start();
    }

    public abstract void F(String str);

    public final void G(float f10) {
        this.B = f10;
        this.C = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.v0(this.H, this.resourcesProvider), org.telegram.ui.ActionBar.j6.v0(this.I, this.resourcesProvider), f10, 1.0f);
        this.h.setColorFilter(new PorterDuffColorFilter(this.C, PorterDuff.Mode.MULTIPLY));
        fixNavigationBar(this.C);
        int i10 = this.C;
        this.navBarColor = i10;
        lh.e1 e1Var = this.d;
        e1Var.setGlowColor(i10);
        int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, this.L, false), org.telegram.ui.ActionBar.j6.w0(null, this.K, false), f10, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, this.N, false), org.telegram.ui.ActionBar.j6.w0(null, this.M, false), f10, 1.0f);
        int childCount = e1Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = e1Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.w3) {
                ((org.telegram.ui.Cells.w3) childAt).a(offsetColor, offsetColor);
            } else if (childAt instanceof org.telegram.ui.Cells.e4) {
                ((org.telegram.ui.Cells.e4) childAt).f(this.n.getTag() != null ? this.M : this.N, offsetColor2);
            }
        }
        this.containerView.invalidate();
        e1Var.invalidate();
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
        lh.e1 e1Var = this.d;
        if (e1Var.getChildCount() <= 0) {
            return;
        }
        f2.l1 K = e1Var.K(0);
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

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public void dismiss() {
        AndroidUtilities.hideKeyboard(this.w.G);
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
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
            FrameLayout.LayoutParams d = k7.b6.d(-1, 36.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f);
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
