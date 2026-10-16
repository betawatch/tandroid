package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class n implements org.telegram.ui.Components.sy0 {
    public final /* synthetic */ View a;
    public final /* synthetic */ TLRPC.StickerSetCovered b;
    public final /* synthetic */ p c;

    public n(p pVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.c = pVar;
        this.a = view;
        this.b = stickerSetCovered;
    }

    @Override // org.telegram.ui.Components.sy0
    public final void a() {
        org.telegram.ui.Components.yi0 yi0Var = ((org.telegram.ui.Cells.w) this.a).f;
        if (yi0Var != null) {
            yi0Var.a(true, true);
        }
        a0.h hVar = this.c.a;
        TLRPC.StickerSetCovered stickerSetCovered = this.b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.id);
    }
}
