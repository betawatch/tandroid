package b7;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class g extends f {
    public final q6.x a;

    public g(q6.x xVar) {
        this.a = xVar;
    }

    @Override // b7.f
    public final Object a() {
        return this.a;
    }

    @Override // b7.f
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.a.equals(((g) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        return android.support.v4.media.a.o("Optional.of(", this.a.toString(), ")");
    }
}
