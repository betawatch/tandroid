package n7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class e extends d {
    public final c7.x a;

    public e(c7.x xVar) {
        this.a = xVar;
    }

    @Override // n7.d
    public final Object a() {
        return this.a;
    }

    @Override // n7.d
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.a.equals(((e) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        return a4.a.p("Optional.of(", this.a.toString(), ")");
    }
}
