package m1;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
