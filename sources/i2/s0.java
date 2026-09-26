package i2;

import j$.util.Objects;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class s0 {
    public final long a;
    public final float b;
    public final long c;

    public s0(r0 r0Var) {
        this.a = r0Var.a;
        this.b = r0Var.b;
        this.c = r0Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return this.a == s0Var.a && this.b == s0Var.b && this.c == s0Var.c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c));
    }
}
