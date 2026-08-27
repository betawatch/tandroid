package lh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lh0;
import org.telegram.ui.Components.x30;
import org.telegram.ui.ck;
import org.telegram.ui.dm;
import org.telegram.ui.ni;
import org.telegram.ui.ql;
import org.telegram.ui.qz0;
import org.telegram.ui.wk;
import org.telegram.ui.xc;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class h9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h9(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.I = null;
                actionBarOverlayLayout.v = false;
                break;
            case 19:
                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) this.b;
                AnimatorSet animatorSet = l7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    l7Var.h = null;
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
                i9 i9Var = (i9) this.b;
                i9Var.setTranslationY(0.0f);
                i9Var.d = null;
                break;
            case 1:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.I = null;
                actionBarOverlayLayout.v = false;
                break;
            case 2:
                nh.w wVar = (nh.w) this.b;
                wVar.setVisibility(8);
                wVar.a = null;
                break;
            case 3:
                ((nh.b3) this.b).y.setVisibility(8);
                break;
            case 4:
                ((nh.e4) this.b).E.setVisibility(8);
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
                ((org.telegram.ui.t9) this.b).s = null;
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
                org.telegram.ui.Cells.w wVar2 = (org.telegram.ui.Cells.w) this.b;
                Button button = wVar2.n;
                lh0 lh0Var = wVar2.f;
                if (button != lh0Var) {
                    lh0Var.setVisibility(4);
                    break;
                } else {
                    wVar2.e.setVisibility(4);
                    break;
                }
            case 14:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.e0) this.b).x = null;
                break;
            case 15:
                ((org.telegram.ui.Cells.d4) this.b).C = null;
                break;
            case 16:
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) this.b;
                if (animator.equals(q5Var.n)) {
                    q5Var.n = null;
                    break;
                }
                break;
            case 17:
                m.i3 i3Var = (m.i3) this.b;
                if (animator.equals(((org.telegram.ui.Cells.s5) i3Var.b).d)) {
                    ((org.telegram.ui.Cells.s5) i3Var.b).d = null;
                    break;
                }
                break;
            case 18:
                AndroidUtilities.runOnUIThread(((org.telegram.ui.Cells.s5) this.b).e, 1000L);
                break;
            case 19:
                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) this.b;
                AnimatorSet animatorSet = l7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    l7Var.h = null;
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) this.b;
                o7Var.n.isMediaSpoilersRevealedInSharedMedia = true;
                o7Var.invalidate();
                break;
            case 21:
                super.onAnimationEnd(animator);
                org.telegram.ui.Cells.y9 y9Var = (org.telegram.ui.Cells.y9) this.b;
                ((org.telegram.ui.Cells.z9) y9Var.b).a.getTransitionParams().j();
                ((org.telegram.ui.Cells.z9) y9Var.b).a.getTransitionParams().g = false;
                ((org.telegram.ui.Cells.z9) y9Var.b).a.getTransitionParams().K1 = 1.0f;
                break;
            case 22:
                org.telegram.ui.m3 m3Var = (org.telegram.ui.m3) this.b;
                if (animator.equals(((org.telegram.ui.qb) m3Var.b).R)) {
                    ((org.telegram.ui.qb) m3Var.b).R = null;
                    break;
                }
                break;
            case 23:
                org.telegram.ui.qb qbVar = (org.telegram.ui.qb) this.b;
                if (animator.equals(qbVar.R)) {
                    qbVar.R = null;
                    break;
                }
                break;
            case 24:
                ((org.telegram.ui.yb) this.b).E.setVisibility(8);
                break;
            case 25:
                xc xcVar = (xc) this.b;
                org.telegram.ui.hc hcVar = xcVar.i0;
                if (hcVar != null) {
                    if (hcVar.getParent() != null) {
                        ((ViewGroup) xcVar.i0.getParent()).removeView(xcVar.i0);
                    }
                    xcVar.i0 = null;
                }
                xcVar.k0 = null;
                super.onAnimationEnd(animator);
                break;
            case 26:
                ck ckVar = (ck) this.b;
                ckVar.setAnimatedTop(0);
                View view = ckVar.B1;
                if (view != null && view.getVisibility() == 0) {
                    ckVar.B1.setTranslationY(((1.0f - ckVar.getTopViewEnterProgress()) * ckVar.B1.getLayoutParams().height) + ckVar.O1);
                }
                ckVar.m5.l9 = null;
                break;
            case 27:
                x30 x30Var = ((ni) this.b).b.a2;
                if (x30Var != null) {
                    x30Var.setVisibility(8);
                    break;
                }
                break;
            case 28:
                ql qlVar = (ql) this.b;
                if (qlVar.a) {
                    qlVar.d.setTranslationY(0.0f);
                }
                if (qlVar.b) {
                    qlVar.e.setTranslationY(0.0f);
                }
                if (qlVar.f) {
                    qlVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.n9 n9Var = qlVar.c;
                if (n9Var != null) {
                    n9Var.setTranslationY(0.0f);
                }
                qlVar.n.D2[1] = null;
                break;
            case 29:
                dh.f fVar = (dh.f) ((ag.x1) this.b).c;
                wk wkVar = ((dm) fVar.c).M.X2;
                if (wkVar != null) {
                    wkVar.setIsMessageTransition(false);
                    ((dm) fVar.c).M.X2.h(true);
                    ((dm) fVar.c).M.X2.setVisibility(4);
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
                org.telegram.ui.h8 h8Var = (org.telegram.ui.h8) this.b;
                for (int i10 = 0; i10 < h8Var.b.getChildCount(); i10++) {
                    org.telegram.ui.e8.a((org.telegram.ui.e8) h8Var.b.getChildAt(i10), h8Var.L, h8Var.M);
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
