package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ti;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class b3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ((g3) this.b).setPendingProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                d5 d5Var = (d5) this.b;
                d5Var.getClass();
                d5Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d5Var.invalidate();
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
                        tiVar.M1(interpolation);
                    } else {
                        e6Var.b.setTranslationY(r7.getHeight() * interpolation);
                    }
                    if (e6Var.p != null && !rectF2.isEmpty()) {
                        org.telegram.ui.Cells.w0 u82 = e6Var.e.u8(e6Var.f);
                        org.telegram.ui.Cells.w0 w0Var = e6Var.p;
                        if (u82 != w0Var) {
                            w0Var.I0.i(false);
                            e6Var.p = u82;
                        }
                        org.telegram.ui.Cells.w0 w0Var2 = e6Var.p;
                        if (w0Var2 != null && !e6Var.s) {
                            w0Var2.I0.i(true);
                            m3 m3Var = e6Var.p.I0.m;
                            if (m3Var != null && m3Var.isAttachedToWindow()) {
                                rectF2.set(e6Var.c(m3Var));
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
                g7Var.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                j8 j8Var = (j8) this.b;
                j8Var.getClass();
                j8Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j8Var.invalidate();
                break;
            case 7:
                n8 n8Var = (n8) this.b;
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                n8Var.v = f13.floatValue();
                n8Var.f.run(f13);
                View view = n8Var.a;
                view.setAlpha(1.0f - n8.c(0.05f, 0.45f, n8Var.v));
                view.setScaleX(1.0f - (n8Var.v * 0.06f));
                EditTextBoldCursor editTextBoldCursor = n8Var.b;
                editTextBoldCursor.setAlpha(n8.c(0.3f, 0.9f, n8Var.v));
                editTextBoldCursor.setTranslationX((1.0f - n8Var.v) * org.telegram.messenger.g0.b(80.0f, n8Var.getWidth(), 0));
                n8Var.invalidate();
                break;
            case 8:
                i9 i9Var = (i9) this.b;
                i9Var.getClass();
                i9Var.s0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 9:
                h9 h9Var = (h9) this.b;
                h9Var.getClass();
                h9Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h9Var.c();
                break;
            default:
                v9 v9Var = (v9) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = v9Var.n;
                RectF rectF4 = v9Var.o;
                if (!v9Var.s) {
                    v9Var.e();
                    float interpolation2 = v9Var.k.getInterpolation(Math.min(1.0f, floatValue3 * 2.0f));
                    ti tiVar2 = v9Var.a;
                    if (tiVar2 != null) {
                        tiVar2.M1(interpolation2);
                    } else {
                        v9Var.c.setTranslationY(r5.getHeight() * interpolation2);
                    }
                    if (v9Var.p != null && !rectF4.isEmpty()) {
                        m6 pendingDiamond = v9Var.p.getPendingDiamond();
                        if (pendingDiamond != null) {
                            g3 g3Var = v9Var.p;
                            TL_wallet.walletTransaction wallettransaction = v9Var.f;
                            TL_wallet.walletTransaction wallettransaction2 = g3Var.R;
                            if (wallettransaction2 != null && e3.a(wallettransaction2, wallettransaction) && pendingDiamond.isAttachedToWindow()) {
                                rectF4.set(v9Var.d(pendingDiamond));
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
                        v9Var.c(centerX4, centerY2, ((rectF4.width() - rectF3.width()) * floatValue3) + rectF3.width());
                        if (floatValue3 < 0.92f) {
                            v9Var.j.g(centerX4, centerY2);
                        }
                        v9Var.h.invalidate();
                        break;
                    }
                }
                break;
        }
    }
}
