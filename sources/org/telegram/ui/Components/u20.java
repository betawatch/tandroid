package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.cb1;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class u20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ View d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public u20(cb1 cb1Var, vi viVar, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.jk jkVar, org.telegram.ui.wn wnVar) {
        this.f = cb1Var;
        this.b = viVar;
        this.c = u1Var;
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
                cb1 cb1Var = (cb1) this.f;
                cb1Var.D.unlock();
                vi viVar = (vi) this.b;
                ((ArrayList) viVar.c).remove(cb1Var);
                viVar.a();
                ((ViewGroup) viVar.d).invalidate();
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.c;
                u1Var.setEnterTransitionInProgress(false);
                u1Var.getTransitionParams().D0.set(u1Var.getBackgroundDrawableLeft(), u1Var.getBackgroundDrawableTop(), u1Var.getBackgroundDrawableRight(), u1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.wn wnVar = (org.telegram.ui.wn) this.e;
                ((ro[]) wnVar.a0.b)[0].c.setAlpha(1.0f);
                ((ro[]) wnVar.a0.b)[0].d.setAlpha(1.0f);
                z5.release((View) null, cb1Var.H);
                break;
        }
    }

    public u20(y20 y20Var, ai.f0 f0Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.u7 u7Var) {
        this.b = y20Var;
        this.c = f0Var;
        this.d = frameLayout;
        this.f = windowManager;
        this.e = u7Var;
    }
}
