package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class i10 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ View d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public i10(org.telegram.ui.n51 n51Var, bi biVar, org.telegram.ui.Cells.q1 q1Var, org.telegram.ui.sj sjVar, org.telegram.ui.cn cnVar) {
        this.f = n51Var;
        this.b = biVar;
        this.c = q1Var;
        this.d = sjVar;
        this.e = cnVar;
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
                org.telegram.ui.n51 n51Var = (org.telegram.ui.n51) this.f;
                n51Var.D.e();
                bi biVar = (bi) this.b;
                ((ArrayList) biVar.c).remove(n51Var);
                biVar.a();
                ((ViewGroup) biVar.d).invalidate();
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.c;
                q1Var.setEnterTransitionInProgress(false);
                q1Var.getTransitionParams().E0.set(q1Var.getBackgroundDrawableLeft(), q1Var.getBackgroundDrawableTop(), q1Var.getBackgroundDrawableRight(), q1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.cn cnVar = (org.telegram.ui.cn) this.e;
                ((yn[]) cnVar.b0.b)[0].c.setAlpha(1.0f);
                ((yn[]) cnVar.b0.b)[0].d.setAlpha(1.0f);
                q5.release((View) null, n51Var.H);
                break;
        }
    }

    public i10(m10 m10Var, bi.e5 e5Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.w7 w7Var) {
        this.b = m10Var;
        this.c = e5Var;
        this.d = frameLayout;
        this.f = windowManager;
        this.e = w7Var;
    }
}
