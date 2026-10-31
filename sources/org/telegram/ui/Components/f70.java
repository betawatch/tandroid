package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f70 extends FrameLayout {
    public final /* synthetic */ k70 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f70(k70 k70Var, Context context) {
        super(context);
        this.a = k70Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        k70 k70Var = this.a;
        k70Var.i1.setBounds(0, k70Var.r1 - k70Var.s0, getMeasuredWidth(), getMeasuredHeight());
        k70Var.i1.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            k70 k70Var = this.a;
            if (k70Var.r1 != 0 && motionEvent.getY() < k70Var.r1) {
                k70Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        k70.I0(this.a);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11) - org.telegram.messenger.i0.m;
        k70 k70Var = this.a;
        TextView textView = k70Var.o1;
        measureChildWithMargins(textView, i10, 0, i11, 0);
        int measuredHeight = textView.getMeasuredHeight();
        g70 g70Var = k70Var.m1;
        ((FrameLayout.LayoutParams) g70Var.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(65.0f) + measuredHeight;
        getMeasuredWidth();
        int C = org.telegram.messenger.m5.C(55.0f, org.telegram.messenger.m5.D(58.0f, k70Var.p1.size(), org.telegram.messenger.i0.L(80.0f)) + k70Var.s0, measuredHeight);
        int i12 = size / 5;
        int i13 = C < i12 * 3 ? size - C : i12 * 2;
        if (g70Var.getPaddingTop() != i13) {
            k70Var.q1 = true;
            g70Var.setPadding(0, i13, 0, 0);
            k70Var.q1 = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
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
