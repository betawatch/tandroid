package b2;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class t0 extends c1 {
    public static final String c;
    public final float b;

    static {
        String str = e2.d0.a;
        c = Integer.toString(1, 36);
    }

    public t0() {
        this.b = -1.0f;
    }

    @Override // b2.c1
    public final boolean b() {
        return this.b != -1.0f;
    }

    @Override // b2.c1
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(c1.a, 1);
        bundle.putFloat(c, this.b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t0) {
            return this.b == ((t0) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.b));
    }

    public t0(float f7) {
        e2.d.a("percent must be in the range of [0, 100]", f7 >= 0.0f && f7 <= 100.0f);
        this.b = f7;
    }
}
