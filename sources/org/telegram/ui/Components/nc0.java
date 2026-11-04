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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class nc0 extends FrameLayout {
    public final RectF a;
    public boolean b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ vc0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc0(vc0 vc0Var, Activity activity, Activity activity2) {
        super(activity);
        this.d = vc0Var;
        this.c = activity2;
        this.a = new RectF();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        vc0 vc0Var = this.d;
        Paint paint = vc0Var.s1;
        int i3 = vc0Var.t1 - vc0Var.t0;
        int L = org.telegram.messenger.g0.L(30.0f) + getMeasuredHeight() + vc0Var.t0;
        float L2 = org.telegram.messenger.g0.L(12.0f);
        int i10 = vc0Var.t0;
        float min = ((float) (i3 + i10)) < L2 ? 1.0f - Math.min(1.0f, ((L2 - i3) - i10) / L2) : 1.0f;
        int i11 = org.telegram.messenger.g0.m;
        int i12 = i3 + i11;
        vc0Var.s0.setBounds(0, i12, getMeasuredWidth(), L - i11);
        vc0Var.s0.draw(canvas);
        if (min != 1.0f) {
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, vc0Var.J0));
            float f10 = vc0Var.u0;
            float f11 = vc0Var.t0 + i12;
            float measuredWidth = getMeasuredWidth() - vc0Var.u0;
            float L3 = org.telegram.messenger.g0.L(24.0f) + vc0Var.t0 + i12;
            RectF rectF = this.a;
            rectF.set(f10, f11, measuredWidth, L3);
            float f12 = L2 * min;
            canvas.drawRoundRect(rectF, f12, f12, paint);
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, vc0Var.J0);
        paint.setColor(Color.argb((int) (vc0Var.m1.getAlpha() * 255.0f), (int) (Color.red(w02) * 0.8f), (int) (Color.green(w02) * 0.8f), (int) (Color.blue(w02) * 0.8f)));
        canvas.drawRect(vc0Var.u0, 0.0f, getMeasuredWidth() - vc0Var.u0, org.telegram.messenger.g0.m, paint);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            vc0 vc0Var = this.d;
            if (vc0Var.t1 != 0 && motionEvent.getY() < vc0Var.t1 && vc0Var.m1.getAlpha() == 0.0f) {
                vc0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        vc0 vc0Var = this.d;
        vc0Var.r1 = true;
        super.onLayout(z10, i3, i10, i11, i12);
        vc0Var.r1 = false;
        vc0Var.J0(false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        this.b = true;
        vc0 vc0Var = this.d;
        oc0 oc0Var = vc0Var.k1;
        int i11 = vc0Var.u0;
        setPadding(i11, org.telegram.messenger.g0.m, i11, 0);
        this.b = false;
        int paddingTop = size - getPaddingTop();
        View.MeasureSpec.getSize(i3);
        ((FrameLayout.LayoutParams) vc0Var.n1.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.b = true;
        int L = org.telegram.messenger.g0.L(80.0f);
        nh nhVar = vc0Var.j1;
        int i12 = ((vc0) nhVar.b).w1;
        for (int i13 = 0; i13 < i12; i13++) {
            ViewGroup z10 = nhVar.z(this.c, i13);
            z10.measure(i3, View.MeasureSpec.makeMeasureSpec(0, 0));
            L += z10.getMeasuredHeight();
        }
        int i14 = L < paddingTop ? paddingTop - L : paddingTop / 5;
        if (oc0Var.getPaddingTop() != i14) {
            oc0Var.getPaddingTop();
            oc0Var.setPadding(0, i14, 0, 0);
        }
        this.b = false;
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
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
