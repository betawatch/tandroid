package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                j6 j6Var = (j6) this.b;
                j6Var.getClass();
                j6Var.m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j6Var.invalidateSelf();
                Runnable runnable = j6Var.V;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                r6 r6Var = (r6) this.b;
                r6Var.a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                r6Var.invalidate();
                break;
            case 2:
                c8 c8Var = (c8) this.b;
                c8Var.G.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                c8Var.J.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 3:
                w8 w8Var = (w8) this.b;
                w8Var.getClass();
                w8Var.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                c9 c9Var = (c9) this.b;
                c9Var.getClass();
                c9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c9Var.f();
                break;
            case 5:
                r9 r9Var = (r9) this.b;
                r9Var.getClass();
                r9Var.g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r9Var.invalidateSelf();
                break;
            case 6:
                fa faVar = (fa) this.b;
                faVar.getClass();
                faVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                faVar.b.invalidate();
                break;
            case 7:
                rc rcVar = (rc) this.b;
                rcVar.getClass();
                rcVar.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rcVar.b();
                break;
            case 8:
                lg lgVar = (lg) this.b;
                lgVar.getClass();
                lgVar.a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 9:
                rh rhVar = (rh) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                li liVar = rhVar.e;
                mh mhVar = liVar.u1;
                mhVar.setAlpha(1.0f - floatValue);
                liVar.B1.setAlpha(floatValue);
                float dp = floatValue * AndroidUtilities.dp(36.0f);
                liVar.C1 = dp;
                mhVar.setTranslationY(dp);
                break;
            case 10:
                mh mhVar2 = (mh) this.b;
                li liVar2 = mhVar2.b;
                liVar2.S1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                liVar2.z0.invalidate();
                liVar2.A0.invalidate();
                mhVar2.invalidate();
                break;
            case 11:
                lm lmVar = (lm) this.b;
                lmVar.getClass();
                lmVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lmVar.O.z.invalidate();
                break;
            case 12:
                po poVar = (po) this.b;
                poVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                poVar.d = floatValue2;
                poVar.setShown(floatValue2);
                poVar.a(false);
                break;
            case 13:
                kp kpVar = (kp) this.b;
                kpVar.getClass();
                kpVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kpVar.G.setTranslationY((-AndroidUtilities.dp(7.0f)) * kpVar.d0);
                break;
            case 14:
                tq tqVar = (tq) this.b;
                tqVar.getClass();
                tqVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = tqVar.H;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 15:
                mr mrVar = (mr) this.b;
                mrVar.getClass();
                mrVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                mrVar.invalidateSelf();
                break;
            case 16:
                mv.p((mv) this.b, valueAnimator);
                break;
            case 17:
                dv dvVar = (dv) this.b;
                dvVar.getClass();
                dvVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (dvVar.getParent() instanceof View) {
                    ((View) dvVar.getParent()).invalidate();
                    break;
                }
                break;
            case 18:
                hv hvVar = (hv) this.b;
                hvVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hvVar.v = floatValue3;
                TextView textView = hvVar.c;
                textView.setScaleX(1.0f - floatValue3);
                textView.setScaleY(1.0f - hvVar.v);
                textView.setAlpha(1.0f - hvVar.v);
                TextView textView2 = hvVar.d;
                textView2.setScaleX(hvVar.v);
                textView2.setScaleY(hvVar.v);
                textView2.setAlpha(hvVar.v);
                break;
            case 19:
                tv tvVar = (tv) this.b;
                tvVar.getClass();
                tvVar.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tvVar.d();
                break;
            case 20:
                vv vvVar = (vv) this.b;
                vvVar.getClass();
                vvVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vvVar.invalidate();
                vvVar.requestLayout();
                vvVar.c();
                vvVar.s.b.invalidate();
                break;
            case 21:
                sy syVar = (sy) this.b;
                syVar.getClass();
                syVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                syVar.invalidate();
                break;
            case 22:
                wy wyVar = (wy) this.b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wyVar.w = floatValue4;
                View view2 = wyVar.v;
                if (view2 == null) {
                    ah.d dVar = wyVar.s;
                    if (dVar != null) {
                        dVar.invalidate();
                        break;
                    }
                } else {
                    view2.setAlpha(floatValue4);
                    break;
                }
                break;
            case 23:
                j00 j00Var = ((c00) this.b).F;
                j00Var.C.invalidate();
                j00Var.invalidate();
                break;
            case 24:
                s00 s00Var = (s00) this.b;
                s00Var.getClass();
                s00Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s00Var.invalidate();
                break;
            case 25:
                a30 a30Var = (a30) this.b;
                y20 y20Var = a30Var.a;
                if (!a30Var.C) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    a30Var.Y = floatValue5;
                    a30Var.R.setPinnedProgress(floatValue5);
                    y20Var.setScaleX(1.0f - (a30Var.Y * 0.6f));
                    y20Var.setScaleY(1.0f - (a30Var.Y * 0.6f));
                    if (a30Var.T) {
                        a30Var.i();
                        break;
                    }
                }
                break;
            case 26:
                x50 x50Var = (x50) this.b;
                if (!x50Var.k0) {
                    CameraSession cameraSession = x50Var.l0;
                    if (cameraSession != null) {
                        cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                } else {
                    Camera2Session camera2Session = x50Var.o0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                }
                break;
            case 27:
                c70.P((c70) this.b, valueAnimator);
                break;
            case 28:
                c70 c70Var = ((b70) this.b).e;
                c70Var.h0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                viewGroup = ((org.telegram.ui.ActionBar.g3) c70Var).containerView;
                viewGroup.invalidate();
                break;
            default:
                o70 o70Var = (o70) this.b;
                o70Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m70 m70Var = o70Var.x;
                if (m70Var != null) {
                    m70Var.setProgress(floatValue6);
                    break;
                }
                break;
        }
    }
}
