// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class f81 extends AnimatorListenerAdapter {
    public final /* synthetic */ i81 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ g81 h;

    public f81(g81 g81Var, i81 i81Var, float f, float f2, float f3, int i, boolean z) {
        this.h = g81Var;
        this.a = i81Var;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = i;
        this.f = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        float f = this.b;
        i81 i81Var = this.a;
        i81Var.a = f;
        i81Var.b = this.c;
        i81Var.c = this.d;
        this.h.invalidate();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g81 g81Var = this.h;
        SparseArray sparseArray = g81Var.w;
        int i = this.e;
        sparseArray.remove(i);
        if (this.f) {
            return;
        }
        g81Var.x.remove(i);
    }
}
