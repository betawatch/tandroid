package n7;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
        return a4.a.q("Optional.of(", this.a.toString(), ")");
    }
}
