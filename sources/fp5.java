// default package

import java.util.Iterator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class fp5 implements Iterable {
    public static final fp5 d = new fp5(1, 0, 1);
    public final int a;
    public final int b;
    public final int c;

    public fp5(int i, int i2, int i3) {
        if (i3 == 0) {
            w26.j("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            w26.j("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.a = i;
        this.b = ore.a(i, i2, i3);
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fp5)) {
            return false;
        }
        if (isEmpty() && ((fp5) obj).isEmpty()) {
            return true;
        }
        fp5 fp5Var = (fp5) obj;
        return this.a == fp5Var.a && this.b == fp5Var.b;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ep5(this.a, this.b, this.c);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
