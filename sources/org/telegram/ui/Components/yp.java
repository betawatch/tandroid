package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class yp extends NestedScrollView {
    public boolean a0;
    public final /* synthetic */ cq b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp(cq cqVar, Context context) {
        super(context);
        this.b0 = cqVar;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        cq cqVar = this.b0;
        int scrollY = (int) ((getScrollY() + (cqVar.r1 - cqVar.t0)) - getTranslationY());
        Drawable drawable = cqVar.m1;
        drawable.setBounds(0, scrollY, getMeasuredWidth(), org.telegram.messenger.g0.L(19.0f) + cqVar.o1.getMeasuredHeight() + scrollY + cqVar.t0);
        drawable.draw(canvas);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            cq cqVar = this.b0;
            if (cqVar.r1 != 0 && motionEvent.getY() < cqVar.r1) {
                cqVar.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        cq.J0(this.b0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        cq cqVar = this.b0;
        measureChildWithMargins(cqVar.o1, i7, 0, i10, 0);
        int measuredHeight = cqVar.o1.getMeasuredHeight();
        int i11 = (size / 5) * 3;
        int i12 = size - i11;
        if (!cqVar.q1 && measuredHeight - i12 >= org.telegram.messenger.g0.L(90.0f)) {
            if (measuredHeight >= org.telegram.messenger.g0.L(90.0f) + (size / 2)) {
                int L = org.telegram.messenger.g0.L(108.0f) + (measuredHeight / 2);
                if (i12 < L) {
                    i11 = size - L;
                }
                if (getPaddingTop() != i11) {
                    this.a0 = true;
                    setPadding(0, i11, 0, 0);
                    this.a0 = false;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
            }
        }
        i11 = size - measuredHeight;
        if (getPaddingTop() != i11) {
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        cq.J0(this.b0);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.b0.J && super.onTouchEvent(motionEvent);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.a0) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        cq.J0(this.b0);
    }
}
