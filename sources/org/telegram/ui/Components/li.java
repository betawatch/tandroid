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
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class li extends ow0 {
    public final ki A0;
    public final /* synthetic */ vi B0;
    public int w0;
    public final RectF x0;
    public boolean y0;
    public float z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li(vi viVar, Context context) {
        super(context, null);
        this.B0 = viVar;
        this.x0 = new RectF();
        this.A0 = new ki(this, this);
    }

    @Override // org.telegram.ui.Components.ow0, android.view.ViewGroup, android.view.View
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
        ni niVar;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        vi viVar = this.B0;
        gh.d dVar = viVar.H2;
        gh.d dVar2 = viVar.G2;
        if (Build.VERSION.SDK_INT >= 31 && viVar.F2 != null) {
            viVar.b1();
            if (dVar2 != null) {
                viewGroup3 = ((org.telegram.ui.ActionBar.e3) viVar).containerView;
                int measuredWidth = viewGroup3.getMeasuredWidth();
                viewGroup4 = ((org.telegram.ui.ActionBar.e3) viVar).containerView;
                dVar2.j(measuredWidth, viewGroup4.getMeasuredHeight());
                dVar2.l();
            }
            if (dVar != null) {
                viewGroup = ((org.telegram.ui.ActionBar.e3) viVar).containerView;
                int measuredWidth2 = viewGroup.getMeasuredWidth();
                viewGroup2 = ((org.telegram.ui.ActionBar.e3) viVar).containerView;
                dVar.j(measuredWidth2, viewGroup2.getMeasuredHeight());
                dVar.l();
            }
        }
        canvas.save();
        ni niVar2 = viVar.B0;
        en enVar = viVar.q0;
        if ((niVar2 == enVar || (niVar = viVar.C0) == enVar || (niVar2 == viVar.j0 && niVar == null)) && niVar2 != null) {
            canvas.save();
            float f13 = viVar.o2;
            boolean z10 = viVar.g0;
            ah.v vVar = viVar.R0;
            xh xhVar = viVar.l1;
            canvas.translate(0.0f, f13);
            int alpha2 = (int) (niVar2.getAlpha() * 255.0f);
            int i25 = niVar2.i();
            int dp3 = AndroidUtilities.dp(13.0f) + ((int) ((xhVar != null ? xhVar.getAlpha() : 0.0f) * AndroidUtilities.dp(26.0f))) + ((int) (vVar != null ? vVar.getAlpha() * vVar.getMeasuredHeight() : 0.0f));
            int r12 = viVar.r1(0);
            i10 = ((org.telegram.ui.ActionBar.e3) viVar).backgroundPaddingTop;
            int i26 = (r12 - i10) - dp3;
            i11 = ((org.telegram.ui.ActionBar.e3) viVar).currentSheetAnimationType;
            if (i11 == 1 || viVar.w1 != null) {
                i26 = (int) (niVar2.getTranslationY() + i26);
            }
            int dp4 = AndroidUtilities.dp(20.0f) + i26;
            getMeasuredHeight();
            AndroidUtilities.dp(45.0f);
            int currentActionBarHeight = i25 != 0 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : ((org.telegram.ui.ActionBar.e3) viVar).backgroundPaddingTop;
            float f14 = 1.0f;
            if (i25 != 2) {
                float f15 = dp3;
                f7 = 0.0f;
                if (niVar2 == viVar.o0) {
                    dp = AndroidUtilities.dp(11.0f);
                } else {
                    if (niVar2 == viVar.m0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else if (niVar2 == viVar.n0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else {
                        dp = AndroidUtilities.dp(4.0f);
                    }
                    f10 = f15 - dp2;
                    float alpha3 = viVar.a1.getAlpha();
                    int i27 = (int) (((currentActionBarHeight - f10) + AndroidUtilities.statusBarHeight) * alpha3);
                    i26 -= i27;
                    dp4 -= i27;
                    f11 = 1.0f - alpha3;
                }
                f10 = f15 + dp;
                float alpha32 = viVar.a1.getAlpha();
                int i272 = (int) (((currentActionBarHeight - f10) + AndroidUtilities.statusBarHeight) * alpha32);
                i26 -= i272;
                dp4 -= i272;
                f11 = 1.0f - alpha32;
            } else if (i26 < currentActionBarHeight) {
                float f16 = currentActionBarHeight - i26;
                i24 = ((org.telegram.ui.ActionBar.e3) viVar).backgroundPaddingTop;
                f11 = Math.max(0.0f, 1.0f - (f16 / i24));
                f7 = 0.0f;
            } else {
                f7 = 0.0f;
                f11 = 1.0f;
            }
            if (!z10) {
                int i28 = AndroidUtilities.statusBarHeight;
                i26 += i28;
                dp4 += i28;
            }
            int customBackground = viVar.B0.g() ? viVar.B0.getCustomBackground() : viVar.s1(true);
            drawable = ((org.telegram.ui.ActionBar.e3) viVar).shadowDrawable;
            drawable.setAlpha(alpha2);
            drawable2 = ((org.telegram.ui.ActionBar.e3) viVar).shadowDrawable;
            int measuredWidth3 = getMeasuredWidth();
            int dp5 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
            i12 = ((org.telegram.ui.ActionBar.e3) viVar).backgroundPaddingTop;
            drawable2.setBounds(0, i26, measuredWidth3, i12 + dp5);
            drawable3 = ((org.telegram.ui.ActionBar.e3) viVar).shadowDrawable;
            drawable3.draw(canvas);
            RectF rectF = this.x0;
            if (i25 == 2) {
                org.telegram.ui.ActionBar.g6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.g6.t0.setAlpha(alpha2);
                i20 = ((org.telegram.ui.ActionBar.e3) viVar).backgroundPaddingLeft;
                i21 = ((org.telegram.ui.ActionBar.e3) viVar).backgroundPaddingTop;
                f12 = 24.0f;
                float f17 = i21 + i26;
                int measuredWidth4 = getMeasuredWidth();
                i22 = ((org.telegram.ui.ActionBar.e3) viVar).backgroundPaddingLeft;
                float f18 = measuredWidth4 - i22;
                i23 = ((org.telegram.ui.ActionBar.e3) viVar).backgroundPaddingTop;
                rectF.set(i20, f17, f18, AndroidUtilities.dp(24.0f) + i23 + i26);
            } else {
                f12 = 24.0f;
            }
            if ((f11 != 1.0f && i25 != 2) || viVar.B0.f()) {
                Paint paint = org.telegram.ui.ActionBar.g6.t0;
                if (viVar.B0.f()) {
                    customBackground = viVar.B0.getCustomActionBarBackground();
                }
                paint.setColor(customBackground);
                org.telegram.ui.ActionBar.g6.t0.setAlpha(alpha2);
                i16 = ((org.telegram.ui.ActionBar.e3) viVar).backgroundPaddingLeft;
                i17 = ((org.telegram.ui.ActionBar.e3) viVar).backgroundPaddingTop;
                int measuredWidth5 = getMeasuredWidth();
                i18 = ((org.telegram.ui.ActionBar.e3) viVar).backgroundPaddingLeft;
                float f19 = measuredWidth5 - i18;
                i19 = ((org.telegram.ui.ActionBar.e3) viVar).backgroundPaddingTop;
                rectF.set(i16, i17 + i26, f19, AndroidUtilities.dp(f12) + i19 + i26);
            }
            if (viVar.B0.f()) {
                org.telegram.ui.ActionBar.g6.t0.setColor(viVar.B0.getCustomActionBarBackground());
                org.telegram.ui.ActionBar.g6.t0.setAlpha(alpha2);
                int r13 = viVar.r1(0);
                if (!z10) {
                    r13 += AndroidUtilities.statusBarHeight;
                }
                i13 = ((org.telegram.ui.ActionBar.e3) viVar).backgroundPaddingLeft;
                i14 = ((org.telegram.ui.ActionBar.e3) viVar).backgroundPaddingTop;
                float dp6 = (AndroidUtilities.dp(12.0f) + i14 + i26) * f11;
                int measuredWidth6 = getMeasuredWidth();
                i15 = ((org.telegram.ui.ActionBar.e3) viVar).backgroundPaddingLeft;
                rectF.set(i13, dp6, measuredWidth6 - i15, AndroidUtilities.dp(12.0f) + r13);
                canvas.save();
                canvas.drawRect(rectF, org.telegram.ui.ActionBar.g6.t0);
                canvas.restore();
            }
            if ((xhVar == null || xhVar.getAlpha() != 1.0f) && f11 != f7) {
                int dp7 = AndroidUtilities.dp(36.0f);
                rectF.set((getMeasuredWidth() - dp7) / 2, dp4, (getMeasuredWidth() + dp7) / 2, AndroidUtilities.dp(4.0f) + dp4);
                if (i25 == 2) {
                    themedColor = TLObject.FLAG_29;
                    f14 = f11;
                } else if (viVar.B0.f()) {
                    int customActionBarBackground = viVar.B0.getCustomActionBarBackground();
                    themedColor = i0.a.d(0.5f, customActionBarBackground, i0.a.f(customActionBarBackground) < 0.5d ? -1 : -16777216);
                    if (xhVar != null) {
                        alpha = xhVar.getAlpha();
                        f14 = 1.0f - alpha;
                    }
                } else {
                    themedColor = viVar.getThemedColor(org.telegram.ui.ActionBar.g6.Ii);
                    if (xhVar != null) {
                        alpha = xhVar.getAlpha();
                        f14 = 1.0f - alpha;
                    }
                }
                int alpha4 = Color.alpha(themedColor);
                org.telegram.ui.ActionBar.g6.t0.setColor(themedColor);
                org.telegram.ui.ActionBar.g6.t0.setAlpha((int) (niVar2.getAlpha() * alpha4 * f14 * f11));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.t0);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
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
        ni niVar;
        int i26;
        vi viVar = this.B0;
        boolean z10 = viVar.g0;
        ah.v vVar = viVar.R0;
        dh.d dVar = viVar.D0;
        xh xhVar = viVar.l1;
        b8 b8Var = viVar.a1;
        if (!(view instanceof ni) || view.getAlpha() <= 0.0f) {
            if (view != b8Var) {
                if (!(view instanceof wz) || dVar == null) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                dVar.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(dVar.j.k);
                dVar.draw(canvas);
                boolean drawChild2 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild2;
            }
            float alpha2 = b8Var.getAlpha();
            if (alpha2 <= 0.0f) {
                return false;
            }
            if (alpha2 >= 1.0f) {
                return super.drawChild(canvas, view, j10);
            }
            canvas.save();
            float x10 = b8Var.getX();
            ni niVar2 = viVar.B0;
            if (niVar2 != null) {
                int i27 = niVar2.i();
                int dp5 = AndroidUtilities.dp(13.0f) + ((int) ((xhVar != null ? xhVar.getAlpha() : 0.0f) * AndroidUtilities.dp(26.0f))) + ((int) (vVar != null ? vVar.getAlpha() * vVar.getMeasuredHeight() : 0.0f));
                int r12 = viVar.r1(0);
                i10 = ((org.telegram.ui.ActionBar.e3) viVar).backgroundPaddingTop;
                int i28 = (r12 - i10) - dp5;
                i11 = ((org.telegram.ui.ActionBar.e3) viVar).currentSheetAnimationType;
                if (i11 == 1 || viVar.w1 != null) {
                    i28 = (int) (niVar2.getTranslationY() + i28);
                }
                int dp6 = AndroidUtilities.dp(20.0f) + i28;
                int currentActionBarHeight = i27 != 0 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : ((org.telegram.ui.ActionBar.e3) viVar).backgroundPaddingTop;
                if (i27 != 2) {
                    i12 = ((org.telegram.ui.ActionBar.e3) viVar).backgroundPaddingTop;
                    if (i12 + i28 < currentActionBarHeight) {
                        float f14 = dp5;
                        if (niVar2 == viVar.o0) {
                            dp = AndroidUtilities.dp(11.0f);
                        } else {
                            if (niVar2 == viVar.m0) {
                                dp2 = AndroidUtilities.dp(3.0f);
                            } else if (niVar2 == viVar.n0) {
                                dp2 = AndroidUtilities.dp(3.0f);
                            } else {
                                dp = AndroidUtilities.dp(4.0f);
                            }
                            f10 = f14 - dp2;
                            dp6 -= (int) (b8Var.getAlpha() * ((currentActionBarHeight - f10) + AndroidUtilities.statusBarHeight));
                        }
                        f10 = f14 + dp;
                        dp6 -= (int) (b8Var.getAlpha() * ((currentActionBarHeight - f10) + AndroidUtilities.statusBarHeight));
                    }
                }
                if (!z10) {
                    dp6 += AndroidUtilities.statusBarHeight;
                }
                f7 = dp6;
            } else {
                f7 = 0.0f;
            }
            canvas.clipRect(x10, f7, b8Var.getX() + b8Var.getWidth(), b8Var.getY() + b8Var.getHeight());
            boolean drawChild3 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild3;
        }
        canvas.save();
        canvas.translate(0.0f, viVar.o2);
        int alpha3 = (int) (view.getAlpha() * 255.0f);
        ni niVar3 = (ni) view;
        int i29 = niVar3.i();
        int dp7 = AndroidUtilities.dp(13.0f) + (xhVar != null ? AndroidUtilities.dp(xhVar.getAlpha() * 26.0f) : 0) + ((int) (vVar != null ? vVar.getAlpha() * vVar.getMeasuredHeight() : 0.0f));
        int r13 = viVar.r1(niVar3 == viVar.B0 ? 0 : 1);
        i13 = ((org.telegram.ui.ActionBar.e3) viVar).backgroundPaddingTop;
        int i30 = (r13 - i13) - dp7;
        i14 = ((org.telegram.ui.ActionBar.e3) viVar).currentSheetAnimationType;
        if (i14 == 1 || viVar.w1 != null) {
            i30 = (int) (view.getTranslationY() + i30);
        }
        int dp8 = AndroidUtilities.dp(20.0f) + i30;
        int dp9 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
        i15 = ((org.telegram.ui.ActionBar.e3) viVar).backgroundPaddingTop;
        int i31 = i15 + dp9;
        int currentActionBarHeight2 = i29 != 0 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : ((org.telegram.ui.ActionBar.e3) viVar).backgroundPaddingTop;
        if (i29 != 2) {
            i16 = ((org.telegram.ui.ActionBar.e3) viVar).backgroundPaddingTop;
            f11 = 0.0f;
            if (i16 + i30 < currentActionBarHeight2) {
                float f15 = dp7;
                if (niVar3 == viVar.o0) {
                    dp3 = AndroidUtilities.dp(11.0f);
                } else {
                    if (niVar3 == viVar.m0) {
                        dp4 = AndroidUtilities.dp(3.0f);
                    } else if (niVar3 == viVar.n0) {
                        dp4 = AndroidUtilities.dp(3.0f);
                    } else {
                        dp3 = AndroidUtilities.dp(4.0f);
                    }
                    f12 = f15 - dp4;
                    i17 = ((org.telegram.ui.ActionBar.e3) viVar).backgroundPaddingTop;
                    float min = Math.min(1.0f, ((currentActionBarHeight2 - i30) - i17) / f12);
                    int i32 = (int) ((currentActionBarHeight2 - f12) * min);
                    i30 -= i32;
                    dp8 -= i32;
                    i31 += i32;
                    f13 = 1.0f - min;
                }
                f12 = f15 + dp3;
                i17 = ((org.telegram.ui.ActionBar.e3) viVar).backgroundPaddingTop;
                float min2 = Math.min(1.0f, ((currentActionBarHeight2 - i30) - i17) / f12);
                int i322 = (int) ((currentActionBarHeight2 - f12) * min2);
                i30 -= i322;
                dp8 -= i322;
                i31 += i322;
                f13 = 1.0f - min2;
            }
            f13 = 1.0f;
        } else if (i30 < currentActionBarHeight2) {
            i26 = ((org.telegram.ui.ActionBar.e3) viVar).backgroundPaddingTop;
            f13 = Math.max(0.0f, 1.0f - ((currentActionBarHeight2 - i30) / i26));
            f11 = 0.0f;
        } else {
            f11 = 0.0f;
            f13 = 1.0f;
        }
        if (!z10) {
            int i33 = AndroidUtilities.statusBarHeight;
            i30 += i33;
            dp8 += i33;
            i31 -= i33;
        }
        int i34 = i31;
        int customBackground = viVar.B0.g() ? viVar.B0.getCustomBackground() : viVar.s1(true);
        ni niVar4 = viVar.B0;
        en enVar = viVar.q0;
        boolean z11 = (niVar4 == enVar || (niVar = viVar.C0) == enVar || (niVar4 == viVar.j0 && niVar == null)) ? false : true;
        RectF rectF = this.x0;
        if (z11) {
            drawable = ((org.telegram.ui.ActionBar.e3) viVar).shadowDrawable;
            drawable.setAlpha(alpha3);
            drawable2 = ((org.telegram.ui.ActionBar.e3) viVar).shadowDrawable;
            drawable2.setBounds(0, i30, getMeasuredWidth(), i34);
            drawable3 = ((org.telegram.ui.ActionBar.e3) viVar).shadowDrawable;
            drawable3.draw(canvas);
            if (i29 == 2) {
                org.telegram.ui.ActionBar.g6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.g6.t0.setAlpha(alpha3);
                i22 = ((org.telegram.ui.ActionBar.e3) viVar).backgroundPaddingLeft;
                i23 = ((org.telegram.ui.ActionBar.e3) viVar).backgroundPaddingTop;
                int measuredWidth = getMeasuredWidth();
                i24 = ((org.telegram.ui.ActionBar.e3) viVar).backgroundPaddingLeft;
                float f16 = measuredWidth - i24;
                i25 = ((org.telegram.ui.ActionBar.e3) viVar).backgroundPaddingTop;
                rectF.set(i22, i23 + i30, f16, AndroidUtilities.dp(24.0f) + i25 + i30);
            }
        }
        if (view == viVar.k0 || view == viVar.s0 || view == viVar.l0) {
            drawChild = super.drawChild(canvas, view, j10);
        } else {
            canvas.save();
            drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
        }
        if (z11) {
            if (f13 != 1.0f && i29 != 2) {
                org.telegram.ui.ActionBar.g6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.g6.t0.setAlpha(alpha3);
                i18 = ((org.telegram.ui.ActionBar.e3) viVar).backgroundPaddingLeft;
                i19 = ((org.telegram.ui.ActionBar.e3) viVar).backgroundPaddingTop;
                int measuredWidth2 = getMeasuredWidth();
                i20 = ((org.telegram.ui.ActionBar.e3) viVar).backgroundPaddingLeft;
                float f17 = measuredWidth2 - i20;
                i21 = ((org.telegram.ui.ActionBar.e3) viVar).backgroundPaddingTop;
                rectF.set(i18, i19 + i30, f17, AndroidUtilities.dp(24.0f) + i21 + i30);
            }
            if ((xhVar == null || xhVar.getAlpha() != 1.0f) && f13 != f11) {
                int dp10 = AndroidUtilities.dp(36.0f);
                rectF.set((getMeasuredWidth() - dp10) / 2, dp8, (getMeasuredWidth() + dp10) / 2, AndroidUtilities.dp(4.0f) + dp8);
                if (i29 == 2) {
                    themedColor = TLObject.FLAG_29;
                    alpha = f13;
                } else {
                    themedColor = viVar.getThemedColor(org.telegram.ui.ActionBar.g6.Ii);
                    alpha = xhVar == null ? 1.0f : 1.0f - xhVar.getAlpha();
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

    @Override // org.telegram.ui.Components.ow0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ki kiVar = this.A0;
        kiVar.b = this;
        kiVar.c();
        vi viVar = this.B0;
        viVar.H0.setAdjustPanLayoutHelper(kiVar);
        viVar.S0.setAdjustPanLayoutHelper(kiVar);
    }

    @Override // org.telegram.ui.Components.ow0, android.view.ViewGroup, android.view.View
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
        vi viVar = this.B0;
        int[] iArr = viVar.e2;
        if (viVar.B0.n(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            if (iArr[0] != 0) {
                float y3 = motionEvent.getY();
                ah.v vVar = viVar.R0;
                int i11 = iArr[0];
                i10 = ((org.telegram.ui.ActionBar.e3) viVar).backgroundPaddingTop;
                int i12 = i11 - (i10 * 2);
                int dp = AndroidUtilities.dp(13.0f);
                xh xhVar = viVar.l1;
                int dp2 = AndroidUtilities.dp(20.0f) + ((i12 - (dp + (xhVar != null ? AndroidUtilities.dp(xhVar.getAlpha() * 26.0f) : 0))) - ((int) (vVar != null ? vVar.getAlpha() * vVar.getMeasuredHeight() : 0.0f)));
                if (!viVar.g0) {
                    dp2 += AndroidUtilities.statusBarHeight;
                }
                if (y3 < dp2 && viVar.a1.getAlpha() == 0.0f) {
                    viVar.onDismissWithTouchOutside();
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0163  */
    @Override // org.telegram.ui.Components.ow0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        gm gmVar;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        ai aiVar;
        di diVar;
        io ioVar;
        io ioVar2;
        int i20;
        int max;
        int measuredHeight;
        int measuredHeight2;
        int emojiPadding;
        li liVar = this;
        vi viVar = liVar.B0;
        ah.v vVar = viVar.R0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar.j0;
        int i21 = i12 - i10;
        if (liVar.w0 != i21) {
            liVar.w0 = i21;
            of ofVar = viVar.h0;
            if (ofVar != null && !ofVar.q0) {
                ofVar.dismiss();
            }
        }
        int childCount = liVar.getChildCount();
        if (Build.VERSION.SDK_INT >= 29) {
            viVar.n2.set(i10, i11, i12, i13);
            liVar.setSystemGestureExclusionRects(viVar.m2);
        }
        WeakHashMap weakHashMap = r0.i0.a;
        r0.l1 a2 = r0.b0.a(liVar);
        int i22 = 8;
        int i23 = a2 != null ? a2.a.f(8).d : 0;
        int paddingBottom = liVar.getPaddingBottom();
        z11 = ((org.telegram.ui.ActionBar.e3) viVar).keyboardVisible;
        if (!z11) {
            io ioVar3 = viVar.m0;
            if (ioVar3 == null || viVar.B0 != ioVar3 || ioVar3.E == null) {
                io ioVar4 = viVar.n0;
                if (ioVar4 == null || viVar.B0 != ioVar4 || ioVar4.E == null) {
                    if (i23 <= AndroidUtilities.dp(20.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        emojiPadding = viVar.o1().getEmojiPadding();
                        if (emojiPadding > 0) {
                            paddingBottom += emojiPadding;
                        }
                    }
                    emojiPadding = 0;
                    if (emojiPadding > 0) {
                    }
                } else {
                    if (i23 <= AndroidUtilities.dp(20.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        emojiPadding = viVar.n0.getEmojiPadding();
                        if (emojiPadding > 0) {
                        }
                    }
                    emojiPadding = 0;
                    if (emojiPadding > 0) {
                    }
                }
            } else {
                if (i23 <= AndroidUtilities.dp(20.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                    emojiPadding = viVar.m0.getEmojiPadding();
                    if (emojiPadding > 0) {
                    }
                }
                emojiPadding = 0;
                if (emojiPadding > 0) {
                }
            }
        }
        liVar.setBottomClip(paddingBottom);
        int i24 = 0;
        while (i24 < childCount) {
            View childAt = liVar.getChildAt(i24);
            if (childAt.getVisibility() != i22) {
                int i25 = AndroidUtilities.statusBarHeight;
                int max2 = i23 == 0 ? Math.max(AndroidUtilities.navigationBarHeight, paddingBottom) : 0;
                if (childAt instanceof ni) {
                    ni niVar = (ni) childAt;
                    if (niVar.h) {
                        i25 = 0;
                    }
                    if (niVar.f) {
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
                        if (childAt != viVar.a1 || childAt == viVar.y1) {
                            i19 = 0;
                        }
                        aiVar = viVar.H0;
                        if ((aiVar == null && aiVar.l(childAt)) || (((diVar = viVar.S0) != null && diVar.l(childAt)) || (((ioVar = viVar.m0) != null && childAt == ioVar.E) || ((ioVar2 = viVar.n0) != null && childAt == ioVar2.E)))) {
                            if (AndroidUtilities.isTablet()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight() + i23;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i19 = measuredHeight - measuredHeight2;
                        } else if (childAt == viVar.E2) {
                            if (viVar.c0) {
                                i20 = AndroidUtilities.statusBarHeight;
                                max = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                i19 = i20 + max;
                            }
                        } else if (childAt == viVar.z1) {
                            i20 = i19 + AndroidUtilities.navigationBarHeight;
                            max = Math.max(i23, viVar.q1());
                            i19 = i20 + max;
                        }
                        childAt.layout(i16, i19, measuredWidth + i16, i19 + measuredHeight3);
                    } else {
                        i17 = ((((i13 - max2) - i11) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    if (childAt != viVar.a1) {
                    }
                    i19 = 0;
                    aiVar = viVar.H0;
                    if (aiVar == null) {
                    }
                    if (childAt == viVar.E2) {
                    }
                } else {
                    i14 = ((i21 - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                    i15 = ((org.telegram.ui.ActionBar.e3) viVar).backgroundPaddingLeft;
                }
                i16 = i14 - i15;
                if (i27 == 16) {
                }
                i19 = i17 - i18;
                if (childAt != viVar.a1) {
                }
                i19 = 0;
                aiVar = viVar.H0;
                if (aiVar == null) {
                }
                if (childAt == viVar.E2) {
                }
            }
            i24++;
            liVar = this;
            i22 = 8;
        }
        S();
        viVar.b2(viVar.B0, 0);
        viVar.b2(viVar.C0, 0);
        if (viVar.c0) {
            viVar.Y1();
        }
        if (chatAttachAlertPhotoLayout == null || (gmVar = chatAttachAlertPhotoLayout.E) == null || gmVar.getFastScroll() == null) {
            return;
        }
        chatAttachAlertPhotoLayout.E.getFastScroll().h0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.p1 + (viVar.c0 ? (int) (vVar.getAlpha() * vVar.getMeasuredHeight()) : 0);
        chatAttachAlertPhotoLayout.E.getFastScroll().invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        io ioVar;
        io ioVar2;
        boolean z10;
        int q12;
        int i15;
        int i16;
        li liVar = this;
        vi viVar = liVar.B0;
        boolean z11 = viVar.g0;
        org.telegram.ui.ActionBar.u0 u0Var = viVar.d1;
        int size = liVar.getLayoutParams().height > 0 ? liVar.getLayoutParams().height : View.MeasureSpec.getSize(i11);
        if (!z11) {
            liVar.y0 = true;
            i15 = ((org.telegram.ui.ActionBar.e3) viVar).backgroundPaddingLeft;
            i16 = ((org.telegram.ui.ActionBar.e3) viVar).backgroundPaddingLeft;
            liVar.setPadding(i15, 0, i16, 0);
            liVar.y0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        i12 = ((org.telegram.ui.ActionBar.e3) viVar).backgroundPaddingLeft;
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
        ((FrameLayout.LayoutParams) viVar.i1.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        liVar.y0 = true;
        int min = (int) (i17 / Math.min(4.5f, viVar.D1.h()));
        if (viVar.b2 != min) {
            viVar.b2 = min;
            AndroidUtilities.runOnUIThread(new qg(liVar, 21));
        }
        liVar.y0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        liVar.setMeasuredDimension(size3, size4);
        i13 = ((org.telegram.ui.ActionBar.e3) viVar).backgroundPaddingLeft;
        di diVar = viVar.S0;
        ai aiVar = viVar.H0;
        int i18 = size3 - (i13 * 2);
        if (!aiVar.N && AndroidUtilities.dp(20.0f) >= 0 && !aiVar.e && !aiVar.O) {
            liVar.y0 = true;
            aiVar.j();
            liVar.y0 = false;
        }
        if (!diVar.N && AndroidUtilities.dp(20.0f) >= 0 && !diVar.e && !diVar.O) {
            liVar.y0 = true;
            diVar.j();
            liVar.y0 = false;
        }
        if (viVar.m0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            io ioVar3 = viVar.m0;
            if (!ioVar3.G && !ioVar3.a1 && !ioVar3.f1 && !ioVar3.h1) {
                liVar.y0 = true;
                ioVar3.d0();
                liVar.y0 = false;
            }
        }
        if (viVar.n0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            io ioVar4 = viVar.n0;
            if (!ioVar4.G && !ioVar4.a1 && !ioVar4.f1 && !ioVar4.h1) {
                liVar.y0 = true;
                ioVar4.d0();
                liVar.y0 = false;
            }
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            z10 = ((org.telegram.ui.ActionBar.e3) viVar).keyboardVisible;
            if (z10) {
                ni niVar = viVar.B0;
                io ioVar5 = viVar.m0;
                if (niVar == ioVar5 && ioVar5.E != null && ioVar5.h1) {
                    q12 = AndroidUtilities.dp(120.0f);
                } else {
                    io ioVar6 = viVar.n0;
                    q12 = (niVar == ioVar6 && ioVar6.E != null && ioVar6.h1) ? AndroidUtilities.dp(120.0f) : 0;
                }
            } else {
                q12 = viVar.q1();
            }
            WeakHashMap weakHashMap = r0.i0.a;
            r0.l1 a2 = r0.b0.a(liVar);
            int i19 = a2 != null ? a2.a.f(8).d : 0;
            r0.l1 a10 = r0.b0.a(liVar);
            Math.max(a10 != null ? a10.a.f(527).d : 0, q12);
            int max = Math.max(i19 > 0 ? 0 : AndroidUtilities.navigationBarHeight, q12);
            liVar.y0 = true;
            ni niVar2 = viVar.B0;
            if (niVar2.f) {
                niVar2.e = AndroidUtilities.dp(62.0f) + max;
                viVar.B0.C(i18, size4);
            } else {
                niVar2.e = AndroidUtilities.navigationBarHeight;
                niVar2.C(i18, size4 - q12);
            }
            ni niVar3 = viVar.C0;
            if (niVar3 != null) {
                if (niVar3.f) {
                    niVar3.e = AndroidUtilities.dp(62.0f) + max;
                    viVar.C0.C(i18, size4);
                } else {
                    niVar3.e = AndroidUtilities.navigationBarHeight;
                    niVar3.C(i18, size4 - q12);
                }
            }
            liVar.y0 = false;
        }
        int childCount = liVar.getChildCount();
        int i20 = 0;
        while (i20 < childCount) {
            int i21 = i20;
            View childAt = liVar.getChildAt(i21);
            if (childAt == null || childAt.getVisibility() == 8) {
                i14 = i21;
            } else if (childAt == viVar.y1) {
                i14 = i21;
                liVar.measureChildWithMargins(childAt, i10, 0, makeMeasureSpec, 0);
            } else {
                i14 = i21;
                int i22 = AndroidUtilities.statusBarHeight;
                int i23 = AndroidUtilities.navigationBarHeight;
                if (childAt instanceof ni) {
                    ni niVar4 = (ni) childAt;
                    if (niVar4.h) {
                        i22 = 0;
                    }
                    if (niVar4.f) {
                        i23 = 0;
                    }
                }
                if (!aiVar.l(childAt) && !diVar.l(childAt) && (((ioVar = viVar.m0) == null || childAt != ioVar.E) && ((ioVar2 = viVar.n0) == null || childAt != ioVar2.E))) {
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
            liVar = this;
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
        dh.d dVar = this.B0.D0;
        if (dVar != null) {
            dVar.s(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i15, i14);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        vi viVar = this.B0;
        if (viVar.B0.n(motionEvent)) {
            return true;
        }
        return !viVar.isDismissed() && super.onTouchEvent(motionEvent);
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
        vi viVar = this.B0;
        xh xhVar = viVar.A1;
        float f10 = f7 + viVar.o2;
        i10 = ((org.telegram.ui.ActionBar.e3) viVar).currentSheetAnimationType;
        if (i10 == 0) {
            this.z0 = f10;
        }
        i11 = ((org.telegram.ui.ActionBar.e3) viVar).currentSheetAnimationType;
        if (i11 == 1) {
            if (f10 < 0.0f) {
                viVar.B0.setTranslationY(f10);
                if (viVar.T0 != 0 || viVar.W0) {
                    viVar.l1.setTranslationY((viVar.s1 + f10) - viVar.o2);
                }
                xhVar.setTranslationY(0.0f);
                f10 = 0.0f;
            } else {
                viVar.B0.setTranslationY(0.0f);
                xhVar.setTranslationY(((f10 / this.z0) * xhVar.getMeasuredHeight()) + (-f10));
            }
            viewGroup = ((org.telegram.ui.ActionBar.e3) viVar).containerView;
            viewGroup.invalidate();
        }
        super.setTranslationY((f10 - viVar.o2) + viVar.y0);
        i12 = ((org.telegram.ui.ActionBar.e3) viVar).currentSheetAnimationType;
        if (i12 != 1) {
            viVar.B0.l(viVar.o2);
        }
    }

    @Override // org.telegram.ui.Components.ow0
    public final void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
    }
}
