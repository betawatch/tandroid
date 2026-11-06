package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.di;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
                o5 o5Var = (o5) this.b;
                o5Var.getClass();
                o5Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o5Var.invalidate();
                break;
            case 2:
                w5 w5Var = (w5) this.b;
                w5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w5Var.b.setRotationY(floatValue);
                boolean z9 = floatValue > 90.0f;
                w5Var.c.setVisibility(z9 ? 4 : 0);
                w5Var.d.setVisibility(z9 ? 0 : 4);
                break;
            case 3:
                o6 o6Var = (o6) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m6 m6Var = o6Var.q;
                w6 w6Var = o6Var.i;
                RectF rectF = o6Var.n;
                RectF rectF2 = o6Var.o;
                if (!o6Var.v) {
                    o6Var.e();
                    float interpolation = o6Var.k.getInterpolation(Math.min(1.0f, floatValue2 * 2.0f));
                    di diVar = o6Var.c;
                    if (diVar != null) {
                        diVar.x1(interpolation);
                    } else {
                        o6Var.b.setTranslationY(r7.getHeight() * interpolation);
                    }
                    if (o6Var.p != null && !rectF2.isEmpty()) {
                        org.telegram.ui.Cells.t0 I8 = o6Var.e.I8(o6Var.f);
                        org.telegram.ui.Cells.t0 t0Var = o6Var.p;
                        if (I8 != t0Var) {
                            t0Var.I0.i(false);
                            o6Var.p = I8;
                        }
                        org.telegram.ui.Cells.t0 t0Var2 = o6Var.p;
                        if (t0Var2 != null && !o6Var.s) {
                            t0Var2.I0.i(true);
                            c4 c4Var = o6Var.p.I0.m;
                            if (c4Var != null && c4Var.isAttachedToWindow()) {
                                rectF2.set(o6Var.c(c4Var));
                                o6Var.r = floatValue2;
                                float max = Math.max(0.0f, Math.min(1.0f, (floatValue2 - 0.25f) / 0.5f));
                                float C = com.google.android.recaptcha.internal.a.C(max, 2.0f, 3.0f, max * max);
                                w6Var.setAlpha((1.0f - C) * o6Var.l);
                                m6Var.setAlpha(C);
                                o6Var.d();
                                float f10 = 1.0f - floatValue2;
                                float centerX = ((rectF2.centerX() - rectF.centerX()) * 0.35f) + rectF.centerX();
                                float min = Math.min(rectF.centerY(), rectF2.centerY()) - org.telegram.messenger.g0.L(150.0f);
                                float f11 = f10 * f10;
                                float f12 = f10 * 2.0f * floatValue2;
                                float f13 = floatValue2 * floatValue2;
                                float centerX2 = (rectF2.centerX() * f13) + (centerX * f12) + (rectF.centerX() * f11);
                                float centerY = (rectF2.centerY() * f13) + (f12 * min) + (rectF.centerY() * f11);
                                o6Var.b(centerX2, centerY, ((rectF2.width() - rectF.width()) * floatValue2) + rectF.width());
                                if (floatValue2 < 0.92f) {
                                    o6Var.j.g(centerX2, centerY);
                                }
                                o6Var.h.invalidate();
                                break;
                            } else {
                                rectF2.setEmpty();
                                w6Var.setAlpha(0.0f);
                                m6Var.setAlpha(0.0f);
                                break;
                            }
                        } else {
                            rectF2.setEmpty();
                            w6Var.setAlpha(0.0f);
                            m6Var.setAlpha(0.0f);
                            break;
                        }
                    }
                }
                break;
            case 4:
                w6 w6Var2 = (w6) this.b;
                w6Var2.getClass();
                w6Var2.i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w6Var2.e();
                break;
            case 5:
                p7 p7Var = (p7) this.b;
                p7Var.getClass();
                p7Var.n(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                q8 q8Var = (q8) this.b;
                q8Var.getClass();
                q8Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q8Var.invalidate();
                break;
            case 7:
                t8 t8Var = (t8) this.b;
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                t8Var.w = f14.floatValue();
                t8Var.f.a(f14);
                View view = t8Var.a;
                view.setAlpha(1.0f - t8.c(0.05f, 0.45f, t8Var.w));
                view.setScaleX(1.0f - (t8Var.w * 0.06f));
                EditTextBoldCursor editTextBoldCursor = t8Var.b;
                editTextBoldCursor.setAlpha(t8.c(0.3f, 0.9f, t8Var.w));
                editTextBoldCursor.setTranslationX((1.0f - t8Var.w) * jg.g.e(80.0f, t8Var.getWidth(), 0));
                t8Var.invalidate();
                break;
            case 8:
                n9 n9Var = (n9) this.b;
                n9Var.getClass();
                n9Var.y0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 9:
                m9 m9Var = (m9) this.b;
                m9Var.getClass();
                m9Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m9Var.c();
                break;
            default:
                ba baVar = (ba) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = baVar.n;
                RectF rectF4 = baVar.o;
                if (!baVar.s) {
                    baVar.e();
                    float interpolation2 = baVar.k.getInterpolation(Math.min(1.0f, floatValue3 * 2.0f));
                    di diVar2 = baVar.a;
                    if (diVar2 != null) {
                        diVar2.x1(interpolation2);
                    } else {
                        baVar.c.setTranslationY(r5.getHeight() * interpolation2);
                    }
                    if (baVar.p != null && !rectF4.isEmpty()) {
                        w6 pendingDiamond = baVar.p.getPendingDiamond();
                        if (pendingDiamond != null) {
                            w3 w3Var = baVar.p;
                            TL_wallet.walletTransaction wallettransaction = baVar.f;
                            TL_wallet.walletTransaction wallettransaction2 = w3Var.R;
                            if (wallettransaction2 != null && u3.i(wallettransaction2, wallettransaction) && pendingDiamond.isAttachedToWindow()) {
                                rectF4.set(baVar.d(pendingDiamond));
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
                        baVar.c(centerX4, centerY2, ((rectF4.width() - rectF3.width()) * floatValue3) + rectF3.width());
                        if (floatValue3 < 0.92f) {
                            baVar.j.g(centerX4, centerY2);
                        }
                        baVar.h.invalidate();
                        break;
                    }
                }
                break;
        }
    }
}
