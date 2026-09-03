package mh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class za extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ bb e;

    public za(bb bbVar, int i10, int i11, int i12, int i13) {
        this.e = bbVar;
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = i13;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.a, this.b);
        bb bbVar = this.e;
        bbVar.r = d;
        bbVar.s = i0.a.d(1.0f, this.c, this.d);
        bbVar.y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{bbVar.r, bbVar.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        bbVar.invalidate();
    }
}
