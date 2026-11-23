package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                z zVar = (z) this.b;
                zVar.getClass();
                zVar.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zVar.requestLayout();
                break;
            case 1:
                n6 n6Var = (n6) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n6Var.q = floatValue;
                TimeInterpolator timeInterpolator = n6Var.x;
                if (timeInterpolator != null) {
                    floatValue = timeInterpolator.getInterpolation(floatValue);
                }
                n6Var.r = floatValue;
                n6Var.invalidateSelf();
                Runnable runnable = n6Var.c0;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 2:
                v6 v6Var = (v6) this.b;
                v6Var.a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                v6Var.invalidate();
                break;
            case 3:
                f8 f8Var = (f8) this.b;
                f8Var.D1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                f8Var.G1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
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
                ug ugVar = (ug) this.b;
                ugVar.getClass();
                ugVar.g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 10:
                ai aiVar = (ai) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ui uiVar = aiVar.e;
                uh uhVar = uiVar.v3;
                uhVar.setAlpha(1.0f - floatValue2);
                uiVar.C3.setAlpha(floatValue2);
                float L = floatValue2 * org.telegram.messenger.g0.L(36.0f);
                uiVar.D3 = L;
                uhVar.setTranslationY(L);
                break;
            case 11:
                uh uhVar2 = (uh) this.b;
                ui uiVar2 = uhVar2.b;
                uiVar2.T3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uiVar2.A2.invalidate();
                uiVar2.B2.invalidate();
                uhVar2.invalidate();
                break;
            case 12:
                ((zk) this.b).setFeeVisibilityProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 13:
                om omVar = (om) this.b;
                omVar.getClass();
                omVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                omVar.O.z.invalidate();
                break;
            case 14:
                vo voVar = (vo) this.b;
                voVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                voVar.d = floatValue3;
                voVar.setShown(floatValue3);
                voVar.a(false);
                break;
            case 15:
                np npVar = (np) this.b;
                npVar.getClass();
                npVar.a2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                npVar.D1.setTranslationY((-org.telegram.messenger.g0.L(7.0f)) * npVar.a2);
                break;
            case 16:
                sq sqVar = (sq) this.b;
                sqVar.getClass();
                sqVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = sqVar.H;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 17:
                ev evVar = (ev) this.b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                evVar.E1 = floatValue4;
                evVar.r1.setAlpha(floatValue4);
                evVar.v1.setAlpha(evVar.E1);
                evVar.w1.setAlpha(evVar.E1);
                evVar.b.invalidate();
                break;
            case 18:
                xu xuVar = (xu) this.b;
                xuVar.getClass();
                xuVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (xuVar.getParent() instanceof View) {
                    ((View) xuVar.getParent()).invalidate();
                    break;
                }
                break;
            case 19:
                av avVar = (av) this.b;
                avVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                avVar.w = floatValue5;
                TextView textView = avVar.c;
                textView.setScaleX(1.0f - floatValue5);
                textView.setScaleY(1.0f - avVar.w);
                textView.setAlpha(1.0f - avVar.w);
                TextView textView2 = avVar.d;
                textView2.setScaleX(avVar.w);
                textView2.setScaleY(avVar.w);
                textView2.setAlpha(avVar.w);
                break;
            case 20:
                kv kvVar = (kv) this.b;
                kvVar.getClass();
                kvVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kvVar.d();
                break;
            case 21:
                mv mvVar = (mv) this.b;
                mvVar.getClass();
                mvVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mvVar.invalidate();
                mvVar.requestLayout();
                mvVar.c();
                mvVar.s.b.invalidate();
                break;
            case 22:
                cy cyVar = (cy) this.b;
                cyVar.getClass();
                cyVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cyVar.invalidate();
                break;
            case 23:
                gy gyVar = (gy) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gyVar.x = floatValue6;
                View view2 = gyVar.w;
                if (view2 == null) {
                    ai.l0 l0Var = gyVar.s;
                    if (l0Var != null) {
                        l0Var.invalidate();
                        break;
                    }
                } else {
                    view2.setAlpha(floatValue6);
                    break;
                }
                break;
            case 24:
                ((rz) this.b).setUnreadOnlyBannerProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 25:
                rz rzVar = ((kz) this.b).F;
                rzVar.G.invalidate();
                rzVar.invalidate();
                break;
            case 26:
                xz xzVar = (xz) this.b;
                xzVar.getClass();
                xzVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xzVar.invalidate();
                break;
            case 27:
                c20 c20Var = (c20) this.b;
                a20 a20Var = c20Var.a;
                if (!c20Var.H) {
                    float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    c20Var.d0 = floatValue7;
                    c20Var.W.setPinnedProgress(floatValue7);
                    a20Var.setScaleX(1.0f - (c20Var.d0 * 0.6f));
                    a20Var.setScaleY(1.0f - (c20Var.d0 * 0.6f));
                    if (c20Var.Y) {
                        c20Var.j();
                        break;
                    }
                }
                break;
            case 28:
                c50 c50Var = (c50) this.b;
                if (!c50Var.s0) {
                    CameraSession cameraSession = c50Var.t0;
                    if (cameraSession != null) {
                        cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                } else {
                    Camera2Session camera2Session = c50Var.w0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                }
                break;
            default:
                l60 l60Var = (l60) this.b;
                l60Var.getClass();
                l60Var.c2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l60Var.b.invalidate();
                break;
        }
    }
}
