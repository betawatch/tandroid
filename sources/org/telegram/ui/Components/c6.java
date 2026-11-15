package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class c6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c6(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                g6 g6Var = (g6) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g6Var.q = floatValue;
                TimeInterpolator timeInterpolator = g6Var.x;
                if (timeInterpolator != null) {
                    floatValue = timeInterpolator.getInterpolation(floatValue);
                }
                g6Var.r = floatValue;
                g6Var.invalidateSelf();
                Runnable runnable = g6Var.c0;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                o6 o6Var = (o6) this.b;
                o6Var.a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                o6Var.invalidate();
                break;
            case 2:
                y7 y7Var = (y7) this.b;
                y7Var.D1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                y7Var.G1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 3:
                q8 q8Var = (q8) this.b;
                q8Var.getClass();
                q8Var.o0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                v8 v8Var = (v8) this.b;
                v8Var.getClass();
                v8Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v8Var.d();
                break;
            case 5:
                k9 k9Var = (k9) this.b;
                k9Var.getClass();
                k9Var.g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k9Var.invalidateSelf();
                break;
            case 6:
                y9 y9Var = (y9) this.b;
                y9Var.getClass();
                y9Var.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9Var.b.invalidate();
                break;
            case 7:
                dc dcVar = (dc) this.b;
                dcVar.getClass();
                dcVar.j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dcVar.b();
                break;
            case 8:
                jg jgVar = (jg) this.b;
                jgVar.getClass();
                jgVar.g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 9:
                qh qhVar = (qh) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ki kiVar = qhVar.e;
                kh khVar = kiVar.v3;
                khVar.setAlpha(1.0f - floatValue2);
                kiVar.C3.setAlpha(floatValue2);
                float L = floatValue2 * org.telegram.messenger.g0.L(36.0f);
                kiVar.D3 = L;
                khVar.setTranslationY(L);
                break;
            case 10:
                kh khVar2 = (kh) this.b;
                ki kiVar2 = khVar2.b;
                kiVar2.T3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kiVar2.A2.invalidate();
                kiVar2.B2.invalidate();
                khVar2.invalidate();
                break;
            case 11:
                ((qk) this.b).setFeeVisibilityProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 12:
                fm fmVar = (fm) this.b;
                fmVar.getClass();
                fmVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fmVar.O.z.invalidate();
                break;
            case 13:
                mo moVar = (mo) this.b;
                moVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                moVar.d = floatValue3;
                moVar.setShown(floatValue3);
                moVar.a(false);
                break;
            case 14:
                ep epVar = (ep) this.b;
                epVar.getClass();
                epVar.a2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                epVar.D1.setTranslationY((-org.telegram.messenger.g0.L(7.0f)) * epVar.a2);
                break;
            case 15:
                jq jqVar = (jq) this.b;
                jqVar.getClass();
                jqVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = jqVar.H;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 16:
                wu wuVar = (wu) this.b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wuVar.E1 = floatValue4;
                wuVar.r1.setAlpha(floatValue4);
                wuVar.v1.setAlpha(wuVar.E1);
                wuVar.w1.setAlpha(wuVar.E1);
                wuVar.b.invalidate();
                break;
            case 17:
                pu puVar = (pu) this.b;
                puVar.getClass();
                puVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (puVar.getParent() instanceof View) {
                    ((View) puVar.getParent()).invalidate();
                    break;
                }
                break;
            case 18:
                su suVar = (su) this.b;
                suVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                suVar.w = floatValue5;
                TextView textView = suVar.c;
                textView.setScaleX(1.0f - floatValue5);
                textView.setScaleY(1.0f - suVar.w);
                textView.setAlpha(1.0f - suVar.w);
                TextView textView2 = suVar.d;
                textView2.setScaleX(suVar.w);
                textView2.setScaleY(suVar.w);
                textView2.setAlpha(suVar.w);
                break;
            case 19:
                cv cvVar = (cv) this.b;
                cvVar.getClass();
                cvVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cvVar.d();
                break;
            case 20:
                ev evVar = (ev) this.b;
                evVar.getClass();
                evVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                evVar.invalidate();
                evVar.requestLayout();
                evVar.c();
                evVar.s.b.invalidate();
                break;
            case 21:
                ux uxVar = (ux) this.b;
                uxVar.getClass();
                uxVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uxVar.invalidate();
                break;
            case 22:
                yx yxVar = (yx) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yxVar.x = floatValue6;
                View view2 = yxVar.w;
                if (view2 == null) {
                    ai.k0 k0Var = yxVar.s;
                    if (k0Var != null) {
                        k0Var.invalidate();
                        break;
                    }
                } else {
                    view2.setAlpha(floatValue6);
                    break;
                }
                break;
            case 23:
                iz izVar = ((cz) this.b).F;
                izVar.G.invalidate();
                izVar.invalidate();
                break;
            case 24:
                oz ozVar = (oz) this.b;
                ozVar.getClass();
                ozVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ozVar.invalidate();
                break;
            case 25:
                s10 s10Var = (s10) this.b;
                q10 q10Var = s10Var.a;
                if (!s10Var.H) {
                    float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    s10Var.d0 = floatValue7;
                    s10Var.W.setPinnedProgress(floatValue7);
                    q10Var.setScaleX(1.0f - (s10Var.d0 * 0.6f));
                    q10Var.setScaleY(1.0f - (s10Var.d0 * 0.6f));
                    if (s10Var.Y) {
                        s10Var.j();
                        break;
                    }
                }
                break;
            case 26:
                r40 r40Var = (r40) this.b;
                if (!r40Var.s0) {
                    CameraSession cameraSession = r40Var.t0;
                    if (cameraSession != null) {
                        cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                } else {
                    Camera2Session camera2Session = r40Var.w0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                }
                break;
            case 27:
                a60 a60Var = (a60) this.b;
                a60Var.getClass();
                a60Var.c2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a60Var.b.invalidate();
                break;
            default:
                a60 a60Var2 = ((z50) this.b).e;
                a60Var2.f2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                a60Var2.b.invalidate();
                break;
        }
    }
}
