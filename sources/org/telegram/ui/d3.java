package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                e3Var.d.setTextColor(i0.a.d(floatValue, -16777216, -1));
                e3Var.e.setTextColor(i0.a.d(floatValue, -16777216, -1));
                e3Var.f.setTextColor(i0.a.d(floatValue, -16777216, -1));
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
                y6.X((y6) this.b, valueAnimator);
                break;
            case 3:
                h8 h8Var = (h8) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < h8Var.b.getChildCount(); i11++) {
                    e8.b((e8) h8Var.b.getChildAt(i11), floatValue2);
                }
                break;
            case 4:
                nd ndVar = (nd) this.b;
                ndVar.b.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ndVar.b.invalidateSelf();
                break;
            case 5:
                ((org.telegram.ui.Components.vr) this.b).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                fl flVar = (fl) this.b;
                flVar.getClass();
                flVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                flVar.invalidate();
                break;
            case 7:
                mp mpVar = (mp) this.b;
                mpVar.r.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                mpVar.r.invalidateSelf();
                break;
            case 8:
                hs hsVar = (hs) this.b;
                hsVar.getClass();
                hsVar.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hsVar.invalidate();
                if (hsVar.getParent() != null) {
                    ((ViewGroup) hsVar.getParent()).invalidate();
                    break;
                }
                break;
            case 9:
                ds dsVar = (ds) this.b;
                dsVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dsVar.invalidate();
                if (dsVar.getParent() != null) {
                    ((ViewGroup) dsVar.getParent()).invalidate();
                    break;
                }
                break;
            case 10:
                sy syVar = (sy) this.b;
                syVar.getClass();
                syVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 11:
                nz nzVar = (nz) this.b;
                nzVar.getClass();
                nzVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.w9 w9Var = nzVar.c;
                int i12 = org.telegram.ui.ActionBar.j6.C6;
                org.telegram.ui.ActionBar.f6 f6Var = nzVar.a;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
                int i13 = org.telegram.ui.ActionBar.j6.Oh;
                int d = i0.a.d(nzVar.r, v02, org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                w9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                w9Var.invalidate();
                org.telegram.ui.Components.w9 w9Var2 = nzVar.f;
                w9Var2.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - nzVar.r, org.telegram.ui.ActionBar.j6.v0(i12, f6Var), org.telegram.ui.ActionBar.j6.v0(i13, f6Var)), mode));
                w9Var2.invalidate();
                break;
            case 12:
                e00 e00Var = (e00) this.b;
                e00Var.n.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                e00Var.n.invalidateSelf();
                break;
            case 13:
                a10 a10Var = (a10) this.b;
                a10Var.getClass();
                a10Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a10Var.invalidate();
                break;
            case 14:
                b20 b20Var = (b20) this.b;
                b20Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = b20Var.c;
                imageView.setAlpha(floatValue3);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f7);
                imageView.setScaleY(f7);
                View view = b20Var.f;
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
                viewGroup = ((org.telegram.ui.ActionBar.h3) j60Var2).containerView;
                viewGroup.invalidate();
                j60.J0(j60Var2);
                break;
            case 18:
                gk0 gk0Var = (gk0) this.b;
                gk0Var.getClass();
                gk0Var.f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                gk0Var.invalidate();
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
                ((PhotoViewer) ((org.telegram.ui.Components.om0) this.b).b).T1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 23:
                PhotoViewer photoViewer3 = ((eu0) this.b).r;
                photoViewer3.m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.F1();
                break;
            case 24:
                vu0 vu0Var = (vu0) this.b;
                vu0Var.getClass();
                vu0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 25:
                rv0 rv0Var = (rv0) this.b;
                rv0Var.getClass();
                rv0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rv0Var.e();
                break;
            case 26:
                ((kz0) this.b).G.a.invalidate();
                break;
            case 27:
                ((r01) this.b).g2.U4();
                break;
            case 28:
                g11 g11Var = (g11) this.b;
                float[] fArr = g11Var.n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                g11Var.F = animatedFraction;
                g11Var.e(AndroidUtilities.lerp(fArr, animatedFraction), true);
                break;
            default:
                i11 i11Var = (i11) this.b;
                float lerp2 = AndroidUtilities.lerp(i11Var.e, valueAnimator.getAnimatedFraction());
                ProfileActivity profileActivity = i11Var.n;
                org.telegram.ui.ActionBar.w0 w0Var = profileActivity.U0;
                if (w0Var != null && !profileActivity.p2) {
                    float f12 = 1.0f - lerp2;
                    w0Var.setScaleX(f12);
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
                i11Var.setScaleX(lerp2);
                i11Var.setScaleY(lerp2);
                i11Var.setAlpha(lerp2);
                break;
        }
    }
}
