package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class sc0 extends FrameLayout {
    public final RectF a;
    public boolean b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ ad0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc0(ad0 ad0Var, Activity activity, Activity activity2) {
        super(activity);
        this.d = ad0Var;
        this.c = activity2;
        this.a = new RectF();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ad0 ad0Var = this.d;
        Paint paint = ad0Var.r1;
        int i7 = ad0Var.s1 - ad0Var.s0;
        int L = org.telegram.messenger.g0.L(30.0f) + getMeasuredHeight() + ad0Var.s0;
        float L2 = org.telegram.messenger.g0.L(12.0f);
        int i10 = ad0Var.s0;
        float min = ((float) (i7 + i10)) < L2 ? 1.0f - Math.min(1.0f, ((L2 - i7) - i10) / L2) : 1.0f;
        int i11 = org.telegram.messenger.g0.m;
        int i12 = i7 + i11;
        ad0Var.r0.setBounds(0, i12, getMeasuredWidth(), L - i11);
        ad0Var.r0.draw(canvas);
        if (min != 1.0f) {
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, ad0Var.I0));
            float f10 = ad0Var.t0;
            float f11 = ad0Var.s0 + i12;
            float measuredWidth = getMeasuredWidth() - ad0Var.t0;
            float L3 = org.telegram.messenger.g0.L(24.0f) + ad0Var.s0 + i12;
            RectF rectF = this.a;
            rectF.set(f10, f11, measuredWidth, L3);
            float f12 = L2 * min;
            canvas.drawRoundRect(rectF, f12, f12, paint);
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, ad0Var.I0);
        paint.setColor(Color.argb((int) (ad0Var.l1.getAlpha() * 255.0f), (int) (Color.red(w02) * 0.8f), (int) (Color.green(w02) * 0.8f), (int) (Color.blue(w02) * 0.8f)));
        canvas.drawRect(ad0Var.t0, 0.0f, getMeasuredWidth() - ad0Var.t0, org.telegram.messenger.g0.m, paint);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ad0 ad0Var = this.d;
            if (ad0Var.s1 != 0 && motionEvent.getY() < ad0Var.s1 && ad0Var.l1.getAlpha() == 0.0f) {
                ad0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        ad0 ad0Var = this.d;
        ad0Var.q1 = true;
        super.onLayout(z9, i7, i10, i11, i12);
        ad0Var.q1 = false;
        ad0Var.J0(false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        this.b = true;
        ad0 ad0Var = this.d;
        tc0 tc0Var = ad0Var.j1;
        int i11 = ad0Var.t0;
        setPadding(i11, org.telegram.messenger.g0.m, i11, 0);
        this.b = false;
        int paddingTop = size - getPaddingTop();
        View.MeasureSpec.getSize(i7);
        ((FrameLayout.LayoutParams) ad0Var.m1.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.b = true;
        int L = org.telegram.messenger.g0.L(80.0f);
        n nVar = ad0Var.i1;
        int i12 = ((ad0) nVar.a).v1;
        for (int i13 = 0; i13 < i12; i13++) {
            ViewGroup t6 = nVar.t(this.c, i13);
            t6.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
            L += t6.getMeasuredHeight();
        }
        int i14 = L < paddingTop ? paddingTop - L : paddingTop / 5;
        if (tc0Var.getPaddingTop() != i14) {
            tc0Var.getPaddingTop();
            tc0Var.setPadding(0, i14, 0, 0);
        }
        this.b = false;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.d.I && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.b) {
            return;
        }
        super.requestLayout();
    }
}
