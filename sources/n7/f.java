package n7;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
