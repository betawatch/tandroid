package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e6(Object obj, int i10) {
        this.a = i10;
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
                b8 b8Var = (b8) this.b;
                b8Var.F.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                b8Var.I.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 3:
                v8 v8Var = (v8) this.b;
                v8Var.getClass();
                v8Var.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                a9 a9Var = (a9) this.b;
                a9Var.getClass();
                a9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a9Var.f();
                break;
            case 5:
                p9 p9Var = (p9) this.b;
                p9Var.getClass();
                p9Var.g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p9Var.invalidateSelf();
                break;
            case 6:
                da daVar = (da) this.b;
                daVar.getClass();
                daVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                daVar.b.invalidate();
                break;
            case 7:
                nc ncVar = (nc) this.b;
                ncVar.getClass();
                ncVar.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ncVar.b();
                break;
            case 8:
                hg hgVar = (hg) this.b;
                hgVar.getClass();
                hgVar.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 9:
                nh nhVar = (nh) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gi giVar = nhVar.e;
                ih ihVar = giVar.t1;
                ihVar.setAlpha(1.0f - floatValue);
                giVar.A1.setAlpha(floatValue);
                float dp = floatValue * AndroidUtilities.dp(36.0f);
                giVar.B1 = dp;
                ihVar.setTranslationY(dp);
                break;
            case 10:
                ih ihVar2 = (ih) this.b;
                gi giVar2 = ihVar2.b;
                giVar2.R1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                giVar2.y0.invalidate();
                giVar2.z0.invalidate();
                ihVar2.invalidate();
                break;
            case 11:
                bm bmVar = (bm) this.b;
                bmVar.getClass();
                bmVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bmVar.O.z.invalidate();
                break;
            case 12:
                ho hoVar = (ho) this.b;
                hoVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hoVar.d = floatValue2;
                hoVar.setShown(floatValue2);
                hoVar.a(false);
                break;
            case 13:
                ap apVar = (ap) this.b;
                apVar.getClass();
                apVar.c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                apVar.F.setTranslationY((-AndroidUtilities.dp(7.0f)) * apVar.c0);
                break;
            case 14:
                jq jqVar = (jq) this.b;
                jqVar.getClass();
                jqVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = jqVar.H;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 15:
                dr drVar = (dr) this.b;
                drVar.getClass();
                drVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                drVar.invalidateSelf();
                break;
            case 16:
                cv.q((cv) this.b, valueAnimator);
                break;
            case 17:
                tu tuVar = (tu) this.b;
                tuVar.getClass();
                tuVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (tuVar.getParent() instanceof View) {
                    ((View) tuVar.getParent()).invalidate();
                    break;
                }
                break;
            case 18:
                xu xuVar = (xu) this.b;
                xuVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xuVar.v = floatValue3;
                TextView textView = xuVar.c;
                textView.setScaleX(1.0f - floatValue3);
                textView.setScaleY(1.0f - xuVar.v);
                textView.setAlpha(1.0f - xuVar.v);
                TextView textView2 = xuVar.d;
                textView2.setScaleX(xuVar.v);
                textView2.setScaleY(xuVar.v);
                textView2.setAlpha(xuVar.v);
                break;
            case 19:
                iv ivVar = (iv) this.b;
                ivVar.getClass();
                ivVar.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ivVar.d();
                break;
            case 20:
                kv kvVar = (kv) this.b;
                kvVar.getClass();
                kvVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kvVar.invalidate();
                kvVar.requestLayout();
                kvVar.c();
                kvVar.s.b.invalidate();
                break;
            case 21:
                gy gyVar = (gy) this.b;
                gyVar.getClass();
                gyVar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gyVar.invalidate();
                break;
            case 22:
                ky kyVar = (ky) this.b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kyVar.w = floatValue4;
                View view2 = kyVar.v;
                if (view2 == null) {
                    ag.y1 y1Var = kyVar.s;
                    if (y1Var != null) {
                        y1Var.invalidate();
                        break;
                    }
                } else {
                    view2.setAlpha(floatValue4);
                    break;
                }
                break;
            case 23:
                yz yzVar = ((qz) this.b).F;
                yzVar.B.invalidate();
                yzVar.invalidate();
                break;
            case 24:
                g00 g00Var = (g00) this.b;
                g00Var.getClass();
                g00Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g00Var.invalidate();
                break;
            case 25:
                n20 n20Var = (n20) this.b;
                k20 k20Var = n20Var.a;
                if (!n20Var.B) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    n20Var.X = floatValue5;
                    n20Var.Q.setPinnedProgress(floatValue5);
                    k20Var.setScaleX(1.0f - (n20Var.X * 0.6f));
                    k20Var.setScaleY(1.0f - (n20Var.X * 0.6f));
                    if (n20Var.S) {
                        n20Var.i();
                        break;
                    }
                }
                break;
            case 26:
                k50 k50Var = (k50) this.b;
                if (!k50Var.j0) {
                    CameraSession cameraSession = k50Var.k0;
                    if (cameraSession != null) {
                        cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                } else {
                    Camera2Session camera2Session = k50Var.n0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                }
                break;
            case 27:
                p60.P((p60) this.b, valueAnimator);
                break;
            case 28:
                p60 p60Var = ((o60) this.b).e;
                p60Var.g0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                viewGroup = ((org.telegram.ui.ActionBar.e3) p60Var).containerView;
                viewGroup.invalidate();
                break;
            default:
                b70 b70Var = (b70) this.b;
                b70Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z60 z60Var = b70Var.x;
                if (z60Var != null) {
                    z60Var.setProgress(floatValue6);
                    break;
                }
                break;
        }
    }
}
