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

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class mi extends aw0 {
    public final li A0;
    public final /* synthetic */ wi B0;
    public int w0;
    public final RectF x0;
    public boolean y0;
    public float z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi(wi wiVar, Context context) {
        super(context, null);
        this.B0 = wiVar;
        this.x0 = new RectF();
        this.A0 = new li(this, this);
    }

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        float f7;
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
        oi oiVar;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        wi wiVar = this.B0;
        fh.d dVar = wiVar.E2;
        fh.d dVar2 = wiVar.D2;
        if (Build.VERSION.SDK_INT >= 31 && wiVar.C2 != null) {
            wiVar.Z0();
            if (dVar2 != null) {
                viewGroup3 = ((org.telegram.ui.ActionBar.e3) wiVar).containerView;
                int measuredWidth = viewGroup3.getMeasuredWidth();
                viewGroup4 = ((org.telegram.ui.ActionBar.e3) wiVar).containerView;
                dVar2.j(measuredWidth, viewGroup4.getMeasuredHeight());
                dVar2.l();
            }
            if (dVar != null) {
                viewGroup = ((org.telegram.ui.ActionBar.e3) wiVar).containerView;
                int measuredWidth2 = viewGroup.getMeasuredWidth();
                viewGroup2 = ((org.telegram.ui.ActionBar.e3) wiVar).containerView;
                dVar.j(measuredWidth2, viewGroup2.getMeasuredHeight());
                dVar.l();
            }
        }
        canvas.save();
        oi oiVar2 = wiVar.y0;
        rm rmVar = wiVar.q0;
        if ((oiVar2 == rmVar || (oiVar = wiVar.z0) == rmVar || (oiVar2 == wiVar.j0 && oiVar == null)) && oiVar2 != null) {
            canvas.save();
            float f13 = wiVar.l2;
            boolean z10 = wiVar.g0;
            ci.m6 m6Var = wiVar.O0;
            yh yhVar = wiVar.i1;
            canvas.translate(0.0f, f13);
            int alpha2 = (int) (oiVar2.getAlpha() * 255.0f);
            int h = oiVar2.h();
            int dp3 = AndroidUtilities.dp(13.0f) + ((int) ((yhVar != null ? yhVar.getAlpha() : 0.0f) * AndroidUtilities.dp(26.0f))) + ((int) (m6Var != null ? m6Var.getAlpha() * m6Var.getMeasuredHeight() : 0.0f));
            int p12 = wiVar.p1(0);
            i10 = ((org.telegram.ui.ActionBar.e3) wiVar).backgroundPaddingTop;
            int i25 = (p12 - i10) - dp3;
            i11 = ((org.telegram.ui.ActionBar.e3) wiVar).currentSheetAnimationType;
            if (i11 == 1 || wiVar.t1 != null) {
                i25 = (int) (oiVar2.getTranslationY() + i25);
            }
            int dp4 = AndroidUtilities.dp(20.0f) + i25;
            getMeasuredHeight();
            AndroidUtilities.dp(45.0f);
            int currentActionBarHeight = h != 0 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : ((org.telegram.ui.ActionBar.e3) wiVar).backgroundPaddingTop;
            float f14 = 1.0f;
            if (h == 2) {
                if (i25 < currentActionBarHeight) {
                    float f15 = currentActionBarHeight - i25;
                    i24 = ((org.telegram.ui.ActionBar.e3) wiVar).backgroundPaddingTop;
                    f11 = Math.max(0.0f, 1.0f - (f15 / i24));
                } else {
                    f11 = 1.0f;
                }
                f7 = 0.0f;
            } else {
                float f16 = dp3;
                f7 = 0.0f;
                if (oiVar2 == wiVar.o0) {
                    dp = AndroidUtilities.dp(11.0f);
                } else {
                    if (oiVar2 == wiVar.m0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else if (oiVar2 == wiVar.n0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else {
                        dp = AndroidUtilities.dp(4.0f);
                    }
                    f10 = f16 - dp2;
                    float alpha3 = wiVar.X0.getAlpha();
                    int i26 = (int) (((currentActionBarHeight - f10) + AndroidUtilities.statusBarHeight) * alpha3);
                    i25 -= i26;
                    dp4 -= i26;
                    f11 = 1.0f - alpha3;
                }
                f10 = f16 + dp;
                float alpha32 = wiVar.X0.getAlpha();
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
            int customBackground = wiVar.y0.f() ? wiVar.y0.getCustomBackground() : wiVar.q1(true);
            drawable = ((org.telegram.ui.ActionBar.e3) wiVar).shadowDrawable;
            drawable.setAlpha(alpha2);
            drawable2 = ((org.telegram.ui.ActionBar.e3) wiVar).shadowDrawable;
            int measuredWidth3 = getMeasuredWidth();
            int dp5 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
            i12 = ((org.telegram.ui.ActionBar.e3) wiVar).backgroundPaddingTop;
            drawable2.setBounds(0, i25, measuredWidth3, i12 + dp5);
            drawable3 = ((org.telegram.ui.ActionBar.e3) wiVar).shadowDrawable;
            drawable3.draw(canvas);
            RectF rectF = this.x0;
            if (h == 2) {
                org.telegram.ui.ActionBar.h6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.h6.t0.setAlpha(alpha2);
                i20 = ((org.telegram.ui.ActionBar.e3) wiVar).backgroundPaddingLeft;
                i21 = ((org.telegram.ui.ActionBar.e3) wiVar).backgroundPaddingTop;
                f12 = 24.0f;
                float f17 = i21 + i25;
                int measuredWidth4 = getMeasuredWidth();
                i22 = ((org.telegram.ui.ActionBar.e3) wiVar).backgroundPaddingLeft;
                float f18 = measuredWidth4 - i22;
                i23 = ((org.telegram.ui.ActionBar.e3) wiVar).backgroundPaddingTop;
                rectF.set(i20, f17, f18, AndroidUtilities.dp(24.0f) + i23 + i25);
            } else {
                f12 = 24.0f;
            }
            if ((f11 != 1.0f && h != 2) || wiVar.y0.e()) {
                Paint paint = org.telegram.ui.ActionBar.h6.t0;
                if (wiVar.y0.e()) {
                    customBackground = wiVar.y0.getCustomActionBarBackground();
                }
                paint.setColor(customBackground);
                org.telegram.ui.ActionBar.h6.t0.setAlpha(alpha2);
                i16 = ((org.telegram.ui.ActionBar.e3) wiVar).backgroundPaddingLeft;
                i17 = ((org.telegram.ui.ActionBar.e3) wiVar).backgroundPaddingTop;
                int measuredWidth5 = getMeasuredWidth();
                i18 = ((org.telegram.ui.ActionBar.e3) wiVar).backgroundPaddingLeft;
                float f19 = measuredWidth5 - i18;
                i19 = ((org.telegram.ui.ActionBar.e3) wiVar).backgroundPaddingTop;
                rectF.set(i16, i17 + i25, f19, AndroidUtilities.dp(f12) + i19 + i25);
            }
            if (wiVar.y0.e()) {
                org.telegram.ui.ActionBar.h6.t0.setColor(wiVar.y0.getCustomActionBarBackground());
                org.telegram.ui.ActionBar.h6.t0.setAlpha(alpha2);
                int p13 = wiVar.p1(0);
                if (!z10) {
                    p13 += AndroidUtilities.statusBarHeight;
                }
                i13 = ((org.telegram.ui.ActionBar.e3) wiVar).backgroundPaddingLeft;
                i14 = ((org.telegram.ui.ActionBar.e3) wiVar).backgroundPaddingTop;
                float dp6 = (AndroidUtilities.dp(12.0f) + i14 + i25) * f11;
                int measuredWidth6 = getMeasuredWidth();
                i15 = ((org.telegram.ui.ActionBar.e3) wiVar).backgroundPaddingLeft;
                rectF.set(i13, dp6, measuredWidth6 - i15, AndroidUtilities.dp(12.0f) + p13);
                canvas.save();
                canvas.drawRect(rectF, org.telegram.ui.ActionBar.h6.t0);
                canvas.restore();
            }
            if ((yhVar == null || yhVar.getAlpha() != 1.0f) && f11 != f7) {
                int dp7 = AndroidUtilities.dp(36.0f);
                rectF.set((getMeasuredWidth() - dp7) / 2, dp4, (getMeasuredWidth() + dp7) / 2, AndroidUtilities.dp(4.0f) + dp4);
                if (h == 2) {
                    themedColor = TLObject.FLAG_29;
                    f14 = f11;
                } else if (wiVar.y0.e()) {
                    int customActionBarBackground = wiVar.y0.getCustomActionBarBackground();
                    themedColor = i0.a.d(0.5f, customActionBarBackground, i0.a.f(customActionBarBackground) < 0.5d ? -1 : -16777216);
                    if (yhVar != null) {
                        alpha = yhVar.getAlpha();
                        f14 = 1.0f - alpha;
                    }
                } else {
                    themedColor = wiVar.getThemedColor(org.telegram.ui.ActionBar.h6.Ii);
                    if (yhVar != null) {
                        alpha = yhVar.getAlpha();
                        f14 = 1.0f - alpha;
                    }
                }
                int alpha4 = Color.alpha(themedColor);
                org.telegram.ui.ActionBar.h6.t0.setColor(themedColor);
                org.telegram.ui.ActionBar.h6.t0.setAlpha((int) (oiVar2.getAlpha() * alpha4 * f14 * f11));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.h6.t0);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        float f7;
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
        oi oiVar;
        int i26;
        wi wiVar = this.B0;
        boolean z10 = wiVar.g0;
        ci.m6 m6Var = wiVar.O0;
        ch.d dVar = wiVar.A0;
        yh yhVar = wiVar.i1;
        y7 y7Var = wiVar.X0;
        if (!(view instanceof oi) || view.getAlpha() <= 0.0f) {
            if (view != y7Var) {
                if (!(view instanceof lz) || dVar == null) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                dVar.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(dVar.j.k);
                dVar.draw(canvas);
                boolean drawChild2 = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild2;
            }
            float alpha2 = y7Var.getAlpha();
            if (alpha2 <= 0.0f) {
                return false;
            }
            if (alpha2 >= 1.0f) {
                return super.drawChild(canvas, view, j3);
            }
            canvas.save();
            float x10 = y7Var.getX();
            oi oiVar2 = wiVar.y0;
            if (oiVar2 != null) {
                int h = oiVar2.h();
                int dp5 = AndroidUtilities.dp(13.0f) + ((int) ((yhVar != null ? yhVar.getAlpha() : 0.0f) * AndroidUtilities.dp(26.0f))) + ((int) (m6Var != null ? m6Var.getAlpha() * m6Var.getMeasuredHeight() : 0.0f));
                int p12 = wiVar.p1(0);
                i10 = ((org.telegram.ui.ActionBar.e3) wiVar).backgroundPaddingTop;
                int i27 = (p12 - i10) - dp5;
                i11 = ((org.telegram.ui.ActionBar.e3) wiVar).currentSheetAnimationType;
                if (i11 == 1 || wiVar.t1 != null) {
                    i27 = (int) (oiVar2.getTranslationY() + i27);
                }
                int dp6 = AndroidUtilities.dp(20.0f) + i27;
                int currentActionBarHeight = h != 0 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : ((org.telegram.ui.ActionBar.e3) wiVar).backgroundPaddingTop;
                if (h != 2) {
                    i12 = ((org.telegram.ui.ActionBar.e3) wiVar).backgroundPaddingTop;
                    if (i12 + i27 < currentActionBarHeight) {
                        float f14 = dp5;
                        if (oiVar2 == wiVar.o0) {
                            dp = AndroidUtilities.dp(11.0f);
                        } else {
                            if (oiVar2 == wiVar.m0) {
                                dp2 = AndroidUtilities.dp(3.0f);
                            } else if (oiVar2 == wiVar.n0) {
                                dp2 = AndroidUtilities.dp(3.0f);
                            } else {
                                dp = AndroidUtilities.dp(4.0f);
                            }
                            f10 = f14 - dp2;
                            dp6 -= (int) (y7Var.getAlpha() * ((currentActionBarHeight - f10) + AndroidUtilities.statusBarHeight));
                        }
                        f10 = f14 + dp;
                        dp6 -= (int) (y7Var.getAlpha() * ((currentActionBarHeight - f10) + AndroidUtilities.statusBarHeight));
                    }
                }
                if (!z10) {
                    dp6 += AndroidUtilities.statusBarHeight;
                }
                f7 = dp6;
            } else {
                f7 = 0.0f;
            }
            canvas.clipRect(x10, f7, y7Var.getX() + y7Var.getWidth(), y7Var.getY() + y7Var.getHeight());
            boolean drawChild3 = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild3;
        }
        canvas.save();
        canvas.translate(0.0f, wiVar.l2);
        int alpha3 = (int) (view.getAlpha() * 255.0f);
        oi oiVar3 = (oi) view;
        int h10 = oiVar3.h();
        int dp7 = AndroidUtilities.dp(13.0f) + (yhVar != null ? AndroidUtilities.dp(yhVar.getAlpha() * 26.0f) : 0) + ((int) (m6Var != null ? m6Var.getAlpha() * m6Var.getMeasuredHeight() : 0.0f));
        int p13 = wiVar.p1(oiVar3 == wiVar.y0 ? 0 : 1);
        i13 = ((org.telegram.ui.ActionBar.e3) wiVar).backgroundPaddingTop;
        int i28 = (p13 - i13) - dp7;
        i14 = ((org.telegram.ui.ActionBar.e3) wiVar).currentSheetAnimationType;
        if (i14 == 1 || wiVar.t1 != null) {
            i28 = (int) (view.getTranslationY() + i28);
        }
        int dp8 = AndroidUtilities.dp(20.0f) + i28;
        int dp9 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
        i15 = ((org.telegram.ui.ActionBar.e3) wiVar).backgroundPaddingTop;
        int i29 = i15 + dp9;
        int currentActionBarHeight2 = h10 != 0 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : ((org.telegram.ui.ActionBar.e3) wiVar).backgroundPaddingTop;
        if (h10 != 2) {
            i16 = ((org.telegram.ui.ActionBar.e3) wiVar).backgroundPaddingTop;
            f11 = 0.0f;
            if (i16 + i28 < currentActionBarHeight2) {
                float f15 = dp7;
                if (oiVar3 == wiVar.o0) {
                    dp3 = AndroidUtilities.dp(11.0f);
                } else {
                    if (oiVar3 == wiVar.m0) {
                        dp4 = AndroidUtilities.dp(3.0f);
                    } else if (oiVar3 == wiVar.n0) {
                        dp4 = AndroidUtilities.dp(3.0f);
                    } else {
                        dp3 = AndroidUtilities.dp(4.0f);
                    }
                    f12 = f15 - dp4;
                    i17 = ((org.telegram.ui.ActionBar.e3) wiVar).backgroundPaddingTop;
                    float min = Math.min(1.0f, ((currentActionBarHeight2 - i28) - i17) / f12);
                    int i30 = (int) ((currentActionBarHeight2 - f12) * min);
                    i28 -= i30;
                    dp8 -= i30;
                    i29 += i30;
                    f13 = 1.0f - min;
                }
                f12 = f15 + dp3;
                i17 = ((org.telegram.ui.ActionBar.e3) wiVar).backgroundPaddingTop;
                float min2 = Math.min(1.0f, ((currentActionBarHeight2 - i28) - i17) / f12);
                int i302 = (int) ((currentActionBarHeight2 - f12) * min2);
                i28 -= i302;
                dp8 -= i302;
                i29 += i302;
                f13 = 1.0f - min2;
            }
            f13 = 1.0f;
        } else if (i28 < currentActionBarHeight2) {
            i26 = ((org.telegram.ui.ActionBar.e3) wiVar).backgroundPaddingTop;
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
        int customBackground = wiVar.y0.f() ? wiVar.y0.getCustomBackground() : wiVar.q1(true);
        oi oiVar4 = wiVar.y0;
        rm rmVar = wiVar.q0;
        boolean z11 = (oiVar4 == rmVar || (oiVar = wiVar.z0) == rmVar || (oiVar4 == wiVar.j0 && oiVar == null)) ? false : true;
        RectF rectF = this.x0;
        if (z11) {
            drawable = ((org.telegram.ui.ActionBar.e3) wiVar).shadowDrawable;
            drawable.setAlpha(alpha3);
            drawable2 = ((org.telegram.ui.ActionBar.e3) wiVar).shadowDrawable;
            drawable2.setBounds(0, i28, getMeasuredWidth(), i32);
            drawable3 = ((org.telegram.ui.ActionBar.e3) wiVar).shadowDrawable;
            drawable3.draw(canvas);
            if (h10 == 2) {
                org.telegram.ui.ActionBar.h6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.h6.t0.setAlpha(alpha3);
                i22 = ((org.telegram.ui.ActionBar.e3) wiVar).backgroundPaddingLeft;
                i23 = ((org.telegram.ui.ActionBar.e3) wiVar).backgroundPaddingTop;
                int measuredWidth = getMeasuredWidth();
                i24 = ((org.telegram.ui.ActionBar.e3) wiVar).backgroundPaddingLeft;
                float f16 = measuredWidth - i24;
                i25 = ((org.telegram.ui.ActionBar.e3) wiVar).backgroundPaddingTop;
                rectF.set(i22, i23 + i28, f16, AndroidUtilities.dp(24.0f) + i25 + i28);
            }
        }
        if (view == wiVar.k0 || view == wiVar.s0 || view == wiVar.l0) {
            drawChild = super.drawChild(canvas, view, j3);
        } else {
            canvas.save();
            drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
        }
        if (z11) {
            if (f13 != 1.0f && h10 != 2) {
                org.telegram.ui.ActionBar.h6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.h6.t0.setAlpha(alpha3);
                i18 = ((org.telegram.ui.ActionBar.e3) wiVar).backgroundPaddingLeft;
                i19 = ((org.telegram.ui.ActionBar.e3) wiVar).backgroundPaddingTop;
                int measuredWidth2 = getMeasuredWidth();
                i20 = ((org.telegram.ui.ActionBar.e3) wiVar).backgroundPaddingLeft;
                float f17 = measuredWidth2 - i20;
                i21 = ((org.telegram.ui.ActionBar.e3) wiVar).backgroundPaddingTop;
                rectF.set(i18, i19 + i28, f17, AndroidUtilities.dp(24.0f) + i21 + i28);
            }
            if ((yhVar == null || yhVar.getAlpha() != 1.0f) && f13 != f11) {
                int dp10 = AndroidUtilities.dp(36.0f);
                rectF.set((getMeasuredWidth() - dp10) / 2, dp8, (getMeasuredWidth() + dp10) / 2, AndroidUtilities.dp(4.0f) + dp8);
                if (h10 == 2) {
                    themedColor = TLObject.FLAG_29;
                    alpha = f13;
                } else {
                    themedColor = wiVar.getThemedColor(org.telegram.ui.ActionBar.h6.Ii);
                    alpha = yhVar == null ? 1.0f : 1.0f - yhVar.getAlpha();
                }
                int alpha4 = Color.alpha(themedColor);
                org.telegram.ui.ActionBar.h6.t0.setColor(themedColor);
                org.telegram.ui.ActionBar.h6.t0.setAlpha((int) (view.getAlpha() * alpha4 * alpha * f13));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.h6.t0);
            }
        }
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        li liVar = this.A0;
        liVar.b = this;
        liVar.c();
        wi wiVar = this.B0;
        wiVar.E0.setAdjustPanLayoutHelper(liVar);
        wiVar.P0.setAdjustPanLayoutHelper(liVar);
    }

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0.d();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.B0.g0;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i10;
        wi wiVar = this.B0;
        int[] iArr = wiVar.b2;
        if (wiVar.y0.l(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            if (iArr[0] != 0) {
                float y3 = motionEvent.getY();
                ci.m6 m6Var = wiVar.O0;
                int i11 = iArr[0];
                i10 = ((org.telegram.ui.ActionBar.e3) wiVar).backgroundPaddingTop;
                int i12 = i11 - (i10 * 2);
                int dp = AndroidUtilities.dp(13.0f);
                yh yhVar = wiVar.i1;
                int dp2 = AndroidUtilities.dp(20.0f) + ((i12 - (dp + (yhVar != null ? AndroidUtilities.dp(yhVar.getAlpha() * 26.0f) : 0))) - ((int) (m6Var != null ? m6Var.getAlpha() * m6Var.getMeasuredHeight() : 0.0f)));
                if (!wiVar.g0) {
                    dp2 += AndroidUtilities.statusBarHeight;
                }
                if (y3 < dp2 && wiVar.X0.getAlpha() == 0.0f) {
                    wiVar.onDismissWithTouchOutside();
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
    @Override // org.telegram.ui.Components.aw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        ul ulVar;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        bi biVar;
        ei eiVar;
        vn vnVar;
        vn vnVar2;
        int i20;
        int max;
        int measuredHeight;
        int measuredHeight2;
        int emojiPadding;
        mi miVar = this;
        wi wiVar = miVar.B0;
        ci.m6 m6Var = wiVar.O0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = wiVar.j0;
        int i21 = i12 - i10;
        if (miVar.w0 != i21) {
            miVar.w0 = i21;
            nf nfVar = wiVar.h0;
            if (nfVar != null && !nfVar.q0) {
                nfVar.dismiss();
            }
        }
        int childCount = miVar.getChildCount();
        if (Build.VERSION.SDK_INT >= 29) {
            wiVar.k2.set(i10, i11, i12, i13);
            miVar.setSystemGestureExclusionRects(wiVar.j2);
        }
        r0.l1 f7 = r0.i0.f(miVar);
        int i22 = 8;
        int i23 = f7 != null ? f7.a.f(8).d : 0;
        int paddingBottom = miVar.getPaddingBottom();
        z11 = ((org.telegram.ui.ActionBar.e3) wiVar).keyboardVisible;
        if (!z11) {
            vn vnVar3 = wiVar.m0;
            if (vnVar3 == null || wiVar.y0 != vnVar3 || vnVar3.E == null) {
                vn vnVar4 = wiVar.n0;
                if (vnVar4 == null || wiVar.y0 != vnVar4 || vnVar4.E == null) {
                    if (i23 <= AndroidUtilities.dp(20.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        emojiPadding = wiVar.m1().getEmojiPadding();
                        if (emojiPadding > 0) {
                            paddingBottom += emojiPadding;
                        }
                    }
                    emojiPadding = 0;
                    if (emojiPadding > 0) {
                    }
                } else {
                    if (i23 <= AndroidUtilities.dp(20.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        emojiPadding = wiVar.n0.getEmojiPadding();
                        if (emojiPadding > 0) {
                        }
                    }
                    emojiPadding = 0;
                    if (emojiPadding > 0) {
                    }
                }
            } else {
                if (i23 <= AndroidUtilities.dp(20.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                    emojiPadding = wiVar.m0.getEmojiPadding();
                    if (emojiPadding > 0) {
                    }
                }
                emojiPadding = 0;
                if (emojiPadding > 0) {
                }
            }
        }
        miVar.setBottomClip(paddingBottom);
        int i24 = 0;
        while (i24 < childCount) {
            View childAt = miVar.getChildAt(i24);
            if (childAt.getVisibility() != i22) {
                int i25 = AndroidUtilities.statusBarHeight;
                int max2 = i23 == 0 ? Math.max(AndroidUtilities.navigationBarHeight, paddingBottom) : 0;
                if (childAt instanceof oi) {
                    oi oiVar = (oi) childAt;
                    if (oiVar.h) {
                        i25 = 0;
                    }
                    if (oiVar.f) {
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
                        if (childAt != wiVar.X0 || childAt == wiVar.v1) {
                            i19 = 0;
                        }
                        biVar = wiVar.E0;
                        if ((biVar == null && biVar.l(childAt)) || (((eiVar = wiVar.P0) != null && eiVar.l(childAt)) || (((vnVar = wiVar.m0) != null && childAt == vnVar.E) || ((vnVar2 = wiVar.n0) != null && childAt == vnVar2.E)))) {
                            if (AndroidUtilities.isTablet()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight() + i23;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i19 = measuredHeight - measuredHeight2;
                        } else if (childAt == wiVar.B2) {
                            if (wiVar.c0) {
                                i20 = AndroidUtilities.statusBarHeight;
                                max = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                i19 = i20 + max;
                            }
                        } else if (childAt == wiVar.w1) {
                            i20 = i19 + AndroidUtilities.navigationBarHeight;
                            max = Math.max(i23, wiVar.o1());
                            i19 = i20 + max;
                        }
                        childAt.layout(i16, i19, measuredWidth + i16, i19 + measuredHeight3);
                    } else {
                        i17 = ((((i13 - max2) - i11) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    if (childAt != wiVar.X0) {
                    }
                    i19 = 0;
                    biVar = wiVar.E0;
                    if (biVar == null) {
                    }
                    if (childAt == wiVar.B2) {
                    }
                } else {
                    i14 = ((i21 - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                    i15 = ((org.telegram.ui.ActionBar.e3) wiVar).backgroundPaddingLeft;
                }
                i16 = i14 - i15;
                if (i27 == 16) {
                }
                i19 = i17 - i18;
                if (childAt != wiVar.X0) {
                }
                i19 = 0;
                biVar = wiVar.E0;
                if (biVar == null) {
                }
                if (childAt == wiVar.B2) {
                }
            }
            i24++;
            miVar = this;
            i22 = 8;
        }
        S();
        wiVar.X1(wiVar.y0, 0);
        wiVar.X1(wiVar.z0, 0);
        if (wiVar.c0) {
            wiVar.U1();
        }
        if (chatAttachAlertPhotoLayout == null || (ulVar = chatAttachAlertPhotoLayout.E) == null || ulVar.getFastScroll() == null) {
            return;
        }
        chatAttachAlertPhotoLayout.E.getFastScroll().h0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.p1 + (wiVar.c0 ? (int) (m6Var.getAlpha() * m6Var.getMeasuredHeight()) : 0);
        chatAttachAlertPhotoLayout.E.getFastScroll().invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        vn vnVar;
        vn vnVar2;
        boolean z10;
        int o12;
        int i15;
        int i16;
        mi miVar = this;
        wi wiVar = miVar.B0;
        boolean z11 = wiVar.g0;
        org.telegram.ui.ActionBar.u0 u0Var = wiVar.a1;
        int size = miVar.getLayoutParams().height > 0 ? miVar.getLayoutParams().height : View.MeasureSpec.getSize(i11);
        if (!z11) {
            miVar.y0 = true;
            i15 = ((org.telegram.ui.ActionBar.e3) wiVar).backgroundPaddingLeft;
            i16 = ((org.telegram.ui.ActionBar.e3) wiVar).backgroundPaddingLeft;
            miVar.setPadding(i15, 0, i16, 0);
            miVar.y0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        i12 = ((org.telegram.ui.ActionBar.e3) wiVar).backgroundPaddingLeft;
        int i17 = size2 - (i12 * 2);
        if (AndroidUtilities.isTablet()) {
            u0Var.setAdditionalYOffset(-AndroidUtilities.dp(3.0f));
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                u0Var.setAdditionalYOffset(0);
            } else {
                u0Var.setAdditionalYOffset(-AndroidUtilities.dp(3.0f));
            }
        }
        ((FrameLayout.LayoutParams) wiVar.f1.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        miVar.y0 = true;
        int min = (int) (i17 / Math.min(4.5f, wiVar.A1.h()));
        if (wiVar.Y1 != min) {
            wiVar.Y1 = min;
            AndroidUtilities.runOnUIThread(new pg(miVar, 21));
        }
        miVar.y0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        miVar.setMeasuredDimension(size3, size4);
        i13 = ((org.telegram.ui.ActionBar.e3) wiVar).backgroundPaddingLeft;
        ei eiVar = wiVar.P0;
        bi biVar = wiVar.E0;
        int i18 = size3 - (i13 * 2);
        if (!biVar.N && AndroidUtilities.dp(20.0f) >= 0 && !biVar.e && !biVar.O) {
            miVar.y0 = true;
            biVar.j();
            miVar.y0 = false;
        }
        if (!eiVar.N && AndroidUtilities.dp(20.0f) >= 0 && !eiVar.e && !eiVar.O) {
            miVar.y0 = true;
            eiVar.j();
            miVar.y0 = false;
        }
        if (wiVar.m0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            vn vnVar3 = wiVar.m0;
            if (!vnVar3.G && !vnVar3.a1 && !vnVar3.f1 && !vnVar3.h1) {
                miVar.y0 = true;
                vnVar3.a0();
                miVar.y0 = false;
            }
        }
        if (wiVar.n0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            vn vnVar4 = wiVar.n0;
            if (!vnVar4.G && !vnVar4.a1 && !vnVar4.f1 && !vnVar4.h1) {
                miVar.y0 = true;
                vnVar4.a0();
                miVar.y0 = false;
            }
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            z10 = ((org.telegram.ui.ActionBar.e3) wiVar).keyboardVisible;
            if (z10) {
                oi oiVar = wiVar.y0;
                vn vnVar5 = wiVar.m0;
                if (oiVar == vnVar5 && vnVar5.E != null && vnVar5.h1) {
                    o12 = AndroidUtilities.dp(120.0f);
                } else {
                    vn vnVar6 = wiVar.n0;
                    o12 = (oiVar == vnVar6 && vnVar6.E != null && vnVar6.h1) ? AndroidUtilities.dp(120.0f) : 0;
                }
            } else {
                o12 = wiVar.o1();
            }
            r0.l1 f7 = r0.i0.f(miVar);
            int i19 = f7 != null ? f7.a.f(8).d : 0;
            r0.l1 f10 = r0.i0.f(miVar);
            Math.max(f10 != null ? f10.a.f(527).d : 0, o12);
            int max = Math.max(i19 > 0 ? 0 : AndroidUtilities.navigationBarHeight, o12);
            miVar.y0 = true;
            oi oiVar2 = wiVar.y0;
            if (oiVar2.f) {
                oiVar2.e = AndroidUtilities.dp(62.0f) + max;
                wiVar.y0.y(i18, size4);
            } else {
                oiVar2.e = AndroidUtilities.navigationBarHeight;
                oiVar2.y(i18, size4 - o12);
            }
            oi oiVar3 = wiVar.z0;
            if (oiVar3 != null) {
                if (oiVar3.f) {
                    oiVar3.e = AndroidUtilities.dp(62.0f) + max;
                    wiVar.z0.y(i18, size4);
                } else {
                    oiVar3.e = AndroidUtilities.navigationBarHeight;
                    oiVar3.y(i18, size4 - o12);
                }
            }
            miVar.y0 = false;
        }
        int childCount = miVar.getChildCount();
        int i20 = 0;
        while (i20 < childCount) {
            int i21 = i20;
            View childAt = miVar.getChildAt(i21);
            if (childAt == null || childAt.getVisibility() == 8) {
                i14 = i21;
            } else if (childAt == wiVar.v1) {
                i14 = i21;
                miVar.measureChildWithMargins(childAt, i10, 0, makeMeasureSpec, 0);
            } else {
                i14 = i21;
                int i22 = AndroidUtilities.statusBarHeight;
                int i23 = AndroidUtilities.navigationBarHeight;
                if (childAt instanceof oi) {
                    oi oiVar4 = (oi) childAt;
                    if (oiVar4.h) {
                        i22 = 0;
                    }
                    if (oiVar4.f) {
                        i23 = 0;
                    }
                }
                if (!biVar.l(childAt) && !eiVar.l(childAt) && (((vnVar = wiVar.m0) == null || childAt != vnVar.E) && ((vnVar2 = wiVar.n0) == null || childAt != vnVar2.E))) {
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
            miVar = this;
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
        ch.d dVar = this.B0.A0;
        if (dVar != null) {
            dVar.s(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i15, i14);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        wi wiVar = this.B0;
        if (wiVar.y0.l(motionEvent)) {
            return true;
        }
        return !wiVar.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.y0) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        int i10;
        int i11;
        int i12;
        ViewGroup viewGroup;
        wi wiVar = this.B0;
        yh yhVar = wiVar.x1;
        float f10 = f7 + wiVar.l2;
        i10 = ((org.telegram.ui.ActionBar.e3) wiVar).currentSheetAnimationType;
        if (i10 == 0) {
            this.z0 = f10;
        }
        i11 = ((org.telegram.ui.ActionBar.e3) wiVar).currentSheetAnimationType;
        if (i11 == 1) {
            if (f10 < 0.0f) {
                wiVar.y0.setTranslationY(f10);
                if (wiVar.Q0 != 0 || wiVar.T0) {
                    wiVar.i1.setTranslationY((wiVar.p1 + f10) - wiVar.l2);
                }
                yhVar.setTranslationY(0.0f);
                f10 = 0.0f;
            } else {
                wiVar.y0.setTranslationY(0.0f);
                yhVar.setTranslationY(((f10 / this.z0) * yhVar.getMeasuredHeight()) + (-f10));
            }
            viewGroup = ((org.telegram.ui.ActionBar.e3) wiVar).containerView;
            viewGroup.invalidate();
        }
        super.setTranslationY(f10 - wiVar.l2);
        i12 = ((org.telegram.ui.ActionBar.e3) wiVar).currentSheetAnimationType;
        if (i12 != 1) {
            wiVar.y0.k(wiVar.l2);
        }
    }

    @Override // org.telegram.ui.Components.aw0
    public final void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
    }
}
