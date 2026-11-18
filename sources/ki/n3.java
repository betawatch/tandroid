package ki;

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
import org.telegram.messenger.au;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Cells.i4;
import org.telegram.ui.Cells.n7;
import org.telegram.ui.Cells.p7;
import org.telegram.ui.Cells.s5;
import org.telegram.ui.Cells.u5;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.ng0;
import org.telegram.ui.f8;
import org.telegram.ui.fw0;
import org.telegram.ui.g4;
import org.telegram.ui.i8;
import org.telegram.ui.q4;
import org.telegram.ui.t4;
import org.telegram.ui.t5;
import org.telegram.ui.t9;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class n3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n3(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.N = null;
                actionBarOverlayLayout.w = false;
                break;
            case 28:
                n7 n7Var = (n7) this.b;
                AnimatorSet animatorSet = n7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    n7Var.h = null;
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
                ((t3) this.b).J.setVisibility(8);
                break;
            case 1:
                super.onAnimationEnd(animator);
                lg.g gVar = (lg.g) this.b;
                if (!gVar.j1) {
                    gVar.v0 = false;
                    gVar.u0.setVisibility(8);
                    gVar.invalidate();
                }
                gVar.g0 = false;
                break;
            case 2:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.N = null;
                actionBarOverlayLayout.w = false;
                break;
            case 3:
                ((ng.e) this.b).h.setVisibility(8);
                break;
            case 4:
                ((CropAreaView) this.b).d0 = null;
                break;
            case 5:
                HashMap hashMap = org.telegram.messenger.g0.l0;
                if (hashMap != null) {
                    hashMap.remove((Window) this.b);
                    break;
                }
                break;
            case 6:
                f61 f61Var = ((MediaController) this.b).j0;
                if (f61Var != null) {
                    f61Var.g0();
                    break;
                }
                break;
            case 7:
                try {
                    ((f61) this.b).m0();
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 8:
                super.onAnimationEnd(animator);
                ((au) this.b).w = null;
                break;
            case 9:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
                actionBarPopupWindow$ActionBarPopupWindowLayout.n = false;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i7 = 0; i7 < itemsCount; i7++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i7);
                    if (!(childAt instanceof org.telegram.ui.ActionBar.e1)) {
                        childAt.setTranslationY(0.0f);
                        childAt.setAlpha(childAt.isEnabled() ? 1.0f : 0.5f);
                    }
                }
                break;
            case 10:
                org.telegram.ui.ActionBar.j1 j1Var = (org.telegram.ui.ActionBar.j1) this.b;
                if (!j1Var.e) {
                    j1Var.j();
                    break;
                }
                break;
            case 11:
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.b;
                if (g3Var.G == animator) {
                    g3Var.H = g3Var.I;
                    Iterator it = g3Var.J.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    break;
                }
                break;
            case 12:
                org.telegram.ui.ActionBar.n3 n3Var = (org.telegram.ui.ActionBar.n3) this.b;
                org.telegram.ui.ActionBar.g3 g3Var2 = n3Var.a;
                if (g3Var2 != null) {
                    g3Var2.b = true;
                    g3Var2.invalidate();
                }
                n3Var.W = n3Var.V ? 1.0f : 0.0f;
                n3Var.invalidate();
                if (!n3Var.V) {
                    n3Var.S.clear();
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
                g4 g4Var = (g4) this.b;
                Runnable runnable2 = g4Var.b0;
                if (runnable2 != null) {
                    runnable2.run();
                    g4Var.b0 = null;
                    break;
                }
                break;
            case 15:
                org.telegram.ui.t3 t3Var = (org.telegram.ui.t3) this.b;
                t3Var.x = 1.0f;
                t3Var.A();
                t3Var.u();
                t3Var.r();
                t3Var.a.e();
                break;
            case 16:
                q4 q4Var = (q4) this.b;
                q4Var.getClass();
                q4Var.setVisibility(8);
                break;
            case 17:
                t4 t4Var = (t4) this.b;
                t4Var.c = false;
                t4Var.invalidate();
                break;
            case 18:
                ((t5) this.b).i0.setVisibility(8);
                break;
            case 19:
            default:
                super.onAnimationEnd(animator);
                break;
            case 20:
                ((t9) this.b).w = null;
                break;
            case 21:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.b;
                ((fw0) jVar).f0.e.c.r = false;
                FrameLayout frameLayout = jVar.K;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.L);
                    break;
                }
                break;
            case 22:
                org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) this.b;
                Button button = vVar.n;
                ng0 ng0Var = vVar.f;
                if (button == ng0Var) {
                    vVar.e.setVisibility(4);
                    break;
                } else {
                    ng0Var.setVisibility(4);
                    break;
                }
            case 23:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.d0) this.b).x = null;
                break;
            case 24:
                ((i4) this.b).H = null;
                break;
            case 25:
                s5 s5Var = (s5) this.b;
                if (animator.equals(s5Var.n)) {
                    s5Var.n = null;
                    break;
                }
                break;
            case 26:
                j6.o oVar = (j6.o) this.b;
                if (animator.equals(((u5) oVar.b).d)) {
                    ((u5) oVar.b).d = null;
                    break;
                }
                break;
            case 27:
                org.telegram.messenger.g0.h3(((u5) this.b).e, 1000L);
                break;
            case 28:
                n7 n7Var = (n7) this.b;
                AnimatorSet animatorSet = n7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    n7Var.h = null;
                    break;
                }
                break;
            case 29:
                p7 p7Var = (p7) this.b;
                p7Var.n.P0 = true;
                p7Var.invalidate();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 16:
                ((q4) this.b).setVisibility(0);
                break;
            case 19:
                i8 i8Var = (i8) this.b;
                for (int i7 = 0; i7 < i8Var.b.getChildCount(); i7++) {
                    f8.a((f8) i8Var.b.getChildAt(i7), i8Var.Q, i8Var.R);
                }
                break;
            case 21:
                ((fw0) ((org.telegram.ui.Cells.j) this.b)).f0.e.c.r = true;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
