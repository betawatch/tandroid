package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b3(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                c3 c3Var = (c3) obj;
                c3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c3Var.d.setTextColor(i0.a.f(floatValue, -16777216, -1));
                c3Var.e.setTextColor(i0.a.f(floatValue, -16777216, -1));
                c3Var.f.setTextColor(i0.a.f(floatValue, -16777216, -1));
                break;
            case 1:
                s4 s4Var = (s4) obj;
                float U1 = org.telegram.messenger.g0.U1(valueAnimator.getAnimatedFraction(), s4Var.n);
                int i10 = (int) (255.0f * U1);
                s4Var.f.setAlpha(i10);
                s4Var.h.setAlpha(i10);
                s4Var.r.setAlpha((int) (66.0f * U1));
                s4Var.s.setAlpha((int) (85.0f * U1));
                s4Var.w.setAlpha(i10);
                s4Var.H = U1;
                s4Var.invalidate();
                break;
            case 2:
                i8 i8Var = (i8) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < i8Var.b.getChildCount(); i11++) {
                    f8.b((f8) i8Var.b.getChildAt(i11), floatValue2);
                }
                break;
            case 3:
                ad adVar = (ad) obj;
                adVar.b.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                adVar.b.invalidateSelf();
                break;
            case 4:
                ((org.telegram.ui.Components.wq) obj).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 5:
                dk dkVar = (dk) obj;
                dkVar.getClass();
                dkVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                dkVar.invalidate();
                break;
            case 6:
                ip ipVar = (ip) obj;
                ipVar.getClass();
                ipVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = ipVar.e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    break;
                }
                break;
            case 7:
                zq zqVar = (zq) obj;
                zqVar.getClass();
                zqVar.R1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zqVar.invalidate();
                if (zqVar.getParent() != null) {
                    ((ViewGroup) zqVar.getParent()).invalidate();
                    break;
                }
                break;
            case 8:
                vq vqVar = (vq) obj;
                vqVar.Q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vqVar.invalidate();
                if (vqVar.getParent() != null) {
                    ((ViewGroup) vqVar.getParent()).invalidate();
                    break;
                }
                break;
            case 9:
                pw pwVar = (pw) obj;
                pwVar.getClass();
                pwVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 10:
                yy yyVar = (yy) obj;
                yyVar.getClass();
                yyVar.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yyVar.invalidate();
                break;
            case 11:
                yz yzVar = (yz) obj;
                yzVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = yzVar.c;
                imageView.setAlpha(floatValue3);
                float f10 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f10);
                imageView.setScaleY(f10);
                View view = yzVar.f;
                float f11 = 1.0f - floatValue3;
                view.setAlpha(f11);
                float f12 = (f11 * 0.5f) + 0.5f;
                view.setScaleX(f12);
                view.setScaleY(f12);
                break;
            case 12:
                x30 x30Var = (x30) obj;
                x30Var.N2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x30Var.O1(true);
                x30Var.m1.invalidate();
                x30Var.I1.invalidate();
                break;
            case 13:
                i30 i30Var = (i30) obj;
                i30Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i30Var.a.invalidate();
                break;
            case 14:
                l30 l30Var = (l30) obj;
                l30Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x30 x30Var2 = l30Var.L;
                x30Var2.I1.invalidate();
                x30Var2.S3.invalidate();
                x30Var2.b.invalidate();
                x30.P0(x30Var2);
                break;
            case 15:
                ((la0) obj).glassEngine.g();
                break;
            case 16:
                xg0 xg0Var = (xg0) obj;
                xg0Var.getClass();
                xg0Var.f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                xg0Var.invalidate();
                break;
            case 17:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                passcodeActivity.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.w.setAlpha(floatValue4);
                passcodeActivity.w.setTranslationY((1.0f - floatValue4) * org.telegram.messenger.g0.L(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                break;
            case 18:
                PhotoViewer photoViewer = ((np0) obj).d;
                photoViewer.U1.l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.U1.invalidate();
                break;
            case 19:
                PhotoViewer photoViewer2 = ((np0) obj).d;
                photoViewer2.U1.l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.U1.invalidate();
                break;
            case 20:
                ((PhotoViewer) ((org.telegram.ui.Components.rk0) obj).b).U1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 21:
                PhotoViewer photoViewer3 = ((qp0) obj).r;
                photoViewer3.n6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.I1();
                break;
            case 22:
                fq0 fq0Var = (fq0) obj;
                fq0Var.getClass();
                fq0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 23:
                vq0 vq0Var = (vq0) obj;
                vq0Var.getClass();
                vq0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vq0Var.e();
                break;
            case 24:
                ((iu0) obj).G.a.invalidate();
                break;
            case 25:
                ProfileActivity profileActivity = ((mv0) obj).y2;
                RectF rectF = ProfileActivity.T6;
                profileActivity.p5();
                break;
            case 26:
                cw0 cw0Var = (cw0) obj;
                float[] fArr = cw0Var.n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                cw0Var.G = animatedFraction;
                cw0Var.e(true, org.telegram.messenger.g0.U1(animatedFraction, fArr));
                break;
            case 27:
                ew0 ew0Var = (ew0) obj;
                float U12 = org.telegram.messenger.g0.U1(valueAnimator.getAnimatedFraction(), ew0Var.e);
                ProfileActivity profileActivity2 = ew0Var.n;
                org.telegram.ui.ActionBar.f5 f5Var = profileActivity2.U0;
                if (f5Var != null && !profileActivity2.p2) {
                    float f13 = 1.0f - U12;
                    f5Var.setScaleX(f13);
                    profileActivity2.U0.setScaleY(f13);
                    profileActivity2.U0.setAlpha(f13);
                }
                ew0Var.setScaleX(U12);
                ew0Var.setScaleY(U12);
                ew0Var.setAlpha(U12);
                break;
            case 28:
                cx0 cx0Var = (cx0) obj;
                cx0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cx0Var.b();
                break;
            default:
                mx0 mx0Var = (mx0) obj;
                mx0Var.E = org.telegram.messenger.g0.U1(valueAnimator.getAnimatedFraction(), mx0Var.F);
                mx0Var.h.setTextColor(i0.a.f(mx0Var.E, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.z6, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q6, false)));
                break;
        }
    }
}
