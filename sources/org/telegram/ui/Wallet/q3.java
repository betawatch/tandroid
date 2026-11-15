package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ki;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                o5 o5Var = (o5) this.b;
                o5Var.getClass();
                o5Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o5Var.invalidate();
                break;
            case 2:
                w5 w5Var = (w5) this.b;
                w5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w5Var.c.setRotationY(floatValue);
                boolean z10 = floatValue > 90.0f;
                w5Var.d.setVisibility(z10 ? 4 : 0);
                w5Var.e.setVisibility(z10 ? 0 : 4);
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
                    ki kiVar = o6Var.c;
                    if (kiVar != null) {
                        kiVar.x1(interpolation);
                    } else {
                        o6Var.b.setTranslationY(r7.getHeight() * interpolation);
                    }
                    if (o6Var.p != null && !rectF2.isEmpty()) {
                        org.telegram.ui.Cells.t0 K8 = o6Var.e.K8(o6Var.f);
                        org.telegram.ui.Cells.t0 t0Var = o6Var.p;
                        if (K8 != t0Var) {
                            t0Var.J0.i(false);
                            o6Var.p = K8;
                        }
                        org.telegram.ui.Cells.t0 t0Var2 = o6Var.p;
                        if (t0Var2 != null && !o6Var.s) {
                            t0Var2.J0.i(true);
                            b4 b4Var = o6Var.p.J0.m;
                            if (b4Var != null && b4Var.isAttachedToWindow()) {
                                rectF2.set(o6Var.c(b4Var));
                                o6Var.r = floatValue2;
                                float max = Math.max(0.0f, Math.min(1.0f, (floatValue2 - 0.25f) / 0.5f));
                                float C = com.google.android.gms.internal.vision.e2.C(max, 2.0f, 3.0f, max * max);
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
                w6Var2.j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w6Var2.e();
                break;
            case 5:
                p7 p7Var = (p7) this.b;
                p7Var.getClass();
                p7Var.n(((Float) valueAnimator.getAnimatedValue()).floatValue());
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
                editTextBoldCursor.setTranslationX((1.0f - u8Var.w) * i5.c.d(80.0f, u8Var.getWidth(), 0));
                u8Var.invalidate();
                break;
            case 8:
                p9 p9Var = (p9) this.b;
                p9Var.getClass();
                p9Var.y0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 9:
                o9 o9Var = (o9) this.b;
                o9Var.getClass();
                o9Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o9Var.c();
                break;
            default:
                da daVar = (da) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = daVar.n;
                RectF rectF4 = daVar.o;
                if (!daVar.s) {
                    daVar.e();
                    float interpolation2 = daVar.k.getInterpolation(Math.min(1.0f, floatValue3 * 2.0f));
                    ki kiVar2 = daVar.a;
                    if (kiVar2 != null) {
                        kiVar2.x1(interpolation2);
                    } else {
                        daVar.c.setTranslationY(r5.getHeight() * interpolation2);
                    }
                    if (daVar.p != null && !rectF4.isEmpty()) {
                        w6 pendingDiamond = daVar.p.getPendingDiamond();
                        if (pendingDiamond != null) {
                            v3 v3Var = daVar.p;
                            TL_wallet.walletTransaction wallettransaction = daVar.f;
                            TL_wallet.walletTransaction wallettransaction2 = v3Var.S;
                            if (wallettransaction2 != null && t3.i(wallettransaction2, wallettransaction) && pendingDiamond.isAttachedToWindow()) {
                                rectF4.set(daVar.d(pendingDiamond));
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
                        daVar.c(centerX4, centerY2, ((rectF4.width() - rectF3.width()) * floatValue3) + rectF3.width());
                        if (floatValue3 < 0.92f) {
                            daVar.j.g(centerX4, centerY2);
                        }
                        daVar.h.invalidate();
                        break;
                    }
                }
                break;
        }
    }
}
