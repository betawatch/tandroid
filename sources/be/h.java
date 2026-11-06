package be;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class h extends i {
    public final Throwable a;

    public h(Throwable th2) {
        this.a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return kotlin.jvm.internal.j.a(this.a, ((h) obj).a);
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

    @Override // be.i
    public final String toString() {
        return "Closed(" + this.a + ')';
    }
}
