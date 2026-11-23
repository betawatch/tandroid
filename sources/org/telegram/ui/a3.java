package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                j8 j8Var = (j8) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i11 = 0; i11 < j8Var.b.getChildCount(); i11++) {
                    g8.b((g8) j8Var.b.getChildAt(i11), floatValue2);
                }
                break;
            case 3:
                ad adVar = (ad) obj;
                adVar.b.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                adVar.b.invalidateSelf();
                break;
            case 4:
                ((org.telegram.ui.Components.jr) obj).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
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
                xw xwVar = (xw) obj;
                xwVar.getClass();
                xwVar.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 10:
                dz dzVar = (dz) obj;
                dzVar.getClass();
                dzVar.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dzVar.invalidate();
                break;
            case 11:
                e00 e00Var = (e00) obj;
                e00Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = e00Var.c;
                imageView.setAlpha(floatValue3);
                float f10 = (floatValue3 * 0.5f) + 0.5f;
                imageView.setScaleX(f10);
                imageView.setScaleY(f10);
                View view = e00Var.f;
                float f11 = 1.0f - floatValue3;
                view.setAlpha(f11);
                float f12 = (f11 * 0.5f) + 0.5f;
                view.setScaleX(f12);
                view.setScaleY(f12);
                break;
            case 12:
                e40 e40Var = (e40) obj;
                e40Var.Q2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e40Var.T1(true);
                e40Var.p1.invalidate();
                e40Var.L1.invalidate();
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
                e40Var2.L1.invalidate();
                e40Var2.Z3.invalidate();
                e40Var2.b.invalidate();
                e40.Q0(e40Var2);
                break;
            case 15:
                ((pa0) obj).glassEngine.g();
                break;
            case 16:
                fh0 fh0Var = (fh0) obj;
                fh0Var.getClass();
                fh0Var.f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                fh0Var.invalidate();
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
                ((ru0) obj).G.a.invalidate();
                break;
            case 25:
                ProfileActivity profileActivity = ((uv0) obj).y2;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.s5();
                break;
            case 26:
                kw0 kw0Var = (kw0) obj;
                float[] fArr = kw0Var.n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                kw0Var.G = animatedFraction;
                kw0Var.e(true, org.telegram.messenger.g0.U1(animatedFraction, fArr));
                break;
            case 27:
                mw0 mw0Var = (mw0) obj;
                float U12 = org.telegram.messenger.g0.U1(valueAnimator.getAnimatedFraction(), mw0Var.e);
                ProfileActivity profileActivity2 = mw0Var.n;
                org.telegram.ui.ActionBar.g5 g5Var = profileActivity2.U0;
                if (g5Var != null && !profileActivity2.q2) {
                    float f13 = 1.0f - U12;
                    g5Var.setScaleX(f13);
                    profileActivity2.U0.setScaleY(f13);
                    profileActivity2.U0.setAlpha(f13);
                }
                mw0Var.setScaleX(U12);
                mw0Var.setScaleY(U12);
                mw0Var.setAlpha(U12);
                break;
            case 28:
                lx0 lx0Var = (lx0) obj;
                lx0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lx0Var.b();
                break;
            default:
                wx0 wx0Var = (wx0) obj;
                wx0Var.E = org.telegram.messenger.g0.U1(valueAnimator.getAnimatedFraction(), wx0Var.F);
                wx0Var.h.setTextColor(i0.a.f(wx0Var.E, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.z6, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.q6, false)));
                break;
        }
    }
}
