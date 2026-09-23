package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                ld ldVar = (ld) this.b;
                ldVar.b.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ldVar.b.invalidateSelf();
                break;
            case 5:
                ((org.telegram.ui.Components.qr) this.b).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                al alVar = (al) this.b;
                alVar.getClass();
                alVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                alVar.invalidate();
                break;
            case 7:
                gp gpVar = (gp) this.b;
                gpVar.r.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                gpVar.r.invalidateSelf();
                break;
            case 8:
                bs bsVar = (bs) this.b;
                bsVar.getClass();
                bsVar.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bsVar.invalidate();
                if (bsVar.getParent() != null) {
                    ((ViewGroup) bsVar.getParent()).invalidate();
                    break;
                }
                break;
            case 9:
                xr xrVar = (xr) this.b;
                xrVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xrVar.invalidate();
                if (xrVar.getParent() != null) {
                    ((ViewGroup) xrVar.getParent()).invalidate();
                    break;
                }
                break;
            case 10:
                ny nyVar = (ny) this.b;
                nyVar.getClass();
                nyVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 11:
                iz izVar = (iz) this.b;
                izVar.getClass();
                izVar.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.w9 w9Var = izVar.c;
                int i12 = org.telegram.ui.ActionBar.h6.C6;
                org.telegram.ui.ActionBar.d6 d6Var = izVar.a;
                int v02 = org.telegram.ui.ActionBar.h6.v0(i12, d6Var);
                int i13 = org.telegram.ui.ActionBar.h6.Oh;
                int d = i0.a.d(izVar.r, v02, org.telegram.ui.ActionBar.h6.v0(i13, d6Var));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                w9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                w9Var.invalidate();
                org.telegram.ui.Components.w9 w9Var2 = izVar.f;
                w9Var2.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - izVar.r, org.telegram.ui.ActionBar.h6.v0(i12, d6Var), org.telegram.ui.ActionBar.h6.v0(i13, d6Var)), mode));
                w9Var2.invalidate();
                break;
            case 12:
                zz zzVar = (zz) this.b;
                zzVar.n.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                zzVar.n.invalidateSelf();
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
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f7);
                imageView.setScaleY(f7);
                View view = x10Var.f;
                float f10 = 1.0f - floatValue3;
                view.setAlpha(f10);
                float f11 = (f10 * 0.5f) + 0.5f;
                view.setScaleX(f11);
                view.setScaleY(f11);
                break;
            case 15:
                f60 f60Var = (f60) this.b;
                f60Var.V0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f60Var.L1(true);
                f60Var.e.invalidate();
                f60Var.Q.invalidate();
                break;
            case 16:
                o50 o50Var = (o50) this.b;
                o50Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o50Var.a.invalidate();
                break;
            case 17:
                t50 t50Var = (t50) this.b;
                t50Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f60 f60Var2 = t50Var.L;
                f60Var2.Q.invalidate();
                f60Var2.a2.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) f60Var2).containerView;
                viewGroup.invalidate();
                f60.J0(f60Var2);
                break;
            case 18:
                yj0 yj0Var = (yj0) this.b;
                yj0Var.getClass();
                yj0Var.f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                yj0Var.invalidate();
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
                PhotoViewer photoViewer = ((vt0) this.b).d;
                photoViewer.T1.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.T1.invalidate();
                break;
            case 21:
                PhotoViewer photoViewer2 = ((vt0) this.b).d;
                photoViewer2.T1.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.T1.invalidate();
                break;
            case 22:
                ((PhotoViewer) ((org.telegram.ui.Components.fm0) this.b).b).T1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 23:
                PhotoViewer photoViewer3 = ((yt0) this.b).r;
                photoViewer3.m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.F1();
                break;
            case 24:
                nu0 nu0Var = (nu0) this.b;
                nu0Var.getClass();
                nu0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 25:
                iv0 iv0Var = (iv0) this.b;
                iv0Var.getClass();
                iv0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iv0Var.e();
                break;
            case 26:
                ((zy0) this.b).G.a.invalidate();
                break;
            case 27:
                ((e01) this.b).g2.U4();
                break;
            case 28:
                t01 t01Var = (t01) this.b;
                float[] fArr = t01Var.n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                t01Var.F = animatedFraction;
                t01Var.e(AndroidUtilities.lerp(fArr, animatedFraction), true);
                break;
            default:
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
        }
    }
}
