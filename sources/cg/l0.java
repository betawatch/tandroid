package cg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import dg.o2;
import eg.t2;
import eg.u2;
import java.util.Iterator;
import lh.n2;
import lh.x3;
import lh.x9;
import lh.y3;
import lh.y9;
import nh.i4;
import nh.t4;
import nh.w6;
import nh.x6;
import nh.z3;
import nh.z7;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.l4;
import org.telegram.ui.tz0;
import org.telegram.ui.w4;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
            case 11:
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
                dg.c1 c1Var = (dg.c1) obj;
                ImageView imageView = c1Var.c;
                c1Var.c = c1Var.d;
                c1Var.d = imageView;
                imageView.bringToFront();
                c1Var.d.setVisibility(8);
                c1Var.h = null;
                break;
            case 2:
                o2 o2Var = (o2) obj;
                if (animator == o2Var.r) {
                    o2Var.f = o2Var.h;
                    o2Var.h = -1;
                    o2Var.r = null;
                    break;
                }
                break;
            case 3:
                eg.c1 c1Var2 = (eg.c1) obj;
                c1Var2.n = c1Var2.h ? 1.0f : 0.0f;
                c1Var2.e();
                break;
            case 4:
                u2 u2Var = (u2) ((t2) obj).b;
                u2Var.C = true;
                u2Var.invalidate();
                break;
            case 5:
                super.onAnimationEnd(animator);
                fg.i iVar = (fg.i) ((fg.e) obj).b;
                iVar.b.d = 0.0f;
                iVar.Q = null;
                iVar.h(iVar.F);
                break;
            case 6:
                gg.b bVar = (gg.b) obj;
                bVar.b = 1.0f;
                bVar.invalidate();
                break;
            case 7:
                ih.k kVar = (ih.k) obj;
                Iterator it = kVar.h.iterator();
                while (it.hasNext()) {
                    ih.e eVar = (ih.e) it.next();
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
                ((kh.r0) obj).b.w.setVisibility(8);
                break;
            case 9:
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
            case 10:
                x9 x9Var = ((y9) obj).c;
                x9Var.setScaleX(1.0f);
                x9Var.setScaleY(1.0f);
                break;
            case 11:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.J = null;
                actionBarOverlayLayout.v = false;
                break;
            case 12:
                ((n2) obj).run();
                break;
            case 13:
                mg.v vVar = (mg.v) obj;
                vVar.setVisibility(8);
                mg.u uVar = vVar.b;
                if (uVar != null) {
                    vVar.removeView(uVar);
                    vVar.b = null;
                }
                vVar.e = null;
                break;
            case 14:
                ((mg.j0) obj).x.c();
                break;
            case 15:
                nh.a aVar = (nh.a) obj;
                aVar.h = 1.0f;
                aVar.invalidate();
                break;
            case 16:
                super.onAnimationEnd(animator);
                ((nh.p) obj).L.p = false;
                break;
            case 17:
                nh.o0 o0Var = (nh.o0) obj;
                nh.t0 t0Var = o0Var.H;
                if (t0Var != null && o0Var.F == t0Var.a) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    o0Var.G = ofFloat;
                    ofFloat.addUpdateListener(new dg.o1(this, 24));
                    o0Var.G.setStartDelay(3000L);
                    o0Var.G.setDuration(550L);
                    o0Var.G.setInterpolator(new LinearInterpolator());
                    o0Var.G.start();
                    break;
                }
                break;
            case 18:
                ((nh.j1) obj).F = null;
                break;
            case 19:
                nh.o2 o2Var2 = (nh.o2) obj;
                o2Var2.o5.invalidate();
                o2Var2.setAnimatedTop(0);
                o2Var2.o5.S2 = true;
                View view = o2Var2.C1;
                if (view != null && view.getVisibility() == 0) {
                    o2Var2.C1.setTranslationY(((1.0f - o2Var2.getTopViewEnterProgress()) * o2Var2.C1.getLayoutParams().height) + o2Var2.P1);
                }
                o2Var2.o5.b2 = null;
                break;
            case 20:
                z3 z3Var = (z3) obj;
                z3Var.c[1].setVisibility(8);
                z3Var.c[0].setAlpha(1.0f);
                z3Var.c[0].setTranslationY(0.0f);
                break;
            case 21:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                tz0 tz0Var = profileStoriesView.h;
                profileStoriesView.D = 1.0f;
                tz0Var.O = 1.0f;
                tz0Var.invalidate();
                profileStoriesView.invalidate();
                break;
            case 22:
                ((i4) obj).J = null;
                break;
            case 23:
                t4 t4Var = (t4) obj;
                t4Var.w = null;
                t4Var.r = 1.0f;
                t4Var.invalidate();
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
                org.telegram.ui.t4 t4Var2 = (org.telegram.ui.t4) obj;
                t4Var2.getClass();
                t4Var2.setVisibility(8);
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
                gj0 gj0Var = ((w6) x6Var.a.get(x6Var.d)).c;
                gj0Var.J = 2;
                gj0Var.start();
                break;
            case 28:
                ((org.telegram.ui.t4) this.b).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
