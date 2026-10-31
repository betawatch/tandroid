package b2;

import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b2 {
    public static final b2 d = new b2(0, 0);
    public static final String e;
    public static final String f;
    public static final String g;
    public final int a;
    public final int b;
    public final float c;

    static {
        String str = e2.l0.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
        g = Integer.toString(3, 36);
    }

    public b2(int i10, int i11) {
        this(1.0f, i10, i11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b2) {
            b2 b2Var = (b2) obj;
            if (this.a == b2Var.a && this.b == b2Var.b && this.c == b2Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.c) + ((((zs.u3 + this.a) * 31) + this.b) * 31);
    }

    public b2(float f7, int i10, int i11) {
        this.a = i10;
        this.b = i11;
        this.c = f7;
    }
}
