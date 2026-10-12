package be;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
