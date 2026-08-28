package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.ca1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ View d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public d20(ca1 ca1Var, ji jiVar, org.telegram.ui.Cells.t1 t1Var, org.telegram.ui.ak akVar, org.telegram.ui.qn qnVar) {
        this.f = ca1Var;
        this.b = jiVar;
        this.c = t1Var;
        this.d = akVar;
        this.e = qnVar;
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
                ca1 ca1Var = (ca1) this.f;
                ca1Var.D.unlock();
                ji jiVar = (ji) this.b;
                ((ArrayList) jiVar.c).remove(ca1Var);
                jiVar.a();
                ((ViewGroup) jiVar.d).invalidate();
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.c;
                t1Var.setEnterTransitionInProgress(false);
                t1Var.getTransitionParams().D0.set(t1Var.getBackgroundDrawableLeft(), t1Var.getBackgroundDrawableTop(), t1Var.getBackgroundDrawableRight(), t1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.qn qnVar = (org.telegram.ui.qn) this.e;
                ((go[]) qnVar.W.b)[0].c.setAlpha(1.0f);
                ((go[]) qnVar.W.b)[0].d.setAlpha(1.0f);
                t5.release((View) null, ca1Var.H);
                break;
        }
    }

    public d20(h20 h20Var, fh.d2 d2Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.t7 t7Var) {
        this.b = h20Var;
        this.c = d2Var;
        this.d = frameLayout;
        this.f = windowManager;
        this.e = t7Var;
    }
}
