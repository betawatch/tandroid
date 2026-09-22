package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                m6 m6Var = (m6) this.b;
                m6Var.getClass();
                m6Var.m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m6Var.invalidateSelf();
                Runnable runnable = m6Var.V;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                u6 u6Var = (u6) this.b;
                u6Var.a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                u6Var.invalidate();
                break;
            case 2:
                h8 h8Var = (h8) this.b;
                h8Var.J.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                h8Var.M.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 3:
                c9 c9Var = (c9) this.b;
                c9Var.getClass();
                c9Var.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                h9 h9Var = (h9) this.b;
                h9Var.getClass();
                h9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h9Var.f();
                break;
            case 5:
                w9 w9Var = (w9) this.b;
                w9Var.getClass();
                w9Var.g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9Var.invalidateSelf();
                break;
            case 6:
                la laVar = (la) this.b;
                laVar.getClass();
                laVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                laVar.b.invalidate();
                break;
            case 7:
                wc wcVar = (wc) this.b;
                wcVar.getClass();
                wcVar.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wcVar.b();
                break;
            case 8:
                tg tgVar = (tg) this.b;
                tgVar.getClass();
                tgVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 9:
                bi biVar = (bi) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vi viVar = biVar.e;
                xh xhVar = viVar.x1;
                xhVar.setAlpha(1.0f - floatValue);
                viVar.E1.setAlpha(floatValue);
                float dp = floatValue * AndroidUtilities.dp(36.0f);
                viVar.F1 = dp;
                xhVar.setTranslationY(dp);
                break;
            case 10:
                xh xhVar2 = (xh) this.b;
                vi viVar2 = xhVar2.b;
                viVar2.V1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                viVar2.C0.invalidate();
                viVar2.D0.invalidate();
                xhVar2.invalidate();
                break;
            case 11:
                nm nmVar = (nm) this.b;
                nmVar.getClass();
                nmVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nmVar.O.z.invalidate();
                break;
            case 12:
                to toVar = (to) this.b;
                toVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                toVar.d = floatValue2;
                toVar.setShown(floatValue2);
                toVar.a(false);
                break;
            case 13:
                mp mpVar = (mp) this.b;
                mpVar.getClass();
                mpVar.g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mpVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * mpVar.g0);
                break;
            case 14:
                vq vqVar = (vq) this.b;
                vqVar.getClass();
                vqVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = vqVar.H;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 15:
                pr prVar = (pr) this.b;
                prVar.getClass();
                prVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                prVar.invalidateSelf();
                break;
            case 16:
                sv.p((sv) this.b, valueAnimator);
                break;
            case 17:
                jv jvVar = (jv) this.b;
                jvVar.getClass();
                jvVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (jvVar.getParent() instanceof View) {
                    ((View) jvVar.getParent()).invalidate();
                    break;
                }
                break;
            case 18:
                nv nvVar = (nv) this.b;
                nvVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nvVar.v = floatValue3;
                TextView textView = nvVar.c;
                textView.setScaleX(1.0f - floatValue3);
                textView.setScaleY(1.0f - nvVar.v);
                textView.setAlpha(1.0f - nvVar.v);
                TextView textView2 = nvVar.d;
                textView2.setScaleX(nvVar.v);
                textView2.setScaleY(nvVar.v);
                textView2.setAlpha(nvVar.v);
                break;
            case 19:
                yv yvVar = (yv) this.b;
                yvVar.getClass();
                yvVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yvVar.d();
                break;
            case 20:
                aw awVar = (aw) this.b;
                awVar.getClass();
                awVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                awVar.invalidate();
                awVar.requestLayout();
                awVar.c();
                awVar.s.b.invalidate();
                break;
            case 21:
                ty tyVar = (ty) this.b;
                tyVar.getClass();
                tyVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tyVar.invalidate();
                break;
            case 22:
                xy xyVar = (xy) this.b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xyVar.w = floatValue4;
                View view2 = xyVar.v;
                if (view2 == null) {
                    ci.n6 n6Var = xyVar.s;
                    if (n6Var != null) {
                        n6Var.invalidate();
                        break;
                    }
                } else {
                    view2.setAlpha(floatValue4);
                    break;
                }
                break;
            case 23:
                k00 k00Var = ((c00) this.b).F;
                k00Var.F.invalidate();
                k00Var.invalidate();
                break;
            case 24:
                s00 s00Var = (s00) this.b;
                s00Var.getClass();
                s00Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s00Var.invalidate();
                break;
            case 25:
                z20 z20Var = (z20) this.b;
                x20 x20Var = z20Var.a;
                if (!z20Var.F) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    z20Var.b0 = floatValue5;
                    z20Var.U.setPinnedProgress(floatValue5);
                    x20Var.setScaleX(1.0f - (z20Var.b0 * 0.6f));
                    x20Var.setScaleY(1.0f - (z20Var.b0 * 0.6f));
                    if (z20Var.W) {
                        z20Var.i();
                        break;
                    }
                }
                break;
            case 26:
                w50 w50Var = (w50) this.b;
                if (!w50Var.n0) {
                    CameraSession cameraSession = w50Var.o0;
                    if (cameraSession != null) {
                        cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                } else {
                    Camera2Session camera2Session = w50Var.r0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                }
                break;
            case 27:
                b70.P((b70) this.b, valueAnimator);
                break;
            case 28:
                b70 b70Var = ((a70) this.b).e;
                b70Var.k0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                viewGroup = ((org.telegram.ui.ActionBar.f3) b70Var).containerView;
                viewGroup.invalidate();
                break;
            default:
                n70 n70Var = (n70) this.b;
                n70Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l70 l70Var = n70Var.x;
                if (l70Var != null) {
                    l70Var.setProgress(floatValue6);
                    break;
                }
                break;
        }
    }
}
