package n7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
        return a1.g.n("Optional.of(", this.a.toString(), ")");
    }
}
