package be;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class o0 implements p0 {
    public final ScheduledFuture a;

    public o0(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    @Override // be.p0
    public final void dispose() {
        this.a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.a + ']';
    }
}
