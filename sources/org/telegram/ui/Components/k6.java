package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
                ci ciVar = (ci) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wi wiVar = ciVar.e;
                yh yhVar = wiVar.x1;
                yhVar.setAlpha(1.0f - floatValue);
                wiVar.E1.setAlpha(floatValue);
                float dp = floatValue * AndroidUtilities.dp(36.0f);
                wiVar.F1 = dp;
                yhVar.setTranslationY(dp);
                break;
            case 10:
                yh yhVar2 = (yh) this.b;
                wi wiVar2 = yhVar2.b;
                wiVar2.V1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wiVar2.C0.invalidate();
                wiVar2.D0.invalidate();
                yhVar2.invalidate();
                break;
            case 11:
                pm pmVar = (pm) this.b;
                pmVar.getClass();
                pmVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pmVar.O.z.invalidate();
                break;
            case 12:
                vo voVar = (vo) this.b;
                voVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                voVar.d = floatValue2;
                voVar.setShown(floatValue2);
                voVar.a(false);
                break;
            case 13:
                op opVar = (op) this.b;
                opVar.getClass();
                opVar.g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                opVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * opVar.g0);
                break;
            case 14:
                xq xqVar = (xq) this.b;
                xqVar.getClass();
                xqVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = xqVar.H;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 15:
                rr rrVar = (rr) this.b;
                rrVar.getClass();
                rrVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                rrVar.invalidateSelf();
                break;
            case 16:
                vv.p((vv) this.b, valueAnimator);
                break;
            case 17:
                mv mvVar = (mv) this.b;
                mvVar.getClass();
                mvVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (mvVar.getParent() instanceof View) {
                    ((View) mvVar.getParent()).invalidate();
                    break;
                }
                break;
            case 18:
                qv qvVar = (qv) this.b;
                qvVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qvVar.v = floatValue3;
                TextView textView = qvVar.c;
                textView.setScaleX(1.0f - floatValue3);
                textView.setScaleY(1.0f - qvVar.v);
                textView.setAlpha(1.0f - qvVar.v);
                TextView textView2 = qvVar.d;
                textView2.setScaleX(qvVar.v);
                textView2.setScaleY(qvVar.v);
                textView2.setAlpha(qvVar.v);
                break;
            case 19:
                bw bwVar = (bw) this.b;
                bwVar.getClass();
                bwVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bwVar.d();
                break;
            case 20:
                dw dwVar = (dw) this.b;
                dwVar.getClass();
                dwVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dwVar.invalidate();
                dwVar.requestLayout();
                dwVar.c();
                dwVar.s.b.invalidate();
                break;
            case 21:
                vy vyVar = (vy) this.b;
                vyVar.getClass();
                vyVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vyVar.invalidate();
                break;
            case 22:
                zy zyVar = (zy) this.b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zyVar.w = floatValue4;
                View view2 = zyVar.v;
                if (view2 == null) {
                    ci.m6 m6Var = zyVar.s;
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
                m00 m00Var = ((e00) this.b).F;
                m00Var.F.invalidate();
                m00Var.invalidate();
                break;
            case 24:
                u00 u00Var = (u00) this.b;
                u00Var.getClass();
                u00Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u00Var.invalidate();
                break;
            case 25:
                c30 c30Var = (c30) this.b;
                a30 a30Var = c30Var.a;
                if (!c30Var.F) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    c30Var.b0 = floatValue5;
                    c30Var.U.setPinnedProgress(floatValue5);
                    a30Var.setScaleX(1.0f - (c30Var.b0 * 0.6f));
                    a30Var.setScaleY(1.0f - (c30Var.b0 * 0.6f));
                    if (c30Var.W) {
                        c30Var.i();
                        break;
                    }
                }
                break;
            case 26:
                e60 e60Var = (e60) this.b;
                if (!e60Var.s0) {
                    CameraSession cameraSession = e60Var.t0;
                    if (cameraSession != null) {
                        cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                } else {
                    Camera2Session camera2Session = e60Var.w0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                }
                break;
            case 27:
                o70.P((o70) this.b, valueAnimator);
                break;
            case 28:
                o70 o70Var = ((n70) this.b).e;
                o70Var.k0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                viewGroup = ((org.telegram.ui.ActionBar.e3) o70Var).containerView;
                viewGroup.invalidate();
                break;
            default:
                a80 a80Var = (a80) this.b;
                a80Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y70 y70Var = a80Var.x;
                if (y70Var != null) {
                    y70Var.setProgress(floatValue6);
                    break;
                }
                break;
        }
    }
}
