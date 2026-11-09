package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                ru ruVar = (ru) this.b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ruVar.A1 = floatValue4;
                ruVar.n1.setAlpha(floatValue4);
                ruVar.r1.setAlpha(ruVar.A1);
                ruVar.s1.setAlpha(ruVar.A1);
                ruVar.b.invalidate();
                break;
            case 17:
                ku kuVar = (ku) this.b;
                kuVar.getClass();
                kuVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (kuVar.getParent() instanceof View) {
                    ((View) kuVar.getParent()).invalidate();
                    break;
                }
                break;
            case 18:
                nu nuVar = (nu) this.b;
                nuVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nuVar.w = floatValue5;
                TextView textView = nuVar.c;
                textView.setScaleX(1.0f - floatValue5);
                textView.setScaleY(1.0f - nuVar.w);
                textView.setAlpha(1.0f - nuVar.w);
                TextView textView2 = nuVar.d;
                textView2.setScaleX(nuVar.w);
                textView2.setScaleY(nuVar.w);
                textView2.setAlpha(nuVar.w);
                break;
            case 19:
                xu xuVar = (xu) this.b;
                xuVar.getClass();
                xuVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xuVar.d();
                break;
            case 20:
                zu zuVar = (zu) this.b;
                zuVar.getClass();
                zuVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zuVar.invalidate();
                zuVar.requestLayout();
                zuVar.c();
                zuVar.s.b.invalidate();
                break;
            case 21:
                qx qxVar = (qx) this.b;
                qxVar.getClass();
                qxVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qxVar.invalidate();
                break;
            case 22:
                ux uxVar = (ux) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uxVar.x = floatValue6;
                View view2 = uxVar.w;
                if (view2 == null) {
                    bi.x5 x5Var = uxVar.s;
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
                fz fzVar = ((zy) this.b).F;
                fzVar.F.invalidate();
                fzVar.invalidate();
                break;
            case 24:
                lz lzVar = (lz) this.b;
                lzVar.getClass();
                lzVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lzVar.invalidate();
                break;
            case 25:
                q10 q10Var = (q10) this.b;
                n10 n10Var = q10Var.a;
                if (!q10Var.G) {
                    float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    q10Var.c0 = floatValue7;
                    q10Var.V.setPinnedProgress(floatValue7);
                    n10Var.setScaleX(1.0f - (q10Var.c0 * 0.6f));
                    n10Var.setScaleY(1.0f - (q10Var.c0 * 0.6f));
                    if (q10Var.X) {
                        q10Var.j();
                        break;
                    }
                }
                break;
            case 26:
                p40 p40Var = (p40) this.b;
                if (!p40Var.r0) {
                    CameraSession cameraSession = p40Var.s0;
                    if (cameraSession != null) {
                        cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                } else {
                    Camera2Session camera2Session = p40Var.v0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                }
                break;
            case 27:
                y50 y50Var = (y50) this.b;
                y50Var.getClass();
                y50Var.Y1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y50Var.b.invalidate();
                break;
            default:
                y50 y50Var2 = ((x50) this.b).e;
                y50Var2.b2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                y50Var2.b.invalidate();
                break;
        }
    }
}
