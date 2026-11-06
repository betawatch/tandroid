package hb;

import aa.j;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class a {
    public final CountDownLatch a;
    public j b = null;

    public a(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.j.a(this.a, aVar.a) && kotlin.jvm.internal.j.a(this.b, aVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        j jVar = this.b;
        return hashCode + (jVar == null ? 0 : jVar.hashCode());
    }

    public final String toString() {
        return "Dependency(latch=" + this.a + ", subscriber=" + this.b + ')';
    }
}
