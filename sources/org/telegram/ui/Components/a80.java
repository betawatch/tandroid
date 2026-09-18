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

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class a80 extends FrameLayout {
    public final /* synthetic */ f80 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a80(f80 f80Var, Context context) {
        super(context);
        this.a = f80Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        f80 f80Var = this.a;
        Drawable drawable = f80Var.b;
        int i11 = f80Var.r;
        i10 = ((org.telegram.ui.ActionBar.f3) f80Var).backgroundPaddingTop;
        drawable.setBounds(0, i11 - i10, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            f80 f80Var = this.a;
            if (f80Var.r != 0 && motionEvent.getY() < f80Var.r) {
                f80Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        f80.o(this.a);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
        f80 f80Var = this.a;
        TextView textView = f80Var.f;
        measureChildWithMargins(textView, i10, 0, i11, 0);
        int measuredHeight = textView.getMeasuredHeight();
        b80 b80Var = f80Var.d;
        ((FrameLayout.LayoutParams) b80Var.getLayoutParams()).topMargin = AndroidUtilities.dp(65.0f) + measuredHeight;
        getMeasuredWidth();
        int c10 = org.telegram.messenger.wh.c(58.0f, f80Var.h.size(), AndroidUtilities.dp(80.0f));
        i12 = ((org.telegram.ui.ActionBar.f3) f80Var).backgroundPaddingTop;
        int D = org.telegram.messenger.q.D(55.0f, i12 + c10, measuredHeight);
        int i13 = size / 5;
        int i14 = D < i13 * 3 ? size - D : i13 * 2;
        if (b80Var.getPaddingTop() != i14) {
            f80Var.n = true;
            b80Var.setPadding(0, i14, 0, 0);
            f80Var.n = false;
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
