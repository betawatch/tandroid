package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class k61 implements az0 {
    public final /* synthetic */ TLRPC.InputStickerSet a;
    public final /* synthetic */ p61 b;

    public k61(p61 p61Var, TLRPC.InputStickerSet inputStickerSet) {
        this.b = p61Var;
        this.a = inputStickerSet;
    }

    @Override // org.telegram.ui.Components.az0
    public final void a() {
        p61 p61Var = this.b;
        s4.h0 adapter = p61Var.n.getAdapter();
        o61 o61Var = p61Var.s;
        TLRPC.InputStickerSet inputStickerSet = this.a;
        int i10 = 0;
        if (adapter == o61Var) {
            while (i10 < o61Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) o61Var.e.get(i10);
                if (stickerSetCovered.set.id == inputStickerSet.id) {
                    o61Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        ig.d2 d2Var = p61Var.v;
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
