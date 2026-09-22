package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class n implements org.telegram.ui.Components.gy0 {
    public final /* synthetic */ View a;
    public final /* synthetic */ TLRPC.StickerSetCovered b;
    public final /* synthetic */ p c;

    public n(p pVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.c = pVar;
        this.a = view;
        this.b = stickerSetCovered;
    }

    @Override // org.telegram.ui.Components.gy0
    public final void a() {
        org.telegram.ui.Components.ki0 ki0Var = ((org.telegram.ui.Cells.w) this.a).f;
        if (ki0Var != null) {
            ki0Var.a(true, true);
        }
        a0.i iVar = this.c.a;
        TLRPC.StickerSetCovered stickerSetCovered = this.b;
        iVar.k(stickerSetCovered, stickerSetCovered.set.id);
    }
}
