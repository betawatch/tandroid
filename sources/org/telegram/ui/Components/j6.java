package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                j8 j8Var = (j8) this.b;
                j8Var.J.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                j8Var.M.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 3:
                d9 d9Var = (d9) this.b;
                d9Var.getClass();
                d9Var.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                i9 i9Var = (i9) this.b;
                i9Var.getClass();
                i9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9Var.f();
                break;
            case 5:
                y9 y9Var = (y9) this.b;
                y9Var.getClass();
                y9Var.g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9Var.invalidateSelf();
                break;
            case 6:
                ma maVar = (ma) this.b;
                maVar.getClass();
                maVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                maVar.b.invalidate();
                break;
            case 7:
                xc xcVar = (xc) this.b;
                xcVar.getClass();
                xcVar.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xcVar.b();
                break;
            case 8:
                xg xgVar = (xg) this.b;
                xgVar.getClass();
                xgVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 9:
                ei eiVar = (ei) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yi yiVar = eiVar.e;
                ai aiVar = yiVar.x1;
                aiVar.setAlpha(1.0f - floatValue);
                yiVar.E1.setAlpha(floatValue);
                float dp = floatValue * AndroidUtilities.dp(36.0f);
                yiVar.F1 = dp;
                aiVar.setTranslationY(dp);
                break;
            case 10:
                ai aiVar2 = (ai) this.b;
                yi yiVar2 = aiVar2.b;
                yiVar2.V1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yiVar2.C0.invalidate();
                yiVar2.D0.invalidate();
                aiVar2.invalidate();
                break;
            case 11:
                um umVar = (um) this.b;
                umVar.getClass();
                umVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                umVar.O.z.invalidate();
                break;
            case 12:
                zo zoVar = (zo) this.b;
                zoVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zoVar.d = floatValue2;
                zoVar.setShown(floatValue2);
                zoVar.a(false);
                break;
            case 13:
                sp spVar = (sp) this.b;
                spVar.getClass();
                spVar.g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                spVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * spVar.g0);
                break;
            case 14:
                br brVar = (br) this.b;
                brVar.getClass();
                brVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = brVar.H;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 15:
                vr vrVar = (vr) this.b;
                vrVar.getClass();
                vrVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                vrVar.invalidateSelf();
                break;
            case 16:
                wv.p((wv) this.b, valueAnimator);
                break;
            case 17:
                nv nvVar = (nv) this.b;
                nvVar.getClass();
                nvVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (nvVar.getParent() instanceof View) {
                    ((View) nvVar.getParent()).invalidate();
                    break;
                }
                break;
            case 18:
                rv rvVar = (rv) this.b;
                rvVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rvVar.v = floatValue3;
                TextView textView = rvVar.c;
                textView.setScaleX(1.0f - floatValue3);
                textView.setScaleY(1.0f - rvVar.v);
                textView.setAlpha(1.0f - rvVar.v);
                TextView textView2 = rvVar.d;
                textView2.setScaleX(rvVar.v);
                textView2.setScaleY(rvVar.v);
                textView2.setAlpha(rvVar.v);
                break;
            case 19:
                cw cwVar = (cw) this.b;
                cwVar.getClass();
                cwVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cwVar.d();
                break;
            case 20:
                ew ewVar = (ew) this.b;
                ewVar.getClass();
                ewVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ewVar.invalidate();
                ewVar.requestLayout();
                ewVar.c();
                ewVar.s.b.invalidate();
                break;
            case 21:
                az azVar = (az) this.b;
                azVar.getClass();
                azVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                azVar.invalidate();
                break;
            case 22:
                ez ezVar = (ez) this.b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ezVar.w = floatValue4;
                View view2 = ezVar.v;
                if (view2 == null) {
                    bi.n7 n7Var = ezVar.s;
                    if (n7Var != null) {
                        n7Var.invalidate();
                        break;
                    }
                } else {
                    view2.setAlpha(floatValue4);
                    break;
                }
                break;
            case 23:
                r00 r00Var = ((j00) this.b).F;
                r00Var.F.invalidate();
                r00Var.invalidate();
                break;
            case 24:
                z00 z00Var = (z00) this.b;
                z00Var.getClass();
                z00Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z00Var.invalidate();
                break;
            case 25:
                j30 j30Var = (j30) this.b;
                h30 h30Var = j30Var.a;
                if (!j30Var.F) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    j30Var.b0 = floatValue5;
                    j30Var.U.setPinnedProgress(floatValue5);
                    h30Var.setScaleX(1.0f - (j30Var.b0 * 0.6f));
                    h30Var.setScaleY(1.0f - (j30Var.b0 * 0.6f));
                    if (j30Var.W) {
                        j30Var.i();
                        break;
                    }
                }
                break;
            case 26:
                f60 f60Var = (f60) this.b;
                if (!f60Var.n0) {
                    CameraSession cameraSession = f60Var.o0;
                    if (cameraSession != null) {
                        cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                } else {
                    Camera2Session camera2Session = f60Var.r0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                }
                break;
            case 27:
                k70.P((k70) this.b, valueAnimator);
                break;
            case 28:
                k70 k70Var = ((j70) this.b).e;
                k70Var.k0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                viewGroup = ((org.telegram.ui.ActionBar.h3) k70Var).containerView;
                viewGroup.invalidate();
                break;
            default:
                w70 w70Var = (w70) this.b;
                w70Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u70 u70Var = w70Var.x;
                if (u70Var != null) {
                    u70Var.setProgress(floatValue6);
                    break;
                }
                break;
        }
    }
}
