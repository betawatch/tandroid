package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.p80;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class jc extends AnimatorListenerAdapter {
    public final /* synthetic */ dh.l0 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ei.p0[] c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ RectF e;
    public final /* synthetic */ Runnable f;
    public final /* synthetic */ tc h;

    public jc(tc tcVar, dh.l0 l0Var, View view, ei.p0[] p0VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = tcVar;
        this.a = l0Var;
        this.b = view;
        this.c = p0VarArr;
        this.d = zArr;
        this.e = rectF;
        this.f = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        p80 p80Var;
        tc tcVar = this.h;
        ic icVar = tcVar.C1;
        icVar.setVisibility(4);
        icVar.setPaused(true);
        dh.l0 l0Var = this.a;
        if (l0Var != null) {
            l0Var.k = true;
        }
        View view = this.b;
        if (view != null) {
            view.invalidate();
        }
        ei.p0 p0Var = this.c[0];
        if (p0Var != null) {
            p0Var.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.t2*/.K();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.e;
            LaunchActivity.b0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                tcVar.c.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.K1;
        if (launchActivity == null || (p80Var = launchActivity.y0) == null) {
            return;
        }
        p80Var.c(true);
    }
}
