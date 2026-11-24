// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class if7 {
    public final byte a;
    public final byte b;
    public final float c;

    /* JADX WARN: Multi-variable type inference failed */
    public if7(float f, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    public static if7 a(int i) {
        int i2 = (i >> 13) & 7;
        if (i2 == 0) {
            return null;
        }
        return new if7(((i & 511) * ((i & 512) != 0 ? -1 : 1)) / 10.0f, i2, (i >> 10) & 7);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof if7)) {
            return false;
        }
        if7 if7Var = (if7) obj;
        return this.a == if7Var.a && this.b == if7Var.b && Float.compare(this.c, if7Var.c) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.c) + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "GainField{name=" + ((int) this.a) + ", originator=" + ((int) this.b) + ", gain=" + this.c + '}';
    }
}
