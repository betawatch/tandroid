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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class s51 extends org.telegram.ui.ActionBar.f3 {
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
    public final bz N;
    public final boolean O;
    public TextView b;
    public final FrameLayout c;
    public final gh.f1 d;
    public vk0 e;
    public vk0 f;
    public final Drawable h;
    public final View n;
    public AnimatorSet r;
    public final gw0 s;
    public final e00 v;
    public final r51 w;
    public final RectF x;
    public int y;

    static {
        new ch.g("colorProgress", 12);
    }

    public s51(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var, false, false);
        this.x = new RectF();
        this.C = true;
        this.D = true;
        this.E = org.telegram.ui.ActionBar.f6.Ii;
        this.F = org.telegram.ui.ActionBar.f6.i6;
        int i10 = org.telegram.ui.ActionBar.f6.a;
        int i11 = org.telegram.ui.ActionBar.f6.d6;
        this.G = i11;
        this.H = i11;
        this.I = org.telegram.ui.ActionBar.f6.G6;
        int i12 = org.telegram.ui.ActionBar.f6.y6;
        this.J = i12;
        this.K = i12;
        int i13 = org.telegram.ui.ActionBar.f6.Q5;
        this.L = i13;
        this.M = i13;
        this.O = true;
        this.resourcesProvider = b6Var;
        J();
        setDimBehindAlpha(75);
        this.currentAccount = i9;
        this.h = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        q51 C = C(context);
        this.containerView = C;
        C.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        ViewGroup viewGroup = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i14, 0, i14, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        r51 r51Var = new r51(this, context, b6Var);
        this.w = r51Var;
        r51Var.x = true;
        r51Var.d();
        r51Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        frameLayout.addView(r51Var, g7.e6.d(-1, 48.0f, 51, 7.0f, 7.0f, 7.0f, 7.0f));
        e00 e00Var = new e00(context, null);
        this.v = e00Var;
        e00Var.setViewType(6);
        e00Var.w = false;
        e00Var.setUseHeaderOffset(true);
        gw0 gw0Var = new gw0(context, e00Var, 1, null);
        this.s = gw0Var;
        gw0Var.addView(e00Var, 0, g7.e6.d(-1, -1.0f, 0, 0.0f, 2.0f, 0.0f, 0.0f));
        String string = LocaleController.getString(R.string.NoResult);
        dh.u uVar = gw0Var.d;
        uVar.setText(string);
        String string2 = LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2);
        l80 l80Var = gw0Var.e;
        l80Var.setText(string2);
        gw0Var.setVisibility(8);
        gw0Var.setAnimateLayoutChange(true);
        gw0Var.e(true, false);
        int i15 = this.I;
        int i16 = this.J;
        int i17 = this.G;
        uVar.setTag(Integer.valueOf(i15));
        org.telegram.ui.ActionBar.b6 b6Var2 = gw0Var.n;
        uVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(i15, b6Var2));
        l80Var.setTag(Integer.valueOf(i16));
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i16, b6Var2));
        gw0Var.C = i17;
        this.containerView.addView(gw0Var, g7.e6.d(-1, -1.0f, 51, 0.0f, 62.0f, 0.0f, 0.0f));
        gh.f1 f1Var = new gh.f1(this, context, b6Var, 24);
        this.d = f1Var;
        f1Var.setOverScrollMode(2);
        f1Var.setTag(13);
        f1Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        f1Var.setClipToPadding(false);
        f1Var.setHideIfEmpty(false);
        f1Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.f6.v0(this.F, b6Var));
        getContext();
        bz bzVar = new bz(AndroidUtilities.dp(8.0f), 0, f1Var);
        this.N = bzVar;
        bzVar.P = false;
        f1Var.setLayoutManager(bzVar);
        f1Var.setHorizontalScrollBarEnabled(false);
        f1Var.setVerticalScrollBarEnabled(false);
        this.containerView.addView(f1Var, g7.e6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        f1Var.setOnScrollListener(new kn(this, 14));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(58.0f);
        View view = new View(context);
        this.n = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        this.containerView.addView(frameLayout, g7.e6.e(-1, 58, 51));
        G(0.0f);
        f1Var.setEmptyView(gw0Var);
        f1Var.U1 = true;
        f1Var.V1 = 0;
    }

    public q51 C(Context context) {
        return new q51(this, context);
    }

    public abstract void D(MotionEvent motionEvent, fg.g gVar);

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
        this.r.addListener(new u9(24, this, z10));
        this.r.start();
    }

    public abstract void F(String str);

    public final void G(float f10) {
        this.A = f10;
        this.B = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.f6.v0(this.G, this.resourcesProvider), org.telegram.ui.ActionBar.f6.v0(this.H, this.resourcesProvider), f10, 1.0f);
        this.h.setColorFilter(new PorterDuffColorFilter(this.B, PorterDuff.Mode.MULTIPLY));
        fixNavigationBar(this.B);
        int i9 = this.B;
        this.navBarColor = i9;
        gh.f1 f1Var = this.d;
        f1Var.setGlowColor(i9);
        int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.f6.w0(null, this.K, false), org.telegram.ui.ActionBar.f6.w0(null, this.J, false), f10, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.f6.w0(null, this.M, false), org.telegram.ui.ActionBar.f6.w0(null, this.L, false), f10, 1.0f);
        int childCount = f1Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = f1Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.x3) {
                ((org.telegram.ui.Cells.x3) childAt).a(offsetColor, offsetColor);
            } else if (childAt instanceof org.telegram.ui.Cells.e4) {
                ((org.telegram.ui.Cells.e4) childAt).f(this.n.getTag() != null ? this.L : this.M, offsetColor2);
            }
        }
        this.containerView.invalidate();
        f1Var.invalidate();
        this.container.invalidate();
    }

    public void H(int i9) {
        this.d.setTopGlowOffset(i9);
        float f10 = i9;
        this.c.setTranslationY(f10);
        this.s.setTranslationY(f10);
        this.containerView.invalidate();
    }

    public final void I(int i9) {
        if (isShowing()) {
            this.d.getViewTreeObserver().addOnPreDrawListener(new as0(this, i9, 1));
        }
    }

    public void K() {
        gh.f1 f1Var = this.d;
        if (f1Var.getChildCount() <= 0) {
            return;
        }
        f2.q1 K = f1Var.K(0);
        int top = K != null ? K.a.getTop() - AndroidUtilities.dp(8.0f) : 0;
        int i9 = (top <= 0 || K == null || K.b() != 0) ? 0 : top;
        if (top < 0 || K == null || K.b() != 0) {
            E(true);
            top = i9;
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
            textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.j5, this.resourcesProvider));
            this.b.setTextSize(1, 20.0f);
            this.b.setTypeface(AndroidUtilities.bold());
            this.b.setLines(1);
            this.b.setMaxLines(1);
            this.b.setSingleLine(true);
            this.b.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            this.b.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView2 = this.b;
            FrameLayout.LayoutParams d = g7.e6.d(-1, 36.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f);
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
