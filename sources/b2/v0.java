package b2;

import java.util.Locale;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class v0 {
    public static final v0 d = new v0(1.0f, 1.0f);
    public static final String e;
    public static final String f;
    public final float a;
    public final float b;
    public final int c;

    static {
        String str = e2.d0.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
    }

    public v0(float f7, float f10) {
        e2.d.b(f7 > 0.0f);
        e2.d.b(f10 > 0.0f);
        this.a = f7;
        this.b = f10;
        this.c = Math.round(f7 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v0.class == obj.getClass()) {
            v0 v0Var = (v0) obj;
            if (this.a == v0Var.a && this.b == v0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.b) + ((Float.floatToRawIntBits(this.a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.a), Float.valueOf(this.b)};
        String str = e2.d0.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
