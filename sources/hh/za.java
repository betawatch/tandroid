package hh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.pa0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class za extends AnimatorListenerAdapter {
    public final /* synthetic */ ig.o0 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ jh.n0[] c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ RectF e;
    public final /* synthetic */ Runnable f;
    public final /* synthetic */ jb h;

    public za(jb jbVar, ig.o0 o0Var, View view, jh.n0[] n0VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = jbVar;
        this.a = o0Var;
        this.b = view;
        this.c = n0VarArr;
        this.d = zArr;
        this.e = rectF;
        this.f = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        pa0 pa0Var;
        jb jbVar = this.h;
        ag.k kVar = jbVar.F;
        kVar.setVisibility(4);
        kVar.setPaused(true);
        ig.o0 o0Var = this.a;
        if (o0Var != null) {
            o0Var.l = true;
        }
        View view = this.b;
        if (view != null) {
            view.invalidate();
        }
        jh.n0 n0Var = this.c[0];
        if (n0Var != null) {
            n0Var.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.e3*/.dismissInternal();
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
        if (launchActivity == null || (pa0Var = launchActivity.t0) == null) {
            return;
        }
        pa0Var.c(true);
    }
}
