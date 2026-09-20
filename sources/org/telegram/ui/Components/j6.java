package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                i8 i8Var = (i8) this.b;
                i8Var.J.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                i8Var.M.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
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
                x9 x9Var = (x9) this.b;
                x9Var.getClass();
                x9Var.g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x9Var.invalidateSelf();
                break;
            case 6:
                ma maVar = (ma) this.b;
                maVar.getClass();
                maVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                maVar.b.invalidate();
                break;
            case 7:
                yc ycVar = (yc) this.b;
                ycVar.getClass();
                ycVar.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ycVar.b();
                break;
            case 8:
                ug ugVar = (ug) this.b;
                ugVar.getClass();
                ugVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 9:
                bi biVar = (bi) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vi viVar = biVar.e;
                xh xhVar = viVar.x1;
                xhVar.setAlpha(1.0f - floatValue);
                viVar.E1.setAlpha(floatValue);
                float dp = floatValue * AndroidUtilities.dp(36.0f);
                viVar.F1 = dp;
                xhVar.setTranslationY(dp);
                break;
            case 10:
                xh xhVar2 = (xh) this.b;
                vi viVar2 = xhVar2.b;
                viVar2.V1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                viVar2.C0.invalidate();
                viVar2.D0.invalidate();
                xhVar2.invalidate();
                break;
            case 11:
                nm nmVar = (nm) this.b;
                nmVar.getClass();
                nmVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nmVar.O.z.invalidate();
                break;
            case 12:
                to toVar = (to) this.b;
                toVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                toVar.d = floatValue2;
                toVar.setShown(floatValue2);
                toVar.a(false);
                break;
            case 13:
                mp mpVar = (mp) this.b;
                mpVar.getClass();
                mpVar.g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mpVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * mpVar.g0);
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
                pr prVar = (pr) this.b;
                prVar.getClass();
                prVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                prVar.invalidateSelf();
                break;
            case 16:
                tv.p((tv) this.b, valueAnimator);
                break;
            case 17:
                kv kvVar = (kv) this.b;
                kvVar.getClass();
                kvVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (kvVar.getParent() instanceof View) {
                    ((View) kvVar.getParent()).invalidate();
                    break;
                }
                break;
            case 18:
                ov ovVar = (ov) this.b;
                ovVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ovVar.v = floatValue3;
                TextView textView = ovVar.c;
                textView.setScaleX(1.0f - floatValue3);
                textView.setScaleY(1.0f - ovVar.v);
                textView.setAlpha(1.0f - ovVar.v);
                TextView textView2 = ovVar.d;
                textView2.setScaleX(ovVar.v);
                textView2.setScaleY(ovVar.v);
                textView2.setAlpha(ovVar.v);
                break;
            case 19:
                zv zvVar = (zv) this.b;
                zvVar.getClass();
                zvVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zvVar.d();
                break;
            case 20:
                bw bwVar = (bw) this.b;
                bwVar.getClass();
                bwVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bwVar.invalidate();
                bwVar.requestLayout();
                bwVar.c();
                bwVar.s.b.invalidate();
                break;
            case 21:
                ty tyVar = (ty) this.b;
                tyVar.getClass();
                tyVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tyVar.invalidate();
                break;
            case 22:
                xy xyVar = (xy) this.b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xyVar.w = floatValue4;
                View view2 = xyVar.v;
                if (view2 == null) {
                    ci.n6 n6Var2 = xyVar.s;
                    if (n6Var2 != null) {
                        n6Var2.invalidate();
                        break;
                    }
                } else {
                    view2.setAlpha(floatValue4);
                    break;
                }
                break;
            case 23:
                k00 k00Var = ((c00) this.b).F;
                k00Var.F.invalidate();
                k00Var.invalidate();
                break;
            case 24:
                s00 s00Var = (s00) this.b;
                s00Var.getClass();
                s00Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s00Var.invalidate();
                break;
            case 25:
                z20 z20Var = (z20) this.b;
                x20 x20Var = z20Var.a;
                if (!z20Var.F) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    z20Var.b0 = floatValue5;
                    z20Var.U.setPinnedProgress(floatValue5);
                    x20Var.setScaleX(1.0f - (z20Var.b0 * 0.6f));
                    x20Var.setScaleY(1.0f - (z20Var.b0 * 0.6f));
                    if (z20Var.W) {
                        z20Var.i();
                        break;
                    }
                }
                break;
            case 26:
                a60 a60Var = (a60) this.b;
                if (!a60Var.q0) {
                    CameraSession cameraSession = a60Var.r0;
                    if (cameraSession != null) {
                        cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                } else {
                    Camera2Session camera2Session = a60Var.u0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                }
                break;
            case 27:
                j70.P((j70) this.b, valueAnimator);
                break;
            case 28:
                j70 j70Var = ((i70) this.b).e;
                j70Var.k0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                viewGroup = ((org.telegram.ui.ActionBar.f3) j70Var).containerView;
                viewGroup.invalidate();
                break;
            default:
                v70 v70Var = (v70) this.b;
                v70Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t70 t70Var = v70Var.x;
                if (t70Var != null) {
                    t70Var.setProgress(floatValue6);
                    break;
                }
                break;
        }
    }
}
