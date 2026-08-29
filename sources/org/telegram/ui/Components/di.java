package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class di extends hv0 {
    public int s0;
    public final RectF t0;
    public boolean u0;
    public float v0;
    public final ci w0;
    public final /* synthetic */ ni x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di(ni niVar, Context context) {
        super(context, null);
        this.x0 = niVar;
        this.t0 = new RectF();
        this.w0 = new ci(this, this);
    }

    @Override // org.telegram.ui.Components.hv0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        float f9;
        int dp;
        int dp2;
        float f10;
        float f11;
        Drawable drawable;
        Drawable drawable2;
        int i12;
        Drawable drawable3;
        float f12;
        int themedColor;
        float alpha;
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
        int i23;
        int i24;
        fi fiVar;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        ni niVar = this.x0;
        qg.d dVar = niVar.A2;
        qg.d dVar2 = niVar.z2;
        if (Build.VERSION.SDK_INT >= 31 && niVar.y2 != null) {
            niVar.Z0();
            if (dVar2 != null) {
                viewGroup3 = ((org.telegram.ui.ActionBar.f3) niVar).containerView;
                int measuredWidth = viewGroup3.getMeasuredWidth();
                viewGroup4 = ((org.telegram.ui.ActionBar.f3) niVar).containerView;
                dVar2.h(measuredWidth, viewGroup4.getMeasuredHeight());
                dVar2.j();
            }
            if (dVar != null) {
                viewGroup = ((org.telegram.ui.ActionBar.f3) niVar).containerView;
                int measuredWidth2 = viewGroup.getMeasuredWidth();
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) niVar).containerView;
                dVar.h(measuredWidth2, viewGroup2.getMeasuredHeight());
                dVar.j();
            }
        }
        canvas.save();
        fi fiVar2 = niVar.u0;
        lm lmVar = niVar.m0;
        if ((fiVar2 == lmVar || (fiVar = niVar.v0) == lmVar || (fiVar2 == niVar.f0 && fiVar == null)) && fiVar2 != null) {
            canvas.save();
            float f13 = niVar.h2;
            boolean z10 = niVar.c0;
            bg.d1 d1Var = niVar.K0;
            ph phVar = niVar.e1;
            canvas.translate(0.0f, f13);
            int alpha2 = (int) (fiVar2.getAlpha() * 255.0f);
            int h = fiVar2.h();
            int dp3 = AndroidUtilities.dp(13.0f) + ((int) ((phVar != null ? phVar.getAlpha() : 0.0f) * AndroidUtilities.dp(26.0f))) + ((int) (d1Var != null ? d1Var.getAlpha() * d1Var.getMeasuredHeight() : 0.0f));
            int p12 = niVar.p1(0);
            i10 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
            int i25 = (p12 - i10) - dp3;
            i11 = ((org.telegram.ui.ActionBar.f3) niVar).currentSheetAnimationType;
            if (i11 == 1 || niVar.p1 != null) {
                i25 = (int) (fiVar2.getTranslationY() + i25);
            }
            int dp4 = AndroidUtilities.dp(20.0f) + i25;
            getMeasuredHeight();
            AndroidUtilities.dp(45.0f);
            int currentActionBarHeight = h != 0 ? org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() : ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
            float f14 = 1.0f;
            if (h == 2) {
                if (i25 < currentActionBarHeight) {
                    float f15 = currentActionBarHeight - i25;
                    i24 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
                    f11 = Math.max(0.0f, 1.0f - (f15 / i24));
                } else {
                    f11 = 1.0f;
                }
                f9 = 0.0f;
            } else {
                float f16 = dp3;
                f9 = 0.0f;
                if (fiVar2 == niVar.k0) {
                    dp = AndroidUtilities.dp(11.0f);
                } else {
                    if (fiVar2 == niVar.i0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else if (fiVar2 == niVar.j0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else {
                        dp = AndroidUtilities.dp(4.0f);
                    }
                    f10 = f16 - dp2;
                    float alpha3 = niVar.T0.getAlpha();
                    int i26 = (int) (((currentActionBarHeight - f10) + AndroidUtilities.statusBarHeight) * alpha3);
                    i25 -= i26;
                    dp4 -= i26;
                    f11 = 1.0f - alpha3;
                }
                f10 = f16 + dp;
                float alpha32 = niVar.T0.getAlpha();
                int i262 = (int) (((currentActionBarHeight - f10) + AndroidUtilities.statusBarHeight) * alpha32);
                i25 -= i262;
                dp4 -= i262;
                f11 = 1.0f - alpha32;
            }
            if (!z10) {
                int i27 = AndroidUtilities.statusBarHeight;
                i25 += i27;
                dp4 += i27;
            }
            int customBackground = niVar.u0.f() ? niVar.u0.getCustomBackground() : niVar.q1(true);
            drawable = ((org.telegram.ui.ActionBar.f3) niVar).shadowDrawable;
            drawable.setAlpha(alpha2);
            drawable2 = ((org.telegram.ui.ActionBar.f3) niVar).shadowDrawable;
            int measuredWidth3 = getMeasuredWidth();
            int dp5 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
            i12 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
            drawable2.setBounds(0, i25, measuredWidth3, i12 + dp5);
            drawable3 = ((org.telegram.ui.ActionBar.f3) niVar).shadowDrawable;
            drawable3.draw(canvas);
            RectF rectF = this.t0;
            if (h == 2) {
                org.telegram.ui.ActionBar.g6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.g6.t0.setAlpha(alpha2);
                i20 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingLeft;
                i21 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
                f12 = 24.0f;
                float f17 = i21 + i25;
                int measuredWidth4 = getMeasuredWidth();
                i22 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingLeft;
                float f18 = measuredWidth4 - i22;
                i23 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
                rectF.set(i20, f17, f18, AndroidUtilities.dp(24.0f) + i23 + i25);
            } else {
                f12 = 24.0f;
            }
            if ((f11 != 1.0f && h != 2) || niVar.u0.e()) {
                Paint paint = org.telegram.ui.ActionBar.g6.t0;
                if (niVar.u0.e()) {
                    customBackground = niVar.u0.getCustomActionBarBackground();
                }
                paint.setColor(customBackground);
                org.telegram.ui.ActionBar.g6.t0.setAlpha(alpha2);
                i16 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingLeft;
                i17 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
                int measuredWidth5 = getMeasuredWidth();
                i18 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingLeft;
                float f19 = measuredWidth5 - i18;
                i19 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
                rectF.set(i16, i17 + i25, f19, AndroidUtilities.dp(f12) + i19 + i25);
            }
            if (niVar.u0.e()) {
                org.telegram.ui.ActionBar.g6.t0.setColor(niVar.u0.getCustomActionBarBackground());
                org.telegram.ui.ActionBar.g6.t0.setAlpha(alpha2);
                int p13 = niVar.p1(0);
                if (!z10) {
                    p13 += AndroidUtilities.statusBarHeight;
                }
                i13 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingLeft;
                i14 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
                float dp6 = (AndroidUtilities.dp(12.0f) + i14 + i25) * f11;
                int measuredWidth6 = getMeasuredWidth();
                i15 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingLeft;
                rectF.set(i13, dp6, measuredWidth6 - i15, AndroidUtilities.dp(12.0f) + p13);
                canvas.save();
                canvas.drawRect(rectF, org.telegram.ui.ActionBar.g6.t0);
                canvas.restore();
            }
            if ((phVar == null || phVar.getAlpha() != 1.0f) && f11 != f9) {
                int dp7 = AndroidUtilities.dp(36.0f);
                rectF.set((getMeasuredWidth() - dp7) / 2, dp4, (getMeasuredWidth() + dp7) / 2, AndroidUtilities.dp(4.0f) + dp4);
                if (h == 2) {
                    themedColor = TLObject.FLAG_29;
                    f14 = f11;
                } else if (niVar.u0.e()) {
                    int customActionBarBackground = niVar.u0.getCustomActionBarBackground();
                    themedColor = i0.a.d(0.5f, customActionBarBackground, i0.a.f(customActionBarBackground) < 0.5d ? -1 : -16777216);
                    if (phVar != null) {
                        alpha = phVar.getAlpha();
                        f14 = 1.0f - alpha;
                    }
                } else {
                    themedColor = niVar.getThemedColor(org.telegram.ui.ActionBar.g6.Ii);
                    if (phVar != null) {
                        alpha = phVar.getAlpha();
                        f14 = 1.0f - alpha;
                    }
                }
                int alpha4 = Color.alpha(themedColor);
                org.telegram.ui.ActionBar.g6.t0.setColor(themedColor);
                org.telegram.ui.ActionBar.g6.t0.setAlpha((int) (fiVar2.getAlpha() * alpha4 * f14 * f11));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.t0);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float f9;
        int i10;
        int i11;
        int i12;
        int dp;
        int dp2;
        float f10;
        int i13;
        int i14;
        int i15;
        int i16;
        float f11;
        int dp3;
        int dp4;
        float f12;
        int i17;
        float f13;
        boolean drawChild;
        int themedColor;
        float alpha;
        int i18;
        int i19;
        int i20;
        int i21;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        int i22;
        int i23;
        int i24;
        int i25;
        fi fiVar;
        int i26;
        ni niVar = this.x0;
        boolean z10 = niVar.c0;
        bg.d1 d1Var = niVar.K0;
        ng.d dVar = niVar.w0;
        ph phVar = niVar.e1;
        cg.m1 m1Var = niVar.T0;
        if (!(view instanceof fi) || view.getAlpha() <= 0.0f) {
            if (view != m1Var) {
                if (!(view instanceof fz) || dVar == null) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                dVar.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(dVar.h.k);
                dVar.draw(canvas);
                boolean drawChild2 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild2;
            }
            float alpha2 = m1Var.getAlpha();
            if (alpha2 <= 0.0f) {
                return false;
            }
            if (alpha2 >= 1.0f) {
                return super.drawChild(canvas, view, j10);
            }
            canvas.save();
            float x4 = m1Var.getX();
            fi fiVar2 = niVar.u0;
            if (fiVar2 != null) {
                int h = fiVar2.h();
                int dp5 = AndroidUtilities.dp(13.0f) + ((int) ((phVar != null ? phVar.getAlpha() : 0.0f) * AndroidUtilities.dp(26.0f))) + ((int) (d1Var != null ? d1Var.getAlpha() * d1Var.getMeasuredHeight() : 0.0f));
                int p12 = niVar.p1(0);
                i10 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
                int i27 = (p12 - i10) - dp5;
                i11 = ((org.telegram.ui.ActionBar.f3) niVar).currentSheetAnimationType;
                if (i11 == 1 || niVar.p1 != null) {
                    i27 = (int) (fiVar2.getTranslationY() + i27);
                }
                int dp6 = AndroidUtilities.dp(20.0f) + i27;
                int currentActionBarHeight = h != 0 ? org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() : ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
                if (h != 2) {
                    i12 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
                    if (i12 + i27 < currentActionBarHeight) {
                        float f14 = dp5;
                        if (fiVar2 == niVar.k0) {
                            dp = AndroidUtilities.dp(11.0f);
                        } else {
                            if (fiVar2 == niVar.i0) {
                                dp2 = AndroidUtilities.dp(3.0f);
                            } else if (fiVar2 == niVar.j0) {
                                dp2 = AndroidUtilities.dp(3.0f);
                            } else {
                                dp = AndroidUtilities.dp(4.0f);
                            }
                            f10 = f14 - dp2;
                            dp6 -= (int) (m1Var.getAlpha() * ((currentActionBarHeight - f10) + AndroidUtilities.statusBarHeight));
                        }
                        f10 = f14 + dp;
                        dp6 -= (int) (m1Var.getAlpha() * ((currentActionBarHeight - f10) + AndroidUtilities.statusBarHeight));
                    }
                }
                if (!z10) {
                    dp6 += AndroidUtilities.statusBarHeight;
                }
                f9 = dp6;
            } else {
                f9 = 0.0f;
            }
            canvas.clipRect(x4, f9, m1Var.getX() + m1Var.getWidth(), m1Var.getY() + m1Var.getHeight());
            boolean drawChild3 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild3;
        }
        canvas.save();
        canvas.translate(0.0f, niVar.h2);
        int alpha3 = (int) (view.getAlpha() * 255.0f);
        fi fiVar3 = (fi) view;
        int h10 = fiVar3.h();
        int dp7 = AndroidUtilities.dp(13.0f) + (phVar != null ? AndroidUtilities.dp(phVar.getAlpha() * 26.0f) : 0) + ((int) (d1Var != null ? d1Var.getAlpha() * d1Var.getMeasuredHeight() : 0.0f));
        int p13 = niVar.p1(fiVar3 == niVar.u0 ? 0 : 1);
        i13 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
        int i28 = (p13 - i13) - dp7;
        i14 = ((org.telegram.ui.ActionBar.f3) niVar).currentSheetAnimationType;
        if (i14 == 1 || niVar.p1 != null) {
            i28 = (int) (view.getTranslationY() + i28);
        }
        int dp8 = AndroidUtilities.dp(20.0f) + i28;
        int dp9 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
        i15 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
        int i29 = i15 + dp9;
        int currentActionBarHeight2 = h10 != 0 ? org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() : ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
        if (h10 != 2) {
            i16 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
            f11 = 0.0f;
            if (i16 + i28 < currentActionBarHeight2) {
                float f15 = dp7;
                if (fiVar3 == niVar.k0) {
                    dp3 = AndroidUtilities.dp(11.0f);
                } else {
                    if (fiVar3 == niVar.i0) {
                        dp4 = AndroidUtilities.dp(3.0f);
                    } else if (fiVar3 == niVar.j0) {
                        dp4 = AndroidUtilities.dp(3.0f);
                    } else {
                        dp3 = AndroidUtilities.dp(4.0f);
                    }
                    f12 = f15 - dp4;
                    i17 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
                    float min = Math.min(1.0f, ((currentActionBarHeight2 - i28) - i17) / f12);
                    int i30 = (int) ((currentActionBarHeight2 - f12) * min);
                    i28 -= i30;
                    dp8 -= i30;
                    i29 += i30;
                    f13 = 1.0f - min;
                }
                f12 = f15 + dp3;
                i17 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
                float min2 = Math.min(1.0f, ((currentActionBarHeight2 - i28) - i17) / f12);
                int i302 = (int) ((currentActionBarHeight2 - f12) * min2);
                i28 -= i302;
                dp8 -= i302;
                i29 += i302;
                f13 = 1.0f - min2;
            }
            f13 = 1.0f;
        } else if (i28 < currentActionBarHeight2) {
            i26 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
            f13 = Math.max(0.0f, 1.0f - ((currentActionBarHeight2 - i28) / i26));
            f11 = 0.0f;
        } else {
            f11 = 0.0f;
            f13 = 1.0f;
        }
        if (!z10) {
            int i31 = AndroidUtilities.statusBarHeight;
            i28 += i31;
            dp8 += i31;
            i29 -= i31;
        }
        int i32 = i29;
        int customBackground = niVar.u0.f() ? niVar.u0.getCustomBackground() : niVar.q1(true);
        fi fiVar4 = niVar.u0;
        lm lmVar = niVar.m0;
        boolean z11 = (fiVar4 == lmVar || (fiVar = niVar.v0) == lmVar || (fiVar4 == niVar.f0 && fiVar == null)) ? false : true;
        RectF rectF = this.t0;
        if (z11) {
            drawable = ((org.telegram.ui.ActionBar.f3) niVar).shadowDrawable;
            drawable.setAlpha(alpha3);
            drawable2 = ((org.telegram.ui.ActionBar.f3) niVar).shadowDrawable;
            drawable2.setBounds(0, i28, getMeasuredWidth(), i32);
            drawable3 = ((org.telegram.ui.ActionBar.f3) niVar).shadowDrawable;
            drawable3.draw(canvas);
            if (h10 == 2) {
                org.telegram.ui.ActionBar.g6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.g6.t0.setAlpha(alpha3);
                i22 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingLeft;
                i23 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
                int measuredWidth = getMeasuredWidth();
                i24 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingLeft;
                float f16 = measuredWidth - i24;
                i25 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
                rectF.set(i22, i23 + i28, f16, AndroidUtilities.dp(24.0f) + i25 + i28);
            }
        }
        if (view == niVar.g0 || view == niVar.o0 || view == niVar.h0) {
            drawChild = super.drawChild(canvas, view, j10);
        } else {
            canvas.save();
            drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
        }
        if (z11) {
            if (f13 != 1.0f && h10 != 2) {
                org.telegram.ui.ActionBar.g6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.g6.t0.setAlpha(alpha3);
                i18 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingLeft;
                i19 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
                int measuredWidth2 = getMeasuredWidth();
                i20 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingLeft;
                float f17 = measuredWidth2 - i20;
                i21 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
                rectF.set(i18, i19 + i28, f17, AndroidUtilities.dp(24.0f) + i21 + i28);
            }
            if ((phVar == null || phVar.getAlpha() != 1.0f) && f13 != f11) {
                int dp10 = AndroidUtilities.dp(36.0f);
                rectF.set((getMeasuredWidth() - dp10) / 2, dp8, (getMeasuredWidth() + dp10) / 2, AndroidUtilities.dp(4.0f) + dp8);
                if (h10 == 2) {
                    themedColor = TLObject.FLAG_29;
                    alpha = f13;
                } else {
                    themedColor = niVar.getThemedColor(org.telegram.ui.ActionBar.g6.Ii);
                    alpha = phVar == null ? 1.0f : 1.0f - phVar.getAlpha();
                }
                int alpha4 = Color.alpha(themedColor);
                org.telegram.ui.ActionBar.g6.t0.setColor(themedColor);
                org.telegram.ui.ActionBar.g6.t0.setAlpha((int) (view.getAlpha() * alpha4 * alpha * f13));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.t0);
            }
        }
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.hv0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ci ciVar = this.w0;
        ciVar.b = this;
        ciVar.c();
        ni niVar = this.x0;
        niVar.A0.setAdjustPanLayoutHelper(ciVar);
        niVar.L0.setAdjustPanLayoutHelper(ciVar);
    }

    @Override // org.telegram.ui.Components.hv0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.w0.d();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.x0.c0;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i10;
        ni niVar = this.x0;
        int[] iArr = niVar.X1;
        if (niVar.u0.l(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            if (iArr[0] != 0) {
                float y8 = motionEvent.getY();
                bg.d1 d1Var = niVar.K0;
                int i11 = iArr[0];
                i10 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingTop;
                int i12 = i11 - (i10 * 2);
                int dp = AndroidUtilities.dp(13.0f);
                ph phVar = niVar.e1;
                int dp2 = AndroidUtilities.dp(20.0f) + ((i12 - (dp + (phVar != null ? AndroidUtilities.dp(phVar.getAlpha() * 26.0f) : 0))) - ((int) (d1Var != null ? d1Var.getAlpha() * d1Var.getMeasuredHeight() : 0.0f)));
                if (!niVar.c0) {
                    dp2 += AndroidUtilities.statusBarHeight;
                }
                if (y8 < dp2 && niVar.T0.getAlpha() == 0.0f) {
                    niVar.onDismissWithTouchOutside();
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0161  */
    @Override // org.telegram.ui.Components.hv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        ol olVar;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        th thVar;
        wh whVar;
        on onVar;
        on onVar2;
        int i20;
        int max;
        int measuredHeight;
        int measuredHeight2;
        int emojiPadding;
        di diVar = this;
        ni niVar = diVar.x0;
        bg.d1 d1Var = niVar.K0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = niVar.f0;
        int i21 = i12 - i10;
        if (diVar.s0 != i21) {
            diVar.s0 = i21;
            ff ffVar = niVar.d0;
            if (ffVar != null && !ffVar.m0) {
                ffVar.dismiss();
            }
        }
        int childCount = diVar.getChildCount();
        if (Build.VERSION.SDK_INT >= 29) {
            niVar.g2.set(i10, i11, i12, i13);
            diVar.setSystemGestureExclusionRects(niVar.f2);
        }
        r0.m1 f9 = r0.j0.f(diVar);
        int i22 = 8;
        int i23 = f9 != null ? f9.a.f(8).d : 0;
        int paddingBottom = diVar.getPaddingBottom();
        z11 = ((org.telegram.ui.ActionBar.f3) niVar).keyboardVisible;
        if (!z11) {
            on onVar3 = niVar.i0;
            if (onVar3 == null || niVar.u0 != onVar3 || onVar3.A == null) {
                on onVar4 = niVar.j0;
                if (onVar4 == null || niVar.u0 != onVar4 || onVar4.A == null) {
                    if (i23 <= AndroidUtilities.dp(20.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        emojiPadding = niVar.m1().getEmojiPadding();
                        if (emojiPadding > 0) {
                            paddingBottom += emojiPadding;
                        }
                    }
                    emojiPadding = 0;
                    if (emojiPadding > 0) {
                    }
                } else {
                    if (i23 <= AndroidUtilities.dp(20.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        emojiPadding = niVar.j0.getEmojiPadding();
                        if (emojiPadding > 0) {
                        }
                    }
                    emojiPadding = 0;
                    if (emojiPadding > 0) {
                    }
                }
            } else {
                if (i23 <= AndroidUtilities.dp(20.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                    emojiPadding = niVar.i0.getEmojiPadding();
                    if (emojiPadding > 0) {
                    }
                }
                emojiPadding = 0;
                if (emojiPadding > 0) {
                }
            }
        }
        diVar.setBottomClip(paddingBottom);
        int i24 = 0;
        while (i24 < childCount) {
            View childAt = diVar.getChildAt(i24);
            if (childAt.getVisibility() != i22) {
                int i25 = AndroidUtilities.statusBarHeight;
                int max2 = i23 == 0 ? Math.max(AndroidUtilities.navigationBarHeight, paddingBottom) : 0;
                if (childAt instanceof fi) {
                    fi fiVar = (fi) childAt;
                    if (fiVar.h) {
                        i25 = 0;
                    }
                    if (fiVar.f) {
                        max2 = 0;
                    }
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight3 = childAt.getMeasuredHeight();
                int i26 = layoutParams.gravity;
                if (i26 == -1) {
                    i26 = 51;
                }
                int i27 = i26 & 112;
                int i28 = i26 & 7;
                if (i28 == 1) {
                    i14 = ((i21 - measuredWidth) / 2) + layoutParams.leftMargin;
                    i15 = layoutParams.rightMargin;
                } else if (i28 != 5) {
                    i16 = getPaddingLeft() + layoutParams.leftMargin;
                    if (i27 == 16) {
                        if (i27 == 48) {
                            i19 = layoutParams.topMargin + i25;
                        } else if (i27 != 80) {
                            i19 = layoutParams.topMargin;
                        } else {
                            i17 = ((i13 - max2) - i11) - measuredHeight3;
                            i18 = layoutParams.bottomMargin;
                        }
                        if (childAt != niVar.T0 || childAt == niVar.r1) {
                            i19 = 0;
                        }
                        thVar = niVar.A0;
                        if ((thVar == null && thVar.l(childAt)) || (((whVar = niVar.L0) != null && whVar.l(childAt)) || (((onVar = niVar.i0) != null && childAt == onVar.A) || ((onVar2 = niVar.j0) != null && childAt == onVar2.A)))) {
                            if (AndroidUtilities.isTablet()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight() + i23;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i19 = measuredHeight - measuredHeight2;
                        } else if (childAt == niVar.x2) {
                            if (niVar.Y) {
                                i20 = AndroidUtilities.statusBarHeight;
                                max = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                                i19 = i20 + max;
                            }
                        } else if (childAt == niVar.s1) {
                            i20 = i19 + AndroidUtilities.navigationBarHeight;
                            max = Math.max(i23, niVar.o1());
                            i19 = i20 + max;
                        }
                        childAt.layout(i16, i19, measuredWidth + i16, i19 + measuredHeight3);
                    } else {
                        i17 = ((((i13 - max2) - i11) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    if (childAt != niVar.T0) {
                    }
                    i19 = 0;
                    thVar = niVar.A0;
                    if (thVar == null) {
                    }
                    if (childAt == niVar.x2) {
                    }
                } else {
                    i14 = ((i21 - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                    i15 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingLeft;
                }
                i16 = i14 - i15;
                if (i27 == 16) {
                }
                i19 = i17 - i18;
                if (childAt != niVar.T0) {
                }
                i19 = 0;
                thVar = niVar.A0;
                if (thVar == null) {
                }
                if (childAt == niVar.x2) {
                }
            }
            i24++;
            diVar = this;
            i22 = 8;
        }
        S();
        niVar.X1(niVar.u0, 0);
        niVar.X1(niVar.v0, 0);
        if (niVar.Y) {
            niVar.U1();
        }
        if (chatAttachAlertPhotoLayout == null || (olVar = chatAttachAlertPhotoLayout.A) == null || olVar.getFastScroll() == null) {
            return;
        }
        chatAttachAlertPhotoLayout.A.getFastScroll().d0 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.l1 + (niVar.Y ? (int) (d1Var.getAlpha() * d1Var.getMeasuredHeight()) : 0);
        chatAttachAlertPhotoLayout.A.getFastScroll().invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        on onVar;
        on onVar2;
        boolean z10;
        int o12;
        int i15;
        int i16;
        di diVar = this;
        ni niVar = diVar.x0;
        boolean z11 = niVar.c0;
        org.telegram.ui.ActionBar.w0 w0Var = niVar.W0;
        int size = diVar.getLayoutParams().height > 0 ? diVar.getLayoutParams().height : View.MeasureSpec.getSize(i11);
        if (!z11) {
            diVar.u0 = true;
            i15 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingLeft;
            i16 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingLeft;
            diVar.setPadding(i15, 0, i16, 0);
            diVar.u0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        i12 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingLeft;
        int i17 = size2 - (i12 * 2);
        if (AndroidUtilities.isTablet()) {
            w0Var.setAdditionalYOffset(-AndroidUtilities.dp(3.0f));
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                w0Var.setAdditionalYOffset(0);
            } else {
                w0Var.setAdditionalYOffset(-AndroidUtilities.dp(3.0f));
            }
        }
        ((FrameLayout.LayoutParams) niVar.b1.getLayoutParams()).height = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        diVar.u0 = true;
        int min = (int) (i17 / Math.min(4.5f, niVar.w1.h()));
        if (niVar.U1 != min) {
            niVar.U1 = min;
            AndroidUtilities.runOnUIThread(new ig(diVar, 21));
        }
        diVar.u0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        diVar.setMeasuredDimension(size3, size4);
        i13 = ((org.telegram.ui.ActionBar.f3) niVar).backgroundPaddingLeft;
        wh whVar = niVar.L0;
        th thVar = niVar.A0;
        int i18 = size3 - (i13 * 2);
        if (!thVar.J && AndroidUtilities.dp(20.0f) >= 0 && !thVar.e && !thVar.K) {
            diVar.u0 = true;
            thVar.j();
            diVar.u0 = false;
        }
        if (!whVar.J && AndroidUtilities.dp(20.0f) >= 0 && !whVar.e && !whVar.K) {
            diVar.u0 = true;
            whVar.j();
            diVar.u0 = false;
        }
        if (niVar.i0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            on onVar3 = niVar.i0;
            if (!onVar3.C && !onVar3.W0 && !onVar3.b1 && !onVar3.d1) {
                diVar.u0 = true;
                onVar3.a0();
                diVar.u0 = false;
            }
        }
        if (niVar.j0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            on onVar4 = niVar.j0;
            if (!onVar4.C && !onVar4.W0 && !onVar4.b1 && !onVar4.d1) {
                diVar.u0 = true;
                onVar4.a0();
                diVar.u0 = false;
            }
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            z10 = ((org.telegram.ui.ActionBar.f3) niVar).keyboardVisible;
            if (z10) {
                fi fiVar = niVar.u0;
                on onVar5 = niVar.i0;
                if (fiVar == onVar5 && onVar5.A != null && onVar5.d1) {
                    o12 = AndroidUtilities.dp(120.0f);
                } else {
                    on onVar6 = niVar.j0;
                    o12 = (fiVar == onVar6 && onVar6.A != null && onVar6.d1) ? AndroidUtilities.dp(120.0f) : 0;
                }
            } else {
                o12 = niVar.o1();
            }
            r0.m1 f9 = r0.j0.f(diVar);
            int i19 = f9 != null ? f9.a.f(8).d : 0;
            r0.m1 f10 = r0.j0.f(diVar);
            Math.max(f10 != null ? f10.a.f(527).d : 0, o12);
            int max = Math.max(i19 > 0 ? 0 : AndroidUtilities.navigationBarHeight, o12);
            diVar.u0 = true;
            fi fiVar2 = niVar.u0;
            if (fiVar2.f) {
                fiVar2.e = AndroidUtilities.dp(62.0f) + max;
                niVar.u0.y(i18, size4);
            } else {
                fiVar2.e = AndroidUtilities.navigationBarHeight;
                fiVar2.y(i18, size4 - o12);
            }
            fi fiVar3 = niVar.v0;
            if (fiVar3 != null) {
                if (fiVar3.f) {
                    fiVar3.e = AndroidUtilities.dp(62.0f) + max;
                    niVar.v0.y(i18, size4);
                } else {
                    fiVar3.e = AndroidUtilities.navigationBarHeight;
                    fiVar3.y(i18, size4 - o12);
                }
            }
            diVar.u0 = false;
        }
        int childCount = diVar.getChildCount();
        int i20 = 0;
        while (i20 < childCount) {
            int i21 = i20;
            View childAt = diVar.getChildAt(i21);
            if (childAt == null || childAt.getVisibility() == 8) {
                i14 = i21;
            } else if (childAt == niVar.r1) {
                i14 = i21;
                diVar.measureChildWithMargins(childAt, i10, 0, makeMeasureSpec, 0);
            } else {
                i14 = i21;
                int i22 = AndroidUtilities.statusBarHeight;
                int i23 = AndroidUtilities.navigationBarHeight;
                if (childAt instanceof fi) {
                    fi fiVar4 = (fi) childAt;
                    if (fiVar4.h) {
                        i22 = 0;
                    }
                    if (fiVar4.f) {
                        i23 = 0;
                    }
                }
                if (!thVar.l(childAt) && !whVar.l(childAt) && (((onVar = niVar.i0) == null || childAt != onVar.A) && ((onVar2 = niVar.j0) == null || childAt != onVar2.A))) {
                    measureChildWithMargins(childAt, i10, 0, makeMeasureSpec, i22 + i23);
                } else if (z11) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + size4, TLObject.FLAG_30));
                } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (AndroidUtilities.isTablet()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), getPaddingTop() + (size4 - AndroidUtilities.statusBarHeight)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size4 - AndroidUtilities.statusBarHeight), TLObject.FLAG_30));
                }
            }
            i20 = i14 + 1;
            diVar = this;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int i14;
        WindowInsets rootWindowInsets;
        super.onSizeChanged(i10, i11, i12, i13);
        int i15 = 0;
        if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = getRootWindowInsets()) == null) {
            i14 = 0;
        } else {
            RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
            RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
            i14 = roundedCorner == null ? 0 : roundedCorner.getRadius();
            if (roundedCorner2 != null) {
                i15 = roundedCorner2.getRadius();
            }
        }
        ng.d dVar = this.x0.w0;
        if (dVar != null) {
            dVar.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i15, i14);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ni niVar = this.x0;
        if (niVar.u0.l(motionEvent)) {
            return true;
        }
        return !niVar.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.u0) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setTranslationY(float f9) {
        int i10;
        int i11;
        int i12;
        ViewGroup viewGroup;
        ni niVar = this.x0;
        ph phVar = niVar.t1;
        float f10 = f9 + niVar.h2;
        i10 = ((org.telegram.ui.ActionBar.f3) niVar).currentSheetAnimationType;
        if (i10 == 0) {
            this.v0 = f10;
        }
        i11 = ((org.telegram.ui.ActionBar.f3) niVar).currentSheetAnimationType;
        if (i11 == 1) {
            if (f10 < 0.0f) {
                niVar.u0.setTranslationY(f10);
                if (niVar.M0 != 0 || niVar.P0) {
                    niVar.e1.setTranslationY((niVar.l1 + f10) - niVar.h2);
                }
                phVar.setTranslationY(0.0f);
                f10 = 0.0f;
            } else {
                niVar.u0.setTranslationY(0.0f);
                phVar.setTranslationY(((f10 / this.v0) * phVar.getMeasuredHeight()) + (-f10));
            }
            viewGroup = ((org.telegram.ui.ActionBar.f3) niVar).containerView;
            viewGroup.invalidate();
        }
        super.setTranslationY(f10 - niVar.h2);
        i12 = ((org.telegram.ui.ActionBar.f3) niVar).currentSheetAnimationType;
        if (i12 != 1) {
            niVar.u0.k(niVar.h2);
        }
    }

    @Override // org.telegram.ui.Components.hv0
    public final void J(Canvas canvas, float f9, Rect rect, Paint paint, boolean z10) {
    }
}
