package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                b3 b3Var = (b3) obj;
                b3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b3Var.d.setTextColor(i0.b.f(floatValue, -16777216, -1));
                b3Var.e.setTextColor(i0.b.f(floatValue, -16777216, -1));
                b3Var.f.setTextColor(i0.b.f(floatValue, -16777216, -1));
                break;
            case 1:
                q4 q4Var = (q4) obj;
                float U1 = org.telegram.messenger.i0.U1(valueAnimator.getAnimatedFraction(), q4Var.n);
                int i11 = (int) (255.0f * U1);
                q4Var.f.setAlpha(i11);
                q4Var.h.setAlpha(i11);
                q4Var.r.setAlpha((int) (66.0f * U1));
                q4Var.s.setAlpha((int) (85.0f * U1));
                q4Var.w.setAlpha(i11);
                q4Var.G = U1;
                q4Var.invalidate();
                break;
            case 2:
                h8 h8Var = (h8) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i12 = 0; i12 < h8Var.b.getChildCount(); i12++) {
                    e8.b((e8) h8Var.b.getChildAt(i12), floatValue2);
                }
                break;
            case 3:
                kd kdVar = (kd) obj;
                kdVar.b.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                kdVar.b.invalidateSelf();
                break;
            case 4:
                ((org.telegram.ui.Components.fr) obj).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 5:
                dl dlVar = (dl) obj;
                dlVar.getClass();
                dlVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                dlVar.invalidate();
                break;
            case 6:
                iq iqVar = (iq) obj;
                iqVar.getClass();
                iqVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = iqVar.e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    break;
                }
                break;
            case 7:
                bs bsVar = (bs) obj;
                bsVar.getClass();
                bsVar.Q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bsVar.invalidate();
                if (bsVar.getParent() != null) {
                    ((ViewGroup) bsVar.getParent()).invalidate();
                    break;
                }
                break;
            case 8:
                xr xrVar = (xr) obj;
                xrVar.P1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xrVar.invalidate();
                if (xrVar.getParent() != null) {
                    ((ViewGroup) xrVar.getParent()).invalidate();
                    break;
                }
                break;
            case 9:
                wx wxVar = (wx) obj;
                wxVar.getClass();
                wxVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 10:
                c00 c00Var = (c00) obj;
                c00Var.getClass();
                c00Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c00Var.invalidate();
                break;
            case 11:
                b10 b10Var = (b10) obj;
                b10Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = b10Var.c;
                imageView.setAlpha(floatValue3);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f7);
                imageView.setScaleY(f7);
                View view = b10Var.f;
                float f10 = 1.0f - floatValue3;
                view.setAlpha(f10);
                float f11 = (f10 * 0.5f) + 0.5f;
                view.setScaleX(f11);
                view.setScaleY(f11);
                break;
            case 12:
                b50 b50Var = (b50) obj;
                b50Var.M2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b50Var.O1(true);
                b50Var.l1.invalidate();
                b50Var.H1.invalidate();
                break;
            case 13:
                m40 m40Var = (m40) obj;
                m40Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m40Var.a.invalidate();
                break;
            case 14:
                p40 p40Var = (p40) obj;
                p40Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b50 b50Var2 = p40Var.L;
                b50Var2.H1.invalidate();
                b50Var2.R3.invalidate();
                b50Var2.b.invalidate();
                b50.P0(b50Var2);
                break;
            case 15:
                ((yb0) obj).glassEngine.g();
                break;
            case 16:
                ii0 ii0Var = (ii0) obj;
                ii0Var.getClass();
                ii0Var.f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                ii0Var.invalidate();
                break;
            case 17:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                passcodeActivity.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.w.setAlpha(floatValue4);
                passcodeActivity.w.setTranslationY((1.0f - floatValue4) * org.telegram.messenger.i0.L(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                break;
            case 18:
                PhotoViewer photoViewer = ((gr0) obj).d;
                photoViewer.T1.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.T1.invalidate();
                break;
            case 19:
                PhotoViewer photoViewer2 = ((gr0) obj).d;
                photoViewer2.T1.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.T1.invalidate();
                break;
            case 20:
                ((PhotoViewer) ((org.telegram.ui.Components.rl0) obj).b).T1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 21:
                PhotoViewer photoViewer3 = ((jr0) obj).r;
                photoViewer3.m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.I1();
                break;
            case 22:
                zr0 zr0Var = (zr0) obj;
                zr0Var.getClass();
                zr0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 23:
                qs0 qs0Var = (qs0) obj;
                qs0Var.getClass();
                qs0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qs0Var.e();
                break;
            case 24:
                ((cw0) obj).G.a.invalidate();
                break;
            case 25:
                ProfileActivity profileActivity = ((ix0) obj).x2;
                RectF rectF = ProfileActivity.R6;
                profileActivity.o5();
                break;
            case 26:
                yx0 yx0Var = (yx0) obj;
                float[] fArr = yx0Var.n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                yx0Var.F = animatedFraction;
                yx0Var.e(true, org.telegram.messenger.i0.U1(animatedFraction, fArr));
                break;
            case 27:
                ay0 ay0Var = (ay0) obj;
                float U12 = org.telegram.messenger.i0.U1(valueAnimator.getAnimatedFraction(), ay0Var.e);
                ProfileActivity profileActivity2 = ay0Var.n;
                org.telegram.ui.ActionBar.p5 p5Var = profileActivity2.T0;
                if (p5Var != null && !profileActivity2.o2) {
                    float f12 = 1.0f - U12;
                    p5Var.setScaleX(f12);
                    profileActivity2.T0.setScaleY(f12);
                    profileActivity2.T0.setAlpha(f12);
                }
                ay0Var.setScaleX(U12);
                ay0Var.setScaleY(U12);
                ay0Var.setAlpha(U12);
                break;
            case 28:
                zy0 zy0Var = (zy0) obj;
                zy0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zy0Var.b();
                break;
            default:
                jz0 jz0Var = (jz0) obj;
                jz0Var.D = org.telegram.messenger.i0.U1(valueAnimator.getAnimatedFraction(), jz0Var.E);
                jz0Var.h.setTextColor(i0.b.f(jz0Var.D, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.z6, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.q6, false)));
                break;
        }
    }
}
