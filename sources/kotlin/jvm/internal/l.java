package kotlin.jvm.internal;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
