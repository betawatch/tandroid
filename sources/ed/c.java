package ed;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c extends a {
    static {
        new c((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        c cVar;
        char c3;
        char c6;
        if (!(obj instanceof c)) {
            return false;
        }
        char c10 = this.a;
        char c11 = this.b;
        if (c10 >= c11 && c10 != c11 && (c3 = (cVar = (c) obj).a) >= (c6 = cVar.b) && c3 != c6) {
            return true;
        }
        c cVar2 = (c) obj;
        return c10 == cVar2.a && c11 == cVar2.b;
    }

    public final int hashCode() {
        char c3 = this.a;
        char c6 = this.b;
        if (c3 >= c6 && c3 != c6) {
            return -1;
        }
        return (c3 * 31) + c6;
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
