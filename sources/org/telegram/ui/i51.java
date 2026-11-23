package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class i51 extends org.telegram.ui.Components.h41 {
    public final /* synthetic */ StickersActivity b;

    public i51(StickersActivity stickersActivity) {
        this.b = stickersActivity;
    }

    @Override // org.telegram.ui.Components.h41
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        int i7;
        StickersActivity stickersActivity = this.b;
        i7 = ((org.telegram.ui.ActionBar.g2) stickersActivity).currentAccount;
        org.telegram.messenger.si.d0(i7).k2(stickersActivity.getParentActivity(), stickerSetCovered, 2, stickersActivity, false, false);
    }

    @Override // org.telegram.ui.Components.h41
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        int i7;
        StickersActivity stickersActivity = this.b;
        i7 = ((org.telegram.ui.ActionBar.g2) stickersActivity).currentAccount;
        org.telegram.messenger.si.d0(i7).k2(stickersActivity.getParentActivity(), stickerSetCovered, 0, stickersActivity, false, false);
    }
}
