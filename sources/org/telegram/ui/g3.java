package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                h3Var.d.setTextColor(i0.b.d(floatValue, -16777216, -1));
                h3Var.e.setTextColor(i0.b.d(floatValue, -16777216, -1));
                h3Var.f.setTextColor(i0.b.d(floatValue, -16777216, -1));
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
                id idVar = (id) this.b;
                idVar.b.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                idVar.b.invalidateSelf();
                break;
            case 5:
                ((org.telegram.ui.Components.dr) this.b).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                tk tkVar = (tk) this.b;
                tkVar.getClass();
                tkVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                tkVar.invalidate();
                break;
            case 7:
                xo xoVar = (xo) this.b;
                xoVar.r.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                xoVar.r.invalidateSelf();
                break;
            case 8:
                wr wrVar = (wr) this.b;
                wrVar.getClass();
                wrVar.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wrVar.invalidate();
                if (wrVar.getParent() != null) {
                    ((ViewGroup) wrVar.getParent()).invalidate();
                    break;
                }
                break;
            case 9:
                sr srVar = (sr) this.b;
                srVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                srVar.invalidate();
                if (srVar.getParent() != null) {
                    ((ViewGroup) srVar.getParent()).invalidate();
                    break;
                }
                break;
            case 10:
                cy cyVar = (cy) this.b;
                cyVar.getClass();
                cyVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 11:
                xy xyVar = (xy) this.b;
                xyVar.getClass();
                xyVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.n9 n9Var = xyVar.c;
                int i12 = org.telegram.ui.ActionBar.g6.C6;
                org.telegram.ui.ActionBar.c6 c6Var = xyVar.a;
                int v02 = org.telegram.ui.ActionBar.g6.v0(i12, c6Var);
                int i13 = org.telegram.ui.ActionBar.g6.Oh;
                int d = i0.b.d(xyVar.r, v02, org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                n9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                n9Var.invalidate();
                org.telegram.ui.Components.n9 n9Var2 = xyVar.f;
                n9Var2.setColorFilter(new PorterDuffColorFilter(i0.b.d(1.0f - xyVar.r, org.telegram.ui.ActionBar.g6.v0(i12, c6Var), org.telegram.ui.ActionBar.g6.v0(i13, c6Var)), mode));
                n9Var2.invalidate();
                break;
            case 12:
                oz ozVar = (oz) this.b;
                ozVar.n.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ozVar.n.invalidateSelf();
                break;
            case 13:
                j00 j00Var = (j00) this.b;
                j00Var.getClass();
                j00Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j00Var.invalidate();
                break;
            case 14:
                k10 k10Var = (k10) this.b;
                k10Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = k10Var.c;
                imageView.setAlpha(floatValue3);
                float f10 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f10);
                imageView.setScaleY(f10);
                View view = k10Var.f;
                float f11 = 1.0f - floatValue3;
                view.setAlpha(f11);
                float f12 = (f11 * 0.5f) + 0.5f;
                view.setScaleX(f12);
                view.setScaleY(f12);
                break;
            case 15:
                s50 s50Var = (s50) this.b;
                s50Var.R0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s50Var.L1(true);
                s50Var.e.invalidate();
                s50Var.M.invalidate();
                break;
            case 16:
                b50 b50Var = (b50) this.b;
                b50Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b50Var.a.invalidate();
                break;
            case 17:
                g50 g50Var = (g50) this.b;
                g50Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s50 s50Var2 = g50Var.L;
                s50Var2.M.invalidate();
                s50Var2.W1.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.e3) s50Var2).containerView;
                viewGroup.invalidate();
                s50.J0(s50Var2);
                break;
            case 18:
                qj0 qj0Var = (qj0) this.b;
                qj0Var.getClass();
                qj0Var.f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                qj0Var.invalidate();
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
                PhotoViewer photoViewer = ((bt0) this.b).d;
                photoViewer.P1.g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.P1.invalidate();
                break;
            case 21:
                PhotoViewer photoViewer2 = ((bt0) this.b).d;
                photoViewer2.P1.g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.P1.invalidate();
                break;
            case 22:
                ((PhotoViewer) ((org.telegram.ui.Components.sl0) this.b).b).P1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 23:
                PhotoViewer photoViewer3 = ((et0) this.b).r;
                photoViewer3.i6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.F1();
                break;
            case 24:
                tt0 tt0Var = (tt0) this.b;
                tt0Var.getClass();
                tt0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 25:
                ou0 ou0Var = (ou0) this.b;
                ou0Var.getClass();
                ou0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ou0Var.e();
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
                org.telegram.ui.ActionBar.v0 v0Var = profileActivity.Q0;
                if (v0Var != null && !profileActivity.l2) {
                    float f13 = 1.0f - lerp2;
                    v0Var.setScaleX(f13);
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
