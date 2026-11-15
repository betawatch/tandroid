package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class q60 extends FrameLayout {
    public final /* synthetic */ v60 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q60(v60 v60Var, Context context) {
        super(context);
        this.a = v60Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        v60 v60Var = this.a;
        v60Var.m1.setBounds(0, v60Var.v1 - v60Var.t0, getMeasuredWidth(), getMeasuredHeight());
        v60Var.m1.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            v60 v60Var = this.a;
            if (v60Var.v1 != 0 && motionEvent.getY() < v60Var.v1) {
                v60Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        v60.I0(this.a);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.m;
        v60 v60Var = this.a;
        TextView textView = v60Var.s1;
        measureChildWithMargins(textView, i7, 0, i10, 0);
        int measuredHeight = textView.getMeasuredHeight();
        r60 r60Var = v60Var.q1;
        ((FrameLayout.LayoutParams) r60Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(65.0f) + measuredHeight;
        getMeasuredWidth();
        int C = org.telegram.messenger.k5.C(55.0f, org.telegram.messenger.k5.D(58.0f, v60Var.t1.size(), org.telegram.messenger.g0.L(80.0f)) + v60Var.t0, measuredHeight);
        int i11 = size / 5;
        int i12 = C < i11 * 3 ? size - C : i11 * 2;
        if (r60Var.getPaddingTop() != i12) {
            v60Var.u1 = true;
            r60Var.setPadding(0, i12, 0, 0);
            v60Var.u1 = false;
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
