package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                e6 e6Var = (e6) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e6Var.q = floatValue;
                TimeInterpolator timeInterpolator = e6Var.x;
                if (timeInterpolator != null) {
                    floatValue = timeInterpolator.getInterpolation(floatValue);
                }
                e6Var.r = floatValue;
                e6Var.invalidateSelf();
                Runnable runnable = e6Var.b0;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                m6 m6Var = (m6) this.b;
                m6Var.a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                m6Var.invalidate();
                break;
            case 2:
                w7 w7Var = (w7) this.b;
                w7Var.z1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                w7Var.C1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 3:
                o8 o8Var = (o8) this.b;
                o8Var.getClass();
                o8Var.n0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                t8 t8Var = (t8) this.b;
                t8Var.getClass();
                t8Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t8Var.d();
                break;
            case 5:
                i9 i9Var = (i9) this.b;
                i9Var.getClass();
                i9Var.g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9Var.invalidateSelf();
                break;
            case 6:
                w9 w9Var = (w9) this.b;
                w9Var.getClass();
                w9Var.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9Var.b.invalidate();
                break;
            case 7:
                dc dcVar = (dc) this.b;
                dcVar.getClass();
                dcVar.j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dcVar.b();
                break;
            case 8:
                zf zfVar = (zf) this.b;
                zfVar.getClass();
                zfVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 9:
                gh ghVar = (gh) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bi biVar = ghVar.e;
                ah ahVar = biVar.r3;
                ahVar.setAlpha(1.0f - floatValue2);
                biVar.y3.setAlpha(floatValue2);
                float L = floatValue2 * org.telegram.messenger.i0.L(36.0f);
                biVar.z3 = L;
                ahVar.setTranslationY(L);
                break;
            case 10:
                ah ahVar2 = (ah) this.b;
                bi biVar2 = ahVar2.b;
                biVar2.P3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                biVar2.w2.invalidate();
                biVar2.x2.invalidate();
                ahVar2.invalidate();
                break;
            case 11:
                ((kk) this.b).setFeeVisibilityProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 12:
                gm gmVar = (gm) this.b;
                gmVar.getClass();
                gmVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gmVar.O.z.invalidate();
                break;
            case 13:
                lo loVar = (lo) this.b;
                loVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                loVar.d = floatValue3;
                loVar.setShown(floatValue3);
                loVar.a(false);
                break;
            case 14:
                dp dpVar = (dp) this.b;
                dpVar.getClass();
                dpVar.W1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dpVar.z1.setTranslationY((-org.telegram.messenger.i0.L(7.0f)) * dpVar.W1);
                break;
            case 15:
                kq kqVar = (kq) this.b;
                kqVar.getClass();
                kqVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = kqVar.H;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 16:
                cv cvVar = (cv) this.b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cvVar.A1 = floatValue4;
                cvVar.n1.setAlpha(floatValue4);
                cvVar.r1.setAlpha(cvVar.A1);
                cvVar.s1.setAlpha(cvVar.A1);
                cvVar.b.invalidate();
                break;
            case 17:
                vu vuVar = (vu) this.b;
                vuVar.getClass();
                vuVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (vuVar.getParent() instanceof View) {
                    ((View) vuVar.getParent()).invalidate();
                    break;
                }
                break;
            case 18:
                yu yuVar = (yu) this.b;
                yuVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yuVar.w = floatValue5;
                TextView textView = yuVar.c;
                textView.setScaleX(1.0f - floatValue5);
                textView.setScaleY(1.0f - yuVar.w);
                textView.setAlpha(1.0f - yuVar.w);
                TextView textView2 = yuVar.d;
                textView2.setScaleX(yuVar.w);
                textView2.setScaleY(yuVar.w);
                textView2.setAlpha(yuVar.w);
                break;
            case 19:
                iv ivVar = (iv) this.b;
                ivVar.getClass();
                ivVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ivVar.d();
                break;
            case 20:
                kv kvVar = (kv) this.b;
                kvVar.getClass();
                kvVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kvVar.invalidate();
                kvVar.requestLayout();
                kvVar.c();
                kvVar.s.b.invalidate();
                break;
            case 21:
                ey eyVar = (ey) this.b;
                eyVar.getClass();
                eyVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eyVar.invalidate();
                break;
            case 22:
                iy iyVar = (iy) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iyVar.x = floatValue6;
                View view2 = iyVar.w;
                if (view2 == null) {
                    fg.i iVar = iyVar.s;
                    if (iVar != null) {
                        iVar.invalidate();
                        break;
                    }
                } else {
                    view2.setAlpha(floatValue6);
                    break;
                }
                break;
            case 23:
                tz tzVar = ((mz) this.b).F;
                tzVar.F.invalidate();
                tzVar.invalidate();
                break;
            case 24:
                yz yzVar = (yz) this.b;
                yzVar.getClass();
                yzVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yzVar.invalidate();
                break;
            case 25:
                g20 g20Var = (g20) this.b;
                e20 e20Var = g20Var.a;
                if (!g20Var.F) {
                    float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    g20Var.b0 = floatValue7;
                    g20Var.U.setPinnedProgress(floatValue7);
                    e20Var.setScaleX(1.0f - (g20Var.b0 * 0.6f));
                    e20Var.setScaleY(1.0f - (g20Var.b0 * 0.6f));
                    if (g20Var.W) {
                        g20Var.i();
                        break;
                    }
                }
                break;
            case 26:
                e50 e50Var = (e50) this.b;
                if (!e50Var.r0) {
                    CameraSession cameraSession = e50Var.s0;
                    if (cameraSession != null) {
                        cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                } else {
                    Camera2Session camera2Session = e50Var.v0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                }
                break;
            case 27:
                m60 m60Var = (m60) this.b;
                m60Var.getClass();
                m60Var.Y1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m60Var.b.invalidate();
                break;
            case 28:
                m60 m60Var2 = ((l60) this.b).e;
                m60Var2.b2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                m60Var2.b.invalidate();
                break;
            default:
                z60 z60Var = (z60) this.b;
                z60Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x60 x60Var = z60Var.x;
                if (x60Var != null) {
                    x60Var.setProgress(floatValue8);
                    break;
                }
                break;
        }
    }
}
