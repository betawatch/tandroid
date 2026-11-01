package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class l implements org.telegram.ui.Components.bx0 {
    public final /* synthetic */ View a;
    public final /* synthetic */ TLRPC.StickerSetCovered b;
    public final /* synthetic */ n c;

    public l(n nVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.c = nVar;
        this.a = view;
        this.b = stickerSetCovered;
    }

    @Override // org.telegram.ui.Components.bx0
    public final void a() {
        org.telegram.ui.Components.dh0 dh0Var = ((org.telegram.ui.Cells.v) this.a).f;
        if (dh0Var != null) {
            dh0Var.a(true, true);
        }
        a0.h hVar = this.c.a;
        TLRPC.StickerSetCovered stickerSetCovered = this.b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.id);
    }
}
