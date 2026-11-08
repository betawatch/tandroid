package h2;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class f0 extends IllegalStateException {
    public final int a;
    public final int b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f0(int i7, int i10) {
        super(r0);
        String k10;
        if (i7 == 0) {
            k10 = jg.g.k(i10, "Player stuck buffering and not loading for ", " ms");
        } else if (i7 == 1) {
            k10 = jg.g.k(i10, "Player stuck buffering with no progress for ", " ms");
        } else if (i7 == 2) {
            k10 = jg.g.k(i10, "Player stuck playing with no progress for ", " ms");
        } else if (i7 == 3) {
            k10 = jg.g.k(i10, "Player stuck playing without ending for ", " ms");
        } else {
            if (i7 != 4) {
                throw new IllegalStateException();
            }
            k10 = jg.g.k(i10, "Player stuck suppressed for ", " ms");
        }
        this.a = i7;
        this.b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f0.class != obj.getClass()) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.a == f0Var.a && this.b == f0Var.b;
    }

    public final int hashCode() {
        return ((527 + this.a) * 31) + this.b;
    }
}
