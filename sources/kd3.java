// default package

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class kd3 extends a4 implements ScheduledFuture {
    public final ScheduledFuture n;

    public kd3(jd3 jd3Var) {
        this.n = jd3Var.a(new l69(this, (byte) 28));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.n.compareTo(delayed);
    }

    @Override // a4
    public final void d() {
        ScheduledFuture scheduledFuture = this.n;
        Object obj = this.a;
        scheduledFuture.cancel((obj instanceof t3) && ((t3) obj).a);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.n.getDelay(timeUnit);
    }
}
