package ah;

import ai.ad;
import ai.bd;
import ai.w5;
import ai.x5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import ci.i5;
import ci.k7;
import ci.l4;
import ci.l7;
import ci.o1;
import ci.q8;
import ci.u2;
import ci.w4;
import ei.c6;
import ei.e7;
import ei.i9;
import ei.j6;
import ei.k9;
import ei.q3;
import ei.x3;
import ei.y2;
import gi.d3;
import gi.f4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.sz0;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class b extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((a1.f) obj).run();
                break;
            case 1:
                f0 f0Var = (f0) obj;
                f0Var.setVisibility(8);
                e0 e0Var = f0Var.b;
                if (e0Var != null) {
                    f0Var.removeView(e0Var);
                    f0Var.b = null;
                }
                f0Var.e = null;
                break;
            case 2:
                ((a1) obj).x.c();
                break;
            case 3:
                x5 x5Var = (x5) obj;
                x5Var.E = 1.0f;
                x5Var.F = -1;
                w5 w5Var = x5Var.H;
                if (w5Var != null && (z10 = w5Var.l) && z10) {
                    w5Var.l = false;
                    w5Var.b();
                }
                x5Var.G = null;
                break;
            case 4:
                ad adVar = ((bd) obj).c;
                adVar.setScaleX(1.0f);
                adVar.setScaleY(1.0f);
                break;
            case 5:
                ci.a aVar = (ci.a) obj;
                aVar.h = 1.0f;
                aVar.invalidate();
                break;
            case 6:
                super.onAnimationEnd(animator);
                ((ci.q) obj).O.p = false;
                break;
            case 7:
                ci.q0 q0Var = (ci.q0) obj;
                ci.v0 v0Var = q0Var.K;
                if (v0Var != null && q0Var.I == v0Var.a) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    q0Var.J = ofFloat;
                    ofFloat.addUpdateListener(new c0(this, 13));
                    q0Var.J.setStartDelay(3000L);
                    q0Var.J.setDuration(550L);
                    q0Var.J.setInterpolator(new LinearInterpolator());
                    q0Var.J.start();
                    break;
                }
                break;
            case 8:
                ((o1) obj).I = null;
                break;
            case 9:
                u2 u2Var = (u2) obj;
                u2Var.w5.invalidate();
                u2Var.setAnimatedTop(0);
                u2Var.w5.V2 = true;
                View view = u2Var.G1;
                if (view != null && view.getVisibility() == 0) {
                    u2Var.G1.setTranslationY(((1.0f - u2Var.getTopViewEnterProgress()) * u2Var.G1.getLayoutParams().height) + u2Var.T1);
                }
                u2Var.w5.e2 = null;
                break;
            case 10:
                l4 l4Var = (l4) obj;
                l4Var.c[1].setVisibility(8);
                l4Var.c[0].setAlpha(1.0f);
                l4Var.c[0].setTranslationY(0.0f);
                break;
            case 11:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                sz0 sz0Var = profileStoriesView.h;
                profileStoriesView.G = 1.0f;
                sz0Var.R = 1.0f;
                sz0Var.invalidate();
                profileStoriesView.invalidate();
                break;
            case 12:
                ((w4) obj).M = null;
                break;
            case 13:
                i5 i5Var = (i5) obj;
                i5Var.w = null;
                i5Var.r = 1.0f;
                i5Var.invalidate();
                break;
            case 14:
            default:
                super.onAnimationEnd(animator);
                break;
            case 15:
                q8 q8Var = (q8) obj;
                q8Var.H = false;
                q8Var.G = 0.0f;
                q8Var.invalidate();
                q8Var.requestLayout();
                q8Var.J.requestLayout();
                break;
            case 16:
                ei.m mVar = ((ei.g) obj).c0;
                if (mVar.g0 == animator) {
                    mVar.g0 = null;
                    mVar.f.getEditText().setScrollY(mVar.b0);
                    break;
                }
                break;
            case 17:
                ei.d0 d0Var = (ei.d0) obj;
                d0Var.l = 1.0f;
                ei.e0 e0Var2 = d0Var.p;
                if (e0Var2.n.contains(d0Var)) {
                    d0Var.c.onDetachedFromWindow();
                    ei.c0 c0Var = d0Var.d;
                    if (c0Var != null) {
                        c0Var.pause();
                        d0Var.d.release(null);
                        d0Var.d = null;
                    }
                    TextureView textureView = d0Var.e;
                    if (textureView != null) {
                        AndroidUtilities.removeFromParent(textureView);
                        d0Var.e = null;
                    }
                    d0Var.f = false;
                    e0Var2.n.remove(d0Var);
                }
                e0Var2.invalidate();
                break;
            case 18:
                q3 q3Var = ((y2) obj).s;
                q3Var.F.setVisibility(8);
                q3Var.d.setVisibility(8);
                break;
            case 19:
                x3 x3Var = (x3) obj;
                x3Var.o0 = 1.0f;
                x3Var.invalidate();
                break;
            case 20:
                super.onAnimationEnd(animator);
                c6 c6Var = (c6) obj;
                ImageView imageView = c6Var.c;
                c6Var.c = c6Var.d;
                c6Var.d = imageView;
                imageView.bringToFront();
                c6Var.d.setVisibility(8);
                c6Var.h = null;
                break;
            case 21:
                super.onAnimationEnd(animator);
                ((j6) obj).w = null;
                break;
            case 22:
                e7 e7Var = (e7) obj;
                if (e7Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) e7Var.getParent()).removeView(e7Var);
                    break;
                }
                break;
            case 23:
                ((k9) obj).N = false;
                break;
            case 24:
                i9 i9Var = (i9) obj;
                i9Var.setTranslationY(0.0f);
                i9Var.d = null;
                break;
            case 25:
                gi.x xVar = (gi.x) obj;
                xVar.setVisibility(8);
                xVar.a = null;
                break;
            case 26:
                ((d3) obj).E.setVisibility(8);
                break;
            case 27:
                ((f4) obj).I.setVisibility(8);
                break;
            case 28:
                super.onAnimationEnd(animator);
                jg.g gVar = (jg.g) obj;
                if (!gVar.i1) {
                    gVar.u0 = false;
                    gVar.t0.setVisibility(8);
                    gVar.invalidate();
                }
                gVar.f0 = false;
                break;
            case 29:
                ((lg.e) obj).h.setVisibility(8);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 14:
                super.onAnimationStart(animator);
                l7 l7Var = (l7) this.b;
                yj0 yj0Var = ((k7) l7Var.a.get(l7Var.d)).c;
                yj0Var.L = 2;
                yj0Var.start();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
