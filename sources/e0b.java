// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class e0b extends a2c {
    public final /* synthetic */ StickersActivity b;

    public e0b(StickersActivity stickersActivity) {
        this.b = stickersActivity;
    }

    @Override // a2c
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z) {
        int i;
        StickersActivity stickersActivity = this.b;
        i = ((d) stickersActivity).currentAccount;
        hq6.d0(i).h2(stickersActivity.getParentActivity(), stickerSetCovered, 2, this.b, false, false);
    }

    @Override // a2c
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        int i;
        StickersActivity stickersActivity = this.b;
        i = ((d) stickersActivity).currentAccount;
        hq6.d0(i).h2(stickersActivity.getParentActivity(), stickerSetCovered, 0, this.b, false, false);
    }
}
