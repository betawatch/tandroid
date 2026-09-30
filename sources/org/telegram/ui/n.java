package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class n implements org.telegram.ui.Components.fy0 {
    public final /* synthetic */ View a;
    public final /* synthetic */ TLRPC.StickerSetCovered b;
    public final /* synthetic */ q c;

    public n(q qVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.c = qVar;
        this.a = view;
        this.b = stickerSetCovered;
    }

    @Override // org.telegram.ui.Components.fy0
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
