package h2;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        String j3;
        if (i7 == 0) {
            j3 = i5.c.j(i10, "Player stuck buffering and not loading for ", " ms");
        } else if (i7 == 1) {
            j3 = i5.c.j(i10, "Player stuck buffering with no progress for ", " ms");
        } else if (i7 == 2) {
            j3 = i5.c.j(i10, "Player stuck playing with no progress for ", " ms");
        } else if (i7 == 3) {
            j3 = i5.c.j(i10, "Player stuck playing without ending for ", " ms");
        } else {
            if (i7 != 4) {
                throw new IllegalStateException();
            }
            j3 = i5.c.j(i10, "Player stuck suppressed for ", " ms");
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
