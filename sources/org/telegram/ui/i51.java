package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class i51 extends org.telegram.ui.Components.p31 {
    public final /* synthetic */ StickersActivity b;

    public i51(StickersActivity stickersActivity) {
        this.b = stickersActivity;
    }

    @Override // org.telegram.ui.Components.p31
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z9) {
        int i7;
        StickersActivity stickersActivity = this.b;
        i7 = ((org.telegram.ui.ActionBar.f2) stickersActivity).currentAccount;
        org.telegram.messenger.ui.b0(i7).f2(stickersActivity.getParentActivity(), stickerSetCovered, 2, stickersActivity, false, false);
    }

    @Override // org.telegram.ui.Components.p31
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        int i7;
        StickersActivity stickersActivity = this.b;
        i7 = ((org.telegram.ui.ActionBar.f2) stickersActivity).currentAccount;
        org.telegram.messenger.ui.b0(i7).f2(stickersActivity.getParentActivity(), stickerSetCovered, 0, stickersActivity, false, false);
    }
}
