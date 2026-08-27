package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.aa1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class g20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ View d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public g20(aa1 aa1Var, fi fiVar, org.telegram.ui.Cells.s1 s1Var, org.telegram.ui.ck ckVar, org.telegram.ui.rn rnVar) {
        this.f = aa1Var;
        this.b = fiVar;
        this.c = s1Var;
        this.d = ckVar;
        this.e = rnVar;
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
                aa1 aa1Var = (aa1) this.f;
                aa1Var.D.unlock();
                fi fiVar = (fi) this.b;
                ((ArrayList) fiVar.c).remove(aa1Var);
                fiVar.a();
                ((ViewGroup) fiVar.d).invalidate();
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.c;
                s1Var.setEnterTransitionInProgress(false);
                s1Var.getTransitionParams().D0.set(s1Var.getBackgroundDrawableLeft(), s1Var.getBackgroundDrawableTop(), s1Var.getBackgroundDrawableRight(), s1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.rn rnVar = (org.telegram.ui.rn) this.e;
                ((eo[]) rnVar.W.b)[0].c.setAlpha(1.0f);
                ((eo[]) rnVar.W.b)[0].d.setAlpha(1.0f);
                t5.release((View) null, aa1Var.H);
                break;
        }
    }

    public g20(k20 k20Var, ag.p1 p1Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.u7 u7Var) {
        this.b = k20Var;
        this.c = p1Var;
        this.d = frameLayout;
        this.f = windowManager;
        this.e = u7Var;
    }
}
