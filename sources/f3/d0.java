package f3;

import a8.p0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class d0 {
    public static final d0 c = new d0(0, 0);
    public final long a;
    public final long b;

    public d0(long j3, long j10) {
        this.a = j3;
        this.b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d0.class == obj.getClass()) {
            d0 d0Var = (d0) obj;
            if (this.a == d0Var.a && this.b == d0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.a);
        sb2.append(", position=");
        return p0.r(sb2, this.b, "]");
    }
}
