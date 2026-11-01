package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class r41 implements bx0 {
    public final /* synthetic */ TLRPC.InputStickerSet a;
    public final /* synthetic */ x41 b;

    public r41(x41 x41Var, TLRPC.InputStickerSet inputStickerSet) {
        this.b = x41Var;
        this.a = inputStickerSet;
    }

    @Override // org.telegram.ui.Components.bx0
    public final void a() {
        x41 x41Var = this.b;
        s4.g0 adapter = x41Var.n.getAdapter();
        w41 w41Var = x41Var.s;
        TLRPC.InputStickerSet inputStickerSet = this.a;
        int i10 = 0;
        if (adapter == w41Var) {
            while (i10 < w41Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) w41Var.e.get(i10);
                if (stickerSetCovered.set.id == inputStickerSet.id) {
                    w41Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        zf.o1 o1Var = x41Var.w;
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
