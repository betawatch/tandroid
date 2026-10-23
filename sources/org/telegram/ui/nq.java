package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class nq extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nq(Object obj, int i10) {
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
                oq oqVar = (oq) this.b;
                View view = oqVar.b;
                view.setAlpha(1.0f);
                s4.n0.x0(view);
                ((hr) oqVar.d).c.removeView(view);
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
                ei.db dbVar = wpVar.R;
                if (dbVar != null) {
                    if (dbVar.getParent() != null) {
                        ((ViewGroup) wpVar.R.getParent()).removeView(wpVar.R);
                    }
                    wpVar.R = null;
                }
                wpVar.T = null;
                super.onAnimationEnd(animator);
                break;
            case 17:
                CheckBox checkBox = (CheckBox) this.b;
                if (animator.equals(checkBox.s)) {
                    checkBox.s = null;
                }
                if (!checkBox.x) {
                    checkBox.G = null;
                    break;
                }
                break;
            case 18:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.b;
                if (animator.equals(checkBoxBase.p)) {
                    checkBoxBase.p = null;
                }
                if (!checkBoxBase.q) {
                    checkBoxBase.C = null;
                    break;
                }
                break;
            case 19:
                org.telegram.ui.Components.wq wqVar = (org.telegram.ui.Components.wq) this.b;
                if (wqVar.K == wqVar.L) {
                    wqVar.G.setVisibility(4);
                }
                wqVar.y = null;
                break;
            case 20:
                org.telegram.ui.Components.fr frVar = (org.telegram.ui.Components.fr) this.b;
                frVar.l = 1.0f;
                frVar.o = null;
                frVar.p = null;
                frVar.q = null;
                View view2 = frVar.H;
                if (view2 != null) {
                    if (frVar.h == 0 && frVar.G) {
                        view2.setVisibility(8);
                    }
                    frVar.H.invalidate();
                }
                frVar.c = -1;
                break;
            case 21:
                org.telegram.ui.Components.qu quVar = (org.telegram.ui.Components.qu) this.b;
                quVar.O = false;
                quVar.d.setTranslationY(0.0f);
                quVar.d.setAlpha(0.0f);
                quVar.c(0.0f);
                quVar.R = 0.0f;
                quVar.j();
                break;
            case 22:
                ((org.telegram.ui.Components.yu) this.b).a.O = false;
                break;
            case 23:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Components.rv) this.b).d = null;
                break;
            case 24:
                ((org.telegram.ui.Components.tz) this.b).W = null;
                break;
            case 25:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Components.cz) this.b).n = null;
                break;
            case 26:
                ((org.telegram.ui.Components.q00) this.b).a();
                break;
            case 27:
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
            case 28:
                org.telegram.ui.Components.g10 g10Var = (org.telegram.ui.Components.g10) this.b;
                g10Var.s = 1.0f;
                g10Var.invalidate();
                break;
            default:
                org.telegram.ui.Components.l60 l60Var = (org.telegram.ui.Components.l60) this.b;
                if (animator == l60Var.W) {
                    l60Var.c(true);
                    l60Var.setVisibility(4);
                    break;
                }
                break;
        }
    }

    public nq(oq oqVar, s4.n0 n0Var) {
        this.a = 0;
        this.b = oqVar;
    }
}
