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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class wh extends zu0 {
    public int s0;
    public final RectF t0;
    public boolean u0;
    public float v0;
    public final vh w0;
    public final /* synthetic */ gi x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh(gi giVar, Context context) {
        super(context, null);
        this.x0 = giVar;
        this.t0 = new RectF();
        this.w0 = new vh(this, this);
    }

    @Override // org.telegram.ui.Components.zu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        float f10;
        int dp;
        int dp2;
        float f11;
        float f12;
        Drawable drawable;
        Drawable drawable2;
        int i12;
        Drawable drawable3;
        float f13;
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
        yh yhVar;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        gi giVar = this.x0;
        og.d dVar = giVar.A2;
        og.d dVar2 = giVar.z2;
        if (Build.VERSION.SDK_INT >= 31 && giVar.y2 != null) {
            giVar.Z0();
            if (dVar2 != null) {
                viewGroup3 = ((org.telegram.ui.ActionBar.e3) giVar).containerView;
                int measuredWidth = viewGroup3.getMeasuredWidth();
                viewGroup4 = ((org.telegram.ui.ActionBar.e3) giVar).containerView;
                dVar2.h(measuredWidth, viewGroup4.getMeasuredHeight());
                dVar2.j();
            }
            if (dVar != null) {
                viewGroup = ((org.telegram.ui.ActionBar.e3) giVar).containerView;
                int measuredWidth2 = viewGroup.getMeasuredWidth();
                viewGroup2 = ((org.telegram.ui.ActionBar.e3) giVar).containerView;
                dVar.h(measuredWidth2, viewGroup2.getMeasuredHeight());
                dVar.j();
            }
        }
        canvas.save();
        yh yhVar2 = giVar.u0;
        em emVar = giVar.m0;
        if ((yhVar2 == emVar || (yhVar = giVar.v0) == emVar || (yhVar2 == giVar.f0 && yhVar == null)) && yhVar2 != null) {
            canvas.save();
            float f14 = giVar.h2;
            boolean z10 = giVar.c0;
            ag.y1 y1Var = giVar.K0;
            ih ihVar = giVar.e1;
            canvas.translate(0.0f, f14);
            int alpha2 = (int) (yhVar2.getAlpha() * 255.0f);
            int h = yhVar2.h();
            int dp3 = AndroidUtilities.dp(13.0f) + ((int) ((ihVar != null ? ihVar.getAlpha() : 0.0f) * AndroidUtilities.dp(26.0f))) + ((int) (y1Var != null ? y1Var.getAlpha() * y1Var.getMeasuredHeight() : 0.0f));
            int p12 = giVar.p1(0);
            i10 = ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop;
            int i25 = (p12 - i10) - dp3;
            i11 = ((org.telegram.ui.ActionBar.e3) giVar).currentSheetAnimationType;
            if (i11 == 1 || giVar.p1 != null) {
                i25 = (int) (yhVar2.getTranslationY() + i25);
            }
            int dp4 = AndroidUtilities.dp(20.0f) + i25;
            getMeasuredHeight();
            AndroidUtilities.dp(45.0f);
            int currentActionBarHeight = h != 0 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop;
            float f15 = 1.0f;
            if (h == 2) {
                if (i25 < currentActionBarHeight) {
                    float f16 = currentActionBarHeight - i25;
                    i24 = ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop;
                    f12 = Math.max(0.0f, 1.0f - (f16 / i24));
                } else {
                    f12 = 1.0f;
                }
                f10 = 0.0f;
            } else {
                float f17 = dp3;
                f10 = 0.0f;
                if (yhVar2 == giVar.k0) {
                    dp = AndroidUtilities.dp(11.0f);
                } else {
                    if (yhVar2 == giVar.i0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else if (yhVar2 == giVar.j0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else {
                        dp = AndroidUtilities.dp(4.0f);
                    }
                    f11 = f17 - dp2;
                    float alpha3 = giVar.T0.getAlpha();
                    int i26 = (int) (((currentActionBarHeight - f11) + AndroidUtilities.statusBarHeight) * alpha3);
                    i25 -= i26;
                    dp4 -= i26;
                    f12 = 1.0f - alpha3;
                }
                f11 = f17 + dp;
                float alpha32 = giVar.T0.getAlpha();
                int i262 = (int) (((currentActionBarHeight - f11) + AndroidUtilities.statusBarHeight) * alpha32);
                i25 -= i262;
                dp4 -= i262;
                f12 = 1.0f - alpha32;
            }
            if (!z10) {
                int i27 = AndroidUtilities.statusBarHeight;
                i25 += i27;
                dp4 += i27;
            }
            int customBackground = giVar.u0.f() ? giVar.u0.getCustomBackground() : giVar.q1(true);
            drawable = ((org.telegram.ui.ActionBar.e3) giVar).shadowDrawable;
            drawable.setAlpha(alpha2);
            drawable2 = ((org.telegram.ui.ActionBar.e3) giVar).shadowDrawable;
            int measuredWidth3 = getMeasuredWidth();
            int dp5 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
            i12 = ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop;
            drawable2.setBounds(0, i25, measuredWidth3, i12 + dp5);
            drawable3 = ((org.telegram.ui.ActionBar.e3) giVar).shadowDrawable;
            drawable3.draw(canvas);
            RectF rectF = this.t0;
            if (h == 2) {
                org.telegram.ui.ActionBar.g6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.g6.t0.setAlpha(alpha2);
                i20 = ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingLeft;
                i21 = ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop;
                f13 = 24.0f;
                float f18 = i21 + i25;
                int measuredWidth4 = getMeasuredWidth();
                i22 = ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingLeft;
                float f19 = measuredWidth4 - i22;
                i23 = ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop;
                rectF.set(i20, f18, f19, AndroidUtilities.dp(24.0f) + i23 + i25);
            } else {
                f13 = 24.0f;
            }
            if ((f12 != 1.0f && h != 2) || giVar.u0.e()) {
                Paint paint = org.telegram.ui.ActionBar.g6.t0;
                if (giVar.u0.e()) {
                    customBackground = giVar.u0.getCustomActionBarBackground();
                }
                paint.setColor(customBackground);
                org.telegram.ui.ActionBar.g6.t0.setAlpha(alpha2);
                i16 = ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingLeft;
                i17 = ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop;
                int measuredWidth5 = getMeasuredWidth();
                i18 = ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingLeft;
                float f20 = measuredWidth5 - i18;
                i19 = ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop;
                rectF.set(i16, i17 + i25, f20, AndroidUtilities.dp(f13) + i19 + i25);
            }
            if (giVar.u0.e()) {
                org.telegram.ui.ActionBar.g6.t0.setColor(giVar.u0.getCustomActionBarBackground());
                org.telegram.ui.ActionBar.g6.t0.setAlpha(alpha2);
                int p13 = giVar.p1(0);
                if (!z10) {
                    p13 += AndroidUtilities.statusBarHeight;
                }
                i13 = ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingLeft;
                i14 = ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop;
                float dp6 = (AndroidUtilities.dp(12.0f) + i14 + i25) * f12;
                int measuredWidth6 = getMeasuredWidth();
                i15 = ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingLeft;
                rectF.set(i13, dp6, measuredWidth6 - i15, AndroidUtilities.dp(12.0f) + p13);
                canvas.save();
                canvas.drawRect(rectF, org.telegram.ui.ActionBar.g6.t0);
                canvas.restore();
            }
            if ((ihVar == null || ihVar.getAlpha() != 1.0f) && f12 != f10) {
                int dp7 = AndroidUtilities.dp(36.0f);
                rectF.set((getMeasuredWidth() - dp7) / 2, dp4, (getMeasuredWidth() + dp7) / 2, AndroidUtilities.dp(4.0f) + dp4);
                if (h == 2) {
                    themedColor = TLObject.FLAG_29;
                    f15 = f12;
                } else if (giVar.u0.e()) {
                    int customActionBarBackground = giVar.u0.getCustomActionBarBackground();
                    themedColor = i0.b.d(0.5f, customActionBarBackground, i0.b.f(customActionBarBackground) < 0.5d ? -1 : -16777216);
                    if (ihVar != null) {
                        alpha = ihVar.getAlpha();
                        f15 = 1.0f - alpha;
                    }
                } else {
                    themedColor = giVar.getThemedColor(org.telegram.ui.ActionBar.g6.Ii);
                    if (ihVar != null) {
                        alpha = ihVar.getAlpha();
                        f15 = 1.0f - alpha;
                    }
                }
                int alpha4 = Color.alpha(themedColor);
                org.telegram.ui.ActionBar.g6.t0.setColor(themedColor);
                org.telegram.ui.ActionBar.g6.t0.setAlpha((int) (yhVar2.getAlpha() * alpha4 * f15 * f12));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.t0);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float f10;
        int i10;
        int i11;
        int i12;
        int dp;
        int dp2;
        float f11;
        int i13;
        int i14;
        int i15;
        int i16;
        float f12;
        int dp3;
        int dp4;
        float f13;
        int i17;
        float f14;
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
        yh yhVar;
        int i26;
        gi giVar = this.x0;
        boolean z10 = giVar.c0;
        ag.y1 y1Var = giVar.K0;
        lg.d dVar = giVar.w0;
        ih ihVar = giVar.e1;
        ag.d2 d2Var = giVar.T0;
        if (!(view instanceof yh) || view.getAlpha() <= 0.0f) {
            if (view != d2Var) {
                if (!(view instanceof yy) || dVar == null) {
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
            float alpha2 = d2Var.getAlpha();
            if (alpha2 <= 0.0f) {
                return false;
            }
            if (alpha2 >= 1.0f) {
                return super.drawChild(canvas, view, j10);
            }
            canvas.save();
            float x8 = d2Var.getX();
            yh yhVar2 = giVar.u0;
            if (yhVar2 != null) {
                int h = yhVar2.h();
                int dp5 = AndroidUtilities.dp(13.0f) + ((int) ((ihVar != null ? ihVar.getAlpha() : 0.0f) * AndroidUtilities.dp(26.0f))) + ((int) (y1Var != null ? y1Var.getAlpha() * y1Var.getMeasuredHeight() : 0.0f));
                int p12 = giVar.p1(0);
                i10 = ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop;
                int i27 = (p12 - i10) - dp5;
                i11 = ((org.telegram.ui.ActionBar.e3) giVar).currentSheetAnimationType;
                if (i11 == 1 || giVar.p1 != null) {
                    i27 = (int) (yhVar2.getTranslationY() + i27);
                }
                int dp6 = AndroidUtilities.dp(20.0f) + i27;
                int currentActionBarHeight = h != 0 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop;
                if (h != 2) {
                    i12 = ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop;
                    if (i12 + i27 < currentActionBarHeight) {
                        float f15 = dp5;
                        if (yhVar2 == giVar.k0) {
                            dp = AndroidUtilities.dp(11.0f);
                        } else {
                            if (yhVar2 == giVar.i0) {
                                dp2 = AndroidUtilities.dp(3.0f);
                            } else if (yhVar2 == giVar.j0) {
                                dp2 = AndroidUtilities.dp(3.0f);
                            } else {
                                dp = AndroidUtilities.dp(4.0f);
                            }
                            f11 = f15 - dp2;
                            dp6 -= (int) (d2Var.getAlpha() * ((currentActionBarHeight - f11) + AndroidUtilities.statusBarHeight));
                        }
                        f11 = f15 + dp;
                        dp6 -= (int) (d2Var.getAlpha() * ((currentActionBarHeight - f11) + AndroidUtilities.statusBarHeight));
                    }
                }
                if (!z10) {
                    dp6 += AndroidUtilities.statusBarHeight;
                }
                f10 = dp6;
            } else {
                f10 = 0.0f;
            }
            canvas.clipRect(x8, f10, d2Var.getX() + d2Var.getWidth(), d2Var.getY() + d2Var.getHeight());
            boolean drawChild3 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild3;
        }
        canvas.save();
        canvas.translate(0.0f, giVar.h2);
        int alpha3 = (int) (view.getAlpha() * 255.0f);
        yh yhVar3 = (yh) view;
        int h10 = yhVar3.h();
        int dp7 = AndroidUtilities.dp(13.0f) + (ihVar != null ? AndroidUtilities.dp(ihVar.getAlpha() * 26.0f) : 0) + ((int) (y1Var != null ? y1Var.getAlpha() * y1Var.getMeasuredHeight() : 0.0f));
        int p13 = giVar.p1(yhVar3 == giVar.u0 ? 0 : 1);
        i13 = ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop;
        int i28 = (p13 - i13) - dp7;
        i14 = ((org.telegram.ui.ActionBar.e3) giVar).currentSheetAnimationType;
        if (i14 == 1 || giVar.p1 != null) {
            i28 = (int) (view.getTranslationY() + i28);
        }
        int dp8 = AndroidUtilities.dp(20.0f) + i28;
        int dp9 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
        i15 = ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop;
        int i29 = i15 + dp9;
        int currentActionBarHeight2 = h10 != 0 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop;
        if (h10 != 2) {
            i16 = ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop;
            f12 = 0.0f;
            if (i16 + i28 < currentActionBarHeight2) {
                float f16 = dp7;
                if (yhVar3 == giVar.k0) {
                    dp3 = AndroidUtilities.dp(11.0f);
                } else {
                    if (yhVar3 == giVar.i0) {
                        dp4 = AndroidUtilities.dp(3.0f);
                    } else if (yhVar3 == giVar.j0) {
                        dp4 = AndroidUtilities.dp(3.0f);
                    } else {
                        dp3 = AndroidUtilities.dp(4.0f);
                    }
                    f13 = f16 - dp4;
                    i17 = ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop;
                    float min = Math.min(1.0f, ((currentActionBarHeight2 - i28) - i17) / f13);
                    int i30 = (int) ((currentActionBarHeight2 - f13) * min);
                    i28 -= i30;
                    dp8 -= i30;
                    i29 += i30;
                    f14 = 1.0f - min;
                }
                f13 = f16 + dp3;
                i17 = ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop;
                float min2 = Math.min(1.0f, ((currentActionBarHeight2 - i28) - i17) / f13);
                int i302 = (int) ((currentActionBarHeight2 - f13) * min2);
                i28 -= i302;
                dp8 -= i302;
                i29 += i302;
                f14 = 1.0f - min2;
            }
            f14 = 1.0f;
        } else if (i28 < currentActionBarHeight2) {
            i26 = ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop;
            f14 = Math.max(0.0f, 1.0f - ((currentActionBarHeight2 - i28) / i26));
            f12 = 0.0f;
        } else {
            f12 = 0.0f;
            f14 = 1.0f;
        }
        if (!z10) {
            int i31 = AndroidUtilities.statusBarHeight;
            i28 += i31;
            dp8 += i31;
            i29 -= i31;
        }
        int i32 = i29;
        int customBackground = giVar.u0.f() ? giVar.u0.getCustomBackground() : giVar.q1(true);
        yh yhVar4 = giVar.u0;
        em emVar = giVar.m0;
        boolean z11 = (yhVar4 == emVar || (yhVar = giVar.v0) == emVar || (yhVar4 == giVar.f0 && yhVar == null)) ? false : true;
        RectF rectF = this.t0;
        if (z11) {
            drawable = ((org.telegram.ui.ActionBar.e3) giVar).shadowDrawable;
            drawable.setAlpha(alpha3);
            drawable2 = ((org.telegram.ui.ActionBar.e3) giVar).shadowDrawable;
            drawable2.setBounds(0, i28, getMeasuredWidth(), i32);
            drawable3 = ((org.telegram.ui.ActionBar.e3) giVar).shadowDrawable;
            drawable3.draw(canvas);
            if (h10 == 2) {
                org.telegram.ui.ActionBar.g6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.g6.t0.setAlpha(alpha3);
                i22 = ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingLeft;
                i23 = ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop;
                int measuredWidth = getMeasuredWidth();
                i24 = ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingLeft;
                float f17 = measuredWidth - i24;
                i25 = ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop;
                rectF.set(i22, i23 + i28, f17, AndroidUtilities.dp(24.0f) + i25 + i28);
            }
        }
        if (view == giVar.g0 || view == giVar.o0 || view == giVar.h0) {
            drawChild = super.drawChild(canvas, view, j10);
        } else {
            canvas.save();
            drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
        }
        if (z11) {
            if (f14 != 1.0f && h10 != 2) {
                org.telegram.ui.ActionBar.g6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.g6.t0.setAlpha(alpha3);
                i18 = ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingLeft;
                i19 = ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop;
                int measuredWidth2 = getMeasuredWidth();
                i20 = ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingLeft;
                float f18 = measuredWidth2 - i20;
                i21 = ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop;
                rectF.set(i18, i19 + i28, f18, AndroidUtilities.dp(24.0f) + i21 + i28);
            }
            if ((ihVar == null || ihVar.getAlpha() != 1.0f) && f14 != f12) {
                int dp10 = AndroidUtilities.dp(36.0f);
                rectF.set((getMeasuredWidth() - dp10) / 2, dp8, (getMeasuredWidth() + dp10) / 2, AndroidUtilities.dp(4.0f) + dp8);
                if (h10 == 2) {
                    themedColor = TLObject.FLAG_29;
                    alpha = f14;
                } else {
                    themedColor = giVar.getThemedColor(org.telegram.ui.ActionBar.g6.Ii);
                    alpha = ihVar == null ? 1.0f : 1.0f - ihVar.getAlpha();
                }
                int alpha4 = Color.alpha(themedColor);
                org.telegram.ui.ActionBar.g6.t0.setColor(themedColor);
                org.telegram.ui.ActionBar.g6.t0.setAlpha((int) (view.getAlpha() * alpha4 * alpha * f14));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.t0);
            }
        }
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.zu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        vh vhVar = this.w0;
        vhVar.b = this;
        vhVar.c();
        gi giVar = this.x0;
        giVar.A0.setAdjustPanLayoutHelper(vhVar);
        giVar.L0.setAdjustPanLayoutHelper(vhVar);
    }

    @Override // org.telegram.ui.Components.zu0, android.view.ViewGroup, android.view.View
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
        gi giVar = this.x0;
        int[] iArr = giVar.X1;
        if (giVar.u0.l(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            if (iArr[0] != 0) {
                float y10 = motionEvent.getY();
                ag.y1 y1Var = giVar.K0;
                int i11 = iArr[0];
                i10 = ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingTop;
                int i12 = i11 - (i10 * 2);
                int dp = AndroidUtilities.dp(13.0f);
                ih ihVar = giVar.e1;
                int dp2 = AndroidUtilities.dp(20.0f) + ((i12 - (dp + (ihVar != null ? AndroidUtilities.dp(ihVar.getAlpha() * 26.0f) : 0))) - ((int) (y1Var != null ? y1Var.getAlpha() * y1Var.getMeasuredHeight() : 0.0f)));
                if (!giVar.c0) {
                    dp2 += AndroidUtilities.statusBarHeight;
                }
                if (y10 < dp2 && giVar.T0.getAlpha() == 0.0f) {
                    giVar.onDismissWithTouchOutside();
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
    @Override // org.telegram.ui.Components.zu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        gl glVar;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        mh mhVar;
        ph phVar;
        in inVar;
        in inVar2;
        int i20;
        int max;
        int measuredHeight;
        int measuredHeight2;
        int emojiPadding;
        wh whVar = this;
        gi giVar = whVar.x0;
        ag.y1 y1Var = giVar.K0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = giVar.f0;
        int i21 = i12 - i10;
        if (whVar.s0 != i21) {
            whVar.s0 = i21;
            ye yeVar = giVar.d0;
            if (yeVar != null && !yeVar.m0) {
                yeVar.dismiss();
            }
        }
        int childCount = whVar.getChildCount();
        if (Build.VERSION.SDK_INT >= 29) {
            giVar.g2.set(i10, i11, i12, i13);
            whVar.setSystemGestureExclusionRects(giVar.f2);
        }
        r0.m1 f10 = r0.j0.f(whVar);
        int i22 = 8;
        int i23 = f10 != null ? f10.a.f(8).d : 0;
        int paddingBottom = whVar.getPaddingBottom();
        z11 = ((org.telegram.ui.ActionBar.e3) giVar).keyboardVisible;
        if (!z11) {
            in inVar3 = giVar.i0;
            if (inVar3 == null || giVar.u0 != inVar3 || inVar3.A == null) {
                in inVar4 = giVar.j0;
                if (inVar4 == null || giVar.u0 != inVar4 || inVar4.A == null) {
                    if (i23 <= AndroidUtilities.dp(20.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        emojiPadding = giVar.m1().getEmojiPadding();
                        if (emojiPadding > 0) {
                            paddingBottom += emojiPadding;
                        }
                    }
                    emojiPadding = 0;
                    if (emojiPadding > 0) {
                    }
                } else {
                    if (i23 <= AndroidUtilities.dp(20.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        emojiPadding = giVar.j0.getEmojiPadding();
                        if (emojiPadding > 0) {
                        }
                    }
                    emojiPadding = 0;
                    if (emojiPadding > 0) {
                    }
                }
            } else {
                if (i23 <= AndroidUtilities.dp(20.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                    emojiPadding = giVar.i0.getEmojiPadding();
                    if (emojiPadding > 0) {
                    }
                }
                emojiPadding = 0;
                if (emojiPadding > 0) {
                }
            }
        }
        whVar.setBottomClip(paddingBottom);
        int i24 = 0;
        while (i24 < childCount) {
            View childAt = whVar.getChildAt(i24);
            if (childAt.getVisibility() != i22) {
                int i25 = AndroidUtilities.statusBarHeight;
                int max2 = i23 == 0 ? Math.max(AndroidUtilities.navigationBarHeight, paddingBottom) : 0;
                if (childAt instanceof yh) {
                    yh yhVar = (yh) childAt;
                    if (yhVar.h) {
                        i25 = 0;
                    }
                    if (yhVar.f) {
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
                        if (childAt != giVar.T0 || childAt == giVar.r1) {
                            i19 = 0;
                        }
                        mhVar = giVar.A0;
                        if ((mhVar == null && mhVar.l(childAt)) || (((phVar = giVar.L0) != null && phVar.l(childAt)) || (((inVar = giVar.i0) != null && childAt == inVar.A) || ((inVar2 = giVar.j0) != null && childAt == inVar2.A)))) {
                            if (AndroidUtilities.isTablet()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight() + i23;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i19 = measuredHeight - measuredHeight2;
                        } else if (childAt == giVar.x2) {
                            if (giVar.Y) {
                                i20 = AndroidUtilities.statusBarHeight;
                                max = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                i19 = i20 + max;
                            }
                        } else if (childAt == giVar.s1) {
                            i20 = i19 + AndroidUtilities.navigationBarHeight;
                            max = Math.max(i23, giVar.o1());
                            i19 = i20 + max;
                        }
                        childAt.layout(i16, i19, measuredWidth + i16, i19 + measuredHeight3);
                    } else {
                        i17 = ((((i13 - max2) - i11) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    if (childAt != giVar.T0) {
                    }
                    i19 = 0;
                    mhVar = giVar.A0;
                    if (mhVar == null) {
                    }
                    if (childAt == giVar.x2) {
                    }
                } else {
                    i14 = ((i21 - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                    i15 = ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingLeft;
                }
                i16 = i14 - i15;
                if (i27 == 16) {
                }
                i19 = i17 - i18;
                if (childAt != giVar.T0) {
                }
                i19 = 0;
                mhVar = giVar.A0;
                if (mhVar == null) {
                }
                if (childAt == giVar.x2) {
                }
            }
            i24++;
            whVar = this;
            i22 = 8;
        }
        S();
        giVar.X1(giVar.u0, 0);
        giVar.X1(giVar.v0, 0);
        if (giVar.Y) {
            giVar.U1();
        }
        if (chatAttachAlertPhotoLayout == null || (glVar = chatAttachAlertPhotoLayout.A) == null || glVar.getFastScroll() == null) {
            return;
        }
        chatAttachAlertPhotoLayout.A.getFastScroll().d0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.l1 + (giVar.Y ? (int) (y1Var.getAlpha() * y1Var.getMeasuredHeight()) : 0);
        chatAttachAlertPhotoLayout.A.getFastScroll().invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        in inVar;
        in inVar2;
        boolean z10;
        int o12;
        int i15;
        int i16;
        wh whVar = this;
        gi giVar = whVar.x0;
        boolean z11 = giVar.c0;
        org.telegram.ui.ActionBar.v0 v0Var = giVar.W0;
        int size = whVar.getLayoutParams().height > 0 ? whVar.getLayoutParams().height : View.MeasureSpec.getSize(i11);
        if (!z11) {
            whVar.u0 = true;
            i15 = ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingLeft;
            i16 = ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingLeft;
            whVar.setPadding(i15, 0, i16, 0);
            whVar.u0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        i12 = ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingLeft;
        int i17 = size2 - (i12 * 2);
        if (AndroidUtilities.isTablet()) {
            v0Var.setAdditionalYOffset(-AndroidUtilities.dp(3.0f));
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                v0Var.setAdditionalYOffset(0);
            } else {
                v0Var.setAdditionalYOffset(-AndroidUtilities.dp(3.0f));
            }
        }
        ((FrameLayout.LayoutParams) giVar.b1.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        whVar.u0 = true;
        int min = (int) (i17 / Math.min(4.5f, giVar.w1.h()));
        if (giVar.U1 != min) {
            giVar.U1 = min;
            AndroidUtilities.runOnUIThread(new bg(whVar, 21));
        }
        whVar.u0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        whVar.setMeasuredDimension(size3, size4);
        i13 = ((org.telegram.ui.ActionBar.e3) giVar).backgroundPaddingLeft;
        ph phVar = giVar.L0;
        mh mhVar = giVar.A0;
        int i18 = size3 - (i13 * 2);
        if (!mhVar.J && AndroidUtilities.dp(20.0f) >= 0 && !mhVar.e && !mhVar.K) {
            whVar.u0 = true;
            mhVar.j();
            whVar.u0 = false;
        }
        if (!phVar.J && AndroidUtilities.dp(20.0f) >= 0 && !phVar.e && !phVar.K) {
            whVar.u0 = true;
            phVar.j();
            whVar.u0 = false;
        }
        if (giVar.i0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            in inVar3 = giVar.i0;
            if (!inVar3.C && !inVar3.W0 && !inVar3.b1 && !inVar3.d1) {
                whVar.u0 = true;
                inVar3.a0();
                whVar.u0 = false;
            }
        }
        if (giVar.j0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            in inVar4 = giVar.j0;
            if (!inVar4.C && !inVar4.W0 && !inVar4.b1 && !inVar4.d1) {
                whVar.u0 = true;
                inVar4.a0();
                whVar.u0 = false;
            }
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            z10 = ((org.telegram.ui.ActionBar.e3) giVar).keyboardVisible;
            if (z10) {
                yh yhVar = giVar.u0;
                in inVar5 = giVar.i0;
                if (yhVar == inVar5 && inVar5.A != null && inVar5.d1) {
                    o12 = AndroidUtilities.dp(120.0f);
                } else {
                    in inVar6 = giVar.j0;
                    o12 = (yhVar == inVar6 && inVar6.A != null && inVar6.d1) ? AndroidUtilities.dp(120.0f) : 0;
                }
            } else {
                o12 = giVar.o1();
            }
            r0.m1 f10 = r0.j0.f(whVar);
            int i19 = f10 != null ? f10.a.f(8).d : 0;
            r0.m1 f11 = r0.j0.f(whVar);
            Math.max(f11 != null ? f11.a.f(527).d : 0, o12);
            int max = Math.max(i19 > 0 ? 0 : AndroidUtilities.navigationBarHeight, o12);
            whVar.u0 = true;
            yh yhVar2 = giVar.u0;
            if (yhVar2.f) {
                yhVar2.e = AndroidUtilities.dp(62.0f) + max;
                giVar.u0.z(i18, size4);
            } else {
                yhVar2.e = AndroidUtilities.navigationBarHeight;
                yhVar2.z(i18, size4 - o12);
            }
            yh yhVar3 = giVar.v0;
            if (yhVar3 != null) {
                if (yhVar3.f) {
                    yhVar3.e = AndroidUtilities.dp(62.0f) + max;
                    giVar.v0.z(i18, size4);
                } else {
                    yhVar3.e = AndroidUtilities.navigationBarHeight;
                    yhVar3.z(i18, size4 - o12);
                }
            }
            whVar.u0 = false;
        }
        int childCount = whVar.getChildCount();
        int i20 = 0;
        while (i20 < childCount) {
            int i21 = i20;
            View childAt = whVar.getChildAt(i21);
            if (childAt == null || childAt.getVisibility() == 8) {
                i14 = i21;
            } else if (childAt == giVar.r1) {
                i14 = i21;
                whVar.measureChildWithMargins(childAt, i10, 0, makeMeasureSpec, 0);
            } else {
                i14 = i21;
                int i22 = AndroidUtilities.statusBarHeight;
                int i23 = AndroidUtilities.navigationBarHeight;
                if (childAt instanceof yh) {
                    yh yhVar4 = (yh) childAt;
                    if (yhVar4.h) {
                        i22 = 0;
                    }
                    if (yhVar4.f) {
                        i23 = 0;
                    }
                }
                if (!mhVar.l(childAt) && !phVar.l(childAt) && (((inVar = giVar.i0) == null || childAt != inVar.A) && ((inVar2 = giVar.j0) == null || childAt != inVar2.A))) {
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
            whVar = this;
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
        lg.d dVar = this.x0.w0;
        if (dVar != null) {
            dVar.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i15, i14);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        gi giVar = this.x0;
        if (giVar.u0.l(motionEvent)) {
            return true;
        }
        return !giVar.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.u0) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        int i10;
        int i11;
        int i12;
        ViewGroup viewGroup;
        gi giVar = this.x0;
        ih ihVar = giVar.t1;
        float f11 = f10 + giVar.h2;
        i10 = ((org.telegram.ui.ActionBar.e3) giVar).currentSheetAnimationType;
        if (i10 == 0) {
            this.v0 = f11;
        }
        i11 = ((org.telegram.ui.ActionBar.e3) giVar).currentSheetAnimationType;
        if (i11 == 1) {
            if (f11 < 0.0f) {
                giVar.u0.setTranslationY(f11);
                if (giVar.M0 != 0 || giVar.P0) {
                    giVar.e1.setTranslationY((giVar.l1 + f11) - giVar.h2);
                }
                ihVar.setTranslationY(0.0f);
                f11 = 0.0f;
            } else {
                giVar.u0.setTranslationY(0.0f);
                ihVar.setTranslationY(((f11 / this.v0) * ihVar.getMeasuredHeight()) + (-f11));
            }
            viewGroup = ((org.telegram.ui.ActionBar.e3) giVar).containerView;
            viewGroup.invalidate();
        }
        super.setTranslationY(f11 - giVar.h2);
        i12 = ((org.telegram.ui.ActionBar.e3) giVar).currentSheetAnimationType;
        if (i12 != 1) {
            giVar.u0.k(giVar.h2);
        }
    }

    @Override // org.telegram.ui.Components.zu0
    public final void J(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
    }
}
