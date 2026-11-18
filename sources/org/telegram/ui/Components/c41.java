package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class c41 implements gw0 {
    public final /* synthetic */ TLRPC.InputStickerSet a;
    public final /* synthetic */ h41 b;

    public c41(h41 h41Var, TLRPC.InputStickerSet inputStickerSet) {
        this.b = h41Var;
        this.a = inputStickerSet;
    }

    @Override // org.telegram.ui.Components.gw0
    public final void a() {
        h41 h41Var = this.b;
        v4.i0 adapter = h41Var.n.getAdapter();
        g41 g41Var = h41Var.s;
        TLRPC.InputStickerSet inputStickerSet = this.a;
        int i7 = 0;
        if (adapter == g41Var) {
            while (i7 < g41Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) g41Var.e.get(i7);
                if (stickerSetCovered.set.id == inputStickerSet.id) {
                    g41Var.F(stickerSetCovered, null);
                    return;
                }
                i7++;
            }
            return;
        }
        jg.c2 c2Var = h41Var.w;
        ArrayList arrayList = c2Var.F;
        while (i7 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i7);
            if (stickerSetCovered2.set.id == inputStickerSet.id) {
                c2Var.F(stickerSetCovered2, null);
                return;
            }
            i7++;
        }
    }
}
