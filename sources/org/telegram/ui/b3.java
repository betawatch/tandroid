package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                c3 c3Var = (c3) obj;
                c3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c3Var.d.setTextColor(i0.a.f(floatValue, -16777216, -1));
                c3Var.e.setTextColor(i0.a.f(floatValue, -16777216, -1));
                c3Var.f.setTextColor(i0.a.f(floatValue, -16777216, -1));
                break;
            case 1:
                u4 u4Var = (u4) obj;
                float lerp = AndroidUtilities.lerp(u4Var.n, valueAnimator.getAnimatedFraction());
                int i11 = (int) (255.0f * lerp);
                u4Var.f.setAlpha(i11);
                u4Var.h.setAlpha(i11);
                u4Var.r.setAlpha((int) (66.0f * lerp));
                u4Var.s.setAlpha((int) (85.0f * lerp));
                u4Var.v.setAlpha(i11);
                u4Var.G = lerp;
                u4Var.invalidate();
                break;
            case 2:
                n8 n8Var = (n8) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i12 = 0; i12 < n8Var.b.getChildCount(); i12++) {
                    k8.b((k8) n8Var.b.getChildAt(i12), floatValue2);
                }
                break;
            case 3:
                nd ndVar = (nd) obj;
                ndVar.b.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ndVar.b.invalidateSelf();
                break;
            case 4:
                ((org.telegram.ui.Components.cs) obj).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 5:
                xk xkVar = (xk) obj;
                xkVar.getClass();
                xkVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                xkVar.invalidate();
                break;
            case 6:
                gq gqVar = (gq) obj;
                gqVar.getClass();
                gqVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = gqVar.e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    break;
                }
                break;
            case 7:
                xr xrVar = (xr) obj;
                xrVar.getClass();
                xrVar.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xrVar.invalidate();
                if (xrVar.getParent() != null) {
                    ((ViewGroup) xrVar.getParent()).invalidate();
                    break;
                }
                break;
            case 8:
                tr trVar = (tr) obj;
                trVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                trVar.invalidate();
                if (trVar.getParent() != null) {
                    ((ViewGroup) trVar.getParent()).invalidate();
                    break;
                }
                break;
            case 9:
                wx wxVar = (wx) obj;
                wxVar.getClass();
                wxVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 10:
                ty tyVar = (ty) obj;
                tyVar.getClass();
                tyVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.y9 y9Var = tyVar.c;
                int i13 = org.telegram.ui.ActionBar.y6.C6;
                org.telegram.ui.ActionBar.u6 u6Var = tyVar.a;
                int w02 = org.telegram.ui.ActionBar.y6.w0(i13, u6Var);
                int i14 = org.telegram.ui.ActionBar.y6.Oh;
                int f7 = i0.a.f(tyVar.r, w02, org.telegram.ui.ActionBar.y6.w0(i14, u6Var));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                y9Var.setColorFilter(new PorterDuffColorFilter(f7, mode));
                y9Var.invalidate();
                org.telegram.ui.Components.y9 y9Var2 = tyVar.f;
                y9Var2.setColorFilter(new PorterDuffColorFilter(i0.a.f(1.0f - tyVar.r, org.telegram.ui.ActionBar.y6.w0(i13, u6Var), org.telegram.ui.ActionBar.y6.w0(i14, u6Var)), mode));
                y9Var2.invalidate();
                break;
            case 11:
                h00 h00Var = (h00) obj;
                h00Var.getClass();
                h00Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h00Var.invalidate();
                break;
            case 12:
                l10 l10Var = (l10) obj;
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
            case 13:
                v50 v50Var = (v50) obj;
                v50Var.V0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v50Var.M1(true);
                v50Var.e.invalidate();
                v50Var.Q.invalidate();
                break;
            case 14:
                e50 e50Var = (e50) obj;
                e50Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e50Var.a.invalidate();
                break;
            case 15:
                j50 j50Var = (j50) obj;
                j50Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v50 v50Var2 = j50Var.L;
                v50Var2.Q.invalidate();
                v50Var2.a2.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.k3) v50Var2).containerView;
                viewGroup.invalidate();
                v50.J0(v50Var2);
                break;
            case 16:
                xj0 xj0Var = (xj0) obj;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xj0Var.M = floatValue4;
                xj0Var.w.setAlpha(1.0f - floatValue4);
                xj0Var.w.setScaleX(1.0f - (xj0Var.M * 0.1f));
                xj0Var.w.setScaleY(1.0f - (xj0Var.M * 0.1f));
                xj0Var.v.setTranslationY((-AndroidUtilities.dp(42.0f)) * xj0Var.M);
                xj0Var.G.setTranslationY((-AndroidUtilities.dp(42.0f)) * xj0Var.M);
                break;
            case 17:
                zj0 zj0Var = (zj0) obj;
                zj0Var.getClass();
                zj0Var.f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                zj0Var.invalidate();
                break;
            case 18:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                passcodeActivity.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.v.setAlpha(floatValue5);
                passcodeActivity.v.setTranslationY((1.0f - floatValue5) * AndroidUtilities.dp(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                break;
            case 19:
                PhotoViewer photoViewer = ((pt0) obj).d;
                photoViewer.T1.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.T1.invalidate();
                break;
            case 20:
                PhotoViewer photoViewer2 = ((pt0) obj).d;
                photoViewer2.T1.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.T1.invalidate();
                break;
            case 21:
                ((PhotoViewer) ((org.telegram.ui.Components.ln0) obj).b).T1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 22:
                PhotoViewer photoViewer3 = ((st0) obj).r;
                photoViewer3.m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.H1();
                break;
            case 23:
                hu0 hu0Var = (hu0) obj;
                hu0Var.getClass();
                hu0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 24:
                cv0 cv0Var = (cv0) obj;
                cv0Var.getClass();
                cv0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cv0Var.e();
                break;
            case 25:
                ((qy0) obj).G.a.invalidate();
                break;
            case 26:
                ProfileActivity profileActivity = ((vz0) obj).s2;
                int i15 = ProfileActivity.R6;
                profileActivity.g5();
                break;
            case 27:
                k01 k01Var = (k01) obj;
                float[] fArr = k01Var.n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                k01Var.F = animatedFraction;
                k01Var.e(AndroidUtilities.lerp(fArr, animatedFraction), true);
                break;
            case 28:
                m01 m01Var = (m01) obj;
                float lerp2 = AndroidUtilities.lerp(m01Var.e, valueAnimator.getAnimatedFraction());
                ProfileActivity profileActivity2 = m01Var.n;
                org.telegram.ui.ActionBar.w0 w0Var = profileActivity2.U0;
                if (w0Var != null && !profileActivity2.p2) {
                    float f13 = 1.0f - lerp2;
                    w0Var.setScaleX(f13);
                    profileActivity2.U0.setScaleY(f13);
                    profileActivity2.U0.setAlpha(f13);
                }
                if (profileActivity2.N0) {
                    float f14 = 1.0f - lerp2;
                    profileActivity2.S0.setScaleX(f14);
                    profileActivity2.S0.setScaleY(f14);
                    profileActivity2.S0.setAlpha(f14);
                }
                if (profileActivity2.L0) {
                    float f15 = 1.0f - lerp2;
                    profileActivity2.Q0.setScaleX(f15);
                    profileActivity2.Q0.setScaleY(f15);
                    profileActivity2.Q0.setAlpha(f15);
                }
                if (profileActivity2.M0) {
                    float f16 = 1.0f - lerp2;
                    profileActivity2.R0.setScaleX(f16);
                    profileActivity2.R0.setScaleY(f16);
                    profileActivity2.R0.setAlpha(f16);
                }
                m01Var.setScaleX(lerp2);
                m01Var.setScaleY(lerp2);
                m01Var.setAlpha(lerp2);
                break;
            default:
                l11 l11Var = (l11) obj;
                l11Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l11Var.b();
                break;
        }
    }
}
