package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ti;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                y2 y2Var = (y2) this.b;
                y2Var.getClass();
                y2Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y2Var.d();
                break;
            case 1:
                ((e3) this.b).setPendingProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                b5 b5Var = (b5) this.b;
                b5Var.getClass();
                b5Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b5Var.invalidate();
                break;
            case 3:
                k5 k5Var = (k5) this.b;
                k5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k5Var.b.setRotationY(floatValue);
                boolean z10 = floatValue > 90.0f;
                k5Var.c.setVisibility(z10 ? 4 : 0);
                k5Var.d.setVisibility(z10 ? 0 : 4);
                break;
            case 4:
                k6 k6Var = (k6) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i6 i6Var = k6Var.q;
                s6 s6Var = k6Var.i;
                RectF rectF = k6Var.n;
                RectF rectF2 = k6Var.o;
                if (!k6Var.v) {
                    k6Var.e();
                    float interpolation = k6Var.k.getInterpolation(Math.min(1.0f, floatValue2 * 2.0f));
                    ti tiVar = k6Var.c;
                    if (tiVar != null) {
                        tiVar.M1(interpolation);
                    } else {
                        k6Var.b.setTranslationY(r7.getHeight() * interpolation);
                    }
                    if (k6Var.p != null && !rectF2.isEmpty()) {
                        org.telegram.ui.Cells.w0 u82 = k6Var.e.u8(k6Var.f);
                        org.telegram.ui.Cells.w0 w0Var = k6Var.p;
                        if (u82 != w0Var) {
                            w0Var.I0.k(false);
                            k6Var.p = u82;
                        }
                        org.telegram.ui.Cells.w0 w0Var2 = k6Var.p;
                        if (w0Var2 != null && !k6Var.s) {
                            w0Var2.I0.k(true);
                            k3 k3Var = k6Var.p.I0.m;
                            if (k3Var != null && k3Var.isAttachedToWindow()) {
                                rectF2.set(k6Var.c(k3Var));
                                k6Var.r = floatValue2;
                                float max = Math.max(0.0f, Math.min(1.0f, (floatValue2 - 0.25f) / 0.5f));
                                float B = com.google.android.gms.internal.play_billing.k3.B(max, 2.0f, 3.0f, max * max);
                                s6Var.setAlpha((1.0f - B) * k6Var.l);
                                i6Var.setAlpha(B);
                                k6Var.d();
                                float f7 = 1.0f - floatValue2;
                                float centerX = ((rectF2.centerX() - rectF.centerX()) * 0.35f) + rectF.centerX();
                                float min = Math.min(rectF.centerY(), rectF2.centerY()) - AndroidUtilities.dp(150.0f);
                                float f10 = f7 * f7;
                                float f11 = f7 * 2.0f * floatValue2;
                                float f12 = floatValue2 * floatValue2;
                                float centerX2 = (rectF2.centerX() * f12) + (centerX * f11) + (rectF.centerX() * f10);
                                float centerY = (rectF2.centerY() * f12) + (f11 * min) + (rectF.centerY() * f10);
                                k6Var.b(centerX2, centerY, ((rectF2.width() - rectF.width()) * floatValue2) + rectF.width());
                                if (floatValue2 < 0.92f) {
                                    k6Var.j.g(centerX2, centerY);
                                }
                                k6Var.h.invalidate();
                                break;
                            } else {
                                rectF2.setEmpty();
                                s6Var.setAlpha(0.0f);
                                i6Var.setAlpha(0.0f);
                                break;
                            }
                        } else {
                            rectF2.setEmpty();
                            s6Var.setAlpha(0.0f);
                            i6Var.setAlpha(0.0f);
                            break;
                        }
                    }
                }
                break;
            case 5:
                s6 s6Var2 = (s6) this.b;
                s6Var2.getClass();
                s6Var2.i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s6Var2.e();
                break;
            case 6:
                m7 m7Var = (m7) this.b;
                m7Var.getClass();
                m7Var.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 7:
                p8 p8Var = (p8) this.b;
                p8Var.getClass();
                p8Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p8Var.invalidate();
                break;
            case 8:
                t8 t8Var = (t8) this.b;
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                t8Var.v = f13.floatValue();
                t8Var.f.run(f13);
                View view = t8Var.a;
                view.setAlpha(1.0f - t8.c(0.05f, 0.45f, t8Var.v));
                view.setScaleX(1.0f - (t8Var.v * 0.06f));
                EditTextBoldCursor editTextBoldCursor = t8Var.b;
                editTextBoldCursor.setAlpha(t8.c(0.3f, 0.9f, t8Var.v));
                editTextBoldCursor.setTranslationX((1.0f - t8Var.v) * org.telegram.messenger.g0.b(80.0f, t8Var.getWidth(), 0));
                t8Var.invalidate();
                break;
            case 9:
                o9 o9Var = (o9) this.b;
                o9Var.getClass();
                o9Var.s0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 10:
                n9 n9Var = (n9) this.b;
                n9Var.getClass();
                n9Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n9Var.c();
                break;
            default:
                aa aaVar = (aa) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = aaVar.n;
                RectF rectF4 = aaVar.o;
                if (!aaVar.s) {
                    aaVar.e();
                    float interpolation2 = aaVar.k.getInterpolation(Math.min(1.0f, floatValue3 * 2.0f));
                    ti tiVar2 = aaVar.a;
                    if (tiVar2 != null) {
                        tiVar2.M1(interpolation2);
                    } else {
                        aaVar.c.setTranslationY(r5.getHeight() * interpolation2);
                    }
                    if (aaVar.p != null && !rectF4.isEmpty()) {
                        s6 pendingDiamond = aaVar.p.getPendingDiamond();
                        if (pendingDiamond != null) {
                            e3 e3Var = aaVar.p;
                            TL_wallet.walletTransaction wallettransaction = aaVar.f;
                            TL_wallet.walletTransaction wallettransaction2 = e3Var.R;
                            if (wallettransaction2 != null && c3.a(wallettransaction2, wallettransaction) && pendingDiamond.isAttachedToWindow()) {
                                rectF4.set(aaVar.d(pendingDiamond));
                            }
                        }
                        float f14 = 1.0f - floatValue3;
                        float centerX3 = ((rectF4.centerX() - rectF3.centerX()) * 0.35f) + rectF3.centerX();
                        float min2 = Math.min(rectF3.centerY(), rectF4.centerY()) - AndroidUtilities.dp(150.0f);
                        float f15 = f14 * f14;
                        float f16 = f14 * 2.0f * floatValue3;
                        float f17 = floatValue3 * floatValue3;
                        float centerX4 = (rectF4.centerX() * f17) + (centerX3 * f16) + (rectF3.centerX() * f15);
                        float centerY2 = (rectF4.centerY() * f17) + (f16 * min2) + (rectF3.centerY() * f15);
                        aaVar.c(centerX4, centerY2, ((rectF4.width() - rectF3.width()) * floatValue3) + rectF3.width());
                        if (floatValue3 < 0.92f) {
                            aaVar.j.g(centerX4, centerY2);
                        }
                        aaVar.h.invalidate();
                        break;
                    }
                }
                break;
        }
    }
}
