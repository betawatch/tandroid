package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class l61 implements bz0 {
    public final /* synthetic */ TLRPC.InputStickerSet a;
    public final /* synthetic */ q61 b;

    public l61(q61 q61Var, TLRPC.InputStickerSet inputStickerSet) {
        this.b = q61Var;
        this.a = inputStickerSet;
    }

    @Override // org.telegram.ui.Components.bz0
    public final void a() {
        q61 q61Var = this.b;
        s4.h0 adapter = q61Var.n.getAdapter();
        p61 p61Var = q61Var.s;
        TLRPC.InputStickerSet inputStickerSet = this.a;
        int i10 = 0;
        if (adapter == p61Var) {
            while (i10 < p61Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) p61Var.e.get(i10);
                if (stickerSetCovered.set.id == inputStickerSet.id) {
                    p61Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        ig.d2 d2Var = q61Var.v;
        ArrayList arrayList = d2Var.E;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.id == inputStickerSet.id) {
                d2Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
