package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.dc1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class s20 extends FrameLayout implements me.d, org.telegram.ui.ActionBar.z5 {
    public final AnimationNotificationsLocker E;
    public final ArrayList F;
    public final dc1 G;
    public r20 H;
    public int I;
    public final me.b a;
    public final me.b b;
    public final me.e c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final ImageView e;
    public final ImageView f;
    public final LinearLayout h;
    public boolean n;
    public final ci.g2 r;
    public ch.d s;
    public Drawable v;
    public boolean w;
    public boolean x;
    public Runnable y;

    public s20(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        hs hsVar = hs.h;
        this.a = new me.b(0, this, hsVar, 380L, false);
        this.b = new me.b(1, this, hsVar, 380L, true);
        this.c = new me.e(2, this, le.a.a, 280L);
        this.E = new AnimationNotificationsLocker();
        this.F = new ArrayList();
        this.d = e6Var;
        ci.g2 g2Var = new ci.g2(this, context, 4);
        this.r = g2Var;
        g2Var.setTextSize(1, 15.0f);
        g2Var.setCursorWidth(1.5f);
        g2Var.setInputType(g2Var.getInputType() | 176);
        g2Var.setSingleLine(true);
        g2Var.setBackground(null);
        g2Var.setVerticalScrollBarEnabled(false);
        g2Var.setHorizontalScrollBarEnabled(false);
        g2Var.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
        g2Var.setClipToPadding(true);
        g2Var.setImeOptions(268435459);
        g2Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        g2Var.addTextChangedListener(new ci.h2(this, 9));
        if (Build.VERSION.SDK_INT >= 35) {
            g2Var.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        addView(g2Var, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 119));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.outline_search_1_24);
        addView(imageView, w7.x5.a(24.0f, 12.0f, 0.0f, 12.0f, 0.0f, 24, (LocaleController.isRTL ? 5 : 3) | 16));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.x5.a(-1.0f, 32.0f, 0.0f, 32.0f, 0.0f, -2, (LocaleController.isRTL ? 3 : 5) | 16));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.miniplayer_close);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new f0(this, 16));
        addView(imageView2, w7.x5.a(24.0f, 12.0f, 0.0f, 12.0f, 0.0f, 24, (LocaleController.isRTL ? 3 : 5) | 16));
        dc1 dc1Var = new dc1(this, getContext(), 7);
        this.G = dc1Var;
        dc1Var.setOrientation(0);
        dc1Var.setVisibility(0);
        addView(dc1Var, w7.x5.a(32.0f, 4.0f, 0.0f, 4.0f, 0.0f, -2, (LocaleController.isRTL ? 5 : 3) | 16));
        setWillNotDraw(false);
        b();
        e();
    }

    public final void a(org.telegram.ui.ActionBar.v0 v0Var) {
        this.h.addView(v0Var);
    }

    public final void b() {
        int max = Math.max(AndroidUtilities.dp(6.0f) + ((int) this.c.e), AndroidUtilities.dp(48.0f));
        int measuredWidth = this.h.getMeasuredWidth() + AndroidUtilities.dp(48.0f);
        boolean z10 = LocaleController.isRTL;
        int i10 = z10 ? measuredWidth : max;
        if (!z10) {
            max = measuredWidth;
        }
        Rect rect = AndroidUtilities.rectTmp2;
        ci.g2 g2Var = this.r;
        rect.set(i10, 0, g2Var.getMeasuredWidth() - max, g2Var.getMeasuredHeight());
        g2Var.setClipBounds(rect);
        g2Var.setPadding(i10, 0, max, 0);
    }

    public final void c() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 >= arrayList.size()) {
                f();
                return;
            }
            if (((gg.p0) arrayList.get(i10)).h) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
    }

    public final boolean d() {
        ArrayList arrayList = this.F;
        if (!arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((gg.p0) arrayList.get(i10)).h) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Drawable drawable = this.v;
        if (drawable != null) {
            drawable.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.v.draw(canvas);
        }
        ch.d dVar = this.s;
        if (dVar != null) {
            dVar.setBounds(getPaddingLeft() - AndroidUtilities.dp(4.0f), getPaddingTop() - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (getWidth() - getPaddingRight()), AndroidUtilities.dp(4.0f) + (getHeight() - getPaddingBottom()));
            this.s.draw(canvas);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void e() {
        int m12;
        Drawable c02;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        boolean a2 = e6Var != null ? e6Var.a() : org.telegram.ui.ActionBar.i6.I.q();
        if (this.w) {
            c02 = org.telegram.ui.ActionBar.i6.e0(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d6, e6Var));
        } else {
            int dp = AndroidUtilities.dp(20.0f);
            if (this.x) {
                m12 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d6, e6Var);
            } else {
                m12 = org.telegram.ui.ActionBar.i6.m1(a2 ? 0.07f : 0.05f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
            }
            c02 = org.telegram.ui.ActionBar.i6.c0(dp, m12);
        }
        this.v = c02;
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        int m13 = org.telegram.ui.ActionBar.i6.m1(0.6f, org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.e.setColorFilter(m13, mode);
        int m14 = org.telegram.ui.ActionBar.i6.m1(0.6f, org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        ImageView imageView = this.f;
        imageView.setColorFilter(m14, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.i6, e6Var), 1, AndroidUtilities.dp(17.0f)));
        int m15 = org.telegram.ui.ActionBar.i6.m1(0.5f, org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        ci.g2 g2Var = this.r;
        g2Var.setHintTextColor(m15);
        g2Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        g2Var.setCursorColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Yh, e6Var));
        ch.d dVar = this.s;
        if (dVar != null) {
            dVar.v();
        }
        LinearLayout linearLayout = this.h;
        int childCount = linearLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = linearLayout.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.ActionBar.v0) {
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) childAt;
                if (v0Var.getIconView() != null) {
                    v0Var.getIconView().setColorFilter(org.telegram.ui.ActionBar.i6.m1(0.6f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var)), PorterDuff.Mode.MULTIPLY);
                }
                childAt.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.i6, e6Var), 1, AndroidUtilities.dp(17.0f)));
            }
        }
        dc1 dc1Var = this.G;
        int childCount2 = dc1Var.getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            if (dc1Var.getChildAt(i12) instanceof org.telegram.ui.ActionBar.u0) {
                ((org.telegram.ui.ActionBar.u0) dc1Var.getChildAt(i12)).a();
            }
        }
        invalidate();
    }

    public final void f() {
        ArrayList arrayList = this.F;
        boolean isEmpty = arrayList.isEmpty();
        this.b.a(isEmpty, true);
        ArrayList arrayList2 = new ArrayList(arrayList);
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.n0(1).setDuration(150L)).addTransition(changeBounds);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) hs.g);
        transitionSet.addListener((Transition.TransitionListener) new q20(this));
        dc1 dc1Var = this.G;
        TransitionManager.beginDelayedTransition(dc1Var, transitionSet);
        int i10 = 0;
        while (i10 < dc1Var.getChildCount()) {
            if (!arrayList2.remove(((org.telegram.ui.ActionBar.u0) dc1Var.getChildAt(i10)).getFilter())) {
                dc1Var.removeViewAt(i10);
                i10--;
            }
            i10++;
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            gg.p0 p0Var = (gg.p0) arrayList2.get(i11);
            p0Var.getClass();
            org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(getContext(), this.d);
            u0Var.r = true;
            u0Var.a();
            u0Var.setData(p0Var);
            u0Var.setOnClickListener(new ut(4, this, u0Var));
            boolean z10 = LocaleController.isRTL;
            dc1Var.addView(u0Var, w7.x5.t(-2, -1, 0, z10 ? 6 : 0, 0, z10 ? 0 : 6, 0));
        }
        int i12 = 0;
        while (i12 < dc1Var.getChildCount()) {
            ((org.telegram.ui.ActionBar.u0) dc1Var.getChildAt(i12)).setExpanded(i12 == this.I);
            i12++;
        }
        dc1Var.setTag(!isEmpty ? 1 : null);
    }

    public final void g(gg.p0 p0Var) {
        org.telegram.ui.dy dyVar;
        if (p0Var.h) {
            this.F.remove(p0Var);
            int i10 = this.I;
            if (i10 < 0 || i10 > r0.size() - 1) {
                this.I = r0.size() - 1;
            }
            f();
            r20 r20Var = this.H;
            if (r20Var == null || (dyVar = ((org.telegram.ui.yx) r20Var).b.C0) == null) {
                return;
            }
            dyVar.Q(false);
        }
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // me.d
    public final void n(int i10, float f7, float f10, me.e eVar) {
        if (i10 == 0) {
            ImageView imageView = this.f;
            p20.d(imageView, f7);
            imageView.setRotation((1.0f - f7) * 90.0f);
        } else if (i10 == 1) {
            p20.d(this.e, f7);
        } else if (i10 == 2) {
            b();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        b();
    }

    public void setBlurredBackgroundVisibility(float f7) {
        boolean z10;
        int i10;
        int i11 = (int) (f7 * 255.0f);
        ch.d dVar = this.s;
        boolean z11 = true;
        if (dVar == null || dVar.l == i11) {
            z10 = false;
        } else {
            dVar.setAlpha(i11);
            z10 = true;
        }
        Drawable drawable = this.v;
        if (drawable == null || drawable.getAlpha() == (i10 = 255 - i11)) {
            z11 = z10;
        } else {
            this.v.setAlpha(i10);
        }
        if (z11) {
            invalidate();
        }
    }

    public void setCloseButtonOnClickListener(Runnable runnable) {
        this.y = runnable;
    }

    public void setCloseButtonVisible(boolean z10) {
        this.n = z10;
        this.a.a(z10 || this.r.length() > 0, true);
    }

    public void setSearchFiltersListener(r20 r20Var) {
        this.H = r20Var;
    }

    public void setupBlurredBackground(ch.d dVar) {
        dVar.q(AndroidUtilities.dp(20.0f));
        dVar.p(AndroidUtilities.dp(4.0f));
        this.s = dVar;
    }

    @Override // me.d
    public final /* synthetic */ void A(float f7, int i10) {
    }
}
