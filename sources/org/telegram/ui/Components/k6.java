package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                o6 o6Var = (o6) this.b;
                o6Var.getClass();
                o6Var.m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o6Var.invalidateSelf();
                Runnable runnable = o6Var.V;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                w6 w6Var = (w6) this.b;
                w6Var.a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                w6Var.invalidate();
                break;
            case 2:
                j8 j8Var = (j8) this.b;
                j8Var.J.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                j8Var.M.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 3:
                e9 e9Var = (e9) this.b;
                e9Var.getClass();
                e9Var.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                j9 j9Var = (j9) this.b;
                j9Var.getClass();
                j9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j9Var.f();
                break;
            case 5:
                y9 y9Var = (y9) this.b;
                y9Var.getClass();
                y9Var.g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9Var.invalidateSelf();
                break;
            case 6:
                na naVar = (na) this.b;
                naVar.getClass();
                naVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                naVar.b.invalidate();
                break;
            case 7:
                yc ycVar = (yc) this.b;
                ycVar.getClass();
                ycVar.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ycVar.b();
                break;
            case 8:
                ug ugVar = (ug) this.b;
                ugVar.getClass();
                ugVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
                b60 b60Var = (b60) this.b;
                if (!b60Var.q0) {
                    CameraSession cameraSession = b60Var.r0;
                    if (cameraSession != null) {
                        cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                } else {
                    Camera2Session camera2Session = b60Var.u0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                }
                break;
            case 27:
                k70.P((k70) this.b, valueAnimator);
                break;
            case 28:
                k70 k70Var = ((j70) this.b).e;
                k70Var.k0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                viewGroup = ((org.telegram.ui.ActionBar.f3) k70Var).containerView;
                viewGroup.invalidate();
                break;
            default:
                w70 w70Var = (w70) this.b;
                w70Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u70 u70Var = w70Var.x;
                if (u70Var != null) {
                    u70Var.setProgress(floatValue6);
                    break;
                }
                break;
        }
    }
}
