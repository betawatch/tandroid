package kg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import bi.ce;
import java.util.ArrayList;
import m.g3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.d0;
import org.telegram.ui.Cells.ha;
import org.telegram.ui.Cells.ia;
import org.telegram.ui.Cells.k4;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Cells.v;
import org.telegram.ui.Cells.w7;
import org.telegram.ui.Cells.z5;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.t40;
import org.telegram.ui.Components.u60;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.bd;
import org.telegram.ui.bm;
import org.telegram.ui.dc;
import org.telegram.ui.g01;
import org.telegram.ui.gm;
import org.telegram.ui.hm;
import org.telegram.ui.i3;
import org.telegram.ui.j4;
import org.telegram.ui.jk;
import org.telegram.ui.k8;
import org.telegram.ui.mc;
import org.telegram.ui.n8;
import org.telegram.ui.si;
import org.telegram.ui.u4;
import org.telegram.ui.v3;
import org.telegram.ui.wb;
import org.telegram.ui.x4;
import org.telegram.ui.x5;
import org.telegram.ui.xh;
import org.telegram.ui.y9;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class e extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.v = false;
                break;
            case 18:
                t7 t7Var = (t7) this.b;
                AnimatorSet animatorSet = t7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    t7Var.h = null;
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                h hVar = (h) this.b;
                if (!hVar.i1) {
                    hVar.u0 = false;
                    hVar.t0.setVisibility(8);
                    hVar.invalidate();
                }
                hVar.f0 = false;
                break;
            case 1:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.v = false;
                break;
            case 2:
                ((mg.e) this.b).h.setVisibility(8);
                break;
            case 3:
                ((CropAreaView) this.b).c0 = null;
                break;
            case 4:
                j4 j4Var = (j4) this.b;
                Runnable runnable = j4Var.a0;
                if (runnable != null) {
                    runnable.run();
                    j4Var.a0 = null;
                    break;
                }
                break;
            case 5:
                v3 v3Var = (v3) this.b;
                v3Var.w = 1.0f;
                v3Var.n();
                v3Var.i();
                v3Var.h();
                v3Var.a.unlock();
                break;
            case 6:
                u4 u4Var = (u4) this.b;
                u4Var.getClass();
                u4Var.setVisibility(8);
                break;
            case 7:
                x4 x4Var = (x4) this.b;
                x4Var.c = false;
                x4Var.invalidate();
                break;
            case 8:
                ((x5) this.b).h0.setVisibility(8);
                break;
            case 9:
            default:
                super.onAnimationEnd(animator);
                break;
            case 10:
                ((y9) this.b).v = null;
                break;
            case 11:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.b;
                ((g01) jVar).e0.e.c.r = false;
                FrameLayout frameLayout = jVar.J;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                    break;
                }
                break;
            case 12:
                v vVar = (v) this.b;
                Button button = vVar.n;
                xi0 xi0Var = vVar.f;
                if (button != xi0Var) {
                    xi0Var.setVisibility(4);
                    break;
                } else {
                    vVar.e.setVisibility(4);
                    break;
                }
            case 13:
                super.onAnimationEnd(animator);
                ((d0) this.b).x = null;
                break;
            case 14:
                ((k4) this.b).G = null;
                break;
            case 15:
                org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) this.b;
                if (animator.equals(x5Var.n)) {
                    x5Var.n = null;
                    break;
                }
                break;
            case 16:
                g3 g3Var = (g3) this.b;
                if (animator.equals(((z5) g3Var.b).d)) {
                    ((z5) g3Var.b).d = null;
                    break;
                }
                break;
            case 17:
                AndroidUtilities.runOnUIThread(((z5) this.b).e, 1000L);
                break;
            case 18:
                t7 t7Var = (t7) this.b;
                AnimatorSet animatorSet = t7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    t7Var.h = null;
                    break;
                }
                break;
            case 19:
                w7 w7Var = (w7) this.b;
                w7Var.n.isMediaSpoilersRevealedInSharedMedia = true;
                w7Var.invalidate();
                break;
            case 20:
                super.onAnimationEnd(animator);
                ha haVar = (ha) this.b;
                ((ia) haVar.b).a.getTransitionParams().j();
                ((ia) haVar.b).a.getTransitionParams().g = false;
                ((ia) haVar.b).a.getTransitionParams().K1 = 1.0f;
                break;
            case 21:
                i3 i3Var = (i3) this.b;
                if (animator.equals(((wb) i3Var.b).R)) {
                    ((wb) i3Var.b).R = null;
                    break;
                }
                break;
            case 22:
                wb wbVar = (wb) this.b;
                if (animator.equals(wbVar.R)) {
                    wbVar.R = null;
                    break;
                }
                break;
            case 23:
                ((dc) this.b).H.setVisibility(8);
                break;
            case 24:
                bd bdVar = (bd) this.b;
                mc mcVar = bdVar.m0;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) bdVar.m0.getParent()).removeView(bdVar.m0);
                    }
                    bdVar.m0 = null;
                }
                bdVar.o0 = null;
                super.onAnimationEnd(animator);
                break;
            case 25:
                xh xhVar = (xh) this.b;
                if (xhVar.a) {
                    xhVar.d.setTranslationY(0.0f);
                }
                if (xhVar.b) {
                    xhVar.e.setTranslationY(0.0f);
                }
                if (xhVar.f) {
                    xhVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.y9 y9Var = xhVar.c;
                if (y9Var != null) {
                    y9Var.setTranslationY(0.0f);
                }
                xhVar.n.T2[1] = null;
                break;
            case 26:
                jk jkVar = (jk) this.b;
                jkVar.setAnimatedTop(0);
                View view = jkVar.G1;
                if (view != null && view.getVisibility() == 0) {
                    jkVar.G1.setTranslationY(((1.0f - jkVar.getTopViewEnterProgress()) * jkVar.G1.getLayoutParams().height) + jkVar.T1);
                }
                jkVar.v5.F9 = null;
                break;
            case 27:
                t40 t40Var = ((si) this.b).b.q2;
                if (t40Var != null) {
                    t40Var.setVisibility(8);
                    break;
                }
                break;
            case 28:
                ce ceVar = (ce) this.b;
                u60 u60Var = ((hm) ((bm) ceVar.c).c).Q.n3;
                if (u60Var != null) {
                    u60Var.setIsMessageTransition(false);
                    ((hm) ((bm) ceVar.c).c).Q.n3.c(true);
                    ((hm) ((bm) ceVar.c).c).Q.n3.setVisibility(4);
                    break;
                }
                break;
            case 29:
                gm gmVar = (gm) this.b;
                hm hmVar = gmVar.b;
                ArrayList arrayList = hmVar.Q.D6;
                s1 s1Var = gmVar.a;
                arrayList.remove(s1Var);
                View view2 = hmVar.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    hmVar.Q.x0.invalidate();
                }
                s1Var.setAlpha(1.0f);
                s1Var.getTransitionParams().x0 = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 6:
                ((u4) this.b).setVisibility(0);
                break;
            case 9:
                n8 n8Var = (n8) this.b;
                for (int i10 = 0; i10 < n8Var.b.getChildCount(); i10++) {
                    k8.a((k8) n8Var.b.getChildAt(i10), n8Var.P, n8Var.Q);
                }
                break;
            case 11:
                ((g01) ((org.telegram.ui.Cells.j) this.b)).e0.e.c.r = true;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
