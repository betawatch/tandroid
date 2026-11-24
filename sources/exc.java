// default package

import android.view.WindowInsetsAnimation;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class exc extends fxc {
    public final WindowInsetsAnimation e;

    public exc(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    public static io5 e(WindowInsetsAnimation.Bounds bounds) {
        return io5.c(bounds.getUpperBound());
    }

    public static io5 f(WindowInsetsAnimation.Bounds bounds) {
        return io5.c(bounds.getLowerBound());
    }

    public static void g(FrameLayout frameLayout, twc twcVar) {
        frameLayout.setWindowInsetsAnimationCallback(new dxc(twcVar));
    }

    @Override // fxc
    public final long a() {
        return this.e.getDurationMillis();
    }

    @Override // fxc
    public final float b() {
        return this.e.getInterpolatedFraction();
    }

    @Override // fxc
    public final int c() {
        return this.e.getTypeMask();
    }

    @Override // fxc
    public final void d(float f) {
        this.e.setFraction(f);
    }
}
