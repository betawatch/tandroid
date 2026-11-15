package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class f51 extends org.telegram.ui.Components.u31 {
    public final /* synthetic */ StickersActivity b;

    public f51(StickersActivity stickersActivity) {
        this.b = stickersActivity;
    }

    @Override // org.telegram.ui.Components.u31
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        int i7;
        StickersActivity stickersActivity = this.b;
        i7 = ((org.telegram.ui.ActionBar.e2) stickersActivity).currentAccount;
        org.telegram.messenger.si.b0(i7).f2(stickersActivity.getParentActivity(), stickerSetCovered, 2, stickersActivity, false, false);
    }

    @Override // org.telegram.ui.Components.u31
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        int i7;
        StickersActivity stickersActivity = this.b;
        i7 = ((org.telegram.ui.ActionBar.e2) stickersActivity).currentAccount;
        org.telegram.messenger.si.b0(i7).f2(stickersActivity.getParentActivity(), stickerSetCovered, 0, stickersActivity, false, false);
    }
}
