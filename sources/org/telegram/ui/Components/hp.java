package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class hp extends NestedScrollView {
    public boolean W;
    public final /* synthetic */ lp a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp(lp lpVar, Context context) {
        super(context);
        this.a0 = lpVar;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        lp lpVar = this.a0;
        int scrollY = (int) ((getScrollY() + (lpVar.n1 - lpVar.s0)) - getTranslationY());
        Drawable drawable = lpVar.i1;
        drawable.setBounds(0, scrollY, getMeasuredWidth(), org.telegram.messenger.g0.L(19.0f) + lpVar.k1.getMeasuredHeight() + scrollY + lpVar.s0);
        drawable.draw(canvas);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            lp lpVar = this.a0;
            if (lpVar.n1 != 0 && motionEvent.getY() < lpVar.n1) {
                lpVar.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        lp.I0(this.a0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        lp lpVar = this.a0;
        measureChildWithMargins(lpVar.k1, i7, 0, i10, 0);
        int measuredHeight = lpVar.k1.getMeasuredHeight();
        int i11 = (size / 5) * 3;
        int i12 = size - i11;
        if (!lpVar.m1 && measuredHeight - i12 >= org.telegram.messenger.g0.L(90.0f)) {
            if (measuredHeight >= org.telegram.messenger.g0.L(90.0f) + (size / 2)) {
                int L = org.telegram.messenger.g0.L(108.0f) + (measuredHeight / 2);
                if (i12 < L) {
                    i11 = size - L;
                }
                if (getPaddingTop() != i11) {
                    this.W = true;
                    setPadding(0, i11, 0, 0);
                    this.W = false;
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
        lp.I0(this.a0);
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
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        lp.I0(this.a0);
    }
}
