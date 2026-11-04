package kotlin.jvm.internal;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l implements d {
    public final Class a;

    public l(Class jClass) {
        j.e(jClass, "jClass");
        this.a = jClass;
    }

    @Override // kotlin.jvm.internal.d
    public final Class a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return j.a(this.a, ((l) obj).a);
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
