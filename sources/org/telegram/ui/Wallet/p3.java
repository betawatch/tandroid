package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.di;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class p3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p3(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ((u3) this.b).setPendingProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                m5 m5Var = (m5) this.b;
                m5Var.getClass();
                m5Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m5Var.invalidate();
                break;
            case 2:
                u5 u5Var = (u5) this.b;
                u5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u5Var.b.setRotationY(floatValue);
                boolean z9 = floatValue > 90.0f;
                u5Var.c.setVisibility(z9 ? 4 : 0);
                u5Var.d.setVisibility(z9 ? 0 : 4);
                break;
            case 3:
                m6 m6Var = (m6) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k6 k6Var = m6Var.q;
                u6 u6Var = m6Var.i;
                RectF rectF = m6Var.n;
                RectF rectF2 = m6Var.o;
                if (!m6Var.v) {
                    m6Var.e();
                    float interpolation = m6Var.k.getInterpolation(Math.min(1.0f, floatValue2 * 2.0f));
                    di diVar = m6Var.c;
                    if (diVar != null) {
                        diVar.x1(interpolation);
                    } else {
                        m6Var.b.setTranslationY(r7.getHeight() * interpolation);
                    }
                    if (m6Var.p != null && !rectF2.isEmpty()) {
                        org.telegram.ui.Cells.t0 J8 = m6Var.e.J8(m6Var.f);
                        org.telegram.ui.Cells.t0 t0Var = m6Var.p;
                        if (J8 != t0Var) {
                            t0Var.I0.i(false);
                            m6Var.p = J8;
                        }
                        org.telegram.ui.Cells.t0 t0Var2 = m6Var.p;
                        if (t0Var2 != null && !m6Var.s) {
                            t0Var2.I0.i(true);
                            a4 a4Var = m6Var.p.I0.m;
                            if (a4Var != null && a4Var.isAttachedToWindow()) {
                                rectF2.set(m6Var.c(a4Var));
                                m6Var.r = floatValue2;
                                float max = Math.max(0.0f, Math.min(1.0f, (floatValue2 - 0.25f) / 0.5f));
                                float C = com.google.android.recaptcha.internal.a.C(max, 2.0f, 3.0f, max * max);
                                u6Var.setAlpha((1.0f - C) * m6Var.l);
                                k6Var.setAlpha(C);
                                m6Var.d();
                                float f10 = 1.0f - floatValue2;
                                float centerX = ((rectF2.centerX() - rectF.centerX()) * 0.35f) + rectF.centerX();
                                float min = Math.min(rectF.centerY(), rectF2.centerY()) - org.telegram.messenger.g0.L(150.0f);
                                float f11 = f10 * f10;
                                float f12 = f10 * 2.0f * floatValue2;
                                float f13 = floatValue2 * floatValue2;
                                float centerX2 = (rectF2.centerX() * f13) + (centerX * f12) + (rectF.centerX() * f11);
                                float centerY = (rectF2.centerY() * f13) + (f12 * min) + (rectF.centerY() * f11);
                                m6Var.b(centerX2, centerY, ((rectF2.width() - rectF.width()) * floatValue2) + rectF.width());
                                if (floatValue2 < 0.92f) {
                                    m6Var.j.g(centerX2, centerY);
                                }
                                m6Var.h.invalidate();
                                break;
                            } else {
                                rectF2.setEmpty();
                                u6Var.setAlpha(0.0f);
                                k6Var.setAlpha(0.0f);
                                break;
                            }
                        } else {
                            rectF2.setEmpty();
                            u6Var.setAlpha(0.0f);
                            k6Var.setAlpha(0.0f);
                            break;
                        }
                    }
                }
                break;
            case 4:
                u6 u6Var2 = (u6) this.b;
                u6Var2.getClass();
                u6Var2.i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u6Var2.e();
                break;
            case 5:
                n7 n7Var = (n7) this.b;
                n7Var.getClass();
                n7Var.n(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                o8 o8Var = (o8) this.b;
                o8Var.getClass();
                o8Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o8Var.invalidate();
                break;
            case 7:
                r8 r8Var = (r8) this.b;
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                r8Var.w = f14.floatValue();
                r8Var.f.a(f14);
                View view = r8Var.a;
                view.setAlpha(1.0f - r8.c(0.05f, 0.45f, r8Var.w));
                view.setScaleX(1.0f - (r8Var.w * 0.06f));
                EditTextBoldCursor editTextBoldCursor = r8Var.b;
                editTextBoldCursor.setAlpha(r8.c(0.3f, 0.9f, r8Var.w));
                editTextBoldCursor.setTranslationX((1.0f - r8Var.w) * jg.g.e(80.0f, r8Var.getWidth(), 0));
                r8Var.invalidate();
                break;
            case 8:
                l9 l9Var = (l9) this.b;
                l9Var.getClass();
                l9Var.y0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 9:
                k9 k9Var = (k9) this.b;
                k9Var.getClass();
                k9Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k9Var.c();
                break;
            default:
                z9 z9Var = (z9) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = z9Var.n;
                RectF rectF4 = z9Var.o;
                if (!z9Var.s) {
                    z9Var.e();
                    float interpolation2 = z9Var.k.getInterpolation(Math.min(1.0f, floatValue3 * 2.0f));
                    di diVar2 = z9Var.a;
                    if (diVar2 != null) {
                        diVar2.x1(interpolation2);
                    } else {
                        z9Var.c.setTranslationY(r5.getHeight() * interpolation2);
                    }
                    if (z9Var.p != null && !rectF4.isEmpty()) {
                        u6 pendingDiamond = z9Var.p.getPendingDiamond();
                        if (pendingDiamond != null) {
                            u3 u3Var = z9Var.p;
                            TL_wallet.walletTransaction wallettransaction = z9Var.f;
                            TL_wallet.walletTransaction wallettransaction2 = u3Var.R;
                            if (wallettransaction2 != null && s3.i(wallettransaction2, wallettransaction) && pendingDiamond.isAttachedToWindow()) {
                                rectF4.set(z9Var.d(pendingDiamond));
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
                        z9Var.c(centerX4, centerY2, ((rectF4.width() - rectF3.width()) * floatValue3) + rectF3.width());
                        if (floatValue3 < 0.92f) {
                            z9Var.j.g(centerX4, centerY2);
                        }
                        z9Var.h.invalidate();
                        break;
                    }
                }
                break;
        }
    }
}
