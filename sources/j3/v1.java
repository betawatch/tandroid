package j3;

import java.util.Locale;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class v1 implements g {
    public static final v1 d = new v1(1.0f, 1.0f);
    public final float a;
    public final float b;
    public final int c;

    static {
        int i10 = h5.d0.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public v1(float f10, float f11) {
        h5.a.f(f10 > 0.0f);
        h5.a.f(f11 > 0.0f);
        this.a = f10;
        this.b = f11;
        this.c = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v1.class == obj.getClass()) {
            v1 v1Var = (v1) obj;
            if (this.a == v1Var.a && this.b == v1Var.b) {
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
        int i10 = h5.d0.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
