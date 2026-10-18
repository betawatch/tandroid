package kotlin.jvm.internal;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
