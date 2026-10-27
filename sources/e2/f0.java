package e2;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class f0 extends IllegalStateException {
    public final int a;
    public final int b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f0(int i10, int i11) {
        super(r0);
        String j10;
        if (i10 == 0) {
            j10 = ic.a.j(i11, "Player stuck buffering and not loading for ", " ms");
        } else if (i10 == 1) {
            j10 = ic.a.j(i11, "Player stuck buffering with no progress for ", " ms");
        } else if (i10 == 2) {
            j10 = ic.a.j(i11, "Player stuck playing with no progress for ", " ms");
        } else if (i10 == 3) {
            j10 = ic.a.j(i11, "Player stuck playing without ending for ", " ms");
        } else {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
            j10 = ic.a.j(i11, "Player stuck suppressed for ", " ms");
        }
        this.a = i10;
        this.b = i11;
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
