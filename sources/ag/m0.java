package ag;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.TextureView;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import bg.r2;
import cg.v2;
import cg.w2;
import java.util.Iterator;
import jh.w9;
import jh.x9;
import jh.y3;
import jh.z3;
import lh.i4;
import lh.s4;
import lh.v6;
import lh.w6;
import lh.z7;
import nh.n3;
import nh.t3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.iz0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class m0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 25:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.I = null;
                actionBarOverlayLayout.v = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                n0 n0Var = (n0) obj;
                n0Var.a.getPainting().c(null, n0Var.a.getCurrentColor(), true, null);
                n0Var.r = null;
                break;
            case 1:
                super.onAnimationEnd(animator);
                bg.e1 e1Var = (bg.e1) obj;
                ImageView imageView = e1Var.c;
                e1Var.c = e1Var.d;
                e1Var.d = imageView;
                imageView.bringToFront();
                e1Var.d.setVisibility(8);
                e1Var.h = null;
                break;
            case 2:
                r2 r2Var = (r2) obj;
                if (animator == r2Var.r) {
                    r2Var.f = r2Var.h;
                    r2Var.h = -1;
                    r2Var.r = null;
                    break;
                }
                break;
            case 3:
                cg.d1 d1Var = (cg.d1) obj;
                d1Var.n = d1Var.h ? 1.0f : 0.0f;
                d1Var.e();
                break;
            case 4:
                w2 w2Var = (w2) ((v2) obj).b;
                w2Var.B = true;
                w2Var.invalidate();
                break;
            case 5:
                super.onAnimationEnd(animator);
                dg.i iVar = (dg.i) ((dg.e) obj).b;
                iVar.b.d = 0.0f;
                iVar.P = null;
                iVar.h(iVar.E);
                break;
            case 6:
                eg.b bVar = (eg.b) obj;
                bVar.b = 1.0f;
                bVar.invalidate();
                break;
            case 7:
                gh.k kVar = (gh.k) obj;
                Iterator it = kVar.h.iterator();
                while (it.hasNext()) {
                    gh.e eVar = (gh.e) it.next();
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
                ((ih.s0) obj).b.w.setVisibility(8);
                break;
            case 9:
                z3 z3Var = (z3) obj;
                z3Var.A = 1.0f;
                z3Var.B = -1;
                y3 y3Var = z3Var.D;
                if (y3Var != null && (z10 = y3Var.l) && z10) {
                    y3Var.l = false;
                    y3Var.b();
                }
                z3Var.C = null;
                break;
            case 10:
                w9 w9Var = ((x9) obj).c;
                w9Var.setScaleX(1.0f);
                w9Var.setScaleY(1.0f);
                break;
            case 11:
                ((jh.w2) obj).run();
                break;
            case 12:
                kg.v vVar = (kg.v) obj;
                vVar.setVisibility(8);
                kg.u uVar = vVar.b;
                if (uVar != null) {
                    vVar.removeView(uVar);
                    vVar.b = null;
                }
                vVar.e = null;
                break;
            case 13:
                ((kg.j0) obj).x.c();
                break;
            case 14:
                lh.a aVar = (lh.a) obj;
                aVar.h = 1.0f;
                aVar.invalidate();
                break;
            case 15:
                super.onAnimationEnd(animator);
                ((lh.o) obj).K.p = false;
                break;
            case 16:
                lh.n0 n0Var2 = (lh.n0) obj;
                lh.s0 s0Var = n0Var2.G;
                if (s0Var != null && n0Var2.E == s0Var.a) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    n0Var2.F = ofFloat;
                    ofFloat.addUpdateListener(new bg.q1(this, 24));
                    n0Var2.F.setStartDelay(3000L);
                    n0Var2.F.setDuration(550L);
                    n0Var2.F.setInterpolator(new LinearInterpolator());
                    n0Var2.F.start();
                    break;
                }
                break;
            case 17:
                ((lh.i1) obj).E = null;
                break;
            case 18:
                lh.n2 n2Var = (lh.n2) obj;
                n2Var.n5.invalidate();
                n2Var.setAnimatedTop(0);
                n2Var.n5.R2 = true;
                View view = n2Var.B1;
                if (view != null && view.getVisibility() == 0) {
                    n2Var.B1.setTranslationY(((1.0f - n2Var.getTopViewEnterProgress()) * n2Var.B1.getLayoutParams().height) + n2Var.O1);
                }
                n2Var.n5.a2 = null;
                break;
            case 19:
                lh.z3 z3Var2 = (lh.z3) obj;
                z3Var2.c[1].setVisibility(8);
                z3Var2.c[0].setAlpha(1.0f);
                z3Var2.c[0].setTranslationY(0.0f);
                break;
            case 20:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                iz0 iz0Var = profileStoriesView.h;
                profileStoriesView.C = 1.0f;
                iz0Var.N = 1.0f;
                iz0Var.invalidate();
                profileStoriesView.invalidate();
                break;
            case 21:
                ((i4) obj).I = null;
                break;
            case 22:
                s4 s4Var = (s4) obj;
                s4Var.w = null;
                s4Var.r = 1.0f;
                s4Var.invalidate();
                break;
            case 23:
            default:
                super.onAnimationEnd(animator);
                break;
            case 24:
                z7 z7Var = (z7) obj;
                z7Var.D = false;
                z7Var.C = 0.0f;
                z7Var.invalidate();
                z7Var.requestLayout();
                z7Var.F.requestLayout();
                break;
            case 25:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.I = null;
                actionBarOverlayLayout.v = false;
                break;
            case 26:
                nh.m mVar = ((nh.g) obj).V;
                if (mVar.c0 == animator) {
                    mVar.c0 = null;
                    mVar.f.getEditText().setScrollY(mVar.U);
                    break;
                }
                break;
            case 27:
                nh.d0 d0Var = (nh.d0) obj;
                d0Var.l = 1.0f;
                nh.e0 e0Var = d0Var.p;
                if (e0Var.n.contains(d0Var)) {
                    d0Var.c.onDetachedFromWindow();
                    v2 v2Var = d0Var.d;
                    if (v2Var != null) {
                        v2Var.pause();
                        d0Var.d.release(null);
                        d0Var.d = null;
                    }
                    TextureView textureView = d0Var.e;
                    if (textureView != null) {
                        AndroidUtilities.removeFromParent(textureView);
                        d0Var.e = null;
                    }
                    d0Var.f = false;
                    e0Var.n.remove(d0Var);
                }
                e0Var.invalidate();
                break;
            case 28:
                n3 n3Var = ((nh.v2) obj).h;
                n3Var.B.setVisibility(8);
                n3Var.d.setVisibility(8);
                break;
            case 29:
                t3 t3Var = (t3) obj;
                t3Var.k0 = 1.0f;
                t3Var.invalidate();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 23:
                super.onAnimationStart(animator);
                w6 w6Var = (w6) this.b;
                xi0 xi0Var = ((v6) w6Var.a.get(w6Var.d)).c;
                xi0Var.I = 2;
                xi0Var.start();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
