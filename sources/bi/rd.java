package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qa0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class rd extends AnimatorListenerAdapter {
    public final /* synthetic */ bh.v0 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ di.q0[] c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ RectF e;
    public final /* synthetic */ Runnable f;
    public final /* synthetic */ be h;

    public rd(be beVar, bh.v0 v0Var, View view, di.q0[] q0VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = beVar;
        this.a = v0Var;
        this.b = view;
        this.c = q0VarArr;
        this.d = zArr;
        this.e = rectF;
        this.f = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        qa0 qa0Var;
        be beVar = this.h;
        qd qdVar = beVar.K;
        qdVar.setVisibility(4);
        qdVar.setPaused(true);
        bh.v0 v0Var = this.a;
        if (v0Var != null) {
            v0Var.l = true;
        }
        View view = this.b;
        if (view != null) {
            view.invalidate();
        }
        di.q0 q0Var = this.c[0];
        if (q0Var != null) {
            q0Var.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.k3*/.dismissInternal();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.e;
            LaunchActivity.c0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                beVar.container.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity == null || (qa0Var = launchActivity.x0) == null) {
            return;
        }
        qa0Var.c(true);
    }
}
