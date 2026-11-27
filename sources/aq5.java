// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class aq5 extends AnimatorListenerAdapter {
    public final /* synthetic */ vg8 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ v01 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ja9 e;
    public final /* synthetic */ bq5 f;

    public aq5(bq5 bq5Var, vg8 vg8Var, float f, v01 v01Var, boolean z, ja9 ja9Var) {
        this.f = bq5Var;
        this.a = vg8Var;
        this.b = f;
        this.c = v01Var;
        this.d = z;
        this.e = ja9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        oa9 oa9Var;
        bq5 bq5Var = this.f;
        bq5Var.x = null;
        j18 j18Var = new j18(new vg8[]{this.a});
        pa9 pa9Var = bq5Var.a;
        int currentColor = pa9Var.getCurrentColor();
        float f = this.b * 1.0f;
        j18Var.c = currentColor;
        j18Var.d = f;
        v01 v01Var = this.c;
        j18Var.e = v01Var;
        v01Var.getClass();
        int currentColor2 = v01Var instanceof r01 ? -1 : pa9Var.getCurrentColor();
        nx7 painting = pa9Var.getPainting();
        boolean z = this.d;
        painting.c(j18Var, currentColor2, z, null);
        if (z && (oa9Var = pa9Var.a) != null) {
            oa9Var.O();
        }
        ja9 ja9Var = this.e;
        if (ja9Var != null) {
            ja9Var.run();
        }
    }
}
