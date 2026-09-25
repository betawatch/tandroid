package cc;

import v7.a7;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public abstract class j {
    public final float a;
    public final float b;

    public j(float f7, float f10) {
        this.a = f7;
        this.b = f10;
    }

    public static float a(j jVar, j jVar2) {
        return a7.a(jVar.a, jVar.b, jVar2.a, jVar2.b);
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
