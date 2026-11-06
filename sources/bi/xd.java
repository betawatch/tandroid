package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class xd extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ zd e;

    public xd(zd zdVar, int i7, int i10, int i11, int i12) {
        this.e = zdVar;
        this.a = i7;
        this.b = i10;
        this.c = i11;
        this.d = i12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int f10 = i0.a.f(1.0f, this.a, this.b);
        zd zdVar = this.e;
        zdVar.r = f10;
        zdVar.s = i0.a.f(1.0f, this.c, this.d);
        zdVar.D = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{zdVar.r, zdVar.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        zdVar.invalidate();
    }
}
