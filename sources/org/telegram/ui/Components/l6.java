package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class l6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                p6 p6Var = (p6) this.b;
                p6Var.getClass();
                p6Var.m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p6Var.invalidateSelf();
                Runnable runnable = p6Var.V;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                x6 x6Var = (x6) this.b;
                x6Var.a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                x6Var.invalidate();
                break;
            case 2:
                k8 k8Var = (k8) this.b;
                k8Var.J.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                k8Var.M.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 3:
                f9 f9Var = (f9) this.b;
                f9Var.getClass();
                f9Var.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                k9 k9Var = (k9) this.b;
                k9Var.getClass();
                k9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k9Var.f();
                break;
            case 5:
                z9 z9Var = (z9) this.b;
                z9Var.getClass();
                z9Var.g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z9Var.invalidateSelf();
                break;
            case 6:
                na naVar = (na) this.b;
                naVar.getClass();
                naVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                naVar.b.invalidate();
                break;
            case 7:
                zc zcVar = (zc) this.b;
                zcVar.getClass();
                zcVar.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zcVar.b();
                break;
            case 8:
                vg vgVar = (vg) this.b;
                vgVar.getClass();
                vgVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
                so soVar = (so) this.b;
                soVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                soVar.d = floatValue2;
                soVar.setShown(floatValue2);
                soVar.a(false);
                break;
            case 13:
                lp lpVar = (lp) this.b;
                lpVar.getClass();
                lpVar.g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lpVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * lpVar.g0);
                break;
            case 14:
                uq uqVar = (uq) this.b;
                uqVar.getClass();
                uqVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = uqVar.H;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 15:
                or orVar = (or) this.b;
                orVar.getClass();
                orVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                orVar.invalidateSelf();
                break;
            case 16:
                rv.p((rv) this.b, valueAnimator);
                break;
            case 17:
                iv ivVar = (iv) this.b;
                ivVar.getClass();
                ivVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (ivVar.getParent() instanceof View) {
                    ((View) ivVar.getParent()).invalidate();
                    break;
                }
                break;
            case 18:
                mv mvVar = (mv) this.b;
                mvVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mvVar.v = floatValue3;
                TextView textView = mvVar.c;
                textView.setScaleX(1.0f - floatValue3);
                textView.setScaleY(1.0f - mvVar.v);
                textView.setAlpha(1.0f - mvVar.v);
                TextView textView2 = mvVar.d;
                textView2.setScaleX(mvVar.v);
                textView2.setScaleY(mvVar.v);
                textView2.setAlpha(mvVar.v);
                break;
            case 19:
                xv xvVar = (xv) this.b;
                xvVar.getClass();
                xvVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xvVar.d();
                break;
            case 20:
                zv zvVar = (zv) this.b;
                zvVar.getClass();
                zvVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zvVar.invalidate();
                zvVar.requestLayout();
                zvVar.c();
                zvVar.s.b.invalidate();
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
                    ah.w wVar = xyVar.s;
                    if (wVar != null) {
                        wVar.invalidate();
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
