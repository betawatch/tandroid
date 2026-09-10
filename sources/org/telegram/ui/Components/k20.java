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
import org.telegram.ui.gc1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class k20 extends FrameLayout implements le.d, org.telegram.ui.ActionBar.a6 {
    public final AnimationNotificationsLocker E;
    public final ArrayList F;
    public final gc1 G;
    public j20 H;
    public int I;
    public final le.b a;
    public final le.b b;
    public final le.e c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final ImageView e;
    public final ImageView f;
    public final LinearLayout h;
    public boolean n;
    public final bi.t2 r;
    public bh.d s;
    public Drawable v;
    public boolean w;
    public boolean x;
    public Runnable y;

    public k20(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        wr wrVar = wr.h;
        this.a = new le.b(0, this, wrVar, 380L, false);
        this.b = new le.b(1, this, wrVar, 380L, true);
        this.c = new le.e(2, this, ke.a.a, 280L);
        this.E = new AnimationNotificationsLocker();
        this.F = new ArrayList();
        this.d = f6Var;
        bi.t2 t2Var = new bi.t2(this, context, 4);
        this.r = t2Var;
        t2Var.setTextSize(1, 15.0f);
        t2Var.setCursorWidth(1.5f);
        t2Var.setInputType(t2Var.getInputType() | 176);
        t2Var.setSingleLine(true);
        t2Var.setBackground(null);
        t2Var.setVerticalScrollBarEnabled(false);
        t2Var.setHorizontalScrollBarEnabled(false);
        t2Var.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
        t2Var.setClipToPadding(true);
        t2Var.setImeOptions(268435459);
        t2Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        t2Var.addTextChangedListener(new bi.u2(this, 9));
        if (Build.VERSION.SDK_INT >= 35) {
            t2Var.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        addView(t2Var, w7.a6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.outline_search_1_24);
        addView(imageView, w7.a6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.a6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 16, 32.0f, 0.0f, 32.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.miniplayer_close);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new h0(this, 17));
        addView(imageView2, w7.a6.d(24, 24.0f, (LocaleController.isRTL ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        gc1 gc1Var = new gc1(this, getContext(), 7);
        this.G = gc1Var;
        gc1Var.setOrientation(0);
        gc1Var.setVisibility(0);
        addView(gc1Var, w7.a6.d(-2, 32.0f, (LocaleController.isRTL ? 5 : 3) | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        setWillNotDraw(false);
        b();
        e();
    }

    @Override // le.d
    public final void G(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 0) {
            ImageView imageView = this.f;
            h20.d(imageView, f7);
            imageView.setRotation((1.0f - f7) * 90.0f);
        } else if (i10 == 1) {
            h20.d(this.e, f7);
        } else if (i10 == 2) {
            b();
        }
    }

    public final void a(org.telegram.ui.ActionBar.w0 w0Var) {
        this.h.addView(w0Var);
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
        bi.t2 t2Var = this.r;
        rect.set(i10, 0, t2Var.getMeasuredWidth() - max, t2Var.getMeasuredHeight());
        t2Var.setClipBounds(rect);
        t2Var.setPadding(i10, 0, max, 0);
    }

    public final void c() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 >= arrayList.size()) {
                f();
                return;
            }
            if (((fg.q0) arrayList.get(i10)).h) {
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
                if (((fg.q0) arrayList.get(i10)).h) {
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
        bh.d dVar = this.s;
        if (dVar != null) {
            dVar.setBounds(getPaddingLeft() - AndroidUtilities.dp(4.0f), getPaddingTop() - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (getWidth() - getPaddingRight()), AndroidUtilities.dp(4.0f) + (getHeight() - getPaddingBottom()));
            this.s.draw(canvas);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void e() {
        int l1;
        Drawable b02;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        boolean a2 = f6Var != null ? f6Var.a() : org.telegram.ui.ActionBar.j6.I.q();
        if (this.w) {
            b02 = org.telegram.ui.ActionBar.j6.d0(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var));
        } else {
            int dp = AndroidUtilities.dp(20.0f);
            if (this.x) {
                l1 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var);
            } else {
                l1 = org.telegram.ui.ActionBar.j6.l1(a2 ? 0.07f : 0.05f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
            }
            b02 = org.telegram.ui.ActionBar.j6.b0(dp, l1);
        }
        this.v = b02;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        int l12 = org.telegram.ui.ActionBar.j6.l1(0.6f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.e.setColorFilter(l12, mode);
        int l13 = org.telegram.ui.ActionBar.j6.l1(0.6f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        ImageView imageView = this.f;
        imageView.setColorFilter(l13, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var), 1, AndroidUtilities.dp(17.0f)));
        int l14 = org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        bi.t2 t2Var = this.r;
        t2Var.setHintTextColor(l14);
        t2Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        t2Var.setCursorColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Yh, f6Var));
        bh.d dVar = this.s;
        if (dVar != null) {
            dVar.u();
        }
        LinearLayout linearLayout = this.h;
        int childCount = linearLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = linearLayout.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.ActionBar.w0) {
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) childAt;
                if (w0Var.getIconView() != null) {
                    w0Var.getIconView().setColorFilter(org.telegram.ui.ActionBar.j6.l1(0.6f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var)), PorterDuff.Mode.MULTIPLY);
                }
                childAt.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var), 1, AndroidUtilities.dp(17.0f)));
            }
        }
        gc1 gc1Var = this.G;
        int childCount2 = gc1Var.getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            if (gc1Var.getChildAt(i12) instanceof org.telegram.ui.ActionBar.v0) {
                ((org.telegram.ui.ActionBar.v0) gc1Var.getChildAt(i12)).a();
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
        transitionSet.addTransition(new org.telegram.ui.ActionBar.o0(1).setDuration(150L)).addTransition(changeBounds);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) wr.g);
        transitionSet.addListener((Transition.TransitionListener) new i20(this));
        gc1 gc1Var = this.G;
        TransitionManager.beginDelayedTransition(gc1Var, transitionSet);
        int i10 = 0;
        while (i10 < gc1Var.getChildCount()) {
            if (!arrayList2.remove(((org.telegram.ui.ActionBar.v0) gc1Var.getChildAt(i10)).getFilter())) {
                gc1Var.removeViewAt(i10);
                i10--;
            }
            i10++;
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            fg.q0 q0Var = (fg.q0) arrayList2.get(i11);
            q0Var.getClass();
            org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(getContext(), this.d);
            v0Var.r = true;
            v0Var.a();
            v0Var.setData(q0Var);
            v0Var.setOnClickListener(new u10(1, this, v0Var));
            boolean z10 = LocaleController.isRTL;
            gc1Var.addView(v0Var, w7.a6.t(-2, -1, 0, z10 ? 6 : 0, 0, z10 ? 0 : 6, 0));
        }
        int i12 = 0;
        while (i12 < gc1Var.getChildCount()) {
            ((org.telegram.ui.ActionBar.v0) gc1Var.getChildAt(i12)).setExpanded(i12 == this.I);
            i12++;
        }
        gc1Var.setTag(!isEmpty ? 1 : null);
    }

    public final void g(fg.q0 q0Var) {
        org.telegram.ui.gy gyVar;
        if (q0Var.h) {
            this.F.remove(q0Var);
            int i10 = this.I;
            if (i10 < 0 || i10 > r0.size() - 1) {
                this.I = r0.size() - 1;
            }
            f();
            j20 j20Var = this.H;
            if (j20Var == null || (gyVar = ((org.telegram.ui.cy) j20Var).b.C0) == null) {
                return;
            }
            gyVar.Q(false);
        }
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
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
        bh.d dVar = this.s;
        boolean z11 = true;
        if (dVar == null || dVar.j == i11) {
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

    public void setSearchFiltersListener(j20 j20Var) {
        this.H = j20Var;
    }

    public void setupBlurredBackground(bh.d dVar) {
        dVar.p(AndroidUtilities.dp(20.0f));
        dVar.o(AndroidUtilities.dp(4.0f));
        this.s = dVar;
    }

    @Override // le.d
    public final /* synthetic */ void B(float f7, int i10) {
    }
}
