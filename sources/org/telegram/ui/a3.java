package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
                ((org.telegram.ui.Components.mr) obj).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 5:
                ik ikVar = (ik) obj;
                ikVar.getClass();
                ikVar.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ikVar.invalidate();
                break;
            case 6:
                np npVar = (np) obj;
                npVar.getClass();
                npVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = npVar.e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    break;
                }
                break;
            case 7:
                er erVar = (er) obj;
                erVar.getClass();
                erVar.W1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                erVar.invalidate();
                if (erVar.getParent() != null) {
                    ((ViewGroup) erVar.getParent()).invalidate();
                    break;
                }
                break;
            case 8:
                zq zqVar = (zq) obj;
                zqVar.V1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zqVar.invalidate();
                if (zqVar.getParent() != null) {
                    ((ViewGroup) zqVar.getParent()).invalidate();
                    break;
                }
                break;
            case 9:
                yw ywVar = (yw) obj;
                ywVar.getClass();
                ywVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 10:
                ez ezVar = (ez) obj;
                ezVar.getClass();
                ezVar.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ezVar.invalidate();
                break;
            case 11:
                f00 f00Var = (f00) obj;
                f00Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = f00Var.c;
                imageView.setAlpha(floatValue3);
                float f10 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f10);
                imageView.setScaleY(f10);
                View view = f00Var.f;
                float f11 = 1.0f - floatValue3;
                view.setAlpha(f11);
                float f12 = (f11 * 0.5f) + 0.5f;
                view.setScaleX(f12);
                view.setScaleY(f12);
                break;
            case 12:
                f40 f40Var = (f40) obj;
                f40Var.Q2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f40Var.U1(true);
                f40Var.p1.invalidate();
                f40Var.L1.invalidate();
                break;
            case 13:
                q30 q30Var = (q30) obj;
                q30Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q30Var.a.invalidate();
                break;
            case 14:
                t30 t30Var = (t30) obj;
                t30Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f40 f40Var2 = t30Var.L;
                f40Var2.L1.invalidate();
                f40Var2.Z3.invalidate();
                f40Var2.b.invalidate();
                f40.Q0(f40Var2);
                break;
            case 15:
                ((qa0) obj).glassEngine.g();
                break;
            case 16:
                hh0 hh0Var = (hh0) obj;
                hh0Var.getClass();
                hh0Var.f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                hh0Var.invalidate();
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
                PhotoViewer photoViewer = ((xp0) obj).d;
                photoViewer.U1.l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.U1.invalidate();
                break;
            case 19:
                PhotoViewer photoViewer2 = ((xp0) obj).d;
                photoViewer2.U1.l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.U1.invalidate();
                break;
            case 20:
                ((PhotoViewer) ((org.telegram.ui.Components.cl0) obj).b).U1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 21:
                PhotoViewer photoViewer3 = ((aq0) obj).r;
                photoViewer3.m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.D1();
                break;
            case 22:
                pq0 pq0Var = (pq0) obj;
                pq0Var.getClass();
                pq0Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 23:
                fr0 fr0Var = (fr0) obj;
                fr0Var.getClass();
                fr0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fr0Var.e();
                break;
            case 24:
                ((su0) obj).G.a.invalidate();
                break;
            case 25:
                ProfileActivity profileActivity = ((vv0) obj).y2;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.s5();
                break;
            case 26:
                mw0 mw0Var = (mw0) obj;
                float[] fArr = mw0Var.n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                mw0Var.G = animatedFraction;
                mw0Var.e(true, org.telegram.messenger.g0.U1(animatedFraction, fArr));
                break;
            case 27:
                ow0 ow0Var = (ow0) obj;
                float U12 = org.telegram.messenger.g0.U1(valueAnimator.getAnimatedFraction(), ow0Var.e);
                ProfileActivity profileActivity2 = ow0Var.n;
                org.telegram.ui.ActionBar.g5 g5Var = profileActivity2.U0;
                if (g5Var != null && !profileActivity2.q2) {
                    float f13 = 1.0f - U12;
                    g5Var.setScaleX(f13);
                    profileActivity2.U0.setScaleY(f13);
                    profileActivity2.U0.setAlpha(f13);
                }
                ow0Var.setScaleX(U12);
                ow0Var.setScaleY(U12);
                ow0Var.setAlpha(U12);
                break;
            case 28:
                nx0 nx0Var = (nx0) obj;
                nx0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nx0Var.b();
                break;
            default:
                yx0 yx0Var = (yx0) obj;
                yx0Var.E = org.telegram.messenger.g0.U1(valueAnimator.getAnimatedFraction(), yx0Var.F);
                yx0Var.h.setTextColor(i0.a.f(yx0Var.E, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.z6, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.q6, false)));
                break;
        }
    }
}
