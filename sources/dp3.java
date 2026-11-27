// default package

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
