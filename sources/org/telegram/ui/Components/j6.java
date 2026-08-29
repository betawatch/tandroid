package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                n6 n6Var = (n6) this.b;
                n6Var.getClass();
                n6Var.m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n6Var.invalidateSelf();
                Runnable runnable = n6Var.V;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                v6 v6Var = (v6) this.b;
                v6Var.a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                v6Var.invalidate();
                break;
            case 2:
                g8 g8Var = (g8) this.b;
                g8Var.F.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                g8Var.I.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 3:
                b9 b9Var = (b9) this.b;
                b9Var.getClass();
                b9Var.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                g9 g9Var = (g9) this.b;
                g9Var.getClass();
                g9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g9Var.f();
                break;
            case 5:
                v9 v9Var = (v9) this.b;
                v9Var.getClass();
                v9Var.g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v9Var.invalidateSelf();
                break;
            case 6:
                ka kaVar = (ka) this.b;
                kaVar.getClass();
                kaVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kaVar.b.invalidate();
                break;
            case 7:
                uc ucVar = (uc) this.b;
                ucVar.getClass();
                ucVar.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ucVar.b();
                break;
            case 8:
                og ogVar = (og) this.b;
                ogVar.getClass();
                ogVar.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 9:
                uh uhVar = (uh) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ni niVar = uhVar.e;
                ph phVar = niVar.t1;
                phVar.setAlpha(1.0f - floatValue);
                niVar.A1.setAlpha(floatValue);
                float dp = floatValue * AndroidUtilities.dp(36.0f);
                niVar.B1 = dp;
                phVar.setTranslationY(dp);
                break;
            case 10:
                ph phVar2 = (ph) this.b;
                ni niVar2 = phVar2.b;
                niVar2.R1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                niVar2.y0.invalidate();
                niVar2.z0.invalidate();
                phVar2.invalidate();
                break;
            case 11:
                im imVar = (im) this.b;
                imVar.getClass();
                imVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                imVar.O.z.invalidate();
                break;
            case 12:
                no noVar = (no) this.b;
                noVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                noVar.d = floatValue2;
                noVar.setShown(floatValue2);
                noVar.a(false);
                break;
            case 13:
                gp gpVar = (gp) this.b;
                gpVar.getClass();
                gpVar.c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gpVar.F.setTranslationY((-AndroidUtilities.dp(7.0f)) * gpVar.c0);
                break;
            case 14:
                pq pqVar = (pq) this.b;
                pqVar.getClass();
                pqVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = pqVar.H;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 15:
                ir irVar = (ir) this.b;
                irVar.getClass();
                irVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                irVar.invalidateSelf();
                break;
            case 16:
                jv.p((jv) this.b, valueAnimator);
                break;
            case 17:
                av avVar = (av) this.b;
                avVar.getClass();
                avVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (avVar.getParent() instanceof View) {
                    ((View) avVar.getParent()).invalidate();
                    break;
                }
                break;
            case 18:
                ev evVar = (ev) this.b;
                evVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                evVar.v = floatValue3;
                TextView textView = evVar.c;
                textView.setScaleX(1.0f - floatValue3);
                textView.setScaleY(1.0f - evVar.v);
                textView.setAlpha(1.0f - evVar.v);
                TextView textView2 = evVar.d;
                textView2.setScaleX(evVar.v);
                textView2.setScaleY(evVar.v);
                textView2.setAlpha(evVar.v);
                break;
            case 19:
                pv pvVar = (pv) this.b;
                pvVar.getClass();
                pvVar.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pvVar.d();
                break;
            case 20:
                rv rvVar = (rv) this.b;
                rvVar.getClass();
                rvVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rvVar.invalidate();
                rvVar.requestLayout();
                rvVar.c();
                rvVar.s.b.invalidate();
                break;
            case 21:
                ny nyVar = (ny) this.b;
                nyVar.getClass();
                nyVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nyVar.invalidate();
                break;
            case 22:
                ry ryVar = (ry) this.b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ryVar.w = floatValue4;
                View view2 = ryVar.v;
                if (view2 == null) {
                    bg.d1 d1Var = ryVar.s;
                    if (d1Var != null) {
                        d1Var.invalidate();
                        break;
                    }
                } else {
                    view2.setAlpha(floatValue4);
                    break;
                }
                break;
            case 23:
                f00 f00Var = ((xz) this.b).F;
                f00Var.B.invalidate();
                f00Var.invalidate();
                break;
            case 24:
                o00 o00Var = (o00) this.b;
                o00Var.getClass();
                o00Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o00Var.invalidate();
                break;
            case 25:
                w20 w20Var = (w20) this.b;
                t20 t20Var = w20Var.a;
                if (!w20Var.B) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    w20Var.X = floatValue5;
                    w20Var.Q.setPinnedProgress(floatValue5);
                    t20Var.setScaleX(1.0f - (w20Var.X * 0.6f));
                    t20Var.setScaleY(1.0f - (w20Var.X * 0.6f));
                    if (w20Var.S) {
                        w20Var.i();
                        break;
                    }
                }
                break;
            case 26:
                s50 s50Var = (s50) this.b;
                if (!s50Var.j0) {
                    CameraSession cameraSession = s50Var.k0;
                    if (cameraSession != null) {
                        cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                } else {
                    Camera2Session camera2Session = s50Var.n0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                }
                break;
            case 27:
                x60.P((x60) this.b, valueAnimator);
                break;
            case 28:
                x60 x60Var = ((w60) this.b).e;
                x60Var.g0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                viewGroup = ((org.telegram.ui.ActionBar.f3) x60Var).containerView;
                viewGroup.invalidate();
                break;
            default:
                j70 j70Var = (j70) this.b;
                j70Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h70 h70Var = j70Var.x;
                if (h70Var != null) {
                    h70Var.setProgress(floatValue6);
                    break;
                }
                break;
        }
    }
}
