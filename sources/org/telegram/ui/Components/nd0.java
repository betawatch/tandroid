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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class nd0 extends FrameLayout {
    public final RectF a;
    public boolean b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ wd0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd0(wd0 wd0Var, Activity activity, Activity activity2) {
        super(activity);
        this.d = wd0Var;
        this.c = activity2;
        this.a = new RectF();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i9;
        int i10;
        int i11;
        float f10;
        Drawable drawable;
        Drawable drawable2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        wd0 wd0Var = this.d;
        Paint paint = wd0Var.v;
        int i19 = wd0Var.w;
        i9 = ((org.telegram.ui.ActionBar.f3) wd0Var).backgroundPaddingTop;
        int i20 = i19 - i9;
        int dp = AndroidUtilities.dp(30.0f) + getMeasuredHeight();
        i10 = ((org.telegram.ui.ActionBar.f3) wd0Var).backgroundPaddingTop;
        int i21 = i10 + dp;
        float dp2 = AndroidUtilities.dp(12.0f);
        i11 = ((org.telegram.ui.ActionBar.f3) wd0Var).backgroundPaddingTop;
        if (i11 + i20 < dp2) {
            i18 = ((org.telegram.ui.ActionBar.f3) wd0Var).backgroundPaddingTop;
            f10 = 1.0f - Math.min(1.0f, ((dp2 - i20) - i18) / dp2);
        } else {
            f10 = 1.0f;
        }
        int i22 = AndroidUtilities.statusBarHeight;
        int i23 = i20 + i22;
        int i24 = i21 - i22;
        drawable = ((org.telegram.ui.ActionBar.f3) wd0Var).shadowDrawable;
        drawable.setBounds(0, i23, getMeasuredWidth(), i24);
        drawable2 = ((org.telegram.ui.ActionBar.f3) wd0Var).shadowDrawable;
        drawable2.draw(canvas);
        if (f10 != 1.0f) {
            paint.setColor(wd0Var.getThemedColor(org.telegram.ui.ActionBar.f6.h5));
            i14 = ((org.telegram.ui.ActionBar.f3) wd0Var).backgroundPaddingLeft;
            i15 = ((org.telegram.ui.ActionBar.f3) wd0Var).backgroundPaddingTop;
            float f11 = i15 + i23;
            int measuredWidth = getMeasuredWidth();
            i16 = ((org.telegram.ui.ActionBar.f3) wd0Var).backgroundPaddingLeft;
            float f12 = measuredWidth - i16;
            i17 = ((org.telegram.ui.ActionBar.f3) wd0Var).backgroundPaddingTop;
            float dp3 = AndroidUtilities.dp(24.0f) + i17 + i23;
            RectF rectF = this.a;
            rectF.set(i14, f11, f12, dp3);
            float f13 = dp2 * f10;
            canvas.drawRoundRect(rectF, f13, f13, paint);
        }
        int themedColor = wd0Var.getThemedColor(org.telegram.ui.ActionBar.f6.h5);
        paint.setColor(Color.argb((int) (wd0Var.e.getAlpha() * 255.0f), (int) (Color.red(themedColor) * 0.8f), (int) (Color.green(themedColor) * 0.8f), (int) (Color.blue(themedColor) * 0.8f)));
        i12 = ((org.telegram.ui.ActionBar.f3) wd0Var).backgroundPaddingLeft;
        float f14 = i12;
        int measuredWidth2 = getMeasuredWidth();
        i13 = ((org.telegram.ui.ActionBar.f3) wd0Var).backgroundPaddingLeft;
        canvas.drawRect(f14, 0.0f, measuredWidth2 - i13, AndroidUtilities.statusBarHeight, paint);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            wd0 wd0Var = this.d;
            if (wd0Var.w != 0 && motionEvent.getY() < wd0Var.w && wd0Var.e.getAlpha() == 0.0f) {
                wd0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        wd0 wd0Var = this.d;
        wd0Var.s = true;
        super.onLayout(z10, i9, i10, i11, i12);
        wd0Var.s = false;
        wd0Var.G(false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        this.b = true;
        wd0 wd0Var = this.d;
        od0 od0Var = wd0Var.c;
        i11 = ((org.telegram.ui.ActionBar.f3) wd0Var).backgroundPaddingLeft;
        int i13 = AndroidUtilities.statusBarHeight;
        i12 = ((org.telegram.ui.ActionBar.f3) wd0Var).backgroundPaddingLeft;
        setPadding(i11, i13, i12, 0);
        this.b = false;
        int paddingTop = size - getPaddingTop();
        View.MeasureSpec.getSize(i9);
        ((FrameLayout.LayoutParams) wd0Var.f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.b = true;
        int dp = AndroidUtilities.dp(80.0f);
        td0 td0Var = wd0Var.b;
        int i14 = td0Var.a.A;
        for (int i15 = 0; i15 < i14; i15++) {
            ViewGroup a2 = td0Var.a(this.c, i15);
            a2.measure(i9, View.MeasureSpec.makeMeasureSpec(0, 0));
            dp += a2.getMeasuredHeight();
        }
        int i16 = dp < paddingTop ? paddingTop - dp : paddingTop / 5;
        if (od0Var.getPaddingTop() != i16) {
            od0Var.getPaddingTop();
            od0Var.setPadding(0, i16, 0, 0);
        }
        this.b = false;
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
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
