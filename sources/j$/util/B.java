package j$.util;

/* loaded from: classes2.dex */
public final class B {
    public static final B c = new B();
    public final boolean a;
    public final long b;

    public B() {
        this.a = false;
        this.b = 0L;
    }

    public B(long j) {
        this.a = true;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b = (B) obj;
        boolean z = this.a;
        return (z && b.a) ? this.b == b.b : z == b.a;
    }

    public final int hashCode() {
        if (!this.a) {
            return 0;
        }
        long j = this.b;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        if (this.a) {
            return "OptionalLong[" + this.b + "]";
        }
        return "OptionalLong.empty";
    }
}
