package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class n implements org.telegram.ui.Components.my0 {
    public final /* synthetic */ View a;
    public final /* synthetic */ TLRPC.StickerSetCovered b;
    public final /* synthetic */ p c;

    public n(p pVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.c = pVar;
        this.a = view;
        this.b = stickerSetCovered;
    }

    @Override // org.telegram.ui.Components.my0
    public final void a() {
        org.telegram.ui.Components.ti0 ti0Var = ((org.telegram.ui.Cells.w) this.a).f;
        if (ti0Var != null) {
            ti0Var.a(true, true);
        }
        a0.h hVar = this.c.a;
        TLRPC.StickerSetCovered stickerSetCovered = this.b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.id);
    }
}
