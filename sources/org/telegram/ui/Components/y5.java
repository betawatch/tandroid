package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class y5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y5(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 13:
                ((kl) this.b).a.O = null;
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
                z5 z5Var = (z5) this.b;
                z5Var.d = null;
                z5Var.b.clear();
                break;
            case 1:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.b;
                animatedPhoneNumberEditText.M1 = null;
                animatedPhoneNumberEditText.K1.clear();
                break;
            case 2:
                super.onAnimationEnd(animator);
                h6 h6Var = (h6) this.b;
                h6Var.b();
                h6Var.o = null;
                h6Var.j = 0.0f;
                h6Var.m = 0.0f;
                h6Var.l = 0.0f;
                h6Var.k = 0.0f;
                h6Var.r = 0.0f;
                h6Var.q = 0.0f;
                h6Var.invalidateSelf();
                Runnable runnable = h6Var.b0;
                if (runnable != null) {
                    runnable.run();
                }
                h6Var.t = null;
                CharSequence charSequence = h6Var.u;
                if (charSequence == null) {
                    wf wfVar = h6Var.I;
                    if (wfVar != null) {
                        wfVar.run();
                        break;
                    }
                } else {
                    h6Var.t(charSequence, true, h6Var.v);
                    h6Var.u = null;
                    h6Var.v = false;
                    break;
                }
                break;
            case 3:
                k9 k9Var = (k9) this.b;
                k9Var.setVisibility(8);
                k9Var.setImageDrawable(null);
                k9Var.setAlpha(1.0f);
                break;
            case 4:
                s8 s8Var = (s8) ((org.telegram.messenger.c9) this.b).m1;
                s8Var.f = false;
                s8Var.e.setVisibility(8);
                break;
            case 5:
                x8 x8Var = (x8) this.b;
                if (x8Var.f != null) {
                    x8Var.e = 1.0f;
                    x8Var.k();
                    if (x8Var.g) {
                        x8Var.g = false;
                        Runnable runnable2 = x8Var.j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    x8Var.d();
                }
                x8Var.f = null;
                break;
            case 6:
                ((ye) this.b).f.b0.setVisibility(8);
                break;
            case 7:
                ((cg) this.b).d0 = 1.0f;
                break;
            case 8:
                ((ci) ((gh) this.b).d).t1.setVisibility(8);
                break;
            case 9:
                ((jh) this.b).d.u1.setVisibility(8);
                break;
            case 10:
                ci ciVar = (ci) this.b;
                ciVar.W2 = null;
                if (!ciVar.n3) {
                    if (ciVar.U2.getTag() == null && ciVar.N2 == 0 && !ciVar.Q2) {
                        ciVar.X2.setVisibility(4);
                    }
                    ciVar.f3.setVisibility(4);
                    break;
                } else {
                    org.telegram.ui.ActionBar.r0 r0Var = ciVar.b3;
                    if (r0Var != null) {
                        r0Var.setVisibility(4);
                        break;
                    }
                }
                break;
            case 11:
                super.onAnimationEnd(animator);
                uj ujVar = (uj) this.b;
                ujVar.s.setVisibility(8);
                ujVar.n = 0;
                jj jjVar = ujVar.r;
                jjVar.setAlpha(1.0f);
                jjVar.setScaleX(1.0f);
                jjVar.setScaleY(1.0f);
                jjVar.setTranslationX(0.0f);
                jjVar.invalidate();
                break;
            case 12:
                tj tjVar = (tj) this.b;
                if (tjVar.X.H.getTag() == null) {
                    tjVar.X.H.setVisibility(4);
                }
                tjVar.X.I = null;
                break;
            case 13:
                kl klVar = (kl) this.b;
                if (animator.equals(klVar.a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = klVar.a;
                    chatAttachAlertPhotoLayout.c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    break;
                }
                break;
            case 14:
                zl zlVar = (zl) this.b;
                am amVar = zlVar.P;
                amVar.J = null;
                amVar.K = false;
                zlVar.invalidate();
                break;
            case 15:
                xl xlVar = (xl) this.b;
                xlVar.b.R = true;
                xlVar.O.z.invalidate();
                break;
            case 16:
                vo voVar = (vo) this.b;
                xz0 xz0Var = voVar.K1;
                if (xz0Var != null) {
                    if (xz0Var.getParent() != null) {
                        ((ViewGroup) voVar.K1.getParent()).removeView(voVar.K1);
                    }
                    voVar.K1 = null;
                }
                voVar.M1 = null;
                super.onAnimationEnd(animator);
                break;
            case 17:
                xz0 xz0Var2 = (xz0) this.b;
                xz0Var2.c = null;
                xz0Var2.a.setShader(null);
                xz0Var2.n = null;
                xz0Var2.r = null;
                xz0Var2.setImageDrawable(null);
                org.telegram.messenger.g0.E2(xz0Var2);
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
                kt ktVar = (kt) this.b;
                ktVar.O = false;
                ktVar.d.setTranslationY(0.0f);
                ktVar.d.setAlpha(0.0f);
                ktVar.c(0.0f);
                ktVar.R = 0.0f;
                ktVar.j();
                break;
            case 22:
                ((st) this.b).a.I1 = false;
                break;
            case 23:
                super.onAnimationEnd(animator);
                ((ju) this.b).d = null;
                break;
            case 24:
                ((gy) this.b).W = null;
                break;
            case 25:
                super.onAnimationEnd(animator);
                ((px) this.b).n = null;
                break;
            case 26:
                ((cz) this.b).a();
                break;
            case 27:
                ez ezVar = (ez) this.b;
                ezVar.U = ezVar.c0;
                ezVar.b0 = ezVar.f0;
                ezVar.V = ezVar.d0;
                ezVar.W = ezVar.e0;
                ezVar.c0 = -1;
                ezVar.d0 = -1;
                ezVar.e0 = -1;
                ezVar.f0 = -1;
                break;
            case 28:
                rz rzVar = (rz) this.b;
                rzVar.w = 1.0f;
                rzVar.invalidate();
                break;
            default:
                n40 n40Var = (n40) this.b;
                if (animator == n40Var.a0) {
                    n40Var.d(true);
                    n40Var.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
