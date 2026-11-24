// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class nj2 extends NestedScrollView {
    public boolean W;
    public final /* synthetic */ rj2 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj2(rj2 rj2Var, Activity activity) {
        super(activity);
        this.a0 = rj2Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        rj2 rj2Var = this.a0;
        int scrollY = (int) ((getScrollY() + (rj2Var.q1 - rj2Var.t0)) - getTranslationY());
        Drawable drawable = rj2Var.l1;
        drawable.setBounds(0, scrollY, getMeasuredWidth(), gm.L(19.0f) + rj2Var.n1.getMeasuredHeight() + scrollY + rj2Var.t0);
        drawable.draw(canvas);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            rj2 rj2Var = this.a0;
            if (rj2Var.q1 != 0 && motionEvent.getY() < rj2Var.q1) {
                rj2Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.a0.D0();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        rj2 rj2Var = this.a0;
        measureChildWithMargins(rj2Var.n1, i, 0, i2, 0);
        int measuredHeight = rj2Var.n1.getMeasuredHeight();
        int i3 = (size / 5) * 3;
        int i4 = size - i3;
        if (!rj2Var.p1 && measuredHeight - i4 >= gm.L(90.0f)) {
            if (measuredHeight >= gm.L(90.0f) + (size / 2)) {
                int L = gm.L(108.0f) + (measuredHeight / 2);
                if (i4 < L) {
                    i3 = size - L;
                }
                if (getPaddingTop() != i3) {
                    this.W = true;
                    setPadding(0, i3, 0, 0);
                    this.W = false;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
            }
        }
        i3 = size - measuredHeight;
        if (getPaddingTop() != i3) {
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.a0.D0();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.a0.J && super.onTouchEvent(motionEvent);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.W) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        this.a0.D0();
    }
}
