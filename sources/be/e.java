package be;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class e extends f {
    public final Throwable a;

    public e(Throwable th2) {
        this.a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return kotlin.jvm.internal.i.a(this.a, ((e) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th2 = this.a;
        if (th2 != null) {
            return th2.hashCode();
        }
        return 0;
    }

    @Override // be.f
    public final String toString() {
        return "Closed(" + this.a + ')';
    }
}
