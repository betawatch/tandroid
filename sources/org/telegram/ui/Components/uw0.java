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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class uw0 extends FrameLayout {
    public int a;
    public final RectF b;
    public boolean c;
    public Boolean d;
    public final /* synthetic */ cx0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw0(cx0 cx0Var, Context context) {
        super(context);
        this.e = cx0Var;
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
        cx0 cx0Var = this.e;
        int i22 = cx0Var.a0;
        i9 = ((org.telegram.ui.ActionBar.f3) cx0Var).backgroundPaddingTop;
        int dp = AndroidUtilities.dp(6.0f) + (i22 - i9);
        int i23 = cx0Var.a0;
        i10 = ((org.telegram.ui.ActionBar.f3) cx0Var).backgroundPaddingTop;
        int dp2 = (i23 - i10) - AndroidUtilities.dp(13.0f);
        int i24 = AndroidUtilities.statusBarHeight;
        int i25 = dp2 + i24;
        int i26 = dp + i24;
        if (this.c) {
            i18 = ((org.telegram.ui.ActionBar.f3) cx0Var).backgroundPaddingTop;
            int i27 = i18 + i25;
            int i28 = AndroidUtilities.statusBarHeight;
            int i29 = i28 * 2;
            if (i27 < i29) {
                i21 = ((org.telegram.ui.ActionBar.f3) cx0Var).backgroundPaddingTop;
                i25 -= Math.min(i28, (i29 - i25) - i21);
                f10 = 1.0f - Math.min(1.0f, (r3 * 2) / AndroidUtilities.statusBarHeight);
            } else {
                f10 = 1.0f;
            }
            i19 = ((org.telegram.ui.ActionBar.f3) cx0Var).backgroundPaddingTop;
            int i30 = i19 + i25;
            int i31 = AndroidUtilities.statusBarHeight;
            if (i30 < i31) {
                i20 = ((org.telegram.ui.ActionBar.f3) cx0Var).backgroundPaddingTop;
                i11 = Math.min(i31, (i31 - i25) - i20);
                drawable = ((org.telegram.ui.ActionBar.f3) cx0Var).shadowDrawable;
                drawable.setBounds(0, i25, getMeasuredWidth(), getMeasuredHeight());
                drawable2 = ((org.telegram.ui.ActionBar.f3) cx0Var).shadowDrawable;
                drawable2.draw(canvas);
                RectF rectF = this.b;
                if (f10 != 1.0f) {
                    org.telegram.ui.ActionBar.f6.t0.setColor(cx0Var.getThemedColor(org.telegram.ui.ActionBar.f6.h5));
                    i14 = ((org.telegram.ui.ActionBar.f3) cx0Var).backgroundPaddingLeft;
                    i15 = ((org.telegram.ui.ActionBar.f3) cx0Var).backgroundPaddingTop;
                    int measuredWidth = getMeasuredWidth();
                    i16 = ((org.telegram.ui.ActionBar.f3) cx0Var).backgroundPaddingLeft;
                    float f11 = measuredWidth - i16;
                    i17 = ((org.telegram.ui.ActionBar.f3) cx0Var).backgroundPaddingTop;
                    rectF.set(i14, i15 + i25, f11, AndroidUtilities.dp(24.0f) + i17 + i25);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f10, AndroidUtilities.dp(12.0f) * f10, org.telegram.ui.ActionBar.f6.t0);
                }
                int dp3 = AndroidUtilities.dp(36.0f);
                rectF.set((getMeasuredWidth() - dp3) / 2, i26, (getMeasuredWidth() + dp3) / 2, AndroidUtilities.dp(4.0f) + i26);
                org.telegram.ui.ActionBar.f6.t0.setColor(cx0Var.getThemedColor(org.telegram.ui.ActionBar.f6.Ii));
                org.telegram.ui.ActionBar.f6.t0.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, (i26 - AndroidUtilities.statusBarHeight) / AndroidUtilities.dp(16.0f))) * r1.getAlpha()));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.f6.t0);
                z10 = i11 <= AndroidUtilities.statusBarHeight / 2;
                bool = this.d;
                if (bool != null || bool.booleanValue() != z10) {
                    boolean z11 = AndroidUtilities.computePerceivedBrightness(cx0Var.getThemedColor(org.telegram.ui.ActionBar.f6.h5)) <= 0.721f;
                    boolean z12 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.v(cx0Var.getThemedColor(org.telegram.ui.ActionBar.f6.s8), 855638016)) > 0.721f;
                    this.d = Boolean.valueOf(z10);
                    if (!z10) {
                        z11 = z12;
                    }
                    AndroidUtilities.setLightStatusBar(cx0Var.getWindow(), z11);
                }
                if (i11 <= 0) {
                    org.telegram.ui.ActionBar.f6.t0.setColor(cx0Var.getThemedColor(org.telegram.ui.ActionBar.f6.h5));
                    i12 = ((org.telegram.ui.ActionBar.f3) cx0Var).backgroundPaddingLeft;
                    float f12 = i12;
                    float f13 = AndroidUtilities.statusBarHeight - i11;
                    int measuredWidth2 = getMeasuredWidth();
                    i13 = ((org.telegram.ui.ActionBar.f3) cx0Var).backgroundPaddingLeft;
                    canvas.drawRect(f12, f13, measuredWidth2 - i13, AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.f6.t0);
                    return;
                }
                return;
            }
        } else {
            f10 = 1.0f;
        }
        i11 = 0;
        drawable = ((org.telegram.ui.ActionBar.f3) cx0Var).shadowDrawable;
        drawable.setBounds(0, i25, getMeasuredWidth(), getMeasuredHeight());
        drawable2 = ((org.telegram.ui.ActionBar.f3) cx0Var).shadowDrawable;
        drawable2.draw(canvas);
        RectF rectF2 = this.b;
        if (f10 != 1.0f) {
        }
        int dp32 = AndroidUtilities.dp(36.0f);
        rectF2.set((getMeasuredWidth() - dp32) / 2, i26, (getMeasuredWidth() + dp32) / 2, AndroidUtilities.dp(4.0f) + i26);
        org.telegram.ui.ActionBar.f6.t0.setColor(cx0Var.getThemedColor(org.telegram.ui.ActionBar.f6.Ii));
        org.telegram.ui.ActionBar.f6.t0.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, (i26 - AndroidUtilities.statusBarHeight) / AndroidUtilities.dp(16.0f))) * r1.getAlpha()));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.f6.t0);
        if (i11 <= AndroidUtilities.statusBarHeight / 2) {
        }
        bool = this.d;
        if (bool != null) {
        }
        if (AndroidUtilities.computePerceivedBrightness(cx0Var.getThemedColor(org.telegram.ui.ActionBar.f6.h5)) <= 0.721f) {
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.v(cx0Var.getThemedColor(org.telegram.ui.ActionBar.f6.s8), 855638016)) > 0.721f) {
        }
        this.d = Boolean.valueOf(z10);
        if (!z10) {
        }
        AndroidUtilities.setLightStatusBar(cx0Var.getWindow(), z11);
        if (i11 <= 0) {
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            cx0 cx0Var = this.e;
            if (cx0Var.a0 != 0 && motionEvent.getY() < cx0Var.a0) {
                cx0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13 = this.a;
        int i14 = i11 - i9;
        cx0 cx0Var = this.e;
        if (i13 != i14) {
            this.a = i14;
            yw0 yw0Var = cx0Var.d;
            if (yw0Var != null && cx0Var.S != null) {
                yw0Var.l();
            }
        }
        super.onLayout(z10, i9, i10, i11, i12);
        cx0.N(cx0Var);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int size = View.MeasureSpec.getSize(i10);
        cx0 cx0Var = this.e;
        ArrayList arrayList = cx0Var.T;
        cx0Var.c0 = true;
        i11 = ((org.telegram.ui.ActionBar.f3) cx0Var).backgroundPaddingLeft;
        int i19 = AndroidUtilities.statusBarHeight;
        i12 = ((org.telegram.ui.ActionBar.f3) cx0Var).backgroundPaddingLeft;
        setPadding(i11, i19, i12, 0);
        cx0Var.c0 = false;
        if (cx0Var.r0()) {
            int measuredWidth = cx0Var.c.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            cx0Var.d.d = Math.max(1, measuredWidth / AndroidUtilities.dp(AndroidUtilities.isTablet() ? 60.0f : 45.0f));
            int size2 = (View.MeasureSpec.getSize(i9) - AndroidUtilities.dp(36.0f)) / cx0Var.d.d;
            cx0Var.K = size2;
            cx0Var.L = size2;
        } else {
            cx0Var.d.d = 5;
            cx0Var.K = (View.MeasureSpec.getSize(i9) - AndroidUtilities.dp(36.0f)) / cx0Var.d.d;
            cx0Var.L = AndroidUtilities.dp(82.0f);
        }
        float f10 = cx0Var.d.d;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cx0Var.c.getLayoutParams();
        if (arrayList != null) {
            int max = (Math.max(3, (int) Math.ceil(arrayList.size() / f10)) * cx0Var.L) + AndroidUtilities.dp(48.0f) + marginLayoutParams.bottomMargin;
            i18 = ((org.telegram.ui.ActionBar.f3) cx0Var).backgroundPaddingTop;
            i16 = i18 + max + AndroidUtilities.statusBarHeight;
        } else {
            if (cx0Var.S != null) {
                int size3 = (cx0Var.d.n * cx0Var.L) + (cx0Var.S.size() * AndroidUtilities.dp(60.0f)) + AndroidUtilities.dp(8.0f) + marginLayoutParams.bottomMargin;
                i17 = ((org.telegram.ui.ActionBar.f3) cx0Var).backgroundPaddingTop;
                i15 = i17 + size3;
                i14 = AndroidUtilities.dp(24.0f);
            } else {
                int max2 = (Math.max(cx0Var.r0() ? 2 : 3, cx0Var.O != null ? (int) Math.ceil(r4.documents.size() / f10) : 0) * cx0Var.L) + AndroidUtilities.dp(48.0f) + marginLayoutParams.bottomMargin;
                i13 = ((org.telegram.ui.ActionBar.f3) cx0Var).backgroundPaddingTop;
                i14 = i13 + max2;
                i15 = AndroidUtilities.statusBarHeight;
            }
            i16 = i15 + i14;
        }
        if (cx0Var.r0()) {
            i16 = (int) ((cx0Var.L * 0.15f) + i16);
        }
        float f11 = size / 5.0f;
        int i20 = ((double) i16) < ((double) f11) * 3.2d ? 0 : (int) (f11 * 2.0f);
        if (i20 != 0 && i16 < size) {
            i20 -= size - i16;
        }
        if (i20 == 0) {
            i20 = ((org.telegram.ui.ActionBar.f3) cx0Var).backgroundPaddingTop;
        }
        if (cx0Var.S != null) {
            i20 += AndroidUtilities.dp(8.0f);
        }
        if (cx0Var.c.getPaddingTop() != i20) {
            cx0Var.c0 = true;
            cx0Var.c.setPadding(AndroidUtilities.dp(10.0f), i20, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f));
            cx0Var.G.setPadding(0, i20, 0, 0);
            cx0Var.c0 = false;
        }
        this.c = i16 >= size;
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(Math.min(i16, size), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.e.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.e.c0) {
            return;
        }
        super.requestLayout();
    }
}
