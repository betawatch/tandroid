package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.di;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q3(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ((v3) this.b).setPendingProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                n5 n5Var = (n5) this.b;
                n5Var.getClass();
                n5Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n5Var.invalidate();
                break;
            case 2:
                v5 v5Var = (v5) this.b;
                v5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v5Var.b.setRotationY(floatValue);
                boolean z9 = floatValue > 90.0f;
                v5Var.c.setVisibility(z9 ? 4 : 0);
                v5Var.d.setVisibility(z9 ? 0 : 4);
                break;
            case 3:
                n6 n6Var = (n6) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l6 l6Var = n6Var.q;
                v6 v6Var = n6Var.i;
                RectF rectF = n6Var.n;
                RectF rectF2 = n6Var.o;
                if (!n6Var.v) {
                    n6Var.e();
                    float interpolation = n6Var.k.getInterpolation(Math.min(1.0f, floatValue2 * 2.0f));
                    di diVar = n6Var.c;
                    if (diVar != null) {
                        diVar.x1(interpolation);
                    } else {
                        n6Var.b.setTranslationY(r7.getHeight() * interpolation);
                    }
                    if (n6Var.p != null && !rectF2.isEmpty()) {
                        org.telegram.ui.Cells.t0 I8 = n6Var.e.I8(n6Var.f);
                        org.telegram.ui.Cells.t0 t0Var = n6Var.p;
                        if (I8 != t0Var) {
                            t0Var.I0.i(false);
                            n6Var.p = I8;
                        }
                        org.telegram.ui.Cells.t0 t0Var2 = n6Var.p;
                        if (t0Var2 != null && !n6Var.s) {
                            t0Var2.I0.i(true);
                            b4 b4Var = n6Var.p.I0.m;
                            if (b4Var != null && b4Var.isAttachedToWindow()) {
                                rectF2.set(n6Var.c(b4Var));
                                n6Var.r = floatValue2;
                                float max = Math.max(0.0f, Math.min(1.0f, (floatValue2 - 0.25f) / 0.5f));
                                float C = com.google.android.recaptcha.internal.a.C(max, 2.0f, 3.0f, max * max);
                                v6Var.setAlpha((1.0f - C) * n6Var.l);
                                l6Var.setAlpha(C);
                                n6Var.d();
                                float f10 = 1.0f - floatValue2;
                                float centerX = ((rectF2.centerX() - rectF.centerX()) * 0.35f) + rectF.centerX();
                                float min = Math.min(rectF.centerY(), rectF2.centerY()) - org.telegram.messenger.g0.L(150.0f);
                                float f11 = f10 * f10;
                                float f12 = f10 * 2.0f * floatValue2;
                                float f13 = floatValue2 * floatValue2;
                                float centerX2 = (rectF2.centerX() * f13) + (centerX * f12) + (rectF.centerX() * f11);
                                float centerY = (rectF2.centerY() * f13) + (f12 * min) + (rectF.centerY() * f11);
                                n6Var.b(centerX2, centerY, ((rectF2.width() - rectF.width()) * floatValue2) + rectF.width());
                                if (floatValue2 < 0.92f) {
                                    n6Var.j.g(centerX2, centerY);
                                }
                                n6Var.h.invalidate();
                                break;
                            } else {
                                rectF2.setEmpty();
                                v6Var.setAlpha(0.0f);
                                l6Var.setAlpha(0.0f);
                                break;
                            }
                        } else {
                            rectF2.setEmpty();
                            v6Var.setAlpha(0.0f);
                            l6Var.setAlpha(0.0f);
                            break;
                        }
                    }
                }
                break;
            case 4:
                v6 v6Var2 = (v6) this.b;
                v6Var2.getClass();
                v6Var2.i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v6Var2.e();
                break;
            case 5:
                o7 o7Var = (o7) this.b;
                o7Var.getClass();
                o7Var.n(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                p8 p8Var = (p8) this.b;
                p8Var.getClass();
                p8Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p8Var.invalidate();
                break;
            case 7:
                s8 s8Var = (s8) this.b;
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                s8Var.w = f14.floatValue();
                s8Var.f.a(f14);
                View view = s8Var.a;
                view.setAlpha(1.0f - s8.c(0.05f, 0.45f, s8Var.w));
                view.setScaleX(1.0f - (s8Var.w * 0.06f));
                EditTextBoldCursor editTextBoldCursor = s8Var.b;
                editTextBoldCursor.setAlpha(s8.c(0.3f, 0.9f, s8Var.w));
                editTextBoldCursor.setTranslationX((1.0f - s8Var.w) * jg.g.e(80.0f, s8Var.getWidth(), 0));
                s8Var.invalidate();
                break;
            case 8:
                m9 m9Var = (m9) this.b;
                m9Var.getClass();
                m9Var.y0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 9:
                l9 l9Var = (l9) this.b;
                l9Var.getClass();
                l9Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l9Var.c();
                break;
            default:
                aa aaVar = (aa) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = aaVar.n;
                RectF rectF4 = aaVar.o;
                if (!aaVar.s) {
                    aaVar.e();
                    float interpolation2 = aaVar.k.getInterpolation(Math.min(1.0f, floatValue3 * 2.0f));
                    di diVar2 = aaVar.a;
                    if (diVar2 != null) {
                        diVar2.x1(interpolation2);
                    } else {
                        aaVar.c.setTranslationY(r5.getHeight() * interpolation2);
                    }
                    if (aaVar.p != null && !rectF4.isEmpty()) {
                        v6 pendingDiamond = aaVar.p.getPendingDiamond();
                        if (pendingDiamond != null) {
                            v3 v3Var = aaVar.p;
                            TL_wallet.walletTransaction wallettransaction = aaVar.f;
                            TL_wallet.walletTransaction wallettransaction2 = v3Var.R;
                            if (wallettransaction2 != null && t3.i(wallettransaction2, wallettransaction) && pendingDiamond.isAttachedToWindow()) {
                                rectF4.set(aaVar.d(pendingDiamond));
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
