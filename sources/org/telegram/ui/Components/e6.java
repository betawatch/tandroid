package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e6(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                i6 i6Var = (i6) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i6Var.q = floatValue;
                TimeInterpolator timeInterpolator = i6Var.x;
                if (timeInterpolator != null) {
                    floatValue = timeInterpolator.getInterpolation(floatValue);
                }
                i6Var.r = floatValue;
                i6Var.invalidateSelf();
                Runnable runnable = i6Var.b0;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                q6 q6Var = (q6) this.b;
                q6Var.a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                q6Var.invalidate();
                break;
            case 2:
                b8 b8Var = (b8) this.b;
                b8Var.z1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                b8Var.C1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 3:
                t8 t8Var = (t8) this.b;
                t8Var.getClass();
                t8Var.o0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                y8 y8Var = (y8) this.b;
                y8Var.getClass();
                y8Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y8Var.d();
                break;
            case 5:
                n9 n9Var = (n9) this.b;
                n9Var.getClass();
                n9Var.g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n9Var.invalidateSelf();
                break;
            case 6:
                ca caVar = (ca) this.b;
                caVar.getClass();
                caVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                caVar.b.invalidate();
                break;
            case 7:
                ic icVar = (ic) this.b;
                icVar.getClass();
                icVar.j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                icVar.b();
                break;
            case 8:
                dg dgVar = (dg) this.b;
                dgVar.getClass();
                dgVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 9:
                jh jhVar = (jh) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                di diVar = jhVar.e;
                dh dhVar = diVar.r3;
                dhVar.setAlpha(1.0f - floatValue2);
                diVar.y3.setAlpha(floatValue2);
                float L = floatValue2 * org.telegram.messenger.g0.L(36.0f);
                diVar.z3 = L;
                dhVar.setTranslationY(L);
                break;
            case 10:
                dh dhVar2 = (dh) this.b;
                di diVar2 = dhVar2.b;
                diVar2.P3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                diVar2.w2.invalidate();
                diVar2.x2.invalidate();
                dhVar2.invalidate();
                break;
            case 11:
                ((ik) this.b).setFeeVisibilityProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 12:
                yl ylVar = (yl) this.b;
                ylVar.getClass();
                ylVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ylVar.O.z.invalidate();
                break;
            case 13:
                co coVar = (co) this.b;
                coVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                coVar.d = floatValue3;
                coVar.setShown(floatValue3);
                coVar.a(false);
                break;
            case 14:
                vo voVar = (vo) this.b;
                voVar.getClass();
                voVar.W1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                voVar.z1.setTranslationY((-org.telegram.messenger.g0.L(7.0f)) * voVar.W1);
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
                quVar.A1 = floatValue4;
                quVar.n1.setAlpha(floatValue4);
                quVar.r1.setAlpha(quVar.A1);
                quVar.s1.setAlpha(quVar.A1);
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
                n10 n10Var = p10Var.a;
                if (!p10Var.G) {
                    float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    p10Var.c0 = floatValue7;
                    p10Var.V.setPinnedProgress(floatValue7);
                    n10Var.setScaleX(1.0f - (p10Var.c0 * 0.6f));
                    n10Var.setScaleY(1.0f - (p10Var.c0 * 0.6f));
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
                x50Var.Y1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x50Var.b.invalidate();
                break;
            default:
                x50 x50Var2 = ((w50) this.b).e;
                x50Var2.b2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                x50Var2.b.invalidate();
                break;
        }
    }
}
