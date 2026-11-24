// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class g33 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ j33 e;

    public g33(j33 j33Var, boolean z, boolean z2, boolean z3, boolean z4) {
        this.e = j33Var;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        j33 j33Var = this.e;
        j33Var.G = false;
        if (this.a) {
            return;
        }
        j33Var.d(this.b, this.c, this.d, true);
    }
}
