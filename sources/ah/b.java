package ah;

import ai.ad;
import ai.w5;
import ai.x5;
import ai.zc;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import ci.j5;
import ci.l7;
import ci.m4;
import ci.m7;
import ci.p1;
import ci.r8;
import ci.v2;
import ci.x4;
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
import org.telegram.ui.Components.vj0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.oz0;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
                zc zcVar = ((ad) obj).c;
                zcVar.setScaleX(1.0f);
                zcVar.setScaleY(1.0f);
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
                ((p1) obj).I = null;
                break;
            case 9:
                v2 v2Var = (v2) obj;
                v2Var.s5.invalidate();
                v2Var.setAnimatedTop(0);
                v2Var.s5.V2 = true;
                View view = v2Var.G1;
                if (view != null && view.getVisibility() == 0) {
                    v2Var.G1.setTranslationY(((1.0f - v2Var.getTopViewEnterProgress()) * v2Var.G1.getLayoutParams().height) + v2Var.T1);
                }
                v2Var.s5.e2 = null;
                break;
            case 10:
                m4 m4Var = (m4) obj;
                m4Var.c[1].setVisibility(8);
                m4Var.c[0].setAlpha(1.0f);
                m4Var.c[0].setTranslationY(0.0f);
                break;
            case 11:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                oz0 oz0Var = profileStoriesView.h;
                profileStoriesView.G = 1.0f;
                oz0Var.R = 1.0f;
                oz0Var.invalidate();
                profileStoriesView.invalidate();
                break;
            case 12:
                ((x4) obj).M = null;
                break;
            case 13:
                j5 j5Var = (j5) obj;
                j5Var.w = null;
                j5Var.r = 1.0f;
                j5Var.invalidate();
                break;
            case 14:
            default:
                super.onAnimationEnd(animator);
                break;
            case 15:
                r8 r8Var = (r8) obj;
                r8Var.H = false;
                r8Var.G = 0.0f;
                r8Var.invalidate();
                r8Var.requestLayout();
                r8Var.J.requestLayout();
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
                ((d3) obj).y.setVisibility(8);
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
                m7 m7Var = (m7) this.b;
                vj0 vj0Var = ((l7) m7Var.a.get(m7Var.d)).c;
                vj0Var.L = 2;
                vj0Var.start();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
