package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class vp extends NestedScrollView {
    public boolean T;
    public final /* synthetic */ zp U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp(zp zpVar, Context context) {
        super(context);
        this.U = zpVar;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        zp zpVar = this.U;
        int i12 = zpVar.f;
        i10 = ((org.telegram.ui.ActionBar.g3) zpVar).backgroundPaddingTop;
        int scrollY = (int) ((getScrollY() + (i12 - i10)) - getTranslationY());
        Drawable drawable = zpVar.b;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = zpVar.c.getMeasuredHeight() + scrollY;
        i11 = ((org.telegram.ui.ActionBar.g3) zpVar).backgroundPaddingTop;
        drawable.setBounds(0, scrollY, measuredWidth, AndroidUtilities.dp(19.0f) + i11 + measuredHeight);
        drawable.draw(canvas);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            zp zpVar = this.U;
            if (zpVar.f != 0 && motionEvent.getY() < zpVar.f) {
                zpVar.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        zp.m(this.U);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        zp zpVar = this.U;
        measureChildWithMargins(zpVar.c, i10, 0, i11, 0);
        int measuredHeight = zpVar.c.getMeasuredHeight();
        int i12 = (size / 5) * 3;
        int i13 = size - i12;
        if (!zpVar.e && measuredHeight - i13 >= AndroidUtilities.dp(90.0f)) {
            if (measuredHeight >= AndroidUtilities.dp(90.0f) + (size / 2)) {
                int dp = AndroidUtilities.dp(108.0f) + (measuredHeight / 2);
                if (i13 < dp) {
                    i12 = size - dp;
                }
                if (getPaddingTop() != i12) {
                    this.T = true;
                    setPadding(0, i12, 0, 0);
                    this.T = false;
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
        zp.m(this.U);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.U.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.T) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        zp.m(this.U);
    }
}
