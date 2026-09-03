package ld;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class n0 implements o0 {
    public final ScheduledFuture a;

    public n0(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    @Override // ld.o0
    public final void dispose() {
        this.a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.a + ']';
    }
}
