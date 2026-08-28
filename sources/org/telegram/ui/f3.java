package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f3(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                g3 g3Var = (g3) this.b;
                g3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g3Var.d.setTextColor(i0.a.d(floatValue, -16777216, -1));
                g3Var.e.setTextColor(i0.a.d(floatValue, -16777216, -1));
                g3Var.f.setTextColor(i0.a.d(floatValue, -16777216, -1));
                break;
            case 1:
                q4 q4Var = (q4) this.b;
                float lerp = AndroidUtilities.lerp(q4Var.n, valueAnimator.getAnimatedFraction());
                int i9 = (int) (255.0f * lerp);
                q4Var.f.setAlpha(i9);
                q4Var.h.setAlpha(i9);
                q4Var.r.setAlpha((int) (66.0f * lerp));
                q4Var.s.setAlpha((int) (85.0f * lerp));
                q4Var.v.setAlpha(i9);
                q4Var.C = lerp;
                q4Var.invalidate();
                break;
            case 2:
                y6.W((y6) this.b, valueAnimator);
                break;
            case 3:
                g8 g8Var = (g8) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i10 = 0; i10 < g8Var.b.getChildCount(); i10++) {
                    d8.b((d8) g8Var.b.getChildAt(i10), floatValue2);
                }
                break;
            case 4:
                id idVar = (id) this.b;
                idVar.b.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                idVar.b.invalidateSelf();
                break;
            case 5:
                ((org.telegram.ui.Components.fr) this.b).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                rk rkVar = (rk) this.b;
                rkVar.getClass();
                rkVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                rkVar.invalidate();
                break;
            case 7:
                vo voVar = (vo) this.b;
                voVar.r.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                voVar.r.invalidateSelf();
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
                yx yxVar = (yx) this.b;
                yxVar.getClass();
                yxVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 11:
                uy uyVar = (uy) this.b;
                uyVar.getClass();
                uyVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.o9 o9Var = uyVar.c;
                int i11 = org.telegram.ui.ActionBar.f6.C6;
                org.telegram.ui.ActionBar.b6 b6Var = uyVar.a;
                int v02 = org.telegram.ui.ActionBar.f6.v0(i11, b6Var);
                int i12 = org.telegram.ui.ActionBar.f6.Oh;
                int d = i0.a.d(uyVar.r, v02, org.telegram.ui.ActionBar.f6.v0(i12, b6Var));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                o9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                o9Var.invalidate();
                org.telegram.ui.Components.o9 o9Var2 = uyVar.f;
                o9Var2.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - uyVar.r, org.telegram.ui.ActionBar.f6.v0(i11, b6Var), org.telegram.ui.ActionBar.f6.v0(i12, b6Var)), mode));
                o9Var2.invalidate();
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
                o50 o50Var = (o50) this.b;
                o50Var.R0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o50Var.L1(true);
                o50Var.e.invalidate();
                o50Var.M.invalidate();
                break;
            case 16:
                y40 y40Var = (y40) this.b;
                y40Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y40Var.a.invalidate();
                break;
            case 17:
                c50 c50Var = (c50) this.b;
                c50Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o50 o50Var2 = c50Var.L;
                o50Var2.M.invalidate();
                o50Var2.W1.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) o50Var2).containerView;
                viewGroup.invalidate();
                o50.I0(o50Var2);
                break;
            case 18:
                pj0 pj0Var = (pj0) this.b;
                pj0Var.getClass();
                pj0Var.f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                pj0Var.invalidate();
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
                PhotoViewer photoViewer = ((at0) this.b).d;
                photoViewer.P1.g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.P1.invalidate();
                break;
            case 21:
                PhotoViewer photoViewer2 = ((at0) this.b).d;
                photoViewer2.P1.g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.P1.invalidate();
                break;
            case 22:
                ((PhotoViewer) ((org.telegram.ui.Components.pl0) this.b).b).P1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 23:
                PhotoViewer photoViewer3 = ((dt0) this.b).r;
                photoViewer3.i6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.F1();
                break;
            case 24:
                st0 st0Var = (st0) this.b;
                st0Var.getClass();
                st0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 25:
                nu0 nu0Var = (nu0) this.b;
                nu0Var.getClass();
                nu0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nu0Var.e();
                break;
            case 26:
                ((cy0) this.b).G.a.invalidate();
                break;
            case 27:
                ((hz0) this.b).c2.U4();
                break;
            case 28:
                wz0 wz0Var = (wz0) this.b;
                float[] fArr = wz0Var.n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                wz0Var.B = animatedFraction;
                wz0Var.e(AndroidUtilities.lerp(fArr, animatedFraction), true);
                break;
            default:
                yz0 yz0Var = (yz0) this.b;
                float lerp2 = AndroidUtilities.lerp(yz0Var.e, valueAnimator.getAnimatedFraction());
                ProfileActivity profileActivity = yz0Var.n;
                org.telegram.ui.ActionBar.w0 w0Var = profileActivity.Q0;
                if (w0Var != null && !profileActivity.l2) {
                    float f13 = 1.0f - lerp2;
                    w0Var.setScaleX(f13);
                    profileActivity.Q0.setScaleY(f13);
                    profileActivity.Q0.setAlpha(f13);
                }
                if (profileActivity.J0) {
                    float f14 = 1.0f - lerp2;
                    profileActivity.O0.setScaleX(f14);
                    profileActivity.O0.setScaleY(f14);
                    profileActivity.O0.setAlpha(f14);
                }
                if (profileActivity.H0) {
                    float f15 = 1.0f - lerp2;
                    profileActivity.M0.setScaleX(f15);
                    profileActivity.M0.setScaleY(f15);
                    profileActivity.M0.setAlpha(f15);
                }
                if (profileActivity.I0) {
                    float f16 = 1.0f - lerp2;
                    profileActivity.N0.setScaleX(f16);
                    profileActivity.N0.setScaleY(f16);
                    profileActivity.N0.setAlpha(f16);
                }
                yz0Var.setScaleX(lerp2);
                yz0Var.setScaleY(lerp2);
                yz0Var.setAlpha(lerp2);
                break;
        }
    }
}
