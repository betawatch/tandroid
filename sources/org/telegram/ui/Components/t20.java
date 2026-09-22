package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.lb1;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class t20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ View d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public t20(lb1 lb1Var, ui uiVar, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.mk mkVar, org.telegram.ui.zn znVar) {
        this.f = lb1Var;
        this.b = uiVar;
        this.c = u1Var;
        this.d = mkVar;
        this.e = znVar;
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
                lb1 lb1Var = (lb1) this.f;
                lb1Var.D.unlock();
                ui uiVar = (ui) this.b;
                ((ArrayList) uiVar.c).remove(lb1Var);
                uiVar.a();
                ((ViewGroup) uiVar.d).invalidate();
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.c;
                u1Var.setEnterTransitionInProgress(false);
                u1Var.getTransitionParams().D0.set(u1Var.getBackgroundDrawableLeft(), u1Var.getBackgroundDrawableTop(), u1Var.getBackgroundDrawableRight(), u1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.zn znVar = (org.telegram.ui.zn) this.e;
                ((qo[]) znVar.a0.b)[0].c.setAlpha(1.0f);
                ((qo[]) znVar.a0.b)[0].d.setAlpha(1.0f);
                y5.release((View) null, lb1Var.H);
                break;
        }
    }

    public t20(x20 x20Var, ai.f0 f0Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.v7 v7Var) {
        this.b = x20Var;
        this.c = f0Var;
        this.d = frameLayout;
        this.f = windowManager;
        this.e = v7Var;
    }
}
