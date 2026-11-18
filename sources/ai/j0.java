package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import di.db;
import di.eb;
import di.u4;
import di.v4;
import fi.f4;
import fi.q4;
import fi.s6;
import fi.t6;
import fi.v3;
import fi.w7;
import hi.e3;
import hi.i5;
import hi.j6;
import hi.j8;
import hi.l8;
import hi.m3;
import hi.o5;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.tl;
import org.telegram.ui.wv0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class j0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        tl tlVar;
        boolean z10;
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                n0 n0Var = (n0) obj;
                if (n0Var.F0 <= 0.0f && (tlVar = n0Var.E0) != null && n0Var.G0 == animator) {
                    tlVar.q0(n0Var.H0);
                    n0Var.E0 = null;
                    break;
                }
                break;
            case 1:
                ((bi.c1) obj).b.w1.setVisibility(8);
                break;
            case 2:
                ((c1.c) obj).run();
                break;
            case 3:
                ((ch.p) obj).w.setVisibility(4);
                break;
            case 4:
                ch.s sVar = (ch.s) obj;
                sVar.setVisibility(8);
                ch.r rVar = sVar.b;
                if (rVar != null) {
                    sVar.removeView(rVar);
                    sVar.b = null;
                }
                sVar.e = null;
                break;
            case 5:
                ((ch.i0) obj).y.c();
                break;
            case 6:
                v4 v4Var = (v4) obj;
                v4Var.F = 1.0f;
                v4Var.G = -1;
                u4 u4Var = v4Var.I;
                if (u4Var != null && (z10 = u4Var.l) && z10) {
                    u4Var.l = false;
                    u4Var.b();
                }
                v4Var.H = null;
                break;
            case 7:
                db dbVar = ((eb) obj).c;
                dbVar.setScaleX(1.0f);
                dbVar.setScaleY(1.0f);
                break;
            case 8:
                fi.a aVar = (fi.a) obj;
                aVar.h = 1.0f;
                aVar.invalidate();
                break;
            case 9:
                super.onAnimationEnd(animator);
                ((fi.p) obj).P.p = false;
                break;
            case 10:
                fi.m0 m0Var = (fi.m0) obj;
                fi.r0 r0Var = m0Var.L;
                if (r0Var != null && m0Var.J == r0Var.a) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    m0Var.K = ofFloat;
                    ofFloat.addUpdateListener(new ah.g(this, 17));
                    m0Var.K.setStartDelay(3000L);
                    m0Var.K.setDuration(550L);
                    m0Var.K.setInterpolator(new LinearInterpolator());
                    m0Var.K.start();
                    break;
                }
                break;
            case 11:
                fi.i2 i2Var = (fi.i2) obj;
                i2Var.s7.invalidate();
                i2Var.setAnimatedTop(0);
                i2Var.s7.F2 = true;
                View view = i2Var.u2;
                if (view != null && view.getVisibility() == 0) {
                    i2Var.u2.setTranslationY(((1.0f - i2Var.getTopViewEnterProgress()) * i2Var.u2.getLayoutParams().height) + i2Var.H2);
                }
                i2Var.s7.O1 = null;
                break;
            case 12:
                v3 v3Var = (v3) obj;
                v3Var.c[1].setVisibility(8);
                v3Var.c[0].setAlpha(1.0f);
                v3Var.c[0].setTranslationY(0.0f);
                break;
            case 13:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                wv0 wv0Var = profileStoriesView.h;
                profileStoriesView.H = 1.0f;
                wv0Var.S = 1.0f;
                wv0Var.invalidate();
                profileStoriesView.invalidate();
                break;
            case 14:
                ((f4) obj).N = null;
                break;
            case 15:
                q4 q4Var = (q4) obj;
                q4Var.x = null;
                q4Var.r = 1.0f;
                q4Var.invalidate();
                break;
            case 16:
            default:
                super.onAnimationEnd(animator);
                break;
            case 17:
                w7 w7Var = (w7) obj;
                w7Var.I = false;
                w7Var.H = 0.0f;
                w7Var.invalidate();
                w7Var.requestLayout();
                w7Var.K.requestLayout();
                break;
            case 18:
                hi.n nVar = ((hi.g) obj).d0;
                if (nVar.g0 == animator) {
                    nVar.g0 = null;
                    nVar.f.getEditText().setScrollY(nVar.c0);
                    break;
                }
                break;
            case 19:
                hi.e0 e0Var = (hi.e0) obj;
                e0Var.l = 1.0f;
                hi.f0 f0Var = e0Var.p;
                if (f0Var.n.contains(e0Var)) {
                    e0Var.c.R();
                    hi.d0 d0Var = e0Var.d;
                    if (d0Var != null) {
                        d0Var.pause();
                        e0Var.d.release(null);
                        e0Var.d = null;
                    }
                    TextureView textureView = e0Var.e;
                    if (textureView != null) {
                        org.telegram.messenger.g0.E2(textureView);
                        e0Var.e = null;
                    }
                    e0Var.f = false;
                    f0Var.n.remove(e0Var);
                }
                f0Var.invalidate();
                break;
            case 20:
                e3 e3Var = (e3) ((hi.t2) obj).c;
                e3Var.G.setVisibility(8);
                e3Var.d.setVisibility(8);
                break;
            case 21:
                m3 m3Var = (m3) obj;
                m3Var.A0 = 1.0f;
                m3Var.invalidate();
                break;
            case 22:
                org.telegram.messenger.g0.E2((vi0) obj);
                break;
            case 23:
                super.onAnimationEnd(animator);
                i5 i5Var = (i5) obj;
                ImageView imageView = i5Var.c;
                i5Var.c = i5Var.d;
                i5Var.d = imageView;
                imageView.bringToFront();
                i5Var.d.setVisibility(8);
                i5Var.h = null;
                break;
            case 24:
                super.onAnimationEnd(animator);
                ((o5) obj).x = null;
                break;
            case 25:
                j6 j6Var = (j6) obj;
                if (j6Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) j6Var.getParent()).removeView(j6Var);
                    break;
                }
                break;
            case 26:
                ((l8) obj).O = false;
                break;
            case 27:
                j8 j8Var = (j8) obj;
                j8Var.setTranslationY(0.0f);
                j8Var.d = null;
                break;
            case 28:
                ki.v vVar = (ki.v) obj;
                vVar.setVisibility(8);
                vVar.a = null;
                break;
            case 29:
                ((ki.t2) obj).F.setVisibility(8);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 16:
                super.onAnimationStart(animator);
                t6 t6Var = (t6) this.b;
                mh0 mh0Var = ((s6) t6Var.a.get(t6Var.d)).c;
                mh0Var.M = 2;
                mh0Var.start();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
