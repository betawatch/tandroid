package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class x51 implements ny0 {
    public final /* synthetic */ TLRPC.InputStickerSet a;
    public final /* synthetic */ c61 b;

    public x51(c61 c61Var, TLRPC.InputStickerSet inputStickerSet) {
        this.b = c61Var;
        this.a = inputStickerSet;
    }

    @Override // org.telegram.ui.Components.ny0
    public final void a() {
        c61 c61Var = this.b;
        s4.g0 adapter = c61Var.n.getAdapter();
        b61 b61Var = c61Var.s;
        TLRPC.InputStickerSet inputStickerSet = this.a;
        int i10 = 0;
        if (adapter == b61Var) {
            while (i10 < b61Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) b61Var.e.get(i10);
                if (stickerSetCovered.set.id == inputStickerSet.id) {
                    b61Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        hg.e2 e2Var = c61Var.v;
        ArrayList arrayList = e2Var.E;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.id == inputStickerSet.id) {
                e2Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
