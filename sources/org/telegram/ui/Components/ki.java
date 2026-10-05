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

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class ki extends mw0 {
    public final ji A0;
    public final /* synthetic */ xi B0;
    public int w0;
    public final RectF x0;
    public boolean y0;
    public float z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki(xi xiVar, Context context) {
        super(context, null);
        this.B0 = xiVar;
        this.x0 = new RectF();
        this.A0 = new ji(this, this);
    }

    @Override // org.telegram.ui.Components.mw0, android.view.ViewGroup, android.view.View
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
        pi piVar;
        canvas.save();
        xi xiVar = this.B0;
        pi piVar2 = xiVar.y0;
        tm tmVar = xiVar.q0;
        if ((piVar2 == tmVar || (piVar = xiVar.z0) == tmVar || (piVar2 == xiVar.j0 && piVar == null)) && piVar2 != null) {
            canvas.save();
            float f13 = xiVar.l2;
            boolean z10 = xiVar.g0;
            ci.m6 m6Var = xiVar.O0;
            wh whVar = xiVar.i1;
            canvas.translate(0.0f, f13);
            int alpha2 = (int) (piVar2.getAlpha() * 255.0f);
            int h = piVar2.h();
            int dp3 = AndroidUtilities.dp(13.0f) + ((int) ((whVar != null ? whVar.getAlpha() : 0.0f) * AndroidUtilities.dp(26.0f))) + ((int) (m6Var != null ? m6Var.getAlpha() * m6Var.getMeasuredHeight() : 0.0f));
            int o12 = xiVar.o1(0);
            i10 = ((org.telegram.ui.ActionBar.f3) xiVar).backgroundPaddingTop;
            int i25 = (o12 - i10) - dp3;
            i11 = ((org.telegram.ui.ActionBar.f3) xiVar).currentSheetAnimationType;
            if (i11 == 1 || xiVar.t1 != null) {
                i25 = (int) (piVar2.getTranslationY() + i25);
            }
            int dp4 = AndroidUtilities.dp(20.0f) + i25;
            getMeasuredHeight();
            AndroidUtilities.dp(45.0f);
            int currentActionBarHeight = h != 0 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : ((org.telegram.ui.ActionBar.f3) xiVar).backgroundPaddingTop;
            float f14 = 1.0f;
            if (h == 2) {
                if (i25 < currentActionBarHeight) {
                    float f15 = currentActionBarHeight - i25;
                    i24 = ((org.telegram.ui.ActionBar.f3) xiVar).backgroundPaddingTop;
                    f11 = Math.max(0.0f, 1.0f - (f15 / i24));
                } else {
                    f11 = 1.0f;
                }
                f7 = 0.0f;
            } else {
                float f16 = dp3;
                f7 = 0.0f;
                if (piVar2 == xiVar.o0) {
                    dp = AndroidUtilities.dp(11.0f);
                } else {
                    if (piVar2 == xiVar.m0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else if (piVar2 == xiVar.n0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else {
                        dp = AndroidUtilities.dp(4.0f);
                    }
                    f10 = f16 - dp2;
                    float alpha3 = xiVar.X0.getAlpha();
                    int i26 = (int) (((currentActionBarHeight - f10) + AndroidUtilities.statusBarHeight) * alpha3);
                    i25 -= i26;
                    dp4 -= i26;
                    f11 = 1.0f - alpha3;
                }
                f10 = f16 + dp;
                float alpha32 = xiVar.X0.getAlpha();
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
            int customBackground = xiVar.y0.f() ? xiVar.y0.getCustomBackground() : xiVar.p1(true);
            drawable = ((org.telegram.ui.ActionBar.f3) xiVar).shadowDrawable;
            drawable.setAlpha(alpha2);
            drawable2 = ((org.telegram.ui.ActionBar.f3) xiVar).shadowDrawable;
            int measuredWidth = getMeasuredWidth();
            int dp5 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
            i12 = ((org.telegram.ui.ActionBar.f3) xiVar).backgroundPaddingTop;
            drawable2.setBounds(0, i25, measuredWidth, i12 + dp5);
            drawable3 = ((org.telegram.ui.ActionBar.f3) xiVar).shadowDrawable;
            drawable3.draw(canvas);
            RectF rectF = this.x0;
            if (h == 2) {
                org.telegram.ui.ActionBar.i6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.i6.t0.setAlpha(alpha2);
                i20 = ((org.telegram.ui.ActionBar.f3) xiVar).backgroundPaddingLeft;
                i21 = ((org.telegram.ui.ActionBar.f3) xiVar).backgroundPaddingTop;
                f12 = 24.0f;
                float f17 = i21 + i25;
                int measuredWidth2 = getMeasuredWidth();
                i22 = ((org.telegram.ui.ActionBar.f3) xiVar).backgroundPaddingLeft;
                float f18 = measuredWidth2 - i22;
                i23 = ((org.telegram.ui.ActionBar.f3) xiVar).backgroundPaddingTop;
                rectF.set(i20, f17, f18, AndroidUtilities.dp(24.0f) + i23 + i25);
            } else {
                f12 = 24.0f;
            }
            if ((f11 != 1.0f && h != 2) || xiVar.y0.e()) {
                Paint paint = org.telegram.ui.ActionBar.i6.t0;
                if (xiVar.y0.e()) {
                    customBackground = xiVar.y0.getCustomActionBarBackground();
                }
                paint.setColor(customBackground);
                org.telegram.ui.ActionBar.i6.t0.setAlpha(alpha2);
                i16 = ((org.telegram.ui.ActionBar.f3) xiVar).backgroundPaddingLeft;
                i17 = ((org.telegram.ui.ActionBar.f3) xiVar).backgroundPaddingTop;
                int measuredWidth3 = getMeasuredWidth();
                i18 = ((org.telegram.ui.ActionBar.f3) xiVar).backgroundPaddingLeft;
                float f19 = measuredWidth3 - i18;
                i19 = ((org.telegram.ui.ActionBar.f3) xiVar).backgroundPaddingTop;
                rectF.set(i16, i17 + i25, f19, AndroidUtilities.dp(f12) + i19 + i25);
            }
            if (xiVar.y0.e()) {
                org.telegram.ui.ActionBar.i6.t0.setColor(xiVar.y0.getCustomActionBarBackground());
                org.telegram.ui.ActionBar.i6.t0.setAlpha(alpha2);
                int o13 = xiVar.o1(0);
                if (!z10) {
                    o13 += AndroidUtilities.statusBarHeight;
                }
                i13 = ((org.telegram.ui.ActionBar.f3) xiVar).backgroundPaddingLeft;
                i14 = ((org.telegram.ui.ActionBar.f3) xiVar).backgroundPaddingTop;
                float dp6 = (AndroidUtilities.dp(12.0f) + i14 + i25) * f11;
                int measuredWidth4 = getMeasuredWidth();
                i15 = ((org.telegram.ui.ActionBar.f3) xiVar).backgroundPaddingLeft;
                rectF.set(i13, dp6, measuredWidth4 - i15, AndroidUtilities.dp(12.0f) + o13);
                canvas.save();
                canvas.drawRect(rectF, org.telegram.ui.ActionBar.i6.t0);
                canvas.restore();
            }
            if ((whVar == null || whVar.getAlpha() != 1.0f) && f11 != f7) {
                int dp7 = AndroidUtilities.dp(36.0f);
                rectF.set((getMeasuredWidth() - dp7) / 2, dp4, (getMeasuredWidth() + dp7) / 2, AndroidUtilities.dp(4.0f) + dp4);
                if (h == 2) {
                    themedColor = TLObject.FLAG_29;
                    f14 = f11;
                } else if (xiVar.y0.e()) {
                    int customActionBarBackground = xiVar.y0.getCustomActionBarBackground();
                    themedColor = i0.a.d(0.5f, customActionBarBackground, i0.a.f(customActionBarBackground) < 0.5d ? -1 : -16777216);
                    if (whVar != null) {
                        alpha = whVar.getAlpha();
                        f14 = 1.0f - alpha;
                    }
                } else {
                    themedColor = xiVar.getThemedColor(org.telegram.ui.ActionBar.i6.Ii);
                    if (whVar != null) {
                        alpha = whVar.getAlpha();
                        f14 = 1.0f - alpha;
                    }
                }
                int alpha4 = Color.alpha(themedColor);
                org.telegram.ui.ActionBar.i6.t0.setColor(themedColor);
                org.telegram.ui.ActionBar.i6.t0.setAlpha((int) (piVar2.getAlpha() * alpha4 * f14 * f11));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.i6.t0);
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
        pi piVar;
        int i26;
        xi xiVar = this.B0;
        boolean z10 = xiVar.g0;
        ci.m6 m6Var = xiVar.O0;
        ch.d dVar = xiVar.A0;
        wh whVar = xiVar.i1;
        y7 y7Var = xiVar.X0;
        if (!(view instanceof pi) || view.getAlpha() <= 0.0f) {
            if (view != y7Var) {
                if (!(view instanceof nz) || dVar == null) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                dVar.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(dVar.l.k);
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
            pi piVar2 = xiVar.y0;
            if (piVar2 != null) {
                int h = piVar2.h();
                int dp5 = AndroidUtilities.dp(13.0f) + ((int) ((whVar != null ? whVar.getAlpha() : 0.0f) * AndroidUtilities.dp(26.0f))) + ((int) (m6Var != null ? m6Var.getAlpha() * m6Var.getMeasuredHeight() : 0.0f));
                int o12 = xiVar.o1(0);
                i10 = ((org.telegram.ui.ActionBar.f3) xiVar).backgroundPaddingTop;
                int i27 = (o12 - i10) - dp5;
                i11 = ((org.telegram.ui.ActionBar.f3) xiVar).currentSheetAnimationType;
                if (i11 == 1 || xiVar.t1 != null) {
                    i27 = (int) (piVar2.getTranslationY() + i27);
                }
                int dp6 = AndroidUtilities.dp(20.0f) + i27;
                int currentActionBarHeight = h != 0 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : ((org.telegram.ui.ActionBar.f3) xiVar).backgroundPaddingTop;
                if (h != 2) {
                    i12 = ((org.telegram.ui.ActionBar.f3) xiVar).backgroundPaddingTop;
                    if (i12 + i27 < currentActionBarHeight) {
                        float f14 = dp5;
                        if (piVar2 == xiVar.o0) {
                            dp = AndroidUtilities.dp(11.0f);
                        } else {
                            if (piVar2 == xiVar.m0) {
                                dp2 = AndroidUtilities.dp(3.0f);
                            } else if (piVar2 == xiVar.n0) {
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
        canvas.translate(0.0f, xiVar.l2);
        int alpha3 = (int) (view.getAlpha() * 255.0f);
        pi piVar3 = (pi) view;
        int h10 = piVar3.h();
        int dp7 = AndroidUtilities.dp(13.0f) + (whVar != null ? AndroidUtilities.dp(whVar.getAlpha() * 26.0f) : 0) + ((int) (m6Var != null ? m6Var.getAlpha() * m6Var.getMeasuredHeight() : 0.0f));
        int o13 = xiVar.o1(piVar3 == xiVar.y0 ? 0 : 1);
        i13 = ((org.telegram.ui.ActionBar.f3) xiVar).backgroundPaddingTop;
        int i28 = (o13 - i13) - dp7;
        i14 = ((org.telegram.ui.ActionBar.f3) xiVar).currentSheetAnimationType;
        if (i14 == 1 || xiVar.t1 != null) {
            i28 = (int) (view.getTranslationY() + i28);
        }
        int dp8 = AndroidUtilities.dp(20.0f) + i28;
        int dp9 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
        i15 = ((org.telegram.ui.ActionBar.f3) xiVar).backgroundPaddingTop;
        int i29 = i15 + dp9;
        int currentActionBarHeight2 = h10 != 0 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : ((org.telegram.ui.ActionBar.f3) xiVar).backgroundPaddingTop;
        if (h10 != 2) {
            i16 = ((org.telegram.ui.ActionBar.f3) xiVar).backgroundPaddingTop;
            f11 = 0.0f;
            if (i16 + i28 < currentActionBarHeight2) {
                float f15 = dp7;
                if (piVar3 == xiVar.o0) {
                    dp3 = AndroidUtilities.dp(11.0f);
                } else {
                    if (piVar3 == xiVar.m0) {
                        dp4 = AndroidUtilities.dp(3.0f);
                    } else if (piVar3 == xiVar.n0) {
                        dp4 = AndroidUtilities.dp(3.0f);
                    } else {
                        dp3 = AndroidUtilities.dp(4.0f);
                    }
                    f12 = f15 - dp4;
                    i17 = ((org.telegram.ui.ActionBar.f3) xiVar).backgroundPaddingTop;
                    float min = Math.min(1.0f, ((currentActionBarHeight2 - i28) - i17) / f12);
                    int i30 = (int) ((currentActionBarHeight2 - f12) * min);
                    i28 -= i30;
                    dp8 -= i30;
                    i29 += i30;
                    f13 = 1.0f - min;
                }
                f12 = f15 + dp3;
                i17 = ((org.telegram.ui.ActionBar.f3) xiVar).backgroundPaddingTop;
                float min2 = Math.min(1.0f, ((currentActionBarHeight2 - i28) - i17) / f12);
                int i302 = (int) ((currentActionBarHeight2 - f12) * min2);
                i28 -= i302;
                dp8 -= i302;
                i29 += i302;
                f13 = 1.0f - min2;
            }
            f13 = 1.0f;
        } else if (i28 < currentActionBarHeight2) {
            i26 = ((org.telegram.ui.ActionBar.f3) xiVar).backgroundPaddingTop;
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
        int customBackground = xiVar.y0.f() ? xiVar.y0.getCustomBackground() : xiVar.p1(true);
        pi piVar4 = xiVar.y0;
        tm tmVar = xiVar.q0;
        boolean z11 = (piVar4 == tmVar || (piVar = xiVar.z0) == tmVar || (piVar4 == xiVar.j0 && piVar == null)) ? false : true;
        RectF rectF = this.x0;
        if (z11) {
            drawable = ((org.telegram.ui.ActionBar.f3) xiVar).shadowDrawable;
            drawable.setAlpha(alpha3);
            drawable2 = ((org.telegram.ui.ActionBar.f3) xiVar).shadowDrawable;
            drawable2.setBounds(0, i28, getMeasuredWidth(), i32);
            drawable3 = ((org.telegram.ui.ActionBar.f3) xiVar).shadowDrawable;
            drawable3.draw(canvas);
            if (h10 == 2) {
                org.telegram.ui.ActionBar.i6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.i6.t0.setAlpha(alpha3);
                i22 = ((org.telegram.ui.ActionBar.f3) xiVar).backgroundPaddingLeft;
                i23 = ((org.telegram.ui.ActionBar.f3) xiVar).backgroundPaddingTop;
                int measuredWidth = getMeasuredWidth();
                i24 = ((org.telegram.ui.ActionBar.f3) xiVar).backgroundPaddingLeft;
                float f16 = measuredWidth - i24;
                i25 = ((org.telegram.ui.ActionBar.f3) xiVar).backgroundPaddingTop;
                rectF.set(i22, i23 + i28, f16, AndroidUtilities.dp(24.0f) + i25 + i28);
            }
        }
        if (view == xiVar.k0 || view == xiVar.s0 || view == xiVar.l0) {
            drawChild = super.drawChild(canvas, view, j3);
        } else {
            canvas.save();
            drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
        }
        if (z11) {
            if (f13 != 1.0f && h10 != 2) {
                org.telegram.ui.ActionBar.i6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.i6.t0.setAlpha(alpha3);
                i18 = ((org.telegram.ui.ActionBar.f3) xiVar).backgroundPaddingLeft;
                i19 = ((org.telegram.ui.ActionBar.f3) xiVar).backgroundPaddingTop;
                int measuredWidth2 = getMeasuredWidth();
                i20 = ((org.telegram.ui.ActionBar.f3) xiVar).backgroundPaddingLeft;
                float f17 = measuredWidth2 - i20;
                i21 = ((org.telegram.ui.ActionBar.f3) xiVar).backgroundPaddingTop;
                rectF.set(i18, i19 + i28, f17, AndroidUtilities.dp(24.0f) + i21 + i28);
            }
            if ((whVar == null || whVar.getAlpha() != 1.0f) && f13 != f11) {
                int dp10 = AndroidUtilities.dp(36.0f);
                rectF.set((getMeasuredWidth() - dp10) / 2, dp8, (getMeasuredWidth() + dp10) / 2, AndroidUtilities.dp(4.0f) + dp8);
                if (h10 == 2) {
                    themedColor = TLObject.FLAG_29;
                    alpha = f13;
                } else {
                    themedColor = xiVar.getThemedColor(org.telegram.ui.ActionBar.i6.Ii);
                    alpha = whVar == null ? 1.0f : 1.0f - whVar.getAlpha();
                }
                int alpha4 = Color.alpha(themedColor);
                org.telegram.ui.ActionBar.i6.t0.setColor(themedColor);
                org.telegram.ui.ActionBar.i6.t0.setAlpha((int) (view.getAlpha() * alpha4 * alpha * f13));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.i6.t0);
            }
        }
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.mw0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ji jiVar = this.A0;
        jiVar.b = this;
        jiVar.c();
        xi xiVar = this.B0;
        xiVar.E0.setAdjustPanLayoutHelper(jiVar);
        xiVar.P0.setAdjustPanLayoutHelper(jiVar);
    }

    @Override // org.telegram.ui.Components.mw0, android.view.ViewGroup, android.view.View
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
        xi xiVar = this.B0;
        int[] iArr = xiVar.b2;
        if (xiVar.y0.l(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            if (iArr[0] != 0) {
                float y3 = motionEvent.getY();
                ci.m6 m6Var = xiVar.O0;
                int i11 = iArr[0];
                i10 = ((org.telegram.ui.ActionBar.f3) xiVar).backgroundPaddingTop;
                int i12 = i11 - (i10 * 2);
                int dp = AndroidUtilities.dp(13.0f);
                wh whVar = xiVar.i1;
                int dp2 = AndroidUtilities.dp(20.0f) + ((i12 - (dp + (whVar != null ? AndroidUtilities.dp(whVar.getAlpha() * 26.0f) : 0))) - ((int) (m6Var != null ? m6Var.getAlpha() * m6Var.getMeasuredHeight() : 0.0f)));
                if (!xiVar.g0) {
                    dp2 += AndroidUtilities.statusBarHeight;
                }
                if (y3 < dp2 && xiVar.X0.getAlpha() == 0.0f) {
                    xiVar.onDismissWithTouchOutside();
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
    @Override // org.telegram.ui.Components.mw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        wl wlVar;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        zh zhVar;
        bi biVar;
        xn xnVar;
        xn xnVar2;
        int i20;
        int max;
        int measuredHeight;
        int measuredHeight2;
        int emojiPadding;
        ki kiVar = this;
        xi xiVar = kiVar.B0;
        ci.m6 m6Var = xiVar.O0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = xiVar.j0;
        int i21 = i12 - i10;
        if (kiVar.w0 != i21) {
            kiVar.w0 = i21;
            of ofVar = xiVar.h0;
            if (ofVar != null && !ofVar.q0) {
                ofVar.dismiss();
            }
        }
        int childCount = kiVar.getChildCount();
        if (Build.VERSION.SDK_INT >= 29) {
            xiVar.k2.set(i10, i11, i12, i13);
            kiVar.setSystemGestureExclusionRects(xiVar.j2);
        }
        r0.l1 f7 = r0.i0.f(kiVar);
        int i22 = 8;
        int i23 = f7 != null ? f7.a.f(8).d : 0;
        int paddingBottom = kiVar.getPaddingBottom();
        z11 = ((org.telegram.ui.ActionBar.f3) xiVar).keyboardVisible;
        if (!z11) {
            xn xnVar3 = xiVar.m0;
            if (xnVar3 == null || xiVar.y0 != xnVar3 || xnVar3.E == null) {
                xn xnVar4 = xiVar.n0;
                if (xnVar4 == null || xiVar.y0 != xnVar4 || xnVar4.E == null) {
                    if (i23 <= AndroidUtilities.dp(20.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        emojiPadding = xiVar.m1().getEmojiPadding();
                        if (emojiPadding > 0) {
                            paddingBottom += emojiPadding;
                        }
                    }
                    emojiPadding = 0;
                    if (emojiPadding > 0) {
                    }
                } else {
                    if (i23 <= AndroidUtilities.dp(20.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        emojiPadding = xiVar.n0.getEmojiPadding();
                        if (emojiPadding > 0) {
                        }
                    }
                    emojiPadding = 0;
                    if (emojiPadding > 0) {
                    }
                }
            } else {
                if (i23 <= AndroidUtilities.dp(20.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                    emojiPadding = xiVar.m0.getEmojiPadding();
                    if (emojiPadding > 0) {
                    }
                }
                emojiPadding = 0;
                if (emojiPadding > 0) {
                }
            }
        }
        kiVar.setBottomClip(paddingBottom);
        int i24 = 0;
        while (i24 < childCount) {
            View childAt = kiVar.getChildAt(i24);
            if (childAt.getVisibility() != i22) {
                int i25 = AndroidUtilities.statusBarHeight;
                int max2 = i23 == 0 ? Math.max(AndroidUtilities.navigationBarHeight, paddingBottom) : 0;
                if (childAt instanceof pi) {
                    pi piVar = (pi) childAt;
                    if (piVar.h) {
                        i25 = 0;
                    }
                    if (piVar.f) {
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
                        if (childAt != xiVar.X0 || childAt == xiVar.v1) {
                            i19 = 0;
                        }
                        zhVar = xiVar.E0;
                        if ((zhVar == null && zhVar.l(childAt)) || (((biVar = xiVar.P0) != null && biVar.l(childAt)) || (((xnVar = xiVar.m0) != null && childAt == xnVar.E) || ((xnVar2 = xiVar.n0) != null && childAt == xnVar2.E)))) {
                            if (AndroidUtilities.isTablet()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight() + i23;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i19 = measuredHeight - measuredHeight2;
                        } else if (childAt == xiVar.B2) {
                            if (xiVar.c0) {
                                i20 = AndroidUtilities.statusBarHeight;
                                max = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                i19 = i20 + max;
                            }
                        } else if (childAt == xiVar.w1) {
                            i20 = i19 + AndroidUtilities.navigationBarHeight;
                            max = Math.max(i23, xi.g0(xiVar));
                            i19 = i20 + max;
                        }
                        childAt.layout(i16, i19, measuredWidth + i16, i19 + measuredHeight3);
                    } else {
                        i17 = ((((i13 - max2) - i11) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    if (childAt != xiVar.X0) {
                    }
                    i19 = 0;
                    zhVar = xiVar.E0;
                    if (zhVar == null) {
                    }
                    if (childAt == xiVar.B2) {
                    }
                } else {
                    i14 = ((i21 - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                    i15 = ((org.telegram.ui.ActionBar.f3) xiVar).backgroundPaddingLeft;
                }
                i16 = i14 - i15;
                if (i27 == 16) {
                }
                i19 = i17 - i18;
                if (childAt != xiVar.X0) {
                }
                i19 = 0;
                zhVar = xiVar.E0;
                if (zhVar == null) {
                }
                if (childAt == xiVar.B2) {
                }
            }
            i24++;
            kiVar = this;
            i22 = 8;
        }
        S();
        xiVar.W1(xiVar.y0, 0);
        xiVar.W1(xiVar.z0, 0);
        if (xiVar.c0) {
            xiVar.T1();
        }
        if (chatAttachAlertPhotoLayout == null || (wlVar = chatAttachAlertPhotoLayout.E) == null || wlVar.getFastScroll() == null) {
            return;
        }
        chatAttachAlertPhotoLayout.E.getFastScroll().h0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.p1 + (xiVar.c0 ? (int) (m6Var.getAlpha() * m6Var.getMeasuredHeight()) : 0);
        chatAttachAlertPhotoLayout.E.getFastScroll().invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        xn xnVar;
        xn xnVar2;
        boolean z10;
        int g02;
        int i15;
        int i16;
        ki kiVar = this;
        xi xiVar = kiVar.B0;
        boolean z11 = xiVar.g0;
        org.telegram.ui.ActionBar.v0 v0Var = xiVar.a1;
        int size = kiVar.getLayoutParams().height > 0 ? kiVar.getLayoutParams().height : View.MeasureSpec.getSize(i11);
        if (!z11) {
            kiVar.y0 = true;
            i15 = ((org.telegram.ui.ActionBar.f3) xiVar).backgroundPaddingLeft;
            i16 = ((org.telegram.ui.ActionBar.f3) xiVar).backgroundPaddingLeft;
            kiVar.setPadding(i15, 0, i16, 0);
            kiVar.y0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        i12 = ((org.telegram.ui.ActionBar.f3) xiVar).backgroundPaddingLeft;
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
        ((FrameLayout.LayoutParams) xiVar.f1.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        kiVar.y0 = true;
        int min = (int) (i17 / Math.min(4.5f, xiVar.A1.h()));
        if (xiVar.Y1 != min) {
            xiVar.Y1 = min;
            AndroidUtilities.runOnUIThread(new qg(kiVar, 21));
        }
        kiVar.y0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        kiVar.setMeasuredDimension(size3, size4);
        i13 = ((org.telegram.ui.ActionBar.f3) xiVar).backgroundPaddingLeft;
        bi biVar = xiVar.P0;
        zh zhVar = xiVar.E0;
        int i18 = size3 - (i13 * 2);
        if (!zhVar.N && AndroidUtilities.dp(20.0f) >= 0 && !zhVar.e && !zhVar.O) {
            kiVar.y0 = true;
            zhVar.j();
            kiVar.y0 = false;
        }
        if (!biVar.N && AndroidUtilities.dp(20.0f) >= 0 && !biVar.e && !biVar.O) {
            kiVar.y0 = true;
            biVar.j();
            kiVar.y0 = false;
        }
        if (xiVar.m0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            xn xnVar3 = xiVar.m0;
            if (!xnVar3.G && !xnVar3.a1 && !xnVar3.f1 && !xnVar3.h1) {
                kiVar.y0 = true;
                xnVar3.Z();
                kiVar.y0 = false;
            }
        }
        if (xiVar.n0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            xn xnVar4 = xiVar.n0;
            if (!xnVar4.G && !xnVar4.a1 && !xnVar4.f1 && !xnVar4.h1) {
                kiVar.y0 = true;
                xnVar4.Z();
                kiVar.y0 = false;
            }
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            z10 = ((org.telegram.ui.ActionBar.f3) xiVar).keyboardVisible;
            if (z10) {
                pi piVar = xiVar.y0;
                xn xnVar5 = xiVar.m0;
                if (piVar == xnVar5 && xnVar5.E != null && xnVar5.h1) {
                    g02 = AndroidUtilities.dp(120.0f);
                } else {
                    xn xnVar6 = xiVar.n0;
                    g02 = (piVar == xnVar6 && xnVar6.E != null && xnVar6.h1) ? AndroidUtilities.dp(120.0f) : 0;
                }
            } else {
                g02 = xi.g0(xiVar);
            }
            r0.l1 f7 = r0.i0.f(kiVar);
            int i19 = f7 != null ? f7.a.f(8).d : 0;
            r0.l1 f10 = r0.i0.f(kiVar);
            Math.max(f10 != null ? f10.a.f(527).d : 0, g02);
            int max = Math.max(i19 > 0 ? 0 : AndroidUtilities.navigationBarHeight, g02);
            kiVar.y0 = true;
            pi piVar2 = xiVar.y0;
            if (piVar2.f) {
                piVar2.e = AndroidUtilities.dp(62.0f) + max;
                xiVar.y0.y(i18, size4);
            } else {
                piVar2.e = AndroidUtilities.navigationBarHeight;
                piVar2.y(i18, size4 - g02);
            }
            pi piVar3 = xiVar.z0;
            if (piVar3 != null) {
                if (piVar3.f) {
                    piVar3.e = AndroidUtilities.dp(62.0f) + max;
                    xiVar.z0.y(i18, size4);
                } else {
                    piVar3.e = AndroidUtilities.navigationBarHeight;
                    piVar3.y(i18, size4 - g02);
                }
            }
            kiVar.y0 = false;
        }
        int childCount = kiVar.getChildCount();
        int i20 = 0;
        while (i20 < childCount) {
            int i21 = i20;
            View childAt = kiVar.getChildAt(i21);
            if (childAt == null || childAt.getVisibility() == 8) {
                i14 = i21;
            } else if (childAt == xiVar.v1) {
                i14 = i21;
                kiVar.measureChildWithMargins(childAt, i10, 0, makeMeasureSpec, 0);
            } else {
                i14 = i21;
                int i22 = AndroidUtilities.statusBarHeight;
                int i23 = AndroidUtilities.navigationBarHeight;
                if (childAt instanceof pi) {
                    pi piVar4 = (pi) childAt;
                    if (piVar4.h) {
                        i22 = 0;
                    }
                    if (piVar4.f) {
                        i23 = 0;
                    }
                }
                if (!zhVar.l(childAt) && !biVar.l(childAt) && (((xnVar = xiVar.m0) == null || childAt != xnVar.E) && ((xnVar2 = xiVar.n0) == null || childAt != xnVar2.E))) {
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
            kiVar = this;
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
            dVar.A(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i15, i14);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        xi xiVar = this.B0;
        if (xiVar.y0.l(motionEvent)) {
            return true;
        }
        return !xiVar.isDismissed() && super.onTouchEvent(motionEvent);
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
        xi xiVar = this.B0;
        wh whVar = xiVar.x1;
        float f10 = f7 + xiVar.l2;
        i10 = ((org.telegram.ui.ActionBar.f3) xiVar).currentSheetAnimationType;
        if (i10 == 0) {
            this.z0 = f10;
        }
        i11 = ((org.telegram.ui.ActionBar.f3) xiVar).currentSheetAnimationType;
        if (i11 == 1) {
            if (f10 < 0.0f) {
                xiVar.y0.setTranslationY(f10);
                if (xiVar.Q0 != 0 || xiVar.T0) {
                    xiVar.i1.setTranslationY((xiVar.p1 + f10) - xiVar.l2);
                }
                whVar.setTranslationY(0.0f);
                f10 = 0.0f;
            } else {
                xiVar.y0.setTranslationY(0.0f);
                whVar.setTranslationY(((f10 / this.z0) * whVar.getMeasuredHeight()) + (-f10));
            }
            viewGroup = ((org.telegram.ui.ActionBar.f3) xiVar).containerView;
            viewGroup.invalidate();
        }
        super.setTranslationY(f10 - xiVar.l2);
        i12 = ((org.telegram.ui.ActionBar.f3) xiVar).currentSheetAnimationType;
        if (i12 != 1) {
            xiVar.y0.k(xiVar.l2);
        }
    }

    @Override // org.telegram.ui.Components.mw0
    public final void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
    }
}
