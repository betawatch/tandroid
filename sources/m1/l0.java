package m1;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
