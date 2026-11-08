package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.r80;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class rd extends AnimatorListenerAdapter {
    public final /* synthetic */ ch.m0 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ di.n0[] c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ RectF e;
    public final /* synthetic */ Runnable f;
    public final /* synthetic */ ce h;

    public rd(ce ceVar, ch.m0 m0Var, View view, di.n0[] n0VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = ceVar;
        this.a = m0Var;
        this.b = view;
        this.c = n0VarArr;
        this.d = zArr;
        this.e = rectF;
        this.f = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        r80 r80Var;
        ce ceVar = this.h;
        qd qdVar = ceVar.B1;
        qdVar.setVisibility(4);
        qdVar.setPaused(true);
        ch.m0 m0Var = this.a;
        if (m0Var != null) {
            m0Var.k = true;
        }
        View view = this.b;
        if (view != null) {
            view.invalidate();
        }
        di.n0 n0Var = this.c[0];
        if (n0Var != null) {
            n0Var.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.v2*/.K();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.e;
            LaunchActivity.b0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                ceVar.c.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null || (r80Var = launchActivity.v0) == null) {
            return;
        }
        r80Var.c(true);
    }
}
