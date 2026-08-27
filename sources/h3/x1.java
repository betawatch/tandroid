package h3;

import java.util.Locale;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class x1 implements g {
    public static final x1 d = new x1(1.0f, 1.0f);
    public final float a;
    public final float b;
    public final int c;

    static {
        int i10 = d5.g0.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public x1(float f10, float f11) {
        d5.a.f(f10 > 0.0f);
        d5.a.f(f11 > 0.0f);
        this.a = f10;
        this.b = f11;
        this.c = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x1.class == obj.getClass()) {
            x1 x1Var = (x1) obj;
            if (this.a == x1Var.a && this.b == x1Var.b) {
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
        int i10 = d5.g0.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
