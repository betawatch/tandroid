// default package

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class axc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ gxc a;
    public final /* synthetic */ vxc b;
    public final /* synthetic */ vxc c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public axc(gxc gxcVar, vxc vxcVar, vxc vxcVar2, int i, View view) {
        this.a = gxcVar;
        this.b = vxcVar;
        this.c = vxcVar2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        gxc gxcVar = this.a;
        fxc fxcVar = gxcVar.a;
        fxcVar.d(animatedFraction);
        float b = fxcVar.b();
        PathInterpolator pathInterpolator = cxc.e;
        int i = Build.VERSION.SDK_INT;
        vxc vxcVar = this.b;
        lxc kxcVar = i >= 34 ? new kxc(vxcVar) : i >= 30 ? new jxc(vxcVar) : i >= 29 ? new ixc(vxcVar) : new hxc(vxcVar);
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            sxc sxcVar = vxcVar.a;
            if (i3 == 0) {
                kxcVar.c(i2, sxcVar.f(i2));
            } else {
                io5 f = sxcVar.f(i2);
                io5 f2 = this.c.a.f(i2);
                float f3 = 1.0f - b;
                kxcVar.c(i2, vxc.e(f, (int) (((f.a - f2.a) * f3) + 0.5d), (int) (((f.b - f2.b) * f3) + 0.5d), (int) (((f.c - f2.c) * f3) + 0.5d), (int) (((f.d - f2.d) * f3) + 0.5d)));
            }
        }
        cxc.g(this.e, kxcVar.b(), Collections.singletonList(gxcVar));
    }
}
