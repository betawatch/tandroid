package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d6(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                h6 h6Var = (h6) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h6Var.q = floatValue;
                TimeInterpolator timeInterpolator = h6Var.x;
                if (timeInterpolator != null) {
                    floatValue = timeInterpolator.getInterpolation(floatValue);
                }
                h6Var.r = floatValue;
                h6Var.invalidateSelf();
                Runnable runnable = h6Var.b0;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                p6 p6Var = (p6) this.b;
                p6Var.a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                p6Var.invalidate();
                break;
            case 2:
                a8 a8Var = (a8) this.b;
                a8Var.C1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                a8Var.F1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 3:
                s8 s8Var = (s8) this.b;
                s8Var.getClass();
                s8Var.o0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                x8 x8Var = (x8) this.b;
                x8Var.getClass();
                x8Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x8Var.d();
                break;
            case 5:
                m9 m9Var = (m9) this.b;
                m9Var.getClass();
                m9Var.g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m9Var.invalidateSelf();
                break;
            case 6:
                ba baVar = (ba) this.b;
                baVar.getClass();
                baVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                baVar.b.invalidate();
                break;
            case 7:
                hc hcVar = (hc) this.b;
                hcVar.getClass();
                hcVar.j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hcVar.b();
                break;
            case 8:
                cg cgVar = (cg) this.b;
                cgVar.getClass();
                cgVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 9:
                ih ihVar = (ih) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ci ciVar = ihVar.e;
                ch chVar = ciVar.u3;
                chVar.setAlpha(1.0f - floatValue2);
                ciVar.B3.setAlpha(floatValue2);
                float L = floatValue2 * org.telegram.messenger.g0.L(36.0f);
                ciVar.C3 = L;
                chVar.setTranslationY(L);
                break;
            case 10:
                ch chVar2 = (ch) this.b;
                ci ciVar2 = chVar2.b;
                ciVar2.S3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ciVar2.z2.invalidate();
                ciVar2.A2.invalidate();
                chVar2.invalidate();
                break;
            case 11:
                ((hk) this.b).setFeeVisibilityProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 12:
                xl xlVar = (xl) this.b;
                xlVar.getClass();
                xlVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xlVar.O.z.invalidate();
                break;
            case 13:
                bo boVar = (bo) this.b;
                boVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                boVar.d = floatValue3;
                boVar.setShown(floatValue3);
                boVar.a(false);
                break;
            case 14:
                vo voVar = (vo) this.b;
                voVar.getClass();
                voVar.Z1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                voVar.C1.setTranslationY((-org.telegram.messenger.g0.L(7.0f)) * voVar.Z1);
                break;
            case 15:
                bq bqVar = (bq) this.b;
                bqVar.getClass();
                bqVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = bqVar.H;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 16:
                qu quVar = (qu) this.b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                quVar.D1 = floatValue4;
                quVar.q1.setAlpha(floatValue4);
                quVar.u1.setAlpha(quVar.D1);
                quVar.v1.setAlpha(quVar.D1);
                quVar.b.invalidate();
                break;
            case 17:
                ju juVar = (ju) this.b;
                juVar.getClass();
                juVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (juVar.getParent() instanceof View) {
                    ((View) juVar.getParent()).invalidate();
                    break;
                }
                break;
            case 18:
                mu muVar = (mu) this.b;
                muVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                muVar.w = floatValue5;
                TextView textView = muVar.c;
                textView.setScaleX(1.0f - floatValue5);
                textView.setScaleY(1.0f - muVar.w);
                textView.setAlpha(1.0f - muVar.w);
                TextView textView2 = muVar.d;
                textView2.setScaleX(muVar.w);
                textView2.setScaleY(muVar.w);
                textView2.setAlpha(muVar.w);
                break;
            case 19:
                wu wuVar = (wu) this.b;
                wuVar.getClass();
                wuVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wuVar.d();
                break;
            case 20:
                yu yuVar = (yu) this.b;
                yuVar.getClass();
                yuVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yuVar.invalidate();
                yuVar.requestLayout();
                yuVar.c();
                yuVar.s.b.invalidate();
                break;
            case 21:
                px pxVar = (px) this.b;
                pxVar.getClass();
                pxVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pxVar.invalidate();
                break;
            case 22:
                tx txVar = (tx) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                txVar.x = floatValue6;
                View view2 = txVar.w;
                if (view2 == null) {
                    bi.x5 x5Var = txVar.s;
                    if (x5Var != null) {
                        x5Var.invalidate();
                        break;
                    }
                } else {
                    view2.setAlpha(floatValue6);
                    break;
                }
                break;
            case 23:
                ez ezVar = ((yy) this.b).F;
                ezVar.F.invalidate();
                ezVar.invalidate();
                break;
            case 24:
                kz kzVar = (kz) this.b;
                kzVar.getClass();
                kzVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kzVar.invalidate();
                break;
            case 25:
                p10 p10Var = (p10) this.b;
                m10 m10Var = p10Var.a;
                if (!p10Var.G) {
                    float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    p10Var.c0 = floatValue7;
                    p10Var.V.setPinnedProgress(floatValue7);
                    m10Var.setScaleX(1.0f - (p10Var.c0 * 0.6f));
                    m10Var.setScaleY(1.0f - (p10Var.c0 * 0.6f));
                    if (p10Var.X) {
                        p10Var.j();
                        break;
                    }
                }
                break;
            case 26:
                o40 o40Var = (o40) this.b;
                if (!o40Var.r0) {
                    CameraSession cameraSession = o40Var.s0;
                    if (cameraSession != null) {
                        cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                } else {
                    Camera2Session camera2Session = o40Var.v0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                }
                break;
            case 27:
                x50 x50Var = (x50) this.b;
                x50Var.getClass();
                x50Var.b2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x50Var.b.invalidate();
                break;
            default:
                x50 x50Var2 = ((w50) this.b).e;
                x50Var2.e2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                x50Var2.b.invalidate();
                break;
        }
    }
}
