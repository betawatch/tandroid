// default package

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
