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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class q80 extends FrameLayout {
    public final /* synthetic */ v80 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q80(v80 v80Var, Context context) {
        super(context);
        this.a = v80Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        v80 v80Var = this.a;
        Drawable drawable = v80Var.b;
        int i11 = v80Var.r;
        i10 = ((org.telegram.ui.ActionBar.e3) v80Var).backgroundPaddingTop;
        drawable.setBounds(0, i11 - i10, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            v80 v80Var = this.a;
            if (v80Var.r != 0 && motionEvent.getY() < v80Var.r) {
                v80Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        v80.q(this.a);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
        v80 v80Var = this.a;
        TextView textView = v80Var.f;
        measureChildWithMargins(textView, i10, 0, i11, 0);
        int measuredHeight = textView.getMeasuredHeight();
        r80 r80Var = v80Var.d;
        ((FrameLayout.LayoutParams) r80Var.getLayoutParams()).topMargin = AndroidUtilities.dp(65.0f) + measuredHeight;
        getMeasuredWidth();
        int D = org.telegram.messenger.g0.D(58.0f, v80Var.h.size(), AndroidUtilities.dp(80.0f));
        i12 = ((org.telegram.ui.ActionBar.e3) v80Var).backgroundPaddingTop;
        int C = org.telegram.messenger.g0.C(55.0f, i12 + D, measuredHeight);
        int i13 = size / 5;
        int i14 = C < i13 * 3 ? size - C : i13 * 2;
        if (r80Var.getPaddingTop() != i14) {
            v80Var.n = true;
            r80Var.setPadding(0, i14, 0, 0);
            v80Var.n = false;
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
