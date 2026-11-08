package m1;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
