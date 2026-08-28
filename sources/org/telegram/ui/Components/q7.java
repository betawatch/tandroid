package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class q7 extends FrameLayout {
    public final RectF a;
    public boolean b;
    public int c;
    public int d;
    public final /* synthetic */ c8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(c8 c8Var, Context context) {
        super(context);
        this.e = c8Var;
        this.a = new RectF();
        this.b = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gc.a(this, new fh.y0(this, 6));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gc.h(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int i9;
        int i10;
        float f10;
        float f11;
        int i11;
        Drawable drawable;
        Drawable drawable2;
        RectF rectF;
        float f12;
        float f13;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Drawable drawable3;
        int i20;
        Drawable drawable4;
        c8 c8Var = this.e;
        n7 n7Var = c8Var.n;
        r7 r7Var = c8Var.c;
        boolean z10 = c8Var.q0;
        if (c8Var.t0.size() <= 1) {
            drawable3 = ((org.telegram.ui.ActionBar.f3) c8Var).shadowDrawable;
            int measuredHeight = getMeasuredHeight() - c8Var.A.getMeasuredHeight();
            i20 = ((org.telegram.ui.ActionBar.f3) c8Var).backgroundPaddingTop;
            drawable3.setBounds(0, measuredHeight - i20, getMeasuredWidth(), getMeasuredHeight());
            drawable4 = ((org.telegram.ui.ActionBar.f3) c8Var).shadowDrawable;
            drawable4.draw(canvas);
            if (z10) {
                r7Var.setVisibility(8);
                return;
            }
            return;
        }
        if (n7Var.getVisibility() != 0) {
            return;
        }
        int dp = AndroidUtilities.dp(13.0f);
        int i21 = c8Var.w0;
        i9 = ((org.telegram.ui.ActionBar.f3) c8Var).backgroundPaddingTop;
        int translationY = (int) (n7Var.getTranslationY() + ((i21 - i9) - dp));
        if (z10) {
            translationY = (translationY - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) + AndroidUtilities.dp(10.0f);
        }
        int dp2 = AndroidUtilities.dp(20.0f) + translationY;
        int dp3 = AndroidUtilities.dp(15.0f) + getMeasuredHeight();
        i10 = ((org.telegram.ui.ActionBar.f3) c8Var).backgroundPaddingTop;
        int i22 = i10 + dp3;
        if (!z10) {
            i18 = ((org.telegram.ui.ActionBar.f3) c8Var).backgroundPaddingTop;
            if (i18 + translationY < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                float dp4 = AndroidUtilities.dp(4.0f) + dp;
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY;
                i19 = ((org.telegram.ui.ActionBar.f3) c8Var).backgroundPaddingTop;
                f11 = Math.min(1.0f, (currentActionBarHeight - i19) / dp4);
                int currentActionBarHeight2 = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp4) * f11);
                translationY -= currentActionBarHeight2;
                dp2 -= currentActionBarHeight2;
                i22 += currentActionBarHeight2;
                f10 = 1.0f - f11;
                int i23 = (int) ((1.0f - f11) * AndroidUtilities.statusBarHeight);
                int i24 = translationY + i23;
                i11 = dp2 + i23;
                drawable = ((org.telegram.ui.ActionBar.f3) c8Var).shadowDrawable;
                drawable.setBounds(0, i24, getMeasuredWidth(), i22);
                drawable2 = ((org.telegram.ui.ActionBar.f3) c8Var).shadowDrawable;
                drawable2.draw(canvas);
                rectF = this.a;
                if (!z10 || f10 == 1.0f) {
                    f12 = 10.0f;
                    f13 = 4.0f;
                } else {
                    org.telegram.ui.ActionBar.f6.t0.setColor(c8Var.getThemedColor(org.telegram.ui.ActionBar.f6.h5));
                    i14 = ((org.telegram.ui.ActionBar.f3) c8Var).backgroundPaddingLeft;
                    i15 = ((org.telegram.ui.ActionBar.f3) c8Var).backgroundPaddingTop;
                    int measuredWidth = getMeasuredWidth();
                    i16 = ((org.telegram.ui.ActionBar.f3) c8Var).backgroundPaddingLeft;
                    f12 = 10.0f;
                    float f14 = measuredWidth - i16;
                    i17 = ((org.telegram.ui.ActionBar.f3) c8Var).backgroundPaddingTop;
                    f13 = 4.0f;
                    rectF.set(i14, i15 + i24, f14, AndroidUtilities.dp(24.0f) + i17 + i24);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f10, AndroidUtilities.dp(12.0f) * f10, org.telegram.ui.ActionBar.f6.t0);
                }
                if (!z10 && f10 != 0.0f) {
                    int dp5 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - dp5) / 2, i11, (getMeasuredWidth() + dp5) / 2, AndroidUtilities.dp(f13) + i11);
                    int themedColor = c8Var.getThemedColor(org.telegram.ui.ActionBar.f6.Ii);
                    int alpha = Color.alpha(themedColor);
                    org.telegram.ui.ActionBar.f6.t0.setColor(themedColor);
                    org.telegram.ui.ActionBar.f6.t0.setAlpha((int) (alpha * 1.0f * f10));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.f6.t0);
                }
                if (z10) {
                    return;
                }
                r7Var.setVisibility(0);
                i12 = ((org.telegram.ui.ActionBar.f3) c8Var).backgroundPaddingTop;
                r7Var.setTranslationY(Math.max(0.0f, e2.c.z(1.0f, c8Var.M0, AndroidUtilities.dp(6.0f), (i24 - i12) - AndroidUtilities.dp(f12)) - r7Var.getTop()));
                View view = c8Var.d;
                i13 = ((org.telegram.ui.ActionBar.f3) c8Var).backgroundPaddingTop;
                view.setTranslationY(Math.max(0.0f, e2.c.z(1.0f, c8Var.M0, AndroidUtilities.dp(6.0f), (i24 - i13) - AndroidUtilities.dp(f12)) - r7Var.getTop()));
                return;
            }
        }
        f10 = 1.0f;
        f11 = 0.0f;
        int i232 = (int) ((1.0f - f11) * AndroidUtilities.statusBarHeight);
        int i242 = translationY + i232;
        i11 = dp2 + i232;
        drawable = ((org.telegram.ui.ActionBar.f3) c8Var).shadowDrawable;
        drawable.setBounds(0, i242, getMeasuredWidth(), i22);
        drawable2 = ((org.telegram.ui.ActionBar.f3) c8Var).shadowDrawable;
        drawable2.draw(canvas);
        rectF = this.a;
        if (z10) {
        }
        f12 = 10.0f;
        f13 = 4.0f;
        if (!z10) {
            int dp52 = AndroidUtilities.dp(36.0f);
            rectF.set((getMeasuredWidth() - dp52) / 2, i11, (getMeasuredWidth() + dp52) / 2, AndroidUtilities.dp(f13) + i11);
            int themedColor2 = c8Var.getThemedColor(org.telegram.ui.ActionBar.f6.Ii);
            int alpha2 = Color.alpha(themedColor2);
            org.telegram.ui.ActionBar.f6.t0.setColor(themedColor2);
            org.telegram.ui.ActionBar.f6.t0.setAlpha((int) (alpha2 * 1.0f * f10));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.f6.t0);
        }
        if (z10) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (r5.getY() < (org.telegram.messenger.AndroidUtilities.dp(12.0f) + r0.w0)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0055, code lost:
    
        r0.dismiss();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0059, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r5.getY() < (getMeasuredHeight() - org.telegram.messenger.AndroidUtilities.dp(((r0.r0() || r0.v0) ? 0 : 52) + 191))) goto L21;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            c8 c8Var = this.e;
            if (c8Var.w0 != 0 && c8Var.c.getAlpha() == 0.0f) {
                if (c8Var.s.h() > 0) {
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        c8 c8Var = this.e;
        c8.O(c8Var);
        c8Var.D0();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i9, int i10) {
        int i11;
        int dp;
        int paddingBottom;
        boolean z10;
        boolean z11;
        int i12;
        boolean z12;
        c8 c8Var = this.e;
        i7 i7Var = c8Var.A;
        i7 i7Var2 = c8Var.e0;
        n7 n7Var = c8Var.n;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i9);
        if (size != this.c || size2 != this.d) {
            if (i7Var2.getTag() != null) {
                c8Var.z0(false, false);
            }
            this.d = size2;
            this.c = size;
        }
        this.b = true;
        if (!c8Var.f) {
            z12 = ((org.telegram.ui.ActionBar.f3) c8Var).keyboardVisible;
            if (!z12) {
                i11 = 0;
                i7Var.setVisibility(i11);
                c8Var.e.setVisibility(i7Var.getVisibility());
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) n7Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                ((FrameLayout.LayoutParams) c8Var.d.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                ((FrameLayout.LayoutParams) i7Var2.getLayoutParams()).topMargin = -getPaddingTop();
                int dp2 = AndroidUtilities.dp(179 + ((!c8Var.r0() || c8Var.v0) ? 0 : 52));
                if (c8Var.t0.size() > 1) {
                    i12 = ((org.telegram.ui.ActionBar.f3) c8Var).backgroundPaddingTop;
                    dp2 += (AndroidUtilities.dp(56.0f) * c8Var.t0.size()) + i12;
                }
                if (!c8Var.h) {
                    z11 = ((org.telegram.ui.ActionBar.f3) c8Var).keyboardVisible;
                    if (!z11) {
                        if (dp2 >= paddingTop) {
                            dp2 = (int) ((paddingTop / 5) * 3.5f);
                        }
                        dp = AndroidUtilities.dp(8.0f) + (paddingTop - dp2);
                        if (dp > paddingTop - AndroidUtilities.dp(((c8Var.r0() || c8Var.v0) ? 0 : 52) + 329)) {
                            dp = paddingTop - AndroidUtilities.dp(((c8Var.r0() || c8Var.v0) ? 0 : 52) + 329);
                        }
                        if (dp < 0) {
                            dp = 0;
                        }
                        if (c8Var.r0) {
                            dp = 0;
                        }
                        if (n7Var.getPaddingTop() != dp) {
                            if (c8Var.h) {
                                z10 = ((org.telegram.ui.ActionBar.f3) c8Var).keyboardVisible;
                                if (z10) {
                                    paddingBottom = 0;
                                    n7Var.setPadding(0, dp, 0, paddingBottom);
                                }
                            }
                            paddingBottom = n7Var.getPaddingBottom();
                            n7Var.setPadding(0, dp, 0, paddingBottom);
                        }
                        this.b = false;
                        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
                        getMeasuredHeight();
                    }
                }
                dp = AndroidUtilities.dp(8.0f);
                if (c8Var.r0) {
                }
                if (n7Var.getPaddingTop() != dp) {
                }
                this.b = false;
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
                getMeasuredHeight();
            }
        }
        i11 = 4;
        i7Var.setVisibility(i11);
        c8Var.e.setVisibility(i7Var.getVisibility());
        int paddingTop2 = size - getPaddingTop();
        ((FrameLayout.LayoutParams) n7Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        ((FrameLayout.LayoutParams) c8Var.d.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        ((FrameLayout.LayoutParams) i7Var2.getLayoutParams()).topMargin = -getPaddingTop();
        int dp22 = AndroidUtilities.dp(179 + ((!c8Var.r0() || c8Var.v0) ? 0 : 52));
        if (c8Var.t0.size() > 1) {
        }
        if (!c8Var.h) {
        }
        dp = AndroidUtilities.dp(8.0f);
        if (c8Var.r0) {
        }
        if (n7Var.getPaddingTop() != dp) {
        }
        this.b = false;
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        getMeasuredHeight();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.e.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.b) {
            return;
        }
        super.requestLayout();
    }
}
