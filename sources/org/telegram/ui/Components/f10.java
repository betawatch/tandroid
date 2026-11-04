package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f10 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ View d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public f10(org.telegram.ui.a51 a51Var, ai aiVar, org.telegram.ui.Cells.q1 q1Var, org.telegram.ui.mj mjVar, org.telegram.ui.wm wmVar) {
        this.f = a51Var;
        this.b = aiVar;
        this.c = q1Var;
        this.d = mjVar;
        this.e = wmVar;
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
                org.telegram.ui.a51 a51Var = (org.telegram.ui.a51) this.f;
                a51Var.D.e();
                ai aiVar = (ai) this.b;
                ((ArrayList) aiVar.c).remove(a51Var);
                aiVar.a();
                ((ViewGroup) aiVar.d).invalidate();
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.c;
                q1Var.setEnterTransitionInProgress(false);
                q1Var.getTransitionParams().E0.set(q1Var.getBackgroundDrawableLeft(), q1Var.getBackgroundDrawableTop(), q1Var.getBackgroundDrawableRight(), q1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.wm wmVar = (org.telegram.ui.wm) this.e;
                ((yn[]) wmVar.c0.b)[0].c.setAlpha(1.0f);
                ((yn[]) wmVar.c0.b)[0].d.setAlpha(1.0f);
                p5.release((View) null, a51Var.H);
                break;
        }
    }

    public f10(j10 j10Var, ai.o2 o2Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.x7 x7Var) {
        this.b = j10Var;
        this.c = o2Var;
        this.d = frameLayout;
        this.f = windowManager;
        this.e = x7Var;
    }
}
