// default package

import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class nj4 {
    public final CountDownLatch a;
    public jz2 b = null;

    public nj4(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nj4)) {
            return false;
        }
        nj4 nj4Var = (nj4) obj;
        return this.a.equals(nj4Var.a) && rr5.a(this.b, nj4Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        jz2 jz2Var = this.b;
        return hashCode + (jz2Var == null ? 0 : jz2Var.hashCode());
    }

    public final String toString() {
        return "Dependency(latch=" + this.a + ", subscriber=" + this.b + ')';
    }
}
