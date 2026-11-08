package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.wv0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class t5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t5(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        boolean z9;
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                w5 w5Var = (w5) obj;
                w5Var.E = 1.0f;
                w5Var.F = -1;
                v5 v5Var = w5Var.H;
                if (v5Var != null && (z9 = v5Var.l) && z9) {
                    v5Var.l = false;
                    v5Var.b();
                }
                w5Var.G = null;
                break;
            case 1:
                rc rcVar = ((sc) obj).c;
                rcVar.setScaleX(1.0f);
                rcVar.setScaleY(1.0f);
                break;
            case 2:
                ((a4) obj).run();
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
                ((ch.h0) obj).y.c();
                break;
            case 6:
                di.a aVar = (di.a) obj;
                aVar.h = 1.0f;
                aVar.invalidate();
                break;
            case 7:
                super.onAnimationEnd(animator);
                ((di.p) obj).O.p = false;
                break;
            case 8:
                di.n0 n0Var = (di.n0) obj;
                di.s0 s0Var = n0Var.K;
                if (s0Var != null && n0Var.I == s0Var.a) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    n0Var.J = ofFloat;
                    ofFloat.addUpdateListener(new ah.h(this, 16));
                    n0Var.J.setStartDelay(3000L);
                    n0Var.J.setDuration(550L);
                    n0Var.J.setInterpolator(new LinearInterpolator());
                    n0Var.J.start();
                    break;
                }
                break;
            case 9:
                di.o2 o2Var = (di.o2) obj;
                o2Var.x5.invalidate();
                o2Var.setAnimatedTop(0);
                o2Var.x5.E2 = true;
                View view = o2Var.G1;
                if (view != null && view.getVisibility() == 0) {
                    o2Var.G1.setTranslationY(((1.0f - o2Var.getTopViewEnterProgress()) * o2Var.G1.getLayoutParams().height) + o2Var.T1);
                }
                o2Var.x5.N1 = null;
                break;
            case 10:
                di.e4 e4Var = (di.e4) obj;
                e4Var.c[1].setVisibility(8);
                e4Var.c[0].setAlpha(1.0f);
                e4Var.c[0].setTranslationY(0.0f);
                break;
            case 11:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                wv0 wv0Var = profileStoriesView.h;
                profileStoriesView.G = 1.0f;
                wv0Var.R = 1.0f;
                wv0Var.invalidate();
                profileStoriesView.invalidate();
                break;
            case 12:
                ((di.o4) obj).M = null;
                break;
            case 13:
                di.a5 a5Var = (di.a5) obj;
                a5Var.x = null;
                a5Var.r = 1.0f;
                a5Var.invalidate();
                break;
            case 14:
            default:
                super.onAnimationEnd(animator);
                break;
            case 15:
                di.g8 g8Var = (di.g8) obj;
                g8Var.H = false;
                g8Var.G = 0.0f;
                g8Var.invalidate();
                g8Var.requestLayout();
                g8Var.J.requestLayout();
                break;
            case 16:
                fi.m mVar = ((fi.g) obj).c0;
                if (mVar.f0 == animator) {
                    mVar.f0 = null;
                    mVar.f.getEditText().setScrollY(mVar.b0);
                    break;
                }
                break;
            case 17:
                fi.d0 d0Var = (fi.d0) obj;
                d0Var.l = 1.0f;
                fi.e0 e0Var = d0Var.p;
                if (e0Var.n.contains(d0Var)) {
                    d0Var.c.R();
                    fi.c0 c0Var = d0Var.d;
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
            case 18:
                fi.f3 f3Var = (fi.f3) ((fi.u2) obj).c;
                f3Var.F.setVisibility(8);
                f3Var.d.setVisibility(8);
                break;
            case 19:
                fi.m3 m3Var = (fi.m3) obj;
                m3Var.z0 = 1.0f;
                m3Var.invalidate();
                break;
            case 20:
                org.telegram.messenger.g0.E2((ii0) obj);
                break;
            case 21:
                super.onAnimationEnd(animator);
                fi.l5 l5Var = (fi.l5) obj;
                ImageView imageView = l5Var.c;
                l5Var.c = l5Var.d;
                l5Var.d = imageView;
                imageView.bringToFront();
                l5Var.d.setVisibility(8);
                l5Var.h = null;
                break;
            case 22:
                super.onAnimationEnd(animator);
                ((fi.r5) obj).x = null;
                break;
            case 23:
                fi.l6 l6Var = (fi.l6) obj;
                if (l6Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) l6Var.getParent()).removeView(l6Var);
                    break;
                }
                break;
            case 24:
                ((fi.n8) obj).N = false;
                break;
            case 25:
                fi.l8 l8Var = (fi.l8) obj;
                l8Var.setTranslationY(0.0f);
                l8Var.d = null;
                break;
            case 26:
                hi.u uVar = (hi.u) obj;
                uVar.setVisibility(8);
                uVar.a = null;
                break;
            case 27:
                ((hi.a3) obj).E.setVisibility(8);
                break;
            case 28:
                ((hi.c4) obj).I.setVisibility(8);
                break;
            case 29:
                super.onAnimationEnd(animator);
                lg.g gVar = (lg.g) obj;
                if (!gVar.i1) {
                    gVar.u0 = false;
                    gVar.t0.setVisibility(8);
                    gVar.invalidate();
                }
                gVar.f0 = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 14:
                super.onAnimationStart(animator);
                di.c7 c7Var = (di.c7) this.b;
                zg0 zg0Var = ((di.b7) c7Var.a.get(c7Var.d)).c;
                zg0Var.L = 2;
                zg0Var.start();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
