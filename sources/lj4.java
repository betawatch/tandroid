// default package

import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class lj4 {
    public final CountDownLatch a;
    public ty2 b = null;

    public lj4(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj4)) {
            return false;
        }
        lj4 lj4Var = (lj4) obj;
        return this.a.equals(lj4Var.a) && ur5.a(this.b, lj4Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ty2 ty2Var = this.b;
        return hashCode + (ty2Var == null ? 0 : ty2Var.hashCode());
    }

    public final String toString() {
        return "Dependency(latch=" + this.a + ", subscriber=" + this.b + ')';
    }
}
