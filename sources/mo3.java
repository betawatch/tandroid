// default package

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class mo3 implements no3 {
    public final ScheduledFuture a;

    public mo3(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    @Override // no3
    public final void dispose() {
        this.a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.a + ']';
    }
}
