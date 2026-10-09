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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class oi extends sw0 {
    public final ni A0;
    public final /* synthetic */ yi B0;
    public int w0;
    public final RectF x0;
    public boolean y0;
    public float z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi(yi yiVar, Context context) {
        super(context, null);
        this.B0 = yiVar;
        this.x0 = new RectF();
        this.A0 = new ni(this, this);
    }

    @Override // org.telegram.ui.Components.sw0, android.view.ViewGroup, android.view.View
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
        qi qiVar;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        yi yiVar = this.B0;
        fh.d dVar = yiVar.H2;
        fh.d dVar2 = yiVar.G2;
        if (Build.VERSION.SDK_INT >= 31 && yiVar.F2 != null) {
            yiVar.b1();
            if (dVar2 != null) {
                viewGroup3 = ((org.telegram.ui.ActionBar.f3) yiVar).containerView;
                int measuredWidth = viewGroup3.getMeasuredWidth();
                viewGroup4 = ((org.telegram.ui.ActionBar.f3) yiVar).containerView;
                dVar2.i(measuredWidth, viewGroup4.getMeasuredHeight());
                dVar2.k();
            }
            if (dVar != null) {
                viewGroup = ((org.telegram.ui.ActionBar.f3) yiVar).containerView;
                int measuredWidth2 = viewGroup.getMeasuredWidth();
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) yiVar).containerView;
                dVar.i(measuredWidth2, viewGroup2.getMeasuredHeight());
                dVar.k();
            }
        }
        canvas.save();
        qi qiVar2 = yiVar.B0;
        hn hnVar = yiVar.q0;
        if ((qiVar2 == hnVar || (qiVar = yiVar.C0) == hnVar || (qiVar2 == yiVar.j0 && qiVar == null)) && qiVar2 != null) {
            canvas.save();
            float f13 = yiVar.o2;
            boolean z10 = yiVar.g0;
            ci.m6 m6Var = yiVar.R0;
            ai aiVar = yiVar.l1;
            canvas.translate(0.0f, f13);
            int alpha2 = (int) (qiVar2.getAlpha() * 255.0f);
            int i25 = qiVar2.i();
            int dp3 = AndroidUtilities.dp(13.0f) + ((int) ((aiVar != null ? aiVar.getAlpha() : 0.0f) * AndroidUtilities.dp(26.0f))) + ((int) (m6Var != null ? m6Var.getAlpha() * m6Var.getMeasuredHeight() : 0.0f));
            int r12 = yiVar.r1(0);
            i10 = ((org.telegram.ui.ActionBar.f3) yiVar).backgroundPaddingTop;
            int i26 = (r12 - i10) - dp3;
            i11 = ((org.telegram.ui.ActionBar.f3) yiVar).currentSheetAnimationType;
            if (i11 == 1 || yiVar.w1 != null) {
                i26 = (int) (qiVar2.getTranslationY() + i26);
            }
            int dp4 = AndroidUtilities.dp(20.0f) + i26;
            getMeasuredHeight();
            AndroidUtilities.dp(45.0f);
            int currentActionBarHeight = i25 != 0 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : ((org.telegram.ui.ActionBar.f3) yiVar).backgroundPaddingTop;
            float f14 = 1.0f;
            if (i25 != 2) {
                float f15 = dp3;
                f7 = 0.0f;
                if (qiVar2 == yiVar.o0) {
                    dp = AndroidUtilities.dp(11.0f);
                } else {
                    if (qiVar2 == yiVar.m0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else if (qiVar2 == yiVar.n0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else {
                        dp = AndroidUtilities.dp(4.0f);
                    }
                    f10 = f15 - dp2;
                    float alpha3 = yiVar.a1.getAlpha();
                    int i27 = (int) (((currentActionBarHeight - f10) + AndroidUtilities.statusBarHeight) * alpha3);
                    i26 -= i27;
                    dp4 -= i27;
                    f11 = 1.0f - alpha3;
                }
                f10 = f15 + dp;
                float alpha32 = yiVar.a1.getAlpha();
                int i272 = (int) (((currentActionBarHeight - f10) + AndroidUtilities.statusBarHeight) * alpha32);
                i26 -= i272;
                dp4 -= i272;
                f11 = 1.0f - alpha32;
            } else if (i26 < currentActionBarHeight) {
                float f16 = currentActionBarHeight - i26;
                i24 = ((org.telegram.ui.ActionBar.f3) yiVar).backgroundPaddingTop;
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
            int customBackground = yiVar.B0.g() ? yiVar.B0.getCustomBackground() : yiVar.s1(true);
            drawable = ((org.telegram.ui.ActionBar.f3) yiVar).shadowDrawable;
            drawable.setAlpha(alpha2);
            drawable2 = ((org.telegram.ui.ActionBar.f3) yiVar).shadowDrawable;
            int measuredWidth3 = getMeasuredWidth();
            int dp5 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
            i12 = ((org.telegram.ui.ActionBar.f3) yiVar).backgroundPaddingTop;
            drawable2.setBounds(0, i26, measuredWidth3, i12 + dp5);
            drawable3 = ((org.telegram.ui.ActionBar.f3) yiVar).shadowDrawable;
            drawable3.draw(canvas);
            RectF rectF = this.x0;
            if (i25 == 2) {
                org.telegram.ui.ActionBar.i6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.i6.t0.setAlpha(alpha2);
                i20 = ((org.telegram.ui.ActionBar.f3) yiVar).backgroundPaddingLeft;
                i21 = ((org.telegram.ui.ActionBar.f3) yiVar).backgroundPaddingTop;
                f12 = 24.0f;
                float f17 = i21 + i26;
                int measuredWidth4 = getMeasuredWidth();
                i22 = ((org.telegram.ui.ActionBar.f3) yiVar).backgroundPaddingLeft;
                float f18 = measuredWidth4 - i22;
                i23 = ((org.telegram.ui.ActionBar.f3) yiVar).backgroundPaddingTop;
                rectF.set(i20, f17, f18, AndroidUtilities.dp(24.0f) + i23 + i26);
            } else {
                f12 = 24.0f;
            }
            if ((f11 != 1.0f && i25 != 2) || yiVar.B0.f()) {
                Paint paint = org.telegram.ui.ActionBar.i6.t0;
                if (yiVar.B0.f()) {
                    customBackground = yiVar.B0.getCustomActionBarBackground();
                }
                paint.setColor(customBackground);
                org.telegram.ui.ActionBar.i6.t0.setAlpha(alpha2);
                i16 = ((org.telegram.ui.ActionBar.f3) yiVar).backgroundPaddingLeft;
                i17 = ((org.telegram.ui.ActionBar.f3) yiVar).backgroundPaddingTop;
                int measuredWidth5 = getMeasuredWidth();
                i18 = ((org.telegram.ui.ActionBar.f3) yiVar).backgroundPaddingLeft;
                float f19 = measuredWidth5 - i18;
                i19 = ((org.telegram.ui.ActionBar.f3) yiVar).backgroundPaddingTop;
                rectF.set(i16, i17 + i26, f19, AndroidUtilities.dp(f12) + i19 + i26);
            }
            if (yiVar.B0.f()) {
                org.telegram.ui.ActionBar.i6.t0.setColor(yiVar.B0.getCustomActionBarBackground());
                org.telegram.ui.ActionBar.i6.t0.setAlpha(alpha2);
                int r13 = yiVar.r1(0);
                if (!z10) {
                    r13 += AndroidUtilities.statusBarHeight;
                }
                i13 = ((org.telegram.ui.ActionBar.f3) yiVar).backgroundPaddingLeft;
                i14 = ((org.telegram.ui.ActionBar.f3) yiVar).backgroundPaddingTop;
                float dp6 = (AndroidUtilities.dp(12.0f) + i14 + i26) * f11;
                int measuredWidth6 = getMeasuredWidth();
                i15 = ((org.telegram.ui.ActionBar.f3) yiVar).backgroundPaddingLeft;
                rectF.set(i13, dp6, measuredWidth6 - i15, AndroidUtilities.dp(12.0f) + r13);
                canvas.save();
                canvas.drawRect(rectF, org.telegram.ui.ActionBar.i6.t0);
                canvas.restore();
            }
            if ((aiVar == null || aiVar.getAlpha() != 1.0f) && f11 != f7) {
                int dp7 = AndroidUtilities.dp(36.0f);
                rectF.set((getMeasuredWidth() - dp7) / 2, dp4, (getMeasuredWidth() + dp7) / 2, AndroidUtilities.dp(4.0f) + dp4);
                if (i25 == 2) {
                    themedColor = TLObject.FLAG_29;
                    f14 = f11;
                } else if (yiVar.B0.f()) {
                    int customActionBarBackground = yiVar.B0.getCustomActionBarBackground();
                    themedColor = i0.a.d(0.5f, customActionBarBackground, i0.a.f(customActionBarBackground) < 0.5d ? -1 : -16777216);
                    if (aiVar != null) {
                        alpha = aiVar.getAlpha();
                        f14 = 1.0f - alpha;
                    }
                } else {
                    themedColor = yiVar.getThemedColor(org.telegram.ui.ActionBar.i6.Ii);
                    if (aiVar != null) {
                        alpha = aiVar.getAlpha();
                        f14 = 1.0f - alpha;
                    }
                }
                int alpha4 = Color.alpha(themedColor);
                org.telegram.ui.ActionBar.i6.t0.setColor(themedColor);
                org.telegram.ui.ActionBar.i6.t0.setAlpha((int) (qiVar2.getAlpha() * alpha4 * f14 * f11));
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
        qi qiVar;
        int i26;
        yi yiVar = this.B0;
        boolean z10 = yiVar.g0;
        ci.m6 m6Var = yiVar.R0;
        ch.d dVar = yiVar.D0;
        ai aiVar = yiVar.l1;
        a8 a8Var = yiVar.a1;
        if (!(view instanceof qi) || view.getAlpha() <= 0.0f) {
            if (view != a8Var) {
                if (!(view instanceof a00) || dVar == null) {
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
            float alpha2 = a8Var.getAlpha();
            if (alpha2 <= 0.0f) {
                return false;
            }
            if (alpha2 >= 1.0f) {
                return super.drawChild(canvas, view, j3);
            }
            canvas.save();
            float x10 = a8Var.getX();
            qi qiVar2 = yiVar.B0;
            if (qiVar2 != null) {
                int i27 = qiVar2.i();
                int dp5 = AndroidUtilities.dp(13.0f) + ((int) ((aiVar != null ? aiVar.getAlpha() : 0.0f) * AndroidUtilities.dp(26.0f))) + ((int) (m6Var != null ? m6Var.getAlpha() * m6Var.getMeasuredHeight() : 0.0f));
                int r12 = yiVar.r1(0);
                i10 = ((org.telegram.ui.ActionBar.f3) yiVar).backgroundPaddingTop;
                int i28 = (r12 - i10) - dp5;
                i11 = ((org.telegram.ui.ActionBar.f3) yiVar).currentSheetAnimationType;
                if (i11 == 1 || yiVar.w1 != null) {
                    i28 = (int) (qiVar2.getTranslationY() + i28);
                }
                int dp6 = AndroidUtilities.dp(20.0f) + i28;
                int currentActionBarHeight = i27 != 0 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : ((org.telegram.ui.ActionBar.f3) yiVar).backgroundPaddingTop;
                if (i27 != 2) {
                    i12 = ((org.telegram.ui.ActionBar.f3) yiVar).backgroundPaddingTop;
                    if (i12 + i28 < currentActionBarHeight) {
                        float f14 = dp5;
                        if (qiVar2 == yiVar.o0) {
                            dp = AndroidUtilities.dp(11.0f);
                        } else {
                            if (qiVar2 == yiVar.m0) {
                                dp2 = AndroidUtilities.dp(3.0f);
                            } else if (qiVar2 == yiVar.n0) {
                                dp2 = AndroidUtilities.dp(3.0f);
                            } else {
                                dp = AndroidUtilities.dp(4.0f);
                            }
                            f10 = f14 - dp2;
                            dp6 -= (int) (a8Var.getAlpha() * ((currentActionBarHeight - f10) + AndroidUtilities.statusBarHeight));
                        }
                        f10 = f14 + dp;
                        dp6 -= (int) (a8Var.getAlpha() * ((currentActionBarHeight - f10) + AndroidUtilities.statusBarHeight));
                    }
                }
                if (!z10) {
                    dp6 += AndroidUtilities.statusBarHeight;
                }
                f7 = dp6;
            } else {
                f7 = 0.0f;
            }
            canvas.clipRect(x10, f7, a8Var.getX() + a8Var.getWidth(), a8Var.getY() + a8Var.getHeight());
            boolean drawChild3 = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild3;
        }
        canvas.save();
        canvas.translate(0.0f, yiVar.o2);
        int alpha3 = (int) (view.getAlpha() * 255.0f);
        qi qiVar3 = (qi) view;
        int i29 = qiVar3.i();
        int dp7 = AndroidUtilities.dp(13.0f) + (aiVar != null ? AndroidUtilities.dp(aiVar.getAlpha() * 26.0f) : 0) + ((int) (m6Var != null ? m6Var.getAlpha() * m6Var.getMeasuredHeight() : 0.0f));
        int r13 = yiVar.r1(qiVar3 == yiVar.B0 ? 0 : 1);
        i13 = ((org.telegram.ui.ActionBar.f3) yiVar).backgroundPaddingTop;
        int i30 = (r13 - i13) - dp7;
        i14 = ((org.telegram.ui.ActionBar.f3) yiVar).currentSheetAnimationType;
        if (i14 == 1 || yiVar.w1 != null) {
            i30 = (int) (view.getTranslationY() + i30);
        }
        int dp8 = AndroidUtilities.dp(20.0f) + i30;
        int dp9 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
        i15 = ((org.telegram.ui.ActionBar.f3) yiVar).backgroundPaddingTop;
        int i31 = i15 + dp9;
        int currentActionBarHeight2 = i29 != 0 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : ((org.telegram.ui.ActionBar.f3) yiVar).backgroundPaddingTop;
        if (i29 != 2) {
            i16 = ((org.telegram.ui.ActionBar.f3) yiVar).backgroundPaddingTop;
            f11 = 0.0f;
            if (i16 + i30 < currentActionBarHeight2) {
                float f15 = dp7;
                if (qiVar3 == yiVar.o0) {
                    dp3 = AndroidUtilities.dp(11.0f);
                } else {
                    if (qiVar3 == yiVar.m0) {
                        dp4 = AndroidUtilities.dp(3.0f);
                    } else if (qiVar3 == yiVar.n0) {
                        dp4 = AndroidUtilities.dp(3.0f);
                    } else {
                        dp3 = AndroidUtilities.dp(4.0f);
                    }
                    f12 = f15 - dp4;
                    i17 = ((org.telegram.ui.ActionBar.f3) yiVar).backgroundPaddingTop;
                    float min = Math.min(1.0f, ((currentActionBarHeight2 - i30) - i17) / f12);
                    int i32 = (int) ((currentActionBarHeight2 - f12) * min);
                    i30 -= i32;
                    dp8 -= i32;
                    i31 += i32;
                    f13 = 1.0f - min;
                }
                f12 = f15 + dp3;
                i17 = ((org.telegram.ui.ActionBar.f3) yiVar).backgroundPaddingTop;
                float min2 = Math.min(1.0f, ((currentActionBarHeight2 - i30) - i17) / f12);
                int i322 = (int) ((currentActionBarHeight2 - f12) * min2);
                i30 -= i322;
                dp8 -= i322;
                i31 += i322;
                f13 = 1.0f - min2;
            }
            f13 = 1.0f;
        } else if (i30 < currentActionBarHeight2) {
            i26 = ((org.telegram.ui.ActionBar.f3) yiVar).backgroundPaddingTop;
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
        int customBackground = yiVar.B0.g() ? yiVar.B0.getCustomBackground() : yiVar.s1(true);
        qi qiVar4 = yiVar.B0;
        hn hnVar = yiVar.q0;
        boolean z11 = (qiVar4 == hnVar || (qiVar = yiVar.C0) == hnVar || (qiVar4 == yiVar.j0 && qiVar == null)) ? false : true;
        RectF rectF = this.x0;
        if (z11) {
            drawable = ((org.telegram.ui.ActionBar.f3) yiVar).shadowDrawable;
            drawable.setAlpha(alpha3);
            drawable2 = ((org.telegram.ui.ActionBar.f3) yiVar).shadowDrawable;
            drawable2.setBounds(0, i30, getMeasuredWidth(), i34);
            drawable3 = ((org.telegram.ui.ActionBar.f3) yiVar).shadowDrawable;
            drawable3.draw(canvas);
            if (i29 == 2) {
                org.telegram.ui.ActionBar.i6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.i6.t0.setAlpha(alpha3);
                i22 = ((org.telegram.ui.ActionBar.f3) yiVar).backgroundPaddingLeft;
                i23 = ((org.telegram.ui.ActionBar.f3) yiVar).backgroundPaddingTop;
                int measuredWidth = getMeasuredWidth();
                i24 = ((org.telegram.ui.ActionBar.f3) yiVar).backgroundPaddingLeft;
                float f16 = measuredWidth - i24;
                i25 = ((org.telegram.ui.ActionBar.f3) yiVar).backgroundPaddingTop;
                rectF.set(i22, i23 + i30, f16, AndroidUtilities.dp(24.0f) + i25 + i30);
            }
        }
        if (view == yiVar.k0 || view == yiVar.s0 || view == yiVar.l0) {
            drawChild = super.drawChild(canvas, view, j3);
        } else {
            canvas.save();
            drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
        }
        if (z11) {
            if (f13 != 1.0f && i29 != 2) {
                org.telegram.ui.ActionBar.i6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.i6.t0.setAlpha(alpha3);
                i18 = ((org.telegram.ui.ActionBar.f3) yiVar).backgroundPaddingLeft;
                i19 = ((org.telegram.ui.ActionBar.f3) yiVar).backgroundPaddingTop;
                int measuredWidth2 = getMeasuredWidth();
                i20 = ((org.telegram.ui.ActionBar.f3) yiVar).backgroundPaddingLeft;
                float f17 = measuredWidth2 - i20;
                i21 = ((org.telegram.ui.ActionBar.f3) yiVar).backgroundPaddingTop;
                rectF.set(i18, i19 + i30, f17, AndroidUtilities.dp(24.0f) + i21 + i30);
            }
            if ((aiVar == null || aiVar.getAlpha() != 1.0f) && f13 != f11) {
                int dp10 = AndroidUtilities.dp(36.0f);
                rectF.set((getMeasuredWidth() - dp10) / 2, dp8, (getMeasuredWidth() + dp10) / 2, AndroidUtilities.dp(4.0f) + dp8);
                if (i29 == 2) {
                    themedColor = TLObject.FLAG_29;
                    alpha = f13;
                } else {
                    themedColor = yiVar.getThemedColor(org.telegram.ui.ActionBar.i6.Ii);
                    alpha = aiVar == null ? 1.0f : 1.0f - aiVar.getAlpha();
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

    @Override // org.telegram.ui.Components.sw0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ni niVar = this.A0;
        niVar.b = this;
        niVar.c();
        yi yiVar = this.B0;
        yiVar.H0.setAdjustPanLayoutHelper(niVar);
        yiVar.S0.setAdjustPanLayoutHelper(niVar);
    }

    @Override // org.telegram.ui.Components.sw0, android.view.ViewGroup, android.view.View
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
        yi yiVar = this.B0;
        int[] iArr = yiVar.e2;
        if (yiVar.B0.o(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            if (iArr[0] != 0) {
                float y3 = motionEvent.getY();
                ci.m6 m6Var = yiVar.R0;
                int i11 = iArr[0];
                i10 = ((org.telegram.ui.ActionBar.f3) yiVar).backgroundPaddingTop;
                int i12 = i11 - (i10 * 2);
                int dp = AndroidUtilities.dp(13.0f);
                ai aiVar = yiVar.l1;
                int dp2 = AndroidUtilities.dp(20.0f) + ((i12 - (dp + (aiVar != null ? AndroidUtilities.dp(aiVar.getAlpha() * 26.0f) : 0))) - ((int) (m6Var != null ? m6Var.getAlpha() * m6Var.getMeasuredHeight() : 0.0f)));
                if (!yiVar.g0) {
                    dp2 += AndroidUtilities.statusBarHeight;
                }
                if (y3 < dp2 && yiVar.a1.getAlpha() == 0.0f) {
                    yiVar.onDismissWithTouchOutside();
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
    @Override // org.telegram.ui.Components.sw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        km kmVar;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        di diVar;
        gi giVar;
        lo loVar;
        lo loVar2;
        int i20;
        int max;
        int measuredHeight;
        int measuredHeight2;
        int emojiPadding;
        oi oiVar = this;
        yi yiVar = oiVar.B0;
        ci.m6 m6Var = yiVar.R0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = yiVar.j0;
        int i21 = i12 - i10;
        if (oiVar.w0 != i21) {
            oiVar.w0 = i21;
            pf pfVar = yiVar.h0;
            if (pfVar != null && !pfVar.q0) {
                pfVar.dismiss();
            }
        }
        int childCount = oiVar.getChildCount();
        if (Build.VERSION.SDK_INT >= 29) {
            yiVar.n2.set(i10, i11, i12, i13);
            oiVar.setSystemGestureExclusionRects(yiVar.m2);
        }
        WeakHashMap weakHashMap = r0.i0.a;
        r0.k1 a2 = r0.b0.a(oiVar);
        int i22 = 8;
        int i23 = a2 != null ? a2.a.f(8).d : 0;
        int paddingBottom = oiVar.getPaddingBottom();
        z11 = ((org.telegram.ui.ActionBar.f3) yiVar).keyboardVisible;
        if (!z11) {
            lo loVar3 = yiVar.m0;
            if (loVar3 == null || yiVar.B0 != loVar3 || loVar3.E == null) {
                lo loVar4 = yiVar.n0;
                if (loVar4 == null || yiVar.B0 != loVar4 || loVar4.E == null) {
                    if (i23 <= AndroidUtilities.dp(20.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        emojiPadding = yiVar.o1().getEmojiPadding();
                        if (emojiPadding > 0) {
                            paddingBottom += emojiPadding;
                        }
                    }
                    emojiPadding = 0;
                    if (emojiPadding > 0) {
                    }
                } else {
                    if (i23 <= AndroidUtilities.dp(20.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        emojiPadding = yiVar.n0.getEmojiPadding();
                        if (emojiPadding > 0) {
                        }
                    }
                    emojiPadding = 0;
                    if (emojiPadding > 0) {
                    }
                }
            } else {
                if (i23 <= AndroidUtilities.dp(20.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                    emojiPadding = yiVar.m0.getEmojiPadding();
                    if (emojiPadding > 0) {
                    }
                }
                emojiPadding = 0;
                if (emojiPadding > 0) {
                }
            }
        }
        oiVar.setBottomClip(paddingBottom);
        int i24 = 0;
        while (i24 < childCount) {
            View childAt = oiVar.getChildAt(i24);
            if (childAt.getVisibility() != i22) {
                int i25 = AndroidUtilities.statusBarHeight;
                int max2 = i23 == 0 ? Math.max(AndroidUtilities.navigationBarHeight, paddingBottom) : 0;
                if (childAt instanceof qi) {
                    qi qiVar = (qi) childAt;
                    if (qiVar.h) {
                        i25 = 0;
                    }
                    if (qiVar.f) {
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
                        if (childAt != yiVar.a1 || childAt == yiVar.y1) {
                            i19 = 0;
                        }
                        diVar = yiVar.H0;
                        if ((diVar == null && diVar.l(childAt)) || (((giVar = yiVar.S0) != null && giVar.l(childAt)) || (((loVar = yiVar.m0) != null && childAt == loVar.E) || ((loVar2 = yiVar.n0) != null && childAt == loVar2.E)))) {
                            if (AndroidUtilities.isTablet()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight() + i23;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i19 = measuredHeight - measuredHeight2;
                        } else if (childAt == yiVar.E2) {
                            if (yiVar.c0) {
                                i20 = AndroidUtilities.statusBarHeight;
                                max = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                i19 = i20 + max;
                            }
                        } else if (childAt == yiVar.z1) {
                            i20 = i19 + AndroidUtilities.navigationBarHeight;
                            max = Math.max(i23, yiVar.q1());
                            i19 = i20 + max;
                        }
                        childAt.layout(i16, i19, measuredWidth + i16, i19 + measuredHeight3);
                    } else {
                        i17 = ((((i13 - max2) - i11) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    if (childAt != yiVar.a1) {
                    }
                    i19 = 0;
                    diVar = yiVar.H0;
                    if (diVar == null) {
                    }
                    if (childAt == yiVar.E2) {
                    }
                } else {
                    i14 = ((i21 - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                    i15 = ((org.telegram.ui.ActionBar.f3) yiVar).backgroundPaddingLeft;
                }
                i16 = i14 - i15;
                if (i27 == 16) {
                }
                i19 = i17 - i18;
                if (childAt != yiVar.a1) {
                }
                i19 = 0;
                diVar = yiVar.H0;
                if (diVar == null) {
                }
                if (childAt == yiVar.E2) {
                }
            }
            i24++;
            oiVar = this;
            i22 = 8;
        }
        S();
        yiVar.b2(yiVar.B0, 0);
        yiVar.b2(yiVar.C0, 0);
        if (yiVar.c0) {
            yiVar.Y1();
        }
        if (chatAttachAlertPhotoLayout == null || (kmVar = chatAttachAlertPhotoLayout.E) == null || kmVar.getFastScroll() == null) {
            return;
        }
        chatAttachAlertPhotoLayout.E.getFastScroll().h0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.p1 + (yiVar.c0 ? (int) (m6Var.getAlpha() * m6Var.getMeasuredHeight()) : 0);
        chatAttachAlertPhotoLayout.E.getFastScroll().invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        lo loVar;
        lo loVar2;
        boolean z10;
        int q12;
        int i15;
        int i16;
        oi oiVar = this;
        yi yiVar = oiVar.B0;
        boolean z11 = yiVar.g0;
        org.telegram.ui.ActionBar.v0 v0Var = yiVar.d1;
        int size = oiVar.getLayoutParams().height > 0 ? oiVar.getLayoutParams().height : View.MeasureSpec.getSize(i11);
        if (!z11) {
            oiVar.y0 = true;
            i15 = ((org.telegram.ui.ActionBar.f3) yiVar).backgroundPaddingLeft;
            i16 = ((org.telegram.ui.ActionBar.f3) yiVar).backgroundPaddingLeft;
            oiVar.setPadding(i15, 0, i16, 0);
            oiVar.y0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        i12 = ((org.telegram.ui.ActionBar.f3) yiVar).backgroundPaddingLeft;
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
        ((FrameLayout.LayoutParams) yiVar.i1.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        oiVar.y0 = true;
        int min = (int) (i17 / Math.min(4.5f, yiVar.D1.h()));
        if (yiVar.b2 != min) {
            yiVar.b2 = min;
            AndroidUtilities.runOnUIThread(new rg(oiVar, 21));
        }
        oiVar.y0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        oiVar.setMeasuredDimension(size3, size4);
        i13 = ((org.telegram.ui.ActionBar.f3) yiVar).backgroundPaddingLeft;
        gi giVar = yiVar.S0;
        di diVar = yiVar.H0;
        int i18 = size3 - (i13 * 2);
        if (!diVar.N && AndroidUtilities.dp(20.0f) >= 0 && !diVar.e && !diVar.O) {
            oiVar.y0 = true;
            diVar.j();
            oiVar.y0 = false;
        }
        if (!giVar.N && AndroidUtilities.dp(20.0f) >= 0 && !giVar.e && !giVar.O) {
            oiVar.y0 = true;
            giVar.j();
            oiVar.y0 = false;
        }
        if (yiVar.m0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            lo loVar3 = yiVar.m0;
            if (!loVar3.G && !loVar3.a1 && !loVar3.f1 && !loVar3.h1) {
                oiVar.y0 = true;
                loVar3.d0();
                oiVar.y0 = false;
            }
        }
        if (yiVar.n0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            lo loVar4 = yiVar.n0;
            if (!loVar4.G && !loVar4.a1 && !loVar4.f1 && !loVar4.h1) {
                oiVar.y0 = true;
                loVar4.d0();
                oiVar.y0 = false;
            }
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            z10 = ((org.telegram.ui.ActionBar.f3) yiVar).keyboardVisible;
            if (z10) {
                qi qiVar = yiVar.B0;
                lo loVar5 = yiVar.m0;
                if (qiVar == loVar5 && loVar5.E != null && loVar5.h1) {
                    q12 = AndroidUtilities.dp(120.0f);
                } else {
                    lo loVar6 = yiVar.n0;
                    q12 = (qiVar == loVar6 && loVar6.E != null && loVar6.h1) ? AndroidUtilities.dp(120.0f) : 0;
                }
            } else {
                q12 = yiVar.q1();
            }
            WeakHashMap weakHashMap = r0.i0.a;
            r0.k1 a2 = r0.b0.a(oiVar);
            int i19 = a2 != null ? a2.a.f(8).d : 0;
            r0.k1 a10 = r0.b0.a(oiVar);
            Math.max(a10 != null ? a10.a.f(527).d : 0, q12);
            int max = Math.max(i19 > 0 ? 0 : AndroidUtilities.navigationBarHeight, q12);
            oiVar.y0 = true;
            qi qiVar2 = yiVar.B0;
            if (qiVar2.f) {
                qiVar2.e = AndroidUtilities.dp(62.0f) + max;
                yiVar.B0.C(i18, size4);
            } else {
                qiVar2.e = AndroidUtilities.navigationBarHeight;
                qiVar2.C(i18, size4 - q12);
            }
            qi qiVar3 = yiVar.C0;
            if (qiVar3 != null) {
                if (qiVar3.f) {
                    qiVar3.e = AndroidUtilities.dp(62.0f) + max;
                    yiVar.C0.C(i18, size4);
                } else {
                    qiVar3.e = AndroidUtilities.navigationBarHeight;
                    qiVar3.C(i18, size4 - q12);
                }
            }
            oiVar.y0 = false;
        }
        int childCount = oiVar.getChildCount();
        int i20 = 0;
        while (i20 < childCount) {
            int i21 = i20;
            View childAt = oiVar.getChildAt(i21);
            if (childAt == null || childAt.getVisibility() == 8) {
                i14 = i21;
            } else if (childAt == yiVar.y1) {
                i14 = i21;
                oiVar.measureChildWithMargins(childAt, i10, 0, makeMeasureSpec, 0);
            } else {
                i14 = i21;
                int i22 = AndroidUtilities.statusBarHeight;
                int i23 = AndroidUtilities.navigationBarHeight;
                if (childAt instanceof qi) {
                    qi qiVar4 = (qi) childAt;
                    if (qiVar4.h) {
                        i22 = 0;
                    }
                    if (qiVar4.f) {
                        i23 = 0;
                    }
                }
                if (!diVar.l(childAt) && !giVar.l(childAt) && (((loVar = yiVar.m0) == null || childAt != loVar.E) && ((loVar2 = yiVar.n0) == null || childAt != loVar2.E))) {
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
            oiVar = this;
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
        ch.d dVar = this.B0.D0;
        if (dVar != null) {
            dVar.s(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i15, i14);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        yi yiVar = this.B0;
        if (yiVar.B0.o(motionEvent)) {
            return true;
        }
        return !yiVar.isDismissed() && super.onTouchEvent(motionEvent);
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
        yi yiVar = this.B0;
        ai aiVar = yiVar.A1;
        float f10 = f7 + yiVar.o2;
        i10 = ((org.telegram.ui.ActionBar.f3) yiVar).currentSheetAnimationType;
        if (i10 == 0) {
            this.z0 = f10;
        }
        i11 = ((org.telegram.ui.ActionBar.f3) yiVar).currentSheetAnimationType;
        if (i11 == 1) {
            if (f10 < 0.0f) {
                yiVar.B0.setTranslationY(f10);
                if (yiVar.T0 != 0 || yiVar.W0) {
                    yiVar.l1.setTranslationY((yiVar.s1 + f10) - yiVar.o2);
                }
                aiVar.setTranslationY(0.0f);
                f10 = 0.0f;
            } else {
                yiVar.B0.setTranslationY(0.0f);
                aiVar.setTranslationY(((f10 / this.z0) * aiVar.getMeasuredHeight()) + (-f10));
            }
            viewGroup = ((org.telegram.ui.ActionBar.f3) yiVar).containerView;
            viewGroup.invalidate();
        }
        super.setTranslationY((f10 - yiVar.o2) + yiVar.y0);
        i12 = ((org.telegram.ui.ActionBar.f3) yiVar).currentSheetAnimationType;
        if (i12 != 1) {
            yiVar.B0.l(yiVar.o2);
        }
    }

    @Override // org.telegram.ui.Components.sw0
    public final void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
    }
}
