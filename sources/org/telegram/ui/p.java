package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class p implements org.telegram.ui.Components.wx0 {
    public final /* synthetic */ View a;
    public final /* synthetic */ TLRPC.StickerSetCovered b;
    public final /* synthetic */ r c;

    public p(r rVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.c = rVar;
        this.a = view;
        this.b = stickerSetCovered;
    }

    @Override // org.telegram.ui.Components.wx0
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
