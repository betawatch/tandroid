package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                f3Var.d.setTextColor(i0.a.d(floatValue, -16777216, -1));
                f3Var.e.setTextColor(i0.a.d(floatValue, -16777216, -1));
                f3Var.f.setTextColor(i0.a.d(floatValue, -16777216, -1));
                break;
            case 1:
                t4 t4Var = (t4) this.b;
                float lerp = AndroidUtilities.lerp(t4Var.n, valueAnimator.getAnimatedFraction());
                int i10 = (int) (255.0f * lerp);
                t4Var.f.setAlpha(i10);
                t4Var.h.setAlpha(i10);
                t4Var.r.setAlpha((int) (66.0f * lerp));
                t4Var.s.setAlpha((int) (85.0f * lerp));
                t4Var.v.setAlpha(i10);
                t4Var.D = lerp;
                t4Var.invalidate();
                break;
            case 2:
                b7.X((b7) this.b, valueAnimator);
                break;
            case 3:
                j8 j8Var = (j8) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < j8Var.b.getChildCount(); i11++) {
                    g8.b((g8) j8Var.b.getChildAt(i11), floatValue2);
                }
                break;
            case 4:
                nd ndVar = (nd) this.b;
                ndVar.b.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ndVar.b.invalidateSelf();
                break;
            case 5:
                ((org.telegram.ui.Components.or) this.b).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                al alVar = (al) this.b;
                alVar.getClass();
                alVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                alVar.invalidate();
                break;
            case 7:
                ep epVar = (ep) this.b;
                epVar.r.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                epVar.r.invalidateSelf();
                break;
            case 8:
                cs csVar = (cs) this.b;
                csVar.getClass();
                csVar.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                csVar.invalidate();
                if (csVar.getParent() != null) {
                    ((ViewGroup) csVar.getParent()).invalidate();
                    break;
                }
                break;
            case 9:
                xr xrVar = (xr) this.b;
                xrVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xrVar.invalidate();
                if (xrVar.getParent() != null) {
                    ((ViewGroup) xrVar.getParent()).invalidate();
                    break;
                }
                break;
            case 10:
                ly lyVar = (ly) this.b;
                lyVar.getClass();
                lyVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 11:
                hz hzVar = (hz) this.b;
                hzVar.getClass();
                hzVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.p9 p9Var = hzVar.c;
                int i12 = org.telegram.ui.ActionBar.k6.C6;
                org.telegram.ui.ActionBar.g6 g6Var = hzVar.a;
                int v02 = org.telegram.ui.ActionBar.k6.v0(i12, g6Var);
                int i13 = org.telegram.ui.ActionBar.k6.Oh;
                int d = i0.a.d(hzVar.r, v02, org.telegram.ui.ActionBar.k6.v0(i13, g6Var));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                p9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                p9Var.invalidate();
                org.telegram.ui.Components.p9 p9Var2 = hzVar.f;
                p9Var2.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - hzVar.r, org.telegram.ui.ActionBar.k6.v0(i12, g6Var), org.telegram.ui.ActionBar.k6.v0(i13, g6Var)), mode));
                p9Var2.invalidate();
                break;
            case 12:
                zz zzVar = (zz) this.b;
                zzVar.n.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                zzVar.n.invalidateSelf();
                break;
            case 13:
                u00 u00Var = (u00) this.b;
                u00Var.getClass();
                u00Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u00Var.invalidate();
                break;
            case 14:
                w10 w10Var = (w10) this.b;
                w10Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = w10Var.c;
                imageView.setAlpha(floatValue3);
                float f10 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f10);
                imageView.setScaleY(f10);
                View view = w10Var.f;
                float f11 = 1.0f - floatValue3;
                view.setAlpha(f11);
                float f12 = (f11 * 0.5f) + 0.5f;
                view.setScaleX(f12);
                view.setScaleY(f12);
                break;
            case 15:
                d60 d60Var = (d60) this.b;
                d60Var.S0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d60Var.L1(true);
                d60Var.e.invalidate();
                d60Var.N.invalidate();
                break;
            case 16:
                n50 n50Var = (n50) this.b;
                n50Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n50Var.a.invalidate();
                break;
            case 17:
                r50 r50Var = (r50) this.b;
                r50Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d60 d60Var2 = r50Var.L;
                d60Var2.N.invalidate();
                d60Var2.X1.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.h3) d60Var2).containerView;
                viewGroup.invalidate();
                d60.J0(d60Var2);
                break;
            case 18:
                wj0 wj0Var = (wj0) this.b;
                wj0Var.getClass();
                wj0Var.f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                wj0Var.invalidate();
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
                PhotoViewer photoViewer = ((jt0) this.b).d;
                photoViewer.Q1.h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.Q1.invalidate();
                break;
            case 21:
                PhotoViewer photoViewer2 = ((jt0) this.b).d;
                photoViewer2.Q1.h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.Q1.invalidate();
                break;
            case 22:
                ((PhotoViewer) ((org.telegram.ui.Components.nm0) this.b).b).Q1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 23:
                PhotoViewer photoViewer3 = ((mt0) this.b).r;
                photoViewer3.j6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.F1();
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
                ((py0) this.b).G.a.invalidate();
                break;
            case 27:
                ((uz0) this.b).d2.U4();
                break;
            case 28:
                j01 j01Var = (j01) this.b;
                float[] fArr = j01Var.n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                j01Var.C = animatedFraction;
                j01Var.e(AndroidUtilities.lerp(fArr, animatedFraction), true);
                break;
            default:
                l01 l01Var = (l01) this.b;
                float lerp2 = AndroidUtilities.lerp(l01Var.e, valueAnimator.getAnimatedFraction());
                ProfileActivity profileActivity = l01Var.n;
                org.telegram.ui.ActionBar.w0 w0Var = profileActivity.R0;
                if (w0Var != null && !profileActivity.m2) {
                    float f13 = 1.0f - lerp2;
                    w0Var.setScaleX(f13);
                    profileActivity.R0.setScaleY(f13);
                    profileActivity.R0.setAlpha(f13);
                }
                if (profileActivity.K0) {
                    float f14 = 1.0f - lerp2;
                    profileActivity.P0.setScaleX(f14);
                    profileActivity.P0.setScaleY(f14);
                    profileActivity.P0.setAlpha(f14);
                }
                if (profileActivity.I0) {
                    float f15 = 1.0f - lerp2;
                    profileActivity.N0.setScaleX(f15);
                    profileActivity.N0.setScaleY(f15);
                    profileActivity.N0.setAlpha(f15);
                }
                if (profileActivity.J0) {
                    float f16 = 1.0f - lerp2;
                    profileActivity.O0.setScaleX(f16);
                    profileActivity.O0.setScaleY(f16);
                    profileActivity.O0.setAlpha(f16);
                }
                l01Var.setScaleX(lerp2);
                l01Var.setScaleY(lerp2);
                l01Var.setAlpha(lerp2);
                break;
        }
    }
}
