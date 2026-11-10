package be;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
