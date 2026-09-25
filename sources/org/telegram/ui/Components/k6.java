package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                o6 o6Var = (o6) this.b;
                o6Var.getClass();
                o6Var.m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o6Var.invalidateSelf();
                Runnable runnable = o6Var.V;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                w6 w6Var = (w6) this.b;
                w6Var.a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                w6Var.invalidate();
                break;
            case 2:
                j8 j8Var = (j8) this.b;
                j8Var.J.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                j8Var.M.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 3:
                e9 e9Var = (e9) this.b;
                e9Var.getClass();
                e9Var.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                j9 j9Var = (j9) this.b;
                j9Var.getClass();
                j9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j9Var.f();
                break;
            case 5:
                y9 y9Var = (y9) this.b;
                y9Var.getClass();
                y9Var.g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9Var.invalidateSelf();
                break;
            case 6:
                na naVar = (na) this.b;
                naVar.getClass();
                naVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                naVar.b.invalidate();
                break;
            case 7:
                yc ycVar = (yc) this.b;
                ycVar.getClass();
                ycVar.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ycVar.b();
                break;
            case 8:
                vg vgVar = (vg) this.b;
                vgVar.getClass();
                vgVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 9:
                ci ciVar = (ci) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wi wiVar = ciVar.e;
                yh yhVar = wiVar.x1;
                yhVar.setAlpha(1.0f - floatValue);
                wiVar.E1.setAlpha(floatValue);
                float dp = floatValue * AndroidUtilities.dp(36.0f);
                wiVar.F1 = dp;
                yhVar.setTranslationY(dp);
                break;
            case 10:
                yh yhVar2 = (yh) this.b;
                wi wiVar2 = yhVar2.b;
                wiVar2.V1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wiVar2.C0.invalidate();
                wiVar2.D0.invalidate();
                yhVar2.invalidate();
                break;
            case 11:
                om omVar = (om) this.b;
                omVar.getClass();
                omVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                omVar.O.z.invalidate();
                break;
            case 12:
                uo uoVar = (uo) this.b;
                uoVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uoVar.d = floatValue2;
                uoVar.setShown(floatValue2);
                uoVar.a(false);
                break;
            case 13:
                np npVar = (np) this.b;
                npVar.getClass();
                npVar.g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                npVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * npVar.g0);
                break;
            case 14:
                wq wqVar = (wq) this.b;
                wqVar.getClass();
                wqVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = wqVar.H;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 15:
                qr qrVar = (qr) this.b;
                qrVar.getClass();
                qrVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                qrVar.invalidateSelf();
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
                    ci.m6 m6Var = yyVar.s;
                    if (m6Var != null) {
                        m6Var.invalidate();
                        break;
                    }
                } else {
                    view2.setAlpha(floatValue4);
                    break;
                }
                break;
            case 23:
                l00 l00Var = ((d00) this.b).F;
                l00Var.F.invalidate();
                l00Var.invalidate();
                break;
            case 24:
                t00 t00Var = (t00) this.b;
                t00Var.getClass();
                t00Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t00Var.invalidate();
                break;
            case 25:
                a30 a30Var = (a30) this.b;
                y20 y20Var = a30Var.a;
                if (!a30Var.F) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    a30Var.b0 = floatValue5;
                    a30Var.U.setPinnedProgress(floatValue5);
                    y20Var.setScaleX(1.0f - (a30Var.b0 * 0.6f));
                    y20Var.setScaleY(1.0f - (a30Var.b0 * 0.6f));
                    if (a30Var.W) {
                        a30Var.i();
                        break;
                    }
                }
                break;
            case 26:
                c60 c60Var = (c60) this.b;
                if (!c60Var.s0) {
                    CameraSession cameraSession = c60Var.t0;
                    if (cameraSession != null) {
                        cameraSession.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                } else {
                    Camera2Session camera2Session = c60Var.w0;
                    if (camera2Session != null) {
                        camera2Session.setZoom(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    }
                }
                break;
            case 27:
                m70.P((m70) this.b, valueAnimator);
                break;
            case 28:
                m70 m70Var = ((l70) this.b).e;
                m70Var.k0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                viewGroup = ((org.telegram.ui.ActionBar.e3) m70Var).containerView;
                viewGroup.invalidate();
                break;
            default:
                y70 y70Var = (y70) this.b;
                y70Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w70 w70Var = y70Var.x;
                if (w70Var != null) {
                    w70Var.setProgress(floatValue6);
                    break;
                }
                break;
        }
    }
}
