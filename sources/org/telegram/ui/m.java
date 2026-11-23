package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class m implements org.telegram.ui.Components.iw0 {
    public final /* synthetic */ View a;
    public final /* synthetic */ TLRPC.StickerSetCovered b;
    public final /* synthetic */ o c;

    public m(o oVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.c = oVar;
        this.a = view;
        this.b = stickerSetCovered;
    }

    @Override // org.telegram.ui.Components.iw0
    public final void a() {
        org.telegram.ui.Components.pg0 pg0Var = ((org.telegram.ui.Cells.v) this.a).f;
        if (pg0Var != null) {
            pg0Var.a(true, true);
        }
        a0.h hVar = this.c.a;
        TLRPC.StickerSetCovered stickerSetCovered = this.b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.id);
    }
}
