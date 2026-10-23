package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ja0;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class ae extends AnimatorListenerAdapter {
    public final /* synthetic */ ah.g1 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ci.q0[] c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ RectF e;
    public final /* synthetic */ Runnable f;
    public final /* synthetic */ le h;

    public ae(le leVar, ah.g1 g1Var, View view, ci.q0[] q0VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = leVar;
        this.a = g1Var;
        this.b = view;
        this.c = q0VarArr;
        this.d = zArr;
        this.e = rectF;
        this.f = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ja0 ja0Var;
        le leVar = this.h;
        zd zdVar = leVar.K;
        zdVar.setVisibility(4);
        zdVar.setPaused(true);
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
        super/*org.telegram.ui.ActionBar.f3*/.dismissInternal();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.e;
            LaunchActivity.c0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                leVar.container.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null || (ja0Var = launchActivity.x0) == null) {
            return;
        }
        ja0Var.c(true);
    }
}
