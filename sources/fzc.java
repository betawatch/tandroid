// default package

import android.view.WindowInsetsAnimation;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class fzc extends gzc {
    public final WindowInsetsAnimation e;

    public fzc(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    public static iq5 e(WindowInsetsAnimation.Bounds bounds) {
        return iq5.c(bounds.getUpperBound());
    }

    public static iq5 f(WindowInsetsAnimation.Bounds bounds) {
        return iq5.c(bounds.getLowerBound());
    }

    public static void g(FrameLayout frameLayout, uyc uycVar) {
        frameLayout.setWindowInsetsAnimationCallback(new ezc(uycVar));
    }

    @Override // gzc
    public final long a() {
        return this.e.getDurationMillis();
    }

    @Override // gzc
    public final float b() {
        return this.e.getInterpolatedFraction();
    }

    @Override // gzc
    public final int c() {
        return this.e.getTypeMask();
    }

    @Override // gzc
    public final void d(float f) {
        this.e.setFraction(f);
    }
}
