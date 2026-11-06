package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a3(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                b3 b3Var = (b3) obj;
                b3Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b3Var.d.setTextColor(i0.a.f(floatValue, -16777216, -1));
                b3Var.e.setTextColor(i0.a.f(floatValue, -16777216, -1));
                b3Var.f.setTextColor(i0.a.f(floatValue, -16777216, -1));
                break;
            case 1:
                q4 q4Var = (q4) obj;
                float U1 = org.telegram.messenger.g0.U1(valueAnimator.getAnimatedFraction(), q4Var.n);
                int i10 = (int) (255.0f * U1);
                q4Var.f.setAlpha(i10);
                q4Var.h.setAlpha(i10);
                q4Var.r.setAlpha((int) (66.0f * U1));
                q4Var.s.setAlpha((int) (85.0f * U1));
                q4Var.w.setAlpha(i10);
                q4Var.G = U1;
                q4Var.invalidate();
                break;
            case 2:
                h8 h8Var = (h8) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < h8Var.b.getChildCount(); i11++) {
                    e8.b((e8) h8Var.b.getChildAt(i11), floatValue2);
                }
                break;
            case 3:
                bd bdVar = (bd) obj;
                bdVar.b.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                bdVar.b.invalidateSelf();
                break;
            case 4:
                ((org.telegram.ui.Components.wq) obj).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 5:
                hk hkVar = (hk) obj;
                hkVar.getClass();
                hkVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                hkVar.invalidate();
                break;
            case 6:
                kp kpVar = (kp) obj;
                kpVar.getClass();
                kpVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = kpVar.e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    break;
                }
                break;
            case 7:
                br brVar = (br) obj;
                brVar.getClass();
                brVar.Q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                brVar.invalidate();
                if (brVar.getParent() != null) {
                    ((ViewGroup) brVar.getParent()).invalidate();
                    break;
                }
                break;
            case 8:
                wq wqVar = (wq) obj;
                wqVar.P1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wqVar.invalidate();
                if (wqVar.getParent() != null) {
                    ((ViewGroup) wqVar.getParent()).invalidate();
                    break;
                }
                break;
            case 9:
                sw swVar = (sw) obj;
                swVar.getClass();
                swVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 10:
                az azVar = (az) obj;
                azVar.getClass();
                azVar.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                azVar.invalidate();
                break;
            case 11:
                a00 a00Var = (a00) obj;
                a00Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = a00Var.c;
                imageView.setAlpha(floatValue3);
                float f10 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f10);
                imageView.setScaleY(f10);
                View view = a00Var.f;
                float f11 = 1.0f - floatValue3;
                view.setAlpha(f11);
                float f12 = (f11 * 0.5f) + 0.5f;
                view.setScaleX(f12);
                view.setScaleY(f12);
                break;
            case 12:
                c40 c40Var = (c40) obj;
                c40Var.M2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c40Var.R1(true);
                c40Var.l1.invalidate();
                c40Var.H1.invalidate();
                break;
            case 13:
                n30 n30Var = (n30) obj;
                n30Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n30Var.a.invalidate();
                break;
            case 14:
                q30 q30Var = (q30) obj;
                q30Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c40 c40Var2 = q30Var.L;
                c40Var2.H1.invalidate();
                c40Var2.R3.invalidate();
                c40Var2.b.invalidate();
                c40.P0(c40Var2);
                break;
            case 15:
                ((pa0) obj).glassEngine.g();
                break;
            case 16:
                ch0 ch0Var = (ch0) obj;
                ch0Var.getClass();
                ch0Var.f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                ch0Var.invalidate();
                break;
            case 17:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                passcodeActivity.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.w.setAlpha(floatValue4);
                passcodeActivity.w.setTranslationY((1.0f - floatValue4) * org.telegram.messenger.g0.L(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                break;
            case 18:
                PhotoViewer photoViewer = ((vp0) obj).d;
                photoViewer.T1.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.T1.invalidate();
                break;
            case 19:
                PhotoViewer photoViewer2 = ((vp0) obj).d;
                photoViewer2.T1.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.T1.invalidate();
                break;
            case 20:
                ((PhotoViewer) ((org.telegram.ui.Components.nk0) obj).b).T1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 21:
                PhotoViewer photoViewer3 = ((yp0) obj).r;
                photoViewer3.l6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.D1();
                break;
            case 22:
                nq0 nq0Var = (nq0) obj;
                nq0Var.getClass();
                nq0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 23:
                er0 er0Var = (er0) obj;
                er0Var.getClass();
                er0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                er0Var.e();
                break;
            case 24:
                ((ru0) obj).G.a.invalidate();
                break;
            case 25:
                ProfileActivity profileActivity = ((vv0) obj).x2;
                RectF rectF = ProfileActivity.S6;
                profileActivity.p5();
                break;
            case 26:
                kw0 kw0Var = (kw0) obj;
                float[] fArr = kw0Var.n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                kw0Var.F = animatedFraction;
                kw0Var.e(true, org.telegram.messenger.g0.U1(animatedFraction, fArr));
                break;
            case 27:
                mw0 mw0Var = (mw0) obj;
                float U12 = org.telegram.messenger.g0.U1(valueAnimator.getAnimatedFraction(), mw0Var.e);
                ProfileActivity profileActivity2 = mw0Var.n;
                org.telegram.ui.ActionBar.f5 f5Var = profileActivity2.T0;
                if (f5Var != null && !profileActivity2.o2) {
                    float f13 = 1.0f - U12;
                    f5Var.setScaleX(f13);
                    profileActivity2.T0.setScaleY(f13);
                    profileActivity2.T0.setAlpha(f13);
                }
                mw0Var.setScaleX(U12);
                mw0Var.setScaleY(U12);
                mw0Var.setAlpha(U12);
                break;
            case 28:
                kx0 kx0Var = (kx0) obj;
                kx0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kx0Var.b();
                break;
            default:
                ux0 ux0Var = (ux0) obj;
                ux0Var.D = org.telegram.messenger.g0.U1(valueAnimator.getAnimatedFraction(), ux0Var.E);
                ux0Var.h.setTextColor(i0.a.f(ux0Var.D, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.z6, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q6, false)));
                break;
        }
    }
}
