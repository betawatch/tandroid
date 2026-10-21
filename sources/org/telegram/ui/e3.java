package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
                md mdVar = (md) this.b;
                mdVar.b.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                mdVar.b.invalidateSelf();
                break;
            case 5:
                ((org.telegram.ui.Components.as) this.b).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                vk vkVar = (vk) this.b;
                vkVar.getClass();
                vkVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                vkVar.invalidate();
                break;
            case 7:
                wo woVar = (wo) this.b;
                woVar.r.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                woVar.r.invalidateSelf();
                break;
            case 8:
                tr trVar = (tr) this.b;
                trVar.getClass();
                trVar.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                trVar.invalidate();
                if (trVar.getParent() != null) {
                    ((ViewGroup) trVar.getParent()).invalidate();
                    break;
                }
                break;
            case 9:
                or orVar = (or) this.b;
                orVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                orVar.invalidate();
                if (orVar.getParent() != null) {
                    ((ViewGroup) orVar.getParent()).invalidate();
                    break;
                }
                break;
            case 10:
                xx xxVar = (xx) this.b;
                xxVar.getClass();
                xxVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 11:
                ty tyVar = (ty) this.b;
                tyVar.getClass();
                tyVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.w9 w9Var = tyVar.c;
                int i12 = org.telegram.ui.ActionBar.h6.C6;
                org.telegram.ui.ActionBar.d6 d6Var = tyVar.a;
                int w02 = org.telegram.ui.ActionBar.h6.w0(i12, d6Var);
                int i13 = org.telegram.ui.ActionBar.h6.Oh;
                int f7 = i0.a.f(tyVar.r, w02, org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                w9Var.setColorFilter(new PorterDuffColorFilter(f7, mode));
                w9Var.invalidate();
                org.telegram.ui.Components.w9 w9Var2 = tyVar.f;
                w9Var2.setColorFilter(new PorterDuffColorFilter(i0.a.f(1.0f - tyVar.r, org.telegram.ui.ActionBar.h6.w0(i12, d6Var), org.telegram.ui.ActionBar.h6.w0(i13, d6Var)), mode));
                w9Var2.invalidate();
                break;
            case 12:
                lz lzVar = (lz) this.b;
                lzVar.n.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                lzVar.n.invalidateSelf();
                break;
            case 13:
                g00 g00Var = (g00) this.b;
                g00Var.getClass();
                g00Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g00Var.invalidate();
                break;
            case 14:
                h10 h10Var = (h10) this.b;
                h10Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = h10Var.c;
                imageView.setAlpha(floatValue3);
                float f10 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f10);
                imageView.setScaleY(f10);
                View view = h10Var.f;
                float f11 = 1.0f - floatValue3;
                view.setAlpha(f11);
                float f12 = (f11 * 0.5f) + 0.5f;
                view.setScaleX(f12);
                view.setScaleY(f12);
                break;
            case 15:
                q50 q50Var = (q50) this.b;
                q50Var.V0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q50Var.M1(true);
                q50Var.e.invalidate();
                q50Var.Q.invalidate();
                break;
            case 16:
                a50 a50Var = (a50) this.b;
                a50Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a50Var.a.invalidate();
                break;
            case 17:
                e50 e50Var = (e50) this.b;
                e50Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q50 q50Var2 = e50Var.L;
                q50Var2.Q.invalidate();
                q50Var2.a2.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) q50Var2).containerView;
                viewGroup.invalidate();
                q50.K0(q50Var2);
                break;
            case 18:
                oj0 oj0Var = (oj0) this.b;
                oj0Var.getClass();
                oj0Var.f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                oj0Var.invalidate();
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
                PhotoViewer photoViewer = ((it0) this.b).d;
                photoViewer.T1.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.T1.invalidate();
                break;
            case 21:
                PhotoViewer photoViewer2 = ((it0) this.b).d;
                photoViewer2.T1.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.T1.invalidate();
                break;
            case 22:
                ((PhotoViewer) ((org.telegram.ui.Components.dn0) this.b).b).T1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 23:
                PhotoViewer photoViewer3 = ((lt0) this.b).r;
                photoViewer3.m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.H1();
                break;
            case 24:
                au0 au0Var = (au0) this.b;
                au0Var.getClass();
                au0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 25:
                vu0 vu0Var = (vu0) this.b;
                vu0Var.getClass();
                vu0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vu0Var.e();
                break;
            case 26:
                ((iy0) this.b).G.a.invalidate();
                break;
            case 27:
                ((nz0) this.b).g2.U4();
                break;
            case 28:
                c01 c01Var = (c01) this.b;
                float[] fArr = c01Var.n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                c01Var.F = animatedFraction;
                c01Var.e(AndroidUtilities.lerp(fArr, animatedFraction), true);
                break;
            default:
                e01 e01Var = (e01) this.b;
                float lerp2 = AndroidUtilities.lerp(e01Var.e, valueAnimator.getAnimatedFraction());
                ProfileActivity profileActivity = e01Var.n;
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
                e01Var.setScaleX(lerp2);
                e01Var.setScaleY(lerp2);
                e01Var.setAlpha(lerp2);
                break;
        }
    }
}
