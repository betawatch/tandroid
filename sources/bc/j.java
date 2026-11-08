package bc;

import a8.r9;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public abstract class j {
    public final float a;
    public final float b;

    public j(float f10, float f11) {
        this.a = f10;
        this.b = f11;
    }

    public static float a(j jVar, j jVar2) {
        return r9.a(jVar.a, jVar.b, jVar2.a, jVar2.b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.a == jVar.a && this.b == jVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (Float.floatToIntBits(this.a) * 31);
    }

    public final String toString() {
        return "(" + this.a + ',' + this.b + ')';
    }
}
