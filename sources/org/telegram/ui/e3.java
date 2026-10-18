package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                f3 f3Var = (f3) this.b;
                f3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f3Var.d.setTextColor(i0.a.f(floatValue, -16777216, -1));
                f3Var.e.setTextColor(i0.a.f(floatValue, -16777216, -1));
                f3Var.f.setTextColor(i0.a.f(floatValue, -16777216, -1));
                break;
            case 1:
                w4 w4Var = (w4) this.b;
                float lerp = AndroidUtilities.lerp(w4Var.n, valueAnimator.getAnimatedFraction());
                int i10 = (int) (255.0f * lerp);
                w4Var.f.setAlpha(i10);
                w4Var.h.setAlpha(i10);
                w4Var.r.setAlpha((int) (66.0f * lerp));
                w4Var.s.setAlpha((int) (85.0f * lerp));
                w4Var.v.setAlpha(i10);
                w4Var.G = lerp;
                w4Var.invalidate();
                break;
            case 2:
                c7.X((c7) this.b, valueAnimator);
                break;
            case 3:
                k8 k8Var = (k8) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < k8Var.b.getChildCount(); i11++) {
                    h8.b((h8) k8Var.b.getChildAt(i11), floatValue2);
                }
                break;
            case 4:
                od odVar = (od) this.b;
                odVar.b.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                odVar.b.invalidateSelf();
                break;
            case 5:
                ((org.telegram.ui.Components.as) this.b).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                xk xkVar = (xk) this.b;
                xkVar.getClass();
                xkVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                xkVar.invalidate();
                break;
            case 7:
                yo yoVar = (yo) this.b;
                yoVar.r.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                yoVar.r.invalidateSelf();
                break;
            case 8:
                vr vrVar = (vr) this.b;
                vrVar.getClass();
                vrVar.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vrVar.invalidate();
                if (vrVar.getParent() != null) {
                    ((ViewGroup) vrVar.getParent()).invalidate();
                    break;
                }
                break;
            case 9:
                qr qrVar = (qr) this.b;
                qrVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qrVar.invalidate();
                if (qrVar.getParent() != null) {
                    ((ViewGroup) qrVar.getParent()).invalidate();
                    break;
                }
                break;
            case 10:
                zx zxVar = (zx) this.b;
                zxVar.getClass();
                zxVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 11:
                vy vyVar = (vy) this.b;
                vyVar.getClass();
                vyVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.w9 w9Var = vyVar.c;
                int i12 = org.telegram.ui.ActionBar.h6.C6;
                org.telegram.ui.ActionBar.d6 d6Var = vyVar.a;
                int w02 = org.telegram.ui.ActionBar.h6.w0(i12, d6Var);
                int i13 = org.telegram.ui.ActionBar.h6.Oh;
                int f7 = i0.a.f(vyVar.r, w02, org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                w9Var.setColorFilter(new PorterDuffColorFilter(f7, mode));
                w9Var.invalidate();
                org.telegram.ui.Components.w9 w9Var2 = vyVar.f;
                w9Var2.setColorFilter(new PorterDuffColorFilter(i0.a.f(1.0f - vyVar.r, org.telegram.ui.ActionBar.h6.w0(i12, d6Var), org.telegram.ui.ActionBar.h6.w0(i13, d6Var)), mode));
                w9Var2.invalidate();
                break;
            case 12:
                nz nzVar = (nz) this.b;
                nzVar.n.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                nzVar.n.invalidateSelf();
                break;
            case 13:
                i00 i00Var = (i00) this.b;
                i00Var.getClass();
                i00Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i00Var.invalidate();
                break;
            case 14:
                j10 j10Var = (j10) this.b;
                j10Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = j10Var.c;
                imageView.setAlpha(floatValue3);
                float f10 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f10);
                imageView.setScaleY(f10);
                View view = j10Var.f;
                float f11 = 1.0f - floatValue3;
                view.setAlpha(f11);
                float f12 = (f11 * 0.5f) + 0.5f;
                view.setScaleX(f12);
                view.setScaleY(f12);
                break;
            case 15:
                s50 s50Var = (s50) this.b;
                s50Var.V0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s50Var.M1(true);
                s50Var.e.invalidate();
                s50Var.Q.invalidate();
                break;
            case 16:
                c50 c50Var = (c50) this.b;
                c50Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c50Var.a.invalidate();
                break;
            case 17:
                g50 g50Var = (g50) this.b;
                g50Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s50 s50Var2 = g50Var.L;
                s50Var2.Q.invalidate();
                s50Var2.a2.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) s50Var2).containerView;
                viewGroup.invalidate();
                s50.K0(s50Var2);
                break;
            case 18:
                qj0 qj0Var = (qj0) this.b;
                qj0Var.getClass();
                qj0Var.f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                qj0Var.invalidate();
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
                PhotoViewer photoViewer = ((kt0) this.b).d;
                photoViewer.T1.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.T1.invalidate();
                break;
            case 21:
                PhotoViewer photoViewer2 = ((kt0) this.b).d;
                photoViewer2.T1.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.T1.invalidate();
                break;
            case 22:
                ((PhotoViewer) ((org.telegram.ui.Components.cn0) this.b).b).T1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 23:
                PhotoViewer photoViewer3 = ((nt0) this.b).r;
                photoViewer3.m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.G1();
                break;
            case 24:
                cu0 cu0Var = (cu0) this.b;
                cu0Var.getClass();
                cu0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 25:
                xu0 xu0Var = (xu0) this.b;
                xu0Var.getClass();
                xu0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xu0Var.e();
                break;
            case 26:
                ((ky0) this.b).G.a.invalidate();
                break;
            case 27:
                ((pz0) this.b).g2.U4();
                break;
            case 28:
                e01 e01Var = (e01) this.b;
                float[] fArr = e01Var.n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                e01Var.F = animatedFraction;
                e01Var.e(AndroidUtilities.lerp(fArr, animatedFraction), true);
                break;
            default:
                g01 g01Var = (g01) this.b;
                float lerp2 = AndroidUtilities.lerp(g01Var.e, valueAnimator.getAnimatedFraction());
                ProfileActivity profileActivity = g01Var.n;
                org.telegram.ui.ActionBar.u0 u0Var = profileActivity.V0;
                if (u0Var != null && !profileActivity.q2) {
                    float f13 = 1.0f - lerp2;
                    u0Var.setScaleX(f13);
                    profileActivity.V0.setScaleY(f13);
                    profileActivity.V0.setAlpha(f13);
                }
                if (profileActivity.O0) {
                    float f14 = 1.0f - lerp2;
                    profileActivity.T0.setScaleX(f14);
                    profileActivity.T0.setScaleY(f14);
                    profileActivity.T0.setAlpha(f14);
                }
                if (profileActivity.M0) {
                    float f15 = 1.0f - lerp2;
                    profileActivity.R0.setScaleX(f15);
                    profileActivity.R0.setScaleY(f15);
                    profileActivity.R0.setAlpha(f15);
                }
                if (profileActivity.N0) {
                    float f16 = 1.0f - lerp2;
                    profileActivity.S0.setScaleX(f16);
                    profileActivity.S0.setScaleY(f16);
                    profileActivity.S0.setAlpha(f16);
                }
                g01Var.setScaleX(lerp2);
                g01Var.setScaleY(lerp2);
                g01Var.setAlpha(lerp2);
                break;
        }
    }
}
