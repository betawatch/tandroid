package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p6Var.q = floatValue;
                TimeInterpolator timeInterpolator = p6Var.x;
                if (timeInterpolator != null) {
                    floatValue = timeInterpolator.getInterpolation(floatValue);
                }
                p6Var.r = floatValue;
                p6Var.invalidateSelf();
                Runnable runnable = p6Var.b0;
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
                ycVar.j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ycVar.b();
                break;
            case 8:
                vg vgVar = (vg) this.b;
                vgVar.getClass();
                vgVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 9:
                ai aiVar = (ai) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ti tiVar = aiVar.e;
                wh whVar = tiVar.A1;
                whVar.setAlpha(1.0f - floatValue2);
                tiVar.H1.setAlpha(floatValue2);
                float dp = floatValue2 * AndroidUtilities.dp(36.0f);
                tiVar.I1 = dp;
                whVar.setTranslationY(dp);
                break;
            case 10:
                wh whVar2 = (wh) this.b;
                ti tiVar2 = whVar2.b;
                tiVar2.Y1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tiVar2.F0.invalidate();
                tiVar2.G0.invalidate();
                whVar2.invalidate();
                break;
            case 11:
                ((al) this.b).setFeeVisibilityProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 12:
                ym ymVar = (ym) this.b;
                ymVar.getClass();
                ymVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ymVar.O.z.invalidate();
                break;
            case 13:
                dp dpVar = (dp) this.b;
                dpVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dpVar.d = floatValue3;
                dpVar.setShown(floatValue3);
                dpVar.a(false);
                break;
            case 14:
                wp wpVar = (wp) this.b;
                wpVar.getClass();
                wpVar.g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wpVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * wpVar.g0);
                break;
            case 15:
                fr frVar = (fr) this.b;
                frVar.getClass();
                frVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = frVar.H;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 16:
                as asVar = (as) this.b;
                asVar.getClass();
                asVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                asVar.invalidateSelf();
                break;
            case 17:
                aw.q((aw) this.b, valueAnimator);
                break;
            case 18:
                rv rvVar = (rv) this.b;
                rvVar.getClass();
                rvVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (rvVar.getParent() instanceof View) {
                    ((View) rvVar.getParent()).invalidate();
                    break;
                }
                break;
            case 19:
                vv vvVar = (vv) this.b;
                vvVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vvVar.v = floatValue4;
                TextView textView = vvVar.c;
                textView.setScaleX(1.0f - floatValue4);
                textView.setScaleY(1.0f - vvVar.v);
                textView.setAlpha(1.0f - vvVar.v);
                TextView textView2 = vvVar.d;
                textView2.setScaleX(vvVar.v);
                textView2.setScaleY(vvVar.v);
                textView2.setAlpha(vvVar.v);
                break;
            case 20:
                gw gwVar = (gw) this.b;
                gwVar.getClass();
                gwVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gwVar.d();
                break;
            case 21:
                iw iwVar = (iw) this.b;
                iwVar.getClass();
                iwVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iwVar.invalidate();
                iwVar.requestLayout();
                iwVar.c();
                iwVar.s.b.invalidate();
                break;
            case 22:
                cz czVar = (cz) this.b;
                czVar.getClass();
                czVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                czVar.invalidate();
                break;
            case 23:
                gz gzVar = (gz) this.b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gzVar.w = floatValue5;
                View view2 = gzVar.v;
                if (view2 == null) {
                    ah.v vVar = gzVar.s;
                    if (vVar != null) {
                        vVar.invalidate();
                        break;
                    }
                } else {
                    view2.setAlpha(floatValue5);
                    break;
                }
                break;
            case 24:
                s00 s00Var = ((l00) this.b).F;
                s00Var.F.invalidate();
                s00Var.invalidate();
                break;
            case 25:
                a10 a10Var = (a10) this.b;
                a10Var.getClass();
                a10Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a10Var.invalidate();
                break;
            case 26:
                i30 i30Var = (i30) this.b;
                f30 f30Var = i30Var.a;
                if (!i30Var.F) {
                    float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    i30Var.b0 = floatValue6;
                    i30Var.U.setPinnedProgress(floatValue6);
                    f30Var.setScaleX(1.0f - (i30Var.b0 * 0.6f));
                    f30Var.setScaleY(1.0f - (i30Var.b0 * 0.6f));
                    if (i30Var.W) {
                        i30Var.i();
                        break;
                    }
                }
                break;
            case 27:
                m60 m60Var = (m60) this.b;
                if (!m60Var.s0) {
                    CameraSession cameraSession = m60Var.t0;
                    if (cameraSession != null) {
                        cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                } else {
                    Camera2Session camera2Session = m60Var.w0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                }
                break;
            case 28:
                v70.Q((v70) this.b, valueAnimator);
                break;
            default:
                v70 v70Var = ((u70) this.b).e;
                v70Var.k0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                viewGroup = ((org.telegram.ui.ActionBar.f3) v70Var).containerView;
                viewGroup.invalidate();
                break;
        }
    }
}
