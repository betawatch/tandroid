package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e6(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                i6 i6Var = (i6) this.b;
                i6Var.getClass();
                i6Var.m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i6Var.invalidateSelf();
                Runnable runnable = i6Var.V;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                q6 q6Var = (q6) this.b;
                q6Var.a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                q6Var.invalidate();
                break;
            case 2:
                c8 c8Var = (c8) this.b;
                c8Var.F.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                c8Var.I.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 3:
                w8 w8Var = (w8) this.b;
                w8Var.getClass();
                w8Var.i0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                b9 b9Var = (b9) this.b;
                b9Var.getClass();
                b9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b9Var.f();
                break;
            case 5:
                q9 q9Var = (q9) this.b;
                q9Var.getClass();
                q9Var.g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q9Var.invalidateSelf();
                break;
            case 6:
                fa faVar = (fa) this.b;
                faVar.getClass();
                faVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                faVar.b.invalidate();
                break;
            case 7:
                pc pcVar = (pc) this.b;
                pcVar.getClass();
                pcVar.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pcVar.b();
                break;
            case 8:
                lg lgVar = (lg) this.b;
                lgVar.getClass();
                lgVar.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 9:
                rh rhVar = (rh) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ki kiVar = rhVar.e;
                mh mhVar = kiVar.t1;
                mhVar.setAlpha(1.0f - floatValue);
                kiVar.A1.setAlpha(floatValue);
                float dp = floatValue * AndroidUtilities.dp(36.0f);
                kiVar.B1 = dp;
                mhVar.setTranslationY(dp);
                break;
            case 10:
                mh mhVar2 = (mh) this.b;
                ki kiVar2 = mhVar2.b;
                kiVar2.R1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kiVar2.y0.invalidate();
                kiVar2.z0.invalidate();
                mhVar2.invalidate();
                break;
            case 11:
                em emVar = (em) this.b;
                emVar.getClass();
                emVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                emVar.O.z.invalidate();
                break;
            case 12:
                jo joVar = (jo) this.b;
                joVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                joVar.d = floatValue2;
                joVar.setShown(floatValue2);
                joVar.a(false);
                break;
            case 13:
                cp cpVar = (cp) this.b;
                cpVar.getClass();
                cpVar.c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cpVar.F.setTranslationY((-AndroidUtilities.dp(7.0f)) * cpVar.c0);
                break;
            case 14:
                lq lqVar = (lq) this.b;
                lqVar.getClass();
                lqVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = lqVar.H;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 15:
                fr frVar = (fr) this.b;
                frVar.getClass();
                frVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                frVar.invalidateSelf();
                break;
            case 16:
                dv.p((dv) this.b, valueAnimator);
                break;
            case 17:
                uu uuVar = (uu) this.b;
                uuVar.getClass();
                uuVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (uuVar.getParent() instanceof View) {
                    ((View) uuVar.getParent()).invalidate();
                    break;
                }
                break;
            case 18:
                yu yuVar = (yu) this.b;
                yuVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yuVar.v = floatValue3;
                TextView textView = yuVar.c;
                textView.setScaleX(1.0f - floatValue3);
                textView.setScaleY(1.0f - yuVar.v);
                textView.setAlpha(1.0f - yuVar.v);
                TextView textView2 = yuVar.d;
                textView2.setScaleX(yuVar.v);
                textView2.setScaleY(yuVar.v);
                textView2.setAlpha(yuVar.v);
                break;
            case 19:
                jv jvVar = (jv) this.b;
                jvVar.getClass();
                jvVar.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jvVar.d();
                break;
            case 20:
                lv lvVar = (lv) this.b;
                lvVar.getClass();
                lvVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lvVar.invalidate();
                lvVar.requestLayout();
                lvVar.c();
                lvVar.s.b.invalidate();
                break;
            case 21:
                fy fyVar = (fy) this.b;
                fyVar.getClass();
                fyVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fyVar.invalidate();
                break;
            case 22:
                jy jyVar = (jy) this.b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jyVar.w = floatValue4;
                View view2 = jyVar.v;
                if (view2 == null) {
                    fh.v vVar = jyVar.s;
                    if (vVar != null) {
                        vVar.invalidate();
                        break;
                    }
                } else {
                    view2.setAlpha(floatValue4);
                    break;
                }
                break;
            case 23:
                vz vzVar = ((oz) this.b).F;
                vzVar.B.invalidate();
                vzVar.invalidate();
                break;
            case 24:
                d00 d00Var = (d00) this.b;
                d00Var.getClass();
                d00Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d00Var.invalidate();
                break;
            case 25:
                j20 j20Var = (j20) this.b;
                h20 h20Var = j20Var.a;
                if (!j20Var.B) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    j20Var.X = floatValue5;
                    j20Var.Q.setPinnedProgress(floatValue5);
                    h20Var.setScaleX(1.0f - (j20Var.X * 0.6f));
                    h20Var.setScaleY(1.0f - (j20Var.X * 0.6f));
                    if (j20Var.S) {
                        j20Var.i();
                        break;
                    }
                }
                break;
            case 26:
                f50 f50Var = (f50) this.b;
                if (!f50Var.j0) {
                    CameraSession cameraSession = f50Var.k0;
                    if (cameraSession != null) {
                        cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                } else {
                    Camera2Session camera2Session = f50Var.n0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                }
                break;
            case 27:
                k60.O((k60) this.b, valueAnimator);
                break;
            case 28:
                k60 k60Var = ((j60) this.b).e;
                k60Var.g0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                viewGroup = ((org.telegram.ui.ActionBar.f3) k60Var).containerView;
                viewGroup.invalidate();
                break;
            default:
                x60 x60Var = (x60) this.b;
                x60Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v60 v60Var = x60Var.x;
                if (v60Var != null) {
                    v60Var.setProgress(floatValue6);
                    break;
                }
                break;
        }
    }
}
