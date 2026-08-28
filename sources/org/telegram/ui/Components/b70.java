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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b70 extends FrameLayout {
    public final /* synthetic */ g70 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b70(g70 g70Var, Context context) {
        super(context);
        this.a = g70Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i9;
        g70 g70Var = this.a;
        Drawable drawable = g70Var.b;
        int i10 = g70Var.r;
        i9 = ((org.telegram.ui.ActionBar.f3) g70Var).backgroundPaddingTop;
        drawable.setBounds(0, i10 - i9, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            g70 g70Var = this.a;
            if (g70Var.r != 0 && motionEvent.getY() < g70Var.r) {
                g70Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        g70.o(this.a);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i10) - AndroidUtilities.statusBarHeight;
        g70 g70Var = this.a;
        TextView textView = g70Var.f;
        measureChildWithMargins(textView, i9, 0, i10, 0);
        int measuredHeight = textView.getMeasuredHeight();
        c70 c70Var = g70Var.d;
        ((FrameLayout.LayoutParams) c70Var.getLayoutParams()).topMargin = AndroidUtilities.dp(65.0f) + measuredHeight;
        getMeasuredWidth();
        int D = org.telegram.messenger.l0.D(58.0f, g70Var.h.size(), AndroidUtilities.dp(80.0f));
        i11 = ((org.telegram.ui.ActionBar.f3) g70Var).backgroundPaddingTop;
        int C = org.telegram.messenger.l0.C(55.0f, i11 + D, measuredHeight);
        int i12 = size / 5;
        int i13 = C < i12 * 3 ? size - C : i12 * 2;
        if (c70Var.getPaddingTop() != i13) {
            g70Var.n = true;
            c70Var.setPadding(0, i13, 0, 0);
            g70Var.n = false;
        }
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
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
