package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                e8 e8Var = (e8) this.b;
                e8Var.D1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                e8Var.G1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 4:
                x8 x8Var = (x8) this.b;
                x8Var.getClass();
                x8Var.o0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 5:
                c9 c9Var = (c9) this.b;
                c9Var.getClass();
                c9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c9Var.d();
                break;
            case 6:
                r9 r9Var = (r9) this.b;
                r9Var.getClass();
                r9Var.g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r9Var.invalidateSelf();
                break;
            case 7:
                fa faVar = (fa) this.b;
                faVar.getClass();
                faVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                faVar.b.invalidate();
                break;
            case 8:
                lc lcVar = (lc) this.b;
                lcVar.getClass();
                lcVar.j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lcVar.b();
                break;
            case 9:
                tg tgVar = (tg) this.b;
                tgVar.getClass();
                tgVar.g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 10:
                zh zhVar = (zh) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ti tiVar = zhVar.e;
                th thVar = tiVar.v3;
                thVar.setAlpha(1.0f - floatValue2);
                tiVar.C3.setAlpha(floatValue2);
                float L = floatValue2 * org.telegram.messenger.g0.L(36.0f);
                tiVar.D3 = L;
                thVar.setTranslationY(L);
                break;
            case 11:
                th thVar2 = (th) this.b;
                ti tiVar2 = thVar2.b;
                tiVar2.T3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tiVar2.A2.invalidate();
                tiVar2.B2.invalidate();
                thVar2.invalidate();
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
                so soVar = (so) this.b;
                soVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                soVar.d = floatValue3;
                soVar.setShown(floatValue3);
                soVar.a(false);
                break;
            case 15:
                kp kpVar = (kp) this.b;
                kpVar.getClass();
                kpVar.a2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kpVar.D1.setTranslationY((-org.telegram.messenger.g0.L(7.0f)) * kpVar.a2);
                break;
            case 16:
                pq pqVar = (pq) this.b;
                pqVar.getClass();
                pqVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = pqVar.H;
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
                yx yxVar = (yx) this.b;
                yxVar.getClass();
                yxVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yxVar.invalidate();
                break;
            case 23:
                dy dyVar = (dy) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dyVar.x = floatValue6;
                View view2 = dyVar.w;
                if (view2 == null) {
                    ai.h0 h0Var = dyVar.s;
                    if (h0Var != null) {
                        h0Var.invalidate();
                        break;
                    }
                } else {
                    view2.setAlpha(floatValue6);
                    break;
                }
                break;
            case 24:
                ((oz) this.b).setUnreadOnlyBannerProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 25:
                oz ozVar = ((hz) this.b).F;
                ozVar.G.invalidate();
                ozVar.invalidate();
                break;
            case 26:
                uz uzVar = (uz) this.b;
                uzVar.getClass();
                uzVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uzVar.invalidate();
                break;
            case 27:
                a20 a20Var = (a20) this.b;
                y10 y10Var = a20Var.a;
                if (!a20Var.H) {
                    float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    a20Var.d0 = floatValue7;
                    a20Var.W.setPinnedProgress(floatValue7);
                    y10Var.setScaleX(1.0f - (a20Var.d0 * 0.6f));
                    y10Var.setScaleY(1.0f - (a20Var.d0 * 0.6f));
                    if (a20Var.Y) {
                        a20Var.j();
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
                i60 i60Var = (i60) this.b;
                i60Var.getClass();
                i60Var.c2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i60Var.b.invalidate();
                break;
        }
    }
}
