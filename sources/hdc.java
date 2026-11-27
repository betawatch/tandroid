// default package

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
