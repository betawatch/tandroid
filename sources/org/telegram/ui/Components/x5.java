package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x5(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 13:
                ((kl) this.b).a.P = null;
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
                y5 y5Var = (y5) this.b;
                y5Var.d = null;
                y5Var.b.clear();
                break;
            case 1:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.b;
                animatedPhoneNumberEditText.N1 = null;
                animatedPhoneNumberEditText.L1.clear();
                break;
            case 2:
                super.onAnimationEnd(animator);
                g6 g6Var = (g6) this.b;
                g6Var.b();
                g6Var.o = null;
                g6Var.j = 0.0f;
                g6Var.m = 0.0f;
                g6Var.l = 0.0f;
                g6Var.k = 0.0f;
                g6Var.r = 0.0f;
                g6Var.q = 0.0f;
                g6Var.invalidateSelf();
                Runnable runnable = g6Var.b0;
                if (runnable != null) {
                    runnable.run();
                }
                g6Var.t = null;
                CharSequence charSequence = g6Var.u;
                if (charSequence == null) {
                    vf vfVar = g6Var.I;
                    if (vfVar != null) {
                        vfVar.run();
                        break;
                    }
                } else {
                    g6Var.t(charSequence, true, g6Var.v);
                    g6Var.u = null;
                    g6Var.v = false;
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
                r8 r8Var = (r8) ((org.telegram.messenger.b9) this.b).k1;
                r8Var.f = false;
                r8Var.e.setVisibility(8);
                break;
            case 5:
                w8 w8Var = (w8) this.b;
                if (w8Var.f != null) {
                    w8Var.e = 1.0f;
                    w8Var.k();
                    if (w8Var.g) {
                        w8Var.g = false;
                        Runnable runnable2 = w8Var.j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    w8Var.d();
                }
                w8Var.f = null;
                break;
            case 6:
                ((xe) this.b).f.c0.setVisibility(8);
                break;
            case 7:
                ((bg) this.b).e0 = 1.0f;
                break;
            case 8:
                ((bi) ((eh) this.b).d).r1.setVisibility(8);
                break;
            case 9:
                ((hh) this.b).d.s1.setVisibility(8);
                break;
            case 10:
                bi biVar = (bi) this.b;
                biVar.U2 = null;
                if (!biVar.l3) {
                    if (biVar.S2.getTag() == null && biVar.L2 == 0 && !biVar.O2) {
                        biVar.V2.setVisibility(4);
                    }
                    biVar.d3.setVisibility(4);
                    break;
                } else {
                    org.telegram.ui.ActionBar.q0 q0Var = biVar.Z2;
                    if (q0Var != null) {
                        q0Var.setVisibility(4);
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
                if (tjVar.Y.I.getTag() == null) {
                    tjVar.Y.I.setVisibility(4);
                }
                tjVar.Y.J = null;
                break;
            case 13:
                kl klVar = (kl) this.b;
                if (animator.equals(klVar.a.P)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = klVar.a;
                    chatAttachAlertPhotoLayout.d0 = true;
                    chatAttachAlertPhotoLayout.P = null;
                    break;
                }
                break;
            case 14:
                zl zlVar = (zl) this.b;
                am amVar = zlVar.Q;
                amVar.K = null;
                amVar.L = false;
                zlVar.invalidate();
                break;
            case 15:
                xl xlVar = (xl) this.b;
                xlVar.b.R = true;
                xlVar.O.z.invalidate();
                break;
            case 16:
                vo voVar = (vo) this.b;
                wz0 wz0Var = voVar.I1;
                if (wz0Var != null) {
                    if (wz0Var.getParent() != null) {
                        ((ViewGroup) voVar.I1.getParent()).removeView(voVar.I1);
                    }
                    voVar.I1 = null;
                }
                voVar.K1 = null;
                super.onAnimationEnd(animator);
                break;
            case 17:
                wz0 wz0Var2 = (wz0) this.b;
                wz0Var2.c = null;
                wz0Var2.a.setShader(null);
                wz0Var2.n = null;
                wz0Var2.r = null;
                wz0Var2.setImageDrawable(null);
                org.telegram.messenger.g0.E2(wz0Var2);
                break;
            case 18:
                CheckBox checkBox = (CheckBox) this.b;
                if (animator.equals(checkBox.s)) {
                    checkBox.s = null;
                }
                if (!checkBox.y) {
                    checkBox.H = null;
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
                cq cqVar = (cq) this.b;
                cqVar.l = 1.0f;
                cqVar.o = null;
                cqVar.p = null;
                cqVar.q = null;
                View view = cqVar.H;
                if (view != null) {
                    if (cqVar.h == 0 && cqVar.G) {
                        view.setVisibility(8);
                    }
                    cqVar.H.invalidate();
                }
                cqVar.c = -1;
                break;
            case 21:
                jt jtVar = (jt) this.b;
                jtVar.P = false;
                jtVar.d.setTranslationY(0.0f);
                jtVar.d.setAlpha(0.0f);
                jtVar.c(0.0f);
                jtVar.S = 0.0f;
                jtVar.j();
                break;
            case 22:
                ((qt) this.b).a.G1 = false;
                break;
            case 23:
                super.onAnimationEnd(animator);
                ((iu) this.b).d = null;
                break;
            case 24:
                ((ey) this.b).a0 = null;
                break;
            case 25:
                super.onAnimationEnd(animator);
                ((nx) this.b).n = null;
                break;
            case 26:
                ((zy) this.b).a();
                break;
            case 27:
                bz bzVar = (bz) this.b;
                bzVar.V = bzVar.d0;
                bzVar.c0 = bzVar.g0;
                bzVar.W = bzVar.e0;
                bzVar.a0 = bzVar.f0;
                bzVar.d0 = -1;
                bzVar.e0 = -1;
                bzVar.f0 = -1;
                bzVar.g0 = -1;
                break;
            case 28:
                nz nzVar = (nz) this.b;
                nzVar.w = 1.0f;
                nzVar.invalidate();
                break;
            default:
                j40 j40Var = (j40) this.b;
                if (animator == j40Var.a0) {
                    j40Var.c(true);
                    j40Var.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
