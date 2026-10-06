package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class n implements org.telegram.ui.Components.py0 {
    public final /* synthetic */ View a;
    public final /* synthetic */ TLRPC.StickerSetCovered b;
    public final /* synthetic */ q c;

    public n(q qVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.c = qVar;
        this.a = view;
        this.b = stickerSetCovered;
    }

    @Override // org.telegram.ui.Components.py0
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
