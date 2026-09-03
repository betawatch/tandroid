package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        org.telegram.ui.Components.gi0 gi0Var = ((org.telegram.ui.Cells.w) this.a).f;
        if (gi0Var != null) {
            gi0Var.a(true, true);
        }
        a0.h hVar = this.c.a;
        TLRPC.StickerSetCovered stickerSetCovered = this.b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.id);
    }
}
