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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class r80 extends FrameLayout {
    public final /* synthetic */ w80 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r80(w80 w80Var, Context context) {
        super(context);
        this.a = w80Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        w80 w80Var = this.a;
        Drawable drawable = w80Var.b;
        int i11 = w80Var.r;
        i10 = ((org.telegram.ui.ActionBar.e3) w80Var).backgroundPaddingTop;
        drawable.setBounds(0, i11 - i10, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            w80 w80Var = this.a;
            if (w80Var.r != 0 && motionEvent.getY() < w80Var.r) {
                w80Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        w80.q(this.a);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
        w80 w80Var = this.a;
        TextView textView = w80Var.f;
        measureChildWithMargins(textView, i10, 0, i11, 0);
        int measuredHeight = textView.getMeasuredHeight();
        s80 s80Var = w80Var.d;
        ((FrameLayout.LayoutParams) s80Var.getLayoutParams()).topMargin = AndroidUtilities.dp(65.0f) + measuredHeight;
        getMeasuredWidth();
        int y3 = org.telegram.messenger.yh.y(58.0f, w80Var.h.size(), AndroidUtilities.dp(80.0f));
        i12 = ((org.telegram.ui.ActionBar.e3) w80Var).backgroundPaddingTop;
        int c10 = org.telegram.messenger.yh.c(55.0f, i12 + y3, measuredHeight);
        int i13 = size / 5;
        int i14 = c10 < i13 * 3 ? size - c10 : i13 * 2;
        if (s80Var.getPaddingTop() != i14) {
            w80Var.n = true;
            s80Var.setPadding(0, i14, 0, 0);
            w80Var.n = false;
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
