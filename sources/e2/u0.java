package e2;

import a8.la;
import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class u0 extends d1 {
    public static final String c;
    public final float b;

    static {
        String str = h2.l0.a;
        c = Integer.toString(1, 36);
    }

    public u0() {
        this.b = -1.0f;
    }

    @Override // e2.d1
    public final boolean b() {
        return this.b != -1.0f;
    }

    @Override // e2.d1
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(d1.a, 1);
        bundle.putFloat(c, this.b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u0) {
            return this.b == ((u0) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.b));
    }

    public u0(float f10) {
        la.e("percent must be in the range of [0, 100]", f10 >= 0.0f && f10 <= 100.0f);
        this.b = f10;
    }
}
