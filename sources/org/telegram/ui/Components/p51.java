package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class p51 implements gy0 {
    public final /* synthetic */ TLRPC.InputStickerSet a;
    public final /* synthetic */ u51 b;

    public p51(u51 u51Var, TLRPC.InputStickerSet inputStickerSet) {
        this.b = u51Var;
        this.a = inputStickerSet;
    }

    @Override // org.telegram.ui.Components.gy0
    public final void a() {
        u51 u51Var = this.b;
        s4.h0 adapter = u51Var.n.getAdapter();
        t51 t51Var = u51Var.s;
        TLRPC.InputStickerSet inputStickerSet = this.a;
        int i10 = 0;
        if (adapter == t51Var) {
            while (i10 < t51Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) t51Var.e.get(i10);
                if (stickerSetCovered.set.id == inputStickerSet.id) {
                    t51Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        gg.g2 g2Var = u51Var.v;
        ArrayList arrayList = g2Var.E;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.id == inputStickerSet.id) {
                g2Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
