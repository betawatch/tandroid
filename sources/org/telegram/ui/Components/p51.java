package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public class p51 extends FrameLayout {
    public ValueAnimator a;
    public float b;
    public boolean c;
    public Boolean d;
    public final /* synthetic */ r51 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p51(r51 r51Var, Context context) {
        super(context);
        this.e = r51Var;
        this.c = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0, getPaddingTop(), getMeasuredWidth(), getMeasuredHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        canvas.save();
        r51 r51Var = this.e;
        Drawable drawable = r51Var.r1;
        RectF rectF = r51Var.x1;
        int L = org.telegram.messenger.g0.L(6.0f) + (r51Var.y1 - r51Var.t0);
        int L2 = (r51Var.y1 - r51Var.t0) - org.telegram.messenger.g0.L(13.0f);
        int L3 = org.telegram.messenger.g0.L(50.0f) + getMeasuredHeight();
        int i7 = r51Var.t0;
        int i10 = org.telegram.messenger.g0.m;
        int i11 = L2 + i10;
        int i12 = L + i10;
        int i13 = (L3 + i7) - i10;
        float translationY = getTranslationY() + i7 + i11;
        int i14 = org.telegram.messenger.g0.m;
        if (translationY < i14 * 2) {
            int min = (int) Math.min(i14, ((r8 - i11) - r51Var.t0) - getTranslationY());
            i11 -= min;
            i13 += min;
            f10 = 1.0f - Math.min(1.0f, (min * 2) / org.telegram.messenger.g0.m);
        } else {
            f10 = 1.0f;
        }
        float translationY2 = getTranslationY() + r51Var.t0 + i11;
        float f11 = org.telegram.messenger.g0.m;
        int min2 = translationY2 < f11 ? (int) Math.min(f11, ((r7 - i11) - r51Var.t0) - getTranslationY()) : 0;
        drawable.setBounds(0, i11, getMeasuredWidth(), i13);
        drawable.draw(canvas);
        if (!r51Var.N1) {
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.m6.t0.setColor(r51Var.A1);
                rectF.set(r51Var.u0, r51Var.t0 + i11, getMeasuredWidth() - r51Var.u0, org.telegram.messenger.g0.L(24.0f) + r51Var.t0 + i11);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.m6.t0);
            }
            int L4 = org.telegram.messenger.g0.L(36.0f);
            rectF.set((getMeasuredWidth() - L4) / 2, i12, (getMeasuredWidth() + L4) / 2, org.telegram.messenger.g0.L(4.0f) + i12);
            org.telegram.ui.ActionBar.m6.t0.setColor(org.telegram.ui.ActionBar.m6.x0(null, r51Var.D1, false));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.m6.t0);
        }
        if (min2 > 0) {
            org.telegram.ui.ActionBar.m6.t0.setColor(r51Var.A1);
        }
        boolean z10 = min2 > org.telegram.messenger.g0.m / 2;
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z10) {
            boolean z11 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, r51Var.J0)) > 0.721f;
            boolean z12 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.s8, r51Var.J0), 855638016)) > 0.721f;
            this.d = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            org.telegram.messenger.g0.r3(r51Var.getWindow(), z11);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            r51 r51Var = this.e;
            if (y10 < r51Var.y1) {
                r51Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.e.R0();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int L;
        int size = View.MeasureSpec.getSize(i10);
        this.c = true;
        r51 r51Var = this.e;
        di.b1 b1Var = r51Var.o1;
        int i11 = r51Var.u0;
        setPadding(i11, org.telegram.messenger.g0.m, i11, 0);
        this.c = false;
        int paddingTop = size - getPaddingTop();
        if (r51Var.d) {
            L = org.telegram.messenger.g0.L(8.0f);
            r51Var.u0(false);
            int i12 = r51Var.y1;
            if (i12 != 0) {
                float f10 = i12;
                this.b = f10;
                setTranslationY(f10);
                ValueAnimator valueAnimator = this.a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b, 0.0f);
                this.a = ofFloat;
                ofFloat.addUpdateListener(new i51(1, this));
                this.a.setDuration(250L);
                this.a.setInterpolator(org.telegram.ui.ActionBar.i1.w);
                this.a.addListener(new t11(this, 5));
                this.a.start();
            } else if (this.a != null) {
                setTranslationY(this.b);
            }
        } else {
            L = (paddingTop - ((paddingTop / 5) * 3)) + org.telegram.messenger.g0.L(8.0f);
            r51Var.r0 = true;
        }
        if (b1Var.getPaddingTop() != L) {
            this.c = true;
            b1Var.setPadding(0, L, 0, 0);
            this.c = false;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.e.J && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.c) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        invalidate();
    }
}
