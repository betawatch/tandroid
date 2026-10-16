package be;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
