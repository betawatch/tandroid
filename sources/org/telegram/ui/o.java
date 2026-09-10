package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class o implements org.telegram.ui.Components.fy0 {
    public final /* synthetic */ View a;
    public final /* synthetic */ TLRPC.StickerSetCovered b;
    public final /* synthetic */ q c;

    public o(q qVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.c = qVar;
        this.a = view;
        this.b = stickerSetCovered;
    }

    @Override // org.telegram.ui.Components.fy0
    public final void a() {
        org.telegram.ui.Components.hi0 hi0Var = ((org.telegram.ui.Cells.w) this.a).f;
        if (hi0Var != null) {
            hi0Var.a(true, true);
        }
        a0.i iVar = this.c.a;
        TLRPC.StickerSetCovered stickerSetCovered = this.b;
        iVar.k(stickerSetCovered, stickerSetCovered.set.id);
    }
}
