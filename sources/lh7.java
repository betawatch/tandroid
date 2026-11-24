// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class lh7 {
    public final byte a;
    public final byte b;
    public final float c;

    /* JADX WARN: Multi-variable type inference failed */
    public lh7(float f, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    public static lh7 a(int i) {
        int i2 = (i >> 13) & 7;
        if (i2 == 0) {
            return null;
        }
        return new lh7(((i & 511) * ((i & 512) != 0 ? -1 : 1)) / 10.0f, i2, (i >> 10) & 7);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lh7)) {
            return false;
        }
        lh7 lh7Var = (lh7) obj;
        return this.a == lh7Var.a && this.b == lh7Var.b && Float.compare(this.c, lh7Var.c) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.c) + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "GainField{name=" + ((int) this.a) + ", originator=" + ((int) this.b) + ", gain=" + this.c + '}';
    }
}
