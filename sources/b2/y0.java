package b2;

import a8.yb;
import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class y0 extends h1 {
    public static final String c;
    public final float b;

    static {
        String str = e2.n0.a;
        c = Integer.toString(1, 36);
    }

    public y0() {
        this.b = -1.0f;
    }

    @Override // b2.h1
    public final boolean b() {
        return this.b != -1.0f;
    }

    @Override // b2.h1
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(h1.a, 1);
        bundle.putFloat(c, this.b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y0) {
            return this.b == ((y0) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.b));
    }

    public y0(float f7) {
        yb.f("percent must be in the range of [0, 100]", f7 >= 0.0f && f7 <= 100.0f);
        this.b = f7;
    }
}
