package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class kq extends NestedScrollView {
    public boolean W;
    public final /* synthetic */ oq a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq(oq oqVar, Context context) {
        super(context);
        this.a0 = oqVar;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        oq oqVar = this.a0;
        int i12 = oqVar.h;
        i10 = ((org.telegram.ui.ActionBar.k3) oqVar).backgroundPaddingTop;
        int scrollY = (int) ((getScrollY() + (i12 - i10)) - getTranslationY());
        Drawable drawable = oqVar.b;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = oqVar.d.getMeasuredHeight() + scrollY;
        i11 = ((org.telegram.ui.ActionBar.k3) oqVar).backgroundPaddingTop;
        drawable.setBounds(0, scrollY, measuredWidth, AndroidUtilities.dp(19.0f) + i11 + measuredHeight);
        drawable.draw(canvas);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            oq oqVar = this.a0;
            if (oqVar.h != 0 && motionEvent.getY() < oqVar.h) {
                oqVar.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        oq.m(this.a0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        oq oqVar = this.a0;
        measureChildWithMargins(oqVar.d, i10, 0, i11, 0);
        int measuredHeight = oqVar.d.getMeasuredHeight();
        int i12 = (size / 5) * 3;
        int i13 = size - i12;
        if (!oqVar.f && measuredHeight - i13 >= AndroidUtilities.dp(90.0f)) {
            if (measuredHeight >= AndroidUtilities.dp(90.0f) + (size / 2)) {
                int dp = AndroidUtilities.dp(108.0f) + (measuredHeight / 2);
                if (i13 < dp) {
                    i12 = size - dp;
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
        oq.m(this.a0);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.a0.isDismissed() && super.onTouchEvent(motionEvent);
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
        oq.m(this.a0);
    }
}
