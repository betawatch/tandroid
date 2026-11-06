package e2;

import a8.ia;
import java.util.Locale;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class w0 {
    public static final w0 d = new w0(1.0f, 1.0f);
    public static final String e;
    public static final String f;
    public final float a;
    public final float b;
    public final int c;

    static {
        String str = h2.m0.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
    }

    public w0(float f10, float f11) {
        ia.f(f10 > 0.0f);
        ia.f(f11 > 0.0f);
        this.a = f10;
        this.b = f11;
        this.c = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w0.class == obj.getClass()) {
            w0 w0Var = (w0) obj;
            if (this.a == w0Var.a && this.b == w0Var.b) {
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
        String str = h2.m0.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
