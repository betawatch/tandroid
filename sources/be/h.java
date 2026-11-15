package be;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
