package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.xa1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class v20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ View d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public v20(xa1 xa1Var, li liVar, org.telegram.ui.Cells.t1 t1Var, org.telegram.ui.jk jkVar, org.telegram.ui.xn xnVar) {
        this.f = xa1Var;
        this.b = liVar;
        this.c = t1Var;
        this.d = jkVar;
        this.e = xnVar;
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
                xa1 xa1Var = (xa1) this.f;
                xa1Var.D.unlock();
                li liVar = (li) this.b;
                ((ArrayList) liVar.c).remove(xa1Var);
                liVar.a();
                ((ViewGroup) liVar.d).invalidate();
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.c;
                t1Var.setEnterTransitionInProgress(false);
                t1Var.getTransitionParams().D0.set(t1Var.getBackgroundDrawableLeft(), t1Var.getBackgroundDrawableTop(), t1Var.getBackgroundDrawableRight(), t1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.xn xnVar = (org.telegram.ui.xn) this.e;
                ((oo[]) xnVar.X.b)[0].c.setAlpha(1.0f);
                ((oo[]) xnVar.X.b)[0].d.setAlpha(1.0f);
                u5.release((View) null, xa1Var.H);
                break;
        }
    }

    public v20(a30 a30Var, eg.s2 s2Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.w7 w7Var) {
        this.b = a30Var;
        this.c = s2Var;
        this.d = frameLayout;
        this.f = windowManager;
        this.e = w7Var;
    }
}
