// default package

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class dp3 implements ep3 {
    public final ScheduledFuture a;

    public dp3(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    @Override // ep3
    public final void dispose() {
        this.a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.a + ']';
    }
}
