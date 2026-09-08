package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class y41 implements sx0 {
    public final /* synthetic */ TLRPC.InputStickerSet a;
    public final /* synthetic */ d51 b;

    public y41(d51 d51Var, TLRPC.InputStickerSet inputStickerSet) {
        this.b = d51Var;
        this.a = inputStickerSet;
    }

    @Override // org.telegram.ui.Components.sx0
    public final void a() {
        d51 d51Var = this.b;
        s4.h0 adapter = d51Var.n.getAdapter();
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
        hg.f2 f2Var = d51Var.v;
        ArrayList arrayList = f2Var.E;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.id == inputStickerSet.id) {
                f2Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
