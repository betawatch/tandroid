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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class o80 extends FrameLayout {
    public final /* synthetic */ t80 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o80(t80 t80Var, Context context) {
        super(context);
        this.a = t80Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        t80 t80Var = this.a;
        Drawable drawable = t80Var.b;
        int i11 = t80Var.v;
        i10 = ((org.telegram.ui.ActionBar.k3) t80Var).backgroundPaddingTop;
        drawable.setBounds(0, i11 - i10, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            t80 t80Var = this.a;
            if (t80Var.v != 0 && motionEvent.getY() < t80Var.v) {
                t80Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        t80.o(this.a);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
        t80 t80Var = this.a;
        TextView textView = t80Var.n;
        measureChildWithMargins(textView, i10, 0, i11, 0);
        int measuredHeight = textView.getMeasuredHeight();
        p80 p80Var = t80Var.f;
        ((FrameLayout.LayoutParams) p80Var.getLayoutParams()).topMargin = AndroidUtilities.dp(65.0f) + measuredHeight;
        getMeasuredWidth();
        int b10 = org.telegram.messenger.vh.b(58.0f, t80Var.r.size(), AndroidUtilities.dp(80.0f));
        i12 = ((org.telegram.ui.ActionBar.k3) t80Var).backgroundPaddingTop;
        int D = org.telegram.messenger.t.D(55.0f, i12 + b10, measuredHeight);
        int i13 = size / 5;
        int i14 = D < i13 * 3 ? size - D : i13 * 2;
        if (p80Var.getPaddingTop() != i14) {
            t80Var.s = true;
            p80Var.setPadding(0, i14, 0, 0);
            t80Var.s = false;
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
