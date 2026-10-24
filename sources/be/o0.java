package be;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
