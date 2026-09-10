package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class rm extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rm(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 23:
                ((zg0) this.b).h = null;
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
                wm wmVar = (wm) this.b;
                xm xmVar = wmVar.P;
                xmVar.J = null;
                xmVar.K = false;
                wmVar.invalidate();
                break;
            case 1:
                sp spVar = (sp) this.b;
                bi.gd gdVar = spVar.R;
                if (gdVar != null) {
                    if (gdVar.getParent() != null) {
                        ((ViewGroup) spVar.R.getParent()).removeView(spVar.R);
                    }
                    spVar.R = null;
                }
                spVar.T = null;
                super.onAnimationEnd(animator);
                break;
            case 2:
                CheckBox checkBox = (CheckBox) this.b;
                if (animator.equals(checkBox.s)) {
                    checkBox.s = null;
                }
                if (!checkBox.x) {
                    checkBox.G = null;
                    break;
                }
                break;
            case 3:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.b;
                if (animator.equals(checkBoxBase.p)) {
                    checkBoxBase.p = null;
                }
                if (!checkBoxBase.q) {
                    checkBoxBase.C = null;
                    break;
                }
                break;
            case 4:
                sq sqVar = (sq) this.b;
                if (sqVar.K == sqVar.L) {
                    sqVar.G.setVisibility(4);
                }
                sqVar.y = null;
                break;
            case 5:
                br brVar = (br) this.b;
                brVar.l = 1.0f;
                brVar.o = null;
                brVar.p = null;
                brVar.q = null;
                View view = brVar.H;
                if (view != null) {
                    if (brVar.h == 0 && brVar.G) {
                        view.setVisibility(8);
                    }
                    brVar.H.invalidate();
                }
                brVar.c = -1;
                break;
            case 6:
                nu nuVar = (nu) this.b;
                nuVar.O = false;
                nuVar.d.setTranslationY(0.0f);
                nuVar.d.setAlpha(0.0f);
                nuVar.c(0.0f);
                nuVar.R = 0.0f;
                nuVar.j();
                break;
            case 7:
                ((vu) this.b).a.O = false;
                break;
            case 8:
                super.onAnimationEnd(animator);
                ((nv) this.b).d = null;
                break;
            case 9:
                ((rz) this.b).W = null;
                break;
            case 10:
                super.onAnimationEnd(animator);
                ((az) this.b).n = null;
                break;
            case 11:
                ((p00) this.b).a();
                break;
            case 12:
                r00 r00Var = (r00) this.b;
                r00Var.U = r00Var.c0;
                r00Var.b0 = r00Var.f0;
                r00Var.V = r00Var.d0;
                r00Var.W = r00Var.e0;
                r00Var.c0 = -1;
                r00Var.d0 = -1;
                r00Var.e0 = -1;
                r00Var.f0 = -1;
                break;
            case 13:
                g10 g10Var = (g10) this.b;
                g10Var.s = 1.0f;
                g10Var.invalidate();
                break;
            case 14:
                w70 w70Var = (w70) this.b;
                u70 u70Var = w70Var.x;
                if (u70Var != null) {
                    u70Var.setProgress(1.0f);
                    w70Var.x.invalidate();
                }
                w70Var.m0 = null;
                break;
            case 15:
                s00 s00Var = (s00) this.b;
                ((f80) s00Var.e).E = false;
                TextView[] textViewArr = (TextView[]) s00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
            case 16:
                u80 u80Var = (u80) this.b;
                if (!u80Var.f) {
                    u80Var.c.setVisibility(8);
                    break;
                }
                break;
            case 17:
                b90 b90Var = (b90) this.b;
                FrameLayout frameLayout = b90Var.b;
                bi.s7 s7Var = (bi.s7) b90Var.c;
                if (s7Var.getParent() != null) {
                    frameLayout.removeView(s7Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.ha) b90Var.d);
                break;
            case 18:
                yb0 yb0Var = (yb0) this.b;
                yb0Var.c0.h = null;
                yb0Var.e(yb0Var.S, yb0Var.R);
                break;
            case 19:
                NumberTextView numberTextView = (NumberTextView) this.b;
                numberTextView.d = null;
                numberTextView.b.clear();
                break;
            case 20:
                be0 be0Var = (be0) this.b;
                be0Var.setVisibility(8);
                be0Var.h();
                be0Var.P = 0.0f;
                be0Var.f(0.0f);
                be0Var.setAlpha(0.0f);
                break;
            case 21:
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                if (animatorSet != null) {
                    animatorSet.start();
                    break;
                }
                break;
            case 22:
                kf kfVar = (kf) this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((bi.oa) kfVar.c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((bi.oa) kfVar.c).e = null;
                    break;
                }
                break;
            case 23:
                break;
            case 24:
                eh0 eh0Var = (eh0) this.b;
                eh0Var.f = false;
                eh0Var.F = null;
                break;
            case 25:
                ((si0) this.b).b();
                break;
            case 26:
                ((zj0) this.b).h.setVisibility(8);
                break;
            case 27:
                vl0 vl0Var = (vl0) this.b;
                View view2 = vl0Var.c1;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                if (vl0Var.a1()) {
                    vl0Var.invalidate();
                    break;
                }
                break;
            case 28:
                sm0 sm0Var = (sm0) this.b;
                if (sm0Var.s != null) {
                    sm0Var.j();
                    sm0Var.s.invalidate();
                    sm0Var.e.invalidate();
                    sm0Var.invalidate();
                    sm0Var.s = null;
                    break;
                }
                break;
            default:
                ((wm0) this.b).d = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 29:
                wm0 wm0Var = (wm0) this.b;
                wm0Var.d = true;
                if (wm0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) wm0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
