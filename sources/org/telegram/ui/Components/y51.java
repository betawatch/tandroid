package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class y51 implements py0 {
    public final /* synthetic */ TLRPC.InputStickerSet a;
    public final /* synthetic */ d61 b;

    public y51(d61 d61Var, TLRPC.InputStickerSet inputStickerSet) {
        this.b = d61Var;
        this.a = inputStickerSet;
    }

    @Override // org.telegram.ui.Components.py0
    public final void a() {
        d61 d61Var = this.b;
        s4.h0 adapter = d61Var.n.getAdapter();
        c61 c61Var = d61Var.s;
        TLRPC.InputStickerSet inputStickerSet = this.a;
        int i10 = 0;
        if (adapter == c61Var) {
            while (i10 < c61Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) c61Var.e.get(i10);
                if (stickerSetCovered.set.id == inputStickerSet.id) {
                    c61Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        gg.g2 g2Var = d61Var.v;
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
