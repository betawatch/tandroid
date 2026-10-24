package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class m implements org.telegram.ui.Components.ry0 {
    public final /* synthetic */ View a;
    public final /* synthetic */ TLRPC.StickerSetCovered b;
    public final /* synthetic */ o c;

    public m(o oVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.c = oVar;
        this.a = view;
        this.b = stickerSetCovered;
    }

    @Override // org.telegram.ui.Components.ry0
    public final void a() {
        org.telegram.ui.Components.xi0 xi0Var = ((org.telegram.ui.Cells.v) this.a).f;
        if (xi0Var != null) {
            xi0Var.a(true, true);
        }
        a0.h hVar = this.c.a;
        TLRPC.StickerSetCovered stickerSetCovered = this.b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.id);
    }
}
