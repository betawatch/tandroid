// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class f2b extends a4c {
    public final /* synthetic */ StickersActivity b;

    public f2b(StickersActivity stickersActivity) {
        this.b = stickersActivity;
    }

    @Override // a4c
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z) {
        int i;
        StickersActivity stickersActivity = this.b;
        i = ((d) stickersActivity).currentAccount;
        hs6.d0(i).h2(stickersActivity.getParentActivity(), stickerSetCovered, 2, this.b, false, false);
    }

    @Override // a4c
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        int i;
        StickersActivity stickersActivity = this.b;
        i = ((d) stickersActivity).currentAccount;
        hs6.d0(i).h2(stickersActivity.getParentActivity(), stickerSetCovered, 0, this.b, false, false);
    }
}
