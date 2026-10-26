package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                m8Var.I.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                m8Var.L.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 3:
                g9 g9Var = (g9) this.b;
                g9Var.getClass();
                g9Var.k0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                l9 l9Var = (l9) this.b;
                l9Var.getClass();
                l9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l9Var.f();
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
                xc xcVar = (xc) this.b;
                xcVar.getClass();
                xcVar.j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xcVar.b();
                break;
            case 8:
                ld ldVar = ((md) this.b).c;
                ldVar.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ldVar.invalidate();
                break;
            case 9:
                vg vgVar = (vg) this.b;
                vgVar.getClass();
                vgVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 10:
                zh zhVar = (zh) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ti tiVar = zhVar.e;
                th thVar = tiVar.A1;
                thVar.setAlpha(1.0f - floatValue2);
                tiVar.H1.setAlpha(floatValue2);
                float dp = floatValue2 * AndroidUtilities.dp(36.0f);
                tiVar.I1 = dp;
                thVar.setTranslationY(dp);
                break;
            case 11:
                th thVar2 = (th) this.b;
                ti tiVar2 = thVar2.b;
                tiVar2.Y1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tiVar2.F0.invalidate();
                tiVar2.G0.invalidate();
                thVar2.invalidate();
                break;
            case 12:
                ((al) this.b).setFeeVisibilityProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 13:
                zm zmVar = (zm) this.b;
                zmVar.getClass();
                zmVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zmVar.O.z.invalidate();
                break;
            case 14:
                fp fpVar = (fp) this.b;
                fpVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fpVar.d = floatValue3;
                fpVar.setShown(floatValue3);
                fpVar.a(false);
                break;
            case 15:
                yp ypVar = (yp) this.b;
                ypVar.getClass();
                ypVar.f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ypVar.I.setTranslationY((-AndroidUtilities.dp(7.0f)) * ypVar.f0);
                break;
            case 16:
                gr grVar = (gr) this.b;
                grVar.getClass();
                grVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = grVar.H;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 17:
                aw.p((aw) this.b, valueAnimator);
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
                bz bzVar = (bz) this.b;
                bzVar.getClass();
                bzVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bzVar.invalidate();
                break;
            case 23:
                fz fzVar = (fz) this.b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fzVar.w = floatValue5;
                View view2 = fzVar.v;
                if (view2 == null) {
                    bh.p pVar = fzVar.s;
                    if (pVar != null) {
                        pVar.invalidate();
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
                k30 k30Var = (k30) this.b;
                h30 h30Var = k30Var.a;
                if (!k30Var.F) {
                    float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    k30Var.b0 = floatValue6;
                    k30Var.U.setPinnedProgress(floatValue6);
                    h30Var.setScaleX(1.0f - (k30Var.b0 * 0.6f));
                    h30Var.setScaleY(1.0f - (k30Var.b0 * 0.6f));
                    if (k30Var.W) {
                        k30Var.i();
                        break;
                    }
                }
                break;
            case 27:
                o60 o60Var = (o60) this.b;
                if (!o60Var.s0) {
                    CameraSession cameraSession = o60Var.t0;
                    if (cameraSession != null) {
                        cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                } else {
                    Camera2Session camera2Session = o60Var.w0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                }
                break;
            case 28:
                y70.P((y70) this.b, valueAnimator);
                break;
            default:
                y70 y70Var = ((x70) this.b).e;
                y70Var.k0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                viewGroup = ((org.telegram.ui.ActionBar.k3) y70Var).containerView;
                viewGroup.invalidate();
                break;
        }
    }
}
