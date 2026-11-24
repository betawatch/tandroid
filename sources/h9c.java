// default package

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class h9c extends ImageReceiver {
    public final /* synthetic */ i9c K1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9c(i9c i9cVar) {
        super(null);
        this.K1 = i9cVar;
    }

    @Override // org.telegram.messenger.ImageReceiver, dm
    public final void invalidate() {
        this.K1.invalidate();
    }
}
