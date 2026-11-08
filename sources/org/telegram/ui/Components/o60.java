package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class o60 extends FrameLayout {
    public final /* synthetic */ t60 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o60(t60 t60Var, Context context) {
        super(context);
        this.a = t60Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        t60 t60Var = this.a;
        t60Var.i1.setBounds(0, t60Var.r1 - t60Var.s0, getMeasuredWidth(), getMeasuredHeight());
        t60Var.i1.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            t60 t60Var = this.a;
            if (t60Var.r1 != 0 && motionEvent.getY() < t60Var.r1) {
                t60Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        t60.I0(this.a);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.m;
        t60 t60Var = this.a;
        TextView textView = t60Var.o1;
        measureChildWithMargins(textView, i7, 0, i10, 0);
        int measuredHeight = textView.getMeasuredHeight();
        p60 p60Var = t60Var.m1;
        ((FrameLayout.LayoutParams) p60Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(65.0f) + measuredHeight;
        getMeasuredWidth();
        int C = org.telegram.messenger.k5.C(55.0f, org.telegram.messenger.k5.D(58.0f, t60Var.p1.size(), org.telegram.messenger.g0.L(80.0f)) + t60Var.s0, measuredHeight);
        int i11 = size / 5;
        int i12 = C < i11 * 3 ? size - C : i11 * 2;
        if (p60Var.getPaddingTop() != i12) {
            t60Var.q1 = true;
            p60Var.setPadding(0, i12, 0, 0);
            t60Var.q1 = false;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.a.I && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.a.q1) {
            return;
        }
        super.requestLayout();
    }
}
