package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class n implements org.telegram.ui.Components.sx0 {
    public final /* synthetic */ View a;
    public final /* synthetic */ TLRPC.StickerSetCovered b;
    public final /* synthetic */ p c;

    public n(p pVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.c = pVar;
        this.a = view;
        this.b = stickerSetCovered;
    }

    @Override // org.telegram.ui.Components.sx0
    public final void a() {
        org.telegram.ui.Components.xh0 xh0Var = ((org.telegram.ui.Cells.w) this.a).f;
        if (xh0Var != null) {
            xh0Var.a(true, true);
        }
        a0.i iVar = this.c.a;
        TLRPC.StickerSetCovered stickerSetCovered = this.b;
        iVar.k(stickerSetCovered, stickerSetCovered.set.id);
    }
}
