package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class yx0 extends FrameLayout {
    public int a;
    public final RectF b;
    public boolean c;
    public Boolean d;
    public final /* synthetic */ gy0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx0(gy0 gy0Var, Context context) {
        super(context);
        this.e = gy0Var;
        this.b = new RectF();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0133  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        float f7;
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
        gy0 gy0Var = this.e;
        int i23 = gy0Var.e0;
        i10 = ((org.telegram.ui.ActionBar.f3) gy0Var).backgroundPaddingTop;
        int dp = AndroidUtilities.dp(6.0f) + (i23 - i10);
        int i24 = gy0Var.e0;
        i11 = ((org.telegram.ui.ActionBar.f3) gy0Var).backgroundPaddingTop;
        int dp2 = (i24 - i11) - AndroidUtilities.dp(13.0f);
        int i25 = AndroidUtilities.statusBarHeight;
        int i26 = dp2 + i25;
        int i27 = dp + i25;
        if (this.c) {
            i19 = ((org.telegram.ui.ActionBar.f3) gy0Var).backgroundPaddingTop;
            int i28 = i19 + i26;
            int i29 = AndroidUtilities.statusBarHeight;
            int i30 = i29 * 2;
            if (i28 < i30) {
                i22 = ((org.telegram.ui.ActionBar.f3) gy0Var).backgroundPaddingTop;
                i26 -= Math.min(i29, (i30 - i26) - i22);
                f7 = 1.0f - Math.min(1.0f, (r3 * 2) / AndroidUtilities.statusBarHeight);
            } else {
                f7 = 1.0f;
            }
            i20 = ((org.telegram.ui.ActionBar.f3) gy0Var).backgroundPaddingTop;
            int i31 = i20 + i26;
            int i32 = AndroidUtilities.statusBarHeight;
            if (i31 < i32) {
                i21 = ((org.telegram.ui.ActionBar.f3) gy0Var).backgroundPaddingTop;
                i12 = Math.min(i32, (i32 - i26) - i21);
                drawable = ((org.telegram.ui.ActionBar.f3) gy0Var).shadowDrawable;
                drawable.setBounds(0, i26, getMeasuredWidth(), getMeasuredHeight());
                drawable2 = ((org.telegram.ui.ActionBar.f3) gy0Var).shadowDrawable;
                drawable2.draw(canvas);
                RectF rectF = this.b;
                if (f7 != 1.0f) {
                    org.telegram.ui.ActionBar.j6.t0.setColor(gy0Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5));
                    i15 = ((org.telegram.ui.ActionBar.f3) gy0Var).backgroundPaddingLeft;
                    i16 = ((org.telegram.ui.ActionBar.f3) gy0Var).backgroundPaddingTop;
                    int measuredWidth = getMeasuredWidth();
                    i17 = ((org.telegram.ui.ActionBar.f3) gy0Var).backgroundPaddingLeft;
                    float f10 = measuredWidth - i17;
                    i18 = ((org.telegram.ui.ActionBar.f3) gy0Var).backgroundPaddingTop;
                    rectF.set(i15, i16 + i26, f10, AndroidUtilities.dp(24.0f) + i18 + i26);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.j6.t0);
                }
                int dp3 = AndroidUtilities.dp(36.0f);
                rectF.set((getMeasuredWidth() - dp3) / 2, i27, (getMeasuredWidth() + dp3) / 2, AndroidUtilities.dp(4.0f) + i27);
                org.telegram.ui.ActionBar.j6.t0.setColor(gy0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ii));
                org.telegram.ui.ActionBar.j6.t0.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, (i27 - AndroidUtilities.statusBarHeight) / AndroidUtilities.dp(16.0f))) * r1.getAlpha()));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.t0);
                z10 = i12 <= AndroidUtilities.statusBarHeight / 2;
                bool = this.d;
                if (bool != null || bool.booleanValue() != z10) {
                    boolean z11 = AndroidUtilities.computePerceivedBrightness(gy0Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5)) <= 0.721f;
                    boolean z12 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v(gy0Var.getThemedColor(org.telegram.ui.ActionBar.j6.s8), 855638016)) > 0.721f;
                    this.d = Boolean.valueOf(z10);
                    if (!z10) {
                        z11 = z12;
                    }
                    AndroidUtilities.setLightStatusBar(gy0Var.getWindow(), z11);
                }
                if (i12 <= 0) {
                    org.telegram.ui.ActionBar.j6.t0.setColor(gy0Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5));
                    i13 = ((org.telegram.ui.ActionBar.f3) gy0Var).backgroundPaddingLeft;
                    float f11 = i13;
                    float f12 = AndroidUtilities.statusBarHeight - i12;
                    int measuredWidth2 = getMeasuredWidth();
                    i14 = ((org.telegram.ui.ActionBar.f3) gy0Var).backgroundPaddingLeft;
                    canvas.drawRect(f11, f12, measuredWidth2 - i14, AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.j6.t0);
                    return;
                }
                return;
            }
        } else {
            f7 = 1.0f;
        }
        i12 = 0;
        drawable = ((org.telegram.ui.ActionBar.f3) gy0Var).shadowDrawable;
        drawable.setBounds(0, i26, getMeasuredWidth(), getMeasuredHeight());
        drawable2 = ((org.telegram.ui.ActionBar.f3) gy0Var).shadowDrawable;
        drawable2.draw(canvas);
        RectF rectF2 = this.b;
        if (f7 != 1.0f) {
        }
        int dp32 = AndroidUtilities.dp(36.0f);
        rectF2.set((getMeasuredWidth() - dp32) / 2, i27, (getMeasuredWidth() + dp32) / 2, AndroidUtilities.dp(4.0f) + i27);
        org.telegram.ui.ActionBar.j6.t0.setColor(gy0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ii));
        org.telegram.ui.ActionBar.j6.t0.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, (i27 - AndroidUtilities.statusBarHeight) / AndroidUtilities.dp(16.0f))) * r1.getAlpha()));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.t0);
        if (i12 <= AndroidUtilities.statusBarHeight / 2) {
        }
        bool = this.d;
        if (bool != null) {
        }
        if (AndroidUtilities.computePerceivedBrightness(gy0Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5)) <= 0.721f) {
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v(gy0Var.getThemedColor(org.telegram.ui.ActionBar.j6.s8), 855638016)) > 0.721f) {
        }
        this.d = Boolean.valueOf(z10);
        if (!z10) {
        }
        AndroidUtilities.setLightStatusBar(gy0Var.getWindow(), z11);
        if (i12 <= 0) {
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            gy0 gy0Var = this.e;
            if (gy0Var.e0 != 0 && motionEvent.getY() < gy0Var.e0) {
                gy0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = this.a;
        int i15 = i12 - i10;
        gy0 gy0Var = this.e;
        if (i14 != i15) {
            this.a = i15;
            cy0 cy0Var = gy0Var.d;
            if (cy0Var != null && gy0Var.W != null) {
                cy0Var.l();
            }
        }
        super.onLayout(z10, i10, i11, i12, i13);
        gy0.O(gy0Var);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int size = View.MeasureSpec.getSize(i11);
        gy0 gy0Var = this.e;
        ArrayList arrayList = gy0Var.X;
        gy0Var.g0 = true;
        i12 = ((org.telegram.ui.ActionBar.f3) gy0Var).backgroundPaddingLeft;
        int i20 = AndroidUtilities.statusBarHeight;
        i13 = ((org.telegram.ui.ActionBar.f3) gy0Var).backgroundPaddingLeft;
        setPadding(i12, i20, i13, 0);
        gy0Var.g0 = false;
        if (gy0Var.s0()) {
            int measuredWidth = gy0Var.c.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            gy0Var.d.d = Math.max(1, measuredWidth / AndroidUtilities.dp(AndroidUtilities.isTablet() ? 60.0f : 45.0f));
            int size2 = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(36.0f)) / gy0Var.d.d;
            gy0Var.O = size2;
            gy0Var.P = size2;
        } else {
            gy0Var.d.d = 5;
            gy0Var.O = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(36.0f)) / gy0Var.d.d;
            gy0Var.P = AndroidUtilities.dp(82.0f);
        }
        float f7 = gy0Var.d.d;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gy0Var.c.getLayoutParams();
        if (arrayList != null) {
            int max = (Math.max(3, (int) Math.ceil(arrayList.size() / f7)) * gy0Var.P) + AndroidUtilities.dp(48.0f) + marginLayoutParams.bottomMargin;
            i19 = ((org.telegram.ui.ActionBar.f3) gy0Var).backgroundPaddingTop;
            i17 = i19 + max + AndroidUtilities.statusBarHeight;
        } else {
            if (gy0Var.W != null) {
                int size3 = (gy0Var.d.n * gy0Var.P) + (gy0Var.W.size() * AndroidUtilities.dp(60.0f)) + AndroidUtilities.dp(8.0f) + marginLayoutParams.bottomMargin;
                i18 = ((org.telegram.ui.ActionBar.f3) gy0Var).backgroundPaddingTop;
                i16 = i18 + size3;
                i15 = AndroidUtilities.dp(24.0f);
            } else {
                int max2 = (Math.max(gy0Var.s0() ? 2 : 3, gy0Var.S != null ? (int) Math.ceil(r4.documents.size() / f7) : 0) * gy0Var.P) + AndroidUtilities.dp(48.0f) + marginLayoutParams.bottomMargin;
                i14 = ((org.telegram.ui.ActionBar.f3) gy0Var).backgroundPaddingTop;
                i15 = i14 + max2;
                i16 = AndroidUtilities.statusBarHeight;
            }
            i17 = i16 + i15;
        }
        if (gy0Var.s0()) {
            i17 = (int) ((gy0Var.P * 0.15f) + i17);
        }
        float f10 = size / 5.0f;
        int i21 = ((double) i17) < ((double) f10) * 3.2d ? 0 : (int) (f10 * 2.0f);
        if (i21 != 0 && i17 < size) {
            i21 -= size - i17;
        }
        if (i21 == 0) {
            i21 = ((org.telegram.ui.ActionBar.f3) gy0Var).backgroundPaddingTop;
        }
        if (gy0Var.W != null) {
            i21 += AndroidUtilities.dp(8.0f);
        }
        if (gy0Var.c.getPaddingTop() != i21) {
            gy0Var.g0 = true;
            gy0Var.c.setPadding(AndroidUtilities.dp(10.0f), i21, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f));
            gy0Var.K.setPadding(0, i21, 0, 0);
            gy0Var.g0 = false;
        }
        this.c = i17 >= size;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(i17, size), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.e.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.e.g0) {
            return;
        }
        super.requestLayout();
    }
}
