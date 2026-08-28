package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class op extends NestedScrollView {
    public boolean S;
    public final /* synthetic */ sp T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op(sp spVar, Context context) {
        super(context);
        this.T = spVar;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i9;
        int i10;
        sp spVar = this.T;
        int i11 = spVar.f;
        i9 = ((org.telegram.ui.ActionBar.f3) spVar).backgroundPaddingTop;
        int scrollY = (int) ((getScrollY() + (i11 - i9)) - getTranslationY());
        Drawable drawable = spVar.b;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = spVar.c.getMeasuredHeight() + scrollY;
        i10 = ((org.telegram.ui.ActionBar.f3) spVar).backgroundPaddingTop;
        drawable.setBounds(0, scrollY, measuredWidth, AndroidUtilities.dp(19.0f) + i10 + measuredHeight);
        drawable.draw(canvas);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            sp spVar = this.T;
            if (spVar.f != 0 && motionEvent.getY() < spVar.f) {
                spVar.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        sp.m(this.T);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        sp spVar = this.T;
        measureChildWithMargins(spVar.c, i9, 0, i10, 0);
        int measuredHeight = spVar.c.getMeasuredHeight();
        int i11 = (size / 5) * 3;
        int i12 = size - i11;
        if (!spVar.e && measuredHeight - i12 >= AndroidUtilities.dp(90.0f)) {
            if (measuredHeight >= AndroidUtilities.dp(90.0f) + (size / 2)) {
                int dp = AndroidUtilities.dp(108.0f) + (measuredHeight / 2);
                if (i12 < dp) {
                    i11 = size - dp;
                }
                if (getPaddingTop() != i11) {
                    this.S = true;
                    setPadding(0, i11, 0, 0);
                    this.S = false;
                }
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
            }
        }
        i11 = size - measuredHeight;
        if (getPaddingTop() != i11) {
        }
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void onScrollChanged(int i9, int i10, int i11, int i12) {
        super.onScrollChanged(i9, i10, i11, i12);
        sp.m(this.T);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.T.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.S) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        sp.m(this.T);
    }
}
