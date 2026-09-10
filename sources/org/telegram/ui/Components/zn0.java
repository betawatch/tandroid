package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.TransitionValues;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.si1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class zn0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zn0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((ho0) this.b).M0.setVisibility(8);
                break;
            case 1:
                hp0 hp0Var = (hp0) this.b;
                if (animator == hp0Var.h) {
                    hp0Var.h = null;
                    break;
                }
                break;
            case 2:
                ((rq0) this.b).e = null;
                break;
            case 3:
                zq0 zq0Var = (zq0) this.b;
                if (zq0Var.getParent() != null) {
                    ((ViewGroup) zq0Var.getParent()).removeView(zq0Var);
                    break;
                }
                break;
            case 4:
                ct0 ct0Var = (ct0) this.b;
                View view = ct0Var.c;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ct0Var.a.removeView(view);
                break;
            case 5:
                pv0 pv0Var = (pv0) this.b;
                if (pv0Var.f == animator) {
                    pv0Var.f = null;
                    break;
                }
                break;
            case 6:
                hx0 hx0Var = (hx0) this.b;
                hx0Var.setCategoriesShownT(((Float) hx0Var.p3.getAnimatedValue()).floatValue());
                hx0Var.p3 = null;
                break;
            case 7:
                hy0 hy0Var = (hy0) this.b;
                hy0Var.x.setVisibility(8);
                hy0Var.F.setImageDrawable(null);
                break;
            case 8:
                int i10 = 0;
                while (true) {
                    oy0[] oy0VarArr = (oy0[]) this.b;
                    if (i10 >= oy0VarArr.length) {
                        break;
                    } else {
                        oy0 oy0Var = oy0VarArr[i10];
                        if (oy0Var != null) {
                            oy0Var.d = false;
                        }
                        i10++;
                    }
                }
            case 9:
                super.onAnimationEnd(animator);
                ((py0) this.b).H = null;
                break;
            case 10:
                ((sy0) this.b).e = false;
                break;
            case 11:
                ((a11) this.b).setVisibility(4);
                break;
            case 12:
                ((m21) this.b).setVisibility(8);
                break;
            case 13:
                org.telegram.ui.u7 u7Var = ((f31) this.b).f;
                u7Var.setScaleX(1.0f);
                u7Var.setScaleY(1.0f);
                u7Var.invalidate();
                break;
            case 14:
                j31 j31Var = (j31) this.b;
                j31Var.K = 1.0f;
                j31Var.h.invalidate();
                break;
            case 15:
                ((r51) this.b).L = null;
                break;
            case 16:
                UndoView undoView = (UndoView) this.b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                break;
            case 17:
                y61 y61Var = (y61) this.b;
                if (y61Var.a.getTag() == null) {
                    y61Var.a.setVisibility(4);
                    break;
                }
                break;
            case 18:
                super.onAnimationEnd(animator);
                z61 z61Var = (z61) this.b;
                z61Var.b = 0.0f;
                z61Var.setTranslationY(0.0f);
                z61Var.a = null;
                break;
            case 19:
                u81 u81Var = (u81) this.b;
                u81Var.J = false;
                u81Var.setEnabled(true);
                t81 t81Var = u81Var.y;
                if (t81Var != null) {
                    ((l2.h) t81Var).z(1.0f);
                }
                u81Var.invalidate();
                break;
            case 20:
                ((o91) this.b).e0 = null;
                break;
            case 21:
                ((q91) this.b).K = null;
                break;
            case 22:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.b).view.setEnabled(true);
                break;
            case 23:
                org.telegram.ui.Components.voip.t tVar = ((org.telegram.ui.Components.voip.o) this.b).s0;
                if (tVar.x0.getParent() != null) {
                    tVar.a.removeView(tVar.x0);
                    break;
                }
                break;
            case 24:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.w0 w0Var = (org.telegram.ui.Components.voip.w0) this.b;
                if (w0Var.getParent() != null) {
                    ((ViewGroup) w0Var.getParent()).removeView(w0Var);
                    break;
                }
                break;
            case 25:
                si1 si1Var = (si1) this.b;
                if (!si1Var.a) {
                    si1Var.V.v.S = true;
                    si1Var.V.v.invalidate();
                    break;
                }
                break;
            case 26:
                org.telegram.ui.Components.voip.p1 p1Var = (org.telegram.ui.Components.voip.p1) this.b;
                p1Var.i = false;
                p1Var.l.setAlpha(35);
                p1Var.k.setAlpha(102);
                p1Var.j.setAlpha(35);
                p1Var.c();
                break;
            case 27:
                org.telegram.ui.Components.voip.t1 t1Var = ((org.telegram.ui.Components.voip.r1) this.b).c;
                t1Var.O = false;
                t1Var.requestLayout();
                break;
            case 28:
                org.telegram.ui.Components.voip.r2 r2Var = (org.telegram.ui.Components.voip.r2) this.b;
                r2Var.N = 0.0f;
                r2Var.O = 0.0f;
                org.telegram.ui.Components.voip.q2 q2Var = r2Var.d;
                q2Var.setScaleX(r2Var.T);
                q2Var.setScaleY(r2Var.T);
                TextureView textureView = r2Var.e;
                if (textureView != null) {
                    textureView.setScaleX(r2Var.U);
                    textureView.setScaleY(r2Var.U);
                }
                r2Var.setTranslationY(0.0f);
                r2Var.setTranslationX(0.0f);
                r2Var.W = r2Var.V;
                r2Var.b0 = null;
                break;
            default:
                org.telegram.ui.Components.voip.u2 u2Var = (org.telegram.ui.Components.voip.u2) this.b;
                u2Var.Q = u2Var.P ? 1.0f : 0.0f;
                u2Var.a(u2Var.R, u2Var.S);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 22:
                super.onAnimationStart(animator);
                ((TransitionValues) this.b).view.setEnabled(false);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public zn0(ct0 ct0Var, s4.o0 o0Var) {
        this.a = 4;
        this.b = ct0Var;
    }
}
