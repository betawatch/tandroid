package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class z41 implements tx0 {
    public final /* synthetic */ TLRPC.InputStickerSet a;
    public final /* synthetic */ e51 b;

    public z41(e51 e51Var, TLRPC.InputStickerSet inputStickerSet) {
        this.b = e51Var;
        this.a = inputStickerSet;
    }

    @Override // org.telegram.ui.Components.tx0
    public final void a() {
        e51 e51Var = this.b;
        s4.h0 adapter = e51Var.n.getAdapter();
        d51 d51Var = e51Var.s;
        TLRPC.InputStickerSet inputStickerSet = this.a;
        int i10 = 0;
        if (adapter == d51Var) {
            while (i10 < d51Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) d51Var.e.get(i10);
                if (stickerSetCovered.set.id == inputStickerSet.id) {
                    d51Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        gg.g2 g2Var = e51Var.v;
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
