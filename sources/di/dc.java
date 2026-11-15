package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class dc extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ fc e;

    public dc(fc fcVar, int i7, int i10, int i11, int i12) {
        this.e = fcVar;
        this.a = i7;
        this.b = i10;
        this.c = i11;
        this.d = i12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int f10 = i0.a.f(1.0f, this.a, this.b);
        fc fcVar = this.e;
        fcVar.r = f10;
        fcVar.s = i0.a.f(1.0f, this.c, this.d);
        fcVar.E = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{fcVar.r, fcVar.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        fcVar.invalidate();
    }
}
