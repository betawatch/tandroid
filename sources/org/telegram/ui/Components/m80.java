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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class m80 extends FrameLayout {
    public final /* synthetic */ r80 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m80(r80 r80Var, Context context) {
        super(context);
        this.a = r80Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        r80 r80Var = this.a;
        Drawable drawable = r80Var.b;
        int i11 = r80Var.r;
        i10 = ((org.telegram.ui.ActionBar.f3) r80Var).backgroundPaddingTop;
        drawable.setBounds(0, i11 - i10, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            r80 r80Var = this.a;
            if (r80Var.r != 0 && motionEvent.getY() < r80Var.r) {
                r80Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        r80.p(this.a);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
        r80 r80Var = this.a;
        TextView textView = r80Var.f;
        measureChildWithMargins(textView, i10, 0, i11, 0);
        int measuredHeight = textView.getMeasuredHeight();
        n80 n80Var = r80Var.d;
        ((FrameLayout.LayoutParams) n80Var.getLayoutParams()).topMargin = AndroidUtilities.dp(65.0f) + measuredHeight;
        getMeasuredWidth();
        int D = org.telegram.messenger.g0.D(58.0f, r80Var.h.size(), AndroidUtilities.dp(80.0f));
        i12 = ((org.telegram.ui.ActionBar.f3) r80Var).backgroundPaddingTop;
        int C = org.telegram.messenger.g0.C(55.0f, i12 + D, measuredHeight);
        int i13 = size / 5;
        int i14 = C < i13 * 3 ? size - C : i13 * 2;
        if (n80Var.getPaddingTop() != i14) {
            r80Var.n = true;
            n80Var.setPadding(0, i14, 0, 0);
            r80Var.n = false;
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
