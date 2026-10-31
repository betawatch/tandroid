package ig;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z extends AnimatorListenerAdapter {
    public final /* synthetic */ u0 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ h c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Runnable e;
    public final /* synthetic */ a0 f;

    public z(a0 a0Var, u0 u0Var, float f7, h hVar, boolean z10, Runnable runnable) {
        this.f = a0Var;
        this.a = u0Var;
        this.b = f7;
        this.c = hVar;
        this.d = z10;
        this.e = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        b1 b1Var;
        a0 a0Var = this.f;
        a0Var.x = null;
        r0 r0Var = new r0(new u0[]{this.a});
        c1 c1Var = a0Var.a;
        int currentColor = c1Var.getCurrentColor();
        float f7 = this.b * 1.0f;
        r0Var.c = currentColor;
        r0Var.d = f7;
        h hVar = this.c;
        r0Var.e = hVar;
        hVar.getClass();
        int currentColor2 = hVar instanceof d ? -1 : c1Var.getCurrentColor();
        q0 painting = c1Var.getPainting();
        boolean z10 = this.d;
        painting.c(r0Var, currentColor2, z10, null);
        if (z10 && (b1Var = c1Var.a) != null) {
            b1Var.n();
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
