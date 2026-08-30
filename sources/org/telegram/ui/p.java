package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class p implements org.telegram.ui.Components.vx0 {
    public final /* synthetic */ View a;
    public final /* synthetic */ TLRPC.StickerSetCovered b;
    public final /* synthetic */ r c;

    public p(r rVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.c = rVar;
        this.a = view;
        this.b = stickerSetCovered;
    }

    @Override // org.telegram.ui.Components.vx0
    public final void a() {
        org.telegram.ui.Components.ei0 ei0Var = ((org.telegram.ui.Cells.w) this.a).f;
        if (ei0Var != null) {
            ei0Var.a(true, true);
        }
        a0.h hVar = this.c.a;
        TLRPC.StickerSetCovered stickerSetCovered = this.b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.id);
    }
}
