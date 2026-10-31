package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a71 extends org.telegram.ui.Components.s41 {
    public final /* synthetic */ StickersActivity b;

    public a71(StickersActivity stickersActivity) {
        this.b = stickersActivity;
    }

    @Override // org.telegram.ui.Components.s41
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        int i10;
        StickersActivity stickersActivity = this.b;
        i10 = ((org.telegram.ui.ActionBar.k2) stickersActivity).currentAccount;
        org.telegram.messenger.ui.b0(i10).f2(stickersActivity.getParentActivity(), stickerSetCovered, 2, stickersActivity, false, false);
    }

    @Override // org.telegram.ui.Components.s41
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        int i10;
        StickersActivity stickersActivity = this.b;
        i10 = ((org.telegram.ui.ActionBar.k2) stickersActivity).currentAccount;
        org.telegram.messenger.ui.b0(i10).f2(stickersActivity.getParentActivity(), stickerSetCovered, 0, stickersActivity, false, false);
    }
}
