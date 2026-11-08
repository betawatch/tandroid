package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class j10 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ View d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public j10(org.telegram.ui.l51 l51Var, ci ciVar, org.telegram.ui.Cells.q1 q1Var, org.telegram.ui.qj qjVar, org.telegram.ui.an anVar) {
        this.f = l51Var;
        this.b = ciVar;
        this.c = q1Var;
        this.d = qjVar;
        this.e = anVar;
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
                l51Var.D.e();
                ci ciVar = (ci) this.b;
                ((ArrayList) ciVar.c).remove(l51Var);
                ciVar.a();
                ((ViewGroup) ciVar.d).invalidate();
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.c;
                q1Var.setEnterTransitionInProgress(false);
                q1Var.getTransitionParams().E0.set(q1Var.getBackgroundDrawableLeft(), q1Var.getBackgroundDrawableTop(), q1Var.getBackgroundDrawableRight(), q1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.an anVar = (org.telegram.ui.an) this.e;
                ((zn[]) anVar.b0.b)[0].c.setAlpha(1.0f);
                ((zn[]) anVar.b0.b)[0].d.setAlpha(1.0f);
                r5.release((View) null, l51Var.H);
                break;
        }
    }

    public j10(n10 n10Var, bi.e5 e5Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.w7 w7Var) {
        this.b = n10Var;
        this.c = e5Var;
        this.d = frameLayout;
        this.f = windowManager;
        this.e = w7Var;
    }
}
