// default package

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
