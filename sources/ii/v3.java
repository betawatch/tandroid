package ii;

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
import org.telegram.messenger.ti;
import org.telegram.messenger.yt;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Cells.l7;
import org.telegram.ui.Cells.n7;
import org.telegram.ui.Cells.q5;
import org.telegram.ui.Cells.s5;
import org.telegram.ui.Components.dg0;
import org.telegram.ui.Components.m51;
import org.telegram.ui.f8;
import org.telegram.ui.i8;
import org.telegram.ui.s4;
import org.telegram.ui.s9;
import org.telegram.ui.v4;
import org.telegram.ui.v5;
import org.telegram.ui.wv0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v3(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.N = null;
                actionBarOverlayLayout.w = false;
                break;
            case 28:
                l7 l7Var = (l7) this.b;
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
                ((d4) this.b).J.setVisibility(8);
                break;
            case 1:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.N = null;
                actionBarOverlayLayout.w = false;
                break;
            case 2:
                super.onAnimationEnd(animator);
                mg.g gVar = (mg.g) this.b;
                if (!gVar.j1) {
                    gVar.v0 = false;
                    gVar.u0.setVisibility(8);
                    gVar.invalidate();
                }
                gVar.g0 = false;
                break;
            case 3:
                ti tiVar = (ti) this.b;
                tiVar.j = false;
                tiVar.i = false;
                break;
            case 4:
                ((og.e) this.b).h.setVisibility(8);
                break;
            case 5:
                HashMap hashMap = org.telegram.messenger.g0.l0;
                if (hashMap != null) {
                    hashMap.remove((Window) this.b);
                    break;
                }
                break;
            case 6:
                m51 m51Var = ((MediaController) this.b).j0;
                if (m51Var != null) {
                    m51Var.g0();
                    break;
                }
                break;
            case 7:
                try {
                    ((m51) this.b).m0();
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 8:
                super.onAnimationEnd(animator);
                ((yt) this.b).w = null;
                break;
            case 9:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
                actionBarPopupWindow$ActionBarPopupWindowLayout.n = false;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i3 = 0; i3 < itemsCount; i3++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i3);
                    if (!(childAt instanceof org.telegram.ui.ActionBar.c1)) {
                        childAt.setTranslationY(0.0f);
                        childAt.setAlpha(childAt.isEnabled() ? 1.0f : 0.5f);
                    }
                }
                break;
            case 10:
                org.telegram.ui.ActionBar.h1 h1Var = (org.telegram.ui.ActionBar.h1) this.b;
                if (!h1Var.e) {
                    h1Var.j();
                    break;
                }
                break;
            case 11:
                org.telegram.ui.ActionBar.b3 b3Var = (org.telegram.ui.ActionBar.b3) this.b;
                if (b3Var.G == animator) {
                    b3Var.H = b3Var.I;
                    Iterator it = b3Var.J.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    break;
                }
                break;
            case 12:
                org.telegram.ui.ActionBar.j3 j3Var = (org.telegram.ui.ActionBar.j3) this.b;
                org.telegram.ui.ActionBar.b3 b3Var2 = j3Var.a;
                if (b3Var2 != null) {
                    b3Var2.b = true;
                    b3Var2.invalidate();
                }
                j3Var.W = j3Var.V ? 1.0f : 0.0f;
                j3Var.invalidate();
                if (!j3Var.V) {
                    j3Var.S.clear();
                    break;
                }
                break;
            case 13:
                super.onAnimationEnd(animator);
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 14:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.b;
                Runnable runnable2 = i4Var.b0;
                if (runnable2 != null) {
                    runnable2.run();
                    i4Var.b0 = null;
                    break;
                }
                break;
            case 15:
                org.telegram.ui.u3 u3Var = (org.telegram.ui.u3) this.b;
                u3Var.x = 1.0f;
                u3Var.A();
                u3Var.u();
                u3Var.r();
                u3Var.a.e();
                break;
            case 16:
                s4 s4Var = (s4) this.b;
                s4Var.getClass();
                s4Var.setVisibility(8);
                break;
            case 17:
                v4 v4Var = (v4) this.b;
                v4Var.c = false;
                v4Var.invalidate();
                break;
            case 18:
                ((v5) this.b).i0.setVisibility(8);
                break;
            case 19:
            default:
                super.onAnimationEnd(animator);
                break;
            case 20:
                ((s9) this.b).w = null;
                break;
            case 21:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.b;
                ((wv0) jVar).f0.e.c.r = false;
                FrameLayout frameLayout = jVar.K;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.L);
                    break;
                }
                break;
            case 22:
                org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) this.b;
                Button button = vVar.n;
                dg0 dg0Var = vVar.f;
                if (button == dg0Var) {
                    vVar.e.setVisibility(4);
                    break;
                } else {
                    dg0Var.setVisibility(4);
                    break;
                }
            case 23:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.c0) this.b).x = null;
                break;
            case 24:
                ((org.telegram.ui.Cells.h4) this.b).H = null;
                break;
            case 25:
                q5 q5Var = (q5) this.b;
                if (animator.equals(q5Var.n)) {
                    q5Var.n = null;
                    break;
                }
                break;
            case 26:
                mi.b0 b0Var = (mi.b0) this.b;
                if (animator.equals(((s5) b0Var.b).d)) {
                    ((s5) b0Var.b).d = null;
                    break;
                }
                break;
            case 27:
                org.telegram.messenger.g0.i3(((s5) this.b).e, 1000L);
                break;
            case 28:
                l7 l7Var = (l7) this.b;
                AnimatorSet animatorSet = l7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    l7Var.h = null;
                    break;
                }
                break;
            case 29:
                n7 n7Var = (n7) this.b;
                n7Var.n.N0 = true;
                n7Var.invalidate();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 16:
                ((s4) this.b).setVisibility(0);
                break;
            case 19:
                i8 i8Var = (i8) this.b;
                for (int i3 = 0; i3 < i8Var.b.getChildCount(); i3++) {
                    f8.a((f8) i8Var.b.getChildAt(i3), i8Var.Q, i8Var.R);
                }
                break;
            case 21:
                ((wv0) ((org.telegram.ui.Cells.j) this.b)).f0.e.c.r = true;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
