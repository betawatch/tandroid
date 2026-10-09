package ae;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class p0 implements q0 {
    public final ScheduledFuture a;

    public p0(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    @Override // ae.q0
    public final void dispose() {
        this.a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.a + ']';
    }
}
