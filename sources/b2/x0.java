package b2;

import android.os.Bundle;
import j$.util.Objects;
import v7.u6;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class x0 extends g1 {
    public static final String c;
    public final float b;

    static {
        String str = e2.m0.a;
        c = Integer.toString(1, 36);
    }

    public x0() {
        this.b = -1.0f;
    }

    @Override // b2.g1
    public final boolean b() {
        return this.b != -1.0f;
    }

    @Override // b2.g1
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(g1.a, 1);
        bundle.putFloat(c, this.b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x0) {
            return this.b == ((x0) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.b));
    }

    public x0(float f7) {
        u6.f("percent must be in the range of [0, 100]", f7 >= 0.0f && f7 <= 100.0f);
        this.b = f7;
    }
}
