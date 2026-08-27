package hh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class eb extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ gb e;

    public eb(gb gbVar, int i10, int i11, int i12, int i13) {
        this.e = gbVar;
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = i13;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int d = i0.b.d(1.0f, this.a, this.b);
        gb gbVar = this.e;
        gbVar.r = d;
        gbVar.s = i0.b.d(1.0f, this.c, this.d);
        gbVar.y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{gbVar.r, gbVar.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        gbVar.invalidate();
    }
}
