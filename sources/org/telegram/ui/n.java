package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class n implements org.telegram.ui.Components.ax0 {
    public final /* synthetic */ View a;
    public final /* synthetic */ TLRPC.StickerSetCovered b;
    public final /* synthetic */ p c;

    public n(p pVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.c = pVar;
        this.a = view;
        this.b = stickerSetCovered;
    }

    @Override // org.telegram.ui.Components.ax0
    public final void a() {
        org.telegram.ui.Components.jh0 jh0Var = ((org.telegram.ui.Cells.w) this.a).f;
        if (jh0Var != null) {
            jh0Var.a(true, true);
        }
        a0.h hVar = this.c.a;
        TLRPC.StickerSetCovered stickerSetCovered = this.b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.id);
    }
}
