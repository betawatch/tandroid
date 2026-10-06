package cc;

import v7.z6;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public abstract class j {
    public final float a;
    public final float b;

    public j(float f7, float f10) {
        this.a = f7;
        this.b = f10;
    }

    public static float a(j jVar, j jVar2) {
        return z6.a(jVar.a, jVar.b, jVar2.a, jVar2.b);
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
