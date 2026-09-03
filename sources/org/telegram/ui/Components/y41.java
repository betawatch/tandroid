package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class y41 implements vx0 {
    public final /* synthetic */ TLRPC.InputStickerSet a;
    public final /* synthetic */ d51 b;

    public y41(d51 d51Var, TLRPC.InputStickerSet inputStickerSet) {
        this.b = d51Var;
        this.a = inputStickerSet;
    }

    @Override // org.telegram.ui.Components.vx0
    public final void a() {
        d51 d51Var = this.b;
        f2.p0 adapter = d51Var.n.getAdapter();
        c51 c51Var = d51Var.s;
        TLRPC.InputStickerSet inputStickerSet = this.a;
        int i10 = 0;
        if (adapter == c51Var) {
            while (i10 < c51Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) c51Var.e.get(i10);
                if (stickerSetCovered.set.id == inputStickerSet.id) {
                    c51Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        uf.m1 m1Var = d51Var.v;
        ArrayList arrayList = m1Var.B;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.id == inputStickerSet.id) {
                m1Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
