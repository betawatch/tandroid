// default package

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
