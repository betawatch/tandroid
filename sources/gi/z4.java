package gi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.hs;
import org.telegram.messenger.ti;
import org.telegram.messenger.ui;
import org.telegram.ui.Components.jg;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.wm;
import org.telegram.ui.xg;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class z4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ z4(rt0 rt0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i3, int i10) {
        this.a = i10;
        this.e = rt0Var;
        this.c = viewGroup;
        this.d = viewGroup2;
        this.b = i3;
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
                m5 m5Var = (m5) this.e;
                m5Var.I0 = m5Var.J0;
                m5Var.J0 = -1;
                m5Var.G0.invalidate();
                View view = (View) this.c;
                if (view != null && ((View) this.d) != null) {
                    view.setVisibility(8);
                }
                if (animator == m5Var.L0) {
                    m5Var.L0 = null;
                    break;
                }
                break;
            case 1:
                animator.removeAllListeners();
                ni.l lVar = (ni.l) this.e;
                u4.d1 d1Var = (u4.d1) this.d;
                lVar.X(d1Var.a);
                View view2 = d1Var.a;
                if (view2 instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view2;
                    if (q1Var.nb) {
                        q1Var.nb = false;
                        q1Var.setVisibility(0);
                    }
                    ui currentMessagesGroup = q1Var.getCurrentMessagesGroup();
                    if (currentMessagesGroup != null) {
                        ti tiVar = currentMessagesGroup.m;
                        tiVar.n = 1.0f;
                        tiVar.h = 0.0f;
                        tiVar.f = 0.0f;
                        tiVar.g = 0.0f;
                        tiVar.e = 0.0f;
                        tiVar.j = false;
                    }
                }
                if (lVar.z.remove(d1Var)) {
                    lVar.v(d1Var);
                    lVar.G();
                    break;
                }
                break;
            case 2:
                wm wmVar = (wm) this.e;
                wmVar.f6 = true;
                ((org.telegram.ui.ActionBar.d2) wmVar).fragmentBeginToShow = true;
                wmVar.pa = null;
                org.telegram.messenger.g0.i3(new xg(this, 1), 32L);
                super.onAnimationEnd(animator);
                wmVar.m1.invalidate();
                wmVar.m1.setSkipBackgroundDrawing(false);
                wmVar.ma = false;
                wm wmVar2 = (wm) this.c;
                wmVar2.oa = 0.0f;
                wmVar2.fragmentView.invalidate();
                wmVar2.A0.invalidate();
                wmVar2.na = null;
                wmVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                wmVar.p1.setTranslationY(0.0f);
                wmVar2.p1.setTranslationY(0.0f);
                wmVar2.p1.getAvatarImageView().setTranslationY(0.0f);
                wmVar.p1.getAvatarImageView().setScaleX(1.0f);
                wmVar.p1.getAvatarImageView().setScaleY(1.0f);
                wmVar.p1.getAvatarImageView().setAlpha(1.0f);
                wmVar2.p1.getAvatarImageView().setScaleX(1.0f);
                wmVar2.p1.getAvatarImageView().setScaleY(1.0f);
                wmVar2.p1.getAvatarImageView().setAlpha(1.0f);
                jg jgVar = wmVar2.b1;
                if (jgVar != null) {
                    jgVar.setAlpha(1.0f);
                    break;
                }
                break;
            default:
                ug.f0 f0Var = (ug.f0) this.e;
                f0Var.Q0 = f0Var.R0;
                f0Var.R0 = -1;
                f0Var.P0.invalidate();
                View view3 = (View) this.c;
                if (view3 != null && ((View) this.d) != null) {
                    view3.setVisibility(8);
                }
                if (animator == f0Var.T0) {
                    f0Var.T0 = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view;
        int i3;
        View view2;
        switch (this.a) {
            case 0:
                m5 m5Var = (m5) this.e;
                ug.l1 l1Var = m5Var.N0;
                if (((View) this.c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.b != 2) {
                    tg.h currentBrush = m5Var.y0.getCurrentBrush();
                    if (!(currentBrush instanceof tg.b) && !(currentBrush instanceof tg.d)) {
                        l1Var.b(0.05f, 1.0f);
                        break;
                    } else {
                        l1Var.b(0.4f, 1.75f);
                        break;
                    }
                } else {
                    l1Var.b(0.5f, 2.0f);
                    break;
                }
                break;
            case 1:
                ((ni.l) this.e).getClass();
                break;
            case 2:
                super.onAnimationStart(animator);
                i3 = ((org.telegram.ui.ActionBar.d2) ((wm) this.e)).currentAccount;
                this.b = hs.f(i3).q(null, this.b, true);
                break;
            default:
                ug.f0 f0Var = (ug.f0) this.e;
                ug.l1 l1Var2 = f0Var.V0;
                if (((View) this.c) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.b != 2) {
                    tg.h currentBrush2 = f0Var.G0.getCurrentBrush();
                    if (!(currentBrush2 instanceof tg.b) && !(currentBrush2 instanceof tg.d)) {
                        l1Var2.b(0.05f, 1.0f);
                        break;
                    } else {
                        l1Var2.b(0.4f, 1.75f);
                        break;
                    }
                } else {
                    l1Var2.b(0.5f, 2.0f);
                    break;
                }
                break;
        }
    }

    public z4(ni.l lVar, u4.d1 d1Var, int i3, View view) {
        this.a = 1;
        this.e = lVar;
        this.d = d1Var;
        this.b = i3;
        this.c = view;
    }

    public z4(wm wmVar, wm wmVar2, Runnable runnable) {
        this.a = 2;
        this.e = wmVar;
        this.c = wmVar2;
        this.d = runnable;
    }
}
