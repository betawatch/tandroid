package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.da1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class p20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ View d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public p20(da1 da1Var, mi miVar, org.telegram.ui.Cells.s1 s1Var, org.telegram.ui.dk dkVar, org.telegram.ui.tn tnVar) {
        this.f = da1Var;
        this.b = miVar;
        this.c = s1Var;
        this.d = dkVar;
        this.e = tnVar;
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
                da1 da1Var = (da1) this.f;
                da1Var.D.unlock();
                mi miVar = (mi) this.b;
                ((ArrayList) miVar.c).remove(da1Var);
                miVar.a();
                ((ViewGroup) miVar.d).invalidate();
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.c;
                s1Var.setEnterTransitionInProgress(false);
                s1Var.getTransitionParams().D0.set(s1Var.getBackgroundDrawableLeft(), s1Var.getBackgroundDrawableTop(), s1Var.getBackgroundDrawableRight(), s1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.tn tnVar = (org.telegram.ui.tn) this.e;
                ((ko[]) tnVar.W.b)[0].c.setAlpha(1.0f);
                ((ko[]) tnVar.W.b)[0].d.setAlpha(1.0f);
                y5.release((View) null, da1Var.H);
                break;
        }
    }

    public p20(t20 t20Var, bg.x2 x2Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.s7 s7Var) {
        this.b = t20Var;
        this.c = x2Var;
        this.d = frameLayout;
        this.f = windowManager;
        this.e = s7Var;
    }
}
