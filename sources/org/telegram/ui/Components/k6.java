package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
                oa oaVar = (oa) this.b;
                oaVar.getClass();
                oaVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oaVar.b.invalidate();
                break;
            case 7:
                zc zcVar = (zc) this.b;
                zcVar.getClass();
                zcVar.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zcVar.b();
                break;
            case 8:
                wg wgVar = (wg) this.b;
                wgVar.getClass();
                wgVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 9:
                ci ciVar = (ci) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xi xiVar = ciVar.e;
                wh whVar = xiVar.x1;
                whVar.setAlpha(1.0f - floatValue);
                xiVar.E1.setAlpha(floatValue);
                float dp = floatValue * AndroidUtilities.dp(36.0f);
                xiVar.F1 = dp;
                whVar.setTranslationY(dp);
                break;
            case 10:
                wh whVar2 = (wh) this.b;
                xi xiVar2 = whVar2.b;
                xiVar2.V1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xiVar2.C0.invalidate();
                xiVar2.D0.invalidate();
                whVar2.invalidate();
                break;
            case 11:
                qm qmVar = (qm) this.b;
                qmVar.getClass();
                qmVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qmVar.O.z.invalidate();
                break;
            case 12:
                wo woVar = (wo) this.b;
                woVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                woVar.d = floatValue2;
                woVar.setShown(floatValue2);
                woVar.a(false);
                break;
            case 13:
                pp ppVar = (pp) this.b;
                ppVar.getClass();
                ppVar.g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ppVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * ppVar.g0);
                break;
            case 14:
                yq yqVar = (yq) this.b;
                yqVar.getClass();
                yqVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = yqVar.H;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 15:
                sr srVar = (sr) this.b;
                srVar.getClass();
                srVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                srVar.invalidateSelf();
                break;
            case 16:
                wv.p((wv) this.b, valueAnimator);
                break;
            case 17:
                nv nvVar = (nv) this.b;
                nvVar.getClass();
                nvVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (nvVar.getParent() instanceof View) {
                    ((View) nvVar.getParent()).invalidate();
                    break;
                }
                break;
            case 18:
                rv rvVar = (rv) this.b;
                rvVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rvVar.v = floatValue3;
                TextView textView = rvVar.c;
                textView.setScaleX(1.0f - floatValue3);
                textView.setScaleY(1.0f - rvVar.v);
                textView.setAlpha(1.0f - rvVar.v);
                TextView textView2 = rvVar.d;
                textView2.setScaleX(rvVar.v);
                textView2.setScaleY(rvVar.v);
                textView2.setAlpha(rvVar.v);
                break;
            case 19:
                cw cwVar = (cw) this.b;
                cwVar.getClass();
                cwVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cwVar.d();
                break;
            case 20:
                ew ewVar = (ew) this.b;
                ewVar.getClass();
                ewVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ewVar.invalidate();
                ewVar.requestLayout();
                ewVar.c();
                ewVar.s.b.invalidate();
                break;
            case 21:
                wy wyVar = (wy) this.b;
                wyVar.getClass();
                wyVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wyVar.invalidate();
                break;
            case 22:
                az azVar = (az) this.b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                azVar.w = floatValue4;
                View view2 = azVar.v;
                if (view2 == null) {
                    ci.m6 m6Var = azVar.s;
                    if (m6Var != null) {
                        m6Var.invalidate();
                        break;
                    }
                } else {
                    view2.setAlpha(floatValue4);
                    break;
                }
                break;
            case 23:
                n00 n00Var = ((f00) this.b).F;
                n00Var.F.invalidate();
                n00Var.invalidate();
                break;
            case 24:
                v00 v00Var = (v00) this.b;
                v00Var.getClass();
                v00Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v00Var.invalidate();
                break;
            case 25:
                d30 d30Var = (d30) this.b;
                b30 b30Var = d30Var.a;
                if (!d30Var.F) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    d30Var.b0 = floatValue5;
                    d30Var.U.setPinnedProgress(floatValue5);
                    b30Var.setScaleX(1.0f - (d30Var.b0 * 0.6f));
                    b30Var.setScaleY(1.0f - (d30Var.b0 * 0.6f));
                    if (d30Var.W) {
                        d30Var.i();
                        break;
                    }
                }
                break;
            case 26:
                f60 f60Var = (f60) this.b;
                if (!f60Var.s0) {
                    CameraSession cameraSession = f60Var.t0;
                    if (cameraSession != null) {
                        cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                } else {
                    Camera2Session camera2Session = f60Var.w0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                }
                break;
            case 27:
                p70.N((p70) this.b, valueAnimator);
                break;
            case 28:
                p70 p70Var = ((o70) this.b).e;
                p70Var.k0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                viewGroup = ((org.telegram.ui.ActionBar.f3) p70Var).containerView;
                viewGroup.invalidate();
                break;
            default:
                b80 b80Var = (b80) this.b;
                b80Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z70 z70Var = b80Var.x;
                if (z70Var != null) {
                    z70Var.setProgress(floatValue6);
                    break;
                }
                break;
        }
    }
}
