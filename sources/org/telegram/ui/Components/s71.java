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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public abstract class s71 extends org.telegram.ui.ActionBar.h3 {
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
    public final ai.u1 d;
    public lm0 e;
    public lm0 f;
    public final Drawable h;
    public final View n;
    public AnimatorSet r;
    public final wx0 s;
    public final b10 v;
    public final r71 w;
    public final RectF x;
    public int y;

    static {
        new org.telegram.ui.Cells.t8("colorProgress", 10);
    }

    public s71(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(1, context, g6Var, false);
        this.x = new RectF();
        this.G = true;
        this.H = true;
        this.I = org.telegram.ui.ActionBar.k6.Ii;
        this.J = org.telegram.ui.ActionBar.k6.i6;
        int i11 = org.telegram.ui.ActionBar.k6.a;
        int i12 = org.telegram.ui.ActionBar.k6.d6;
        this.K = i12;
        this.L = i12;
        this.M = org.telegram.ui.ActionBar.k6.G6;
        int i13 = org.telegram.ui.ActionBar.k6.y6;
        this.N = i13;
        this.O = i13;
        int i14 = org.telegram.ui.ActionBar.k6.Q5;
        this.P = i14;
        this.Q = i14;
        this.S = true;
        this.resourcesProvider = g6Var;
        K();
        setDimBehindAlpha(75);
        this.currentAccount = i10;
        this.h = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        q71 C = C(context);
        this.containerView = C;
        C.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        ViewGroup viewGroup = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i15, 0, i15, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        r71 r71Var = new r71(this, context, g6Var);
        this.w = r71Var;
        r71Var.x = true;
        r71Var.updateColors();
        r71Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        frameLayout.addView(r71Var, w7.z5.d(-1, 48.0f, 51, 7.0f, 7.0f, 7.0f, 7.0f));
        b10 b10Var = new b10(context, null);
        this.v = b10Var;
        b10Var.setViewType(6);
        b10Var.w = false;
        b10Var.setUseHeaderOffset(true);
        wx0 wx0Var = new wx0(context, b10Var, 1, null);
        this.s = wx0Var;
        wx0Var.addView(b10Var, 0, w7.z5.d(-1, -1.0f, 0, 0.0f, 2.0f, 0.0f, 0.0f));
        String string = LocaleController.getString(R.string.NoResult);
        wh.n nVar = wx0Var.d;
        nVar.setText(string);
        String string2 = LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2);
        y90 y90Var = wx0Var.e;
        y90Var.setText(string2);
        wx0Var.setVisibility(8);
        wx0Var.setAnimateLayoutChange(true);
        wx0Var.e(true, false);
        int i16 = this.M;
        int i17 = this.N;
        int i18 = this.K;
        nVar.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.g6 g6Var2 = wx0Var.n;
        org.telegram.ui.ActionBar.r6.W(nVar, i16, g6Var2);
        y90Var.setTag(Integer.valueOf(i17));
        org.telegram.ui.ActionBar.r6.W(y90Var, i17, g6Var2);
        wx0Var.G = i18;
        this.containerView.addView(wx0Var, w7.z5.d(-1, -1.0f, 51, 0.0f, 62.0f, 0.0f, 0.0f));
        ai.u1 u1Var = new ai.u1(this, context, g6Var, 25);
        this.d = u1Var;
        u1Var.setOverScrollMode(2);
        u1Var.setTag(13);
        u1Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        u1Var.setClipToPadding(false);
        u1Var.setHideIfEmpty(false);
        org.telegram.ui.ActionBar.r6.m(u1Var, 20, this.J, g6Var);
        getContext();
        yz yzVar = new yz(AndroidUtilities.dp(8.0f), 0, u1Var);
        this.R = yzVar;
        yzVar.P = false;
        u1Var.setLayoutManager(yzVar);
        u1Var.setHorizontalScrollBarEnabled(false);
        u1Var.setVerticalScrollBarEnabled(false);
        this.containerView.addView(u1Var, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        u1Var.setOnScrollListener(new kv(this, 12));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(58.0f);
        View view = new View(context);
        this.n = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        this.containerView.addView(frameLayout, w7.z5.e(-1, 58, 51));
        G(0.0f);
        u1Var.setEmptyView(wx0Var);
        u1Var.W1 = true;
        u1Var.X1 = 0;
    }

    public q71 C(Context context) {
        return new q71(this, context);
    }

    public abstract void D(MotionEvent motionEvent, ei.e2 e2Var);

    public final void E(boolean z10) {
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
        this.r.addListener(new org.telegram.ui.ho(25, this, z10));
        this.r.start();
    }

    public abstract void F(String str);

    public final void G(float f7) {
        this.E = f7;
        this.F = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.w0(this.K, this.resourcesProvider), org.telegram.ui.ActionBar.k6.w0(this.L, this.resourcesProvider), f7, 1.0f);
        this.h.setColorFilter(new PorterDuffColorFilter(this.F, PorterDuff.Mode.MULTIPLY));
        fixNavigationBar(this.F);
        int i10 = this.F;
        this.navBarColor = i10;
        ai.u1 u1Var = this.d;
        u1Var.setGlowColor(i10);
        int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.x0(null, this.O, false), org.telegram.ui.ActionBar.k6.x0(null, this.N, false), f7, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.x0(null, this.Q, false), org.telegram.ui.ActionBar.k6.x0(null, this.P, false), f7, 1.0f);
        int childCount = u1Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = u1Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.w3) {
                ((org.telegram.ui.Cells.w3) childAt).a(offsetColor, offsetColor);
            } else if (childAt instanceof org.telegram.ui.Cells.d4) {
                ((org.telegram.ui.Cells.d4) childAt).f(this.n.getTag() != null ? this.P : this.Q, offsetColor2);
            }
        }
        this.containerView.invalidate();
        u1Var.invalidate();
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
            this.d.getViewTreeObserver().addOnPreDrawListener(new tt0(this, i10, 1));
        }
    }

    public void L() {
        ai.u1 u1Var = this.d;
        if (u1Var.getChildCount() <= 0) {
            return;
        }
        s4.b1 K = u1Var.K(0);
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
            I(top);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public void dismiss() {
        AndroidUtilities.hideKeyboard(this.w.J);
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        if (this.b == null) {
            TextView textView = new TextView(getContext());
            this.b = textView;
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.j5, this.resourcesProvider);
            this.b.setTextSize(1, 20.0f);
            this.b.setTypeface(AndroidUtilities.bold());
            this.b.setLines(1);
            this.b.setMaxLines(1);
            this.b.setSingleLine(true);
            this.b.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            this.b.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView2 = this.b;
            FrameLayout.LayoutParams d = w7.z5.d(-1, 36.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f);
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
