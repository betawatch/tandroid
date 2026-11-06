package e2;

import a8.ia;
import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class u0 extends d1 {
    public static final String c;
    public final float b;

    static {
        String str = h2.m0.a;
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
        ia.e("percent must be in the range of [0, 100]", f10 >= 0.0f && f10 <= 100.0f);
        this.b = f10;
    }
}
