package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ View d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public a20(org.telegram.ui.d71 d71Var, ih.e eVar, org.telegram.ui.Cells.q1 q1Var, org.telegram.ui.mk mkVar, org.telegram.ui.un unVar) {
        this.f = d71Var;
        this.b = eVar;
        this.c = q1Var;
        this.d = mkVar;
        this.e = unVar;
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
                org.telegram.ui.d71 d71Var = (org.telegram.ui.d71) this.f;
                d71Var.D.e();
                ih.e eVar = (ih.e) this.b;
                ((ArrayList) eVar.c).remove(d71Var);
                eVar.a();
                ((ViewGroup) eVar.d).invalidate();
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.c;
                q1Var.setEnterTransitionInProgress(false);
                q1Var.getTransitionParams().E0.set(q1Var.getBackgroundDrawableLeft(), q1Var.getBackgroundDrawableTop(), q1Var.getBackgroundDrawableRight(), q1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.un unVar = (org.telegram.ui.un) this.e;
                ((io[]) unVar.b0.b)[0].c.setAlpha(1.0f);
                ((io[]) unVar.b0.b)[0].d.setAlpha(1.0f);
                o5.release((View) null, d71Var.H);
                break;
        }
    }

    public a20(e20 e20Var, jg.l0 l0Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.w7 w7Var) {
        this.b = e20Var;
        this.c = l0Var;
        this.d = frameLayout;
        this.f = windowManager;
        this.e = w7Var;
    }
}
