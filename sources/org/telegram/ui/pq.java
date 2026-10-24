package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class pq extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pq(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 14:
                ((org.telegram.ui.Components.hm) this.b).a.O = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                qq qqVar = (qq) this.b;
                View view = qqVar.b;
                view.setAlpha(1.0f);
                s4.n0.x0(view);
                ((jr) qqVar.d).c.removeView(view);
                break;
            case 1:
                org.telegram.ui.Components.i6 i6Var = (org.telegram.ui.Components.i6) this.b;
                i6Var.d = null;
                i6Var.b.clear();
                break;
            case 2:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.b;
                animatedPhoneNumberEditText.n = null;
                animatedPhoneNumberEditText.f.clear();
                break;
            case 3:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.p6 p6Var = (org.telegram.ui.Components.p6) this.b;
                p6Var.b();
                p6Var.o = null;
                p6Var.j = 0.0f;
                p6Var.m = 0.0f;
                p6Var.l = 0.0f;
                p6Var.k = 0.0f;
                p6Var.r = 0.0f;
                p6Var.q = 0.0f;
                p6Var.invalidateSelf();
                Runnable runnable = p6Var.b0;
                if (runnable != null) {
                    runnable.run();
                }
                p6Var.t = null;
                CharSequence charSequence = p6Var.u;
                if (charSequence == null) {
                    org.telegram.ui.Components.pg pgVar = p6Var.I;
                    if (pgVar != null) {
                        pgVar.run();
                        break;
                    }
                } else {
                    p6Var.t(charSequence, true, p6Var.v);
                    p6Var.u = null;
                    p6Var.v = false;
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) this.b;
                w9Var.setVisibility(8);
                w9Var.setImageDrawable(null);
                w9Var.setAlpha(1.0f);
                break;
            case 5:
                org.telegram.ui.Components.e9 e9Var = ((org.telegram.ui.Components.s8) this.b).b;
                e9Var.f = false;
                e9Var.e.setVisibility(8);
                break;
            case 6:
                org.telegram.ui.Components.j9 j9Var = (org.telegram.ui.Components.j9) this.b;
                if (j9Var.f != null) {
                    j9Var.e = 1.0f;
                    j9Var.n();
                    if (j9Var.g) {
                        j9Var.g = false;
                        Runnable runnable2 = j9Var.j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    j9Var.f();
                }
                j9Var.f = null;
                break;
            case 7:
                ((org.telegram.ui.Components.rf) this.b).f.b0.setVisibility(8);
                break;
            case 8:
                ((org.telegram.ui.Components.vg) this.b).d0 = 1.0f;
                break;
            case 9:
                ((org.telegram.ui.Components.ti) ((org.telegram.ui.Components.bi) this.b).d).s.setVisibility(8);
                break;
            case 10:
                ((org.telegram.ui.Components.di) this.b).d.v.setVisibility(8);
                break;
            case 11:
                org.telegram.ui.Components.ti tiVar = (org.telegram.ui.Components.ti) this.b;
                tiVar.c1 = null;
                if (!tiVar.t1) {
                    if (tiVar.a1.getTag() == null && tiVar.T0 == 0 && !tiVar.W0) {
                        tiVar.d1.setVisibility(4);
                    }
                    tiVar.l1.setVisibility(4);
                    break;
                } else {
                    org.telegram.ui.ActionBar.u0 u0Var = tiVar.h1;
                    if (u0Var != null) {
                        u0Var.setVisibility(4);
                        break;
                    }
                }
                break;
            case 12:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.nk nkVar = (org.telegram.ui.Components.nk) this.b;
                nkVar.s.setVisibility(8);
                nkVar.n = 0;
                org.telegram.ui.Components.ck ckVar = nkVar.r;
                ckVar.setAlpha(1.0f);
                ckVar.setScaleX(1.0f);
                ckVar.setScaleY(1.0f);
                ckVar.setTranslationX(0.0f);
                ckVar.invalidate();
                break;
            case 13:
                org.telegram.ui.Components.mk mkVar = (org.telegram.ui.Components.mk) this.b;
                if (mkVar.X.H.getTag() == null) {
                    mkVar.X.H.setVisibility(4);
                }
                mkVar.X.I = null;
                break;
            case 14:
                org.telegram.ui.Components.hm hmVar = (org.telegram.ui.Components.hm) this.b;
                if (animator.equals(hmVar.a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = hmVar.a;
                    chatAttachAlertPhotoLayout.c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Components.an anVar = (org.telegram.ui.Components.an) this.b;
                org.telegram.ui.Components.bn bnVar = anVar.P;
                bnVar.J = null;
                bnVar.K = false;
                anVar.invalidate();
                break;
            case 16:
                org.telegram.ui.Components.wp wpVar = (org.telegram.ui.Components.wp) this.b;
                org.telegram.ui.Components.t21 t21Var = wpVar.Q;
                if (t21Var != null) {
                    if (t21Var.getParent() != null) {
                        ((ViewGroup) wpVar.Q.getParent()).removeView(wpVar.Q);
                    }
                    wpVar.Q = null;
                }
                wpVar.S = null;
                super.onAnimationEnd(animator);
                break;
            case 17:
                org.telegram.ui.Components.t21 t21Var2 = (org.telegram.ui.Components.t21) this.b;
                t21Var2.c = null;
                t21Var2.a.setShader(null);
                t21Var2.n = null;
                t21Var2.r = null;
                t21Var2.setImageDrawable(null);
                AndroidUtilities.removeFromParent(t21Var2);
                break;
            case 18:
                CheckBox checkBox = (CheckBox) this.b;
                if (animator.equals(checkBox.s)) {
                    checkBox.s = null;
                }
                if (!checkBox.x) {
                    checkBox.G = null;
                    break;
                }
                break;
            case 19:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.b;
                if (animator.equals(checkBoxBase.p)) {
                    checkBoxBase.p = null;
                }
                if (!checkBoxBase.q) {
                    checkBoxBase.C = null;
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Components.wq wqVar = (org.telegram.ui.Components.wq) this.b;
                if (wqVar.K == wqVar.L) {
                    wqVar.G.setVisibility(4);
                }
                wqVar.y = null;
                break;
            case 21:
                org.telegram.ui.Components.er erVar = (org.telegram.ui.Components.er) this.b;
                erVar.l = 1.0f;
                erVar.o = null;
                erVar.p = null;
                erVar.q = null;
                View view2 = erVar.H;
                if (view2 != null) {
                    if (erVar.h == 0 && erVar.G) {
                        view2.setVisibility(8);
                    }
                    erVar.H.invalidate();
                }
                erVar.c = -1;
                break;
            case 22:
                org.telegram.ui.Components.qu quVar = (org.telegram.ui.Components.qu) this.b;
                quVar.O = false;
                quVar.d.setTranslationY(0.0f);
                quVar.d.setAlpha(0.0f);
                quVar.c(0.0f);
                quVar.R = 0.0f;
                quVar.j();
                break;
            case 23:
                ((org.telegram.ui.Components.yu) this.b).a.O = false;
                break;
            case 24:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Components.rv) this.b).d = null;
                break;
            case 25:
                ((org.telegram.ui.Components.tz) this.b).W = null;
                break;
            case 26:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Components.cz) this.b).n = null;
                break;
            case 27:
                ((org.telegram.ui.Components.q00) this.b).a();
                break;
            case 28:
                org.telegram.ui.Components.s00 s00Var = (org.telegram.ui.Components.s00) this.b;
                s00Var.U = s00Var.c0;
                s00Var.b0 = s00Var.f0;
                s00Var.V = s00Var.d0;
                s00Var.W = s00Var.e0;
                s00Var.c0 = -1;
                s00Var.d0 = -1;
                s00Var.e0 = -1;
                s00Var.f0 = -1;
                break;
            default:
                org.telegram.ui.Components.g10 g10Var = (org.telegram.ui.Components.g10) this.b;
                g10Var.v = 1.0f;
                g10Var.invalidate();
                break;
        }
    }

    public pq(qq qqVar, s4.n0 n0Var) {
        this.a = 0;
        this.b = qqVar;
    }
}
