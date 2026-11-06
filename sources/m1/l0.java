package m1;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class l0 extends e1 {
    public final Throwable b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(Throwable finalException) {
        super(ConnectionsManager.DEFAULT_DATACENTER_ID);
        kotlin.jvm.internal.j.e(finalException, "finalException");
        this.b = finalException;
    }
}
