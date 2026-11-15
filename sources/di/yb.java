package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.r80;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class yb extends AnimatorListenerAdapter {
    public final /* synthetic */ ch.n0 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ fi.n0[] c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ RectF e;
    public final /* synthetic */ Runnable f;
    public final /* synthetic */ ic h;

    public yb(ic icVar, ch.n0 n0Var, View view, fi.n0[] n0VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = icVar;
        this.a = n0Var;
        this.b = view;
        this.c = n0VarArr;
        this.d = zArr;
        this.e = rectF;
        this.f = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        r80 r80Var;
        ic icVar = this.h;
        xb xbVar = icVar.F1;
        xbVar.setVisibility(4);
        xbVar.setPaused(true);
        ch.n0 n0Var = this.a;
        if (n0Var != null) {
            n0Var.k = true;
        }
        View view = this.b;
        if (view != null) {
            view.invalidate();
        }
        fi.n0 n0Var2 = this.c[0];
        if (n0Var2 != null) {
            n0Var2.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.u2*/.L();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.e;
            LaunchActivity.b0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                icVar.c.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null || (r80Var = launchActivity.w0) == null) {
            return;
        }
        r80Var.c(true);
    }
}
