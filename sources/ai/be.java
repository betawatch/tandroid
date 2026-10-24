package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.pa0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class be extends AnimatorListenerAdapter {
    public final /* synthetic */ ah.g1 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ci.q0[] c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ RectF e;
    public final /* synthetic */ Runnable f;
    public final /* synthetic */ me h;

    public be(me meVar, ah.g1 g1Var, View view, ci.q0[] q0VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = meVar;
        this.a = g1Var;
        this.b = view;
        this.c = q0VarArr;
        this.d = zArr;
        this.e = rectF;
        this.f = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        pa0 pa0Var;
        me meVar = this.h;
        ae aeVar = meVar.K;
        aeVar.setVisibility(4);
        aeVar.setPaused(true);
        ah.g1 g1Var = this.a;
        if (g1Var != null) {
            g1Var.l = true;
        }
        View view = this.b;
        if (view != null) {
            view.invalidate();
        }
        ci.q0 q0Var = this.c[0];
        if (q0Var != null) {
            q0Var.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.h3*/.dismissInternal();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.e;
            LaunchActivity.c0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                meVar.container.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.J1;
        if (launchActivity == null || (pa0Var = launchActivity.x0) == null) {
            return;
        }
        pa0Var.c(true);
    }
}
