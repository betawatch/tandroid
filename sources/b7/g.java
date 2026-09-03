package b7;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
