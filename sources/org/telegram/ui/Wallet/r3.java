package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bi;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class r3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ((w3) this.b).setPendingProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                q5 q5Var = (q5) this.b;
                q5Var.getClass();
                q5Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q5Var.invalidate();
                break;
            case 2:
                z5 z5Var = (z5) this.b;
                z5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z5Var.b.setRotationY(floatValue);
                boolean z10 = floatValue > 90.0f;
                z5Var.c.setVisibility(z10 ? 4 : 0);
                z5Var.d.setVisibility(z10 ? 0 : 4);
                break;
            case 3:
                s6 s6Var = (s6) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q6 q6Var = s6Var.q;
                a7 a7Var = s6Var.i;
                RectF rectF = s6Var.n;
                RectF rectF2 = s6Var.o;
                if (!s6Var.v) {
                    s6Var.e();
                    float interpolation = s6Var.k.getInterpolation(Math.min(1.0f, floatValue2 * 2.0f));
                    bi biVar = s6Var.c;
                    if (biVar != null) {
                        biVar.w1(interpolation);
                    } else {
                        s6Var.b.setTranslationY(r7.getHeight() * interpolation);
                    }
                    if (s6Var.p != null && !rectF2.isEmpty()) {
                        org.telegram.ui.Cells.s0 B8 = s6Var.e.B8(s6Var.f);
                        org.telegram.ui.Cells.s0 s0Var = s6Var.p;
                        if (B8 != s0Var) {
                            s0Var.I0.i(false);
                            s6Var.p = B8;
                        }
                        org.telegram.ui.Cells.s0 s0Var2 = s6Var.p;
                        if (s0Var2 != null && !s6Var.s) {
                            s0Var2.I0.i(true);
                            c4 c4Var = s6Var.p.I0.m;
                            if (c4Var != null && c4Var.isAttachedToWindow()) {
                                rectF2.set(s6Var.c(c4Var));
                                s6Var.r = floatValue2;
                                float max = Math.max(0.0f, Math.min(1.0f, (floatValue2 - 0.25f) / 0.5f));
                                float D = c3.i0.D(max, 2.0f, 3.0f, max * max);
                                a7Var.setAlpha((1.0f - D) * s6Var.l);
                                q6Var.setAlpha(D);
                                s6Var.d();
                                float f7 = 1.0f - floatValue2;
                                float centerX = ((rectF2.centerX() - rectF.centerX()) * 0.35f) + rectF.centerX();
                                float min = Math.min(rectF.centerY(), rectF2.centerY()) - org.telegram.messenger.i0.L(150.0f);
                                float f10 = f7 * f7;
                                float f11 = f7 * 2.0f * floatValue2;
                                float f12 = floatValue2 * floatValue2;
                                float centerX2 = (rectF2.centerX() * f12) + (centerX * f11) + (rectF.centerX() * f10);
                                float centerY = (rectF2.centerY() * f12) + (f11 * min) + (rectF.centerY() * f10);
                                s6Var.b(centerX2, centerY, ((rectF2.width() - rectF.width()) * floatValue2) + rectF.width());
                                if (floatValue2 < 0.92f) {
                                    s6Var.j.g(centerX2, centerY);
                                }
                                s6Var.h.invalidate();
                                break;
                            } else {
                                rectF2.setEmpty();
                                a7Var.setAlpha(0.0f);
                                q6Var.setAlpha(0.0f);
                                break;
                            }
                        } else {
                            rectF2.setEmpty();
                            a7Var.setAlpha(0.0f);
                            q6Var.setAlpha(0.0f);
                            break;
                        }
                    }
                }
                break;
            case 4:
                a7 a7Var2 = (a7) this.b;
                a7Var2.getClass();
                a7Var2.i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a7Var2.e();
                break;
            case 5:
                u7 u7Var = (u7) this.b;
                u7Var.getClass();
                u7Var.n(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                v8 v8Var = (v8) this.b;
                v8Var.getClass();
                v8Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v8Var.invalidate();
                break;
            case 7:
                y8 y8Var = (y8) this.b;
                Float f13 = (Float) valueAnimator.getAnimatedValue();
                y8Var.w = f13.floatValue();
                y8Var.f.a(f13);
                View view = y8Var.a;
                view.setAlpha(1.0f - y8.c(0.05f, 0.45f, y8Var.w));
                view.setScaleX(1.0f - (y8Var.w * 0.06f));
                EditTextBoldCursor editTextBoldCursor = y8Var.b;
                editTextBoldCursor.setAlpha(y8.c(0.3f, 0.9f, y8Var.w));
                editTextBoldCursor.setTranslationX((1.0f - y8Var.w) * i0.a.d(80.0f, y8Var.getWidth(), 0));
                y8Var.invalidate();
                break;
            case 8:
                r9 r9Var = (r9) this.b;
                r9Var.getClass();
                r9Var.x0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 9:
                q9 q9Var = (q9) this.b;
                q9Var.getClass();
                q9Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q9Var.c();
                break;
            default:
                fa faVar = (fa) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = faVar.n;
                RectF rectF4 = faVar.o;
                if (!faVar.s) {
                    faVar.e();
                    float interpolation2 = faVar.k.getInterpolation(Math.min(1.0f, floatValue3 * 2.0f));
                    bi biVar2 = faVar.a;
                    if (biVar2 != null) {
                        biVar2.w1(interpolation2);
                    } else {
                        faVar.c.setTranslationY(r5.getHeight() * interpolation2);
                    }
                    if (faVar.p != null && !rectF4.isEmpty()) {
                        a7 pendingDiamond = faVar.p.getPendingDiamond();
                        if (pendingDiamond != null) {
                            w3 w3Var = faVar.p;
                            TL_wallet.walletTransaction wallettransaction = faVar.f;
                            TL_wallet.walletTransaction wallettransaction2 = w3Var.R;
                            if (wallettransaction2 != null && u3.i(wallettransaction2, wallettransaction) && pendingDiamond.isAttachedToWindow()) {
                                rectF4.set(faVar.d(pendingDiamond));
                            }
                        }
                        float f14 = 1.0f - floatValue3;
                        float centerX3 = ((rectF4.centerX() - rectF3.centerX()) * 0.35f) + rectF3.centerX();
                        float min2 = Math.min(rectF3.centerY(), rectF4.centerY()) - org.telegram.messenger.i0.L(150.0f);
                        float f15 = f14 * f14;
                        float f16 = f14 * 2.0f * floatValue3;
                        float f17 = floatValue3 * floatValue3;
                        float centerX4 = (rectF4.centerX() * f17) + (centerX3 * f16) + (rectF3.centerX() * f15);
                        float centerY2 = (rectF4.centerY() * f17) + (f16 * min2) + (rectF3.centerY() * f15);
                        faVar.c(centerX4, centerY2, ((rectF4.width() - rectF3.width()) * floatValue3) + rectF3.width());
                        if (floatValue3 < 0.92f) {
                            faVar.j.g(centerX4, centerY2);
                        }
                        faVar.h.invalidate();
                        break;
                    }
                }
                break;
        }
    }
}
