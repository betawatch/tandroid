package j$.util;

/* loaded from: classes2.dex */
public final class d0 {
    public static final d0 c = new d0();
    public final boolean a;
    public final long b;

    public d0() {
        this.a = false;
        this.b = 0L;
    }

    public d0(long j3) {
        this.a = true;
        this.b = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        boolean z10 = d0Var.a;
        boolean z11 = this.a;
        return (z11 && z10) ? this.b == d0Var.b : z11 == z10;
    }

    public final int hashCode() {
        if (!this.a) {
            return 0;
        }
        long j3 = this.b;
        return (int) (j3 ^ (j3 >>> 32));
    }

    public final String toString() {
        if (this.a) {
            return "OptionalLong[" + this.b + "]";
        }
        return "OptionalLong.empty";
    }
}
