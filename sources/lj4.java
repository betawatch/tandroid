// default package

import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
