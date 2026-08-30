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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class r7 extends FrameLayout {
    public final RectF a;
    public boolean b;
    public int c;
    public int d;
    public final /* synthetic */ c8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(c8 c8Var, Context context) {
        super(context);
        this.e = c8Var;
        this.a = new RectF();
        this.b = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ic.a(this, new kh.t0(this, 5));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ic.h(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        float f10;
        float f11;
        int i12;
        Drawable drawable;
        Drawable drawable2;
        RectF rectF;
        float f12;
        float f13;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Drawable drawable3;
        int i21;
        Drawable drawable4;
        c8 c8Var = this.e;
        o7 o7Var = c8Var.n;
        eg.l1 l1Var = c8Var.c;
        boolean z4 = c8Var.r0;
        if (c8Var.u0.size() <= 1) {
            drawable3 = ((org.telegram.ui.ActionBar.g3) c8Var).shadowDrawable;
            int measuredHeight = getMeasuredHeight() - c8Var.B.getMeasuredHeight();
            i21 = ((org.telegram.ui.ActionBar.g3) c8Var).backgroundPaddingTop;
            drawable3.setBounds(0, measuredHeight - i21, getMeasuredWidth(), getMeasuredHeight());
            drawable4 = ((org.telegram.ui.ActionBar.g3) c8Var).shadowDrawable;
            drawable4.draw(canvas);
            if (z4) {
                l1Var.setVisibility(8);
                return;
            }
            return;
        }
        if (o7Var.getVisibility() != 0) {
            return;
        }
        int dp = AndroidUtilities.dp(13.0f);
        int i22 = c8Var.x0;
        i10 = ((org.telegram.ui.ActionBar.g3) c8Var).backgroundPaddingTop;
        int translationY = (int) (o7Var.getTranslationY() + ((i22 - i10) - dp));
        if (z4) {
            translationY = (translationY - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) + AndroidUtilities.dp(10.0f);
        }
        int dp2 = AndroidUtilities.dp(20.0f) + translationY;
        int dp3 = AndroidUtilities.dp(15.0f) + getMeasuredHeight();
        i11 = ((org.telegram.ui.ActionBar.g3) c8Var).backgroundPaddingTop;
        int i23 = i11 + dp3;
        if (!z4) {
            i19 = ((org.telegram.ui.ActionBar.g3) c8Var).backgroundPaddingTop;
            if (i19 + translationY < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                float dp4 = AndroidUtilities.dp(4.0f) + dp;
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY;
                i20 = ((org.telegram.ui.ActionBar.g3) c8Var).backgroundPaddingTop;
                f11 = Math.min(1.0f, (currentActionBarHeight - i20) / dp4);
                int currentActionBarHeight2 = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp4) * f11);
                translationY -= currentActionBarHeight2;
                dp2 -= currentActionBarHeight2;
                i23 += currentActionBarHeight2;
                f10 = 1.0f - f11;
                int i24 = (int) ((1.0f - f11) * AndroidUtilities.statusBarHeight);
                int i25 = translationY + i24;
                i12 = dp2 + i24;
                drawable = ((org.telegram.ui.ActionBar.g3) c8Var).shadowDrawable;
                drawable.setBounds(0, i25, getMeasuredWidth(), i23);
                drawable2 = ((org.telegram.ui.ActionBar.g3) c8Var).shadowDrawable;
                drawable2.draw(canvas);
                rectF = this.a;
                if (!z4 || f10 == 1.0f) {
                    f12 = 10.0f;
                    f13 = 4.0f;
                } else {
                    org.telegram.ui.ActionBar.j6.t0.setColor(c8Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5));
                    i15 = ((org.telegram.ui.ActionBar.g3) c8Var).backgroundPaddingLeft;
                    i16 = ((org.telegram.ui.ActionBar.g3) c8Var).backgroundPaddingTop;
                    int measuredWidth = getMeasuredWidth();
                    i17 = ((org.telegram.ui.ActionBar.g3) c8Var).backgroundPaddingLeft;
                    f12 = 10.0f;
                    float f14 = measuredWidth - i17;
                    i18 = ((org.telegram.ui.ActionBar.g3) c8Var).backgroundPaddingTop;
                    f13 = 4.0f;
                    rectF.set(i15, i16 + i25, f14, AndroidUtilities.dp(24.0f) + i18 + i25);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f10, AndroidUtilities.dp(12.0f) * f10, org.telegram.ui.ActionBar.j6.t0);
                }
                if (!z4 && f10 != 0.0f) {
                    int dp5 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - dp5) / 2, i12, (getMeasuredWidth() + dp5) / 2, AndroidUtilities.dp(f13) + i12);
                    int themedColor = c8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ii);
                    int alpha = Color.alpha(themedColor);
                    org.telegram.ui.ActionBar.j6.t0.setColor(themedColor);
                    org.telegram.ui.ActionBar.j6.t0.setAlpha((int) (alpha * 1.0f * f10));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.t0);
                }
                if (z4) {
                    return;
                }
                l1Var.setVisibility(0);
                i13 = ((org.telegram.ui.ActionBar.g3) c8Var).backgroundPaddingTop;
                l1Var.setTranslationY(Math.max(0.0f, e2.c.w(1.0f, c8Var.N0, AndroidUtilities.dp(6.0f), (i25 - i13) - AndroidUtilities.dp(f12)) - l1Var.getTop()));
                View view = c8Var.d;
                i14 = ((org.telegram.ui.ActionBar.g3) c8Var).backgroundPaddingTop;
                view.setTranslationY(Math.max(0.0f, e2.c.w(1.0f, c8Var.N0, AndroidUtilities.dp(6.0f), (i25 - i14) - AndroidUtilities.dp(f12)) - l1Var.getTop()));
                return;
            }
        }
        f10 = 1.0f;
        f11 = 0.0f;
        int i242 = (int) ((1.0f - f11) * AndroidUtilities.statusBarHeight);
        int i252 = translationY + i242;
        i12 = dp2 + i242;
        drawable = ((org.telegram.ui.ActionBar.g3) c8Var).shadowDrawable;
        drawable.setBounds(0, i252, getMeasuredWidth(), i23);
        drawable2 = ((org.telegram.ui.ActionBar.g3) c8Var).shadowDrawable;
        drawable2.draw(canvas);
        rectF = this.a;
        if (z4) {
        }
        f12 = 10.0f;
        f13 = 4.0f;
        if (!z4) {
            int dp52 = AndroidUtilities.dp(36.0f);
            rectF.set((getMeasuredWidth() - dp52) / 2, i12, (getMeasuredWidth() + dp52) / 2, AndroidUtilities.dp(f13) + i12);
            int themedColor2 = c8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ii);
            int alpha2 = Color.alpha(themedColor2);
            org.telegram.ui.ActionBar.j6.t0.setColor(themedColor2);
            org.telegram.ui.ActionBar.j6.t0.setAlpha((int) (alpha2 * 1.0f * f10));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.t0);
        }
        if (z4) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (r5.getY() < (org.telegram.messenger.AndroidUtilities.dp(12.0f) + r0.x0)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0055, code lost:
    
        r0.dismiss();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0059, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r5.getY() < (getMeasuredHeight() - org.telegram.messenger.AndroidUtilities.dp(((r0.s0() || r0.w0) ? 0 : 52) + 191))) goto L21;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            c8 c8Var = this.e;
            if (c8Var.x0 != 0 && c8Var.c.getAlpha() == 0.0f) {
                if (c8Var.s.h() > 0) {
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        c8 c8Var = this.e;
        c8.P(c8Var);
        c8Var.E0();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        int i12;
        int dp;
        int paddingBottom;
        boolean z4;
        boolean z10;
        int i13;
        boolean z11;
        c8 c8Var = this.e;
        j7 j7Var = c8Var.B;
        j7 j7Var2 = c8Var.f0;
        o7 o7Var = c8Var.n;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        if (size != this.c || size2 != this.d) {
            if (j7Var2.getTag() != null) {
                c8Var.A0(false, false);
            }
            this.d = size2;
            this.c = size;
        }
        this.b = true;
        if (!c8Var.f) {
            z11 = ((org.telegram.ui.ActionBar.g3) c8Var).keyboardVisible;
            if (!z11) {
                i12 = 0;
                j7Var.setVisibility(i12);
                c8Var.e.setVisibility(j7Var.getVisibility());
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) o7Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                ((FrameLayout.LayoutParams) c8Var.d.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                ((FrameLayout.LayoutParams) j7Var2.getLayoutParams()).topMargin = -getPaddingTop();
                int dp2 = AndroidUtilities.dp(179 + ((!c8Var.s0() || c8Var.w0) ? 0 : 52));
                if (c8Var.u0.size() > 1) {
                    i13 = ((org.telegram.ui.ActionBar.g3) c8Var).backgroundPaddingTop;
                    dp2 += (AndroidUtilities.dp(56.0f) * c8Var.u0.size()) + i13;
                }
                if (!c8Var.h) {
                    z10 = ((org.telegram.ui.ActionBar.g3) c8Var).keyboardVisible;
                    if (!z10) {
                        if (dp2 >= paddingTop) {
                            dp2 = (int) ((paddingTop / 5) * 3.5f);
                        }
                        dp = AndroidUtilities.dp(8.0f) + (paddingTop - dp2);
                        if (dp > paddingTop - AndroidUtilities.dp(((c8Var.s0() || c8Var.w0) ? 0 : 52) + 329)) {
                            dp = paddingTop - AndroidUtilities.dp(((c8Var.s0() || c8Var.w0) ? 0 : 52) + 329);
                        }
                        if (dp < 0) {
                            dp = 0;
                        }
                        if (c8Var.s0) {
                            dp = 0;
                        }
                        if (o7Var.getPaddingTop() != dp) {
                            if (c8Var.h) {
                                z4 = ((org.telegram.ui.ActionBar.g3) c8Var).keyboardVisible;
                                if (z4) {
                                    paddingBottom = 0;
                                    o7Var.setPadding(0, dp, 0, paddingBottom);
                                }
                            }
                            paddingBottom = o7Var.getPaddingBottom();
                            o7Var.setPadding(0, dp, 0, paddingBottom);
                        }
                        this.b = false;
                        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
                        getMeasuredHeight();
                    }
                }
                dp = AndroidUtilities.dp(8.0f);
                if (c8Var.s0) {
                }
                if (o7Var.getPaddingTop() != dp) {
                }
                this.b = false;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
                getMeasuredHeight();
            }
        }
        i12 = 4;
        j7Var.setVisibility(i12);
        c8Var.e.setVisibility(j7Var.getVisibility());
        int paddingTop2 = size - getPaddingTop();
        ((FrameLayout.LayoutParams) o7Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        ((FrameLayout.LayoutParams) c8Var.d.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        ((FrameLayout.LayoutParams) j7Var2.getLayoutParams()).topMargin = -getPaddingTop();
        int dp22 = AndroidUtilities.dp(179 + ((!c8Var.s0() || c8Var.w0) ? 0 : 52));
        if (c8Var.u0.size() > 1) {
        }
        if (!c8Var.h) {
        }
        dp = AndroidUtilities.dp(8.0f);
        if (c8Var.s0) {
        }
        if (o7Var.getPaddingTop() != dp) {
        }
        this.b = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
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
