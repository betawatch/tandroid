package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                y yVar = (y) this.b;
                yVar.getClass();
                yVar.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yVar.requestLayout();
                break;
            case 1:
                m6 m6Var = (m6) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m6Var.q = floatValue;
                TimeInterpolator timeInterpolator = m6Var.x;
                if (timeInterpolator != null) {
                    floatValue = timeInterpolator.getInterpolation(floatValue);
                }
                m6Var.r = floatValue;
                m6Var.invalidateSelf();
                Runnable runnable = m6Var.c0;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 2:
                u6 u6Var = (u6) this.b;
                u6Var.a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                u6Var.invalidate();
                break;
            case 3:
                g8 g8Var = (g8) this.b;
                g8Var.D1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                g8Var.G1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 4:
                y8 y8Var = (y8) this.b;
                y8Var.getClass();
                y8Var.o0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 5:
                d9 d9Var = (d9) this.b;
                d9Var.getClass();
                d9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d9Var.d();
                break;
            case 6:
                s9 s9Var = (s9) this.b;
                s9Var.getClass();
                s9Var.g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s9Var.invalidateSelf();
                break;
            case 7:
                ga gaVar = (ga) this.b;
                gaVar.getClass();
                gaVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gaVar.b.invalidate();
                break;
            case 8:
                mc mcVar = (mc) this.b;
                mcVar.getClass();
                mcVar.j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mcVar.b();
                break;
            case 9:
                sg sgVar = (sg) this.b;
                sgVar.getClass();
                sgVar.g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 10:
                yh yhVar = (yh) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                si siVar = yhVar.e;
                sh shVar = siVar.v3;
                shVar.setAlpha(1.0f - floatValue2);
                siVar.C3.setAlpha(floatValue2);
                float L = floatValue2 * org.telegram.messenger.g0.L(36.0f);
                siVar.D3 = L;
                shVar.setTranslationY(L);
                break;
            case 11:
                sh shVar2 = (sh) this.b;
                si siVar2 = shVar2.b;
                siVar2.T3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                siVar2.A2.invalidate();
                siVar2.B2.invalidate();
                shVar2.invalidate();
                break;
            case 12:
                ((xk) this.b).setFeeVisibilityProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 13:
                mm mmVar = (mm) this.b;
                mmVar.getClass();
                mmVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mmVar.O.z.invalidate();
                break;
            case 14:
                to toVar = (to) this.b;
                toVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                toVar.d = floatValue3;
                toVar.setShown(floatValue3);
                toVar.a(false);
                break;
            case 15:
                lp lpVar = (lp) this.b;
                lpVar.getClass();
                lpVar.a2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lpVar.D1.setTranslationY((-org.telegram.messenger.g0.L(7.0f)) * lpVar.a2);
                break;
            case 16:
                qq qqVar = (qq) this.b;
                qqVar.getClass();
                qqVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = qqVar.H;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 17:
                bv bvVar = (bv) this.b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bvVar.E1 = floatValue4;
                bvVar.r1.setAlpha(floatValue4);
                bvVar.v1.setAlpha(bvVar.E1);
                bvVar.w1.setAlpha(bvVar.E1);
                bvVar.b.invalidate();
                break;
            case 18:
                uu uuVar = (uu) this.b;
                uuVar.getClass();
                uuVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (uuVar.getParent() instanceof View) {
                    ((View) uuVar.getParent()).invalidate();
                    break;
                }
                break;
            case 19:
                xu xuVar = (xu) this.b;
                xuVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xuVar.w = floatValue5;
                TextView textView = xuVar.c;
                textView.setScaleX(1.0f - floatValue5);
                textView.setScaleY(1.0f - xuVar.w);
                textView.setAlpha(1.0f - xuVar.w);
                TextView textView2 = xuVar.d;
                textView2.setScaleX(xuVar.w);
                textView2.setScaleY(xuVar.w);
                textView2.setAlpha(xuVar.w);
                break;
            case 20:
                hv hvVar = (hv) this.b;
                hvVar.getClass();
                hvVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hvVar.d();
                break;
            case 21:
                jv jvVar = (jv) this.b;
                jvVar.getClass();
                jvVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jvVar.invalidate();
                jvVar.requestLayout();
                jvVar.c();
                jvVar.s.b.invalidate();
                break;
            case 22:
                zx zxVar = (zx) this.b;
                zxVar.getClass();
                zxVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zxVar.invalidate();
                break;
            case 23:
                ey eyVar = (ey) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eyVar.x = floatValue6;
                View view2 = eyVar.w;
                if (view2 == null) {
                    ai.k0 k0Var = eyVar.s;
                    if (k0Var != null) {
                        k0Var.invalidate();
                        break;
                    }
                } else {
                    view2.setAlpha(floatValue6);
                    break;
                }
                break;
            case 24:
                ((pz) this.b).setUnreadOnlyBannerProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 25:
                pz pzVar = ((iz) this.b).F;
                pzVar.G.invalidate();
                pzVar.invalidate();
                break;
            case 26:
                vz vzVar = (vz) this.b;
                vzVar.getClass();
                vzVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vzVar.invalidate();
                break;
            case 27:
                z10 z10Var = (z10) this.b;
                x10 x10Var = z10Var.a;
                if (!z10Var.H) {
                    float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    z10Var.d0 = floatValue7;
                    z10Var.W.setPinnedProgress(floatValue7);
                    x10Var.setScaleX(1.0f - (z10Var.d0 * 0.6f));
                    x10Var.setScaleY(1.0f - (z10Var.d0 * 0.6f));
                    if (z10Var.Y) {
                        z10Var.j();
                        break;
                    }
                }
                break;
            case 28:
                z40 z40Var = (z40) this.b;
                if (!z40Var.s0) {
                    CameraSession cameraSession = z40Var.t0;
                    if (cameraSession != null) {
                        cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                } else {
                    Camera2Session camera2Session = z40Var.w0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                }
                break;
            default:
                j60 j60Var = (j60) this.b;
                j60Var.getClass();
                j60Var.c2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j60Var.b.invalidate();
                break;
        }
    }
}
