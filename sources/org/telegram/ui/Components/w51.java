package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class w51 implements my0 {
    public final /* synthetic */ TLRPC.InputStickerSet a;
    public final /* synthetic */ b61 b;

    public w51(b61 b61Var, TLRPC.InputStickerSet inputStickerSet) {
        this.b = b61Var;
        this.a = inputStickerSet;
    }

    @Override // org.telegram.ui.Components.my0
    public final void a() {
        b61 b61Var = this.b;
        s4.g0 adapter = b61Var.n.getAdapter();
        a61 a61Var = b61Var.s;
        TLRPC.InputStickerSet inputStickerSet = this.a;
        int i10 = 0;
        if (adapter == a61Var) {
            while (i10 < a61Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) a61Var.e.get(i10);
                if (stickerSetCovered.set.id == inputStickerSet.id) {
                    a61Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        hg.e2 e2Var = b61Var.v;
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
