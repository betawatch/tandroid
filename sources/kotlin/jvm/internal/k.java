package kotlin.jvm.internal;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
