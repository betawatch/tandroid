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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class c51 extends FrameLayout {
    public ValueAnimator a;
    public float b;
    public boolean c;
    public Boolean d;
    public final /* synthetic */ e51 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c51(e51 e51Var, Context context) {
        super(context);
        this.e = e51Var;
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
        e51 e51Var = this.e;
        Drawable drawable = e51Var.r1;
        RectF rectF = e51Var.x1;
        int L = org.telegram.messenger.g0.L(6.0f) + (e51Var.y1 - e51Var.t0);
        int L2 = (e51Var.y1 - e51Var.t0) - org.telegram.messenger.g0.L(13.0f);
        int L3 = org.telegram.messenger.g0.L(50.0f) + getMeasuredHeight();
        int i7 = e51Var.t0;
        int i10 = org.telegram.messenger.g0.m;
        int i11 = L2 + i10;
        int i12 = L + i10;
        int i13 = (L3 + i7) - i10;
        float translationY = getTranslationY() + i7 + i11;
        int i14 = org.telegram.messenger.g0.m;
        if (translationY < i14 * 2) {
            int min = (int) Math.min(i14, ((r8 - i11) - e51Var.t0) - getTranslationY());
            i11 -= min;
            i13 += min;
            f10 = 1.0f - Math.min(1.0f, (min * 2) / org.telegram.messenger.g0.m);
        } else {
            f10 = 1.0f;
        }
        float translationY2 = getTranslationY() + e51Var.t0 + i11;
        float f11 = org.telegram.messenger.g0.m;
        int min2 = translationY2 < f11 ? (int) Math.min(f11, ((r7 - i11) - e51Var.t0) - getTranslationY()) : 0;
        drawable.setBounds(0, i11, getMeasuredWidth(), i13);
        drawable.draw(canvas);
        if (!e51Var.N1) {
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.j6.t0.setColor(e51Var.A1);
                rectF.set(e51Var.u0, e51Var.t0 + i11, getMeasuredWidth() - e51Var.u0, org.telegram.messenger.g0.L(24.0f) + e51Var.t0 + i11);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.j6.t0);
            }
            int L4 = org.telegram.messenger.g0.L(36.0f);
            rectF.set((getMeasuredWidth() - L4) / 2, i12, (getMeasuredWidth() + L4) / 2, org.telegram.messenger.g0.L(4.0f) + i12);
            org.telegram.ui.ActionBar.j6.t0.setColor(org.telegram.ui.ActionBar.j6.x0(null, e51Var.D1, false));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.j6.t0);
        }
        if (min2 > 0) {
            org.telegram.ui.ActionBar.j6.t0.setColor(e51Var.A1);
        }
        boolean z10 = min2 > org.telegram.messenger.g0.m / 2;
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z10) {
            boolean z11 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, e51Var.J0)) > 0.721f;
            boolean z12 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.s8, e51Var.J0), 855638016)) > 0.721f;
            this.d = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            org.telegram.messenger.g0.s3(e51Var.getWindow(), z11);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            e51 e51Var = this.e;
            if (y10 < e51Var.y1) {
                e51Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.e.Q0();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int L;
        int size = View.MeasureSpec.getSize(i10);
        this.c = true;
        e51 e51Var = this.e;
        di.c1 c1Var = e51Var.o1;
        int i11 = e51Var.u0;
        setPadding(i11, org.telegram.messenger.g0.m, i11, 0);
        this.c = false;
        int paddingTop = size - getPaddingTop();
        if (e51Var.d) {
            L = org.telegram.messenger.g0.L(8.0f);
            e51Var.u0(false);
            int i12 = e51Var.y1;
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
                ofFloat.addUpdateListener(new f60(this, 29));
                this.a.setDuration(250L);
                this.a.setInterpolator(org.telegram.ui.ActionBar.i1.w);
                this.a.addListener(new i11(this, 5));
                this.a.start();
            } else if (this.a != null) {
                setTranslationY(this.b);
            }
        } else {
            L = (paddingTop - ((paddingTop / 5) * 3)) + org.telegram.messenger.g0.L(8.0f);
            e51Var.r0 = true;
        }
        if (c1Var.getPaddingTop() != L) {
            this.c = true;
            c1Var.setPadding(0, L, 0, 0);
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
