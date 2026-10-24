package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                e3 e3Var = (e3) this.b;
                e3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e3Var.d.setTextColor(i0.a.f(floatValue, -16777216, -1));
                e3Var.e.setTextColor(i0.a.f(floatValue, -16777216, -1));
                e3Var.f.setTextColor(i0.a.f(floatValue, -16777216, -1));
                break;
            case 1:
                v4 v4Var = (v4) this.b;
                float lerp = AndroidUtilities.lerp(v4Var.n, valueAnimator.getAnimatedFraction());
                int i10 = (int) (255.0f * lerp);
                v4Var.f.setAlpha(i10);
                v4Var.h.setAlpha(i10);
                v4Var.r.setAlpha((int) (66.0f * lerp));
                v4Var.s.setAlpha((int) (85.0f * lerp));
                v4Var.v.setAlpha(i10);
                v4Var.G = lerp;
                v4Var.invalidate();
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
                md mdVar = (md) this.b;
                mdVar.b.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                mdVar.b.invalidateSelf();
                break;
            case 5:
                ((org.telegram.ui.Components.as) this.b).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                wk wkVar = (wk) this.b;
                wkVar.getClass();
                wkVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                wkVar.invalidate();
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
                int i12 = org.telegram.ui.ActionBar.k6.C6;
                org.telegram.ui.ActionBar.g6 g6Var = vyVar.a;
                int w02 = org.telegram.ui.ActionBar.k6.w0(i12, g6Var);
                int i13 = org.telegram.ui.ActionBar.k6.Oh;
                int f7 = i0.a.f(vyVar.r, w02, org.telegram.ui.ActionBar.k6.w0(i13, g6Var));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                w9Var.setColorFilter(new PorterDuffColorFilter(f7, mode));
                w9Var.invalidate();
                org.telegram.ui.Components.w9 w9Var2 = vyVar.f;
                w9Var2.setColorFilter(new PorterDuffColorFilter(i0.a.f(1.0f - vyVar.r, org.telegram.ui.ActionBar.k6.w0(i12, g6Var), org.telegram.ui.ActionBar.k6.w0(i13, g6Var)), mode));
                w9Var2.invalidate();
                break;
            case 12:
                oz ozVar = (oz) this.b;
                ozVar.n.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ozVar.n.invalidateSelf();
                break;
            case 13:
                j00 j00Var = (j00) this.b;
                j00Var.getClass();
                j00Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j00Var.invalidate();
                break;
            case 14:
                l10 l10Var = (l10) this.b;
                l10Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = l10Var.c;
                imageView.setAlpha(floatValue3);
                float f10 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f10);
                imageView.setScaleY(f10);
                View view = l10Var.f;
                float f11 = 1.0f - floatValue3;
                view.setAlpha(f11);
                float f12 = (f11 * 0.5f) + 0.5f;
                view.setScaleX(f12);
                view.setScaleY(f12);
                break;
            case 15:
                u50 u50Var = (u50) this.b;
                u50Var.V0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u50Var.M1(true);
                u50Var.e.invalidate();
                u50Var.Q.invalidate();
                break;
            case 16:
                d50 d50Var = (d50) this.b;
                d50Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d50Var.a.invalidate();
                break;
            case 17:
                i50 i50Var = (i50) this.b;
                i50Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u50 u50Var2 = i50Var.L;
                u50Var2.Q.invalidate();
                u50Var2.a2.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.h3) u50Var2).containerView;
                viewGroup.invalidate();
                u50.J0(u50Var2);
                break;
            case 18:
                tj0 tj0Var = (tj0) this.b;
                tj0Var.getClass();
                tj0Var.f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                tj0Var.invalidate();
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
                PhotoViewer photoViewer = ((lt0) this.b).d;
                photoViewer.T1.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.T1.invalidate();
                break;
            case 21:
                PhotoViewer photoViewer2 = ((lt0) this.b).d;
                photoViewer2.T1.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.T1.invalidate();
                break;
            case 22:
                ((PhotoViewer) ((org.telegram.ui.Components.gn0) this.b).b).T1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 23:
                PhotoViewer photoViewer3 = ((ot0) this.b).r;
                photoViewer3.m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.H1();
                break;
            case 24:
                du0 du0Var = (du0) this.b;
                du0Var.getClass();
                du0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 25:
                yu0 yu0Var = (yu0) this.b;
                yu0Var.getClass();
                yu0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yu0Var.e();
                break;
            case 26:
                ((ny0) this.b).G.a.invalidate();
                break;
            case 27:
                ((rz0) this.b).j2.Y4();
                break;
            case 28:
                g01 g01Var = (g01) this.b;
                float[] fArr = g01Var.n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                g01Var.F = animatedFraction;
                g01Var.e(AndroidUtilities.lerp(fArr, animatedFraction), true);
                break;
            default:
                i01 i01Var = (i01) this.b;
                float lerp2 = AndroidUtilities.lerp(i01Var.e, valueAnimator.getAnimatedFraction());
                ProfileActivity profileActivity = i01Var.n;
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
                i01Var.setScaleX(lerp2);
                i01Var.setScaleY(lerp2);
                i01Var.setAlpha(lerp2);
                break;
        }
    }
}
