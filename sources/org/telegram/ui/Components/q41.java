package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q41 implements ax0 {
    public final /* synthetic */ TLRPC.InputStickerSet a;
    public final /* synthetic */ w41 b;

    public q41(w41 w41Var, TLRPC.InputStickerSet inputStickerSet) {
        this.b = w41Var;
        this.a = inputStickerSet;
    }

    @Override // org.telegram.ui.Components.ax0
    public final void a() {
        w41 w41Var = this.b;
        s4.g0 adapter = w41Var.n.getAdapter();
        v41 v41Var = w41Var.s;
        TLRPC.InputStickerSet inputStickerSet = this.a;
        int i10 = 0;
        if (adapter == v41Var) {
            while (i10 < v41Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) v41Var.e.get(i10);
                if (stickerSetCovered.set.id == inputStickerSet.id) {
                    v41Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        zf.o1 o1Var = w41Var.w;
        ArrayList arrayList = o1Var.E;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.id == inputStickerSet.id) {
                o1Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
