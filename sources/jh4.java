// default package

import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class jh4 {
    public final CountDownLatch a;
    public zx2 b = null;

    public jh4(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jh4)) {
            return false;
        }
        jh4 jh4Var = (jh4) obj;
        return this.a.equals(jh4Var.a) && rp5.a(this.b, jh4Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        zx2 zx2Var = this.b;
        return hashCode + (zx2Var == null ? 0 : zx2Var.hashCode());
    }

    public final String toString() {
        return "Dependency(latch=" + this.a + ", subscriber=" + this.b + ')';
    }
}
