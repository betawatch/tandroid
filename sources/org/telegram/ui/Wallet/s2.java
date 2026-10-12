package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.vi;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class s2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ((x2) this.b).setPendingProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                z4 z4Var = (z4) this.b;
                z4Var.getClass();
                z4Var.x0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                o4 o4Var = (o4) this.b;
                o4Var.getClass();
                o4Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o4Var.invalidate();
                break;
            case 3:
                x4 x4Var = (x4) this.b;
                x4Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x4Var.b.setRotationY(floatValue);
                boolean z10 = floatValue > 90.0f;
                x4Var.c.setVisibility(z10 ? 4 : 0);
                x4Var.d.setVisibility(z10 ? 0 : 4);
                break;
            case 4:
                u5 u5Var = (u5) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s5 s5Var = u5Var.q;
                b6 b6Var = u5Var.i;
                RectF rectF = u5Var.n;
                RectF rectF2 = u5Var.o;
                if (!u5Var.v) {
                    u5Var.e();
                    float interpolation = u5Var.k.getInterpolation(Math.min(1.0f, floatValue2 * 2.0f));
                    vi viVar = u5Var.c;
                    if (viVar != null) {
                        viVar.M1(interpolation);
                    } else {
                        u5Var.b.setTranslationY(r7.getHeight() * interpolation);
                    }
                    if (u5Var.p != null && !rectF2.isEmpty()) {
                        org.telegram.ui.Cells.x0 u82 = u5Var.e.u8(u5Var.f);
                        org.telegram.ui.Cells.x0 x0Var = u5Var.p;
                        if (u82 != x0Var) {
                            x0Var.I0.i(false);
                            u5Var.p = u82;
                        }
                        org.telegram.ui.Cells.x0 x0Var2 = u5Var.p;
                        if (x0Var2 != null && !u5Var.s) {
                            x0Var2.I0.i(true);
                            c3 c3Var = u5Var.p.I0.m;
                            if (c3Var != null && c3Var.isAttachedToWindow()) {
                                rectF2.set(u5Var.c(c3Var));
                                u5Var.r = floatValue2;
                                float max = Math.max(0.0f, Math.min(1.0f, (floatValue2 - 0.25f) / 0.5f));
                                float B = com.google.android.gms.internal.play_billing.k3.B(max, 2.0f, 3.0f, max * max);
                                b6Var.setAlpha((1.0f - B) * u5Var.l);
                                s5Var.setAlpha(B);
                                u5Var.d();
                                float f7 = 1.0f - floatValue2;
                                float centerX = ((rectF2.centerX() - rectF.centerX()) * 0.35f) + rectF.centerX();
                                float min = Math.min(rectF.centerY(), rectF2.centerY()) - AndroidUtilities.dp(150.0f);
                                float f10 = f7 * f7;
                                float f11 = f7 * 2.0f * floatValue2;
                                float f12 = floatValue2 * floatValue2;
                                float centerX2 = (rectF2.centerX() * f12) + (centerX * f11) + (rectF.centerX() * f10);
                                float centerY = (rectF2.centerY() * f12) + (f11 * min) + (rectF.centerY() * f10);
                                u5Var.b(centerX2, centerY, ((rectF2.width() - rectF.width()) * floatValue2) + rectF.width());
                                if (floatValue2 < 0.92f) {
                                    u5Var.j.g(centerX2, centerY);
                                }
                                u5Var.h.invalidate();
                                break;
                            } else {
                                rectF2.setEmpty();
                                b6Var.setAlpha(0.0f);
                                s5Var.setAlpha(0.0f);
                                break;
                            }
                        } else {
                            rectF2.setEmpty();
                            b6Var.setAlpha(0.0f);
                            s5Var.setAlpha(0.0f);
                            break;
                        }
                    }
                }
                break;
            case 5:
                b6 b6Var2 = (b6) this.b;
                b6Var2.getClass();
                b6Var2.i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b6Var2.e();
                break;
            case 6:
                l7 l7Var = (l7) this.b;
                l7Var.getClass();
                l7Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l7Var.invalidate();
                break;
            case 7:
                i8 i8Var = (i8) this.b;
                i8Var.getClass();
                i8Var.s0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 8:
                h8 h8Var = (h8) this.b;
                h8Var.getClass();
                h8Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h8Var.c();
                break;
            default:
                w8 w8Var = (w8) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = w8Var.n;
                RectF rectF4 = w8Var.o;
                if (!w8Var.s) {
                    w8Var.e();
                    float interpolation2 = w8Var.k.getInterpolation(Math.min(1.0f, floatValue3 * 2.0f));
                    vi viVar2 = w8Var.a;
                    if (viVar2 != null) {
                        viVar2.M1(interpolation2);
                    } else {
                        w8Var.c.setTranslationY(r5.getHeight() * interpolation2);
                    }
                    if (w8Var.p != null && !rectF4.isEmpty()) {
                        b6 pendingDiamond = w8Var.p.getPendingDiamond();
                        if (pendingDiamond != null) {
                            x2 x2Var = w8Var.p;
                            TL_wallet.walletTransaction wallettransaction = w8Var.f;
                            TL_wallet.walletTransaction wallettransaction2 = x2Var.R;
                            if (wallettransaction2 != null && v2.a(wallettransaction2, wallettransaction) && pendingDiamond.isAttachedToWindow()) {
                                rectF4.set(w8Var.d(pendingDiamond));
                            }
                        }
                        float f13 = 1.0f - floatValue3;
                        float centerX3 = ((rectF4.centerX() - rectF3.centerX()) * 0.35f) + rectF3.centerX();
                        float min2 = Math.min(rectF3.centerY(), rectF4.centerY()) - AndroidUtilities.dp(150.0f);
                        float f14 = f13 * f13;
                        float f15 = f13 * 2.0f * floatValue3;
                        float f16 = floatValue3 * floatValue3;
                        float centerX4 = (rectF4.centerX() * f16) + (centerX3 * f15) + (rectF3.centerX() * f14);
                        float centerY2 = (rectF4.centerY() * f16) + (f15 * min2) + (rectF3.centerY() * f14);
                        w8Var.c(centerX4, centerY2, ((rectF4.width() - rectF3.width()) * floatValue3) + rectF3.width());
                        if (floatValue3 < 0.92f) {
                            w8Var.j.g(centerX4, centerY2);
                        }
                        w8Var.h.invalidate();
                        break;
                    }
                }
                break;
        }
    }
}
