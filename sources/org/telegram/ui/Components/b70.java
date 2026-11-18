package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class b70 extends FrameLayout {
    public final /* synthetic */ g70 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b70(g70 g70Var, Context context) {
        super(context);
        this.a = g70Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        g70 g70Var = this.a;
        g70Var.m1.setBounds(0, g70Var.v1 - g70Var.t0, getMeasuredWidth(), getMeasuredHeight());
        g70Var.m1.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            g70 g70Var = this.a;
            if (g70Var.v1 != 0 && motionEvent.getY() < g70Var.v1) {
                g70Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        g70.J0(this.a);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.m;
        g70 g70Var = this.a;
        TextView textView = g70Var.s1;
        measureChildWithMargins(textView, i7, 0, i10, 0);
        int measuredHeight = textView.getMeasuredHeight();
        c70 c70Var = g70Var.q1;
        ((FrameLayout.LayoutParams) c70Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(65.0f) + measuredHeight;
        getMeasuredWidth();
        int C = org.telegram.messenger.f3.C(55.0f, org.telegram.messenger.f3.D(58.0f, g70Var.t1.size(), org.telegram.messenger.g0.L(80.0f)) + g70Var.t0, measuredHeight);
        int i11 = size / 5;
        int i12 = C < i11 * 3 ? size - C : i11 * 2;
        if (c70Var.getPaddingTop() != i12) {
            g70Var.u1 = true;
            c70Var.setPadding(0, i12, 0, 0);
            g70Var.u1 = false;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.a.J && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.a.u1) {
            return;
        }
        super.requestLayout();
    }
}
