package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.cj;
import org.telegram.messenger.dj;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.st0;
import org.telegram.ui.an;
import org.telegram.ui.bh;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class b5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b5(st0 st0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i7, int i10) {
        this.a = i10;
        this.e = st0Var;
        this.c = viewGroup;
        this.d = viewGroup2;
        this.b = i7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                if (this.b != 0) {
                    ((View) this.c).setTranslationY(0.0f);
                    break;
                }
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
                o5 o5Var = (o5) this.e;
                o5Var.H0 = o5Var.I0;
                o5Var.I0 = -1;
                o5Var.F0.invalidate();
                View view = (View) this.c;
                if (view != null && ((View) this.d) != null) {
                    view.setVisibility(8);
                }
                if (animator == o5Var.K0) {
                    o5Var.K0 = null;
                    break;
                }
                break;
            case 1:
                animator.removeAllListeners();
                mi.l lVar = (mi.l) this.e;
                v4.d1 d1Var = (v4.d1) this.d;
                lVar.X(d1Var.a);
                View view2 = d1Var.a;
                if (view2 instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view2;
                    if (q1Var.nb) {
                        q1Var.nb = false;
                        q1Var.setVisibility(0);
                    }
                    dj currentMessagesGroup = q1Var.getCurrentMessagesGroup();
                    if (currentMessagesGroup != null) {
                        cj cjVar = currentMessagesGroup.m;
                        cjVar.n = 1.0f;
                        cjVar.h = 0.0f;
                        cjVar.f = 0.0f;
                        cjVar.g = 0.0f;
                        cjVar.e = 0.0f;
                        cjVar.j = false;
                    }
                }
                if (lVar.z.remove(d1Var)) {
                    lVar.v(d1Var);
                    lVar.G();
                    break;
                }
                break;
            case 2:
                an anVar = (an) this.e;
                anVar.e6 = true;
                ((org.telegram.ui.ActionBar.f2) anVar).fragmentBeginToShow = true;
                anVar.oa = null;
                org.telegram.messenger.g0.i3(new bh(this, 1), 32L);
                super.onAnimationEnd(animator);
                anVar.l1.invalidate();
                anVar.l1.setSkipBackgroundDrawing(false);
                anVar.la = false;
                an anVar2 = (an) this.c;
                anVar2.na = 0.0f;
                anVar2.fragmentView.invalidate();
                anVar2.z0.invalidate();
                anVar2.ma = null;
                anVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                anVar.o1.setTranslationY(0.0f);
                anVar2.o1.setTranslationY(0.0f);
                anVar2.o1.getAvatarImageView().setTranslationY(0.0f);
                anVar.o1.getAvatarImageView().setScaleX(1.0f);
                anVar.o1.getAvatarImageView().setScaleY(1.0f);
                anVar.o1.getAvatarImageView().setAlpha(1.0f);
                anVar2.o1.getAvatarImageView().setScaleX(1.0f);
                anVar2.o1.getAvatarImageView().setScaleY(1.0f);
                anVar2.o1.getAvatarImageView().setAlpha(1.0f);
                lg lgVar = anVar2.a1;
                if (lgVar != null) {
                    lgVar.setAlpha(1.0f);
                    break;
                }
                break;
            default:
                tg.g0 g0Var = (tg.g0) this.e;
                g0Var.P0 = g0Var.Q0;
                g0Var.Q0 = -1;
                g0Var.O0.invalidate();
                View view3 = (View) this.c;
                if (view3 != null && ((View) this.d) != null) {
                    view3.setVisibility(8);
                }
                if (animator == g0Var.S0) {
                    g0Var.S0 = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view;
        int i7;
        View view2;
        switch (this.a) {
            case 0:
                o5 o5Var = (o5) this.e;
                tg.m1 m1Var = o5Var.M0;
                if (((View) this.c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.b != 2) {
                    sg.h currentBrush = o5Var.x0.getCurrentBrush();
                    if (!(currentBrush instanceof sg.b) && !(currentBrush instanceof sg.d)) {
                        m1Var.b(0.05f, 1.0f);
                        break;
                    } else {
                        m1Var.b(0.4f, 1.75f);
                        break;
                    }
                } else {
                    m1Var.b(0.5f, 2.0f);
                    break;
                }
                break;
            case 1:
                ((mi.l) this.e).getClass();
                break;
            case 2:
                super.onAnimationStart(animator);
                i7 = ((org.telegram.ui.ActionBar.f2) ((an) this.e)).currentAccount;
                this.b = qs.f(i7).q(null, this.b, true);
                break;
            default:
                tg.g0 g0Var = (tg.g0) this.e;
                tg.m1 m1Var2 = g0Var.U0;
                if (((View) this.c) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.b != 2) {
                    sg.h currentBrush2 = g0Var.F0.getCurrentBrush();
                    if (!(currentBrush2 instanceof sg.b) && !(currentBrush2 instanceof sg.d)) {
                        m1Var2.b(0.05f, 1.0f);
                        break;
                    } else {
                        m1Var2.b(0.4f, 1.75f);
                        break;
                    }
                } else {
                    m1Var2.b(0.5f, 2.0f);
                    break;
                }
                break;
        }
    }

    public b5(mi.l lVar, v4.d1 d1Var, int i7, View view) {
        this.a = 1;
        this.e = lVar;
        this.d = d1Var;
        this.b = i7;
        this.c = view;
    }

    public b5(an anVar, an anVar2, Runnable runnable) {
        this.a = 2;
        this.e = anVar;
        this.c = anVar2;
        this.d = runnable;
    }
}
