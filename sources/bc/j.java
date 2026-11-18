package bc;

import a8.w9;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public abstract class j {
    public final float a;
    public final float b;

    public j(float f10, float f11) {
        this.a = f10;
        this.b = f11;
    }

    public static float a(j jVar, j jVar2) {
        return w9.a(jVar.a, jVar.b, jVar2.a, jVar2.b);
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
