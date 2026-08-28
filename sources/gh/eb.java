package gh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class eb extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ gb e;

    public eb(gb gbVar, int i9, int i10, int i11, int i12) {
        this.e = gbVar;
        this.a = i9;
        this.b = i10;
        this.c = i11;
        this.d = i12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.a, this.b);
        gb gbVar = this.e;
        gbVar.r = d;
        gbVar.s = i0.a.d(1.0f, this.c, this.d);
        gbVar.y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{gbVar.r, gbVar.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        gbVar.invalidate();
    }
}
