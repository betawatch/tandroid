package g2;

import k2.p1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g0 extends IllegalStateException {
    public final int a;
    public final int b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g0(int i3, int i10) {
        super(r0);
        String j10;
        if (i3 == 0) {
            j10 = p1.j(i10, "Player stuck buffering and not loading for ", " ms");
        } else if (i3 == 1) {
            j10 = p1.j(i10, "Player stuck buffering with no progress for ", " ms");
        } else if (i3 == 2) {
            j10 = p1.j(i10, "Player stuck playing with no progress for ", " ms");
        } else if (i3 == 3) {
            j10 = p1.j(i10, "Player stuck playing without ending for ", " ms");
        } else {
            if (i3 != 4) {
                throw new IllegalStateException();
            }
            j10 = p1.j(i10, "Player stuck suppressed for ", " ms");
        }
        this.a = i3;
        this.b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g0.class != obj.getClass()) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.a == g0Var.a && this.b == g0Var.b;
    }

    public final int hashCode() {
        return ((527 + this.a) * 31) + this.b;
    }
}
