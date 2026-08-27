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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class am extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ am(Object obj, int i10) {
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
                ((org.telegram.ui.Components.jl) this.b).a.K = null;
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
                cm cmVar = (cm) this.b;
                dm dmVar = cmVar.b;
                ArrayList arrayList = dmVar.M.j6;
                org.telegram.ui.Cells.s1 s1Var = cmVar.a;
                arrayList.remove(s1Var);
                View view = dmVar.M.fragmentView;
                if (view != null) {
                    view.invalidate();
                    dmVar.M.t0.invalidate();
                }
                s1Var.setAlpha(1.0f);
                s1Var.getTransitionParams().x0 = false;
                break;
            case 1:
                mp mpVar = (mp) this.b;
                mpVar.H = 0.0f;
                mpVar.G = 1.0f;
                View view2 = mpVar.W;
                if (view2 != null) {
                    view2.invalidate();
                }
                mpVar.P.invalidate();
                ti tiVar = mpVar.U;
                if (tiVar != null) {
                    tiVar.run();
                    mpVar.U = null;
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
                f2.x0.x0(view3);
                ((lr) pqVar.d).c.removeView(view3);
                break;
            case 4:
                org.telegram.ui.Components.b6 b6Var = (org.telegram.ui.Components.b6) this.b;
                b6Var.d = null;
                b6Var.b.clear();
                break;
            case 5:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.b;
                animatedPhoneNumberEditText.n = null;
                animatedPhoneNumberEditText.f.clear();
                break;
            case 6:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.i6 i6Var = (org.telegram.ui.Components.i6) this.b;
                i6Var.c();
                i6Var.k = null;
                i6Var.h = 0.0f;
                i6Var.m = 0.0f;
                i6Var.invalidateSelf();
                Runnable runnable = i6Var.V;
                if (runnable != null) {
                    runnable.run();
                }
                i6Var.o = null;
                CharSequence charSequence = i6Var.p;
                if (charSequence == null) {
                    org.telegram.ui.Components.bg bgVar = i6Var.C;
                    if (bgVar != null) {
                        bgVar.run();
                        break;
                    }
                } else {
                    i6Var.q(charSequence, true, i6Var.q);
                    i6Var.p = null;
                    i6Var.q = false;
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Components.n9 n9Var = (org.telegram.ui.Components.n9) this.b;
                n9Var.setVisibility(8);
                n9Var.setImageDrawable(null);
                n9Var.setAlpha(1.0f);
                break;
            case 8:
                org.telegram.ui.Components.v8 v8Var = ((org.telegram.ui.Components.j8) this.b).b;
                v8Var.f = false;
                v8Var.e.setVisibility(8);
                break;
            case 9:
                org.telegram.ui.Components.a9 a9Var = (org.telegram.ui.Components.a9) this.b;
                if (a9Var.f != null) {
                    a9Var.e = 1.0f;
                    a9Var.n();
                    if (a9Var.g) {
                        a9Var.g = false;
                        Runnable runnable2 = a9Var.j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    a9Var.f();
                }
                a9Var.f = null;
                break;
            case 10:
                ((org.telegram.ui.Components.df) this.b).f.U.setVisibility(8);
                break;
            case 11:
                ((org.telegram.ui.Components.hg) this.b).W = 1.0f;
                break;
            case 12:
                ((org.telegram.ui.Components.oh) this.b).c.s.setVisibility(8);
                break;
            case 13:
                ((org.telegram.ui.Components.qh) this.b).d.v.setVisibility(8);
                break;
            case 14:
                org.telegram.ui.Components.gi giVar = (org.telegram.ui.Components.gi) this.b;
                giVar.V0 = null;
                if (!giVar.m1) {
                    if (giVar.T0.getTag() == null && giVar.M0 == 0 && !giVar.P0) {
                        giVar.W0.setVisibility(4);
                    }
                    giVar.e1.setVisibility(4);
                    break;
                } else {
                    org.telegram.ui.ActionBar.v0 v0Var = giVar.a1;
                    if (v0Var != null) {
                        v0Var.setVisibility(4);
                        break;
                    }
                }
                break;
            case 15:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.bk bkVar = (org.telegram.ui.Components.bk) this.b;
                bkVar.s.setVisibility(8);
                bkVar.n = 0;
                org.telegram.ui.Components.qj qjVar = bkVar.r;
                qjVar.setAlpha(1.0f);
                qjVar.setScaleX(1.0f);
                qjVar.setScaleY(1.0f);
                qjVar.setTranslationX(0.0f);
                qjVar.invalidate();
                break;
            case 16:
                org.telegram.ui.Components.ak akVar = (org.telegram.ui.Components.ak) this.b;
                if (akVar.T.D.getTag() == null) {
                    akVar.T.D.setVisibility(4);
                }
                akVar.T.E = null;
                break;
            case 17:
                org.telegram.ui.Components.jl jlVar = (org.telegram.ui.Components.jl) this.b;
                if (animator.equals(jlVar.a.K)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = jlVar.a;
                    chatAttachAlertPhotoLayout.V = true;
                    chatAttachAlertPhotoLayout.K = null;
                    break;
                }
                break;
            case 18:
                org.telegram.ui.Components.dm dmVar2 = (org.telegram.ui.Components.dm) this.b;
                org.telegram.ui.Components.em emVar = dmVar2.L;
                emVar.F = null;
                emVar.G = false;
                dmVar2.invalidate();
                break;
            case 19:
                org.telegram.ui.Components.ap apVar = (org.telegram.ui.Components.ap) this.b;
                lh.bb bbVar = apVar.N;
                if (bbVar != null) {
                    if (bbVar.getParent() != null) {
                        ((ViewGroup) apVar.N.getParent()).removeView(apVar.N);
                    }
                    apVar.N = null;
                }
                apVar.P = null;
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
                org.telegram.ui.Components.aq aqVar = (org.telegram.ui.Components.aq) this.b;
                if (aqVar.G == aqVar.H) {
                    aqVar.C.setVisibility(4);
                }
                aqVar.y = null;
                break;
            case 23:
                org.telegram.ui.Components.jq jqVar = (org.telegram.ui.Components.jq) this.b;
                jqVar.l = 1.0f;
                jqVar.o = null;
                jqVar.p = null;
                jqVar.q = null;
                View view4 = jqVar.H;
                if (view4 != null) {
                    if (jqVar.h == 0 && jqVar.G) {
                        view4.setVisibility(8);
                    }
                    jqVar.H.invalidate();
                }
                jqVar.c = -1;
                break;
            case 24:
                org.telegram.ui.Components.tt ttVar = (org.telegram.ui.Components.tt) this.b;
                ttVar.K = false;
                ttVar.d.setTranslationY(0.0f);
                ttVar.d.setAlpha(0.0f);
                ttVar.c(0.0f);
                ttVar.N = 0.0f;
                ttVar.j();
                break;
            case 25:
                ((org.telegram.ui.Components.bu) this.b).a.K = false;
                break;
            case 26:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Components.tu) this.b).d = null;
                break;
            case 27:
                ((org.telegram.ui.Components.yy) this.b).S = null;
                break;
            case 28:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Components.gy) this.b).n = null;
                break;
            case 29:
                ((org.telegram.ui.Components.wz) this.b).a();
                break;
        }
    }

    public am(pq pqVar, f2.x0 x0Var) {
        this.a = 3;
        this.b = pqVar;
    }
}
