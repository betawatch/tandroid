// default package

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class fxc {
    public final int a;
    public float b;
    public final Interpolator c;
    public final short d;

    /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
    public fxc(int i, Interpolator interpolator, long j) {
        this.a = i;
        this.c = interpolator;
        this.d = (int) j;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        float f = this.b;
        Interpolator interpolator = this.c;
        return interpolator != null ? interpolator.getInterpolation(f) : f;
    }

    public int c() {
        return this.a;
    }

    public void d(float f) {
        this.b = f;
    }
}
