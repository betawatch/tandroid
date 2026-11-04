package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m implements org.telegram.ui.Components.vv0 {
    public final /* synthetic */ View a;
    public final /* synthetic */ TLRPC.StickerSetCovered b;
    public final /* synthetic */ o c;

    public m(o oVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.c = oVar;
        this.a = view;
        this.b = stickerSetCovered;
    }

    @Override // org.telegram.ui.Components.vv0
    public final void a() {
        org.telegram.ui.Components.dg0 dg0Var = ((org.telegram.ui.Cells.v) this.a).f;
        if (dg0Var != null) {
            dg0Var.a(true, true);
        }
        a0.h hVar = this.c.a;
        TLRPC.StickerSetCovered stickerSetCovered = this.b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.id);
    }
}
