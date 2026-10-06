package n7;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
        return a4.a.q("Optional.of(", this.a.toString(), ")");
    }
}
