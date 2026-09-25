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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public abstract class b71 extends org.telegram.ui.ActionBar.e3 {
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
    public final qz R;
    public final boolean S;
    public TextView b;
    public final FrameLayout c;
    public final ai.w0 d;
    public vl0 e;
    public vl0 f;
    public final Drawable h;
    public final View n;
    public AnimatorSet r;
    public final ix0 s;
    public final u00 v;
    public final a71 w;
    public final RectF x;
    public int y;

    static {
        new org.telegram.ui.Cells.t8("colorProgress", 10);
    }

    public b71(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, false);
        this.x = new RectF();
        this.G = true;
        this.H = true;
        this.I = org.telegram.ui.ActionBar.h6.Ii;
        this.J = org.telegram.ui.ActionBar.h6.i6;
        int i11 = org.telegram.ui.ActionBar.h6.a;
        int i12 = org.telegram.ui.ActionBar.h6.d6;
        this.K = i12;
        this.L = i12;
        this.M = org.telegram.ui.ActionBar.h6.G6;
        int i13 = org.telegram.ui.ActionBar.h6.y6;
        this.N = i13;
        this.O = i13;
        int i14 = org.telegram.ui.ActionBar.h6.Q5;
        this.P = i14;
        this.Q = i14;
        this.S = true;
        this.resourcesProvider = d6Var;
        K();
        setDimBehindAlpha(75);
        this.currentAccount = i10;
        this.h = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        z61 B = B(context);
        this.containerView = B;
        B.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        ViewGroup viewGroup = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i15, 0, i15, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        a71 a71Var = new a71(this, context, d6Var);
        this.w = a71Var;
        a71Var.x = true;
        a71Var.e();
        a71Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        frameLayout.addView(a71Var, w7.y5.d(-1, 48.0f, 51, 7.0f, 7.0f, 7.0f, 7.0f));
        u00 u00Var = new u00(context, null);
        this.v = u00Var;
        u00Var.setViewType(6);
        u00Var.w = false;
        u00Var.setUseHeaderOffset(true);
        ix0 ix0Var = new ix0(context, u00Var, 1, null);
        this.s = ix0Var;
        ix0Var.addView(u00Var, 0, w7.y5.d(-1, -1.0f, 0, 0.0f, 2.0f, 0.0f, 0.0f));
        String string = LocaleController.getString(R.string.NoResult);
        vh.n nVar = ix0Var.d;
        nVar.setText(string);
        String string2 = LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2);
        n90 n90Var = ix0Var.e;
        n90Var.setText(string2);
        ix0Var.setVisibility(8);
        ix0Var.setAnimateLayoutChange(true);
        ix0Var.e(true, false);
        int i16 = this.M;
        int i17 = this.N;
        int i18 = this.K;
        nVar.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.d6 d6Var2 = ix0Var.n;
        nVar.setTextColor(org.telegram.ui.ActionBar.h6.v0(i16, d6Var2));
        n90Var.setTag(Integer.valueOf(i17));
        n90Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(i17, d6Var2));
        ix0Var.G = i18;
        this.containerView.addView(ix0Var, w7.y5.d(-1, -1.0f, 51, 0.0f, 62.0f, 0.0f, 0.0f));
        ai.w0 w0Var = new ai.w0(this, context, d6Var, 24);
        this.d = w0Var;
        w0Var.setOverScrollMode(2);
        w0Var.setTag(13);
        w0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        w0Var.setClipToPadding(false);
        w0Var.setHideIfEmpty(false);
        w0Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.v0(this.J, d6Var));
        getContext();
        qz qzVar = new qz(AndroidUtilities.dp(8.0f), 0, w0Var);
        this.R = qzVar;
        qzVar.P = false;
        w0Var.setLayoutManager(qzVar);
        w0Var.setHorizontalScrollBarEnabled(false);
        w0Var.setVerticalScrollBarEnabled(false);
        this.containerView.addView(w0Var, w7.y5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        w0Var.setOnScrollListener(new ug0(this, 7));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(58.0f);
        View view = new View(context);
        this.n = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        this.containerView.addView(frameLayout, w7.y5.e(-1, 58, 51));
        H(0.0f);
        w0Var.setEmptyView(ix0Var);
        w0Var.Y1 = true;
        w0Var.Z1 = 0;
    }

    public z61 B(Context context) {
        return new z61(this, context);
    }

    public abstract void E(MotionEvent motionEvent, ci.h2 h2Var);

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
        this.r.addListener(new ca(24, this, z10));
        this.r.start();
    }

    public abstract void G(String str);

    public final void H(float f7) {
        this.E = f7;
        this.F = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.v0(this.K, this.resourcesProvider), org.telegram.ui.ActionBar.h6.v0(this.L, this.resourcesProvider), f7, 1.0f);
        this.h.setColorFilter(new PorterDuffColorFilter(this.F, PorterDuff.Mode.MULTIPLY));
        fixNavigationBar(this.F);
        int i10 = this.F;
        this.navBarColor = i10;
        ai.w0 w0Var = this.d;
        w0Var.setGlowColor(i10);
        int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.w0(null, this.O, false), org.telegram.ui.ActionBar.h6.w0(null, this.N, false), f7, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.w0(null, this.Q, false), org.telegram.ui.ActionBar.h6.w0(null, this.P, false), f7, 1.0f);
        int childCount = w0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = w0Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.x3) {
                ((org.telegram.ui.Cells.x3) childAt).a(offsetColor, offsetColor);
            } else if (childAt instanceof org.telegram.ui.Cells.e4) {
                ((org.telegram.ui.Cells.e4) childAt).f(this.n.getTag() != null ? this.P : this.Q, offsetColor2);
            }
        }
        this.containerView.invalidate();
        w0Var.invalidate();
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
            this.d.getViewTreeObserver().addOnPreDrawListener(new ft0(this, i10, 1));
        }
    }

    public void L() {
        ai.w0 w0Var = this.d;
        if (w0Var.getChildCount() <= 0) {
            return;
        }
        s4.c1 K = w0Var.K(0);
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
            textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.j5, this.resourcesProvider));
            this.b.setTextSize(1, 20.0f);
            this.b.setTypeface(AndroidUtilities.bold());
            this.b.setLines(1);
            this.b.setMaxLines(1);
            this.b.setSingleLine(true);
            this.b.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            this.b.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView2 = this.b;
            FrameLayout.LayoutParams d = w7.y5.d(-1, 36.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f);
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
