package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class oc extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ qc e;

    public oc(qc qcVar, int i3, int i10, int i11, int i12) {
        this.e = qcVar;
        this.a = i3;
        this.b = i10;
        this.c = i11;
        this.d = i12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int f10 = i0.a.f(1.0f, this.a, this.b);
        qc qcVar = this.e;
        qcVar.r = f10;
        qcVar.s = i0.a.f(1.0f, this.c, this.d);
        qcVar.E = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{qcVar.r, qcVar.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        qcVar.invalidate();
    }
}
