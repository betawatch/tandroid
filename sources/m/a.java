package m;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.cj;
import org.telegram.messenger.gu;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Cells.h4;
import org.telegram.ui.Cells.m7;
import org.telegram.ui.Cells.o7;
import org.telegram.ui.Cells.q5;
import org.telegram.ui.Cells.s5;
import org.telegram.ui.Cells.x9;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.bg0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.e8;
import org.telegram.ui.g4;
import org.telegram.ui.gw0;
import org.telegram.ui.h8;
import org.telegram.ui.q4;
import org.telegram.ui.s9;
import org.telegram.ui.t4;
import org.telegram.ui.t5;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class a extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.w = false;
                break;
            case 27:
                m7 m7Var = (m7) this.b;
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
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.w = false;
                break;
            case 1:
                cj cjVar = (cj) this.b;
                cjVar.j = false;
                cjVar.i = false;
                break;
            case 2:
                ((ng.e) this.b).h.setVisibility(8);
                break;
            case 3:
                ((CropAreaView) this.b).c0 = null;
                break;
            case 4:
                HashMap hashMap = org.telegram.messenger.g0.l0;
                if (hashMap != null) {
                    hashMap.remove((Window) this.b);
                    break;
                }
                break;
            case 5:
                u51 u51Var = ((MediaController) this.b).i0;
                if (u51Var != null) {
                    u51Var.g0();
                    break;
                }
                break;
            case 6:
                try {
                    ((u51) this.b).m0();
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 7:
                super.onAnimationEnd(animator);
                ((gu) this.b).w = null;
                break;
            case 8:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
                actionBarPopupWindow$ActionBarPopupWindowLayout.n = false;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i7 = 0; i7 < itemsCount; i7++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i7);
                    if (!(childAt instanceof org.telegram.ui.ActionBar.d1)) {
                        childAt.setTranslationY(0.0f);
                        childAt.setAlpha(childAt.isEnabled() ? 1.0f : 0.5f);
                    }
                }
                break;
            case 9:
                org.telegram.ui.ActionBar.i1 i1Var = (org.telegram.ui.ActionBar.i1) this.b;
                if (!i1Var.e) {
                    i1Var.j();
                    break;
                }
                break;
            case 10:
                org.telegram.ui.ActionBar.d3 d3Var = (org.telegram.ui.ActionBar.d3) this.b;
                if (d3Var.F == animator) {
                    d3Var.G = d3Var.H;
                    Iterator it = d3Var.I.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    break;
                }
                break;
            case 11:
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) this.b;
                org.telegram.ui.ActionBar.d3 d3Var2 = k3Var.a;
                if (d3Var2 != null) {
                    d3Var2.b = true;
                    d3Var2.invalidate();
                }
                k3Var.V = k3Var.U ? 1.0f : 0.0f;
                k3Var.invalidate();
                if (!k3Var.U) {
                    k3Var.R.clear();
                    break;
                }
                break;
            case 12:
                super.onAnimationEnd(animator);
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 13:
                g4 g4Var = (g4) this.b;
                Runnable runnable2 = g4Var.a0;
                if (runnable2 != null) {
                    runnable2.run();
                    g4Var.a0 = null;
                    break;
                }
                break;
            case 14:
                org.telegram.ui.t3 t3Var = (org.telegram.ui.t3) this.b;
                t3Var.x = 1.0f;
                t3Var.A();
                t3Var.u();
                t3Var.r();
                t3Var.a.e();
                break;
            case 15:
                q4 q4Var = (q4) this.b;
                q4Var.getClass();
                q4Var.setVisibility(8);
                break;
            case 16:
                t4 t4Var = (t4) this.b;
                t4Var.c = false;
                t4Var.invalidate();
                break;
            case 17:
                ((t5) this.b).h0.setVisibility(8);
                break;
            case 18:
            default:
                super.onAnimationEnd(animator);
                break;
            case 19:
                ((s9) this.b).w = null;
                break;
            case 20:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.b;
                ((gw0) jVar).e0.e.c.r = false;
                FrameLayout frameLayout = jVar.J;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                    break;
                }
                break;
            case 21:
                org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) this.b;
                Button button = vVar.n;
                bg0 bg0Var = vVar.f;
                if (button == bg0Var) {
                    vVar.e.setVisibility(4);
                    break;
                } else {
                    bg0Var.setVisibility(4);
                    break;
                }
            case 22:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.c0) this.b).x = null;
                break;
            case 23:
                ((h4) this.b).G = null;
                break;
            case 24:
                q5 q5Var = (q5) this.b;
                if (animator.equals(q5Var.n)) {
                    q5Var.n = null;
                    break;
                }
                break;
            case 25:
                f3 f3Var = (f3) this.b;
                if (animator.equals(((s5) f3Var.b).d)) {
                    ((s5) f3Var.b).d = null;
                    break;
                }
                break;
            case 26:
                org.telegram.messenger.g0.i3(((s5) this.b).e, 1000L);
                break;
            case 27:
                m7 m7Var = (m7) this.b;
                AnimatorSet animatorSet = m7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    m7Var.h = null;
                    break;
                }
                break;
            case 28:
                o7 o7Var = (o7) this.b;
                o7Var.n.N0 = true;
                o7Var.invalidate();
                break;
            case 29:
                super.onAnimationEnd(animator);
                org.telegram.ui.ActionBar.h1 h1Var = (org.telegram.ui.ActionBar.h1) this.b;
                ((y9) ((x9) h1Var.b).b).getTransitionParams().e();
                ((y9) ((x9) h1Var.b).b).getTransitionParams().h = false;
                ((y9) ((x9) h1Var.b).b).getTransitionParams().L1 = 1.0f;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 15:
                ((q4) this.b).setVisibility(0);
                break;
            case 18:
                h8 h8Var = (h8) this.b;
                for (int i7 = 0; i7 < h8Var.b.getChildCount(); i7++) {
                    e8.a((e8) h8Var.b.getChildAt(i7), h8Var.P, h8Var.Q);
                }
                break;
            case 20:
                ((gw0) ((org.telegram.ui.Cells.j) this.b)).e0.e.c.r = true;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
