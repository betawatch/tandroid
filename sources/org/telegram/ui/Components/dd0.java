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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class dd0 extends FrameLayout {
    public final RectF a;
    public boolean b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ ld0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd0(ld0 ld0Var, Activity activity, Activity activity2) {
        super(activity);
        this.d = ld0Var;
        this.c = activity2;
        this.a = new RectF();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ld0 ld0Var = this.d;
        Paint paint = ld0Var.v1;
        int i7 = ld0Var.w1 - ld0Var.t0;
        int L = org.telegram.messenger.g0.L(30.0f) + getMeasuredHeight() + ld0Var.t0;
        float L2 = org.telegram.messenger.g0.L(12.0f);
        int i10 = ld0Var.t0;
        float min = ((float) (i7 + i10)) < L2 ? 1.0f - Math.min(1.0f, ((L2 - i7) - i10) / L2) : 1.0f;
        int i11 = org.telegram.messenger.g0.m;
        int i12 = i7 + i11;
        ld0Var.s0.setBounds(0, i12, getMeasuredWidth(), L - i11);
        ld0Var.s0.draw(canvas);
        if (min != 1.0f) {
            paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, ld0Var.J0));
            float f10 = ld0Var.u0;
            float f11 = ld0Var.t0 + i12;
            float measuredWidth = getMeasuredWidth() - ld0Var.u0;
            float L3 = org.telegram.messenger.g0.L(24.0f) + ld0Var.t0 + i12;
            RectF rectF = this.a;
            rectF.set(f10, f11, measuredWidth, L3);
            float f12 = L2 * min;
            canvas.drawRoundRect(rectF, f12, f12, paint);
        }
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, ld0Var.J0);
        paint.setColor(Color.argb((int) (ld0Var.p1.getAlpha() * 255.0f), (int) (Color.red(w02) * 0.8f), (int) (Color.green(w02) * 0.8f), (int) (Color.blue(w02) * 0.8f)));
        canvas.drawRect(ld0Var.u0, 0.0f, getMeasuredWidth() - ld0Var.u0, org.telegram.messenger.g0.m, paint);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ld0 ld0Var = this.d;
            if (ld0Var.w1 != 0 && motionEvent.getY() < ld0Var.w1 && ld0Var.p1.getAlpha() == 0.0f) {
                ld0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        ld0 ld0Var = this.d;
        ld0Var.u1 = true;
        super.onLayout(z10, i7, i10, i11, i12);
        ld0Var.u1 = false;
        ld0Var.K0(false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        this.b = true;
        ld0 ld0Var = this.d;
        ed0 ed0Var = ld0Var.n1;
        int i11 = ld0Var.u0;
        setPadding(i11, org.telegram.messenger.g0.m, i11, 0);
        this.b = false;
        int paddingTop = size - getPaddingTop();
        View.MeasureSpec.getSize(i7);
        ((FrameLayout.LayoutParams) ld0Var.q1.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.b = true;
        int L = org.telegram.messenger.g0.L(80.0f);
        org.telegram.ui.Cells.c5 c5Var = ld0Var.m1;
        int i12 = ((ld0) c5Var.a).z1;
        for (int i13 = 0; i13 < i12; i13++) {
            ViewGroup u10 = c5Var.u(this.c, i13);
            u10.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
            L += u10.getMeasuredHeight();
        }
        int i14 = L < paddingTop ? paddingTop - L : paddingTop / 5;
        if (ed0Var.getPaddingTop() != i14) {
            ed0Var.getPaddingTop();
            ed0Var.setPadding(0, i14, 0, 0);
        }
        this.b = false;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.d.J && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.b) {
            return;
        }
        super.requestLayout();
    }
}
