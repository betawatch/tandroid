package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
                r4 r4Var = (r4) this.b;
                float lerp = AndroidUtilities.lerp(r4Var.n, valueAnimator.getAnimatedFraction());
                int i10 = (int) (255.0f * lerp);
                r4Var.f.setAlpha(i10);
                r4Var.h.setAlpha(i10);
                r4Var.r.setAlpha((int) (66.0f * lerp));
                r4Var.s.setAlpha((int) (85.0f * lerp));
                r4Var.v.setAlpha(i10);
                r4Var.G = lerp;
                r4Var.invalidate();
                break;
            case 2:
                k8 k8Var = (k8) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < k8Var.b.getChildCount(); i11++) {
                    h8.b((h8) k8Var.b.getChildAt(i11), floatValue2);
                }
                break;
            case 3:
                nd ndVar = (nd) this.b;
                ndVar.b.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ndVar.b.invalidateSelf();
                break;
            case 4:
                ((org.telegram.ui.Components.sr) this.b).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 5:
                al alVar = (al) this.b;
                alVar.getClass();
                alVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                alVar.invalidate();
                break;
            case 6:
                hp hpVar = (hp) this.b;
                hpVar.r.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                hpVar.r.invalidateSelf();
                break;
            case 7:
                es esVar = (es) this.b;
                esVar.getClass();
                esVar.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                esVar.invalidate();
                if (esVar.getParent() != null) {
                    ((ViewGroup) esVar.getParent()).invalidate();
                    break;
                }
                break;
            case 8:
                as asVar = (as) this.b;
                asVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                asVar.invalidate();
                if (asVar.getParent() != null) {
                    ((ViewGroup) asVar.getParent()).invalidate();
                    break;
                }
                break;
            case 9:
                qy qyVar = (qy) this.b;
                qyVar.getClass();
                qyVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 10:
                lz lzVar = (lz) this.b;
                lzVar.getClass();
                lzVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.w9 w9Var = lzVar.c;
                int i12 = org.telegram.ui.ActionBar.i6.C6;
                org.telegram.ui.ActionBar.d6 d6Var = lzVar.a;
                int v02 = org.telegram.ui.ActionBar.i6.v0(i12, d6Var);
                int i13 = org.telegram.ui.ActionBar.i6.Oh;
                int d = i0.a.d(lzVar.r, v02, org.telegram.ui.ActionBar.i6.v0(i13, d6Var));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                w9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                w9Var.invalidate();
                org.telegram.ui.Components.w9 w9Var2 = lzVar.f;
                w9Var2.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - lzVar.r, org.telegram.ui.ActionBar.i6.v0(i12, d6Var), org.telegram.ui.ActionBar.i6.v0(i13, d6Var)), mode));
                w9Var2.invalidate();
                break;
            case 11:
                c00 c00Var = (c00) this.b;
                c00Var.n.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                c00Var.n.invalidateSelf();
                break;
            case 12:
                y00 y00Var = (y00) this.b;
                y00Var.getClass();
                y00Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y00Var.invalidate();
                break;
            case 13:
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
            case 14:
                h60 h60Var = (h60) this.b;
                h60Var.V0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h60Var.L1(true);
                h60Var.e.invalidate();
                h60Var.Q.invalidate();
                break;
            case 15:
                r50 r50Var = (r50) this.b;
                r50Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r50Var.a.invalidate();
                break;
            case 16:
                v50 v50Var = (v50) this.b;
                v50Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h60 h60Var2 = v50Var.L;
                h60Var2.Q.invalidate();
                h60Var2.a2.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) h60Var2).containerView;
                viewGroup.invalidate();
                h60.J0(h60Var2);
                break;
            case 17:
                ck0 ck0Var = (ck0) this.b;
                ck0Var.getClass();
                ck0Var.f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                ck0Var.invalidate();
                break;
            case 18:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                passcodeActivity.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.v.setAlpha(floatValue4);
                passcodeActivity.v.setTranslationY((1.0f - floatValue4) * AndroidUtilities.dp(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                break;
            case 19:
                PhotoViewer photoViewer = ((xt0) this.b).d;
                photoViewer.T1.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.T1.invalidate();
                break;
            case 20:
                PhotoViewer photoViewer2 = ((xt0) this.b).d;
                photoViewer2.T1.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.T1.invalidate();
                break;
            case 21:
                ((PhotoViewer) ((org.telegram.ui.Components.wm0) this.b).b).T1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 22:
                PhotoViewer photoViewer3 = ((au0) this.b).r;
                photoViewer3.m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.G1();
                break;
            case 23:
                pu0 pu0Var = (pu0) this.b;
                pu0Var.getClass();
                pu0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 24:
                kv0 kv0Var = (kv0) this.b;
                kv0Var.getClass();
                kv0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kv0Var.e();
                break;
            case 25:
                ((zy0) this.b).G.a.invalidate();
                break;
            case 26:
                ((e01) this.b).g2.U4();
                break;
            case 27:
                t01 t01Var = (t01) this.b;
                float[] fArr = t01Var.n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                t01Var.F = animatedFraction;
                t01Var.e(AndroidUtilities.lerp(fArr, animatedFraction), true);
                break;
            case 28:
                v01 v01Var = (v01) this.b;
                float lerp2 = AndroidUtilities.lerp(v01Var.e, valueAnimator.getAnimatedFraction());
                ProfileActivity profileActivity = v01Var.n;
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
                v01Var.setScaleX(lerp2);
                v01Var.setScaleY(lerp2);
                v01Var.setAlpha(lerp2);
                break;
            default:
                t11 t11Var = (t11) this.b;
                t11Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t11Var.a();
                break;
        }
    }
}
