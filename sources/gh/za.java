package gh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.la0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class za extends AnimatorListenerAdapter {
    public final /* synthetic */ hg.p0 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ih.p0[] c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ RectF e;
    public final /* synthetic */ Runnable f;
    public final /* synthetic */ jb h;

    public za(jb jbVar, hg.p0 p0Var, View view, ih.p0[] p0VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = jbVar;
        this.a = p0Var;
        this.b = view;
        this.c = p0VarArr;
        this.d = zArr;
        this.e = rectF;
        this.f = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        la0 la0Var;
        jb jbVar = this.h;
        dg.q qVar = jbVar.F;
        qVar.setVisibility(4);
        qVar.setPaused(true);
        hg.p0 p0Var = this.a;
        if (p0Var != null) {
            p0Var.l = true;
        }
        View view = this.b;
        if (view != null) {
            view.invalidate();
        }
        ih.p0 p0Var2 = this.c[0];
        if (p0Var2 != null) {
            p0Var2.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.f3*/.dismissInternal();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.e;
            LaunchActivity.b0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                jbVar.container.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity == null || (la0Var = launchActivity.t0) == null) {
            return;
        }
        la0Var.c(true);
    }
}
