// default package

import java.util.Iterator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class fr5 implements Iterable {
    public static final fr5 d = new fr5(1, 0, 1);
    public final int a;
    public final int b;
    public final int c;

    public fr5(int i, int i2, int i3) {
        if (i3 == 0) {
            u36.j("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            u36.j("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.a = i;
        this.b = rte.a(i, i2, i3);
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fr5)) {
            return false;
        }
        if (isEmpty() && ((fr5) obj).isEmpty()) {
            return true;
        }
        fr5 fr5Var = (fr5) obj;
        return this.a == fr5Var.a && this.b == fr5Var.b;
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
        return new er5(this.a, this.b, this.c);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
