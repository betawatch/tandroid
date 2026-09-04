package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
                md mdVar = (md) this.b;
                mdVar.b.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                mdVar.b.invalidateSelf();
                break;
            case 5:
                ((org.telegram.ui.Components.or) this.b).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                dl dlVar = (dl) this.b;
                dlVar.getClass();
                dlVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                dlVar.invalidate();
                break;
            case 7:
                lp lpVar = (lp) this.b;
                lpVar.r.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                lpVar.r.invalidateSelf();
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
                cs csVar = (cs) this.b;
                csVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                csVar.invalidate();
                if (csVar.getParent() != null) {
                    ((ViewGroup) csVar.getParent()).invalidate();
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
                org.telegram.ui.Components.x9 x9Var = lzVar.c;
                int i12 = org.telegram.ui.ActionBar.j6.C6;
                org.telegram.ui.ActionBar.f6 f6Var = lzVar.a;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
                int i13 = org.telegram.ui.ActionBar.j6.Oh;
                int d = i0.a.d(lzVar.r, v02, org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                x9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                x9Var.invalidate();
                org.telegram.ui.Components.x9 x9Var2 = lzVar.f;
                x9Var2.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - lzVar.r, org.telegram.ui.ActionBar.j6.v0(i12, f6Var), org.telegram.ui.ActionBar.j6.v0(i13, f6Var)), mode));
                x9Var2.invalidate();
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
                a20 a20Var = (a20) this.b;
                a20Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = a20Var.c;
                imageView.setAlpha(floatValue3);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f7);
                imageView.setScaleY(f7);
                View view = a20Var.f;
                float f10 = 1.0f - floatValue3;
                view.setAlpha(f10);
                float f11 = (f10 * 0.5f) + 0.5f;
                view.setScaleX(f11);
                view.setScaleY(f11);
                break;
            case 15:
                j60 j60Var = (j60) this.b;
                j60Var.V0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j60Var.L1(true);
                j60Var.e.invalidate();
                j60Var.Q.invalidate();
                break;
            case 16:
                s50 s50Var = (s50) this.b;
                s50Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s50Var.a.invalidate();
                break;
            case 17:
                x50 x50Var = (x50) this.b;
                x50Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j60 j60Var2 = x50Var.L;
                j60Var2.Q.invalidate();
                j60Var2.a2.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) j60Var2).containerView;
                viewGroup.invalidate();
                j60.J0(j60Var2);
                break;
            case 18:
                hk0 hk0Var = (hk0) this.b;
                hk0Var.getClass();
                hk0Var.f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                hk0Var.invalidate();
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
                PhotoViewer photoViewer = ((bu0) this.b).d;
                photoViewer.T1.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.T1.invalidate();
                break;
            case 21:
                PhotoViewer photoViewer2 = ((bu0) this.b).d;
                photoViewer2.T1.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.T1.invalidate();
                break;
            case 22:
                ((PhotoViewer) ((org.telegram.ui.Components.em0) this.b).b).T1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 23:
                PhotoViewer photoViewer3 = ((eu0) this.b).r;
                photoViewer3.m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.F1();
                break;
            case 24:
                tu0 tu0Var = (tu0) this.b;
                tu0Var.getClass();
                tu0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 25:
                ov0 ov0Var = (ov0) this.b;
                ov0Var.getClass();
                ov0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ov0Var.e();
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
