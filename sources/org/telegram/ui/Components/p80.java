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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class p80 extends FrameLayout {
    public final /* synthetic */ u80 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p80(u80 u80Var, Context context) {
        super(context);
        this.a = u80Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        u80 u80Var = this.a;
        Drawable drawable = u80Var.b;
        int i11 = u80Var.v;
        i10 = ((org.telegram.ui.ActionBar.k3) u80Var).backgroundPaddingTop;
        drawable.setBounds(0, i11 - i10, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            u80 u80Var = this.a;
            if (u80Var.v != 0 && motionEvent.getY() < u80Var.v) {
                u80Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        u80.o(this.a);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
        u80 u80Var = this.a;
        TextView textView = u80Var.n;
        measureChildWithMargins(textView, i10, 0, i11, 0);
        int measuredHeight = textView.getMeasuredHeight();
        q80 q80Var = u80Var.f;
        ((FrameLayout.LayoutParams) q80Var.getLayoutParams()).topMargin = AndroidUtilities.dp(65.0f) + measuredHeight;
        getMeasuredWidth();
        int b10 = org.telegram.messenger.wh.b(58.0f, u80Var.r.size(), AndroidUtilities.dp(80.0f));
        i12 = ((org.telegram.ui.ActionBar.k3) u80Var).backgroundPaddingTop;
        int D = org.telegram.messenger.t.D(55.0f, i12 + b10, measuredHeight);
        int i13 = size / 5;
        int i14 = D < i13 * 3 ? size - D : i13 * 2;
        if (q80Var.getPaddingTop() != i14) {
            u80Var.s = true;
            q80Var.setPadding(0, i14, 0, 0);
            u80Var.s = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.a.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.a.s) {
            return;
        }
        super.requestLayout();
    }
}
