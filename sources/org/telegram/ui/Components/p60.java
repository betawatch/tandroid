package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class p60 extends FrameLayout {
    public final /* synthetic */ u60 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p60(u60 u60Var, Context context) {
        super(context);
        this.a = u60Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        u60 u60Var = this.a;
        u60Var.i1.setBounds(0, u60Var.r1 - u60Var.s0, getMeasuredWidth(), getMeasuredHeight());
        u60Var.i1.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            u60 u60Var = this.a;
            if (u60Var.r1 != 0 && motionEvent.getY() < u60Var.r1) {
                u60Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        u60.I0(this.a);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.m;
        u60 u60Var = this.a;
        TextView textView = u60Var.o1;
        measureChildWithMargins(textView, i7, 0, i10, 0);
        int measuredHeight = textView.getMeasuredHeight();
        q60 q60Var = u60Var.m1;
        ((FrameLayout.LayoutParams) q60Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(65.0f) + measuredHeight;
        getMeasuredWidth();
        int C = org.telegram.messenger.k5.C(55.0f, org.telegram.messenger.k5.D(58.0f, u60Var.p1.size(), org.telegram.messenger.g0.L(80.0f)) + u60Var.s0, measuredHeight);
        int i11 = size / 5;
        int i12 = C < i11 * 3 ? size - C : i11 * 2;
        if (q60Var.getPaddingTop() != i12) {
            u60Var.q1 = true;
            q60Var.setPadding(0, i12, 0, 0);
            u60Var.q1 = false;
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
