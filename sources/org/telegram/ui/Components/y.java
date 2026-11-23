package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class y extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 14:
                ((bm) this.b).a.P = null;
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
                z zVar = (z) this.b;
                zVar.O = null;
                zVar.M = zVar.N;
                zVar.requestLayout();
                break;
            case 1:
                g6 g6Var = (g6) this.b;
                g6Var.d = null;
                g6Var.b.clear();
                break;
            case 2:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.b;
                animatedPhoneNumberEditText.S1 = null;
                animatedPhoneNumberEditText.Q1.clear();
                break;
            case 3:
                super.onAnimationEnd(animator);
                n6 n6Var = (n6) this.b;
                n6Var.b();
                n6Var.o = null;
                n6Var.j = 0.0f;
                n6Var.m = 0.0f;
                n6Var.l = 0.0f;
                n6Var.k = 0.0f;
                n6Var.r = 0.0f;
                n6Var.q = 0.0f;
                n6Var.invalidateSelf();
                Runnable runnable = n6Var.c0;
                if (runnable != null) {
                    runnable.run();
                }
                n6Var.t = null;
                CharSequence charSequence = n6Var.u;
                if (charSequence == null) {
                    og ogVar = n6Var.J;
                    if (ogVar != null) {
                        ogVar.run();
                        break;
                    }
                } else {
                    n6Var.t(charSequence, true, n6Var.v);
                    n6Var.u = null;
                    n6Var.v = false;
                    break;
                }
                break;
            case 4:
                q9 q9Var = (q9) this.b;
                q9Var.setVisibility(8);
                q9Var.setImageDrawable(null);
                q9Var.setAlpha(1.0f);
                break;
            case 5:
                y8 y8Var = (y8) ((org.telegram.messenger.c9) this.b).n1;
                y8Var.f = false;
                y8Var.e.setVisibility(8);
                break;
            case 6:
                d9 d9Var = (d9) this.b;
                if (d9Var.f != null) {
                    d9Var.e = 1.0f;
                    d9Var.k();
                    if (d9Var.g) {
                        d9Var.g = false;
                        Runnable runnable2 = d9Var.j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    d9Var.d();
                }
                d9Var.f = null;
                break;
            case 7:
                ((jf) this.b).f.c0.setVisibility(8);
                break;
            case 8:
                ((ug) this.b).g0 = 1.0f;
                break;
            case 9:
                ((ui) ((yh) this.b).d).u1.setVisibility(8);
                break;
            case 10:
                ((bi) this.b).d.v1.setVisibility(8);
                break;
            case 11:
                ui uiVar = (ui) this.b;
                uiVar.X2 = null;
                if (!uiVar.o3) {
                    if (uiVar.V2.getTag() == null && uiVar.O2 == 0 && !uiVar.R2) {
                        uiVar.Y2.setVisibility(4);
                    }
                    uiVar.g3.setVisibility(4);
                    break;
                } else {
                    org.telegram.ui.ActionBar.q0 q0Var = uiVar.c3;
                    if (q0Var != null) {
                        q0Var.setVisibility(4);
                        break;
                    }
                }
                break;
            case 12:
                super.onAnimationEnd(animator);
                mk mkVar = (mk) this.b;
                mkVar.s.setVisibility(8);
                mkVar.n = 0;
                ak akVar = mkVar.r;
                akVar.setAlpha(1.0f);
                akVar.setScaleX(1.0f);
                akVar.setScaleY(1.0f);
                akVar.setTranslationX(0.0f);
                akVar.invalidate();
                break;
            case 13:
                lk lkVar = (lk) this.b;
                if (lkVar.Y.I.getTag() == null) {
                    lkVar.Y.I.setVisibility(4);
                }
                lkVar.Y.J = null;
                break;
            case 14:
                bm bmVar = (bm) this.b;
                if (animator.equals(bmVar.a.P)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = bmVar.a;
                    chatAttachAlertPhotoLayout.d0 = true;
                    chatAttachAlertPhotoLayout.P = null;
                    break;
                }
                break;
            case 15:
                qm qmVar = (qm) this.b;
                rm rmVar = qmVar.Q;
                rmVar.K = null;
                rmVar.L = false;
                qmVar.invalidate();
                break;
            case 16:
                om omVar = (om) this.b;
                omVar.b.R = true;
                omVar.O.z.invalidate();
                break;
            case 17:
                np npVar = (np) this.b;
                i01 i01Var = npVar.L1;
                if (i01Var != null) {
                    if (i01Var.getParent() != null) {
                        ((ViewGroup) npVar.L1.getParent()).removeView(npVar.L1);
                    }
                    npVar.L1 = null;
                }
                npVar.N1 = null;
                super.onAnimationEnd(animator);
                break;
            case 18:
                i01 i01Var2 = (i01) this.b;
                i01Var2.c = null;
                i01Var2.a.setShader(null);
                i01Var2.n = null;
                i01Var2.r = null;
                i01Var2.setImageDrawable(null);
                org.telegram.messenger.g0.E2(i01Var2);
                break;
            case 19:
                CheckBox checkBox = (CheckBox) this.b;
                if (animator.equals(checkBox.s)) {
                    checkBox.s = null;
                }
                if (!checkBox.y) {
                    checkBox.H = null;
                    break;
                }
                break;
            case 20:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.b;
                if (animator.equals(checkBoxBase.p)) {
                    checkBoxBase.p = null;
                }
                if (!checkBoxBase.q) {
                    checkBoxBase.C = null;
                    break;
                }
                break;
            case 21:
                sq sqVar = (sq) this.b;
                sqVar.l = 1.0f;
                sqVar.o = null;
                sqVar.p = null;
                sqVar.q = null;
                View view = sqVar.H;
                if (view != null) {
                    if (sqVar.h == 0 && sqVar.G) {
                        view.setVisibility(8);
                    }
                    sqVar.H.invalidate();
                }
                sqVar.c = -1;
                break;
            case 22:
                yt ytVar = (yt) this.b;
                ytVar.P = false;
                ytVar.d.setTranslationY(0.0f);
                ytVar.d.setAlpha(0.0f);
                ytVar.c(0.0f);
                ytVar.S = 0.0f;
                ytVar.j();
                break;
            case 23:
                ((fu) this.b).a.J1 = false;
                break;
            case 24:
                super.onAnimationEnd(animator);
                ((xu) this.b).d = null;
                break;
            case 25:
                ((ty) this.b).a0 = null;
                break;
            case 26:
                super.onAnimationEnd(animator);
                ((cy) this.b).n = null;
                break;
            case 27:
                ((pz) this.b).a();
                break;
            case 28:
                e00 e00Var = (e00) this.b;
                e00Var.w = 1.0f;
                e00Var.invalidate();
                break;
            default:
                b50 b50Var = (b50) this.b;
                if (animator == b50Var.b0) {
                    b50Var.d(true);
                    b50Var.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
