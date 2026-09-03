package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class u70 extends FrameLayout {
    public final /* synthetic */ z70 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u70(z70 z70Var, Context context) {
        super(context);
        this.a = z70Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        z70 z70Var = this.a;
        Drawable drawable = z70Var.b;
        int i11 = z70Var.r;
        i10 = ((org.telegram.ui.ActionBar.g3) z70Var).backgroundPaddingTop;
        drawable.setBounds(0, i11 - i10, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            z70 z70Var = this.a;
            if (z70Var.r != 0 && motionEvent.getY() < z70Var.r) {
                z70Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        z70.o(this.a);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
        z70 z70Var = this.a;
        TextView textView = z70Var.f;
        measureChildWithMargins(textView, i10, 0, i11, 0);
        int measuredHeight = textView.getMeasuredHeight();
        v70 v70Var = z70Var.d;
        ((FrameLayout.LayoutParams) v70Var.getLayoutParams()).topMargin = AndroidUtilities.dp(65.0f) + measuredHeight;
        getMeasuredWidth();
        int D = org.telegram.messenger.y3.D(58.0f, z70Var.h.size(), AndroidUtilities.dp(80.0f));
        i12 = ((org.telegram.ui.ActionBar.g3) z70Var).backgroundPaddingTop;
        int C = org.telegram.messenger.y3.C(55.0f, i12 + D, measuredHeight);
        int i13 = size / 5;
        int i14 = C < i13 * 3 ? size - C : i13 * 2;
        if (v70Var.getPaddingTop() != i14) {
            z70Var.n = true;
            v70Var.setPadding(0, i14, 0, 0);
            z70Var.n = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.a.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.a.n) {
            return;
        }
        super.requestLayout();
    }
}
