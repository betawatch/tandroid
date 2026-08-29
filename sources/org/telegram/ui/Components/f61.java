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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class f61 extends org.telegram.ui.ActionBar.f3 {
    public float A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public final kz N;
    public final boolean O;
    public TextView b;
    public final FrameLayout c;
    public final jh.e1 d;
    public il0 e;
    public il0 f;
    public final Drawable h;
    public final View n;
    public AnimatorSet r;
    public final qw0 s;
    public final p00 v;
    public final e61 w;
    public final RectF x;
    public int y;

    static {
        new fh.g("colorProgress", 12);
    }

    public f61(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false, false);
        this.x = new RectF();
        this.C = true;
        this.D = true;
        this.E = org.telegram.ui.ActionBar.g6.Ii;
        this.F = org.telegram.ui.ActionBar.g6.i6;
        int i11 = org.telegram.ui.ActionBar.g6.a;
        int i12 = org.telegram.ui.ActionBar.g6.d6;
        this.G = i12;
        this.H = i12;
        this.I = org.telegram.ui.ActionBar.g6.G6;
        int i13 = org.telegram.ui.ActionBar.g6.y6;
        this.J = i13;
        this.K = i13;
        int i14 = org.telegram.ui.ActionBar.g6.Q5;
        this.L = i14;
        this.M = i14;
        this.O = true;
        this.resourcesProvider = c6Var;
        J();
        setDimBehindAlpha(75);
        this.currentAccount = i10;
        this.h = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        d61 C = C(context);
        this.containerView = C;
        C.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        ViewGroup viewGroup = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i15, 0, i15, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        e61 e61Var = new e61(this, context, c6Var);
        this.w = e61Var;
        e61Var.x = true;
        e61Var.e();
        e61Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        frameLayout.addView(e61Var, i7.f6.d(-1, 48.0f, 51, 7.0f, 7.0f, 7.0f, 7.0f));
        p00 p00Var = new p00(context, null);
        this.v = p00Var;
        p00Var.setViewType(6);
        p00Var.w = false;
        p00Var.setUseHeaderOffset(true);
        qw0 qw0Var = new qw0(context, p00Var, 1, null);
        this.s = qw0Var;
        qw0Var.addView(p00Var, 0, i7.f6.d(-1, -1.0f, 0, 0.0f, 2.0f, 0.0f, 0.0f));
        String string = LocaleController.getString(R.string.NoResult);
        gh.s sVar = qw0Var.d;
        sVar.setText(string);
        String string2 = LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2);
        y80 y80Var = qw0Var.e;
        y80Var.setText(string2);
        qw0Var.setVisibility(8);
        qw0Var.setAnimateLayoutChange(true);
        qw0Var.e(true, false);
        int i16 = this.I;
        int i17 = this.J;
        int i18 = this.G;
        sVar.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.c6 c6Var2 = qw0Var.n;
        sVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i16, c6Var2));
        y80Var.setTag(Integer.valueOf(i17));
        y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i17, c6Var2));
        qw0Var.C = i18;
        this.containerView.addView(qw0Var, i7.f6.d(-1, -1.0f, 51, 0.0f, 62.0f, 0.0f, 0.0f));
        jh.e1 e1Var = new jh.e1(this, context, c6Var, 23);
        this.d = e1Var;
        e1Var.setOverScrollMode(2);
        e1Var.setTag(13);
        e1Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        e1Var.setClipToPadding(false);
        e1Var.setHideIfEmpty(false);
        e1Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.v0(this.F, c6Var));
        getContext();
        kz kzVar = new kz(AndroidUtilities.dp(8.0f), 0, e1Var);
        this.N = kzVar;
        kzVar.P = false;
        e1Var.setLayoutManager(kzVar);
        e1Var.setHorizontalScrollBarEnabled(false);
        e1Var.setVerticalScrollBarEnabled(false);
        this.containerView.addView(e1Var, i7.f6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        e1Var.setOnScrollListener(new h00(this, 10));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(58.0f);
        View view = new View(context);
        this.n = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        this.containerView.addView(frameLayout, i7.f6.e(-1, 58, 51));
        G(0.0f);
        e1Var.setEmptyView(qw0Var);
        e1Var.U1 = true;
        e1Var.V1 = 0;
    }

    public d61 C(Context context) {
        return new d61(this, context);
    }

    public abstract void D(MotionEvent motionEvent, ig.f fVar);

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
        this.r.addListener(new z9(24, this, z10));
        this.r.start();
    }

    public abstract void F(String str);

    public final void G(float f9) {
        this.A = f9;
        this.B = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.v0(this.G, this.resourcesProvider), org.telegram.ui.ActionBar.g6.v0(this.H, this.resourcesProvider), f9, 1.0f);
        this.h.setColorFilter(new PorterDuffColorFilter(this.B, PorterDuff.Mode.MULTIPLY));
        fixNavigationBar(this.B);
        int i10 = this.B;
        this.navBarColor = i10;
        jh.e1 e1Var = this.d;
        e1Var.setGlowColor(i10);
        int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, this.K, false), org.telegram.ui.ActionBar.g6.w0(null, this.J, false), f9, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, this.M, false), org.telegram.ui.ActionBar.g6.w0(null, this.L, false), f9, 1.0f);
        int childCount = e1Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = e1Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.u3) {
                ((org.telegram.ui.Cells.u3) childAt).a(offsetColor, offsetColor);
            } else if (childAt instanceof org.telegram.ui.Cells.c4) {
                ((org.telegram.ui.Cells.c4) childAt).f(this.n.getTag() != null ? this.L : this.M, offsetColor2);
            }
        }
        this.containerView.invalidate();
        e1Var.invalidate();
        this.container.invalidate();
    }

    public void H(int i10) {
        this.d.setTopGlowOffset(i10);
        float f9 = i10;
        this.c.setTranslationY(f9);
        this.s.setTranslationY(f9);
        this.containerView.invalidate();
    }

    public final void I(int i10) {
        if (isShowing()) {
            this.d.getViewTreeObserver().addOnPreDrawListener(new ls0(this, i10, 1));
        }
    }

    public void K() {
        jh.e1 e1Var = this.d;
        if (e1Var.getChildCount() <= 0) {
            return;
        }
        f2.n1 K = e1Var.K(0);
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

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public void dismiss() {
        AndroidUtilities.hideKeyboard(this.w.F);
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        if (this.b == null) {
            TextView textView = new TextView(getContext());
            this.b = textView;
            textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.j5, this.resourcesProvider));
            this.b.setTextSize(1, 20.0f);
            this.b.setTypeface(AndroidUtilities.bold());
            this.b.setLines(1);
            this.b.setMaxLines(1);
            this.b.setSingleLine(true);
            this.b.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            this.b.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView2 = this.b;
            FrameLayout.LayoutParams d = i7.f6.d(-1, 36.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f);
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
