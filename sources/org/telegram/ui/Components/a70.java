package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class a70 extends FrameLayout {
    public final /* synthetic */ f70 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a70(f70 f70Var, Context context) {
        super(context);
        this.a = f70Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        f70 f70Var = this.a;
        f70Var.m1.setBounds(0, f70Var.v1 - f70Var.t0, getMeasuredWidth(), getMeasuredHeight());
        f70Var.m1.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            f70 f70Var = this.a;
            if (f70Var.v1 != 0 && motionEvent.getY() < f70Var.v1) {
                f70Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        f70.J0(this.a);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.m;
        f70 f70Var = this.a;
        TextView textView = f70Var.s1;
        measureChildWithMargins(textView, i7, 0, i10, 0);
        int measuredHeight = textView.getMeasuredHeight();
        b70 b70Var = f70Var.q1;
        ((FrameLayout.LayoutParams) b70Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(65.0f) + measuredHeight;
        getMeasuredWidth();
        int C = org.telegram.messenger.f3.C(55.0f, org.telegram.messenger.f3.D(58.0f, f70Var.t1.size(), org.telegram.messenger.g0.L(80.0f)) + f70Var.t0, measuredHeight);
        int i11 = size / 5;
        int i12 = C < i11 * 3 ? size - C : i11 * 2;
        if (b70Var.getPaddingTop() != i12) {
            f70Var.u1 = true;
            b70Var.setPadding(0, i12, 0, 0);
            f70Var.u1 = false;
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
