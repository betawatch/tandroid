package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class n implements org.telegram.ui.Components.dy0 {
    public final /* synthetic */ View a;
    public final /* synthetic */ TLRPC.StickerSetCovered b;
    public final /* synthetic */ q c;

    public n(q qVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.c = qVar;
        this.a = view;
        this.b = stickerSetCovered;
    }

    @Override // org.telegram.ui.Components.dy0
    public final void a() {
        org.telegram.ui.Components.ii0 ii0Var = ((org.telegram.ui.Cells.w) this.a).f;
        if (ii0Var != null) {
            ii0Var.a(true, true);
        }
        a0.i iVar = this.c.a;
        TLRPC.StickerSetCovered stickerSetCovered = this.b;
        iVar.k(stickerSetCovered, stickerSetCovered.set.id);
    }
}
