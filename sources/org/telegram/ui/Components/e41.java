package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class e41 implements hw0 {
    public final /* synthetic */ TLRPC.InputStickerSet a;
    public final /* synthetic */ j41 b;

    public e41(j41 j41Var, TLRPC.InputStickerSet inputStickerSet) {
        this.b = j41Var;
        this.a = inputStickerSet;
    }

    @Override // org.telegram.ui.Components.hw0
    public final void a() {
        j41 j41Var = this.b;
        v4.i0 adapter = j41Var.n.getAdapter();
        i41 i41Var = j41Var.s;
        TLRPC.InputStickerSet inputStickerSet = this.a;
        int i7 = 0;
        if (adapter == i41Var) {
            while (i7 < i41Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) i41Var.e.get(i7);
                if (stickerSetCovered.set.id == inputStickerSet.id) {
                    i41Var.F(stickerSetCovered, null);
                    return;
                }
                i7++;
            }
            return;
        }
        jg.c2 c2Var = j41Var.w;
        ArrayList arrayList = c2Var.F;
        while (i7 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i7);
            if (stickerSetCovered2.set.id == inputStickerSet.id) {
                c2Var.F(stickerSetCovered2, null);
                return;
            }
            i7++;
        }
    }
}
