package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                h3 h3Var = (h3) this.b;
                h3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h3Var.d.setTextColor(i0.a.d(floatValue, -16777216, -1));
                h3Var.e.setTextColor(i0.a.d(floatValue, -16777216, -1));
                h3Var.f.setTextColor(i0.a.d(floatValue, -16777216, -1));
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
                r4Var.C = lerp;
                r4Var.invalidate();
                break;
            case 2:
                x6.X((x6) this.b, valueAnimator);
                break;
            case 3:
                f8 f8Var = (f8) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < f8Var.b.getChildCount(); i11++) {
                    c8.b((c8) f8Var.b.getChildAt(i11), floatValue2);
                }
                break;
            case 4:
                hd hdVar = (hd) this.b;
                hdVar.b.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                hdVar.b.invalidateSelf();
                break;
            case 5:
                ((org.telegram.ui.Components.ir) this.b).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                uk ukVar = (uk) this.b;
                ukVar.getClass();
                ukVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ukVar.invalidate();
                break;
            case 7:
                yo yoVar = (yo) this.b;
                yoVar.r.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                yoVar.r.invalidateSelf();
                break;
            case 8:
                ur urVar = (ur) this.b;
                urVar.getClass();
                urVar.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                urVar.invalidate();
                if (urVar.getParent() != null) {
                    ((ViewGroup) urVar.getParent()).invalidate();
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
                ay ayVar = (ay) this.b;
                ayVar.getClass();
                ayVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 11:
                wy wyVar = (wy) this.b;
                wyVar.getClass();
                wyVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.t9 t9Var = wyVar.c;
                int i12 = org.telegram.ui.ActionBar.g6.C6;
                org.telegram.ui.ActionBar.c6 c6Var = wyVar.a;
                int v02 = org.telegram.ui.ActionBar.g6.v0(i12, c6Var);
                int i13 = org.telegram.ui.ActionBar.g6.Oh;
                int d = i0.a.d(wyVar.r, v02, org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                t9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                t9Var.invalidate();
                org.telegram.ui.Components.t9 t9Var2 = wyVar.f;
                t9Var2.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - wyVar.r, org.telegram.ui.ActionBar.g6.v0(i12, c6Var), org.telegram.ui.ActionBar.g6.v0(i13, c6Var)), mode));
                t9Var2.invalidate();
                break;
            case 12:
                nz nzVar = (nz) this.b;
                nzVar.n.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                nzVar.n.invalidateSelf();
                break;
            case 13:
                i00 i00Var = (i00) this.b;
                i00Var.getClass();
                i00Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i00Var.invalidate();
                break;
            case 14:
                j10 j10Var = (j10) this.b;
                j10Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = j10Var.c;
                imageView.setAlpha(floatValue3);
                float f9 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f9);
                imageView.setScaleY(f9);
                View view = j10Var.f;
                float f10 = 1.0f - floatValue3;
                view.setAlpha(f10);
                float f11 = (f10 * 0.5f) + 0.5f;
                view.setScaleX(f11);
                view.setScaleY(f11);
                break;
            case 15:
                r50 r50Var = (r50) this.b;
                r50Var.R0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r50Var.L1(true);
                r50Var.e.invalidate();
                r50Var.M.invalidate();
                break;
            case 16:
                a50 a50Var = (a50) this.b;
                a50Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a50Var.a.invalidate();
                break;
            case 17:
                f50 f50Var = (f50) this.b;
                f50Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r50 r50Var2 = f50Var.L;
                r50Var2.M.invalidate();
                r50Var2.W1.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) r50Var2).containerView;
                viewGroup.invalidate();
                r50.J0(r50Var2);
                break;
            case 18:
                mj0 mj0Var = (mj0) this.b;
                mj0Var.getClass();
                mj0Var.f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                mj0Var.invalidate();
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
                PhotoViewer photoViewer = ((ys0) this.b).d;
                photoViewer.P1.g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.P1.invalidate();
                break;
            case 21:
                PhotoViewer photoViewer2 = ((ys0) this.b).d;
                photoViewer2.P1.g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.P1.invalidate();
                break;
            case 22:
                ((PhotoViewer) ((org.telegram.ui.Components.cm0) this.b).b).P1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 23:
                PhotoViewer photoViewer3 = ((bt0) this.b).r;
                photoViewer3.i6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.F1();
                break;
            case 24:
                qt0 qt0Var = (qt0) this.b;
                qt0Var.getClass();
                qt0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 25:
                lu0 lu0Var = (lu0) this.b;
                lu0Var.getClass();
                lu0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lu0Var.e();
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
                    float f12 = 1.0f - lerp2;
                    w0Var.setScaleX(f12);
                    profileActivity.Q0.setScaleY(f12);
                    profileActivity.Q0.setAlpha(f12);
                }
                if (profileActivity.J0) {
                    float f13 = 1.0f - lerp2;
                    profileActivity.O0.setScaleX(f13);
                    profileActivity.O0.setScaleY(f13);
                    profileActivity.O0.setAlpha(f13);
                }
                if (profileActivity.H0) {
                    float f14 = 1.0f - lerp2;
                    profileActivity.M0.setScaleX(f14);
                    profileActivity.M0.setScaleY(f14);
                    profileActivity.M0.setAlpha(f14);
                }
                if (profileActivity.I0) {
                    float f15 = 1.0f - lerp2;
                    profileActivity.N0.setScaleX(f15);
                    profileActivity.N0.setScaleY(f15);
                    profileActivity.N0.setAlpha(f15);
                }
                yz0Var.setScaleX(lerp2);
                yz0Var.setScaleY(lerp2);
                yz0Var.setAlpha(lerp2);
                break;
        }
    }
}
