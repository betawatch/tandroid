package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class t10 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ View d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public t10(org.telegram.ui.l51 l51Var, ri riVar, org.telegram.ui.Cells.q1 q1Var, org.telegram.ui.rj rjVar, org.telegram.ui.bn bnVar) {
        this.f = l51Var;
        this.b = riVar;
        this.c = q1Var;
        this.d = rjVar;
        this.e = bnVar;
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
                org.telegram.ui.l51 l51Var = (org.telegram.ui.l51) this.f;
                l51Var.E.e();
                ri riVar = (ri) this.b;
                ((ArrayList) riVar.c).remove(l51Var);
                riVar.a();
                ((ViewGroup) riVar.d).invalidate();
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.c;
                q1Var.setEnterTransitionInProgress(false);
                q1Var.getTransitionParams().E0.set(q1Var.getBackgroundDrawableLeft(), q1Var.getBackgroundDrawableTop(), q1Var.getBackgroundDrawableRight(), q1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.bn bnVar = (org.telegram.ui.bn) this.e;
                ((qo[]) bnVar.c0.b)[0].c.setAlpha(1.0f);
                ((qo[]) bnVar.c0.b)[0].d.setAlpha(1.0f);
                x5.release((View) null, l51Var.I);
                break;
        }
    }

    public t10(x10 x10Var, bi.a3 a3Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.w7 w7Var) {
        this.b = x10Var;
        this.c = a3Var;
        this.d = frameLayout;
        this.f = windowManager;
        this.e = w7Var;
    }
}
