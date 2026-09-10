package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.pb1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class d30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ View d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public d30(pb1 pb1Var, xi xiVar, org.telegram.ui.Cells.t1 t1Var, org.telegram.ui.ok okVar, org.telegram.ui.eo eoVar) {
        this.f = pb1Var;
        this.b = xiVar;
        this.c = t1Var;
        this.d = okVar;
        this.e = eoVar;
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
                pb1 pb1Var = (pb1) this.f;
                pb1Var.D.unlock();
                xi xiVar = (xi) this.b;
                ((ArrayList) xiVar.c).remove(pb1Var);
                xiVar.a();
                ((ViewGroup) xiVar.d).invalidate();
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.c;
                t1Var.setEnterTransitionInProgress(false);
                t1Var.getTransitionParams().D0.set(t1Var.getBackgroundDrawableLeft(), t1Var.getBackgroundDrawableTop(), t1Var.getBackgroundDrawableRight(), t1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.eo eoVar = (org.telegram.ui.eo) this.e;
                ((vo[]) eoVar.a0.b)[0].c.setAlpha(1.0f);
                ((vo[]) eoVar.a0.b)[0].d.setAlpha(1.0f);
                y5.release((View) null, pb1Var.H);
                break;
        }
    }

    public d30(h30 h30Var, bi.ld ldVar, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.t7 t7Var) {
        this.b = h30Var;
        this.c = ldVar;
        this.d = frameLayout;
        this.f = windowManager;
        this.e = t7Var;
    }
}
