package m;

import ai.le;
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
import org.telegram.ui.Cells.ca;
import org.telegram.ui.Cells.da;
import org.telegram.ui.Cells.f4;
import org.telegram.ui.Cells.p7;
import org.telegram.ui.Cells.s5;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Cells.u5;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.r40;
import org.telegram.ui.Components.r60;
import org.telegram.ui.Components.ti0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.dd;
import org.telegram.ui.dq;
import org.telegram.ui.ec;
import org.telegram.ui.em;
import org.telegram.ui.fm;
import org.telegram.ui.h8;
import org.telegram.ui.hk;
import org.telegram.ui.k8;
import org.telegram.ui.l4;
import org.telegram.ui.nc;
import org.telegram.ui.np;
import org.telegram.ui.qi;
import org.telegram.ui.vh;
import org.telegram.ui.vi;
import org.telegram.ui.w4;
import org.telegram.ui.x3;
import org.telegram.ui.xb;
import org.telegram.ui.y9;
import org.telegram.ui.yz0;
import org.telegram.ui.z4;
import org.telegram.ui.z5;
import org.telegram.ui.zl;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
                dqVar.h.b(dqVar.H ? 1.0f : 0.0f);
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
                l4 l4Var = (l4) this.b;
                Runnable runnable = l4Var.a0;
                if (runnable != null) {
                    runnable.run();
                    l4Var.a0 = null;
                    break;
                }
                break;
            case 3:
                x3 x3Var = (x3) this.b;
                x3Var.w = 1.0f;
                x3Var.n();
                x3Var.i();
                x3Var.h();
                x3Var.a.unlock();
                break;
            case 4:
                w4 w4Var = (w4) this.b;
                w4Var.getClass();
                w4Var.setVisibility(8);
                break;
            case 5:
                z4 z4Var = (z4) this.b;
                z4Var.c = false;
                z4Var.invalidate();
                break;
            case 6:
                ((z5) this.b).f0.setVisibility(8);
                break;
            case 7:
            default:
                super.onAnimationEnd(animator);
                break;
            case 8:
                ((y9) this.b).w = null;
                break;
            case 9:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.b;
                ((yz0) jVar).c0.e.c.r = false;
                FrameLayout frameLayout = jVar.J;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                    break;
                }
                break;
            case 10:
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) this.b;
                Button button = wVar.n;
                ti0 ti0Var = wVar.f;
                if (button != ti0Var) {
                    ti0Var.setVisibility(4);
                    break;
                } else {
                    wVar.e.setVisibility(4);
                    break;
                }
            case 11:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.e0) this.b).x = null;
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
                androidx.activity.i iVar = (androidx.activity.i) this.b;
                if (animator.equals(((u5) iVar.b).d)) {
                    ((u5) iVar.b).d = null;
                    break;
                }
                break;
            case 15:
                AndroidUtilities.runOnUIThread(((u5) this.b).e, 1000L);
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
                ca caVar = (ca) this.b;
                ((da) caVar.b).a.getTransitionParams().j();
                ((da) caVar.b).a.getTransitionParams().g = false;
                ((da) caVar.b).a.getTransitionParams().K1 = 1.0f;
                break;
            case 19:
                org.telegram.ui.k3 k3Var = (org.telegram.ui.k3) this.b;
                if (animator.equals(((xb) k3Var.b).R)) {
                    ((xb) k3Var.b).R = null;
                    break;
                }
                break;
            case 20:
                xb xbVar = (xb) this.b;
                if (animator.equals(xbVar.R)) {
                    xbVar.R = null;
                    break;
                }
                break;
            case 21:
                ((ec) this.b).I.setVisibility(8);
                break;
            case 22:
                dd ddVar = (dd) this.b;
                nc ncVar = ddVar.m0;
                if (ncVar != null) {
                    if (ncVar.getParent() != null) {
                        ((ViewGroup) ddVar.m0.getParent()).removeView(ddVar.m0);
                    }
                    ddVar.m0 = null;
                }
                ddVar.o0 = null;
                super.onAnimationEnd(animator);
                break;
            case 23:
                vh vhVar = (vh) this.b;
                if (vhVar.a) {
                    vhVar.d.setTranslationY(0.0f);
                }
                if (vhVar.b) {
                    vhVar.e.setTranslationY(0.0f);
                }
                if (vhVar.f) {
                    vhVar.h.setTranslationY(0.0f);
                }
                w9 w9Var = vhVar.c;
                if (w9Var != null) {
                    w9Var.setTranslationY(0.0f);
                }
                vhVar.n.H2[1] = null;
                break;
            case 24:
                hk hkVar = (hk) this.b;
                hkVar.setAnimatedTop(0);
                View view = hkVar.G1;
                if (view != null && view.getVisibility() == 0) {
                    hkVar.G1.setTranslationY(((1.0f - hkVar.getTopViewEnterProgress()) * hkVar.G1.getLayoutParams().height) + hkVar.T1);
                }
                hkVar.r5.p9 = null;
                break;
            case 25:
                r40 r40Var = ((qi) this.b).b.e2;
                if (r40Var != null) {
                    r40Var.setVisibility(8);
                    break;
                }
                break;
            case 26:
                le leVar = (le) this.b;
                r60 r60Var = ((fm) ((zl) leVar.c).c).Q.b3;
                if (r60Var != null) {
                    r60Var.setIsMessageTransition(false);
                    ((fm) ((zl) leVar.c).c).Q.b3.c(true);
                    ((fm) ((zl) leVar.c).c).Q.b3.setVisibility(4);
                    break;
                }
                break;
            case 27:
                em emVar = (em) this.b;
                fm fmVar = emVar.b;
                ArrayList arrayList = fmVar.Q.n6;
                org.telegram.ui.Cells.u1 u1Var = emVar.a;
                arrayList.remove(u1Var);
                View view2 = fmVar.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    fmVar.Q.x0.invalidate();
                }
                u1Var.setAlpha(1.0f);
                u1Var.getTransitionParams().x0 = false;
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
                vi viVar = npVar.Y;
                if (viVar != null) {
                    viVar.run();
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
                ((w4) this.b).setVisibility(0);
                break;
            case 7:
                k8 k8Var = (k8) this.b;
                for (int i10 = 0; i10 < k8Var.b.getChildCount(); i10++) {
                    h8.a((h8) k8Var.b.getChildAt(i10), k8Var.P, k8Var.Q);
                }
                break;
            case 9:
                ((yz0) ((org.telegram.ui.Cells.j) this.b)).c0.e.c.r = true;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
