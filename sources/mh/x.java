package mh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.ca;
import org.telegram.ui.Cells.da;
import org.telegram.ui.Cells.o7;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Cells.t5;
import org.telegram.ui.Cells.v5;
import org.telegram.ui.Components.jh0;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.s30;
import org.telegram.ui.ak;
import org.telegram.ui.am;
import org.telegram.ui.bm;
import org.telegram.ui.d8;
import org.telegram.ui.g8;
import org.telegram.ui.gc;
import org.telegram.ui.kp;
import org.telegram.ui.li;
import org.telegram.ui.ol;
import org.telegram.ui.pb;
import org.telegram.ui.qz0;
import org.telegram.ui.ri;
import org.telegram.ui.s9;
import org.telegram.ui.t4;
import org.telegram.ui.u5;
import org.telegram.ui.uk;
import org.telegram.ui.xb;
import org.telegram.ui.xc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class x extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 17:
                o7 o7Var = (o7) this.b;
                AnimatorSet animatorSet = o7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    o7Var.h = null;
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
                y yVar = (y) this.b;
                yVar.setVisibility(8);
                yVar.a = null;
                break;
            case 1:
                ((c3) this.b).y.setVisibility(8);
                break;
            case 2:
                ((g4) this.b).E.setVisibility(8);
                break;
            case 3:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) this.b;
                Runnable runnable = l4Var.W;
                if (runnable != null) {
                    runnable.run();
                    l4Var.W = null;
                    break;
                }
                break;
            case 4:
                org.telegram.ui.y3 y3Var = (org.telegram.ui.y3) this.b;
                y3Var.w = 1.0f;
                y3Var.n();
                y3Var.i();
                y3Var.h();
                y3Var.a.unlock();
                break;
            case 5:
                org.telegram.ui.q4 q4Var = (org.telegram.ui.q4) this.b;
                q4Var.getClass();
                q4Var.setVisibility(8);
                break;
            case 6:
                t4 t4Var = (t4) this.b;
                t4Var.c = false;
                t4Var.invalidate();
                break;
            case 7:
                ((u5) this.b).b0.setVisibility(8);
                break;
            case 8:
            default:
                super.onAnimationEnd(animator);
                break;
            case 9:
                ((s9) this.b).s = null;
                break;
            case 10:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.b;
                ((qz0) jVar).V.e.c.r = false;
                FrameLayout frameLayout = jVar.F;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.G);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) this.b;
                Button button = wVar.n;
                jh0 jh0Var = wVar.f;
                if (button != jh0Var) {
                    jh0Var.setVisibility(4);
                    break;
                } else {
                    wVar.e.setVisibility(4);
                    break;
                }
            case 12:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.e0) this.b).x = null;
                break;
            case 13:
                ((org.telegram.ui.Cells.g4) this.b).C = null;
                break;
            case 14:
                t5 t5Var = (t5) this.b;
                if (animator.equals(t5Var.n)) {
                    t5Var.n = null;
                    break;
                }
                break;
            case 15:
                m.i3 i3Var = (m.i3) this.b;
                if (animator.equals(((v5) i3Var.b).d)) {
                    ((v5) i3Var.b).d = null;
                    break;
                }
                break;
            case 16:
                AndroidUtilities.runOnUIThread(((v5) this.b).e, 1000L);
                break;
            case 17:
                o7 o7Var = (o7) this.b;
                AnimatorSet animatorSet = o7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    o7Var.h = null;
                    break;
                }
                break;
            case 18:
                r7 r7Var = (r7) this.b;
                r7Var.n.isMediaSpoilersRevealedInSharedMedia = true;
                r7Var.invalidate();
                break;
            case 19:
                super.onAnimationEnd(animator);
                ca caVar = (ca) this.b;
                ((da) caVar.b).a.getTransitionParams().j();
                ((da) caVar.b).a.getTransitionParams().g = false;
                ((da) caVar.b).a.getTransitionParams().K1 = 1.0f;
                break;
            case 20:
                org.telegram.ui.l3 l3Var = (org.telegram.ui.l3) this.b;
                if (animator.equals(((pb) l3Var.b).R)) {
                    ((pb) l3Var.b).R = null;
                    break;
                }
                break;
            case 21:
                pb pbVar = (pb) this.b;
                if (animator.equals(pbVar.R)) {
                    pbVar.R = null;
                    break;
                }
                break;
            case 22:
                ((xb) this.b).E.setVisibility(8);
                break;
            case 23:
                xc xcVar = (xc) this.b;
                gc gcVar = xcVar.i0;
                if (gcVar != null) {
                    if (gcVar.getParent() != null) {
                        ((ViewGroup) xcVar.i0.getParent()).removeView(xcVar.i0);
                    }
                    xcVar.i0 = null;
                }
                xcVar.k0 = null;
                super.onAnimationEnd(animator);
                break;
            case 24:
                ak akVar = (ak) this.b;
                akVar.setAnimatedTop(0);
                View view = akVar.B1;
                if (view != null && view.getVisibility() == 0) {
                    akVar.B1.setTranslationY(((1.0f - akVar.getTopViewEnterProgress()) * akVar.B1.getLayoutParams().height) + akVar.O1);
                }
                akVar.m5.l9 = null;
                break;
            case 25:
                s30 s30Var = ((li) this.b).b.a2;
                if (s30Var != null) {
                    s30Var.setVisibility(8);
                    break;
                }
                break;
            case 26:
                ol olVar = (ol) this.b;
                if (olVar.a) {
                    olVar.d.setTranslationY(0.0f);
                }
                if (olVar.b) {
                    olVar.e.setTranslationY(0.0f);
                }
                if (olVar.f) {
                    olVar.h.setTranslationY(0.0f);
                }
                o9 o9Var = olVar.c;
                if (o9Var != null) {
                    o9Var.setTranslationY(0.0f);
                }
                olVar.n.D2[1] = null;
                break;
            case 27:
                ch.f fVar = (ch.f) ((fg.j) this.b).c;
                uk ukVar = ((bm) fVar.c).M.X2;
                if (ukVar != null) {
                    ukVar.setIsMessageTransition(false);
                    ((bm) fVar.c).M.X2.h(true);
                    ((bm) fVar.c).M.X2.setVisibility(4);
                    break;
                }
                break;
            case 28:
                am amVar = (am) this.b;
                bm bmVar = amVar.b;
                ArrayList arrayList = bmVar.M.j6;
                org.telegram.ui.Cells.t1 t1Var = amVar.a;
                arrayList.remove(t1Var);
                View view2 = bmVar.M.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    bmVar.M.t0.invalidate();
                }
                t1Var.setAlpha(1.0f);
                t1Var.getTransitionParams().x0 = false;
                break;
            case 29:
                kp kpVar = (kp) this.b;
                kpVar.H = 0.0f;
                kpVar.G = 1.0f;
                View view3 = kpVar.W;
                if (view3 != null) {
                    view3.invalidate();
                }
                kpVar.P.invalidate();
                ri riVar = kpVar.U;
                if (riVar != null) {
                    riVar.run();
                    kpVar.U = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 5:
                ((org.telegram.ui.q4) this.b).setVisibility(0);
                break;
            case 8:
                g8 g8Var = (g8) this.b;
                for (int i9 = 0; i9 < g8Var.b.getChildCount(); i9++) {
                    d8.a((d8) g8Var.b.getChildAt(i9), g8Var.L, g8Var.M);
                }
                break;
            case 10:
                ((qz0) ((org.telegram.ui.Cells.j) this.b)).V.e.c.r = true;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
