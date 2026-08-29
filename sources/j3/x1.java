package j3;

import java.util.Locale;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class x1 implements g {
    public static final x1 d = new x1(1.0f, 1.0f);
    public final float a;
    public final float b;
    public final int c;

    static {
        int i10 = f5.d0.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public x1(float f9, float f10) {
        f5.a.f(f9 > 0.0f);
        f5.a.f(f10 > 0.0f);
        this.a = f9;
        this.b = f10;
        this.c = Math.round(f9 * 1000.0f);
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
        int i10 = f5.d0.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
