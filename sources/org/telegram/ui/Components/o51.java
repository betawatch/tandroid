package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class o51 implements fy0 {
    public final /* synthetic */ TLRPC.InputStickerSet a;
    public final /* synthetic */ t51 b;

    public o51(t51 t51Var, TLRPC.InputStickerSet inputStickerSet) {
        this.b = t51Var;
        this.a = inputStickerSet;
    }

    @Override // org.telegram.ui.Components.fy0
    public final void a() {
        t51 t51Var = this.b;
        s4.h0 adapter = t51Var.n.getAdapter();
        s51 s51Var = t51Var.s;
        TLRPC.InputStickerSet inputStickerSet = this.a;
        int i10 = 0;
        if (adapter == s51Var) {
            while (i10 < s51Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) s51Var.e.get(i10);
                if (stickerSetCovered.set.id == inputStickerSet.id) {
                    s51Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        gg.g2 g2Var = t51Var.v;
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
