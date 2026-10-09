package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                d3 d3Var = (d3) this.b;
                d3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d3Var.d.setTextColor(i0.a.d(floatValue, -16777216, -1));
                d3Var.e.setTextColor(i0.a.d(floatValue, -16777216, -1));
                d3Var.f.setTextColor(i0.a.d(floatValue, -16777216, -1));
                break;
            case 1:
                q4 q4Var = (q4) this.b;
                float lerp = AndroidUtilities.lerp(q4Var.n, valueAnimator.getAnimatedFraction());
                int i10 = (int) (255.0f * lerp);
                q4Var.f.setAlpha(i10);
                q4Var.h.setAlpha(i10);
                q4Var.r.setAlpha((int) (66.0f * lerp));
                q4Var.s.setAlpha((int) (85.0f * lerp));
                q4Var.v.setAlpha(i10);
                q4Var.G = lerp;
                q4Var.invalidate();
                break;
            case 2:
                y6.X((y6) this.b, valueAnimator);
                break;
            case 3:
                g8 g8Var = (g8) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < g8Var.b.getChildCount(); i11++) {
                    d8.b((d8) g8Var.b.getChildAt(i11), floatValue2);
                }
                break;
            case 4:
                md mdVar = (md) this.b;
                mdVar.b.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                mdVar.b.invalidateSelf();
                break;
            case 5:
                ((org.telegram.ui.Components.gs) this.b).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                el elVar = (el) this.b;
                elVar.getClass();
                elVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                elVar.invalidate();
                break;
            case 7:
                ip ipVar = (ip) this.b;
                ipVar.r.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ipVar.r.invalidateSelf();
                break;
            case 8:
                es esVar = (es) this.b;
                esVar.getClass();
                esVar.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                esVar.invalidate();
                if (esVar.getParent() != null) {
                    ((ViewGroup) esVar.getParent()).invalidate();
                    break;
                }
                break;
            case 9:
                as asVar = (as) this.b;
                asVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                asVar.invalidate();
                if (asVar.getParent() != null) {
                    ((ViewGroup) asVar.getParent()).invalidate();
                    break;
                }
                break;
            case 10:
                py pyVar = (py) this.b;
                pyVar.getClass();
                pyVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 11:
                kz kzVar = (kz) this.b;
                kzVar.getClass();
                kzVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.y9 y9Var = kzVar.c;
                int i12 = org.telegram.ui.ActionBar.i6.C6;
                org.telegram.ui.ActionBar.e6 e6Var = kzVar.a;
                int w02 = org.telegram.ui.ActionBar.i6.w0(i12, e6Var);
                int i13 = org.telegram.ui.ActionBar.i6.Oh;
                int d = i0.a.d(kzVar.r, w02, org.telegram.ui.ActionBar.i6.w0(i13, e6Var));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                y9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                y9Var.invalidate();
                org.telegram.ui.Components.y9 y9Var2 = kzVar.f;
                y9Var2.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - kzVar.r, org.telegram.ui.ActionBar.i6.w0(i12, e6Var), org.telegram.ui.ActionBar.i6.w0(i13, e6Var)), mode));
                y9Var2.invalidate();
                break;
            case 12:
                c00 c00Var = (c00) this.b;
                c00Var.n.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                c00Var.n.invalidateSelf();
                break;
            case 13:
                y00 y00Var = (y00) this.b;
                y00Var.getClass();
                y00Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y00Var.invalidate();
                break;
            case 14:
                y10 y10Var = (y10) this.b;
                y10Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = y10Var.c;
                imageView.setAlpha(floatValue3);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f7);
                imageView.setScaleY(f7);
                View view = y10Var.f;
                float f10 = 1.0f - floatValue3;
                view.setAlpha(f10);
                float f11 = (f10 * 0.5f) + 0.5f;
                view.setScaleX(f11);
                view.setScaleY(f11);
                break;
            case 15:
                g60 g60Var = (g60) this.b;
                g60Var.V0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g60Var.M1(true);
                g60Var.e.invalidate();
                g60Var.Q.invalidate();
                break;
            case 16:
                p50 p50Var = (p50) this.b;
                p50Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p50Var.a.invalidate();
                break;
            case 17:
                u50 u50Var = (u50) this.b;
                u50Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g60 g60Var2 = u50Var.L;
                g60Var2.Q.invalidate();
                g60Var2.a2.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) g60Var2).containerView;
                viewGroup.invalidate();
                g60.K0(g60Var2);
                break;
            case 18:
                fk0 fk0Var = (fk0) this.b;
                fk0Var.getClass();
                fk0Var.f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                fk0Var.invalidate();
                break;
            case 19:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                passcodeActivity.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.v.setAlpha(floatValue4);
                passcodeActivity.v.setTranslationY((1.0f - floatValue4) * AndroidUtilities.dp(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                break;
            case 20:
                PhotoViewer photoViewer = ((du0) this.b).d;
                photoViewer.T1.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.T1.invalidate();
                break;
            case 21:
                PhotoViewer photoViewer2 = ((du0) this.b).d;
                photoViewer2.T1.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.T1.invalidate();
                break;
            case 22:
                ((PhotoViewer) ((org.telegram.ui.Components.kn0) this.b).b).T1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 23:
                PhotoViewer photoViewer3 = ((gu0) this.b).r;
                photoViewer3.m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.G1();
                break;
            case 24:
                vu0 vu0Var = (vu0) this.b;
                vu0Var.getClass();
                vu0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 25:
                qv0 qv0Var = (qv0) this.b;
                qv0Var.getClass();
                qv0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qv0Var.e();
                break;
            case 26:
                ((fz0) this.b).G.a.invalidate();
                break;
            case 27:
                ((k01) this.b).g2.U4();
                break;
            case 28:
                z01 z01Var = (z01) this.b;
                float[] fArr = z01Var.n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                z01Var.F = animatedFraction;
                z01Var.e(AndroidUtilities.lerp(fArr, animatedFraction), true);
                break;
            default:
                b11 b11Var = (b11) this.b;
                float lerp2 = AndroidUtilities.lerp(b11Var.e, valueAnimator.getAnimatedFraction());
                ProfileActivity profileActivity = b11Var.n;
                org.telegram.ui.ActionBar.v0 v0Var = profileActivity.U0;
                if (v0Var != null && !profileActivity.p2) {
                    float f12 = 1.0f - lerp2;
                    v0Var.setScaleX(f12);
                    profileActivity.U0.setScaleY(f12);
                    profileActivity.U0.setAlpha(f12);
                }
                if (profileActivity.N0) {
                    float f13 = 1.0f - lerp2;
                    profileActivity.S0.setScaleX(f13);
                    profileActivity.S0.setScaleY(f13);
                    profileActivity.S0.setAlpha(f13);
                }
                if (profileActivity.L0) {
                    float f14 = 1.0f - lerp2;
                    profileActivity.Q0.setScaleX(f14);
                    profileActivity.Q0.setScaleY(f14);
                    profileActivity.Q0.setAlpha(f14);
                }
                if (profileActivity.M0) {
                    float f15 = 1.0f - lerp2;
                    profileActivity.R0.setScaleX(f15);
                    profileActivity.R0.setScaleY(f15);
                    profileActivity.R0.setAlpha(f15);
                }
                b11Var.setScaleX(lerp2);
                b11Var.setScaleY(lerp2);
                b11Var.setAlpha(lerp2);
                break;
        }
    }
}
