package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class op extends NestedScrollView {
    public boolean W;
    public final /* synthetic */ sp a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op(sp spVar, Context context) {
        super(context);
        this.a0 = spVar;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        sp spVar = this.a0;
        int scrollY = (int) ((getScrollY() + (spVar.n1 - spVar.s0)) - getTranslationY());
        Drawable drawable = spVar.i1;
        drawable.setBounds(0, scrollY, getMeasuredWidth(), org.telegram.messenger.i0.L(19.0f) + spVar.k1.getMeasuredHeight() + scrollY + spVar.s0);
        drawable.draw(canvas);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            sp spVar = this.a0;
            if (spVar.n1 != 0 && motionEvent.getY() < spVar.n1) {
                spVar.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        sp.I0(this.a0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        sp spVar = this.a0;
        measureChildWithMargins(spVar.k1, i10, 0, i11, 0);
        int measuredHeight = spVar.k1.getMeasuredHeight();
        int i12 = (size / 5) * 3;
        int i13 = size - i12;
        if (!spVar.m1 && measuredHeight - i13 >= org.telegram.messenger.i0.L(90.0f)) {
            if (measuredHeight >= org.telegram.messenger.i0.L(90.0f) + (size / 2)) {
                int L = org.telegram.messenger.i0.L(108.0f) + (measuredHeight / 2);
                if (i13 < L) {
                    i12 = size - L;
                }
                if (getPaddingTop() != i12) {
                    this.W = true;
                    setPadding(0, i12, 0, 0);
                    this.W = false;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
            }
        }
        i12 = size - measuredHeight;
        if (getPaddingTop() != i12) {
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        sp.I0(this.a0);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.a0.I && super.onTouchEvent(motionEvent);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.W) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        sp.I0(this.a0);
    }
}
