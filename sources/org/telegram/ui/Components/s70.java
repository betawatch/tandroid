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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class s70 extends FrameLayout {
    public final /* synthetic */ x70 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s70(x70 x70Var, Context context) {
        super(context);
        this.a = x70Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        x70 x70Var = this.a;
        Drawable drawable = x70Var.b;
        int i11 = x70Var.r;
        i10 = ((org.telegram.ui.ActionBar.f3) x70Var).backgroundPaddingTop;
        drawable.setBounds(0, i11 - i10, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            x70 x70Var = this.a;
            if (x70Var.r != 0 && motionEvent.getY() < x70Var.r) {
                x70Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        x70.o(this.a);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
        x70 x70Var = this.a;
        TextView textView = x70Var.f;
        measureChildWithMargins(textView, i10, 0, i11, 0);
        int measuredHeight = textView.getMeasuredHeight();
        t70 t70Var = x70Var.d;
        ((FrameLayout.LayoutParams) t70Var.getLayoutParams()).topMargin = AndroidUtilities.dp(65.0f) + measuredHeight;
        getMeasuredWidth();
        int D = org.telegram.messenger.z0.D(58.0f, x70Var.h.size(), AndroidUtilities.dp(80.0f));
        i12 = ((org.telegram.ui.ActionBar.f3) x70Var).backgroundPaddingTop;
        int C = org.telegram.messenger.z0.C(55.0f, i12 + D, measuredHeight);
        int i13 = size / 5;
        int i14 = C < i13 * 3 ? size - C : i13 * 2;
        if (t70Var.getPaddingTop() != i14) {
            x70Var.n = true;
            t70Var.setPadding(0, i14, 0, 0);
            x70Var.n = false;
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
