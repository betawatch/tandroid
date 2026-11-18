package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class i51 extends org.telegram.ui.Components.e41 {
    public final /* synthetic */ StickersActivity b;

    public i51(StickersActivity stickersActivity) {
        this.b = stickersActivity;
    }

    @Override // org.telegram.ui.Components.e41
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        int i7;
        StickersActivity stickersActivity = this.b;
        i7 = ((org.telegram.ui.ActionBar.h2) stickersActivity).currentAccount;
        org.telegram.messenger.ri.d0(i7).k2(stickersActivity.getParentActivity(), stickerSetCovered, 2, stickersActivity, false, false);
    }

    @Override // org.telegram.ui.Components.e41
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        int i7;
        StickersActivity stickersActivity = this.b;
        i7 = ((org.telegram.ui.ActionBar.h2) stickersActivity).currentAccount;
        org.telegram.messenger.ri.d0(i7).k2(stickersActivity.getParentActivity(), stickerSetCovered, 0, stickersActivity, false, false);
    }
}
