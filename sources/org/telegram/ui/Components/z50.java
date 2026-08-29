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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class z50 extends FrameLayout {
    public final RectF a;
    public boolean b;
    public Boolean c;
    public final /* synthetic */ n60 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z50(n60 n60Var, Context context) {
        super(context);
        this.d = n60Var;
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
        float f9;
        int i12;
        Drawable drawable;
        Drawable drawable2;
        boolean z10;
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
        n60 n60Var = this.d;
        int i23 = n60Var.V;
        i10 = ((org.telegram.ui.ActionBar.f3) n60Var).backgroundPaddingTop;
        int dp = (i23 - i10) - AndroidUtilities.dp(8.0f);
        int dp2 = AndroidUtilities.dp(36.0f) + getMeasuredHeight();
        i11 = ((org.telegram.ui.ActionBar.f3) n60Var).backgroundPaddingTop;
        int i24 = i11 + dp2;
        int i25 = AndroidUtilities.statusBarHeight;
        int i26 = dp + i25;
        int i27 = i24 - i25;
        if (this.b) {
            i19 = ((org.telegram.ui.ActionBar.f3) n60Var).backgroundPaddingTop;
            int i28 = i19 + i26;
            int i29 = AndroidUtilities.statusBarHeight;
            int i30 = i29 * 2;
            if (i28 < i30) {
                i22 = ((org.telegram.ui.ActionBar.f3) n60Var).backgroundPaddingTop;
                int min = Math.min(i29, (i30 - i26) - i22);
                i26 -= min;
                i27 += min;
                f9 = 1.0f - Math.min(1.0f, (min * 2) / AndroidUtilities.statusBarHeight);
            } else {
                f9 = 1.0f;
            }
            i20 = ((org.telegram.ui.ActionBar.f3) n60Var).backgroundPaddingTop;
            int i31 = i20 + i26;
            int i32 = AndroidUtilities.statusBarHeight;
            if (i31 < i32) {
                i21 = ((org.telegram.ui.ActionBar.f3) n60Var).backgroundPaddingTop;
                i12 = Math.min(i32, (i32 - i26) - i21);
                drawable = ((org.telegram.ui.ActionBar.f3) n60Var).shadowDrawable;
                drawable.setBounds(0, i26, getMeasuredWidth(), AndroidUtilities.dp(10.0f) + i27 + AndroidUtilities.navigationBarHeight);
                drawable2 = ((org.telegram.ui.ActionBar.f3) n60Var).shadowDrawable;
                drawable2.draw(canvas);
                if (f9 != 1.0f) {
                    org.telegram.ui.ActionBar.g6.t0.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.h5, false));
                    i15 = ((org.telegram.ui.ActionBar.f3) n60Var).backgroundPaddingLeft;
                    i16 = ((org.telegram.ui.ActionBar.f3) n60Var).backgroundPaddingTop;
                    float f10 = i16 + i26;
                    int measuredWidth = getMeasuredWidth();
                    i17 = ((org.telegram.ui.ActionBar.f3) n60Var).backgroundPaddingLeft;
                    float f11 = measuredWidth - i17;
                    i18 = ((org.telegram.ui.ActionBar.f3) n60Var).backgroundPaddingTop;
                    float dp3 = AndroidUtilities.dp(24.0f) + i18 + i26;
                    RectF rectF = this.a;
                    rectF.set(i15, f10, f11, dp3);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f9, AndroidUtilities.dp(12.0f) * f9, org.telegram.ui.ActionBar.g6.t0);
                }
                if (i12 > 0) {
                    org.telegram.ui.ActionBar.g6.t0.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.h5, false));
                    i13 = ((org.telegram.ui.ActionBar.f3) n60Var).backgroundPaddingLeft;
                    float f12 = i13;
                    float f13 = AndroidUtilities.statusBarHeight - i12;
                    int measuredWidth2 = getMeasuredWidth();
                    i14 = ((org.telegram.ui.ActionBar.f3) n60Var).backgroundPaddingLeft;
                    canvas.drawRect(f12, f13, measuredWidth2 - i14, AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.g6.t0);
                }
                z10 = i12 <= AndroidUtilities.statusBarHeight / 2;
                bool = this.c;
                if (bool == null && bool.booleanValue() == z10) {
                    return;
                }
                boolean z11 = AndroidUtilities.computePerceivedBrightness(n60Var.getThemedColor(org.telegram.ui.ActionBar.g6.h5)) <= 0.721f;
                boolean z12 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v(n60Var.getThemedColor(org.telegram.ui.ActionBar.g6.s8), 855638016)) > 0.721f;
                this.c = Boolean.valueOf(z10);
                if (!z10) {
                    z11 = z12;
                }
                AndroidUtilities.setLightStatusBar(n60Var.getWindow(), z11);
            }
        } else {
            f9 = 1.0f;
        }
        i12 = 0;
        drawable = ((org.telegram.ui.ActionBar.f3) n60Var).shadowDrawable;
        drawable.setBounds(0, i26, getMeasuredWidth(), AndroidUtilities.dp(10.0f) + i27 + AndroidUtilities.navigationBarHeight);
        drawable2 = ((org.telegram.ui.ActionBar.f3) n60Var).shadowDrawable;
        drawable2.draw(canvas);
        if (f9 != 1.0f) {
        }
        if (i12 > 0) {
        }
        if (i12 <= AndroidUtilities.statusBarHeight / 2) {
        }
        bool = this.c;
        if (bool == null) {
        }
        if (AndroidUtilities.computePerceivedBrightness(n60Var.getThemedColor(org.telegram.ui.ActionBar.g6.h5)) <= 0.721f) {
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v(n60Var.getThemedColor(org.telegram.ui.ActionBar.g6.s8), 855638016)) > 0.721f) {
        }
        this.c = Boolean.valueOf(z10);
        if (!z10) {
        }
        AndroidUtilities.setLightStatusBar(n60Var.getWindow(), z11);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            n60 n60Var = this.d;
            if (n60Var.V != 0 && motionEvent.getY() < n60Var.V) {
                n60Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        n60.O(this.d);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i11);
        n60 n60Var = this.d;
        n60Var.W = true;
        i12 = ((org.telegram.ui.ActionBar.f3) n60Var).backgroundPaddingLeft;
        int i14 = AndroidUtilities.statusBarHeight;
        i13 = ((org.telegram.ui.ActionBar.f3) n60Var).backgroundPaddingLeft;
        setPadding(i12, i14, i13, 0);
        n60Var.W = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        this.b = true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.d.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.d.W) {
            return;
        }
        super.requestLayout();
    }
}
