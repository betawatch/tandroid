package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ti;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ((f3) this.b).setPendingProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                c5 c5Var = (c5) this.b;
                c5Var.getClass();
                c5Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c5Var.invalidate();
                break;
            case 2:
                m5 m5Var = (m5) this.b;
                m5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m5Var.b.setRotationY(floatValue);
                boolean z10 = floatValue > 90.0f;
                m5Var.c.setVisibility(z10 ? 4 : 0);
                m5Var.d.setVisibility(z10 ? 0 : 4);
                break;
            case 3:
                e6 e6Var = (e6) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c6 c6Var = e6Var.q;
                m6 m6Var = e6Var.i;
                RectF rectF = e6Var.n;
                RectF rectF2 = e6Var.o;
                if (!e6Var.v) {
                    e6Var.e();
                    float interpolation = e6Var.k.getInterpolation(Math.min(1.0f, floatValue2 * 2.0f));
                    ti tiVar = e6Var.c;
                    if (tiVar != null) {
                        tiVar.Q1(interpolation);
                    } else {
                        e6Var.b.setTranslationY(r7.getHeight() * interpolation);
                    }
                    if (e6Var.p != null && !rectF2.isEmpty()) {
                        org.telegram.ui.Cells.v0 u82 = e6Var.e.u8(e6Var.f);
                        org.telegram.ui.Cells.v0 v0Var = e6Var.p;
                        if (u82 != v0Var) {
                            v0Var.I0.i(false);
                            e6Var.p = u82;
                        }
                        org.telegram.ui.Cells.v0 v0Var2 = e6Var.p;
                        if (v0Var2 != null && !e6Var.s) {
                            v0Var2.I0.i(true);
                            l3 l3Var = e6Var.p.I0.m;
                            if (l3Var != null && l3Var.isAttachedToWindow()) {
                                rectF2.set(e6Var.c(l3Var));
                                e6Var.r = floatValue2;
                                float max = Math.max(0.0f, Math.min(1.0f, (floatValue2 - 0.25f) / 0.5f));
                                float B = com.google.android.gms.internal.play_billing.k3.B(max, 2.0f, 3.0f, max * max);
                                m6Var.setAlpha((1.0f - B) * e6Var.l);
                                c6Var.setAlpha(B);
                                e6Var.d();
                                float f7 = 1.0f - floatValue2;
                                float centerX = ((rectF2.centerX() - rectF.centerX()) * 0.35f) + rectF.centerX();
                                float min = Math.min(rectF.centerY(), rectF2.centerY()) - AndroidUtilities.dp(150.0f);
                                float f10 = f7 * f7;
                                float f11 = f7 * 2.0f * floatValue2;
                                float f12 = floatValue2 * floatValue2;
                                float centerX2 = (rectF2.centerX() * f12) + (centerX * f11) + (rectF.centerX() * f10);
                                float centerY = (rectF2.centerY() * f12) + (f11 * min) + (rectF.centerY() * f10);
                                e6Var.b(centerX2, centerY, ((rectF2.width() - rectF.width()) * floatValue2) + rectF.width());
                                if (floatValue2 < 0.92f) {
                                    e6Var.j.g(centerX2, centerY);
                                }
                                e6Var.h.invalidate();
                                break;
                            } else {
                                rectF2.setEmpty();
                                m6Var.setAlpha(0.0f);
                                c6Var.setAlpha(0.0f);
                                break;
                            }
                        } else {
                            rectF2.setEmpty();
                            m6Var.setAlpha(0.0f);
                            c6Var.setAlpha(0.0f);
                            break;
                        }
                    }
                }
                break;
            case 4:
                m6 m6Var2 = (m6) this.b;
                m6Var2.getClass();
                m6Var2.i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m6Var2.e();
                break;
            case 5:
                g7 g7Var = (g7) this.b;
                g7Var.getClass();
                g7Var.n(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                k8 k8Var = (k8) this.b;
                k8Var.getClass();
                k8Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k8Var.invalidate();
                break;
            case 7:
                o8 o8Var = (o8) this.b;
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                o8Var.v = f13.floatValue();
                o8Var.f.run(f13);
                View view = o8Var.a;
                view.setAlpha(1.0f - o8.c(0.05f, 0.45f, o8Var.v));
                view.setScaleX(1.0f - (o8Var.v * 0.06f));
                EditTextBoldCursor editTextBoldCursor = o8Var.b;
                editTextBoldCursor.setAlpha(o8.c(0.3f, 0.9f, o8Var.v));
                editTextBoldCursor.setTranslationX((1.0f - o8Var.v) * i2.o1.g(80.0f, o8Var.getWidth(), 0));
                o8Var.invalidate();
                break;
            case 8:
                j9 j9Var = (j9) this.b;
                j9Var.getClass();
                j9Var.t0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 9:
                i9 i9Var = (i9) this.b;
                i9Var.getClass();
                i9Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9Var.c();
                break;
            default:
                w9 w9Var = (w9) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = w9Var.n;
                RectF rectF4 = w9Var.o;
                if (!w9Var.s) {
                    w9Var.e();
                    float interpolation2 = w9Var.k.getInterpolation(Math.min(1.0f, floatValue3 * 2.0f));
                    ti tiVar2 = w9Var.a;
                    if (tiVar2 != null) {
                        tiVar2.Q1(interpolation2);
                    } else {
                        w9Var.c.setTranslationY(r5.getHeight() * interpolation2);
                    }
                    if (w9Var.p != null && !rectF4.isEmpty()) {
                        m6 pendingDiamond = w9Var.p.getPendingDiamond();
                        if (pendingDiamond != null) {
                            f3 f3Var = w9Var.p;
                            TL_wallet.walletTransaction wallettransaction = w9Var.f;
                            TL_wallet.walletTransaction wallettransaction2 = f3Var.R;
                            if (wallettransaction2 != null && d3.a(wallettransaction2, wallettransaction) && pendingDiamond.isAttachedToWindow()) {
                                rectF4.set(w9Var.d(pendingDiamond));
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
                        w9Var.c(centerX4, centerY2, ((rectF4.width() - rectF3.width()) * floatValue3) + rectF3.width());
                        if (floatValue3 < 0.92f) {
                            w9Var.j.g(centerX4, centerY2);
                        }
                        w9Var.h.invalidate();
                        break;
                    }
                }
                break;
        }
    }
}
