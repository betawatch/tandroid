package jh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.oa0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class ta extends AnimatorListenerAdapter {
    public final /* synthetic */ kg.o0 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ lh.n0[] c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ RectF e;
    public final /* synthetic */ Runnable f;
    public final /* synthetic */ db h;

    public ta(db dbVar, kg.o0 o0Var, View view, lh.n0[] n0VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = dbVar;
        this.a = o0Var;
        this.b = view;
        this.c = n0VarArr;
        this.d = zArr;
        this.e = rectF;
        this.f = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        oa0 oa0Var;
        db dbVar = this.h;
        cg.i iVar = dbVar.F;
        iVar.setVisibility(4);
        iVar.setPaused(true);
        kg.o0 o0Var = this.a;
        if (o0Var != null) {
            o0Var.l = true;
        }
        View view = this.b;
        if (view != null) {
            view.invalidate();
        }
        lh.n0 n0Var = this.c[0];
        if (n0Var != null) {
            n0Var.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.f3*/.dismissInternal();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.e;
            LaunchActivity.b0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                dbVar.container.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity == null || (oa0Var = launchActivity.t0) == null) {
            return;
        }
        oa0Var.c(true);
    }
}
