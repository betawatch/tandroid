// default package

import java.util.Iterator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class hk1 implements Iterable {
    public final char a;
    public final char b;

    static {
        new hk1((char) 1, (char) 0);
    }

    public hk1(char c, char c2) {
        this.a = c;
        this.b = (char) gwe.a(c, c2, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hk1)) {
            return false;
        }
        char c = this.a;
        char c2 = this.b;
        if (ur5.b(c, c2) > 0) {
            hk1 hk1Var = (hk1) obj;
            if (ur5.b(hk1Var.a, hk1Var.b) > 0) {
                return true;
            }
        }
        hk1 hk1Var2 = (hk1) obj;
        return c == hk1Var2.a && c2 == hk1Var2.b;
    }

    public final int hashCode() {
        char c = this.a;
        char c2 = this.b;
        if (ur5.b(c, c2) > 0) {
            return -1;
        }
        return (c * 31) + c2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new gk1(this.a, this.b);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
