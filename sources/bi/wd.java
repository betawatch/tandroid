package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class wd extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ yd e;

    public wd(yd ydVar, int i10, int i11, int i12, int i13) {
        this.e = ydVar;
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = i13;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int f7 = i0.a.f(1.0f, this.a, this.b);
        yd ydVar = this.e;
        ydVar.r = f7;
        ydVar.s = i0.a.f(1.0f, this.c, this.d);
        ydVar.y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{ydVar.r, ydVar.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        ydVar.invalidate();
    }
}
