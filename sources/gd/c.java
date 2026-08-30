package gd;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class c extends a {
    static {
        new c((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        c cVar;
        char c3;
        char c10;
        if (!(obj instanceof c)) {
            return false;
        }
        char c11 = this.a;
        char c12 = this.b;
        if (c11 >= c12 && c11 != c12 && (c3 = (cVar = (c) obj).a) >= (c10 = cVar.b) && c3 != c10) {
            return true;
        }
        c cVar2 = (c) obj;
        return c11 == cVar2.a && c12 == cVar2.b;
    }

    public final int hashCode() {
        char c3 = this.a;
        char c10 = this.b;
        if (c3 >= c10 && c3 != c10) {
            return -1;
        }
        return (c3 * 31) + c10;
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
