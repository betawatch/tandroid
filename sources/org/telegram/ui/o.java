package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class o implements org.telegram.ui.Components.cx0 {
    public final /* synthetic */ View a;
    public final /* synthetic */ TLRPC.StickerSetCovered b;
    public final /* synthetic */ q c;

    public o(q qVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.c = qVar;
        this.a = view;
        this.b = stickerSetCovered;
    }

    @Override // org.telegram.ui.Components.cx0
    public final void a() {
        org.telegram.ui.Components.lh0 lh0Var = ((org.telegram.ui.Cells.w) this.a).f;
        if (lh0Var != null) {
            lh0Var.a(true, true);
        }
        a0.h hVar = this.c.a;
        TLRPC.StickerSetCovered stickerSetCovered = this.b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.id);
    }
}
