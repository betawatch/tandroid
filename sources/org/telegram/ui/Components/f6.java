package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                mi miVar = rhVar.e;
                mh mhVar = miVar.u1;
                mhVar.setAlpha(1.0f - floatValue);
                miVar.B1.setAlpha(floatValue);
                float dp = floatValue * AndroidUtilities.dp(36.0f);
                miVar.C1 = dp;
                mhVar.setTranslationY(dp);
                break;
            case 10:
                mh mhVar2 = (mh) this.b;
                mi miVar2 = mhVar2.b;
                miVar2.S1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                miVar2.z0.invalidate();
                miVar2.A0.invalidate();
                mhVar2.invalidate();
                break;
            case 11:
                mm mmVar = (mm) this.b;
                mmVar.getClass();
                mmVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mmVar.O.z.invalidate();
                break;
            case 12:
                ro roVar = (ro) this.b;
                roVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                roVar.d = floatValue2;
                roVar.setShown(floatValue2);
                roVar.a(false);
                break;
            case 13:
                mp mpVar = (mp) this.b;
                mpVar.getClass();
                mpVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mpVar.G.setTranslationY((-AndroidUtilities.dp(7.0f)) * mpVar.d0);
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
                or orVar = (or) this.b;
                orVar.getClass();
                orVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                orVar.invalidateSelf();
                break;
            case 16:
                ov.p((ov) this.b, valueAnimator);
                break;
            case 17:
                fv fvVar = (fv) this.b;
                fvVar.getClass();
                fvVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (fvVar.getParent() instanceof View) {
                    ((View) fvVar.getParent()).invalidate();
                    break;
                }
                break;
            case 18:
                jv jvVar = (jv) this.b;
                jvVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jvVar.v = floatValue3;
                TextView textView = jvVar.c;
                textView.setScaleX(1.0f - floatValue3);
                textView.setScaleY(1.0f - jvVar.v);
                textView.setAlpha(1.0f - jvVar.v);
                TextView textView2 = jvVar.d;
                textView2.setScaleX(jvVar.v);
                textView2.setScaleY(jvVar.v);
                textView2.setAlpha(jvVar.v);
                break;
            case 19:
                vv vvVar = (vv) this.b;
                vvVar.getClass();
                vvVar.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vvVar.d();
                break;
            case 20:
                xv xvVar = (xv) this.b;
                xvVar.getClass();
                xvVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xvVar.invalidate();
                xvVar.requestLayout();
                xvVar.c();
                xvVar.s.b.invalidate();
                break;
            case 21:
                uy uyVar = (uy) this.b;
                uyVar.getClass();
                uyVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uyVar.invalidate();
                break;
            case 22:
                yy yyVar = (yy) this.b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yyVar.w = floatValue4;
                View view2 = yyVar.v;
                if (view2 == null) {
                    ag.l lVar = yyVar.s;
                    if (lVar != null) {
                        lVar.invalidate();
                        break;
                    }
                } else {
                    view2.setAlpha(floatValue4);
                    break;
                }
                break;
            case 23:
                l00 l00Var = ((e00) this.b).F;
                l00Var.C.invalidate();
                l00Var.invalidate();
                break;
            case 24:
                t00 t00Var = (t00) this.b;
                t00Var.getClass();
                t00Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t00Var.invalidate();
                break;
            case 25:
                c30 c30Var = (c30) this.b;
                a30 a30Var = c30Var.a;
                if (!c30Var.C) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    c30Var.Y = floatValue5;
                    c30Var.R.setPinnedProgress(floatValue5);
                    a30Var.setScaleX(1.0f - (c30Var.Y * 0.6f));
                    a30Var.setScaleY(1.0f - (c30Var.Y * 0.6f));
                    if (c30Var.T) {
                        c30Var.i();
                        break;
                    }
                }
                break;
            case 26:
                z50 z50Var = (z50) this.b;
                if (!z50Var.k0) {
                    CameraSession cameraSession = z50Var.l0;
                    if (cameraSession != null) {
                        cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                } else {
                    Camera2Session camera2Session = z50Var.o0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                }
                break;
            case 27:
                e70.P((e70) this.b, valueAnimator);
                break;
            case 28:
                e70 e70Var = ((d70) this.b).e;
                e70Var.h0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                viewGroup = ((org.telegram.ui.ActionBar.h3) e70Var).containerView;
                viewGroup.invalidate();
                break;
            default:
                q70 q70Var = (q70) this.b;
                q70Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o70 o70Var = q70Var.x;
                if (o70Var != null) {
                    o70Var.setProgress(floatValue6);
                    break;
                }
                break;
        }
    }
}
