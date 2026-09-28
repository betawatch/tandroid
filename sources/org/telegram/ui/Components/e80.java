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

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class e80 extends FrameLayout {
    public final /* synthetic */ j80 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e80(j80 j80Var, Context context) {
        super(context);
        this.a = j80Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        j80 j80Var = this.a;
        Drawable drawable = j80Var.b;
        int i11 = j80Var.r;
        i10 = ((org.telegram.ui.ActionBar.e3) j80Var).backgroundPaddingTop;
        drawable.setBounds(0, i11 - i10, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            j80 j80Var = this.a;
            if (j80Var.r != 0 && motionEvent.getY() < j80Var.r) {
                j80Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        j80.o(this.a);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
        j80 j80Var = this.a;
        TextView textView = j80Var.f;
        measureChildWithMargins(textView, i10, 0, i11, 0);
        int measuredHeight = textView.getMeasuredHeight();
        f80 f80Var = j80Var.d;
        ((FrameLayout.LayoutParams) f80Var.getLayoutParams()).topMargin = AndroidUtilities.dp(65.0f) + measuredHeight;
        getMeasuredWidth();
        int D = org.telegram.messenger.f0.D(58.0f, j80Var.h.size(), AndroidUtilities.dp(80.0f));
        i12 = ((org.telegram.ui.ActionBar.e3) j80Var).backgroundPaddingTop;
        int C = org.telegram.messenger.f0.C(55.0f, i12 + D, measuredHeight);
        int i13 = size / 5;
        int i14 = C < i13 * 3 ? size - C : i13 * 2;
        if (f80Var.getPaddingTop() != i14) {
            j80Var.n = true;
            f80Var.setPadding(0, i14, 0, 0);
            j80Var.n = false;
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
