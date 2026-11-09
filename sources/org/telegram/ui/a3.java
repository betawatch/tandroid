package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                jk jkVar = (jk) obj;
                jkVar.getClass();
                jkVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                jkVar.invalidate();
                break;
            case 6:
                mp mpVar = (mp) obj;
                mpVar.getClass();
                mpVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = mpVar.e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    break;
                }
                break;
            case 7:
                dr drVar = (dr) obj;
                drVar.getClass();
                drVar.Q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                drVar.invalidate();
                if (drVar.getParent() != null) {
                    ((ViewGroup) drVar.getParent()).invalidate();
                    break;
                }
                break;
            case 8:
                yq yqVar = (yq) obj;
                yqVar.P1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
                cz czVar = (cz) obj;
                czVar.getClass();
                czVar.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                czVar.invalidate();
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
                e40 e40Var = (e40) obj;
                e40Var.M2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e40Var.R1(true);
                e40Var.l1.invalidate();
                e40Var.H1.invalidate();
                break;
            case 13:
                p30 p30Var = (p30) obj;
                p30Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p30Var.a.invalidate();
                break;
            case 14:
                s30 s30Var = (s30) obj;
                s30Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e40 e40Var2 = s30Var.L;
                e40Var2.H1.invalidate();
                e40Var2.R3.invalidate();
                e40Var2.b.invalidate();
                e40.P0(e40Var2);
                break;
            case 15:
                ((ra0) obj).glassEngine.g();
                break;
            case 16:
                eh0 eh0Var = (eh0) obj;
                eh0Var.getClass();
                eh0Var.f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                eh0Var.invalidate();
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
                PhotoViewer photoViewer = ((yp0) obj).d;
                photoViewer.T1.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.T1.invalidate();
                break;
            case 19:
                PhotoViewer photoViewer2 = ((yp0) obj).d;
                photoViewer2.T1.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.T1.invalidate();
                break;
            case 20:
                ((PhotoViewer) ((org.telegram.ui.Components.ok0) obj).b).T1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 21:
                PhotoViewer photoViewer3 = ((bq0) obj).r;
                photoViewer3.l6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.D1();
                break;
            case 22:
                qq0 qq0Var = (qq0) obj;
                qq0Var.getClass();
                qq0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 23:
                hr0 hr0Var = (hr0) obj;
                hr0Var.getClass();
                hr0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hr0Var.e();
                break;
            case 24:
                ((uu0) obj).G.a.invalidate();
                break;
            case 25:
                ProfileActivity profileActivity = ((xv0) obj).x2;
                RectF rectF = ProfileActivity.V6;
                profileActivity.s5();
                break;
            case 26:
                mw0 mw0Var = (mw0) obj;
                float[] fArr = mw0Var.n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                mw0Var.F = animatedFraction;
                mw0Var.e(true, org.telegram.messenger.g0.U1(animatedFraction, fArr));
                break;
            case 27:
                ow0 ow0Var = (ow0) obj;
                float U12 = org.telegram.messenger.g0.U1(valueAnimator.getAnimatedFraction(), ow0Var.e);
                ProfileActivity profileActivity2 = ow0Var.n;
                org.telegram.ui.ActionBar.f5 f5Var = profileActivity2.T0;
                if (f5Var != null && !profileActivity2.o2) {
                    float f13 = 1.0f - U12;
                    f5Var.setScaleX(f13);
                    profileActivity2.T0.setScaleY(f13);
                    profileActivity2.T0.setAlpha(f13);
                }
                ow0Var.setScaleX(U12);
                ow0Var.setScaleY(U12);
                ow0Var.setAlpha(U12);
                break;
            case 28:
                ox0 ox0Var = (ox0) obj;
                ox0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ox0Var.b();
                break;
            default:
                yx0 yx0Var = (yx0) obj;
                yx0Var.D = org.telegram.messenger.g0.U1(valueAnimator.getAnimatedFraction(), yx0Var.E);
                yx0Var.h.setTextColor(i0.a.f(yx0Var.D, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.z6, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.q6, false)));
                break;
        }
    }
}
