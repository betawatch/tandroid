package n7;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class f extends e {
    public final c7.x a;

    public f(c7.x xVar) {
        this.a = xVar;
    }

    @Override // n7.e
    public final Object a() {
        return this.a;
    }

    @Override // n7.e
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.a.equals(((f) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        return a1.g.p("Optional.of(", this.a.toString(), ")");
    }
}
