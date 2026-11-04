package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j60 extends FrameLayout {
    public final /* synthetic */ o60 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j60(o60 o60Var, Context context) {
        super(context);
        this.a = o60Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o60 o60Var = this.a;
        o60Var.j1.setBounds(0, o60Var.s1 - o60Var.t0, getMeasuredWidth(), getMeasuredHeight());
        o60Var.j1.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            o60 o60Var = this.a;
            if (o60Var.s1 != 0 && motionEvent.getY() < o60Var.s1) {
                o60Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        o60.I0(this.a);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.m;
        o60 o60Var = this.a;
        TextView textView = o60Var.p1;
        measureChildWithMargins(textView, i3, 0, i10, 0);
        int measuredHeight = textView.getMeasuredHeight();
        k60 k60Var = o60Var.n1;
        ((FrameLayout.LayoutParams) k60Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(65.0f) + measuredHeight;
        getMeasuredWidth();
        int C = org.telegram.messenger.k5.C(55.0f, org.telegram.messenger.k5.D(58.0f, o60Var.q1.size(), org.telegram.messenger.g0.L(80.0f)) + o60Var.t0, measuredHeight);
        int i11 = size / 5;
        int i12 = C < i11 * 3 ? size - C : i11 * 2;
        if (k60Var.getPaddingTop() != i12) {
            o60Var.r1 = true;
            k60Var.setPadding(0, i12, 0, 0);
            o60Var.r1 = false;
        }
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.a.J && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.a.r1) {
            return;
        }
        super.requestLayout();
    }
}
