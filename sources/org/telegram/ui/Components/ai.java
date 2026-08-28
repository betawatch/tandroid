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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ai extends xu0 {
    public int s0;
    public final RectF t0;
    public boolean u0;
    public float v0;
    public final zh w0;
    public final /* synthetic */ ki x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(ki kiVar, Context context) {
        super(context, null);
        this.x0 = kiVar;
        this.t0 = new RectF();
        this.w0 = new zh(this, this);
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i9;
        int i10;
        float f10;
        int dp;
        int dp2;
        float f11;
        float f12;
        Drawable drawable;
        Drawable drawable2;
        int i11;
        Drawable drawable3;
        float f13;
        int themedColor;
        float alpha;
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
        int i22;
        int i23;
        ci ciVar;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        ki kiVar = this.x0;
        ng.d dVar = kiVar.A2;
        ng.d dVar2 = kiVar.z2;
        if (Build.VERSION.SDK_INT >= 31 && kiVar.y2 != null) {
            kiVar.Z0();
            if (dVar2 != null) {
                viewGroup3 = ((org.telegram.ui.ActionBar.f3) kiVar).containerView;
                int measuredWidth = viewGroup3.getMeasuredWidth();
                viewGroup4 = ((org.telegram.ui.ActionBar.f3) kiVar).containerView;
                dVar2.h(measuredWidth, viewGroup4.getMeasuredHeight());
                dVar2.j();
            }
            if (dVar != null) {
                viewGroup = ((org.telegram.ui.ActionBar.f3) kiVar).containerView;
                int measuredWidth2 = viewGroup.getMeasuredWidth();
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) kiVar).containerView;
                dVar.h(measuredWidth2, viewGroup2.getMeasuredHeight());
                dVar.j();
            }
        }
        canvas.save();
        ci ciVar2 = kiVar.u0;
        hm hmVar = kiVar.m0;
        if ((ciVar2 == hmVar || (ciVar = kiVar.v0) == hmVar || (ciVar2 == kiVar.f0 && ciVar == null)) && ciVar2 != null) {
            canvas.save();
            float f14 = kiVar.h2;
            boolean z10 = kiVar.c0;
            fh.v vVar = kiVar.K0;
            mh mhVar = kiVar.e1;
            canvas.translate(0.0f, f14);
            int alpha2 = (int) (ciVar2.getAlpha() * 255.0f);
            int h = ciVar2.h();
            int dp3 = AndroidUtilities.dp(13.0f) + ((int) ((mhVar != null ? mhVar.getAlpha() : 0.0f) * AndroidUtilities.dp(26.0f))) + ((int) (vVar != null ? vVar.getAlpha() * vVar.getMeasuredHeight() : 0.0f));
            int p12 = kiVar.p1(0);
            i9 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
            int i24 = (p12 - i9) - dp3;
            i10 = ((org.telegram.ui.ActionBar.f3) kiVar).currentSheetAnimationType;
            if (i10 == 1 || kiVar.p1 != null) {
                i24 = (int) (ciVar2.getTranslationY() + i24);
            }
            int dp4 = AndroidUtilities.dp(20.0f) + i24;
            getMeasuredHeight();
            AndroidUtilities.dp(45.0f);
            int currentActionBarHeight = h != 0 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
            float f15 = 1.0f;
            if (h == 2) {
                if (i24 < currentActionBarHeight) {
                    float f16 = currentActionBarHeight - i24;
                    i23 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
                    f12 = Math.max(0.0f, 1.0f - (f16 / i23));
                } else {
                    f12 = 1.0f;
                }
                f10 = 0.0f;
            } else {
                float f17 = dp3;
                f10 = 0.0f;
                if (ciVar2 == kiVar.k0) {
                    dp = AndroidUtilities.dp(11.0f);
                } else {
                    if (ciVar2 == kiVar.i0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else if (ciVar2 == kiVar.j0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else {
                        dp = AndroidUtilities.dp(4.0f);
                    }
                    f11 = f17 - dp2;
                    float alpha3 = kiVar.T0.getAlpha();
                    int i25 = (int) (((currentActionBarHeight - f11) + AndroidUtilities.statusBarHeight) * alpha3);
                    i24 -= i25;
                    dp4 -= i25;
                    f12 = 1.0f - alpha3;
                }
                f11 = f17 + dp;
                float alpha32 = kiVar.T0.getAlpha();
                int i252 = (int) (((currentActionBarHeight - f11) + AndroidUtilities.statusBarHeight) * alpha32);
                i24 -= i252;
                dp4 -= i252;
                f12 = 1.0f - alpha32;
            }
            if (!z10) {
                int i26 = AndroidUtilities.statusBarHeight;
                i24 += i26;
                dp4 += i26;
            }
            int customBackground = kiVar.u0.f() ? kiVar.u0.getCustomBackground() : kiVar.q1(true);
            drawable = ((org.telegram.ui.ActionBar.f3) kiVar).shadowDrawable;
            drawable.setAlpha(alpha2);
            drawable2 = ((org.telegram.ui.ActionBar.f3) kiVar).shadowDrawable;
            int measuredWidth3 = getMeasuredWidth();
            int dp5 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
            i11 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
            drawable2.setBounds(0, i24, measuredWidth3, i11 + dp5);
            drawable3 = ((org.telegram.ui.ActionBar.f3) kiVar).shadowDrawable;
            drawable3.draw(canvas);
            RectF rectF = this.t0;
            if (h == 2) {
                org.telegram.ui.ActionBar.f6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.f6.t0.setAlpha(alpha2);
                i19 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingLeft;
                i20 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
                f13 = 24.0f;
                float f18 = i20 + i24;
                int measuredWidth4 = getMeasuredWidth();
                i21 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingLeft;
                float f19 = measuredWidth4 - i21;
                i22 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
                rectF.set(i19, f18, f19, AndroidUtilities.dp(24.0f) + i22 + i24);
            } else {
                f13 = 24.0f;
            }
            if ((f12 != 1.0f && h != 2) || kiVar.u0.e()) {
                Paint paint = org.telegram.ui.ActionBar.f6.t0;
                if (kiVar.u0.e()) {
                    customBackground = kiVar.u0.getCustomActionBarBackground();
                }
                paint.setColor(customBackground);
                org.telegram.ui.ActionBar.f6.t0.setAlpha(alpha2);
                i15 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingLeft;
                i16 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
                int measuredWidth5 = getMeasuredWidth();
                i17 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingLeft;
                float f20 = measuredWidth5 - i17;
                i18 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
                rectF.set(i15, i16 + i24, f20, AndroidUtilities.dp(f13) + i18 + i24);
            }
            if (kiVar.u0.e()) {
                org.telegram.ui.ActionBar.f6.t0.setColor(kiVar.u0.getCustomActionBarBackground());
                org.telegram.ui.ActionBar.f6.t0.setAlpha(alpha2);
                int p13 = kiVar.p1(0);
                if (!z10) {
                    p13 += AndroidUtilities.statusBarHeight;
                }
                i12 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingLeft;
                i13 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
                float dp6 = (AndroidUtilities.dp(12.0f) + i13 + i24) * f12;
                int measuredWidth6 = getMeasuredWidth();
                i14 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingLeft;
                rectF.set(i12, dp6, measuredWidth6 - i14, AndroidUtilities.dp(12.0f) + p13);
                canvas.save();
                canvas.drawRect(rectF, org.telegram.ui.ActionBar.f6.t0);
                canvas.restore();
            }
            if ((mhVar == null || mhVar.getAlpha() != 1.0f) && f12 != f10) {
                int dp7 = AndroidUtilities.dp(36.0f);
                rectF.set((getMeasuredWidth() - dp7) / 2, dp4, (getMeasuredWidth() + dp7) / 2, AndroidUtilities.dp(4.0f) + dp4);
                if (h == 2) {
                    themedColor = TLObject.FLAG_29;
                    f15 = f12;
                } else if (kiVar.u0.e()) {
                    int customActionBarBackground = kiVar.u0.getCustomActionBarBackground();
                    themedColor = i0.a.d(0.5f, customActionBarBackground, i0.a.f(customActionBarBackground) < 0.5d ? -1 : -16777216);
                    if (mhVar != null) {
                        alpha = mhVar.getAlpha();
                        f15 = 1.0f - alpha;
                    }
                } else {
                    themedColor = kiVar.getThemedColor(org.telegram.ui.ActionBar.f6.Ii);
                    if (mhVar != null) {
                        alpha = mhVar.getAlpha();
                        f15 = 1.0f - alpha;
                    }
                }
                int alpha4 = Color.alpha(themedColor);
                org.telegram.ui.ActionBar.f6.t0.setColor(themedColor);
                org.telegram.ui.ActionBar.f6.t0.setAlpha((int) (ciVar2.getAlpha() * alpha4 * f15 * f12));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.f6.t0);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float f10;
        int i9;
        int i10;
        int i11;
        int dp;
        int dp2;
        float f11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f12;
        int dp3;
        int dp4;
        float f13;
        int i16;
        float f14;
        boolean drawChild;
        int themedColor;
        float alpha;
        int i17;
        int i18;
        int i19;
        int i20;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        int i21;
        int i22;
        int i23;
        int i24;
        ci ciVar;
        int i25;
        ki kiVar = this.x0;
        boolean z10 = kiVar.c0;
        fh.v vVar = kiVar.K0;
        kg.d dVar = kiVar.w0;
        mh mhVar = kiVar.e1;
        r7 r7Var = kiVar.T0;
        if (!(view instanceof ci) || view.getAlpha() <= 0.0f) {
            if (view != r7Var) {
                if (!(view instanceof wy) || dVar == null) {
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
            float alpha2 = r7Var.getAlpha();
            if (alpha2 <= 0.0f) {
                return false;
            }
            if (alpha2 >= 1.0f) {
                return super.drawChild(canvas, view, j10);
            }
            canvas.save();
            float x10 = r7Var.getX();
            ci ciVar2 = kiVar.u0;
            if (ciVar2 != null) {
                int h = ciVar2.h();
                int dp5 = AndroidUtilities.dp(13.0f) + ((int) ((mhVar != null ? mhVar.getAlpha() : 0.0f) * AndroidUtilities.dp(26.0f))) + ((int) (vVar != null ? vVar.getAlpha() * vVar.getMeasuredHeight() : 0.0f));
                int p12 = kiVar.p1(0);
                i9 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
                int i26 = (p12 - i9) - dp5;
                i10 = ((org.telegram.ui.ActionBar.f3) kiVar).currentSheetAnimationType;
                if (i10 == 1 || kiVar.p1 != null) {
                    i26 = (int) (ciVar2.getTranslationY() + i26);
                }
                int dp6 = AndroidUtilities.dp(20.0f) + i26;
                int currentActionBarHeight = h != 0 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
                if (h != 2) {
                    i11 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
                    if (i11 + i26 < currentActionBarHeight) {
                        float f15 = dp5;
                        if (ciVar2 == kiVar.k0) {
                            dp = AndroidUtilities.dp(11.0f);
                        } else {
                            if (ciVar2 == kiVar.i0) {
                                dp2 = AndroidUtilities.dp(3.0f);
                            } else if (ciVar2 == kiVar.j0) {
                                dp2 = AndroidUtilities.dp(3.0f);
                            } else {
                                dp = AndroidUtilities.dp(4.0f);
                            }
                            f11 = f15 - dp2;
                            dp6 -= (int) (r7Var.getAlpha() * ((currentActionBarHeight - f11) + AndroidUtilities.statusBarHeight));
                        }
                        f11 = f15 + dp;
                        dp6 -= (int) (r7Var.getAlpha() * ((currentActionBarHeight - f11) + AndroidUtilities.statusBarHeight));
                    }
                }
                if (!z10) {
                    dp6 += AndroidUtilities.statusBarHeight;
                }
                f10 = dp6;
            } else {
                f10 = 0.0f;
            }
            canvas.clipRect(x10, f10, r7Var.getX() + r7Var.getWidth(), r7Var.getY() + r7Var.getHeight());
            boolean drawChild3 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild3;
        }
        canvas.save();
        canvas.translate(0.0f, kiVar.h2);
        int alpha3 = (int) (view.getAlpha() * 255.0f);
        ci ciVar3 = (ci) view;
        int h10 = ciVar3.h();
        int dp7 = AndroidUtilities.dp(13.0f) + (mhVar != null ? AndroidUtilities.dp(mhVar.getAlpha() * 26.0f) : 0) + ((int) (vVar != null ? vVar.getAlpha() * vVar.getMeasuredHeight() : 0.0f));
        int p13 = kiVar.p1(ciVar3 == kiVar.u0 ? 0 : 1);
        i12 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
        int i27 = (p13 - i12) - dp7;
        i13 = ((org.telegram.ui.ActionBar.f3) kiVar).currentSheetAnimationType;
        if (i13 == 1 || kiVar.p1 != null) {
            i27 = (int) (view.getTranslationY() + i27);
        }
        int dp8 = AndroidUtilities.dp(20.0f) + i27;
        int dp9 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
        i14 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
        int i28 = i14 + dp9;
        int currentActionBarHeight2 = h10 != 0 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
        if (h10 != 2) {
            i15 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
            f12 = 0.0f;
            if (i15 + i27 < currentActionBarHeight2) {
                float f16 = dp7;
                if (ciVar3 == kiVar.k0) {
                    dp3 = AndroidUtilities.dp(11.0f);
                } else {
                    if (ciVar3 == kiVar.i0) {
                        dp4 = AndroidUtilities.dp(3.0f);
                    } else if (ciVar3 == kiVar.j0) {
                        dp4 = AndroidUtilities.dp(3.0f);
                    } else {
                        dp3 = AndroidUtilities.dp(4.0f);
                    }
                    f13 = f16 - dp4;
                    i16 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
                    float min = Math.min(1.0f, ((currentActionBarHeight2 - i27) - i16) / f13);
                    int i29 = (int) ((currentActionBarHeight2 - f13) * min);
                    i27 -= i29;
                    dp8 -= i29;
                    i28 += i29;
                    f14 = 1.0f - min;
                }
                f13 = f16 + dp3;
                i16 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
                float min2 = Math.min(1.0f, ((currentActionBarHeight2 - i27) - i16) / f13);
                int i292 = (int) ((currentActionBarHeight2 - f13) * min2);
                i27 -= i292;
                dp8 -= i292;
                i28 += i292;
                f14 = 1.0f - min2;
            }
            f14 = 1.0f;
        } else if (i27 < currentActionBarHeight2) {
            i25 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
            f14 = Math.max(0.0f, 1.0f - ((currentActionBarHeight2 - i27) / i25));
            f12 = 0.0f;
        } else {
            f12 = 0.0f;
            f14 = 1.0f;
        }
        if (!z10) {
            int i30 = AndroidUtilities.statusBarHeight;
            i27 += i30;
            dp8 += i30;
            i28 -= i30;
        }
        int i31 = i28;
        int customBackground = kiVar.u0.f() ? kiVar.u0.getCustomBackground() : kiVar.q1(true);
        ci ciVar4 = kiVar.u0;
        hm hmVar = kiVar.m0;
        boolean z11 = (ciVar4 == hmVar || (ciVar = kiVar.v0) == hmVar || (ciVar4 == kiVar.f0 && ciVar == null)) ? false : true;
        RectF rectF = this.t0;
        if (z11) {
            drawable = ((org.telegram.ui.ActionBar.f3) kiVar).shadowDrawable;
            drawable.setAlpha(alpha3);
            drawable2 = ((org.telegram.ui.ActionBar.f3) kiVar).shadowDrawable;
            drawable2.setBounds(0, i27, getMeasuredWidth(), i31);
            drawable3 = ((org.telegram.ui.ActionBar.f3) kiVar).shadowDrawable;
            drawable3.draw(canvas);
            if (h10 == 2) {
                org.telegram.ui.ActionBar.f6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.f6.t0.setAlpha(alpha3);
                i21 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingLeft;
                i22 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
                int measuredWidth = getMeasuredWidth();
                i23 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingLeft;
                float f17 = measuredWidth - i23;
                i24 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
                rectF.set(i21, i22 + i27, f17, AndroidUtilities.dp(24.0f) + i24 + i27);
            }
        }
        if (view == kiVar.g0 || view == kiVar.o0 || view == kiVar.h0) {
            drawChild = super.drawChild(canvas, view, j10);
        } else {
            canvas.save();
            drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
        }
        if (z11) {
            if (f14 != 1.0f && h10 != 2) {
                org.telegram.ui.ActionBar.f6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.f6.t0.setAlpha(alpha3);
                i17 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingLeft;
                i18 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
                int measuredWidth2 = getMeasuredWidth();
                i19 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingLeft;
                float f18 = measuredWidth2 - i19;
                i20 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
                rectF.set(i17, i18 + i27, f18, AndroidUtilities.dp(24.0f) + i20 + i27);
            }
            if ((mhVar == null || mhVar.getAlpha() != 1.0f) && f14 != f12) {
                int dp10 = AndroidUtilities.dp(36.0f);
                rectF.set((getMeasuredWidth() - dp10) / 2, dp8, (getMeasuredWidth() + dp10) / 2, AndroidUtilities.dp(4.0f) + dp8);
                if (h10 == 2) {
                    themedColor = TLObject.FLAG_29;
                    alpha = f14;
                } else {
                    themedColor = kiVar.getThemedColor(org.telegram.ui.ActionBar.f6.Ii);
                    alpha = mhVar == null ? 1.0f : 1.0f - mhVar.getAlpha();
                }
                int alpha4 = Color.alpha(themedColor);
                org.telegram.ui.ActionBar.f6.t0.setColor(themedColor);
                org.telegram.ui.ActionBar.f6.t0.setAlpha((int) (view.getAlpha() * alpha4 * alpha * f14));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.f6.t0);
            }
        }
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zh zhVar = this.w0;
        zhVar.b = this;
        zhVar.c();
        ki kiVar = this.x0;
        kiVar.A0.setAdjustPanLayoutHelper(zhVar);
        kiVar.L0.setAdjustPanLayoutHelper(zhVar);
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
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
        int i9;
        ki kiVar = this.x0;
        int[] iArr = kiVar.X1;
        if (kiVar.u0.l(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            if (iArr[0] != 0) {
                float y10 = motionEvent.getY();
                fh.v vVar = kiVar.K0;
                int i10 = iArr[0];
                i9 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingTop;
                int i11 = i10 - (i9 * 2);
                int dp = AndroidUtilities.dp(13.0f);
                mh mhVar = kiVar.e1;
                int dp2 = AndroidUtilities.dp(20.0f) + ((i11 - (dp + (mhVar != null ? AndroidUtilities.dp(mhVar.getAlpha() * 26.0f) : 0))) - ((int) (vVar != null ? vVar.getAlpha() * vVar.getMeasuredHeight() : 0.0f)));
                if (!kiVar.c0) {
                    dp2 += AndroidUtilities.statusBarHeight;
                }
                if (y10 < dp2 && kiVar.T0.getAlpha() == 0.0f) {
                    kiVar.onDismissWithTouchOutside();
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
    @Override // org.telegram.ui.Components.xu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        boolean z11;
        kl klVar;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        qh qhVar;
        th thVar;
        jn jnVar;
        jn jnVar2;
        int i19;
        int max;
        int measuredHeight;
        int measuredHeight2;
        int emojiPadding;
        ai aiVar = this;
        ki kiVar = aiVar.x0;
        fh.v vVar = kiVar.K0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar.f0;
        int i20 = i11 - i9;
        if (aiVar.s0 != i20) {
            aiVar.s0 = i20;
            cf cfVar = kiVar.d0;
            if (cfVar != null && !cfVar.m0) {
                cfVar.dismiss();
            }
        }
        int childCount = aiVar.getChildCount();
        if (Build.VERSION.SDK_INT >= 29) {
            kiVar.g2.set(i9, i10, i11, i12);
            aiVar.setSystemGestureExclusionRects(kiVar.f2);
        }
        r0.m1 f10 = r0.j0.f(aiVar);
        int i21 = 8;
        int i22 = f10 != null ? f10.a.f(8).d : 0;
        int paddingBottom = aiVar.getPaddingBottom();
        z11 = ((org.telegram.ui.ActionBar.f3) kiVar).keyboardVisible;
        if (!z11) {
            jn jnVar3 = kiVar.i0;
            if (jnVar3 == null || kiVar.u0 != jnVar3 || jnVar3.A == null) {
                jn jnVar4 = kiVar.j0;
                if (jnVar4 == null || kiVar.u0 != jnVar4 || jnVar4.A == null) {
                    if (i22 <= AndroidUtilities.dp(20.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        emojiPadding = kiVar.m1().getEmojiPadding();
                        if (emojiPadding > 0) {
                            paddingBottom += emojiPadding;
                        }
                    }
                    emojiPadding = 0;
                    if (emojiPadding > 0) {
                    }
                } else {
                    if (i22 <= AndroidUtilities.dp(20.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        emojiPadding = kiVar.j0.getEmojiPadding();
                        if (emojiPadding > 0) {
                        }
                    }
                    emojiPadding = 0;
                    if (emojiPadding > 0) {
                    }
                }
            } else {
                if (i22 <= AndroidUtilities.dp(20.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                    emojiPadding = kiVar.i0.getEmojiPadding();
                    if (emojiPadding > 0) {
                    }
                }
                emojiPadding = 0;
                if (emojiPadding > 0) {
                }
            }
        }
        aiVar.setBottomClip(paddingBottom);
        int i23 = 0;
        while (i23 < childCount) {
            View childAt = aiVar.getChildAt(i23);
            if (childAt.getVisibility() != i21) {
                int i24 = AndroidUtilities.statusBarHeight;
                int max2 = i22 == 0 ? Math.max(AndroidUtilities.navigationBarHeight, paddingBottom) : 0;
                if (childAt instanceof ci) {
                    ci ciVar = (ci) childAt;
                    if (ciVar.h) {
                        i24 = 0;
                    }
                    if (ciVar.f) {
                        max2 = 0;
                    }
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight3 = childAt.getMeasuredHeight();
                int i25 = layoutParams.gravity;
                if (i25 == -1) {
                    i25 = 51;
                }
                int i26 = i25 & 112;
                int i27 = i25 & 7;
                if (i27 == 1) {
                    i13 = ((i20 - measuredWidth) / 2) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i27 != 5) {
                    i15 = getPaddingLeft() + layoutParams.leftMargin;
                    if (i26 == 16) {
                        if (i26 == 48) {
                            i18 = layoutParams.topMargin + i24;
                        } else if (i26 != 80) {
                            i18 = layoutParams.topMargin;
                        } else {
                            i16 = ((i12 - max2) - i10) - measuredHeight3;
                            i17 = layoutParams.bottomMargin;
                        }
                        if (childAt != kiVar.T0 || childAt == kiVar.r1) {
                            i18 = 0;
                        }
                        qhVar = kiVar.A0;
                        if ((qhVar == null && qhVar.l(childAt)) || (((thVar = kiVar.L0) != null && thVar.l(childAt)) || (((jnVar = kiVar.i0) != null && childAt == jnVar.A) || ((jnVar2 = kiVar.j0) != null && childAt == jnVar2.A)))) {
                            if (AndroidUtilities.isTablet()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight() + i22;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i18 = measuredHeight - measuredHeight2;
                        } else if (childAt == kiVar.x2) {
                            if (kiVar.Y) {
                                i19 = AndroidUtilities.statusBarHeight;
                                max = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                i18 = i19 + max;
                            }
                        } else if (childAt == kiVar.s1) {
                            i19 = i18 + AndroidUtilities.navigationBarHeight;
                            max = Math.max(i22, kiVar.o1());
                            i18 = i19 + max;
                        }
                        childAt.layout(i15, i18, measuredWidth + i15, i18 + measuredHeight3);
                    } else {
                        i16 = ((((i12 - max2) - i10) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    if (childAt != kiVar.T0) {
                    }
                    i18 = 0;
                    qhVar = kiVar.A0;
                    if (qhVar == null) {
                    }
                    if (childAt == kiVar.x2) {
                    }
                } else {
                    i13 = ((i20 - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                    i14 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingLeft;
                }
                i15 = i13 - i14;
                if (i26 == 16) {
                }
                i18 = i16 - i17;
                if (childAt != kiVar.T0) {
                }
                i18 = 0;
                qhVar = kiVar.A0;
                if (qhVar == null) {
                }
                if (childAt == kiVar.x2) {
                }
            }
            i23++;
            aiVar = this;
            i21 = 8;
        }
        S();
        kiVar.X1(kiVar.u0, 0);
        kiVar.X1(kiVar.v0, 0);
        if (kiVar.Y) {
            kiVar.U1();
        }
        if (chatAttachAlertPhotoLayout == null || (klVar = chatAttachAlertPhotoLayout.A) == null || klVar.getFastScroll() == null) {
            return;
        }
        chatAttachAlertPhotoLayout.A.getFastScroll().d0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.l1 + (kiVar.Y ? (int) (vVar.getAlpha() * vVar.getMeasuredHeight()) : 0);
        chatAttachAlertPhotoLayout.A.getFastScroll().invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        int i13;
        jn jnVar;
        jn jnVar2;
        boolean z10;
        int o12;
        int i14;
        int i15;
        ai aiVar = this;
        ki kiVar = aiVar.x0;
        boolean z11 = kiVar.c0;
        org.telegram.ui.ActionBar.w0 w0Var = kiVar.W0;
        int size = aiVar.getLayoutParams().height > 0 ? aiVar.getLayoutParams().height : View.MeasureSpec.getSize(i10);
        if (!z11) {
            aiVar.u0 = true;
            i14 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingLeft;
            i15 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingLeft;
            aiVar.setPadding(i14, 0, i15, 0);
            aiVar.u0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i9);
        i11 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingLeft;
        int i16 = size2 - (i11 * 2);
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
        ((FrameLayout.LayoutParams) kiVar.b1.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        aiVar.u0 = true;
        int min = (int) (i16 / Math.min(4.5f, kiVar.w1.h()));
        if (kiVar.U1 != min) {
            kiVar.U1 = min;
            AndroidUtilities.runOnUIThread(new fg(aiVar, 21));
        }
        aiVar.u0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size3 = View.MeasureSpec.getSize(i9);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        aiVar.setMeasuredDimension(size3, size4);
        i12 = ((org.telegram.ui.ActionBar.f3) kiVar).backgroundPaddingLeft;
        th thVar = kiVar.L0;
        qh qhVar = kiVar.A0;
        int i17 = size3 - (i12 * 2);
        if (!qhVar.J && AndroidUtilities.dp(20.0f) >= 0 && !qhVar.e && !qhVar.K) {
            aiVar.u0 = true;
            qhVar.j();
            aiVar.u0 = false;
        }
        if (!thVar.J && AndroidUtilities.dp(20.0f) >= 0 && !thVar.e && !thVar.K) {
            aiVar.u0 = true;
            thVar.j();
            aiVar.u0 = false;
        }
        if (kiVar.i0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            jn jnVar3 = kiVar.i0;
            if (!jnVar3.C && !jnVar3.W0 && !jnVar3.b1 && !jnVar3.d1) {
                aiVar.u0 = true;
                jnVar3.Z();
                aiVar.u0 = false;
            }
        }
        if (kiVar.j0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            jn jnVar4 = kiVar.j0;
            if (!jnVar4.C && !jnVar4.W0 && !jnVar4.b1 && !jnVar4.d1) {
                aiVar.u0 = true;
                jnVar4.Z();
                aiVar.u0 = false;
            }
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            z10 = ((org.telegram.ui.ActionBar.f3) kiVar).keyboardVisible;
            if (z10) {
                ci ciVar = kiVar.u0;
                jn jnVar5 = kiVar.i0;
                if (ciVar == jnVar5 && jnVar5.A != null && jnVar5.d1) {
                    o12 = AndroidUtilities.dp(120.0f);
                } else {
                    jn jnVar6 = kiVar.j0;
                    o12 = (ciVar == jnVar6 && jnVar6.A != null && jnVar6.d1) ? AndroidUtilities.dp(120.0f) : 0;
                }
            } else {
                o12 = kiVar.o1();
            }
            r0.m1 f10 = r0.j0.f(aiVar);
            int i18 = f10 != null ? f10.a.f(8).d : 0;
            r0.m1 f11 = r0.j0.f(aiVar);
            Math.max(f11 != null ? f11.a.f(527).d : 0, o12);
            int max = Math.max(i18 > 0 ? 0 : AndroidUtilities.navigationBarHeight, o12);
            aiVar.u0 = true;
            ci ciVar2 = kiVar.u0;
            if (ciVar2.f) {
                ciVar2.e = AndroidUtilities.dp(62.0f) + max;
                kiVar.u0.y(i17, size4);
            } else {
                ciVar2.e = AndroidUtilities.navigationBarHeight;
                ciVar2.y(i17, size4 - o12);
            }
            ci ciVar3 = kiVar.v0;
            if (ciVar3 != null) {
                if (ciVar3.f) {
                    ciVar3.e = AndroidUtilities.dp(62.0f) + max;
                    kiVar.v0.y(i17, size4);
                } else {
                    ciVar3.e = AndroidUtilities.navigationBarHeight;
                    ciVar3.y(i17, size4 - o12);
                }
            }
            aiVar.u0 = false;
        }
        int childCount = aiVar.getChildCount();
        int i19 = 0;
        while (i19 < childCount) {
            int i20 = i19;
            View childAt = aiVar.getChildAt(i20);
            if (childAt == null || childAt.getVisibility() == 8) {
                i13 = i20;
            } else if (childAt == kiVar.r1) {
                i13 = i20;
                aiVar.measureChildWithMargins(childAt, i9, 0, makeMeasureSpec, 0);
            } else {
                i13 = i20;
                int i21 = AndroidUtilities.statusBarHeight;
                int i22 = AndroidUtilities.navigationBarHeight;
                if (childAt instanceof ci) {
                    ci ciVar4 = (ci) childAt;
                    if (ciVar4.h) {
                        i21 = 0;
                    }
                    if (ciVar4.f) {
                        i22 = 0;
                    }
                }
                if (!qhVar.l(childAt) && !thVar.l(childAt) && (((jnVar = kiVar.i0) == null || childAt != jnVar.A) && ((jnVar2 = kiVar.j0) == null || childAt != jnVar2.A))) {
                    measureChildWithMargins(childAt, i9, 0, makeMeasureSpec, i21 + i22);
                } else if (z11) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + size4, TLObject.FLAG_30));
                } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (AndroidUtilities.isTablet()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), getPaddingTop() + (size4 - AndroidUtilities.statusBarHeight)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size4 - AndroidUtilities.statusBarHeight), TLObject.FLAG_30));
                }
            }
            i19 = i13 + 1;
            aiVar = this;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        int i13;
        WindowInsets rootWindowInsets;
        super.onSizeChanged(i9, i10, i11, i12);
        int i14 = 0;
        if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = getRootWindowInsets()) == null) {
            i13 = 0;
        } else {
            RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
            RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
            i13 = roundedCorner == null ? 0 : roundedCorner.getRadius();
            if (roundedCorner2 != null) {
                i14 = roundedCorner2.getRadius();
            }
        }
        kg.d dVar = this.x0.w0;
        if (dVar != null) {
            dVar.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i14, i13);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ki kiVar = this.x0;
        if (kiVar.u0.l(motionEvent)) {
            return true;
        }
        return !kiVar.isDismissed() && super.onTouchEvent(motionEvent);
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
        int i9;
        int i10;
        int i11;
        ViewGroup viewGroup;
        ki kiVar = this.x0;
        mh mhVar = kiVar.t1;
        float f11 = f10 + kiVar.h2;
        i9 = ((org.telegram.ui.ActionBar.f3) kiVar).currentSheetAnimationType;
        if (i9 == 0) {
            this.v0 = f11;
        }
        i10 = ((org.telegram.ui.ActionBar.f3) kiVar).currentSheetAnimationType;
        if (i10 == 1) {
            if (f11 < 0.0f) {
                kiVar.u0.setTranslationY(f11);
                if (kiVar.M0 != 0 || kiVar.P0) {
                    kiVar.e1.setTranslationY((kiVar.l1 + f11) - kiVar.h2);
                }
                mhVar.setTranslationY(0.0f);
                f11 = 0.0f;
            } else {
                kiVar.u0.setTranslationY(0.0f);
                mhVar.setTranslationY(((f11 / this.v0) * mhVar.getMeasuredHeight()) + (-f11));
            }
            viewGroup = ((org.telegram.ui.ActionBar.f3) kiVar).containerView;
            viewGroup.invalidate();
        }
        super.setTranslationY(f11 - kiVar.h2);
        i11 = ((org.telegram.ui.ActionBar.f3) kiVar).currentSheetAnimationType;
        if (i11 != 1) {
            kiVar.u0.k(kiVar.h2);
        }
    }

    @Override // org.telegram.ui.Components.xu0
    public final void J(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
    }
}
