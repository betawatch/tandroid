package mh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xa0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class ua extends AnimatorListenerAdapter {
    public final /* synthetic */ ng.o0 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ oh.o0[] c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ RectF e;
    public final /* synthetic */ Runnable f;
    public final /* synthetic */ eb h;

    public ua(eb ebVar, ng.o0 o0Var, View view, oh.o0[] o0VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = ebVar;
        this.a = o0Var;
        this.b = view;
        this.c = o0VarArr;
        this.d = zArr;
        this.e = rectF;
        this.f = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        xa0 xa0Var;
        eb ebVar = this.h;
        fg.i iVar = ebVar.G;
        iVar.setVisibility(4);
        iVar.setPaused(true);
        ng.o0 o0Var = this.a;
        if (o0Var != null) {
            o0Var.l = true;
        }
        View view = this.b;
        if (view != null) {
            view.invalidate();
        }
        oh.o0 o0Var2 = this.c[0];
        if (o0Var2 != null) {
            o0Var2.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.h3*/.dismissInternal();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.e;
            LaunchActivity.b0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                ebVar.container.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity == null || (xa0Var = launchActivity.u0) == null) {
            return;
        }
        xa0Var.c(true);
    }
}
