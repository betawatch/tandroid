package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c6(Object obj, int i3) {
        this.a = i3;
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
                Runnable runnable = g6Var.b0;
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
                z7 z7Var = (z7) this.b;
                z7Var.A1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                z7Var.D1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 3:
                r8 r8Var = (r8) this.b;
                r8Var.getClass();
                r8Var.o0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                w8 w8Var = (w8) this.b;
                w8Var.getClass();
                w8Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w8Var.d();
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
                gc gcVar = (gc) this.b;
                gcVar.getClass();
                gcVar.j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gcVar.b();
                break;
            case 8:
                bg bgVar = (bg) this.b;
                bgVar.getClass();
                bgVar.e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 9:
                gh ghVar = (gh) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bi biVar = ghVar.e;
                ah ahVar = biVar.s3;
                ahVar.setAlpha(1.0f - floatValue2);
                biVar.z3.setAlpha(floatValue2);
                float L = floatValue2 * org.telegram.messenger.g0.L(36.0f);
                biVar.A3 = L;
                ahVar.setTranslationY(L);
                break;
            case 10:
                ah ahVar2 = (ah) this.b;
                bi biVar2 = ahVar2.b;
                biVar2.Q3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                biVar2.x2.invalidate();
                biVar2.y2.invalidate();
                ahVar2.invalidate();
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
                voVar.X1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                voVar.A1.setTranslationY((-org.telegram.messenger.g0.L(7.0f)) * voVar.X1);
                break;
            case 15:
                cq cqVar = (cq) this.b;
                cqVar.getClass();
                cqVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = cqVar.H;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 16:
                pu puVar = (pu) this.b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                puVar.B1 = floatValue4;
                puVar.o1.setAlpha(floatValue4);
                puVar.s1.setAlpha(puVar.B1);
                puVar.t1.setAlpha(puVar.B1);
                puVar.b.invalidate();
                break;
            case 17:
                iu iuVar = (iu) this.b;
                iuVar.getClass();
                iuVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (iuVar.getParent() instanceof View) {
                    ((View) iuVar.getParent()).invalidate();
                    break;
                }
                break;
            case 18:
                lu luVar = (lu) this.b;
                luVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                luVar.w = floatValue5;
                TextView textView = luVar.c;
                textView.setScaleX(1.0f - floatValue5);
                textView.setScaleY(1.0f - luVar.w);
                textView.setAlpha(1.0f - luVar.w);
                TextView textView2 = luVar.d;
                textView2.setScaleX(luVar.w);
                textView2.setScaleY(luVar.w);
                textView2.setAlpha(luVar.w);
                break;
            case 19:
                vu vuVar = (vu) this.b;
                vuVar.getClass();
                vuVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vuVar.d();
                break;
            case 20:
                xu xuVar = (xu) this.b;
                xuVar.getClass();
                xuVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xuVar.invalidate();
                xuVar.requestLayout();
                xuVar.c();
                xuVar.s.b.invalidate();
                break;
            case 21:
                nx nxVar = (nx) this.b;
                nxVar.getClass();
                nxVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nxVar.invalidate();
                break;
            case 22:
                rx rxVar = (rx) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rxVar.x = floatValue6;
                View view2 = rxVar.w;
                if (view2 == null) {
                    ai.c0 c0Var = rxVar.s;
                    if (c0Var != null) {
                        c0Var.invalidate();
                        break;
                    }
                } else {
                    view2.setAlpha(floatValue6);
                    break;
                }
                break;
            case 23:
                bz bzVar = ((vy) this.b).F;
                bzVar.G.invalidate();
                bzVar.invalidate();
                break;
            case 24:
                hz hzVar = (hz) this.b;
                hzVar.getClass();
                hzVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hzVar.invalidate();
                break;
            case 25:
                l10 l10Var = (l10) this.b;
                j10 j10Var = l10Var.a;
                if (!l10Var.G) {
                    float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    l10Var.c0 = floatValue7;
                    l10Var.V.setPinnedProgress(floatValue7);
                    j10Var.setScaleX(1.0f - (l10Var.c0 * 0.6f));
                    j10Var.setScaleY(1.0f - (l10Var.c0 * 0.6f));
                    if (l10Var.X) {
                        l10Var.i();
                        break;
                    }
                }
                break;
            case 26:
                k40 k40Var = (k40) this.b;
                if (!k40Var.s0) {
                    CameraSession cameraSession = k40Var.t0;
                    if (cameraSession != null) {
                        cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                } else {
                    Camera2Session camera2Session = k40Var.w0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                }
                break;
            case 27:
                t50 t50Var = (t50) this.b;
                t50Var.getClass();
                t50Var.Z1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t50Var.b.invalidate();
                break;
            case 28:
                t50 t50Var2 = ((s50) this.b).e;
                t50Var2.c2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                t50Var2.b.invalidate();
                break;
            default:
                f60 f60Var = (f60) this.b;
                f60Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d60 d60Var = f60Var.x;
                if (d60Var != null) {
                    d60Var.setProgress(floatValue8);
                    break;
                }
                break;
        }
    }
}
