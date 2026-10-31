package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l implements org.telegram.ui.Components.ax0 {
    public final /* synthetic */ View a;
    public final /* synthetic */ TLRPC.StickerSetCovered b;
    public final /* synthetic */ n c;

    public l(n nVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.c = nVar;
        this.a = view;
        this.b = stickerSetCovered;
    }

    @Override // org.telegram.ui.Components.ax0
    public final void a() {
        org.telegram.ui.Components.ch0 ch0Var = ((org.telegram.ui.Cells.v) this.a).f;
        if (ch0Var != null) {
            ch0Var.a(true, true);
        }
        a0.h hVar = this.c.a;
        TLRPC.StickerSetCovered stickerSetCovered = this.b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.id);
    }
}
