package dg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import eg.m2;
import fg.s2;
import fg.t2;
import java.util.Iterator;
import mh.x3;
import mh.x9;
import mh.y3;
import mh.y9;
import oh.b4;
import oh.k4;
import oh.p2;
import oh.u4;
import oh.w6;
import oh.x6;
import oh.z7;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.a01;
import org.telegram.ui.l4;
import org.telegram.ui.t4;
import org.telegram.ui.w4;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class l0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 9:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.J = null;
                actionBarOverlayLayout.v = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        boolean z4;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                m0 m0Var = (m0) obj;
                m0Var.a.getPainting().c(null, m0Var.a.getCurrentColor(), true, null);
                m0Var.r = null;
                break;
            case 1:
                super.onAnimationEnd(animator);
                eg.a1 a1Var = (eg.a1) obj;
                ImageView imageView = a1Var.c;
                a1Var.c = a1Var.d;
                a1Var.d = imageView;
                imageView.bringToFront();
                a1Var.d.setVisibility(8);
                a1Var.h = null;
                break;
            case 2:
                m2 m2Var = (m2) obj;
                if (animator == m2Var.r) {
                    m2Var.f = m2Var.h;
                    m2Var.h = -1;
                    m2Var.r = null;
                    break;
                }
                break;
            case 3:
                fg.b1 b1Var = (fg.b1) obj;
                b1Var.n = b1Var.h ? 1.0f : 0.0f;
                b1Var.e();
                break;
            case 4:
                t2 t2Var = (t2) ((s2) obj).b;
                t2Var.C = true;
                t2Var.invalidate();
                break;
            case 5:
                super.onAnimationEnd(animator);
                gg.i iVar = (gg.i) ((gg.e) obj).b;
                iVar.b.d = 0.0f;
                iVar.Q = null;
                iVar.h(iVar.F);
                break;
            case 6:
                hg.b bVar = (hg.b) obj;
                bVar.b = 1.0f;
                bVar.invalidate();
                break;
            case 7:
                jh.k kVar = (jh.k) obj;
                Iterator it = kVar.h.iterator();
                while (it.hasNext()) {
                    jh.e eVar = (jh.e) it.next();
                    if (kVar.c.size() < kVar.d) {
                        kVar.c.push(eVar);
                    }
                    it.remove();
                }
                Runnable runnable = kVar.q;
                if (runnable != null) {
                    runnable.run();
                    kVar.q = null;
                }
                kVar.r = null;
                kVar.invalidateSelf();
                break;
            case 8:
                ((lh.r0) obj).b.w.setVisibility(8);
                break;
            case 9:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.J = null;
                actionBarOverlayLayout.v = false;
                break;
            case 10:
                y3 y3Var = (y3) obj;
                y3Var.B = 1.0f;
                y3Var.C = -1;
                x3 x3Var = y3Var.E;
                if (x3Var != null && (z4 = x3Var.l) && z4) {
                    x3Var.l = false;
                    x3Var.b();
                }
                y3Var.D = null;
                break;
            case 11:
                x9 x9Var = ((y9) obj).c;
                x9Var.setScaleX(1.0f);
                x9Var.setScaleY(1.0f);
                break;
            case 12:
                ((mh.m2) obj).run();
                break;
            case 13:
                ng.v vVar = (ng.v) obj;
                vVar.setVisibility(8);
                ng.u uVar = vVar.b;
                if (uVar != null) {
                    vVar.removeView(uVar);
                    vVar.b = null;
                }
                vVar.e = null;
                break;
            case 14:
                ((ng.j0) obj).x.c();
                break;
            case 15:
                oh.a aVar = (oh.a) obj;
                aVar.h = 1.0f;
                aVar.invalidate();
                break;
            case 16:
                super.onAnimationEnd(animator);
                ((oh.o) obj).L.p = false;
                break;
            case 17:
                oh.o0 o0Var = (oh.o0) obj;
                oh.t0 t0Var = o0Var.H;
                if (t0Var != null && o0Var.F == t0Var.a) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    o0Var.G = ofFloat;
                    ofFloat.addUpdateListener(new eg.m1(this, 24));
                    o0Var.G.setStartDelay(3000L);
                    o0Var.G.setDuration(550L);
                    o0Var.G.setInterpolator(new LinearInterpolator());
                    o0Var.G.start();
                    break;
                }
                break;
            case 18:
                ((oh.j1) obj).F = null;
                break;
            case 19:
                p2 p2Var = (p2) obj;
                p2Var.o5.invalidate();
                p2Var.setAnimatedTop(0);
                p2Var.o5.S2 = true;
                View view = p2Var.C1;
                if (view != null && view.getVisibility() == 0) {
                    p2Var.C1.setTranslationY(((1.0f - p2Var.getTopViewEnterProgress()) * p2Var.C1.getLayoutParams().height) + p2Var.P1);
                }
                p2Var.o5.b2 = null;
                break;
            case 20:
                b4 b4Var = (b4) obj;
                b4Var.c[1].setVisibility(8);
                b4Var.c[0].setAlpha(1.0f);
                b4Var.c[0].setTranslationY(0.0f);
                break;
            case 21:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                a01 a01Var = profileStoriesView.h;
                profileStoriesView.D = 1.0f;
                a01Var.O = 1.0f;
                a01Var.invalidate();
                profileStoriesView.invalidate();
                break;
            case 22:
                ((k4) obj).J = null;
                break;
            case 23:
                u4 u4Var = (u4) obj;
                u4Var.w = null;
                u4Var.r = 1.0f;
                u4Var.invalidate();
                break;
            case 24:
            default:
                super.onAnimationEnd(animator);
                break;
            case 25:
                z7 z7Var = (z7) obj;
                z7Var.E = false;
                z7Var.D = 0.0f;
                z7Var.invalidate();
                z7Var.requestLayout();
                z7Var.G.requestLayout();
                break;
            case 26:
                l4 l4Var = (l4) obj;
                Runnable runnable2 = l4Var.X;
                if (runnable2 != null) {
                    runnable2.run();
                    l4Var.X = null;
                    break;
                }
                break;
            case 27:
                org.telegram.ui.y3 y3Var2 = (org.telegram.ui.y3) obj;
                y3Var2.w = 1.0f;
                y3Var2.n();
                y3Var2.i();
                y3Var2.h();
                y3Var2.a.unlock();
                break;
            case 28:
                t4 t4Var = (t4) obj;
                t4Var.getClass();
                t4Var.setVisibility(8);
                break;
            case 29:
                w4 w4Var = (w4) obj;
                w4Var.c = false;
                w4Var.invalidate();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 24:
                super.onAnimationStart(animator);
                x6 x6Var = (x6) this.b;
                hj0 hj0Var = ((w6) x6Var.a.get(x6Var.d)).c;
                hj0Var.J = 2;
                hj0Var.start();
                break;
            case 28:
                ((t4) this.b).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
