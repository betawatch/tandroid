package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class bm extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bm(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                dq dqVar = (dq) this.b;
                dqVar.h.b(dqVar.D ? 1.0f : 0.0f);
                dqVar.h.invalidateSelf();
                break;
            case 17:
                ((org.telegram.ui.Components.rl) this.b).a.K = null;
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
                dm dmVar = (dm) this.b;
                em emVar = dmVar.b;
                ArrayList arrayList = emVar.M.j6;
                org.telegram.ui.Cells.s1 s1Var = dmVar.a;
                arrayList.remove(s1Var);
                View view = emVar.M.fragmentView;
                if (view != null) {
                    view.invalidate();
                    emVar.M.t0.invalidate();
                }
                s1Var.setAlpha(1.0f);
                s1Var.getTransitionParams().x0 = false;
                break;
            case 1:
                np npVar = (np) this.b;
                npVar.H = 0.0f;
                npVar.G = 1.0f;
                View view2 = npVar.W;
                if (view2 != null) {
                    view2.invalidate();
                }
                npVar.P.invalidate();
                ui uiVar = npVar.U;
                if (uiVar != null) {
                    uiVar.run();
                    npVar.U = null;
                    break;
                }
                break;
            case 2:
            default:
                super.onAnimationEnd(animator);
                break;
            case 3:
                pq pqVar = (pq) this.b;
                View view3 = pqVar.b;
                view3.setAlpha(1.0f);
                f2.w0.x0(view3);
                ((jr) pqVar.d).c.removeView(view3);
                break;
            case 4:
                org.telegram.ui.Components.g6 g6Var = (org.telegram.ui.Components.g6) this.b;
                g6Var.d = null;
                g6Var.b.clear();
                break;
            case 5:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.b;
                animatedPhoneNumberEditText.n = null;
                animatedPhoneNumberEditText.f.clear();
                break;
            case 6:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.n6 n6Var = (org.telegram.ui.Components.n6) this.b;
                n6Var.c();
                n6Var.k = null;
                n6Var.h = 0.0f;
                n6Var.m = 0.0f;
                n6Var.invalidateSelf();
                Runnable runnable = n6Var.V;
                if (runnable != null) {
                    runnable.run();
                }
                n6Var.o = null;
                CharSequence charSequence = n6Var.p;
                if (charSequence == null) {
                    org.telegram.ui.Components.ig igVar = n6Var.C;
                    if (igVar != null) {
                        igVar.run();
                        break;
                    }
                } else {
                    n6Var.q(charSequence, true, n6Var.q);
                    n6Var.p = null;
                    n6Var.q = false;
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Components.t9 t9Var = (org.telegram.ui.Components.t9) this.b;
                t9Var.setVisibility(8);
                t9Var.setImageDrawable(null);
                t9Var.setAlpha(1.0f);
                break;
            case 8:
                org.telegram.ui.Components.b9 b9Var = ((org.telegram.ui.Components.p8) this.b).b;
                b9Var.f = false;
                b9Var.e.setVisibility(8);
                break;
            case 9:
                org.telegram.ui.Components.g9 g9Var = (org.telegram.ui.Components.g9) this.b;
                if (g9Var.f != null) {
                    g9Var.e = 1.0f;
                    g9Var.n();
                    if (g9Var.g) {
                        g9Var.g = false;
                        Runnable runnable2 = g9Var.j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    g9Var.f();
                }
                g9Var.f = null;
                break;
            case 10:
                ((org.telegram.ui.Components.lf) this.b).f.U.setVisibility(8);
                break;
            case 11:
                ((org.telegram.ui.Components.og) this.b).W = 1.0f;
                break;
            case 12:
                ((org.telegram.ui.Components.vh) this.b).c.s.setVisibility(8);
                break;
            case 13:
                ((org.telegram.ui.Components.xh) this.b).d.v.setVisibility(8);
                break;
            case 14:
                org.telegram.ui.Components.ni niVar = (org.telegram.ui.Components.ni) this.b;
                niVar.V0 = null;
                if (!niVar.m1) {
                    if (niVar.T0.getTag() == null && niVar.M0 == 0 && !niVar.P0) {
                        niVar.W0.setVisibility(4);
                    }
                    niVar.e1.setVisibility(4);
                    break;
                } else {
                    org.telegram.ui.ActionBar.w0 w0Var = niVar.a1;
                    if (w0Var != null) {
                        w0Var.setVisibility(4);
                        break;
                    }
                }
                break;
            case 15:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.jk jkVar = (org.telegram.ui.Components.jk) this.b;
                jkVar.s.setVisibility(8);
                jkVar.n = 0;
                org.telegram.ui.Components.xj xjVar = jkVar.r;
                xjVar.setAlpha(1.0f);
                xjVar.setScaleX(1.0f);
                xjVar.setScaleY(1.0f);
                xjVar.setTranslationX(0.0f);
                xjVar.invalidate();
                break;
            case 16:
                org.telegram.ui.Components.ik ikVar = (org.telegram.ui.Components.ik) this.b;
                if (ikVar.T.D.getTag() == null) {
                    ikVar.T.D.setVisibility(4);
                }
                ikVar.T.E = null;
                break;
            case 17:
                org.telegram.ui.Components.rl rlVar = (org.telegram.ui.Components.rl) this.b;
                if (animator.equals(rlVar.a.K)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = rlVar.a;
                    chatAttachAlertPhotoLayout.V = true;
                    chatAttachAlertPhotoLayout.K = null;
                    break;
                }
                break;
            case 18:
                org.telegram.ui.Components.km kmVar = (org.telegram.ui.Components.km) this.b;
                org.telegram.ui.Components.lm lmVar = kmVar.L;
                lmVar.F = null;
                lmVar.G = false;
                kmVar.invalidate();
                break;
            case 19:
                org.telegram.ui.Components.gp gpVar = (org.telegram.ui.Components.gp) this.b;
                nh.pa paVar = gpVar.N;
                if (paVar != null) {
                    if (paVar.getParent() != null) {
                        ((ViewGroup) gpVar.N.getParent()).removeView(gpVar.N);
                    }
                    gpVar.N = null;
                }
                gpVar.P = null;
                super.onAnimationEnd(animator);
                break;
            case 20:
                CheckBox checkBox = (CheckBox) this.b;
                if (animator.equals(checkBox.s)) {
                    checkBox.s = null;
                }
                if (!checkBox.x) {
                    checkBox.C = null;
                    break;
                }
                break;
            case 21:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.b;
                if (animator.equals(checkBoxBase.p)) {
                    checkBoxBase.p = null;
                }
                if (!checkBoxBase.q) {
                    checkBoxBase.C = null;
                    break;
                }
                break;
            case 22:
                org.telegram.ui.Components.gq gqVar = (org.telegram.ui.Components.gq) this.b;
                if (gqVar.G == gqVar.H) {
                    gqVar.C.setVisibility(4);
                }
                gqVar.y = null;
                break;
            case 23:
                org.telegram.ui.Components.pq pqVar2 = (org.telegram.ui.Components.pq) this.b;
                pqVar2.l = 1.0f;
                pqVar2.o = null;
                pqVar2.p = null;
                pqVar2.q = null;
                View view4 = pqVar2.H;
                if (view4 != null) {
                    if (pqVar2.h == 0 && pqVar2.G) {
                        view4.setVisibility(8);
                    }
                    pqVar2.H.invalidate();
                }
                pqVar2.c = -1;
                break;
            case 24:
                org.telegram.ui.Components.au auVar = (org.telegram.ui.Components.au) this.b;
                auVar.K = false;
                auVar.d.setTranslationY(0.0f);
                auVar.d.setAlpha(0.0f);
                auVar.c(0.0f);
                auVar.N = 0.0f;
                auVar.j();
                break;
            case 25:
                ((org.telegram.ui.Components.iu) this.b).a.K = false;
                break;
            case 26:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Components.av) this.b).d = null;
                break;
            case 27:
                ((org.telegram.ui.Components.fz) this.b).S = null;
                break;
            case 28:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Components.ny) this.b).n = null;
                break;
            case 29:
                ((org.telegram.ui.Components.d00) this.b).a();
                break;
        }
    }

    public bm(pq pqVar, f2.w0 w0Var) {
        this.a = 3;
        this.b = pqVar;
    }
}
