package n7;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
