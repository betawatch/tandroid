// default package

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class de3 extends b4 implements ScheduledFuture {
    public final ScheduledFuture n;

    public de3(ce3 ce3Var) {
        this.n = ce3Var.a(new z8d((Object) this, (byte) 28));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.n.compareTo(delayed);
    }

    @Override // b4
    public final void d() {
        ScheduledFuture scheduledFuture = this.n;
        Object obj = this.a;
        scheduledFuture.cancel((obj instanceof u3) && ((u3) obj).a);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.n.getDelay(timeUnit);
    }
}
