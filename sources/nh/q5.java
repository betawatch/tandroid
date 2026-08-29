package nh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g40;
import org.telegram.ui.Components.th0;
import org.telegram.ui.dk;
import org.telegram.ui.em;
import org.telegram.ui.fc;
import org.telegram.ui.oi;
import org.telegram.ui.qz0;
import org.telegram.ui.rl;
import org.telegram.ui.vc;
import org.telegram.ui.xk;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class q5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 19:
                org.telegram.ui.Cells.m7 m7Var = (org.telegram.ui.Cells.m7) this.b;
                AnimatorSet animatorSet = m7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    m7Var.h = null;
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
                r5 r5Var = (r5) this.b;
                ImageView imageView = r5Var.c;
                r5Var.c = r5Var.d;
                r5Var.d = imageView;
                imageView.bringToFront();
                r5Var.d.setVisibility(8);
                r5Var.h = null;
                break;
            case 1:
                super.onAnimationEnd(animator);
                ((v5) this.b).w = null;
                break;
            case 2:
                t6 t6Var = (t6) this.b;
                if (t6Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) t6Var.getParent()).removeView(t6Var);
                    break;
                }
                break;
            case 3:
                ((y8) this.b).J = false;
                break;
            case 4:
                w8 w8Var = (w8) this.b;
                w8Var.setTranslationY(0.0f);
                w8Var.d = null;
                break;
            case 5:
                org.telegram.ui.m4 m4Var = (org.telegram.ui.m4) this.b;
                Runnable runnable = m4Var.W;
                if (runnable != null) {
                    runnable.run();
                    m4Var.W = null;
                    break;
                }
                break;
            case 6:
                org.telegram.ui.z3 z3Var = (org.telegram.ui.z3) this.b;
                z3Var.w = 1.0f;
                z3Var.n();
                z3Var.i();
                z3Var.h();
                z3Var.a.unlock();
                break;
            case 7:
                org.telegram.ui.r4 r4Var = (org.telegram.ui.r4) this.b;
                r4Var.getClass();
                r4Var.setVisibility(8);
                break;
            case 8:
                org.telegram.ui.u4 u4Var = (org.telegram.ui.u4) this.b;
                u4Var.c = false;
                u4Var.invalidate();
                break;
            case 9:
                ((org.telegram.ui.v5) this.b).b0.setVisibility(8);
                break;
            case 10:
            default:
                super.onAnimationEnd(animator);
                break;
            case 11:
                ((org.telegram.ui.r9) this.b).s = null;
                break;
            case 12:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.b;
                ((qz0) jVar).V.e.c.r = false;
                FrameLayout frameLayout = jVar.F;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.G);
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) this.b;
                Button button = wVar.n;
                th0 th0Var = wVar.f;
                if (button != th0Var) {
                    th0Var.setVisibility(4);
                    break;
                } else {
                    wVar.e.setVisibility(4);
                    break;
                }
            case 14:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.e0) this.b).x = null;
                break;
            case 15:
                ((org.telegram.ui.Cells.e4) this.b).C = null;
                break;
            case 16:
                org.telegram.ui.Cells.r5 r5Var2 = (org.telegram.ui.Cells.r5) this.b;
                if (animator.equals(r5Var2.n)) {
                    r5Var2.n = null;
                    break;
                }
                break;
            case 17:
                lh.m7 m7Var = (lh.m7) this.b;
                if (animator.equals(((org.telegram.ui.Cells.t5) m7Var.b).d)) {
                    ((org.telegram.ui.Cells.t5) m7Var.b).d = null;
                    break;
                }
                break;
            case 18:
                AndroidUtilities.runOnUIThread(((org.telegram.ui.Cells.t5) this.b).e, 1000L);
                break;
            case 19:
                org.telegram.ui.Cells.m7 m7Var2 = (org.telegram.ui.Cells.m7) this.b;
                AnimatorSet animatorSet = m7Var2.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    m7Var2.h = null;
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) this.b;
                p7Var.n.isMediaSpoilersRevealedInSharedMedia = true;
                p7Var.invalidate();
                break;
            case 21:
                super.onAnimationEnd(animator);
                org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) this.b;
                ((org.telegram.ui.Cells.aa) z9Var.b).a.getTransitionParams().j();
                ((org.telegram.ui.Cells.aa) z9Var.b).a.getTransitionParams().g = false;
                ((org.telegram.ui.Cells.aa) z9Var.b).a.getTransitionParams().K1 = 1.0f;
                break;
            case 22:
                org.telegram.ui.m3 m3Var = (org.telegram.ui.m3) this.b;
                if (animator.equals(((org.telegram.ui.ob) m3Var.b).R)) {
                    ((org.telegram.ui.ob) m3Var.b).R = null;
                    break;
                }
                break;
            case 23:
                org.telegram.ui.ob obVar = (org.telegram.ui.ob) this.b;
                if (animator.equals(obVar.R)) {
                    obVar.R = null;
                    break;
                }
                break;
            case 24:
                ((org.telegram.ui.wb) this.b).E.setVisibility(8);
                break;
            case 25:
                vc vcVar = (vc) this.b;
                fc fcVar = vcVar.i0;
                if (fcVar != null) {
                    if (fcVar.getParent() != null) {
                        ((ViewGroup) vcVar.i0.getParent()).removeView(vcVar.i0);
                    }
                    vcVar.i0 = null;
                }
                vcVar.k0 = null;
                super.onAnimationEnd(animator);
                break;
            case 26:
                dk dkVar = (dk) this.b;
                dkVar.setAnimatedTop(0);
                View view = dkVar.B1;
                if (view != null && view.getVisibility() == 0) {
                    dkVar.B1.setTranslationY(((1.0f - dkVar.getTopViewEnterProgress()) * dkVar.B1.getLayoutParams().height) + dkVar.O1);
                }
                dkVar.m5.l9 = null;
                break;
            case 27:
                g40 g40Var = ((oi) this.b).b.a2;
                if (g40Var != null) {
                    g40Var.setVisibility(8);
                    break;
                }
                break;
            case 28:
                rl rlVar = (rl) this.b;
                if (rlVar.a) {
                    rlVar.d.setTranslationY(0.0f);
                }
                if (rlVar.b) {
                    rlVar.e.setTranslationY(0.0f);
                }
                if (rlVar.f) {
                    rlVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.t9 t9Var = rlVar.c;
                if (t9Var != null) {
                    t9Var.setTranslationY(0.0f);
                }
                rlVar.n.D2[1] = null;
                break;
            case 29:
                fh.f fVar = (fh.f) ((bg.c3) this.b).c;
                xk xkVar = ((em) fVar.c).M.X2;
                if (xkVar != null) {
                    xkVar.setIsMessageTransition(false);
                    ((em) fVar.c).M.X2.h(true);
                    ((em) fVar.c).M.X2.setVisibility(4);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 7:
                ((org.telegram.ui.r4) this.b).setVisibility(0);
                break;
            case 10:
                org.telegram.ui.f8 f8Var = (org.telegram.ui.f8) this.b;
                for (int i10 = 0; i10 < f8Var.b.getChildCount(); i10++) {
                    org.telegram.ui.c8.a((org.telegram.ui.c8) f8Var.b.getChildAt(i10), f8Var.L, f8Var.M);
                }
                break;
            case 12:
                ((qz0) ((org.telegram.ui.Cells.j) this.b)).V.e.c.r = true;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
