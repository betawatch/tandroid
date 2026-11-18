package da;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class h1 extends m2 {
    public final String a;

    public h1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m2)) {
            return false;
        }
        return this.a.equals(((h1) ((m2) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a8.p0.s(new StringBuilder("Log{content="), this.a, "}");
    }
}
