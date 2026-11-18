package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Property;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class cu extends FrameLayout {
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public VelocityTracker f;
    public boolean h;
    public final /* synthetic */ eu n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu(eu euVar, Context context) {
        super(context);
        this.n = euVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        AnimatorSet animatorSet;
        eu euVar = this.n;
        du[] duVarArr = euVar.f;
        if (!euVar.n) {
            return false;
        }
        if (!euVar.s) {
            if (Math.abs(duVarArr[1].getTranslationX()) < 1.0f) {
                duVarArr[0].setTranslationX(r2.getMeasuredWidth() * (euVar.r ? -1 : 1));
                duVarArr[1].setTranslationX(0.0f);
                animatorSet = euVar.h;
                if (animatorSet != null) {
                }
                euVar.n = false;
            }
            return euVar.n;
        }
        if (Math.abs(duVarArr[0].getTranslationX()) < 1.0f) {
            duVarArr[0].setTranslationX(0.0f);
            duVarArr[1].setTranslationX(duVarArr[0].getMeasuredWidth() * (euVar.r ? 1 : -1));
            animatorSet = euVar.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                euVar.h = null;
            }
            euVar.n = false;
        }
        return euVar.n;
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        eu euVar = this.n;
        du[] duVarArr = euVar.f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = euVar.e;
        int i7 = scrollSlidingTextTabStrip.P.get(scrollSlidingTextTabStrip.n + (z10 ? 1 : -1), -1);
        if (i7 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.c = false;
        this.b = true;
        this.d = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.h2) euVar).actionBar;
        kVar.setEnabled(false);
        euVar.e.setEnabled(false);
        du duVar = duVarArr[1];
        duVar.f = i7;
        duVar.setVisibility(0);
        euVar.r = z10;
        euVar.r0(true);
        if (z10) {
            duVarArr[1].setTranslationX(duVarArr[0].getMeasuredWidth());
            return true;
        }
        duVarArr[1].setTranslationX(-duVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.s4 s4Var;
        org.telegram.ui.ActionBar.s4 s4Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        eu euVar = this.n;
        s4Var = ((org.telegram.ui.ActionBar.h2) euVar).parentLayout;
        if (s4Var != null) {
            s4Var2 = ((org.telegram.ui.ActionBar.h2) euVar).parentLayout;
            kVar = ((org.telegram.ui.ActionBar.h2) euVar).actionBar;
            int measuredHeight = kVar.getMeasuredHeight();
            kVar2 = ((org.telegram.ui.ActionBar.h2) euVar).actionBar;
            ((ActionBarLayout) s4Var2).q(canvas, measuredHeight + ((int) kVar2.getTranslationY()));
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        eu euVar = this.n;
        Paint paint = euVar.d;
        paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.d6, false));
        kVar = ((org.telegram.ui.ActionBar.h2) euVar).actionBar;
        float measuredHeight = kVar.getMeasuredHeight();
        kVar2 = ((org.telegram.ui.ActionBar.h2) euVar).actionBar;
        canvas.drawRect(0.0f, kVar2.getTranslationY() + measuredHeight, getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return a() || this.n.e.I || onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        eu euVar = this.n;
        du[] duVarArr = euVar.f;
        kVar = ((org.telegram.ui.ActionBar.h2) euVar).actionBar;
        measureChildWithMargins(kVar, i7, 0, i10, 0);
        kVar2 = ((org.telegram.ui.ActionBar.h2) euVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        this.h = true;
        for (int i11 = 0; i11 < duVarArr.length; i11++) {
            du duVar = duVarArr[i11];
            if (duVar != null) {
                org.telegram.ui.Components.ck0 ck0Var = duVar.d;
                if (ck0Var != null) {
                    ck0Var.setPadding(0, measuredHeight, 0, 0);
                }
                di.b1 b1Var = duVarArr[i11].e;
                if (b1Var != null) {
                    b1Var.setPadding(0, measuredHeight, 0, 0);
                }
            }
        }
        this.h = false;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar3 = ((org.telegram.ui.ActionBar.h2) euVar).actionBar;
                if (childAt != kVar3) {
                    measureChildWithMargins(childAt, i7, 0, i10, 0);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.s4 s4Var;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.k kVar;
        float measuredWidth;
        boolean z10;
        eu euVar = this.n;
        du[] duVarArr = euVar.f;
        s4Var = ((org.telegram.ui.ActionBar.h2) euVar).parentLayout;
        if (((ActionBarLayout) s4Var).i() || a()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.f == null) {
                this.f = VelocityTracker.obtain();
            }
            this.f.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.b && !this.c) {
            this.a = motionEvent.getPointerId(0);
            this.c = true;
            this.d = (int) motionEvent.getX();
            this.e = (int) motionEvent.getY();
            this.f.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.a) {
            int x10 = (int) (motionEvent.getX() - this.d);
            int abs = Math.abs(((int) motionEvent.getY()) - this.e);
            if (this.b && (((z10 = euVar.r) && x10 > 0) || (!z10 && x10 < 0))) {
                if (!b(motionEvent, x10 < 0)) {
                    this.c = true;
                    this.b = false;
                    duVarArr[0].setTranslationX(0.0f);
                    duVarArr[1].setTranslationX(euVar.r ? duVarArr[0].getMeasuredWidth() : -duVarArr[0].getMeasuredWidth());
                    euVar.e.i(0.0f, duVarArr[1].f);
                }
            }
            if (!this.c || this.b) {
                if (this.b) {
                    duVarArr[0].setTranslationX(x10);
                    if (euVar.r) {
                        duVarArr[1].setTranslationX(duVarArr[0].getMeasuredWidth() + x10);
                    } else {
                        duVarArr[1].setTranslationX(x10 - duVarArr[0].getMeasuredWidth());
                    }
                    euVar.e.i(Math.abs(x10) / duVarArr[0].getMeasuredWidth(), duVarArr[1].f);
                }
            } else if (Math.abs(x10) >= org.telegram.messenger.g0.a1(true, 0.3f) && Math.abs(x10) > abs) {
                b(motionEvent, x10 < 0);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f.computeCurrentVelocity(1000, euVar.w);
            if (motionEvent == null || motionEvent.getAction() == 3) {
                f10 = 0.0f;
                f11 = 0.0f;
            } else {
                f10 = this.f.getXVelocity();
                f11 = this.f.getYVelocity();
                if (!this.b && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                    b(motionEvent, f10 < 0.0f);
                }
            }
            if (this.b) {
                float x11 = duVarArr[0].getX();
                euVar.h = new AnimatorSet();
                boolean z11 = Math.abs(x11) < ((float) duVarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11));
                euVar.s = z11;
                Property property = View.TRANSLATION_X;
                if (z11) {
                    measuredWidth = Math.abs(x11);
                    if (euVar.r) {
                        euVar.h.playTogether(ObjectAnimator.ofFloat(duVarArr[0], (Property<du, Float>) property, 0.0f), ObjectAnimator.ofFloat(duVarArr[1], (Property<du, Float>) property, r1.getMeasuredWidth()));
                    } else {
                        euVar.h.playTogether(ObjectAnimator.ofFloat(duVarArr[0], (Property<du, Float>) property, 0.0f), ObjectAnimator.ofFloat(duVarArr[1], (Property<du, Float>) property, -r1.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = duVarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (euVar.r) {
                        euVar.h.playTogether(ObjectAnimator.ofFloat(duVarArr[0], (Property<du, Float>) property, -r9.getMeasuredWidth()), ObjectAnimator.ofFloat(duVarArr[1], (Property<du, Float>) property, 0.0f));
                    } else {
                        euVar.h.playTogether(ObjectAnimator.ofFloat(duVarArr[0], (Property<du, Float>) property, r9.getMeasuredWidth()), ObjectAnimator.ofFloat(duVarArr[1], (Property<du, Float>) property, 0.0f));
                    }
                }
                euVar.h.setInterpolator(eu.y);
                int measuredWidth2 = getMeasuredWidth();
                float f12 = measuredWidth2 / 2;
                float I = (org.telegram.messenger.g0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f12) + f12;
                euVar.h.setDuration(Math.max(org.telegram.messenger.ks.g2, Math.min(Math.abs(f10) > 0.0f ? Math.round(Math.abs(I / r4) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                euVar.h.addListener(new org.telegram.ui.Cells.x9(this, 24));
                euVar.h.start();
                euVar.n = true;
                this.b = false;
            } else {
                this.c = false;
                kVar = ((org.telegram.ui.ActionBar.h2) euVar).actionBar;
                kVar.setEnabled(true);
                euVar.e.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.f;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f = null;
            }
        }
        return this.b;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }
}
