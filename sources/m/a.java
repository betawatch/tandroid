package m;

import ai.ne;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.da;
import org.telegram.ui.Cells.ea;
import org.telegram.ui.Cells.f4;
import org.telegram.ui.Cells.p7;
import org.telegram.ui.Cells.s5;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Cells.u5;
import org.telegram.ui.Cells.v5;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.r40;
import org.telegram.ui.Components.s60;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.a01;
import org.telegram.ui.bd;
import org.telegram.ui.cc;
import org.telegram.ui.dm;
import org.telegram.ui.dq;
import org.telegram.ui.em;
import org.telegram.ui.gk;
import org.telegram.ui.h8;
import org.telegram.ui.k4;
import org.telegram.ui.k8;
import org.telegram.ui.lc;
import org.telegram.ui.np;
import org.telegram.ui.oi;
import org.telegram.ui.th;
import org.telegram.ui.ti;
import org.telegram.ui.v4;
import org.telegram.ui.vb;
import org.telegram.ui.w3;
import org.telegram.ui.w9;
import org.telegram.ui.y4;
import org.telegram.ui.y5;
import org.telegram.ui.yl;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class a extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.v = false;
                break;
            case 16:
                p7 p7Var = (p7) this.b;
                AnimatorSet animatorSet = p7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    p7Var.h = null;
                    break;
                }
                break;
            case 29:
                dq dqVar = (dq) this.b;
                dqVar.h.b(dqVar.I ? 1.0f : 0.0f);
                dqVar.h.invalidateSelf();
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
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.v = false;
                break;
            case 1:
                ((CropAreaView) this.b).c0 = null;
                break;
            case 2:
                k4 k4Var = (k4) this.b;
                Runnable runnable = k4Var.a0;
                if (runnable != null) {
                    runnable.run();
                    k4Var.a0 = null;
                    break;
                }
                break;
            case 3:
                w3 w3Var = (w3) this.b;
                w3Var.w = 1.0f;
                w3Var.n();
                w3Var.i();
                w3Var.h();
                w3Var.a.unlock();
                break;
            case 4:
                v4 v4Var = (v4) this.b;
                v4Var.getClass();
                v4Var.setVisibility(8);
                break;
            case 5:
                y4 y4Var = (y4) this.b;
                y4Var.c = false;
                y4Var.invalidate();
                break;
            case 6:
                ((y5) this.b).h0.setVisibility(8);
                break;
            case 7:
            default:
                super.onAnimationEnd(animator);
                break;
            case 8:
                ((w9) this.b).v = null;
                break;
            case 9:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.b;
                ((a01) jVar).e0.e.c.r = false;
                FrameLayout frameLayout = jVar.J;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                    break;
                }
                break;
            case 10:
                org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) this.b;
                Button button = vVar.n;
                xi0 xi0Var = vVar.f;
                if (button != xi0Var) {
                    xi0Var.setVisibility(4);
                    break;
                } else {
                    vVar.e.setVisibility(4);
                    break;
                }
            case 11:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.d0) this.b).x = null;
                break;
            case 12:
                ((f4) this.b).G = null;
                break;
            case 13:
                s5 s5Var = (s5) this.b;
                if (animator.equals(s5Var.n)) {
                    s5Var.n = null;
                    break;
                }
                break;
            case 14:
                u5 u5Var = (u5) this.b;
                if (animator.equals(((v5) u5Var.b).d)) {
                    ((v5) u5Var.b).d = null;
                    break;
                }
                break;
            case 15:
                AndroidUtilities.runOnUIThread(((v5) this.b).e, 1000L);
                break;
            case 16:
                p7 p7Var = (p7) this.b;
                AnimatorSet animatorSet = p7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    p7Var.h = null;
                    break;
                }
                break;
            case 17:
                s7 s7Var = (s7) this.b;
                s7Var.n.isMediaSpoilersRevealedInSharedMedia = true;
                s7Var.invalidate();
                break;
            case 18:
                super.onAnimationEnd(animator);
                da daVar = (da) this.b;
                ((ea) daVar.b).a.getTransitionParams().j();
                ((ea) daVar.b).a.getTransitionParams().g = false;
                ((ea) daVar.b).a.getTransitionParams().K1 = 1.0f;
                break;
            case 19:
                org.telegram.ui.j3 j3Var = (org.telegram.ui.j3) this.b;
                if (animator.equals(((vb) j3Var.b).R)) {
                    ((vb) j3Var.b).R = null;
                    break;
                }
                break;
            case 20:
                vb vbVar = (vb) this.b;
                if (animator.equals(vbVar.R)) {
                    vbVar.R = null;
                    break;
                }
                break;
            case 21:
                ((cc) this.b).I.setVisibility(8);
                break;
            case 22:
                bd bdVar = (bd) this.b;
                lc lcVar = bdVar.m0;
                if (lcVar != null) {
                    if (lcVar.getParent() != null) {
                        ((ViewGroup) bdVar.m0.getParent()).removeView(bdVar.m0);
                    }
                    bdVar.m0 = null;
                }
                bdVar.o0 = null;
                super.onAnimationEnd(animator);
                break;
            case 23:
                th thVar = (th) this.b;
                if (thVar.a) {
                    thVar.d.setTranslationY(0.0f);
                }
                if (thVar.b) {
                    thVar.e.setTranslationY(0.0f);
                }
                if (thVar.f) {
                    thVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.w9 w9Var = thVar.c;
                if (w9Var != null) {
                    w9Var.setTranslationY(0.0f);
                }
                thVar.n.T2[1] = null;
                break;
            case 24:
                gk gkVar = (gk) this.b;
                gkVar.setAnimatedTop(0);
                View view = gkVar.G1;
                if (view != null && view.getVisibility() == 0) {
                    gkVar.G1.setTranslationY(((1.0f - gkVar.getTopViewEnterProgress()) * gkVar.G1.getLayoutParams().height) + gkVar.T1);
                }
                gkVar.v5.B9 = null;
                break;
            case 25:
                r40 r40Var = ((oi) this.b).b.q2;
                if (r40Var != null) {
                    r40Var.setVisibility(8);
                    break;
                }
                break;
            case 26:
                ne neVar = (ne) this.b;
                s60 s60Var = ((em) ((yl) neVar.c).c).Q.n3;
                if (s60Var != null) {
                    s60Var.setIsMessageTransition(false);
                    ((em) ((yl) neVar.c).c).Q.n3.c(true);
                    ((em) ((yl) neVar.c).c).Q.n3.setVisibility(4);
                    break;
                }
                break;
            case 27:
                dm dmVar = (dm) this.b;
                em emVar = dmVar.b;
                ArrayList arrayList = emVar.Q.z6;
                org.telegram.ui.Cells.t1 t1Var = dmVar.a;
                arrayList.remove(t1Var);
                View view2 = emVar.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    emVar.Q.x0.invalidate();
                }
                t1Var.setAlpha(1.0f);
                t1Var.getTransitionParams().x0 = false;
                break;
            case 28:
                np npVar = (np) this.b;
                npVar.L = 0.0f;
                npVar.K = 1.0f;
                View view3 = npVar.a0;
                if (view3 != null) {
                    view3.invalidate();
                }
                npVar.T.invalidate();
                ti tiVar = npVar.Y;
                if (tiVar != null) {
                    tiVar.run();
                    npVar.Y = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 4:
                ((v4) this.b).setVisibility(0);
                break;
            case 7:
                k8 k8Var = (k8) this.b;
                for (int i10 = 0; i10 < k8Var.b.getChildCount(); i10++) {
                    h8.a((h8) k8Var.b.getChildAt(i10), k8Var.P, k8Var.Q);
                }
                break;
            case 9:
                ((a01) ((org.telegram.ui.Cells.j) this.b)).e0.e.c.r = true;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
