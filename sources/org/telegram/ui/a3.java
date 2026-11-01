package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                vx vxVar = (vx) obj;
                vxVar.getClass();
                vxVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 10:
                b00 b00Var = (b00) obj;
                b00Var.getClass();
                b00Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b00Var.invalidate();
                break;
            case 11:
                a10 a10Var = (a10) obj;
                a10Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = a10Var.c;
                imageView.setAlpha(floatValue3);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f7);
                imageView.setScaleY(f7);
                View view = a10Var.f;
                float f10 = 1.0f - floatValue3;
                view.setAlpha(f10);
                float f11 = (f10 * 0.5f) + 0.5f;
                view.setScaleX(f11);
                view.setScaleY(f11);
                break;
            case 12:
                a50 a50Var = (a50) obj;
                a50Var.M2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a50Var.O1(true);
                a50Var.l1.invalidate();
                a50Var.H1.invalidate();
                break;
            case 13:
                l40 l40Var = (l40) obj;
                l40Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l40Var.a.invalidate();
                break;
            case 14:
                o40 o40Var = (o40) obj;
                o40Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a50 a50Var2 = o40Var.L;
                a50Var2.H1.invalidate();
                a50Var2.R3.invalidate();
                a50Var2.b.invalidate();
                a50.P0(a50Var2);
                break;
            case 15:
                ((xb0) obj).glassEngine.g();
                break;
            case 16:
                gi0 gi0Var = (gi0) obj;
                gi0Var.getClass();
                gi0Var.f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                gi0Var.invalidate();
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
                PhotoViewer photoViewer = ((er0) obj).d;
                photoViewer.T1.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.T1.invalidate();
                break;
            case 19:
                PhotoViewer photoViewer2 = ((er0) obj).d;
                photoViewer2.T1.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.T1.invalidate();
                break;
            case 20:
                ((PhotoViewer) ((org.telegram.ui.Components.sl0) obj).b).T1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 21:
                PhotoViewer photoViewer3 = ((ir0) obj).r;
                photoViewer3.m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.I1();
                break;
            case 22:
                yr0 yr0Var = (yr0) obj;
                yr0Var.getClass();
                yr0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 23:
                ps0 ps0Var = (ps0) obj;
                ps0Var.getClass();
                ps0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ps0Var.e();
                break;
            case 24:
                ((bw0) obj).G.a.invalidate();
                break;
            case 25:
                ProfileActivity profileActivity = ((hx0) obj).x2;
                RectF rectF = ProfileActivity.S6;
                profileActivity.p5();
                break;
            case 26:
                xx0 xx0Var = (xx0) obj;
                float[] fArr = xx0Var.n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                xx0Var.F = animatedFraction;
                xx0Var.e(true, org.telegram.messenger.i0.U1(animatedFraction, fArr));
                break;
            case 27:
                zx0 zx0Var = (zx0) obj;
                float U12 = org.telegram.messenger.i0.U1(valueAnimator.getAnimatedFraction(), zx0Var.e);
                ProfileActivity profileActivity2 = zx0Var.n;
                org.telegram.ui.ActionBar.p5 p5Var = profileActivity2.T0;
                if (p5Var != null && !profileActivity2.o2) {
                    float f12 = 1.0f - U12;
                    p5Var.setScaleX(f12);
                    profileActivity2.T0.setScaleY(f12);
                    profileActivity2.T0.setAlpha(f12);
                }
                zx0Var.setScaleX(U12);
                zx0Var.setScaleY(U12);
                zx0Var.setAlpha(U12);
                break;
            case 28:
                yy0 yy0Var = (yy0) obj;
                yy0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yy0Var.b();
                break;
            default:
                iz0 iz0Var = (iz0) obj;
                iz0Var.D = org.telegram.messenger.i0.U1(valueAnimator.getAnimatedFraction(), iz0Var.E);
                iz0Var.h.setTextColor(i0.b.f(iz0Var.D, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.z6, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.q6, false)));
                break;
        }
    }
}
