// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class g91 extends AnimatorListenerAdapter {
    public final /* synthetic */ j91 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ h91 h;

    public g91(h91 h91Var, j91 j91Var, float f, float f2, float f3, int i, boolean z) {
        this.h = h91Var;
        this.a = j91Var;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = i;
        this.f = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        float f = this.b;
        j91 j91Var = this.a;
        j91Var.a = f;
        j91Var.b = this.c;
        j91Var.c = this.d;
        this.h.invalidate();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h91 h91Var = this.h;
        SparseArray sparseArray = h91Var.w;
        int i = this.e;
        sparseArray.remove(i);
        if (this.f) {
            return;
        }
        h91Var.x.remove(i);
    }
}
