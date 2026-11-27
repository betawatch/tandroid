// default package

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class hdc extends ImageReceiver {
    public final /* synthetic */ idc K1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hdc(idc idcVar) {
        super(null);
        this.K1 = idcVar;
    }

    @Override // org.telegram.messenger.ImageReceiver, em
    public final void invalidate() {
        this.K1.invalidate();
    }
}
