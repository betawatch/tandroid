package kotlin.jvm.internal;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
