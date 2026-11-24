package j$.util;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes4.dex */
public final class d0 {
    public static final d0 c = new d0();
    public final boolean a;
    public final long b;

    public d0() {
        this.a = false;
        this.b = 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        boolean z = d0Var.a;
        boolean z2 = this.a;
        return (z2 && z) ? this.b == d0Var.b : z2 == z;
    }

    public final int hashCode() {
        if (!this.a) {
            return 0;
        }
        long j = this.b;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        if (!this.a) {
            return "OptionalLong.empty";
        }
        return "OptionalLong[" + this.b + "]";
    }

    public d0(long j) {
        this.a = true;
        this.b = j;
    }
}
