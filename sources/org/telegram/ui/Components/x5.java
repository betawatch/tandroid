package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class x5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x5(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 13:
                ((sl) this.b).a.P = null;
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
                animatedPhoneNumberEditText.S1 = null;
                animatedPhoneNumberEditText.Q1.clear();
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
                Runnable runnable = g6Var.c0;
                if (runnable != null) {
                    runnable.run();
                }
                g6Var.t = null;
                CharSequence charSequence = g6Var.u;
                if (charSequence == null) {
                    dg dgVar = g6Var.J;
                    if (dgVar != null) {
                        dgVar.run();
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
                i9 i9Var = (i9) this.b;
                i9Var.setVisibility(8);
                i9Var.setImageDrawable(null);
                i9Var.setAlpha(1.0f);
                break;
            case 4:
                q8 q8Var = (q8) ((org.telegram.messenger.b9) this.b).n1;
                q8Var.f = false;
                q8Var.e.setVisibility(8);
                break;
            case 5:
                v8 v8Var = (v8) this.b;
                if (v8Var.f != null) {
                    v8Var.e = 1.0f;
                    v8Var.k();
                    if (v8Var.g) {
                        v8Var.g = false;
                        Runnable runnable2 = v8Var.j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    v8Var.d();
                }
                v8Var.f = null;
                break;
            case 6:
                ((ze) this.b).f.c0.setVisibility(8);
                break;
            case 7:
                ((jg) this.b).g0 = 1.0f;
                break;
            case 8:
                ((ki) ((oh) this.b).d).u1.setVisibility(8);
                break;
            case 9:
                ((rh) this.b).d.v1.setVisibility(8);
                break;
            case 10:
                ki kiVar = (ki) this.b;
                kiVar.X2 = null;
                if (!kiVar.o3) {
                    if (kiVar.V2.getTag() == null && kiVar.O2 == 0 && !kiVar.R2) {
                        kiVar.Y2.setVisibility(4);
                    }
                    kiVar.g3.setVisibility(4);
                    break;
                } else {
                    org.telegram.ui.ActionBar.q0 q0Var = kiVar.c3;
                    if (q0Var != null) {
                        q0Var.setVisibility(4);
                        break;
                    }
                }
                break;
            case 11:
                super.onAnimationEnd(animator);
                dk dkVar = (dk) this.b;
                dkVar.s.setVisibility(8);
                dkVar.n = 0;
                rj rjVar = dkVar.r;
                rjVar.setAlpha(1.0f);
                rjVar.setScaleX(1.0f);
                rjVar.setScaleY(1.0f);
                rjVar.setTranslationX(0.0f);
                rjVar.invalidate();
                break;
            case 12:
                ck ckVar = (ck) this.b;
                if (ckVar.Y.I.getTag() == null) {
                    ckVar.Y.I.setVisibility(4);
                }
                ckVar.Y.J = null;
                break;
            case 13:
                sl slVar = (sl) this.b;
                if (animator.equals(slVar.a.P)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = slVar.a;
                    chatAttachAlertPhotoLayout.d0 = true;
                    chatAttachAlertPhotoLayout.P = null;
                    break;
                }
                break;
            case 14:
                hm hmVar = (hm) this.b;
                im imVar = hmVar.Q;
                imVar.K = null;
                imVar.L = false;
                hmVar.invalidate();
                break;
            case 15:
                fm fmVar = (fm) this.b;
                fmVar.b.R = true;
                fmVar.O.z.invalidate();
                break;
            case 16:
                ep epVar = (ep) this.b;
                zz0 zz0Var = epVar.L1;
                if (zz0Var != null) {
                    if (zz0Var.getParent() != null) {
                        ((ViewGroup) epVar.L1.getParent()).removeView(epVar.L1);
                    }
                    epVar.L1 = null;
                }
                epVar.N1 = null;
                super.onAnimationEnd(animator);
                break;
            case 17:
                zz0 zz0Var2 = (zz0) this.b;
                zz0Var2.c = null;
                zz0Var2.a.setShader(null);
                zz0Var2.n = null;
                zz0Var2.r = null;
                zz0Var2.setImageDrawable(null);
                org.telegram.messenger.g0.E2(zz0Var2);
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
                jq jqVar = (jq) this.b;
                jqVar.l = 1.0f;
                jqVar.o = null;
                jqVar.p = null;
                jqVar.q = null;
                View view = jqVar.H;
                if (view != null) {
                    if (jqVar.h == 0 && jqVar.G) {
                        view.setVisibility(8);
                    }
                    jqVar.H.invalidate();
                }
                jqVar.c = -1;
                break;
            case 21:
                rt rtVar = (rt) this.b;
                rtVar.P = false;
                rtVar.d.setTranslationY(0.0f);
                rtVar.d.setAlpha(0.0f);
                rtVar.c(0.0f);
                rtVar.S = 0.0f;
                rtVar.j();
                break;
            case 22:
                ((yt) this.b).a.J1 = false;
                break;
            case 23:
                super.onAnimationEnd(animator);
                ((pu) this.b).d = null;
                break;
            case 24:
                ((ly) this.b).a0 = null;
                break;
            case 25:
                super.onAnimationEnd(animator);
                ((ux) this.b).n = null;
                break;
            case 26:
                ((gz) this.b).a();
                break;
            case 27:
                iz izVar = (iz) this.b;
                izVar.V = izVar.d0;
                izVar.c0 = izVar.g0;
                izVar.W = izVar.e0;
                izVar.a0 = izVar.f0;
                izVar.d0 = -1;
                izVar.e0 = -1;
                izVar.f0 = -1;
                izVar.g0 = -1;
                break;
            case 28:
                vz vzVar = (vz) this.b;
                vzVar.w = 1.0f;
                vzVar.invalidate();
                break;
            default:
                q40 q40Var = (q40) this.b;
                if (animator == q40Var.b0) {
                    q40Var.d(true);
                    q40Var.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
