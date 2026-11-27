// default package

import java.util.Iterator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ir5 implements Iterable {
    public static final ir5 d = new ir5(1, 0, 1);
    public final int a;
    public final int b;
    public final int c;

    public ir5(int i, int i2, int i3) {
        if (i3 == 0) {
            lq5.j("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            lq5.j("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.a = i;
        this.b = gwe.a(i, i2, i3);
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ir5)) {
            return false;
        }
        if (isEmpty() && ((ir5) obj).isEmpty()) {
            return true;
        }
        ir5 ir5Var = (ir5) obj;
        return this.a == ir5Var.a && this.b == ir5Var.b;
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
        return new hr5(this.a, this.b, this.c);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
