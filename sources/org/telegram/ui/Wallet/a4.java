package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ti;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class a4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a4(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ((g4) this.b).setPendingProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                e6 e6Var = (e6) this.b;
                e6Var.getClass();
                e6Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e6Var.invalidate();
                break;
            case 2:
                m6 m6Var = (m6) this.b;
                m6Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m6Var.c.setRotationY(floatValue);
                boolean z10 = floatValue > 90.0f;
                m6Var.d.setVisibility(z10 ? 4 : 0);
                m6Var.e.setVisibility(z10 ? 0 : 4);
                break;
            case 3:
                f7 f7Var = (f7) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d7 d7Var = f7Var.q;
                n7 n7Var = f7Var.i;
                RectF rectF = f7Var.n;
                RectF rectF2 = f7Var.o;
                if (!f7Var.v) {
                    f7Var.e();
                    float interpolation = f7Var.k.getInterpolation(Math.min(1.0f, floatValue2 * 2.0f));
                    ti tiVar = f7Var.c;
                    if (tiVar != null) {
                        tiVar.y1(interpolation);
                    } else {
                        f7Var.b.setTranslationY(r7.getHeight() * interpolation);
                    }
                    if (f7Var.p != null && !rectF2.isEmpty()) {
                        org.telegram.ui.Cells.v0 K8 = f7Var.e.K8(f7Var.f);
                        org.telegram.ui.Cells.v0 v0Var = f7Var.p;
                        if (K8 != v0Var) {
                            v0Var.J0.i(false);
                            f7Var.p = K8;
                        }
                        org.telegram.ui.Cells.v0 v0Var2 = f7Var.p;
                        if (v0Var2 != null && !f7Var.s) {
                            v0Var2.J0.i(true);
                            m4 m4Var = f7Var.p.J0.m;
                            if (m4Var != null && m4Var.isAttachedToWindow()) {
                                rectF2.set(f7Var.c(m4Var));
                                f7Var.r = floatValue2;
                                float max = Math.max(0.0f, Math.min(1.0f, (floatValue2 - 0.25f) / 0.5f));
                                float C = com.google.android.gms.internal.vision.e2.C(max, 2.0f, 3.0f, max * max);
                                n7Var.setAlpha((1.0f - C) * f7Var.l);
                                d7Var.setAlpha(C);
                                f7Var.d();
                                float f10 = 1.0f - floatValue2;
                                float centerX = ((rectF2.centerX() - rectF.centerX()) * 0.35f) + rectF.centerX();
                                float min = Math.min(rectF.centerY(), rectF2.centerY()) - org.telegram.messenger.g0.L(150.0f);
                                float f11 = f10 * f10;
                                float f12 = f10 * 2.0f * floatValue2;
                                float f13 = floatValue2 * floatValue2;
                                float centerX2 = (rectF2.centerX() * f13) + (centerX * f12) + (rectF.centerX() * f11);
                                float centerY = (rectF2.centerY() * f13) + (f12 * min) + (rectF.centerY() * f11);
                                f7Var.b(centerX2, centerY, ((rectF2.width() - rectF.width()) * floatValue2) + rectF.width());
                                if (floatValue2 < 0.92f) {
                                    f7Var.j.g(centerX2, centerY);
                                }
                                f7Var.h.invalidate();
                                break;
                            } else {
                                rectF2.setEmpty();
                                n7Var.setAlpha(0.0f);
                                d7Var.setAlpha(0.0f);
                                break;
                            }
                        } else {
                            rectF2.setEmpty();
                            n7Var.setAlpha(0.0f);
                            d7Var.setAlpha(0.0f);
                            break;
                        }
                    }
                }
                break;
            case 4:
                n7 n7Var2 = (n7) this.b;
                n7Var2.getClass();
                n7Var2.j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n7Var2.e();
                break;
            case 5:
                f8 f8Var = (f8) this.b;
                f8Var.getClass();
                f8Var.n(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                g9 g9Var = (g9) this.b;
                g9Var.getClass();
                g9Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g9Var.invalidate();
                break;
            case 7:
                k9 k9Var = (k9) this.b;
                Float f14 = (Float) valueAnimator.getAnimatedValue();
                k9Var.w = f14.floatValue();
                k9Var.f.a(f14);
                View view = k9Var.a;
                view.setAlpha(1.0f - k9.c(0.05f, 0.45f, k9Var.w));
                view.setScaleX(1.0f - (k9Var.w * 0.06f));
                EditTextBoldCursor editTextBoldCursor = k9Var.b;
                editTextBoldCursor.setAlpha(k9.c(0.3f, 0.9f, k9Var.w));
                editTextBoldCursor.setTranslationX((1.0f - k9Var.w) * i5.c.d(80.0f, k9Var.getWidth(), 0));
                k9Var.invalidate();
                break;
            case 8:
                ea eaVar = (ea) this.b;
                eaVar.getClass();
                eaVar.y0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 9:
                da daVar = (da) this.b;
                daVar.getClass();
                daVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                daVar.c();
                break;
            default:
                sa saVar = (sa) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = saVar.n;
                RectF rectF4 = saVar.o;
                if (!saVar.s) {
                    saVar.e();
                    float interpolation2 = saVar.k.getInterpolation(Math.min(1.0f, floatValue3 * 2.0f));
                    ti tiVar2 = saVar.a;
                    if (tiVar2 != null) {
                        tiVar2.y1(interpolation2);
                    } else {
                        saVar.c.setTranslationY(r5.getHeight() * interpolation2);
                    }
                    if (saVar.p != null && !rectF4.isEmpty()) {
                        n7 pendingDiamond = saVar.p.getPendingDiamond();
                        if (pendingDiamond != null) {
                            g4 g4Var = saVar.p;
                            TL_wallet.walletTransaction wallettransaction = saVar.f;
                            TL_wallet.walletTransaction wallettransaction2 = g4Var.S;
                            if (wallettransaction2 != null && e4.j(wallettransaction2, wallettransaction) && pendingDiamond.isAttachedToWindow()) {
                                rectF4.set(saVar.d(pendingDiamond));
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
                        saVar.c(centerX4, centerY2, ((rectF4.width() - rectF3.width()) * floatValue3) + rectF3.width());
                        if (floatValue3 < 0.92f) {
                            saVar.j.g(centerX4, centerY2);
                        }
                        saVar.h.invalidate();
                        break;
                    }
                }
                break;
        }
    }
}
