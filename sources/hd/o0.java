package hd;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class o0 implements p0 {
    public final ScheduledFuture a;

    public o0(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    @Override // hd.p0
    public final void dispose() {
        this.a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.a + ']';
    }
}
