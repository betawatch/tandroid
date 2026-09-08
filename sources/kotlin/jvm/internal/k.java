package kotlin.jvm.internal;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class k implements c {
    public final Class a;

    public k(Class jClass) {
        i.e(jClass, "jClass");
        this.a = jClass;
    }

    @Override // kotlin.jvm.internal.c
    public final Class a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return i.a(this.a, ((k) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a + " (Kotlin reflection is not available)";
    }
}
