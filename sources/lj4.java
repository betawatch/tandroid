// default package

import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
