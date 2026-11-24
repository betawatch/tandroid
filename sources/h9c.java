// default package

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
