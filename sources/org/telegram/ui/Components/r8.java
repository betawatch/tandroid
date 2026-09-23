package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class r8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r8(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 9:
                ((xl) this.b).a.O = null;
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
                e9 e9Var = ((s8) this.b).b;
                e9Var.f = false;
                e9Var.e.setVisibility(8);
                break;
            case 1:
                j9 j9Var = (j9) this.b;
                if (j9Var.f != null) {
                    j9Var.e = 1.0f;
                    j9Var.n();
                    if (j9Var.g) {
                        j9Var.g = false;
                        Runnable runnable = j9Var.j;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                    j9Var.f();
                }
                j9Var.f = null;
                break;
            case 2:
                ((rf) this.b).f.b0.setVisibility(8);
                break;
            case 3:
                ((ug) this.b).d0 = 1.0f;
                break;
            case 4:
                ((di) this.b).c.s.setVisibility(8);
                break;
            case 5:
                ((fi) this.b).d.v.setVisibility(8);
                break;
            case 6:
                wi wiVar = (wi) this.b;
                wiVar.Z0 = null;
                if (!wiVar.q1) {
                    if (wiVar.X0.getTag() == null && wiVar.Q0 == 0 && !wiVar.T0) {
                        wiVar.a1.setVisibility(4);
                    }
                    wiVar.i1.setVisibility(4);
                    break;
                } else {
                    org.telegram.ui.ActionBar.v0 v0Var = wiVar.e1;
                    if (v0Var != null) {
                        v0Var.setVisibility(4);
                        break;
                    }
                }
                break;
            case 7:
                super.onAnimationEnd(animator);
                pk pkVar = (pk) this.b;
                pkVar.s.setVisibility(8);
                pkVar.n = 0;
                ek ekVar = pkVar.r;
                ekVar.setAlpha(1.0f);
                ekVar.setScaleX(1.0f);
                ekVar.setScaleY(1.0f);
                ekVar.setTranslationX(0.0f);
                ekVar.invalidate();
                break;
            case 8:
                ok okVar = (ok) this.b;
                if (okVar.X.H.getTag() == null) {
                    okVar.X.H.setVisibility(4);
                }
                okVar.X.I = null;
                break;
            case 9:
                xl xlVar = (xl) this.b;
                if (animator.equals(xlVar.a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = xlVar.a;
                    chatAttachAlertPhotoLayout.c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    break;
                }
                break;
            case 10:
                qm qmVar = (qm) this.b;
                rm rmVar = qmVar.P;
                rmVar.J = null;
                rmVar.K = false;
                qmVar.invalidate();
                break;
            case 11:
                np npVar = (np) this.b;
                ci.tb tbVar = npVar.R;
                if (tbVar != null) {
                    if (tbVar.getParent() != null) {
                        ((ViewGroup) npVar.R.getParent()).removeView(npVar.R);
                    }
                    npVar.R = null;
                }
                npVar.T = null;
                super.onAnimationEnd(animator);
                break;
            case 12:
                CheckBox checkBox = (CheckBox) this.b;
                if (animator.equals(checkBox.s)) {
                    checkBox.s = null;
                }
                if (!checkBox.x) {
                    checkBox.G = null;
                    break;
                }
                break;
            case 13:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.b;
                if (animator.equals(checkBoxBase.p)) {
                    checkBoxBase.p = null;
                }
                if (!checkBoxBase.q) {
                    checkBoxBase.C = null;
                    break;
                }
                break;
            case 14:
                nq nqVar = (nq) this.b;
                if (nqVar.K == nqVar.L) {
                    nqVar.G.setVisibility(4);
                }
                nqVar.y = null;
                break;
            case 15:
                wq wqVar = (wq) this.b;
                wqVar.l = 1.0f;
                wqVar.o = null;
                wqVar.p = null;
                wqVar.q = null;
                View view = wqVar.H;
                if (view != null) {
                    if (wqVar.h == 0 && wqVar.G) {
                        view.setVisibility(8);
                    }
                    wqVar.H.invalidate();
                }
                wqVar.c = -1;
                break;
            case 16:
                ku kuVar = (ku) this.b;
                kuVar.O = false;
                kuVar.d.setTranslationY(0.0f);
                kuVar.d.setAlpha(0.0f);
                kuVar.c(0.0f);
                kuVar.R = 0.0f;
                kuVar.j();
                break;
            case 17:
                ((su) this.b).a.O = false;
                break;
            case 18:
                super.onAnimationEnd(animator);
                ((kv) this.b).d = null;
                break;
            case 19:
                ((lz) this.b).W = null;
                break;
            case 20:
                super.onAnimationEnd(animator);
                ((uy) this.b).n = null;
                break;
            case 21:
                ((j00) this.b).a();
                break;
            case 22:
                l00 l00Var = (l00) this.b;
                l00Var.U = l00Var.c0;
                l00Var.b0 = l00Var.f0;
                l00Var.V = l00Var.d0;
                l00Var.W = l00Var.e0;
                l00Var.c0 = -1;
                l00Var.d0 = -1;
                l00Var.e0 = -1;
                l00Var.f0 = -1;
                break;
            case 23:
                z00 z00Var = (z00) this.b;
                z00Var.s = 1.0f;
                z00Var.invalidate();
                break;
            case 24:
                o70 o70Var = (o70) this.b;
                m70 m70Var = o70Var.x;
                if (m70Var != null) {
                    m70Var.setProgress(1.0f);
                    o70Var.x.invalidate();
                }
                o70Var.m0 = null;
                break;
            case 25:
                m00 m00Var = (m00) this.b;
                ((x70) m00Var.e).E = false;
                TextView[] textViewArr = (TextView[]) m00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
            case 26:
                l80 l80Var = (l80) this.b;
                if (!l80Var.f) {
                    l80Var.c.setVisibility(8);
                    break;
                }
                break;
            case 27:
                s80 s80Var = (s80) this.b;
                FrameLayout frameLayout = s80Var.b;
                ci.r6 r6Var = (ci.r6) s80Var.c;
                if (r6Var.getParent() != null) {
                    frameLayout.removeView(r6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.ga) s80Var.d);
                break;
            case 28:
                ob0 ob0Var = (ob0) this.b;
                ob0Var.c0.h = null;
                ob0Var.e(ob0Var.S, ob0Var.R);
                break;
            default:
                NumberTextView numberTextView = (NumberTextView) this.b;
                numberTextView.d = null;
                numberTextView.b.clear();
                break;
        }
    }
}
