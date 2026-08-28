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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class m50 extends FrameLayout {
    public final RectF a;
    public boolean b;
    public Boolean c;
    public final /* synthetic */ a60 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m50(a60 a60Var, Context context) {
        super(context);
        this.d = a60Var;
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
        int i9;
        int i10;
        float f10;
        int i11;
        Drawable drawable;
        Drawable drawable2;
        boolean z10;
        Boolean bool;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        a60 a60Var = this.d;
        int i22 = a60Var.V;
        i9 = ((org.telegram.ui.ActionBar.f3) a60Var).backgroundPaddingTop;
        int dp = (i22 - i9) - AndroidUtilities.dp(8.0f);
        int dp2 = AndroidUtilities.dp(36.0f) + getMeasuredHeight();
        i10 = ((org.telegram.ui.ActionBar.f3) a60Var).backgroundPaddingTop;
        int i23 = i10 + dp2;
        int i24 = AndroidUtilities.statusBarHeight;
        int i25 = dp + i24;
        int i26 = i23 - i24;
        if (this.b) {
            i18 = ((org.telegram.ui.ActionBar.f3) a60Var).backgroundPaddingTop;
            int i27 = i18 + i25;
            int i28 = AndroidUtilities.statusBarHeight;
            int i29 = i28 * 2;
            if (i27 < i29) {
                i21 = ((org.telegram.ui.ActionBar.f3) a60Var).backgroundPaddingTop;
                int min = Math.min(i28, (i29 - i25) - i21);
                i25 -= min;
                i26 += min;
                f10 = 1.0f - Math.min(1.0f, (min * 2) / AndroidUtilities.statusBarHeight);
            } else {
                f10 = 1.0f;
            }
            i19 = ((org.telegram.ui.ActionBar.f3) a60Var).backgroundPaddingTop;
            int i30 = i19 + i25;
            int i31 = AndroidUtilities.statusBarHeight;
            if (i30 < i31) {
                i20 = ((org.telegram.ui.ActionBar.f3) a60Var).backgroundPaddingTop;
                i11 = Math.min(i31, (i31 - i25) - i20);
                drawable = ((org.telegram.ui.ActionBar.f3) a60Var).shadowDrawable;
                drawable.setBounds(0, i25, getMeasuredWidth(), AndroidUtilities.dp(10.0f) + i26 + AndroidUtilities.navigationBarHeight);
                drawable2 = ((org.telegram.ui.ActionBar.f3) a60Var).shadowDrawable;
                drawable2.draw(canvas);
                if (f10 != 1.0f) {
                    org.telegram.ui.ActionBar.f6.t0.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.h5, false));
                    i14 = ((org.telegram.ui.ActionBar.f3) a60Var).backgroundPaddingLeft;
                    i15 = ((org.telegram.ui.ActionBar.f3) a60Var).backgroundPaddingTop;
                    float f11 = i15 + i25;
                    int measuredWidth = getMeasuredWidth();
                    i16 = ((org.telegram.ui.ActionBar.f3) a60Var).backgroundPaddingLeft;
                    float f12 = measuredWidth - i16;
                    i17 = ((org.telegram.ui.ActionBar.f3) a60Var).backgroundPaddingTop;
                    float dp3 = AndroidUtilities.dp(24.0f) + i17 + i25;
                    RectF rectF = this.a;
                    rectF.set(i14, f11, f12, dp3);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f10, AndroidUtilities.dp(12.0f) * f10, org.telegram.ui.ActionBar.f6.t0);
                }
                if (i11 > 0) {
                    org.telegram.ui.ActionBar.f6.t0.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.h5, false));
                    i12 = ((org.telegram.ui.ActionBar.f3) a60Var).backgroundPaddingLeft;
                    float f13 = i12;
                    float f14 = AndroidUtilities.statusBarHeight - i11;
                    int measuredWidth2 = getMeasuredWidth();
                    i13 = ((org.telegram.ui.ActionBar.f3) a60Var).backgroundPaddingLeft;
                    canvas.drawRect(f13, f14, measuredWidth2 - i13, AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.f6.t0);
                }
                z10 = i11 <= AndroidUtilities.statusBarHeight / 2;
                bool = this.c;
                if (bool == null && bool.booleanValue() == z10) {
                    return;
                }
                boolean z11 = AndroidUtilities.computePerceivedBrightness(a60Var.getThemedColor(org.telegram.ui.ActionBar.f6.h5)) <= 0.721f;
                boolean z12 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.v(a60Var.getThemedColor(org.telegram.ui.ActionBar.f6.s8), 855638016)) > 0.721f;
                this.c = Boolean.valueOf(z10);
                if (!z10) {
                    z11 = z12;
                }
                AndroidUtilities.setLightStatusBar(a60Var.getWindow(), z11);
            }
        } else {
            f10 = 1.0f;
        }
        i11 = 0;
        drawable = ((org.telegram.ui.ActionBar.f3) a60Var).shadowDrawable;
        drawable.setBounds(0, i25, getMeasuredWidth(), AndroidUtilities.dp(10.0f) + i26 + AndroidUtilities.navigationBarHeight);
        drawable2 = ((org.telegram.ui.ActionBar.f3) a60Var).shadowDrawable;
        drawable2.draw(canvas);
        if (f10 != 1.0f) {
        }
        if (i11 > 0) {
        }
        if (i11 <= AndroidUtilities.statusBarHeight / 2) {
        }
        bool = this.c;
        if (bool == null) {
        }
        if (AndroidUtilities.computePerceivedBrightness(a60Var.getThemedColor(org.telegram.ui.ActionBar.f6.h5)) <= 0.721f) {
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.v(a60Var.getThemedColor(org.telegram.ui.ActionBar.f6.s8), 855638016)) > 0.721f) {
        }
        this.c = Boolean.valueOf(z10);
        if (!z10) {
        }
        AndroidUtilities.setLightStatusBar(a60Var.getWindow(), z11);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            a60 a60Var = this.d;
            if (a60Var.V != 0 && motionEvent.getY() < a60Var.V) {
                a60Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        a60.N(this.d);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        a60 a60Var = this.d;
        a60Var.W = true;
        i11 = ((org.telegram.ui.ActionBar.f3) a60Var).backgroundPaddingLeft;
        int i13 = AndroidUtilities.statusBarHeight;
        i12 = ((org.telegram.ui.ActionBar.f3) a60Var).backgroundPaddingLeft;
        setPadding(i11, i13, i12, 0);
        a60Var.W = false;
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
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
