package e5;

import d5.f0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class z implements h3.g {
    public static final z e = new z(0, 0, 1.0f, 0);
    public final int a;
    public final int b;
    public final int c;
    public final float d;

    static {
        int i9 = f0.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public z(int i9, int i10, float f10, int i11) {
        this.a = i9;
        this.b = i10;
        this.c = i11;
        this.d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (this.a == zVar.a && this.b == zVar.b && this.c == zVar.c && this.d == zVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.d) + ((((((217 + this.a) * 31) + this.b) * 31) + this.c) * 31);
    }
}
