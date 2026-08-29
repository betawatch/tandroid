package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class be0 extends FrameLayout {
    public final RectF a;
    public boolean b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ ke0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be0(ke0 ke0Var, Activity activity, Activity activity2) {
        super(activity);
        this.d = ke0Var;
        this.c = activity2;
        this.a = new RectF();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        float f9;
        Drawable drawable;
        Drawable drawable2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        ke0 ke0Var = this.d;
        Paint paint = ke0Var.v;
        int i20 = ke0Var.w;
        i10 = ((org.telegram.ui.ActionBar.f3) ke0Var).backgroundPaddingTop;
        int i21 = i20 - i10;
        int dp = AndroidUtilities.dp(30.0f) + getMeasuredHeight();
        i11 = ((org.telegram.ui.ActionBar.f3) ke0Var).backgroundPaddingTop;
        int i22 = i11 + dp;
        float dp2 = AndroidUtilities.dp(12.0f);
        i12 = ((org.telegram.ui.ActionBar.f3) ke0Var).backgroundPaddingTop;
        if (i12 + i21 < dp2) {
            i19 = ((org.telegram.ui.ActionBar.f3) ke0Var).backgroundPaddingTop;
            f9 = 1.0f - Math.min(1.0f, ((dp2 - i21) - i19) / dp2);
        } else {
            f9 = 1.0f;
        }
        int i23 = AndroidUtilities.statusBarHeight;
        int i24 = i21 + i23;
        int i25 = i22 - i23;
        drawable = ((org.telegram.ui.ActionBar.f3) ke0Var).shadowDrawable;
        drawable.setBounds(0, i24, getMeasuredWidth(), i25);
        drawable2 = ((org.telegram.ui.ActionBar.f3) ke0Var).shadowDrawable;
        drawable2.draw(canvas);
        if (f9 != 1.0f) {
            paint.setColor(ke0Var.getThemedColor(org.telegram.ui.ActionBar.g6.h5));
            i15 = ((org.telegram.ui.ActionBar.f3) ke0Var).backgroundPaddingLeft;
            i16 = ((org.telegram.ui.ActionBar.f3) ke0Var).backgroundPaddingTop;
            float f10 = i16 + i24;
            int measuredWidth = getMeasuredWidth();
            i17 = ((org.telegram.ui.ActionBar.f3) ke0Var).backgroundPaddingLeft;
            float f11 = measuredWidth - i17;
            i18 = ((org.telegram.ui.ActionBar.f3) ke0Var).backgroundPaddingTop;
            float dp3 = AndroidUtilities.dp(24.0f) + i18 + i24;
            RectF rectF = this.a;
            rectF.set(i15, f10, f11, dp3);
            float f12 = dp2 * f9;
            canvas.drawRoundRect(rectF, f12, f12, paint);
        }
        int themedColor = ke0Var.getThemedColor(org.telegram.ui.ActionBar.g6.h5);
        paint.setColor(Color.argb((int) (ke0Var.e.getAlpha() * 255.0f), (int) (Color.red(themedColor) * 0.8f), (int) (Color.green(themedColor) * 0.8f), (int) (Color.blue(themedColor) * 0.8f)));
        i13 = ((org.telegram.ui.ActionBar.f3) ke0Var).backgroundPaddingLeft;
        float f13 = i13;
        int measuredWidth2 = getMeasuredWidth();
        i14 = ((org.telegram.ui.ActionBar.f3) ke0Var).backgroundPaddingLeft;
        canvas.drawRect(f13, 0.0f, measuredWidth2 - i14, AndroidUtilities.statusBarHeight, paint);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ke0 ke0Var = this.d;
            if (ke0Var.w != 0 && motionEvent.getY() < ke0Var.w && ke0Var.e.getAlpha() == 0.0f) {
                ke0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ke0 ke0Var = this.d;
        ke0Var.s = true;
        super.onLayout(z10, i10, i11, i12, i13);
        ke0Var.s = false;
        ke0Var.G(false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i11);
        this.b = true;
        ke0 ke0Var = this.d;
        ce0 ce0Var = ke0Var.c;
        i12 = ((org.telegram.ui.ActionBar.f3) ke0Var).backgroundPaddingLeft;
        int i14 = AndroidUtilities.statusBarHeight;
        i13 = ((org.telegram.ui.ActionBar.f3) ke0Var).backgroundPaddingLeft;
        setPadding(i12, i14, i13, 0);
        this.b = false;
        int paddingTop = size - getPaddingTop();
        View.MeasureSpec.getSize(i10);
        ((FrameLayout.LayoutParams) ke0Var.f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        this.b = true;
        int dp = AndroidUtilities.dp(80.0f);
        he0 he0Var = ke0Var.b;
        int i15 = he0Var.a.A;
        for (int i16 = 0; i16 < i15; i16++) {
            ViewGroup a2 = he0Var.a(this.c, i16);
            a2.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
            dp += a2.getMeasuredHeight();
        }
        int i17 = dp < paddingTop ? paddingTop - dp : paddingTop / 5;
        if (ce0Var.getPaddingTop() != i17) {
            ce0Var.getPaddingTop();
            ce0Var.setPadding(0, i17, 0, 0);
        }
        this.b = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.d.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.b) {
            return;
        }
        super.requestLayout();
    }
}
