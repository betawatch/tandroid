package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.db1;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class x20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ View d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public x20(db1 db1Var, wi wiVar, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.jk jkVar, org.telegram.ui.yn ynVar) {
        this.f = db1Var;
        this.b = wiVar;
        this.c = u1Var;
        this.d = jkVar;
        this.e = ynVar;
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
                db1 db1Var = (db1) this.f;
                db1Var.D.unlock();
                wi wiVar = (wi) this.b;
                ((ArrayList) wiVar.c).remove(db1Var);
                wiVar.a();
                ((ViewGroup) wiVar.d).invalidate();
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.c;
                u1Var.setEnterTransitionInProgress(false);
                u1Var.getTransitionParams().D0.set(u1Var.getBackgroundDrawableLeft(), u1Var.getBackgroundDrawableTop(), u1Var.getBackgroundDrawableRight(), u1Var.getBackgroundDrawableBottom());
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                chatActivityEnterView.setTextTransitionIsRunning(false);
                chatActivityEnterView.getEditField().setAlpha(1.0f);
                org.telegram.ui.yn ynVar = (org.telegram.ui.yn) this.e;
                ((to[]) ynVar.Y.b)[0].c.setAlpha(1.0f);
                ((to[]) ynVar.Y.b)[0].d.setAlpha(1.0f);
                z5.release((View) null, db1Var.H);
                break;
        }
    }

    public x20(b30 b30Var, ai.f0 f0Var, FrameLayout frameLayout, WindowManager windowManager, org.telegram.ui.x7 x7Var) {
        this.b = b30Var;
        this.c = f0Var;
        this.d = frameLayout;
        this.f = windowManager;
        this.e = x7Var;
    }
}
