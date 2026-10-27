package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class d30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ View d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public d30(org.telegram.ui.ia1 ia1Var, si siVar, org.telegram.ui.Cells.s1 s1Var, org.telegram.ui.jk jkVar, org.telegram.ui.wn wnVar) {
        this.f = ia1Var;
        this.b = siVar;
        this.c = s1Var;
        this.d = jkVar;
        this.e = wnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                WindowManager windowManager = (WindowManager) this.f;
                View view = this.b;
                if (view.getParent() != null) {
                    view.setVisibility(8);
                    View view2 = this.c;
                    view2.setVisibility(8);
                    View view3 = this.d;
                    view3.setVisibility(8);
                    windowManager.removeView(view);
                    windowManager.removeView(view2);
                    windowManager.removeView(view3);
                    windowManager.removeView((View) this.e);
                    break;
                }
                break;
            default:
                org.telegram.ui.ia1 ia1Var = (org.telegram.ui.ia1) this.f;
                ia1Var.D.unlock();
                si siVar = (si) this.b;
                ((ArrayList) siVar.c).remove(ia1Var);
                siVar.a();
                ((ViewGroup) siVar.d).invalidate();
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.c;
                s1Var.setEnterTransitionInProgress(false);
                s1Var.getTransitionParams().D0.set(s1Var.getBackgroundDrawableLeft(), s1Var.getBackgroundDrawableTop(), s1Var.getBackgroundDrawableRight(), s1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.wn wnVar = (org.telegram.ui.wn) this.e;
                ((dp[]) wnVar.a0.b)[0].c.setAlpha(1.0f);
                ((dp[]) wnVar.a0.b)[0].d.setAlpha(1.0f);
                c6.release((View) null, ia1Var.H);
                break;
        }
    }

    public d30(h30 h30Var, bh.r rVar, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.a8 a8Var) {
        this.b = h30Var;
        this.c = rVar;
        this.d = frameLayout;
        this.f = windowManager;
        this.e = a8Var;
    }
}
