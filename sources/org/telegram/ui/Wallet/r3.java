package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ci;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r3(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ((w3) this.b).setPendingProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                p5 p5Var = (p5) this.b;
                p5Var.getClass();
                p5Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p5Var.invalidate();
                break;
            case 2:
                x5 x5Var = (x5) this.b;
                x5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x5Var.c.setRotationY(floatValue);
                boolean z9 = floatValue > 90.0f;
                x5Var.d.setVisibility(z9 ? 4 : 0);
                x5Var.e.setVisibility(z9 ? 0 : 4);
                break;
            case 3:
                p6 p6Var = (p6) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n6 n6Var = p6Var.q;
                x6 x6Var = p6Var.i;
                RectF rectF = p6Var.n;
                RectF rectF2 = p6Var.o;
                if (!p6Var.v) {
                    p6Var.e();
                    float interpolation = p6Var.k.getInterpolation(Math.min(1.0f, floatValue2 * 2.0f));
                    ci ciVar = p6Var.c;
                    if (ciVar != null) {
                        ciVar.x1(interpolation);
                    } else {
                        p6Var.b.setTranslationY(r7.getHeight() * interpolation);
                    }
                    if (p6Var.p != null && !rectF2.isEmpty()) {
                        org.telegram.ui.Cells.t0 J8 = p6Var.e.J8(p6Var.f);
                        org.telegram.ui.Cells.t0 t0Var = p6Var.p;
                        if (J8 != t0Var) {
                            t0Var.I0.i(false);
                            p6Var.p = J8;
                        }
                        org.telegram.ui.Cells.t0 t0Var2 = p6Var.p;
                        if (t0Var2 != null && !p6Var.s) {
                            t0Var2.I0.i(true);
                            c4 c4Var = p6Var.p.I0.m;
                            if (c4Var != null && c4Var.isAttachedToWindow()) {
                                rectF2.set(p6Var.c(c4Var));
                                p6Var.r = floatValue2;
                                float max = Math.max(0.0f, Math.min(1.0f, (floatValue2 - 0.25f) / 0.5f));
                                float C = com.google.android.recaptcha.internal.a.C(max, 2.0f, 3.0f, max * max);
                                x6Var.setAlpha((1.0f - C) * p6Var.l);
                                n6Var.setAlpha(C);
                                p6Var.d();
                                float f10 = 1.0f - floatValue2;
                                float centerX = ((rectF2.centerX() - rectF.centerX()) * 0.35f) + rectF.centerX();
                                float min = Math.min(rectF.centerY(), rectF2.centerY()) - org.telegram.messenger.g0.L(150.0f);
                                float f11 = f10 * f10;
                                float f12 = f10 * 2.0f * floatValue2;
                                float f13 = floatValue2 * floatValue2;
                                float centerX2 = (rectF2.centerX() * f13) + (centerX * f12) + (rectF.centerX() * f11);
                                float centerY = (rectF2.centerY() * f13) + (f12 * min) + (rectF.centerY() * f11);
                                p6Var.b(centerX2, centerY, ((rectF2.width() - rectF.width()) * floatValue2) + rectF.width());
                                if (floatValue2 < 0.92f) {
                                    p6Var.j.g(centerX2, centerY);
                                }
                                p6Var.h.invalidate();
                                break;
                            } else {
                                rectF2.setEmpty();
                                x6Var.setAlpha(0.0f);
                                n6Var.setAlpha(0.0f);
                                break;
                            }
                        } else {
                            rectF2.setEmpty();
                            x6Var.setAlpha(0.0f);
                            n6Var.setAlpha(0.0f);
                            break;
                        }
                    }
                }
                break;
            case 4:
                x6 x6Var2 = (x6) this.b;
                x6Var2.getClass();
                x6Var2.i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x6Var2.e();
                break;
            case 5:
                q7 q7Var = (q7) this.b;
                q7Var.getClass();
                q7Var.n(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                r8 r8Var = (r8) this.b;
                r8Var.getClass();
                r8Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r8Var.invalidate();
                break;
            case 7:
                u8 u8Var = (u8) this.b;
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                u8Var.w = f14.floatValue();
                u8Var.f.a(f14);
                View view = u8Var.a;
                view.setAlpha(1.0f - u8.c(0.05f, 0.45f, u8Var.w));
                view.setScaleX(1.0f - (u8Var.w * 0.06f));
                EditTextBoldCursor editTextBoldCursor = u8Var.b;
                editTextBoldCursor.setAlpha(u8.c(0.3f, 0.9f, u8Var.w));
                editTextBoldCursor.setTranslationX((1.0f - u8Var.w) * jg.g.e(80.0f, u8Var.getWidth(), 0));
                u8Var.invalidate();
                break;
            case 8:
                o9 o9Var = (o9) this.b;
                o9Var.getClass();
                o9Var.y0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 9:
                n9 n9Var = (n9) this.b;
                n9Var.getClass();
                n9Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n9Var.c();
                break;
            default:
                ca caVar = (ca) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = caVar.n;
                RectF rectF4 = caVar.o;
                if (!caVar.s) {
                    caVar.e();
                    float interpolation2 = caVar.k.getInterpolation(Math.min(1.0f, floatValue3 * 2.0f));
                    ci ciVar2 = caVar.a;
                    if (ciVar2 != null) {
                        ciVar2.x1(interpolation2);
                    } else {
                        caVar.c.setTranslationY(r5.getHeight() * interpolation2);
                    }
                    if (caVar.p != null && !rectF4.isEmpty()) {
                        x6 pendingDiamond = caVar.p.getPendingDiamond();
                        if (pendingDiamond != null) {
                            w3 w3Var = caVar.p;
                            TL_wallet.walletTransaction wallettransaction = caVar.f;
                            TL_wallet.walletTransaction wallettransaction2 = w3Var.R;
                            if (wallettransaction2 != null && u3.i(wallettransaction2, wallettransaction) && pendingDiamond.isAttachedToWindow()) {
                                rectF4.set(caVar.d(pendingDiamond));
                            }
                        }
                        float f15 = 1.0f - floatValue3;
                        float centerX3 = ((rectF4.centerX() - rectF3.centerX()) * 0.35f) + rectF3.centerX();
                        float min2 = Math.min(rectF3.centerY(), rectF4.centerY()) - org.telegram.messenger.g0.L(150.0f);
                        float f16 = f15 * f15;
                        float f17 = f15 * 2.0f * floatValue3;
                        float f18 = floatValue3 * floatValue3;
                        float centerX4 = (rectF4.centerX() * f18) + (centerX3 * f17) + (rectF3.centerX() * f16);
                        float centerY2 = (rectF4.centerY() * f18) + (f17 * min2) + (rectF3.centerY() * f16);
                        caVar.c(centerX4, centerY2, ((rectF4.width() - rectF3.width()) * floatValue3) + rectF3.width());
                        if (floatValue3 < 0.92f) {
                            caVar.j.g(centerX4, centerY2);
                        }
                        caVar.h.invalidate();
                        break;
                    }
                }
                break;
        }
    }
}
