package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                q6 q6Var = (q6) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q6Var.q = floatValue;
                TimeInterpolator timeInterpolator = q6Var.x;
                if (timeInterpolator != null) {
                    floatValue = timeInterpolator.getInterpolation(floatValue);
                }
                q6Var.r = floatValue;
                q6Var.invalidateSelf();
                Runnable runnable = q6Var.b0;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                y6 y6Var = (y6) this.b;
                y6Var.a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                y6Var.invalidate();
                break;
            case 2:
                l8 l8Var = (l8) this.b;
                l8Var.J.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                l8Var.M.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 3:
                g9 g9Var = (g9) this.b;
                g9Var.getClass();
                g9Var.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                l9 l9Var = (l9) this.b;
                l9Var.getClass();
                l9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l9Var.f();
                break;
            case 5:
                aa aaVar = (aa) this.b;
                aaVar.getClass();
                aaVar.g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aaVar.invalidateSelf();
                break;
            case 6:
                qa qaVar = (qa) this.b;
                qaVar.getClass();
                qaVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qaVar.b.invalidate();
                break;
            case 7:
                bd bdVar = (bd) this.b;
                bdVar.getClass();
                bdVar.j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bdVar.b();
                break;
            case 8:
                xg xgVar = (xg) this.b;
                xgVar.getClass();
                xgVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 9:
                ei eiVar = (ei) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yi yiVar = eiVar.e;
                ai aiVar = yiVar.A1;
                aiVar.setAlpha(1.0f - floatValue2);
                yiVar.H1.setAlpha(floatValue2);
                float dp = floatValue2 * AndroidUtilities.dp(36.0f);
                yiVar.I1 = dp;
                aiVar.setTranslationY(dp);
                break;
            case 10:
                ai aiVar2 = (ai) this.b;
                yi yiVar2 = aiVar2.b;
                yiVar2.Y1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yiVar2.F0.invalidate();
                yiVar2.G0.invalidate();
                aiVar2.invalidate();
                break;
            case 11:
                ((gl) this.b).setFeeVisibilityProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 12:
                en enVar = (en) this.b;
                enVar.getClass();
                enVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                enVar.O.z.invalidate();
                break;
            case 13:
                jp jpVar = (jp) this.b;
                jpVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jpVar.d = floatValue3;
                jpVar.setShown(floatValue3);
                jpVar.a(false);
                break;
            case 14:
                cq cqVar = (cq) this.b;
                cqVar.getClass();
                cqVar.g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cqVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * cqVar.g0);
                break;
            case 15:
                lr lrVar = (lr) this.b;
                lrVar.getClass();
                lrVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = lrVar.H;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 16:
                gs gsVar = (gs) this.b;
                gsVar.getClass();
                gsVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                gsVar.invalidateSelf();
                break;
            case 17:
                iw.r((iw) this.b, valueAnimator);
                break;
            case 18:
                zv zvVar = (zv) this.b;
                zvVar.getClass();
                zvVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (zvVar.getParent() instanceof View) {
                    ((View) zvVar.getParent()).invalidate();
                    break;
                }
                break;
            case 19:
                dw dwVar = (dw) this.b;
                dwVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dwVar.v = floatValue4;
                TextView textView = dwVar.c;
                textView.setScaleX(1.0f - floatValue4);
                textView.setScaleY(1.0f - dwVar.v);
                textView.setAlpha(1.0f - dwVar.v);
                TextView textView2 = dwVar.d;
                textView2.setScaleX(dwVar.v);
                textView2.setScaleY(dwVar.v);
                textView2.setAlpha(dwVar.v);
                break;
            case 20:
                ow owVar = (ow) this.b;
                owVar.getClass();
                owVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                owVar.d();
                break;
            case 21:
                qw qwVar = (qw) this.b;
                qwVar.getClass();
                qwVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qwVar.invalidate();
                qwVar.requestLayout();
                qwVar.c();
                qwVar.s.b.invalidate();
                break;
            case 22:
                iz izVar = (iz) this.b;
                izVar.getClass();
                izVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                izVar.invalidate();
                break;
            case 23:
                mz mzVar = (mz) this.b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mzVar.w = floatValue5;
                View view2 = mzVar.v;
                if (view2 == null) {
                    ci.m6 m6Var = mzVar.s;
                    if (m6Var != null) {
                        m6Var.invalidate();
                        break;
                    }
                } else {
                    view2.setAlpha(floatValue5);
                    break;
                }
                break;
            case 24:
                a10 a10Var = ((s00) this.b).F;
                a10Var.F.invalidate();
                a10Var.invalidate();
                break;
            case 25:
                i10 i10Var = (i10) this.b;
                i10Var.getClass();
                i10Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i10Var.invalidate();
                break;
            case 26:
                q30 q30Var = (q30) this.b;
                o30 o30Var = q30Var.a;
                if (!q30Var.F) {
                    float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    q30Var.b0 = floatValue6;
                    q30Var.U.setPinnedProgress(floatValue6);
                    o30Var.setScaleX(1.0f - (q30Var.b0 * 0.6f));
                    o30Var.setScaleY(1.0f - (q30Var.b0 * 0.6f));
                    if (q30Var.W) {
                        q30Var.i();
                        break;
                    }
                }
                break;
            case 27:
                t60 t60Var = (t60) this.b;
                if (!t60Var.s0) {
                    CameraSession cameraSession = t60Var.t0;
                    if (cameraSession != null) {
                        cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                } else {
                    Camera2Session camera2Session = t60Var.w0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                }
                break;
            case 28:
                d80.Q((d80) this.b, valueAnimator);
                break;
            default:
                d80 d80Var = ((c80) this.b).e;
                d80Var.k0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                viewGroup = ((org.telegram.ui.ActionBar.f3) d80Var).containerView;
                viewGroup.invalidate();
                break;
        }
    }
}
