package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ui;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z3(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ((f4) this.b).setPendingProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                d6 d6Var = (d6) this.b;
                d6Var.getClass();
                d6Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d6Var.invalidate();
                break;
            case 2:
                l6 l6Var = (l6) this.b;
                l6Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l6Var.c.setRotationY(floatValue);
                boolean z10 = floatValue > 90.0f;
                l6Var.d.setVisibility(z10 ? 4 : 0);
                l6Var.e.setVisibility(z10 ? 0 : 4);
                break;
            case 3:
                e7 e7Var = (e7) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c7 c7Var = e7Var.q;
                m7 m7Var = e7Var.i;
                RectF rectF = e7Var.n;
                RectF rectF2 = e7Var.o;
                if (!e7Var.v) {
                    e7Var.e();
                    float interpolation = e7Var.k.getInterpolation(Math.min(1.0f, floatValue2 * 2.0f));
                    ui uiVar = e7Var.c;
                    if (uiVar != null) {
                        uiVar.y1(interpolation);
                    } else {
                        e7Var.b.setTranslationY(r7.getHeight() * interpolation);
                    }
                    if (e7Var.p != null && !rectF2.isEmpty()) {
                        org.telegram.ui.Cells.v0 K8 = e7Var.e.K8(e7Var.f);
                        org.telegram.ui.Cells.v0 v0Var = e7Var.p;
                        if (K8 != v0Var) {
                            v0Var.J0.i(false);
                            e7Var.p = K8;
                        }
                        org.telegram.ui.Cells.v0 v0Var2 = e7Var.p;
                        if (v0Var2 != null && !e7Var.s) {
                            v0Var2.J0.i(true);
                            l4 l4Var = e7Var.p.J0.m;
                            if (l4Var != null && l4Var.isAttachedToWindow()) {
                                rectF2.set(e7Var.c(l4Var));
                                e7Var.r = floatValue2;
                                float max = Math.max(0.0f, Math.min(1.0f, (floatValue2 - 0.25f) / 0.5f));
                                float C = com.google.android.gms.internal.vision.e2.C(max, 2.0f, 3.0f, max * max);
                                m7Var.setAlpha((1.0f - C) * e7Var.l);
                                c7Var.setAlpha(C);
                                e7Var.d();
                                float f10 = 1.0f - floatValue2;
                                float centerX = ((rectF2.centerX() - rectF.centerX()) * 0.35f) + rectF.centerX();
                                float min = Math.min(rectF.centerY(), rectF2.centerY()) - org.telegram.messenger.g0.L(150.0f);
                                float f11 = f10 * f10;
                                float f12 = f10 * 2.0f * floatValue2;
                                float f13 = floatValue2 * floatValue2;
                                float centerX2 = (rectF2.centerX() * f13) + (centerX * f12) + (rectF.centerX() * f11);
                                float centerY = (rectF2.centerY() * f13) + (f12 * min) + (rectF.centerY() * f11);
                                e7Var.b(centerX2, centerY, ((rectF2.width() - rectF.width()) * floatValue2) + rectF.width());
                                if (floatValue2 < 0.92f) {
                                    e7Var.j.g(centerX2, centerY);
                                }
                                e7Var.h.invalidate();
                                break;
                            } else {
                                rectF2.setEmpty();
                                m7Var.setAlpha(0.0f);
                                c7Var.setAlpha(0.0f);
                                break;
                            }
                        } else {
                            rectF2.setEmpty();
                            m7Var.setAlpha(0.0f);
                            c7Var.setAlpha(0.0f);
                            break;
                        }
                    }
                }
                break;
            case 4:
                m7 m7Var2 = (m7) this.b;
                m7Var2.getClass();
                m7Var2.j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m7Var2.e();
                break;
            case 5:
                e8 e8Var = (e8) this.b;
                e8Var.getClass();
                e8Var.n(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                f9 f9Var = (f9) this.b;
                f9Var.getClass();
                f9Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f9Var.invalidate();
                break;
            case 7:
                j9 j9Var = (j9) this.b;
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                j9Var.w = f14.floatValue();
                j9Var.f.a(f14);
                View view = j9Var.a;
                view.setAlpha(1.0f - j9.c(0.05f, 0.45f, j9Var.w));
                view.setScaleX(1.0f - (j9Var.w * 0.06f));
                EditTextBoldCursor editTextBoldCursor = j9Var.b;
                editTextBoldCursor.setAlpha(j9.c(0.3f, 0.9f, j9Var.w));
                editTextBoldCursor.setTranslationX((1.0f - j9Var.w) * i5.c.d(80.0f, j9Var.getWidth(), 0));
                j9Var.invalidate();
                break;
            case 8:
                da daVar = (da) this.b;
                daVar.getClass();
                daVar.y0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 9:
                ca caVar = (ca) this.b;
                caVar.getClass();
                caVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                caVar.c();
                break;
            default:
                ra raVar = (ra) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = raVar.n;
                RectF rectF4 = raVar.o;
                if (!raVar.s) {
                    raVar.e();
                    float interpolation2 = raVar.k.getInterpolation(Math.min(1.0f, floatValue3 * 2.0f));
                    ui uiVar2 = raVar.a;
                    if (uiVar2 != null) {
                        uiVar2.y1(interpolation2);
                    } else {
                        raVar.c.setTranslationY(r5.getHeight() * interpolation2);
                    }
                    if (raVar.p != null && !rectF4.isEmpty()) {
                        m7 pendingDiamond = raVar.p.getPendingDiamond();
                        if (pendingDiamond != null) {
                            f4 f4Var = raVar.p;
                            TL_wallet.walletTransaction wallettransaction = raVar.f;
                            TL_wallet.walletTransaction wallettransaction2 = f4Var.S;
                            if (wallettransaction2 != null && d4.j(wallettransaction2, wallettransaction) && pendingDiamond.isAttachedToWindow()) {
                                rectF4.set(raVar.d(pendingDiamond));
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
                        raVar.c(centerX4, centerY2, ((rectF4.width() - rectF3.width()) * floatValue3) + rectF3.width());
                        if (floatValue3 < 0.92f) {
                            raVar.j.g(centerX4, centerY2);
                        }
                        raVar.h.invalidate();
                        break;
                    }
                }
                break;
        }
    }
}
