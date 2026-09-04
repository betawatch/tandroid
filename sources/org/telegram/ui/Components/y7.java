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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class y7 extends FrameLayout {
    public final RectF a;
    public boolean b;
    public int c;
    public int d;
    public final /* synthetic */ k8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(k8 k8Var, Context context) {
        super(context);
        this.e = k8Var;
        this.a = new RectF();
        this.b = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qc.a(this, new ah.n0(this, 5));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qc.h(this);
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
        float f7;
        float f10;
        int i12;
        Drawable drawable;
        Drawable drawable2;
        RectF rectF;
        float f11;
        float f12;
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
        k8 k8Var = this.e;
        v7 v7Var = k8Var.n;
        z7 z7Var = k8Var.c;
        boolean z10 = k8Var.u0;
        if (k8Var.x0.size() <= 1) {
            drawable3 = ((org.telegram.ui.ActionBar.f3) k8Var).shadowDrawable;
            int measuredHeight = getMeasuredHeight() - k8Var.E.getMeasuredHeight();
            i21 = ((org.telegram.ui.ActionBar.f3) k8Var).backgroundPaddingTop;
            drawable3.setBounds(0, measuredHeight - i21, getMeasuredWidth(), getMeasuredHeight());
            drawable4 = ((org.telegram.ui.ActionBar.f3) k8Var).shadowDrawable;
            drawable4.draw(canvas);
            if (z10) {
                z7Var.setVisibility(8);
                return;
            }
            return;
        }
        if (v7Var.getVisibility() != 0) {
            return;
        }
        int dp = AndroidUtilities.dp(13.0f);
        int i22 = k8Var.A0;
        i10 = ((org.telegram.ui.ActionBar.f3) k8Var).backgroundPaddingTop;
        int translationY = (int) (v7Var.getTranslationY() + ((i22 - i10) - dp));
        if (z10) {
            translationY = (translationY - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) + AndroidUtilities.dp(10.0f);
        }
        int dp2 = AndroidUtilities.dp(20.0f) + translationY;
        int dp3 = AndroidUtilities.dp(15.0f) + getMeasuredHeight();
        i11 = ((org.telegram.ui.ActionBar.f3) k8Var).backgroundPaddingTop;
        int i23 = i11 + dp3;
        if (!z10) {
            i19 = ((org.telegram.ui.ActionBar.f3) k8Var).backgroundPaddingTop;
            if (i19 + translationY < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                float dp4 = AndroidUtilities.dp(4.0f) + dp;
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY;
                i20 = ((org.telegram.ui.ActionBar.f3) k8Var).backgroundPaddingTop;
                f10 = Math.min(1.0f, (currentActionBarHeight - i20) / dp4);
                int currentActionBarHeight2 = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp4) * f10);
                translationY -= currentActionBarHeight2;
                dp2 -= currentActionBarHeight2;
                i23 += currentActionBarHeight2;
                f7 = 1.0f - f10;
                int i24 = (int) ((1.0f - f10) * AndroidUtilities.statusBarHeight);
                int i25 = translationY + i24;
                i12 = dp2 + i24;
                drawable = ((org.telegram.ui.ActionBar.f3) k8Var).shadowDrawable;
                drawable.setBounds(0, i25, getMeasuredWidth(), i23);
                drawable2 = ((org.telegram.ui.ActionBar.f3) k8Var).shadowDrawable;
                drawable2.draw(canvas);
                rectF = this.a;
                if (!z10 || f7 == 1.0f) {
                    f11 = 10.0f;
                    f12 = 4.0f;
                } else {
                    org.telegram.ui.ActionBar.j6.t0.setColor(k8Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5));
                    i15 = ((org.telegram.ui.ActionBar.f3) k8Var).backgroundPaddingLeft;
                    i16 = ((org.telegram.ui.ActionBar.f3) k8Var).backgroundPaddingTop;
                    int measuredWidth = getMeasuredWidth();
                    i17 = ((org.telegram.ui.ActionBar.f3) k8Var).backgroundPaddingLeft;
                    f11 = 10.0f;
                    float f13 = measuredWidth - i17;
                    i18 = ((org.telegram.ui.ActionBar.f3) k8Var).backgroundPaddingTop;
                    f12 = 4.0f;
                    rectF.set(i15, i16 + i25, f13, AndroidUtilities.dp(24.0f) + i18 + i25);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.j6.t0);
                }
                if (!z10 && f7 != 0.0f) {
                    int dp5 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - dp5) / 2, i12, (getMeasuredWidth() + dp5) / 2, AndroidUtilities.dp(f12) + i12);
                    int themedColor = k8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ii);
                    int alpha = Color.alpha(themedColor);
                    org.telegram.ui.ActionBar.j6.t0.setColor(themedColor);
                    org.telegram.ui.ActionBar.j6.t0.setAlpha((int) (alpha * 1.0f * f7));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.t0);
                }
                if (z10) {
                    return;
                }
                z7Var.setVisibility(0);
                i13 = ((org.telegram.ui.ActionBar.f3) k8Var).backgroundPaddingTop;
                z7Var.setTranslationY(Math.max(0.0f, com.google.android.gms.internal.vision.e2.z(1.0f, k8Var.Q0, AndroidUtilities.dp(6.0f), (i25 - i13) - AndroidUtilities.dp(f11)) - z7Var.getTop()));
                View view = k8Var.d;
                i14 = ((org.telegram.ui.ActionBar.f3) k8Var).backgroundPaddingTop;
                view.setTranslationY(Math.max(0.0f, com.google.android.gms.internal.vision.e2.z(1.0f, k8Var.Q0, AndroidUtilities.dp(6.0f), (i25 - i14) - AndroidUtilities.dp(f11)) - z7Var.getTop()));
                return;
            }
        }
        f7 = 1.0f;
        f10 = 0.0f;
        int i242 = (int) ((1.0f - f10) * AndroidUtilities.statusBarHeight);
        int i252 = translationY + i242;
        i12 = dp2 + i242;
        drawable = ((org.telegram.ui.ActionBar.f3) k8Var).shadowDrawable;
        drawable.setBounds(0, i252, getMeasuredWidth(), i23);
        drawable2 = ((org.telegram.ui.ActionBar.f3) k8Var).shadowDrawable;
        drawable2.draw(canvas);
        rectF = this.a;
        if (z10) {
        }
        f11 = 10.0f;
        f12 = 4.0f;
        if (!z10) {
            int dp52 = AndroidUtilities.dp(36.0f);
            rectF.set((getMeasuredWidth() - dp52) / 2, i12, (getMeasuredWidth() + dp52) / 2, AndroidUtilities.dp(f12) + i12);
            int themedColor2 = k8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ii);
            int alpha2 = Color.alpha(themedColor2);
            org.telegram.ui.ActionBar.j6.t0.setColor(themedColor2);
            org.telegram.ui.ActionBar.j6.t0.setAlpha((int) (alpha2 * 1.0f * f7));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.t0);
        }
        if (z10) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (r5.getY() < (org.telegram.messenger.AndroidUtilities.dp(12.0f) + r0.A0)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0055, code lost:
    
        r0.dismiss();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0059, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r5.getY() < (getMeasuredHeight() - org.telegram.messenger.AndroidUtilities.dp(((r0.s0() || r0.z0) ? 0 : 52) + 191))) goto L21;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            k8 k8Var = this.e;
            if (k8Var.A0 != 0 && k8Var.c.getAlpha() == 0.0f) {
                if (k8Var.s.h() > 0) {
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        k8 k8Var = this.e;
        k8.P(k8Var);
        k8Var.E0();
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
        boolean z10;
        boolean z11;
        int i13;
        boolean z12;
        k8 k8Var = this.e;
        q7 q7Var = k8Var.E;
        q7 q7Var2 = k8Var.i0;
        v7 v7Var = k8Var.n;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        if (size != this.c || size2 != this.d) {
            if (q7Var2.getTag() != null) {
                k8Var.A0(false, false);
            }
            this.d = size2;
            this.c = size;
        }
        this.b = true;
        if (!k8Var.f) {
            z12 = ((org.telegram.ui.ActionBar.f3) k8Var).keyboardVisible;
            if (!z12) {
                i12 = 0;
                q7Var.setVisibility(i12);
                k8Var.e.setVisibility(q7Var.getVisibility());
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) v7Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                ((FrameLayout.LayoutParams) k8Var.d.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                ((FrameLayout.LayoutParams) q7Var2.getLayoutParams()).topMargin = -getPaddingTop();
                int dp2 = AndroidUtilities.dp(179 + ((!k8Var.s0() || k8Var.z0) ? 0 : 52));
                if (k8Var.x0.size() > 1) {
                    i13 = ((org.telegram.ui.ActionBar.f3) k8Var).backgroundPaddingTop;
                    dp2 += (AndroidUtilities.dp(56.0f) * k8Var.x0.size()) + i13;
                }
                if (!k8Var.h) {
                    z11 = ((org.telegram.ui.ActionBar.f3) k8Var).keyboardVisible;
                    if (!z11) {
                        if (dp2 >= paddingTop) {
                            dp2 = (int) ((paddingTop / 5) * 3.5f);
                        }
                        dp = AndroidUtilities.dp(8.0f) + (paddingTop - dp2);
                        if (dp > paddingTop - AndroidUtilities.dp(((k8Var.s0() || k8Var.z0) ? 0 : 52) + 329)) {
                            dp = paddingTop - AndroidUtilities.dp(((k8Var.s0() || k8Var.z0) ? 0 : 52) + 329);
                        }
                        if (dp < 0) {
                            dp = 0;
                        }
                        if (k8Var.v0) {
                            dp = 0;
                        }
                        if (v7Var.getPaddingTop() != dp) {
                            if (k8Var.h) {
                                z10 = ((org.telegram.ui.ActionBar.f3) k8Var).keyboardVisible;
                                if (z10) {
                                    paddingBottom = 0;
                                    v7Var.setPadding(0, dp, 0, paddingBottom);
                                }
                            }
                            paddingBottom = v7Var.getPaddingBottom();
                            v7Var.setPadding(0, dp, 0, paddingBottom);
                        }
                        this.b = false;
                        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
                        getMeasuredHeight();
                    }
                }
                dp = AndroidUtilities.dp(8.0f);
                if (k8Var.v0) {
                }
                if (v7Var.getPaddingTop() != dp) {
                }
                this.b = false;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
                getMeasuredHeight();
            }
        }
        i12 = 4;
        q7Var.setVisibility(i12);
        k8Var.e.setVisibility(q7Var.getVisibility());
        int paddingTop2 = size - getPaddingTop();
        ((FrameLayout.LayoutParams) v7Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        ((FrameLayout.LayoutParams) k8Var.d.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        ((FrameLayout.LayoutParams) q7Var2.getLayoutParams()).topMargin = -getPaddingTop();
        int dp22 = AndroidUtilities.dp(179 + ((!k8Var.s0() || k8Var.z0) ? 0 : 52));
        if (k8Var.x0.size() > 1) {
        }
        if (!k8Var.h) {
        }
        dp = AndroidUtilities.dp(8.0f);
        if (k8Var.v0) {
        }
        if (v7Var.getPaddingTop() != dp) {
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
