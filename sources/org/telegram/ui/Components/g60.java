package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class g60 extends FrameLayout {
    public final RectF a;
    public boolean b;
    public Boolean c;
    public final /* synthetic */ u60 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g60(u60 u60Var, Context context) {
        super(context);
        this.d = u60Var;
        this.a = new RectF();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        float f10;
        int i12;
        Drawable drawable;
        Drawable drawable2;
        boolean z4;
        Boolean bool;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        u60 u60Var = this.d;
        int i23 = u60Var.W;
        i10 = ((org.telegram.ui.ActionBar.h3) u60Var).backgroundPaddingTop;
        int dp = (i23 - i10) - AndroidUtilities.dp(8.0f);
        int dp2 = AndroidUtilities.dp(36.0f) + getMeasuredHeight();
        i11 = ((org.telegram.ui.ActionBar.h3) u60Var).backgroundPaddingTop;
        int i24 = i11 + dp2;
        int i25 = AndroidUtilities.statusBarHeight;
        int i26 = dp + i25;
        int i27 = i24 - i25;
        if (this.b) {
            i19 = ((org.telegram.ui.ActionBar.h3) u60Var).backgroundPaddingTop;
            int i28 = i19 + i26;
            int i29 = AndroidUtilities.statusBarHeight;
            int i30 = i29 * 2;
            if (i28 < i30) {
                i22 = ((org.telegram.ui.ActionBar.h3) u60Var).backgroundPaddingTop;
                int min = Math.min(i29, (i30 - i26) - i22);
                i26 -= min;
                i27 += min;
                f10 = 1.0f - Math.min(1.0f, (min * 2) / AndroidUtilities.statusBarHeight);
            } else {
                f10 = 1.0f;
            }
            i20 = ((org.telegram.ui.ActionBar.h3) u60Var).backgroundPaddingTop;
            int i31 = i20 + i26;
            int i32 = AndroidUtilities.statusBarHeight;
            if (i31 < i32) {
                i21 = ((org.telegram.ui.ActionBar.h3) u60Var).backgroundPaddingTop;
                i12 = Math.min(i32, (i32 - i26) - i21);
                drawable = ((org.telegram.ui.ActionBar.h3) u60Var).shadowDrawable;
                drawable.setBounds(0, i26, getMeasuredWidth(), AndroidUtilities.dp(10.0f) + i27 + AndroidUtilities.navigationBarHeight);
                drawable2 = ((org.telegram.ui.ActionBar.h3) u60Var).shadowDrawable;
                drawable2.draw(canvas);
                if (f10 != 1.0f) {
                    org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.h5, false));
                    i15 = ((org.telegram.ui.ActionBar.h3) u60Var).backgroundPaddingLeft;
                    i16 = ((org.telegram.ui.ActionBar.h3) u60Var).backgroundPaddingTop;
                    float f11 = i16 + i26;
                    int measuredWidth = getMeasuredWidth();
                    i17 = ((org.telegram.ui.ActionBar.h3) u60Var).backgroundPaddingLeft;
                    float f12 = measuredWidth - i17;
                    i18 = ((org.telegram.ui.ActionBar.h3) u60Var).backgroundPaddingTop;
                    float dp3 = AndroidUtilities.dp(24.0f) + i18 + i26;
                    RectF rectF = this.a;
                    rectF.set(i15, f11, f12, dp3);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f10, AndroidUtilities.dp(12.0f) * f10, org.telegram.ui.ActionBar.k6.t0);
                }
                if (i12 > 0) {
                    org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.h5, false));
                    i13 = ((org.telegram.ui.ActionBar.h3) u60Var).backgroundPaddingLeft;
                    float f13 = i13;
                    float f14 = AndroidUtilities.statusBarHeight - i12;
                    int measuredWidth2 = getMeasuredWidth();
                    i14 = ((org.telegram.ui.ActionBar.h3) u60Var).backgroundPaddingLeft;
                    canvas.drawRect(f13, f14, measuredWidth2 - i14, AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.k6.t0);
                }
                z4 = i12 <= AndroidUtilities.statusBarHeight / 2;
                bool = this.c;
                if (bool == null && bool.booleanValue() == z4) {
                    return;
                }
                boolean z10 = AndroidUtilities.computePerceivedBrightness(u60Var.getThemedColor(org.telegram.ui.ActionBar.k6.h5)) <= 0.721f;
                boolean z11 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.v(u60Var.getThemedColor(org.telegram.ui.ActionBar.k6.s8), 855638016)) > 0.721f;
                this.c = Boolean.valueOf(z4);
                if (!z4) {
                    z10 = z11;
                }
                AndroidUtilities.setLightStatusBar(u60Var.getWindow(), z10);
            }
        } else {
            f10 = 1.0f;
        }
        i12 = 0;
        drawable = ((org.telegram.ui.ActionBar.h3) u60Var).shadowDrawable;
        drawable.setBounds(0, i26, getMeasuredWidth(), AndroidUtilities.dp(10.0f) + i27 + AndroidUtilities.navigationBarHeight);
        drawable2 = ((org.telegram.ui.ActionBar.h3) u60Var).shadowDrawable;
        drawable2.draw(canvas);
        if (f10 != 1.0f) {
        }
        if (i12 > 0) {
        }
        if (i12 <= AndroidUtilities.statusBarHeight / 2) {
        }
        bool = this.c;
        if (bool == null) {
        }
        if (AndroidUtilities.computePerceivedBrightness(u60Var.getThemedColor(org.telegram.ui.ActionBar.k6.h5)) <= 0.721f) {
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.v(u60Var.getThemedColor(org.telegram.ui.ActionBar.k6.s8), 855638016)) > 0.721f) {
        }
        this.c = Boolean.valueOf(z4);
        if (!z4) {
        }
        AndroidUtilities.setLightStatusBar(u60Var.getWindow(), z10);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            u60 u60Var = this.d;
            if (u60Var.W != 0 && motionEvent.getY() < u60Var.W) {
                u60Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        u60.O(this.d);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i11);
        u60 u60Var = this.d;
        u60Var.X = true;
        i12 = ((org.telegram.ui.ActionBar.h3) u60Var).backgroundPaddingLeft;
        int i14 = AndroidUtilities.statusBarHeight;
        i13 = ((org.telegram.ui.ActionBar.h3) u60Var).backgroundPaddingLeft;
        setPadding(i12, i14, i13, 0);
        u60Var.X = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        this.b = true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.d.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.d.X) {
            return;
        }
        super.requestLayout();
    }
}
