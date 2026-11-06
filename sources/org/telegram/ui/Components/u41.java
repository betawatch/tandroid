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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public class u41 extends FrameLayout {
    public ValueAnimator a;
    public float b;
    public boolean c;
    public Boolean d;
    public final /* synthetic */ w41 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u41(w41 w41Var, Context context) {
        super(context);
        this.e = w41Var;
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
        w41 w41Var = this.e;
        Drawable drawable = w41Var.n1;
        RectF rectF = w41Var.t1;
        int L = org.telegram.messenger.g0.L(6.0f) + (w41Var.u1 - w41Var.s0);
        int L2 = (w41Var.u1 - w41Var.s0) - org.telegram.messenger.g0.L(13.0f);
        int L3 = org.telegram.messenger.g0.L(50.0f) + getMeasuredHeight();
        int i7 = w41Var.s0;
        int i10 = org.telegram.messenger.g0.m;
        int i11 = L2 + i10;
        int i12 = L + i10;
        int i13 = (L3 + i7) - i10;
        float translationY = getTranslationY() + i7 + i11;
        int i14 = org.telegram.messenger.g0.m;
        if (translationY < i14 * 2) {
            int min = (int) Math.min(i14, ((r8 - i11) - w41Var.s0) - getTranslationY());
            i11 -= min;
            i13 += min;
            f10 = 1.0f - Math.min(1.0f, (min * 2) / org.telegram.messenger.g0.m);
        } else {
            f10 = 1.0f;
        }
        float translationY2 = getTranslationY() + w41Var.s0 + i11;
        float f11 = org.telegram.messenger.g0.m;
        int min2 = translationY2 < f11 ? (int) Math.min(f11, ((r7 - i11) - w41Var.s0) - getTranslationY()) : 0;
        drawable.setBounds(0, i11, getMeasuredWidth(), i13);
        drawable.draw(canvas);
        if (!w41Var.J1) {
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.k6.t0.setColor(w41Var.w1);
                rectF.set(w41Var.t0, w41Var.s0 + i11, getMeasuredWidth() - w41Var.t0, org.telegram.messenger.g0.L(24.0f) + w41Var.s0 + i11);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.k6.t0);
            }
            int L4 = org.telegram.messenger.g0.L(36.0f);
            rectF.set((getMeasuredWidth() - L4) / 2, i12, (getMeasuredWidth() + L4) / 2, org.telegram.messenger.g0.L(4.0f) + i12);
            org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.x0(null, w41Var.z1, false));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.t0);
        }
        if (min2 > 0) {
            org.telegram.ui.ActionBar.k6.t0.setColor(w41Var.w1);
        }
        boolean z9 = min2 > org.telegram.messenger.g0.m / 2;
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z9) {
            boolean z10 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, w41Var.I0)) > 0.721f;
            boolean z11 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.s8, w41Var.I0), 855638016)) > 0.721f;
            this.d = Boolean.valueOf(z9);
            if (!z9) {
                z10 = z11;
            }
            org.telegram.messenger.g0.s3(w41Var.getWindow(), z10);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            w41 w41Var = this.e;
            if (y10 < w41Var.u1) {
                w41Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.e.Q0();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int L;
        int size = View.MeasureSpec.getSize(i10);
        this.c = true;
        w41 w41Var = this.e;
        bi.q1 q1Var = w41Var.k1;
        int i11 = w41Var.t0;
        int i12 = 0;
        setPadding(i11, org.telegram.messenger.g0.m, i11, 0);
        this.c = false;
        int paddingTop = size - getPaddingTop();
        if (w41Var.d) {
            L = org.telegram.messenger.g0.L(8.0f);
            w41Var.u0(false);
            int i13 = w41Var.u1;
            if (i13 != 0) {
                float f10 = i13;
                this.b = f10;
                setTranslationY(f10);
                ValueAnimator valueAnimator = this.a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b, 0.0f);
                this.a = ofFloat;
                ofFloat.addUpdateListener(new t41(i12, this));
                this.a.setDuration(250L);
                this.a.setInterpolator(org.telegram.ui.ActionBar.i1.w);
                this.a.addListener(new j01(this, 6));
                this.a.start();
            } else if (this.a != null) {
                setTranslationY(this.b);
            }
        } else {
            L = (paddingTop - ((paddingTop / 5) * 3)) + org.telegram.messenger.g0.L(8.0f);
            w41Var.q0 = true;
        }
        if (q1Var.getPaddingTop() != L) {
            this.c = true;
            q1Var.setPadding(0, L, 0, 0);
            this.c = false;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.e.I && super.onTouchEvent(motionEvent);
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
