package m1;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
