package o7;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class e extends d {
    public final d7.x a;

    public e(d7.x xVar) {
        this.a = xVar;
    }

    @Override // o7.d
    public final Object a() {
        return this.a;
    }

    @Override // o7.d
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
        return a1.g.p("Optional.of(", this.a.toString(), ")");
    }
}
