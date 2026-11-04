package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i31 implements vv0 {
    public final /* synthetic */ TLRPC.InputStickerSet a;
    public final /* synthetic */ n31 b;

    public i31(n31 n31Var, TLRPC.InputStickerSet inputStickerSet) {
        this.b = n31Var;
        this.a = inputStickerSet;
    }

    @Override // org.telegram.ui.Components.vv0
    public final void a() {
        n31 n31Var = this.b;
        u4.h0 adapter = n31Var.n.getAdapter();
        m31 m31Var = n31Var.s;
        TLRPC.InputStickerSet inputStickerSet = this.a;
        int i3 = 0;
        if (adapter == m31Var) {
            while (i3 < m31Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) m31Var.e.get(i3);
                if (stickerSetCovered.set.id == inputStickerSet.id) {
                    m31Var.F(stickerSetCovered, null);
                    return;
                }
                i3++;
            }
            return;
        }
        kg.y1 y1Var = n31Var.w;
        ArrayList arrayList = y1Var.F;
        while (i3 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i3);
            if (stickerSetCovered2.set.id == inputStickerSet.id) {
                y1Var.F(stickerSetCovered2, null);
                return;
            }
            i3++;
        }
    }
}
