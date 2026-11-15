package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                q4Var.H = U1;
                q4Var.invalidate();
                break;
            case 2:
                i8 i8Var = (i8) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < i8Var.b.getChildCount(); i11++) {
                    f8.b((f8) i8Var.b.getChildAt(i11), floatValue2);
                }
                break;
            case 3:
                ad adVar = (ad) obj;
                adVar.b.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                adVar.b.invalidateSelf();
                break;
            case 4:
                ((org.telegram.ui.Components.dr) obj).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 5:
                hk hkVar = (hk) obj;
                hkVar.getClass();
                hkVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                hkVar.invalidate();
                break;
            case 6:
                mp mpVar = (mp) obj;
                mpVar.getClass();
                mpVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = mpVar.e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    break;
                }
                break;
            case 7:
                dr drVar = (dr) obj;
                drVar.getClass();
                drVar.W1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                drVar.invalidate();
                if (drVar.getParent() != null) {
                    ((ViewGroup) drVar.getParent()).invalidate();
                    break;
                }
                break;
            case 8:
                yq yqVar = (yq) obj;
                yqVar.V1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yqVar.invalidate();
                if (yqVar.getParent() != null) {
                    ((ViewGroup) yqVar.getParent()).invalidate();
                    break;
                }
                break;
            case 9:
                uw uwVar = (uw) obj;
                uwVar.getClass();
                uwVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 10:
                bz bzVar = (bz) obj;
                bzVar.getClass();
                bzVar.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bzVar.invalidate();
                break;
            case 11:
                c00 c00Var = (c00) obj;
                c00Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = c00Var.c;
                imageView.setAlpha(floatValue3);
                float f10 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f10);
                imageView.setScaleY(f10);
                View view = c00Var.f;
                float f11 = 1.0f - floatValue3;
                view.setAlpha(f11);
                float f12 = (f11 * 0.5f) + 0.5f;
                view.setScaleX(f12);
                view.setScaleY(f12);
                break;
            case 12:
                c40 c40Var = (c40) obj;
                c40Var.Q2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c40Var.T1(true);
                c40Var.p1.invalidate();
                c40Var.L1.invalidate();
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
                c40Var2.L1.invalidate();
                c40Var2.Z3.invalidate();
                c40Var2.b.invalidate();
                c40.P0(c40Var2);
                break;
            case 15:
                ((pa0) obj).glassEngine.g();
                break;
            case 16:
                dh0 dh0Var = (dh0) obj;
                dh0Var.getClass();
                dh0Var.f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                dh0Var.invalidate();
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
                photoViewer.U1.l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.U1.invalidate();
                break;
            case 19:
                PhotoViewer photoViewer2 = ((vp0) obj).d;
                photoViewer2.U1.l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.U1.invalidate();
                break;
            case 20:
                ((PhotoViewer) ((org.telegram.ui.Components.sk0) obj).b).U1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 21:
                PhotoViewer photoViewer3 = ((yp0) obj).r;
                photoViewer3.m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.D1();
                break;
            case 22:
                nq0 nq0Var = (nq0) obj;
                nq0Var.getClass();
                nq0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 23:
                dr0 dr0Var = (dr0) obj;
                dr0Var.getClass();
                dr0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dr0Var.e();
                break;
            case 24:
                ((qu0) obj).G.a.invalidate();
                break;
            case 25:
                ProfileActivity profileActivity = ((uv0) obj).y2;
                RectF rectF = ProfileActivity.X6;
                profileActivity.r5();
                break;
            case 26:
                jw0 jw0Var = (jw0) obj;
                float[] fArr = jw0Var.n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                jw0Var.G = animatedFraction;
                jw0Var.e(true, org.telegram.messenger.g0.U1(animatedFraction, fArr));
                break;
            case 27:
                lw0 lw0Var = (lw0) obj;
                float U12 = org.telegram.messenger.g0.U1(valueAnimator.getAnimatedFraction(), lw0Var.e);
                ProfileActivity profileActivity2 = lw0Var.n;
                org.telegram.ui.ActionBar.d5 d5Var = profileActivity2.U0;
                if (d5Var != null && !profileActivity2.q2) {
                    float f13 = 1.0f - U12;
                    d5Var.setScaleX(f13);
                    profileActivity2.U0.setScaleY(f13);
                    profileActivity2.U0.setAlpha(f13);
                }
                lw0Var.setScaleX(U12);
                lw0Var.setScaleY(U12);
                lw0Var.setAlpha(U12);
                break;
            case 28:
                jx0 jx0Var = (jx0) obj;
                jx0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jx0Var.b();
                break;
            default:
                tx0 tx0Var = (tx0) obj;
                tx0Var.E = org.telegram.messenger.g0.U1(valueAnimator.getAnimatedFraction(), tx0Var.F);
                tx0Var.h.setTextColor(i0.a.f(tx0Var.E, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.z6, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.q6, false)));
                break;
        }
    }
}
