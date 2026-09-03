package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                v4 v4Var = (v4) this.b;
                float lerp = AndroidUtilities.lerp(v4Var.n, valueAnimator.getAnimatedFraction());
                int i10 = (int) (255.0f * lerp);
                v4Var.f.setAlpha(i10);
                v4Var.h.setAlpha(i10);
                v4Var.r.setAlpha((int) (66.0f * lerp));
                v4Var.s.setAlpha((int) (85.0f * lerp));
                v4Var.v.setAlpha(i10);
                v4Var.D = lerp;
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
                pd pdVar = (pd) this.b;
                pdVar.b.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                pdVar.b.invalidateSelf();
                break;
            case 5:
                ((org.telegram.ui.Components.lr) this.b).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                cl clVar = (cl) this.b;
                clVar.getClass();
                clVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                clVar.invalidate();
                break;
            case 7:
                fp fpVar = (fp) this.b;
                fpVar.r.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                fpVar.r.invalidateSelf();
                break;
            case 8:
                ds dsVar = (ds) this.b;
                dsVar.getClass();
                dsVar.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dsVar.invalidate();
                if (dsVar.getParent() != null) {
                    ((ViewGroup) dsVar.getParent()).invalidate();
                    break;
                }
                break;
            case 9:
                yr yrVar = (yr) this.b;
                yrVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yrVar.invalidate();
                if (yrVar.getParent() != null) {
                    ((ViewGroup) yrVar.getParent()).invalidate();
                    break;
                }
                break;
            case 10:
                my myVar = (my) this.b;
                myVar.getClass();
                myVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 11:
                iz izVar = (iz) this.b;
                izVar.getClass();
                izVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.p9 p9Var = izVar.c;
                int i12 = org.telegram.ui.ActionBar.j6.C6;
                org.telegram.ui.ActionBar.f6 f6Var = izVar.a;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
                int i13 = org.telegram.ui.ActionBar.j6.Oh;
                int d = i0.a.d(izVar.r, v02, org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                p9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                p9Var.invalidate();
                org.telegram.ui.Components.p9 p9Var2 = izVar.f;
                p9Var2.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - izVar.r, org.telegram.ui.ActionBar.j6.v0(i12, f6Var), org.telegram.ui.ActionBar.j6.v0(i13, f6Var)), mode));
                p9Var2.invalidate();
                break;
            case 12:
                a00 a00Var = (a00) this.b;
                a00Var.n.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                a00Var.n.invalidateSelf();
                break;
            case 13:
                v00 v00Var = (v00) this.b;
                v00Var.getClass();
                v00Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v00Var.invalidate();
                break;
            case 14:
                x10 x10Var = (x10) this.b;
                x10Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = x10Var.c;
                imageView.setAlpha(floatValue3);
                float f10 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f10);
                imageView.setScaleY(f10);
                View view = x10Var.f;
                float f11 = 1.0f - floatValue3;
                view.setAlpha(f11);
                float f12 = (f11 * 0.5f) + 0.5f;
                view.setScaleX(f12);
                view.setScaleY(f12);
                break;
            case 15:
                e60 e60Var = (e60) this.b;
                e60Var.S0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e60Var.L1(true);
                e60Var.e.invalidate();
                e60Var.N.invalidate();
                break;
            case 16:
                o50 o50Var = (o50) this.b;
                o50Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o50Var.a.invalidate();
                break;
            case 17:
                s50 s50Var = (s50) this.b;
                s50Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e60 e60Var2 = s50Var.L;
                e60Var2.N.invalidate();
                e60Var2.X1.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.g3) e60Var2).containerView;
                viewGroup.invalidate();
                e60.J0(e60Var2);
                break;
            case 18:
                wj0 wj0Var = (wj0) this.b;
                wj0Var.getClass();
                wj0Var.f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                wj0Var.invalidate();
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
                PhotoViewer photoViewer = ((ot0) this.b).d;
                photoViewer.Q1.h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.Q1.invalidate();
                break;
            case 21:
                PhotoViewer photoViewer2 = ((ot0) this.b).d;
                photoViewer2.Q1.h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.Q1.invalidate();
                break;
            case 22:
                ((PhotoViewer) ((org.telegram.ui.Components.lm0) this.b).b).Q1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 23:
                PhotoViewer photoViewer3 = ((rt0) this.b).r;
                photoViewer3.j6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.F1();
                break;
            case 24:
                hu0 hu0Var = (hu0) this.b;
                hu0Var.getClass();
                hu0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 25:
                cv0 cv0Var = (cv0) this.b;
                cv0Var.getClass();
                cv0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cv0Var.e();
                break;
            case 26:
                ((uy0) this.b).G.a.invalidate();
                break;
            case 27:
                ((zz0) this.b).d2.U4();
                break;
            case 28:
                o01 o01Var = (o01) this.b;
                float[] fArr = o01Var.n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                o01Var.C = animatedFraction;
                o01Var.e(AndroidUtilities.lerp(fArr, animatedFraction), true);
                break;
            default:
                q01 q01Var = (q01) this.b;
                float lerp2 = AndroidUtilities.lerp(q01Var.e, valueAnimator.getAnimatedFraction());
                ProfileActivity profileActivity = q01Var.n;
                org.telegram.ui.ActionBar.w0 w0Var = profileActivity.R0;
                if (w0Var != null && !profileActivity.m2) {
                    float f13 = 1.0f - lerp2;
                    w0Var.setScaleX(f13);
                    profileActivity.R0.setScaleY(f13);
                    profileActivity.R0.setAlpha(f13);
                }
                if (profileActivity.K0) {
                    float f14 = 1.0f - lerp2;
                    profileActivity.P0.setScaleX(f14);
                    profileActivity.P0.setScaleY(f14);
                    profileActivity.P0.setAlpha(f14);
                }
                if (profileActivity.I0) {
                    float f15 = 1.0f - lerp2;
                    profileActivity.N0.setScaleX(f15);
                    profileActivity.N0.setScaleY(f15);
                    profileActivity.N0.setAlpha(f15);
                }
                if (profileActivity.J0) {
                    float f16 = 1.0f - lerp2;
                    profileActivity.O0.setScaleX(f16);
                    profileActivity.O0.setScaleY(f16);
                    profileActivity.O0.setAlpha(f16);
                }
                q01Var.setScaleX(lerp2);
                q01Var.setScaleY(lerp2);
                q01Var.setAlpha(lerp2);
                break;
        }
    }
}
