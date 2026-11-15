package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import di.ab;
import di.bb;
import di.r4;
import di.s4;
import fi.h4;
import fi.v6;
import fi.w6;
import fi.x3;
import fi.z7;
import hi.d3;
import hi.j5;
import hi.j8;
import hi.k6;
import hi.l3;
import hi.l8;
import hi.q5;
import ki.x2;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.sl;
import org.telegram.ui.vv0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class i0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        sl slVar;
        boolean z10;
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                m0 m0Var = (m0) obj;
                if (m0Var.E0 <= 0.0f && (slVar = m0Var.D0) != null && m0Var.F0 == animator) {
                    slVar.q0(m0Var.G0);
                    m0Var.D0 = null;
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
                ((ch.o) obj).w.setVisibility(4);
                break;
            case 4:
                ch.r rVar = (ch.r) obj;
                rVar.setVisibility(8);
                ch.q qVar = rVar.b;
                if (qVar != null) {
                    rVar.removeView(qVar);
                    rVar.b = null;
                }
                rVar.e = null;
                break;
            case 5:
                ((ch.i0) obj).y.c();
                break;
            case 6:
                s4 s4Var = (s4) obj;
                s4Var.F = 1.0f;
                s4Var.G = -1;
                r4 r4Var = s4Var.I;
                if (r4Var != null && (z10 = r4Var.l) && z10) {
                    r4Var.l = false;
                    r4Var.b();
                }
                s4Var.H = null;
                break;
            case 7:
                ab abVar = ((bb) obj).c;
                abVar.setScaleX(1.0f);
                abVar.setScaleY(1.0f);
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
                fi.n0 n0Var = (fi.n0) obj;
                fi.s0 s0Var = n0Var.L;
                if (s0Var != null && n0Var.J == s0Var.a) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    n0Var.K = ofFloat;
                    ofFloat.addUpdateListener(new ah.h(this, 17));
                    n0Var.K.setStartDelay(3000L);
                    n0Var.K.setDuration(550L);
                    n0Var.K.setInterpolator(new LinearInterpolator());
                    n0Var.K.start();
                    break;
                }
                break;
            case 11:
                fi.k2 k2Var = (fi.k2) obj;
                k2Var.S6.invalidate();
                k2Var.setAnimatedTop(0);
                k2Var.S6.F2 = true;
                View view = k2Var.o2;
                if (view != null && view.getVisibility() == 0) {
                    k2Var.o2.setTranslationY(((1.0f - k2Var.getTopViewEnterProgress()) * k2Var.o2.getLayoutParams().height) + k2Var.B2);
                }
                k2Var.S6.O1 = null;
                break;
            case 12:
                x3 x3Var = (x3) obj;
                x3Var.c[1].setVisibility(8);
                x3Var.c[0].setAlpha(1.0f);
                x3Var.c[0].setTranslationY(0.0f);
                break;
            case 13:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                vv0 vv0Var = profileStoriesView.h;
                profileStoriesView.H = 1.0f;
                vv0Var.S = 1.0f;
                vv0Var.invalidate();
                profileStoriesView.invalidate();
                break;
            case 14:
                ((h4) obj).N = null;
                break;
            case 15:
                fi.s4 s4Var2 = (fi.s4) obj;
                s4Var2.x = null;
                s4Var2.r = 1.0f;
                s4Var2.invalidate();
                break;
            case 16:
            default:
                super.onAnimationEnd(animator);
                break;
            case 17:
                z7 z7Var = (z7) obj;
                z7Var.I = false;
                z7Var.H = 0.0f;
                z7Var.invalidate();
                z7Var.requestLayout();
                z7Var.K.requestLayout();
                break;
            case 18:
                hi.m mVar = ((hi.g) obj).d0;
                if (mVar.g0 == animator) {
                    mVar.g0 = null;
                    mVar.f.getEditText().setScrollY(mVar.c0);
                    break;
                }
                break;
            case 19:
                hi.d0 d0Var = (hi.d0) obj;
                d0Var.l = 1.0f;
                hi.e0 e0Var = d0Var.p;
                if (e0Var.n.contains(d0Var)) {
                    d0Var.c.R();
                    hi.c0 c0Var = d0Var.d;
                    if (c0Var != null) {
                        c0Var.pause();
                        d0Var.d.release(null);
                        d0Var.d = null;
                    }
                    TextureView textureView = d0Var.e;
                    if (textureView != null) {
                        org.telegram.messenger.g0.E2(textureView);
                        d0Var.e = null;
                    }
                    d0Var.f = false;
                    e0Var.n.remove(d0Var);
                }
                e0Var.invalidate();
                break;
            case 20:
                d3 d3Var = (d3) ((hi.s2) obj).c;
                d3Var.G.setVisibility(8);
                d3Var.d.setVisibility(8);
                break;
            case 21:
                l3 l3Var = (l3) obj;
                l3Var.A0 = 1.0f;
                l3Var.invalidate();
                break;
            case 22:
                org.telegram.messenger.g0.E2((mi0) obj);
                break;
            case 23:
                super.onAnimationEnd(animator);
                j5 j5Var = (j5) obj;
                ImageView imageView = j5Var.c;
                j5Var.c = j5Var.d;
                j5Var.d = imageView;
                imageView.bringToFront();
                j5Var.d.setVisibility(8);
                j5Var.h = null;
                break;
            case 24:
                super.onAnimationEnd(animator);
                ((q5) obj).x = null;
                break;
            case 25:
                k6 k6Var = (k6) obj;
                if (k6Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) k6Var.getParent()).removeView(k6Var);
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
                ki.w wVar = (ki.w) obj;
                wVar.setVisibility(8);
                wVar.a = null;
                break;
            case 29:
                ((x2) obj).F.setVisibility(8);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 16:
                super.onAnimationStart(animator);
                w6 w6Var = (w6) this.b;
                ch0 ch0Var = ((v6) w6Var.a.get(w6Var.d)).c;
                ch0Var.M = 2;
                ch0Var.start();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
