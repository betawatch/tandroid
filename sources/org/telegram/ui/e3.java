package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                d7.X((d7) this.b, valueAnimator);
                break;
            case 3:
                l8 l8Var = (l8) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < l8Var.b.getChildCount(); i11++) {
                    i8.b((i8) l8Var.b.getChildAt(i11), floatValue2);
                }
                break;
            case 4:
                sd sdVar = (sd) this.b;
                sdVar.b.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                sdVar.b.invalidateSelf();
                break;
            case 5:
                ((org.telegram.ui.Components.ds) this.b).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                il ilVar = (il) this.b;
                ilVar.getClass();
                ilVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ilVar.invalidate();
                break;
            case 7:
                np npVar = (np) this.b;
                npVar.r.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                npVar.r.invalidateSelf();
                break;
            case 8:
                ks ksVar = (ks) this.b;
                ksVar.getClass();
                ksVar.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ksVar.invalidate();
                if (ksVar.getParent() != null) {
                    ((ViewGroup) ksVar.getParent()).invalidate();
                    break;
                }
                break;
            case 9:
                fs fsVar = (fs) this.b;
                fsVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fsVar.invalidate();
                if (fsVar.getParent() != null) {
                    ((ViewGroup) fsVar.getParent()).invalidate();
                    break;
                }
                break;
            case 10:
                uy uyVar = (uy) this.b;
                uyVar.getClass();
                uyVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 11:
                pz pzVar = (pz) this.b;
                pzVar.getClass();
                pzVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.z9 z9Var = pzVar.c;
                int i12 = org.telegram.ui.ActionBar.g6.C6;
                org.telegram.ui.ActionBar.c6 c6Var = pzVar.a;
                int w02 = org.telegram.ui.ActionBar.g6.w0(i12, c6Var);
                int i13 = org.telegram.ui.ActionBar.g6.Oh;
                int d = i0.a.d(pzVar.r, w02, org.telegram.ui.ActionBar.g6.w0(i13, c6Var));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                z9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                z9Var.invalidate();
                org.telegram.ui.Components.z9 z9Var2 = pzVar.f;
                z9Var2.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - pzVar.r, org.telegram.ui.ActionBar.g6.w0(i12, c6Var), org.telegram.ui.ActionBar.g6.w0(i13, c6Var)), mode));
                z9Var2.invalidate();
                break;
            case 12:
                h00 h00Var = (h00) this.b;
                h00Var.n.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                h00Var.n.invalidateSelf();
                break;
            case 13:
                d10 d10Var = (d10) this.b;
                d10Var.getClass();
                d10Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d10Var.invalidate();
                break;
            case 14:
                e20 e20Var = (e20) this.b;
                e20Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = e20Var.c;
                imageView.setAlpha(floatValue3);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f7);
                imageView.setScaleY(f7);
                View view = e20Var.f;
                float f10 = 1.0f - floatValue3;
                view.setAlpha(f10);
                float f11 = (f10 * 0.5f) + 0.5f;
                view.setScaleX(f11);
                view.setScaleY(f11);
                break;
            case 15:
                n60 n60Var = (n60) this.b;
                n60Var.V0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n60Var.M1(true);
                n60Var.e.invalidate();
                n60Var.Q.invalidate();
                break;
            case 16:
                w50 w50Var = (w50) this.b;
                w50Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w50Var.a.invalidate();
                break;
            case 17:
                b60 b60Var = (b60) this.b;
                b60Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n60 n60Var2 = b60Var.L;
                n60Var2.Q.invalidate();
                n60Var2.a2.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.e3) n60Var2).containerView;
                viewGroup.invalidate();
                n60.K0(n60Var2);
                break;
            case 18:
                jk0 jk0Var = (jk0) this.b;
                jk0Var.getClass();
                jk0Var.f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                jk0Var.invalidate();
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
                PhotoViewer photoViewer = ((iu0) this.b).d;
                photoViewer.T1.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.T1.invalidate();
                break;
            case 21:
                PhotoViewer photoViewer2 = ((iu0) this.b).d;
                photoViewer2.T1.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.T1.invalidate();
                break;
            case 22:
                ((PhotoViewer) ((org.telegram.ui.Components.gn0) this.b).b).T1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 23:
                PhotoViewer photoViewer3 = ((lu0) this.b).r;
                photoViewer3.m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.G1();
                break;
            case 24:
                av0 av0Var = (av0) this.b;
                av0Var.getClass();
                av0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 25:
                vv0 vv0Var = (vv0) this.b;
                vv0Var.getClass();
                vv0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vv0Var.e();
                break;
            case 26:
                ((lz0) this.b).G.a.invalidate();
                break;
            case 27:
                ((q01) this.b).g2.U4();
                break;
            case 28:
                f11 f11Var = (f11) this.b;
                float[] fArr = f11Var.n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                f11Var.F = animatedFraction;
                f11Var.e(AndroidUtilities.lerp(fArr, animatedFraction), true);
                break;
            default:
                h11 h11Var = (h11) this.b;
                float lerp2 = AndroidUtilities.lerp(h11Var.e, valueAnimator.getAnimatedFraction());
                ProfileActivity profileActivity = h11Var.n;
                org.telegram.ui.ActionBar.u0 u0Var = profileActivity.U0;
                if (u0Var != null && !profileActivity.p2) {
                    float f12 = 1.0f - lerp2;
                    u0Var.setScaleX(f12);
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
                h11Var.setScaleX(lerp2);
                h11Var.setScaleY(lerp2);
                h11Var.setAlpha(lerp2);
                break;
        }
    }
}
