package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.vi;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ((y2) this.b).setPendingProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                a5 a5Var = (a5) this.b;
                a5Var.getClass();
                a5Var.x0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                p4 p4Var = (p4) this.b;
                p4Var.getClass();
                p4Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p4Var.invalidate();
                break;
            case 3:
                y4 y4Var = (y4) this.b;
                y4Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y4Var.b.setRotationY(floatValue);
                boolean z10 = floatValue > 90.0f;
                y4Var.c.setVisibility(z10 ? 4 : 0);
                y4Var.d.setVisibility(z10 ? 0 : 4);
                break;
            case 4:
                v5 v5Var = (v5) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t5 t5Var = v5Var.q;
                c6 c6Var = v5Var.i;
                RectF rectF = v5Var.n;
                RectF rectF2 = v5Var.o;
                if (!v5Var.v) {
                    v5Var.e();
                    float interpolation = v5Var.k.getInterpolation(Math.min(1.0f, floatValue2 * 2.0f));
                    vi viVar = v5Var.c;
                    if (viVar != null) {
                        viVar.M1(interpolation);
                    } else {
                        v5Var.b.setTranslationY(r7.getHeight() * interpolation);
                    }
                    if (v5Var.p != null && !rectF2.isEmpty()) {
                        org.telegram.ui.Cells.w0 u82 = v5Var.e.u8(v5Var.f);
                        org.telegram.ui.Cells.w0 w0Var = v5Var.p;
                        if (u82 != w0Var) {
                            w0Var.I0.i(false);
                            v5Var.p = u82;
                        }
                        org.telegram.ui.Cells.w0 w0Var2 = v5Var.p;
                        if (w0Var2 != null && !v5Var.s) {
                            w0Var2.I0.i(true);
                            d3 d3Var = v5Var.p.I0.m;
                            if (d3Var != null && d3Var.isAttachedToWindow()) {
                                rectF2.set(v5Var.c(d3Var));
                                v5Var.r = floatValue2;
                                float max = Math.max(0.0f, Math.min(1.0f, (floatValue2 - 0.25f) / 0.5f));
                                float B = com.google.android.gms.internal.play_billing.k3.B(max, 2.0f, 3.0f, max * max);
                                c6Var.setAlpha((1.0f - B) * v5Var.l);
                                t5Var.setAlpha(B);
                                v5Var.d();
                                float f7 = 1.0f - floatValue2;
                                float centerX = ((rectF2.centerX() - rectF.centerX()) * 0.35f) + rectF.centerX();
                                float min = Math.min(rectF.centerY(), rectF2.centerY()) - AndroidUtilities.dp(150.0f);
                                float f10 = f7 * f7;
                                float f11 = f7 * 2.0f * floatValue2;
                                float f12 = floatValue2 * floatValue2;
                                float centerX2 = (rectF2.centerX() * f12) + (centerX * f11) + (rectF.centerX() * f10);
                                float centerY = (rectF2.centerY() * f12) + (f11 * min) + (rectF.centerY() * f10);
                                v5Var.b(centerX2, centerY, ((rectF2.width() - rectF.width()) * floatValue2) + rectF.width());
                                if (floatValue2 < 0.92f) {
                                    v5Var.j.g(centerX2, centerY);
                                }
                                v5Var.h.invalidate();
                                break;
                            } else {
                                rectF2.setEmpty();
                                c6Var.setAlpha(0.0f);
                                t5Var.setAlpha(0.0f);
                                break;
                            }
                        } else {
                            rectF2.setEmpty();
                            c6Var.setAlpha(0.0f);
                            t5Var.setAlpha(0.0f);
                            break;
                        }
                    }
                }
                break;
            case 5:
                c6 c6Var2 = (c6) this.b;
                c6Var2.getClass();
                c6Var2.i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c6Var2.e();
                break;
            case 6:
                m7 m7Var = (m7) this.b;
                m7Var.getClass();
                m7Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m7Var.invalidate();
                break;
            case 7:
                j8 j8Var = (j8) this.b;
                j8Var.getClass();
                j8Var.s0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 8:
                i8 i8Var = (i8) this.b;
                i8Var.getClass();
                i8Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i8Var.c();
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
                        c6 pendingDiamond = w8Var.p.getPendingDiamond();
                        if (pendingDiamond != null) {
                            y2 y2Var = w8Var.p;
                            TL_wallet.walletTransaction wallettransaction = w8Var.f;
                            TL_wallet.walletTransaction wallettransaction2 = y2Var.R;
                            if (wallettransaction2 != null && w2.a(wallettransaction2, wallettransaction) && pendingDiamond.isAttachedToWindow()) {
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
