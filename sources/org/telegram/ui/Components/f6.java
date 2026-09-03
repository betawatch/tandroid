package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                km kmVar = (km) this.b;
                kmVar.getClass();
                kmVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kmVar.O.z.invalidate();
                break;
            case 12:
                oo ooVar = (oo) this.b;
                ooVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ooVar.d = floatValue2;
                ooVar.setShown(floatValue2);
                ooVar.a(false);
                break;
            case 13:
                jp jpVar = (jp) this.b;
                jpVar.getClass();
                jpVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jpVar.G.setTranslationY((-AndroidUtilities.dp(7.0f)) * jpVar.d0);
                break;
            case 14:
                sq sqVar = (sq) this.b;
                sqVar.getClass();
                sqVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = sqVar.H;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 15:
                lr lrVar = (lr) this.b;
                lrVar.getClass();
                lrVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                lrVar.invalidateSelf();
                break;
            case 16:
                lv.p((lv) this.b, valueAnimator);
                break;
            case 17:
                cv cvVar = (cv) this.b;
                cvVar.getClass();
                cvVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (cvVar.getParent() instanceof View) {
                    ((View) cvVar.getParent()).invalidate();
                    break;
                }
                break;
            case 18:
                gv gvVar = (gv) this.b;
                gvVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gvVar.v = floatValue3;
                TextView textView = gvVar.c;
                textView.setScaleX(1.0f - floatValue3);
                textView.setScaleY(1.0f - gvVar.v);
                textView.setAlpha(1.0f - gvVar.v);
                TextView textView2 = gvVar.d;
                textView2.setScaleX(gvVar.v);
                textView2.setScaleY(gvVar.v);
                textView2.setAlpha(gvVar.v);
                break;
            case 19:
                sv svVar = (sv) this.b;
                svVar.getClass();
                svVar.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                svVar.d();
                break;
            case 20:
                uv uvVar = (uv) this.b;
                uvVar.getClass();
                uvVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uvVar.invalidate();
                uvVar.requestLayout();
                uvVar.c();
                uvVar.s.b.invalidate();
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
                    ah.e eVar = wyVar.s;
                    if (eVar != null) {
                        eVar.invalidate();
                        break;
                    }
                } else {
                    view2.setAlpha(floatValue4);
                    break;
                }
                break;
            case 23:
                k00 k00Var = ((d00) this.b).F;
                k00Var.C.invalidate();
                k00Var.invalidate();
                break;
            case 24:
                t00 t00Var = (t00) this.b;
                t00Var.getClass();
                t00Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t00Var.invalidate();
                break;
            case 25:
                b30 b30Var = (b30) this.b;
                z20 z20Var = b30Var.a;
                if (!b30Var.C) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    b30Var.Y = floatValue5;
                    b30Var.R.setPinnedProgress(floatValue5);
                    z20Var.setScaleX(1.0f - (b30Var.Y * 0.6f));
                    z20Var.setScaleY(1.0f - (b30Var.Y * 0.6f));
                    if (b30Var.T) {
                        b30Var.i();
                        break;
                    }
                }
                break;
            case 26:
                y50 y50Var = (y50) this.b;
                if (!y50Var.k0) {
                    CameraSession cameraSession = y50Var.l0;
                    if (cameraSession != null) {
                        cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                } else {
                    Camera2Session camera2Session = y50Var.o0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                }
                break;
            case 27:
                d70.P((d70) this.b, valueAnimator);
                break;
            case 28:
                d70 d70Var = ((c70) this.b).e;
                d70Var.h0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                viewGroup = ((org.telegram.ui.ActionBar.g3) d70Var).containerView;
                viewGroup.invalidate();
                break;
            default:
                p70 p70Var = (p70) this.b;
                p70Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n70 n70Var = p70Var.x;
                if (n70Var != null) {
                    n70Var.setProgress(floatValue6);
                    break;
                }
                break;
        }
    }
}
