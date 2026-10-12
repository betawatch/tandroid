package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class n6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                r6 r6Var = (r6) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r6Var.q = floatValue;
                TimeInterpolator timeInterpolator = r6Var.x;
                if (timeInterpolator != null) {
                    floatValue = timeInterpolator.getInterpolation(floatValue);
                }
                r6Var.r = floatValue;
                r6Var.invalidateSelf();
                Runnable runnable = r6Var.b0;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                z6 z6Var = (z6) this.b;
                z6Var.a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                z6Var.invalidate();
                break;
            case 2:
                m8 m8Var = (m8) this.b;
                m8Var.J.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                m8Var.M.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 3:
                h9 h9Var = (h9) this.b;
                h9Var.getClass();
                h9Var.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                m9 m9Var = (m9) this.b;
                m9Var.getClass();
                m9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m9Var.f();
                break;
            case 5:
                ba baVar = (ba) this.b;
                baVar.getClass();
                baVar.g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                baVar.invalidateSelf();
                break;
            case 6:
                pa paVar = (pa) this.b;
                paVar.getClass();
                paVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                paVar.b.invalidate();
                break;
            case 7:
                ad adVar = (ad) this.b;
                adVar.getClass();
                adVar.j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                adVar.b();
                break;
            case 8:
                wg wgVar = (wg) this.b;
                wgVar.getClass();
                wgVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 9:
                bi biVar = (bi) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vi viVar = biVar.e;
                xh xhVar = viVar.A1;
                xhVar.setAlpha(1.0f - floatValue2);
                viVar.H1.setAlpha(floatValue2);
                float dp = floatValue2 * AndroidUtilities.dp(36.0f);
                viVar.I1 = dp;
                xhVar.setTranslationY(dp);
                break;
            case 10:
                xh xhVar2 = (xh) this.b;
                vi viVar2 = xhVar2.b;
                viVar2.Y1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                viVar2.F0.invalidate();
                viVar2.G0.invalidate();
                xhVar2.invalidate();
                break;
            case 11:
                ((dl) this.b).setFeeVisibilityProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 12:
                bn bnVar = (bn) this.b;
                bnVar.getClass();
                bnVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar.O.z.invalidate();
                break;
            case 13:
                gp gpVar = (gp) this.b;
                gpVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gpVar.d = floatValue3;
                gpVar.setShown(floatValue3);
                gpVar.a(false);
                break;
            case 14:
                zp zpVar = (zp) this.b;
                zpVar.getClass();
                zpVar.g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zpVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * zpVar.g0);
                break;
            case 15:
                ir irVar = (ir) this.b;
                irVar.getClass();
                irVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = irVar.H;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 16:
                ds dsVar = (ds) this.b;
                dsVar.getClass();
                dsVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                dsVar.invalidateSelf();
                break;
            case 17:
                ew.r((ew) this.b, valueAnimator);
                break;
            case 18:
                vv vvVar = (vv) this.b;
                vvVar.getClass();
                vvVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (vvVar.getParent() instanceof View) {
                    ((View) vvVar.getParent()).invalidate();
                    break;
                }
                break;
            case 19:
                zv zvVar = (zv) this.b;
                zvVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zvVar.v = floatValue4;
                TextView textView = zvVar.c;
                textView.setScaleX(1.0f - floatValue4);
                textView.setScaleY(1.0f - zvVar.v);
                textView.setAlpha(1.0f - zvVar.v);
                TextView textView2 = zvVar.d;
                textView2.setScaleX(zvVar.v);
                textView2.setScaleY(zvVar.v);
                textView2.setAlpha(zvVar.v);
                break;
            case 20:
                kw kwVar = (kw) this.b;
                kwVar.getClass();
                kwVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kwVar.d();
                break;
            case 21:
                mw mwVar = (mw) this.b;
                mwVar.getClass();
                mwVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mwVar.invalidate();
                mwVar.requestLayout();
                mwVar.c();
                mwVar.s.b.invalidate();
                break;
            case 22:
                ez ezVar = (ez) this.b;
                ezVar.getClass();
                ezVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ezVar.invalidate();
                break;
            case 23:
                iz izVar = (iz) this.b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                izVar.w = floatValue5;
                View view2 = izVar.v;
                if (view2 == null) {
                    ah.v vVar = izVar.s;
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
                w00 w00Var = ((o00) this.b).F;
                w00Var.F.invalidate();
                w00Var.invalidate();
                break;
            case 25:
                e10 e10Var = (e10) this.b;
                e10Var.getClass();
                e10Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e10Var.invalidate();
                break;
            case 26:
                m30 m30Var = (m30) this.b;
                k30 k30Var = m30Var.a;
                if (!m30Var.F) {
                    float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    m30Var.b0 = floatValue6;
                    m30Var.U.setPinnedProgress(floatValue6);
                    k30Var.setScaleX(1.0f - (m30Var.b0 * 0.6f));
                    k30Var.setScaleY(1.0f - (m30Var.b0 * 0.6f));
                    if (m30Var.W) {
                        m30Var.i();
                        break;
                    }
                }
                break;
            case 27:
                p60 p60Var = (p60) this.b;
                if (!p60Var.s0) {
                    CameraSession cameraSession = p60Var.t0;
                    if (cameraSession != null) {
                        cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                } else {
                    Camera2Session camera2Session = p60Var.w0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                }
                break;
            case 28:
                a80.Q((a80) this.b, valueAnimator);
                break;
            default:
                a80 a80Var = ((z70) this.b).e;
                a80Var.k0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                viewGroup = ((org.telegram.ui.ActionBar.e3) a80Var).containerView;
                viewGroup.invalidate();
                break;
        }
    }
}
