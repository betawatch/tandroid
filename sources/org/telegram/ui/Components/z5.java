package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class z5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z5(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 13:
                ((ll) this.b).a.O = null;
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
                a6 a6Var = (a6) this.b;
                a6Var.d = null;
                a6Var.b.clear();
                break;
            case 1:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.b;
                animatedPhoneNumberEditText.M1 = null;
                animatedPhoneNumberEditText.K1.clear();
                break;
            case 2:
                super.onAnimationEnd(animator);
                i6 i6Var = (i6) this.b;
                i6Var.b();
                i6Var.o = null;
                i6Var.j = 0.0f;
                i6Var.m = 0.0f;
                i6Var.l = 0.0f;
                i6Var.k = 0.0f;
                i6Var.r = 0.0f;
                i6Var.q = 0.0f;
                i6Var.invalidateSelf();
                Runnable runnable = i6Var.b0;
                if (runnable != null) {
                    runnable.run();
                }
                i6Var.t = null;
                CharSequence charSequence = i6Var.u;
                if (charSequence == null) {
                    xf xfVar = i6Var.I;
                    if (xfVar != null) {
                        xfVar.run();
                        break;
                    }
                } else {
                    i6Var.t(charSequence, true, i6Var.v);
                    i6Var.u = null;
                    i6Var.v = false;
                    break;
                }
                break;
            case 3:
                l9 l9Var = (l9) this.b;
                l9Var.setVisibility(8);
                l9Var.setImageDrawable(null);
                l9Var.setAlpha(1.0f);
                break;
            case 4:
                t8 t8Var = (t8) ((org.telegram.messenger.c9) this.b).j1;
                t8Var.f = false;
                t8Var.e.setVisibility(8);
                break;
            case 5:
                y8 y8Var = (y8) this.b;
                if (y8Var.f != null) {
                    y8Var.e = 1.0f;
                    y8Var.k();
                    if (y8Var.g) {
                        y8Var.g = false;
                        Runnable runnable2 = y8Var.j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    y8Var.d();
                }
                y8Var.f = null;
                break;
            case 6:
                ((ze) this.b).f.b0.setVisibility(8);
                break;
            case 7:
                ((dg) this.b).d0 = 1.0f;
                break;
            case 8:
                ((di) ((hh) this.b).d).q1.setVisibility(8);
                break;
            case 9:
                ((kh) this.b).d.r1.setVisibility(8);
                break;
            case 10:
                di diVar = (di) this.b;
                diVar.T2 = null;
                if (!diVar.k3) {
                    if (diVar.R2.getTag() == null && diVar.K2 == 0 && !diVar.N2) {
                        diVar.U2.setVisibility(4);
                    }
                    diVar.c3.setVisibility(4);
                    break;
                } else {
                    org.telegram.ui.ActionBar.r0 r0Var = diVar.Y2;
                    if (r0Var != null) {
                        r0Var.setVisibility(4);
                        break;
                    }
                }
                break;
            case 11:
                super.onAnimationEnd(animator);
                vj vjVar = (vj) this.b;
                vjVar.s.setVisibility(8);
                vjVar.n = 0;
                kj kjVar = vjVar.r;
                kjVar.setAlpha(1.0f);
                kjVar.setScaleX(1.0f);
                kjVar.setScaleY(1.0f);
                kjVar.setTranslationX(0.0f);
                kjVar.invalidate();
                break;
            case 12:
                uj ujVar = (uj) this.b;
                if (ujVar.X.H.getTag() == null) {
                    ujVar.X.H.setVisibility(4);
                }
                ujVar.X.I = null;
                break;
            case 13:
                ll llVar = (ll) this.b;
                if (animator.equals(llVar.a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = llVar.a;
                    chatAttachAlertPhotoLayout.c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    break;
                }
                break;
            case 14:
                am amVar = (am) this.b;
                bm bmVar = amVar.P;
                bmVar.J = null;
                bmVar.K = false;
                amVar.invalidate();
                break;
            case 15:
                yl ylVar = (yl) this.b;
                ylVar.b.R = true;
                ylVar.O.z.invalidate();
                break;
            case 16:
                vo voVar = (vo) this.b;
                yz0 yz0Var = voVar.H1;
                if (yz0Var != null) {
                    if (yz0Var.getParent() != null) {
                        ((ViewGroup) voVar.H1.getParent()).removeView(voVar.H1);
                    }
                    voVar.H1 = null;
                }
                voVar.J1 = null;
                super.onAnimationEnd(animator);
                break;
            case 17:
                yz0 yz0Var2 = (yz0) this.b;
                yz0Var2.c = null;
                yz0Var2.a.setShader(null);
                yz0Var2.n = null;
                yz0Var2.r = null;
                yz0Var2.setImageDrawable(null);
                org.telegram.messenger.g0.E2(yz0Var2);
                break;
            case 18:
                CheckBox checkBox = (CheckBox) this.b;
                if (animator.equals(checkBox.s)) {
                    checkBox.s = null;
                }
                if (!checkBox.y) {
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
                bq bqVar = (bq) this.b;
                bqVar.l = 1.0f;
                bqVar.o = null;
                bqVar.p = null;
                bqVar.q = null;
                View view = bqVar.H;
                if (view != null) {
                    if (bqVar.h == 0 && bqVar.G) {
                        view.setVisibility(8);
                    }
                    bqVar.H.invalidate();
                }
                bqVar.c = -1;
                break;
            case 21:
                lt ltVar = (lt) this.b;
                ltVar.O = false;
                ltVar.d.setTranslationY(0.0f);
                ltVar.d.setAlpha(0.0f);
                ltVar.c(0.0f);
                ltVar.R = 0.0f;
                ltVar.j();
                break;
            case 22:
                ((tt) this.b).a.F1 = false;
                break;
            case 23:
                super.onAnimationEnd(animator);
                ((ku) this.b).d = null;
                break;
            case 24:
                ((hy) this.b).W = null;
                break;
            case 25:
                super.onAnimationEnd(animator);
                ((qx) this.b).n = null;
                break;
            case 26:
                ((dz) this.b).a();
                break;
            case 27:
                fz fzVar = (fz) this.b;
                fzVar.U = fzVar.c0;
                fzVar.b0 = fzVar.f0;
                fzVar.V = fzVar.d0;
                fzVar.W = fzVar.e0;
                fzVar.c0 = -1;
                fzVar.d0 = -1;
                fzVar.e0 = -1;
                fzVar.f0 = -1;
                break;
            case 28:
                sz szVar = (sz) this.b;
                szVar.w = 1.0f;
                szVar.invalidate();
                break;
            default:
                o40 o40Var = (o40) this.b;
                if (animator == o40Var.a0) {
                    o40Var.d(true);
                    o40Var.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
