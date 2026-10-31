package i2;

import j$.util.Objects;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class w0 {
    public final long a;
    public final float b;
    public final long c;

    public w0(v0 v0Var) {
        this.a = v0Var.a;
        this.b = v0Var.b;
        this.c = v0Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.a == w0Var.a && this.b == w0Var.b && this.c == w0Var.c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c));
    }
}
