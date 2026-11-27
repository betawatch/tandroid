// default package

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
