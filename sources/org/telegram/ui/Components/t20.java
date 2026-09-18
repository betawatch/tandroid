package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.kb1;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class t20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ View d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public t20(kb1 kb1Var, ui uiVar, org.telegram.ui.Cells.t1 t1Var, org.telegram.ui.nk nkVar, org.telegram.ui.bo boVar) {
        this.f = kb1Var;
        this.b = uiVar;
        this.c = t1Var;
        this.d = nkVar;
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
                kb1 kb1Var = (kb1) this.f;
                kb1Var.D.unlock();
                ui uiVar = (ui) this.b;
                ((ArrayList) uiVar.c).remove(kb1Var);
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
                x5.release((View) null, kb1Var.H);
                break;
        }
    }

    public t20(x20 x20Var, ai.f0 f0Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.w7 w7Var) {
        this.b = x20Var;
        this.c = f0Var;
        this.d = frameLayout;
        this.f = windowManager;
        this.e = w7Var;
    }
}
