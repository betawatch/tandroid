package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public class m61 extends FrameLayout {
    public ValueAnimator a;
    public float b;
    public boolean c;
    public Boolean d;
    public final /* synthetic */ o61 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m61(o61 o61Var, Context context) {
        super(context);
        this.e = o61Var;
        this.c = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0, getPaddingTop(), getMeasuredWidth(), getMeasuredHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int i13;
        float f7;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        canvas.save();
        o61 o61Var = this.e;
        Drawable drawable = o61Var.h;
        RectF rectF = o61Var.x;
        int i22 = o61Var.y;
        i10 = ((org.telegram.ui.ActionBar.f3) o61Var).backgroundPaddingTop;
        int dp = AndroidUtilities.dp(6.0f) + (i22 - i10);
        int i23 = o61Var.y;
        i11 = ((org.telegram.ui.ActionBar.f3) o61Var).backgroundPaddingTop;
        int dp2 = (i23 - i11) - AndroidUtilities.dp(13.0f);
        int dp3 = AndroidUtilities.dp(50.0f) + getMeasuredHeight();
        i12 = ((org.telegram.ui.ActionBar.f3) o61Var).backgroundPaddingTop;
        int i24 = i12 + dp3;
        int i25 = AndroidUtilities.statusBarHeight;
        int i26 = dp2 + i25;
        int i27 = dp + i25;
        int i28 = i24 - i25;
        i13 = ((org.telegram.ui.ActionBar.f3) o61Var).backgroundPaddingTop;
        float translationY = getTranslationY() + i13 + i26;
        int i29 = AndroidUtilities.statusBarHeight;
        if (translationY < i29 * 2) {
            i21 = ((org.telegram.ui.ActionBar.f3) o61Var).backgroundPaddingTop;
            int min = (int) Math.min(i29, ((r8 - i26) - i21) - getTranslationY());
            i26 -= min;
            i28 += min;
            f7 = 1.0f - Math.min(1.0f, (min * 2) / AndroidUtilities.statusBarHeight);
        } else {
            f7 = 1.0f;
        }
        i14 = ((org.telegram.ui.ActionBar.f3) o61Var).backgroundPaddingTop;
        float translationY2 = getTranslationY() + i14 + i26;
        float f10 = AndroidUtilities.statusBarHeight;
        if (translationY2 < f10) {
            i20 = ((org.telegram.ui.ActionBar.f3) o61Var).backgroundPaddingTop;
            i15 = (int) Math.min(f10, ((r7 - i26) - i20) - getTranslationY());
        } else {
            i15 = 0;
        }
        drawable.setBounds(0, i26, getMeasuredWidth(), i28);
        drawable.draw(canvas);
        if (!o61Var.S) {
            if (f7 != 1.0f) {
                org.telegram.ui.ActionBar.j6.t0.setColor(o61Var.F);
                i16 = ((org.telegram.ui.ActionBar.f3) o61Var).backgroundPaddingLeft;
                i17 = ((org.telegram.ui.ActionBar.f3) o61Var).backgroundPaddingTop;
                int measuredWidth = getMeasuredWidth();
                i18 = ((org.telegram.ui.ActionBar.f3) o61Var).backgroundPaddingLeft;
                float f11 = measuredWidth - i18;
                i19 = ((org.telegram.ui.ActionBar.f3) o61Var).backgroundPaddingTop;
                rectF.set(i16, i17 + i26, f11, AndroidUtilities.dp(24.0f) + i19 + i26);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.j6.t0);
            }
            int dp4 = AndroidUtilities.dp(36.0f);
            rectF.set((getMeasuredWidth() - dp4) / 2, i27, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + i27);
            org.telegram.ui.ActionBar.j6.t0.setColor(org.telegram.ui.ActionBar.j6.w0(null, o61Var.I, false));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.t0);
        }
        if (i15 > 0) {
            org.telegram.ui.ActionBar.j6.t0.setColor(o61Var.F);
        }
        boolean z10 = i15 > AndroidUtilities.statusBarHeight / 2;
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z10) {
            boolean z11 = AndroidUtilities.computePerceivedBrightness(o61Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5)) > 0.721f;
            boolean z12 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v(o61Var.getThemedColor(org.telegram.ui.ActionBar.j6.s8), 855638016)) > 0.721f;
            this.d = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            AndroidUtilities.setLightStatusBar(o61Var.getWindow(), z11);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            o61 o61Var = this.e;
            if (y3 < o61Var.y) {
                o61Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.e.L();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        boolean z10;
        int dp;
        int size = View.MeasureSpec.getSize(i11);
        int i14 = 1;
        this.c = true;
        o61 o61Var = this.e;
        bi.o0 o0Var = o61Var.d;
        i12 = ((org.telegram.ui.ActionBar.f3) o61Var).backgroundPaddingLeft;
        int i15 = AndroidUtilities.statusBarHeight;
        i13 = ((org.telegram.ui.ActionBar.f3) o61Var).backgroundPaddingLeft;
        setPadding(i12, i15, i13, 0);
        this.c = false;
        int paddingTop = size - getPaddingTop();
        z10 = ((org.telegram.ui.ActionBar.f3) o61Var).keyboardVisible;
        if (z10) {
            dp = AndroidUtilities.dp(8.0f);
            o61Var.setAllowNestedScroll(false);
            int i16 = o61Var.y;
            if (i16 != 0) {
                float f7 = i16;
                this.b = f7;
                setTranslationY(f7);
                ValueAnimator valueAnimator = this.a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b, 0.0f);
                this.a = ofFloat;
                ofFloat.addUpdateListener(new e61(i14, this));
                this.a.setDuration(250L);
                this.a.setInterpolator(org.telegram.ui.ActionBar.p1.w);
                this.a.addListener(new k61(this, 1));
                this.a.start();
            } else if (this.a != null) {
                setTranslationY(this.b);
            }
        } else {
            dp = (paddingTop - ((paddingTop / 5) * 3)) + AndroidUtilities.dp(8.0f);
            o61Var.setAllowNestedScroll(true);
        }
        if (o0Var.getPaddingTop() != dp) {
            this.c = true;
            o0Var.setPadding(0, dp, 0, 0);
            this.c = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.e.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.c) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        invalidate();
    }
}
