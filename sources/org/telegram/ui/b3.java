package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
        switch (this.a) {
            case 0:
                c3 c3Var = (c3) this.b;
                c3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c3Var.d.setTextColor(i0.a.d(floatValue, -16777216, -1));
                c3Var.e.setTextColor(i0.a.d(floatValue, -16777216, -1));
                c3Var.f.setTextColor(i0.a.d(floatValue, -16777216, -1));
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
                z6.X((z6) this.b, valueAnimator);
                break;
            case 3:
                h8 h8Var = (h8) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < h8Var.b.getChildCount(); i11++) {
                    e8.b((e8) h8Var.b.getChildAt(i11), floatValue2);
                }
                break;
            case 4:
                ld ldVar = (ld) this.b;
                ldVar.b.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ldVar.b.invalidateSelf();
                break;
            case 5:
                ((org.telegram.ui.Components.pr) this.b).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                dl dlVar = (dl) this.b;
                dlVar.getClass();
                dlVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                dlVar.invalidate();
                break;
            case 7:
                kp kpVar = (kp) this.b;
                kpVar.r.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                kpVar.r.invalidateSelf();
                break;
            case 8:
                gs gsVar = (gs) this.b;
                gsVar.getClass();
                gsVar.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gsVar.invalidate();
                if (gsVar.getParent() != null) {
                    ((ViewGroup) gsVar.getParent()).invalidate();
                    break;
                }
                break;
            case 9:
                bs bsVar = (bs) this.b;
                bsVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bsVar.invalidate();
                if (bsVar.getParent() != null) {
                    ((ViewGroup) bsVar.getParent()).invalidate();
                    break;
                }
                break;
            case 10:
                qy qyVar = (qy) this.b;
                qyVar.getClass();
                qyVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 11:
                lz lzVar = (lz) this.b;
                lzVar.getClass();
                lzVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.u9 u9Var = lzVar.c;
                int i12 = org.telegram.ui.ActionBar.i6.C6;
                org.telegram.ui.ActionBar.e6 e6Var = lzVar.a;
                int v02 = org.telegram.ui.ActionBar.i6.v0(i12, e6Var);
                int i13 = org.telegram.ui.ActionBar.i6.Oh;
                int d = i0.a.d(lzVar.r, v02, org.telegram.ui.ActionBar.i6.v0(i13, e6Var));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                u9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                u9Var.invalidate();
                org.telegram.ui.Components.u9 u9Var2 = lzVar.f;
                u9Var2.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - lzVar.r, org.telegram.ui.ActionBar.i6.v0(i12, e6Var), org.telegram.ui.ActionBar.i6.v0(i13, e6Var)), mode));
                u9Var2.invalidate();
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
                z10 z10Var = (z10) this.b;
                z10Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = z10Var.c;
                imageView.setAlpha(floatValue3);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f7);
                imageView.setScaleY(f7);
                View view = z10Var.f;
                float f10 = 1.0f - floatValue3;
                view.setAlpha(f10);
                float f11 = (f10 * 0.5f) + 0.5f;
                view.setScaleX(f11);
                view.setScaleY(f11);
                break;
            case 15:
                i60 i60Var = (i60) this.b;
                i60Var.V0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i60Var.L1(true);
                i60Var.e.invalidate();
                i60Var.Q.invalidate();
                break;
            case 16:
                r50 r50Var = (r50) this.b;
                r50Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r50Var.a.invalidate();
                break;
            case 17:
                w50 w50Var = (w50) this.b;
                w50Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i60 i60Var2 = w50Var.L;
                i60Var2.Q.invalidate();
                i60Var2.a2.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) i60Var2).containerView;
                viewGroup.invalidate();
                i60.J0(i60Var2);
                break;
            case 18:
                ek0 ek0Var = (ek0) this.b;
                ek0Var.getClass();
                ek0Var.f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                ek0Var.invalidate();
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
                PhotoViewer photoViewer = ((cu0) this.b).d;
                photoViewer.T1.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.T1.invalidate();
                break;
            case 21:
                PhotoViewer photoViewer2 = ((cu0) this.b).d;
                photoViewer2.T1.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.T1.invalidate();
                break;
            case 22:
                ((PhotoViewer) ((org.telegram.ui.Components.em0) this.b).b).T1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 23:
                PhotoViewer photoViewer3 = ((fu0) this.b).r;
                photoViewer3.m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.F1();
                break;
            case 24:
                uu0 uu0Var = (uu0) this.b;
                uu0Var.getClass();
                uu0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 25:
                pv0 pv0Var = (pv0) this.b;
                pv0Var.getClass();
                pv0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pv0Var.e();
                break;
            case 26:
                ((hz0) this.b).G.a.invalidate();
                break;
            case 27:
                ((m01) this.b).g2.U4();
                break;
            case 28:
                b11 b11Var = (b11) this.b;
                float[] fArr = b11Var.n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                b11Var.F = animatedFraction;
                b11Var.e(AndroidUtilities.lerp(fArr, animatedFraction), true);
                break;
            default:
                d11 d11Var = (d11) this.b;
                float lerp2 = AndroidUtilities.lerp(d11Var.e, valueAnimator.getAnimatedFraction());
                ProfileActivity profileActivity = d11Var.n;
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
                d11Var.setScaleX(lerp2);
                d11Var.setScaleY(lerp2);
                d11Var.setAlpha(lerp2);
                break;
        }
    }
}
