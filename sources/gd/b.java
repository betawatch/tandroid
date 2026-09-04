package gd;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class b implements Comparable {
    public static final b b = new b();
    public final int a = 131348;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b other = (b) obj;
        kotlin.jvm.internal.i.e(other, "other");
        return this.a - other.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        b bVar = obj instanceof b ? (b) obj : null;
        return bVar != null && this.a == bVar.a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "2.1.20";
    }
}
