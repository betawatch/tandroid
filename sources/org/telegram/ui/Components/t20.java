package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.jb1;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class t20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ View d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public t20(jb1 jb1Var, ui uiVar, org.telegram.ui.Cells.t1 t1Var, org.telegram.ui.mk mkVar, org.telegram.ui.bo boVar) {
        this.f = jb1Var;
        this.b = uiVar;
        this.c = t1Var;
        this.d = mkVar;
        this.e = boVar;
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
                jb1 jb1Var = (jb1) this.f;
                jb1Var.D.unlock();
                ui uiVar = (ui) this.b;
                ((ArrayList) uiVar.c).remove(jb1Var);
                uiVar.a();
                ((ViewGroup) uiVar.d).invalidate();
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.c;
                t1Var.setEnterTransitionInProgress(false);
                t1Var.getTransitionParams().D0.set(t1Var.getBackgroundDrawableLeft(), t1Var.getBackgroundDrawableTop(), t1Var.getBackgroundDrawableRight(), t1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.bo boVar = (org.telegram.ui.bo) this.e;
                ((qo[]) boVar.a0.b)[0].c.setAlpha(1.0f);
                ((qo[]) boVar.a0.b)[0].d.setAlpha(1.0f);
                x5.release((View) null, jb1Var.H);
                break;
        }
    }

    public t20(x20 x20Var, ai.f0 f0Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.u7 u7Var) {
        this.b = x20Var;
        this.c = f0Var;
        this.d = frameLayout;
        this.f = windowManager;
        this.e = u7Var;
    }
}
