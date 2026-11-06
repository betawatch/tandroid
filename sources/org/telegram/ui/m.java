package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class m implements org.telegram.ui.Components.wv0 {
    public final /* synthetic */ View a;
    public final /* synthetic */ TLRPC.StickerSetCovered b;
    public final /* synthetic */ o c;

    public m(o oVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.c = oVar;
        this.a = view;
        this.b = stickerSetCovered;
    }

    @Override // org.telegram.ui.Components.wv0
    public final void a() {
        org.telegram.ui.Components.ag0 ag0Var = ((org.telegram.ui.Cells.v) this.a).f;
        if (ag0Var != null) {
            ag0Var.a(true, true);
        }
        a0.h hVar = this.c.a;
        TLRPC.StickerSetCovered stickerSetCovered = this.b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.id);
    }
}
